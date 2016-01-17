/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.nots.sandbox.copyfile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

/**
 *
 * @author Mitsuru Notsu
 */
public class FileUseHistory {
    
    /**
     * 1.メモリ上に全部バッファリングする。
     * @param inFileName
     * @param outFileName
     * @throws IOException 
     */
    public static void fileCopy1(String inFileName, String outFileName) throws IOException {
        String content = FileUseHistory.fileRead(inFileName);
        FileUseHistory.fileWrite(inFileName, content);
    }
    
    public static String fileRead(String fileName) throws IOException {
        try (FileInputStream in = new FileInputStream(fileName)) {
            StringBuilder buf = new StringBuilder();
            int count;
            byte[] b = new byte[512];
            while ((count = in.read(b)) > 0) {
                buf.append(new String(b, 0, count));
            }
            return buf.toString();
        }
    }
    
    public static void fileWrite(String fileName, String data) throws IOException {
        try (FileOutputStream out = new FileOutputStream(fileName)) {
            out.write(data.getBytes());
        }
    }
    
    /**
     * 2.FileInputStreamで中身を読み、FileOutputStreamで書き出す。
     * @param inFileName
     * @param outFileName
     * @throws IOException 
     */
    public static void filecopy2(String inFileName, String outFileName) throws IOException {
        try (FileInputStream in = new FileInputStream(inFileName);
                FileOutputStream out = new FileOutputStream(outFileName)) {

            final byte[] buf = new byte[512];
            int n = 0;
            while (-1 != (n = in.read(buf))) {
                out.write(buf, 0, n);
            }
        }
    }
    
    /**
     * 3.FileChannel(NIO)使う。
     * @param inFileName
     * @param outFileName
     * @throws IOException 
     */
    public static void filecopy3(String inFileName, String outFileName) throws IOException {
        try (FileChannel in = new FileInputStream(new File(inFileName)).getChannel();
                FileChannel out = new FileOutputStream(new File(outFileName)).getChannel()) {
            out.transferFrom(in, 0, in.size());
        }
    }
    
    /**
     * 4.NIO2を使う。
     * @param inFileName
     * @param outFileName
     * @throws IOException 
     */
    public static void filecopy4(String inFileName, String outFileName) throws IOException {
        Files.copy(FileSystems.getDefault().getPath(inFileName)
                , FileSystems.getDefault().getPath(outFileName)
                , StandardCopyOption.REPLACE_EXISTING);
    }
    
}
