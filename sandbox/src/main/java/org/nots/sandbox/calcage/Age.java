/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.nots.sandbox.calcage;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Mitsuru Notsu
 */
public class Age {
    
    public static int calcAge(Date birthday, Date standardDay) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        return (Integer.parseInt(sdf.format(standardDay)) - Integer.parseInt(sdf.format(birthday))) / 10000;
    }

    public static int calcAgeDateStd(Date birthday, Date standardDay) {
        Calendar nowCal = Calendar.getInstance();
        nowCal.setTime(standardDay);
        nowCal.add(Calendar.DAY_OF_MONTH, 1);
        return calcAge(birthday, nowCal.getTime());
    }
}
