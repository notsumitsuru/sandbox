/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.nots.sandbox.copyfile;

import java.io.File;
import java.io.IOException;
import junit.framework.Assert;
import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mitsuru Notsu
 */
public class FileUseHistoryTest {
    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void copyFile1Test() throws Exception {
        FileUseHistory.fileCopy1(
                "/Users/Mitsuru Notsu/NetBeansProjects/sandbox/sandbox/src/test/resources/org/nots/sandbox/copyfile/input.txt"
                , "/Users/Mitsuru Notsu/NetBeansProjects/sandbox/sandbox/src/test/resources/org/nots/sandbox/copyfile/output.txt");
        assertTrue(FileUtils.contentEquals(new File("input.txt"), new File("output.txt")));
    }
    
    @Test
    public void copyFile2Test() throws Exception {
        FileUseHistory.filecopy2(
                "/Users/Mitsuru Notsu/NetBeansProjects/sandbox/sandbox/src/test/resources/org/nots/sandbox/copyfile/input.txt"
                , "/Users/Mitsuru Notsu/NetBeansProjects/sandbox/sandbox/src/test/resources/org/nots/sandbox/copyfile/output.txt");
        assertTrue(FileUtils.contentEquals(new File("input.txt"), new File("output.txt")));
    }

    @Test
    public void copyFile3Test() throws Exception {
        FileUseHistory.filecopy3(
                "/Users/Mitsuru Notsu/NetBeansProjects/sandbox/sandbox/src/test/resources/org/nots/sandbox/copyfile/input.txt"
                , "/Users/Mitsuru Notsu/NetBeansProjects/sandbox/sandbox/src/test/resources/org/nots/sandbox/copyfile/output.txt");
        assertTrue(FileUtils.contentEquals(new File("input.txt"), new File("output.txt")));
    }

    @Test
    public void copyFile4Test() throws Exception {
        FileUseHistory.filecopy4(
                "/Users/Mitsuru Notsu/NetBeansProjects/sandbox/sandbox/src/test/resources/org/nots/sandbox/copyfile/input.txt"
                , "/Users/Mitsuru Notsu/NetBeansProjects/sandbox/sandbox/src/test/resources/org/nots/sandbox/copyfile/output.txt");
        assertTrue(FileUtils.contentEquals(new File("input.txt"), new File("output.txt")));
    }
}
