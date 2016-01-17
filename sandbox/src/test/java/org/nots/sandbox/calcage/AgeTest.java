/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.nots.sandbox.calcage;

import java.util.Calendar;
import java.util.Date;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import org.junit.Test;

/**
 *
 * @author Mitsuru Notsu
 */
public class AgeTest {
    
    @Test
    public void calcAgeTest1() {
        Date birthday = date(2016, 2, 29);
        Date stdDay = date(2017, 2, 28);
        assertThat(Age.calcAge(birthday, stdDay), is(0));
    }
    @Test
    public void calcAgeTest2() {
        Date birthday = date(2016, 2, 29);
        Date stdDay = date(2017, 3, 1);
        assertThat(Age.calcAge(birthday, stdDay), is(1));
    }
    @Test
    public void calcAgeTest3() {
        Date birthday = date(2016, 2, 29);
        Date stdDay = date(2020, 2, 28);
        assertThat(Age.calcAge(birthday, stdDay), is(3));
    }
    @Test
    public void calcAgeTest4() {
        Date birthday = date(2016, 2, 29);
        Date stdDay = date(2020, 2, 29);
        assertThat(Age.calcAge(birthday, stdDay), is(4));
    }

    
    @Test
    public void calcAgeDateStdTest1() {
        Date birthday = date(2016, 2, 29);
        Date stdDay = date(2017, 2, 27);
        assertThat(Age.calcAgeDateStd(birthday, stdDay), is(0));
    }
    @Test
    public void calcAgeDateStdTest2() {
        Date birthday = date(2016, 2, 29);
        Date stdDay = date(2017, 2, 28);
        assertThat(Age.calcAgeDateStd(birthday, stdDay), is(1));
    }
    @Test
    public void calcAgeDateStdTest3() {
        Date birthday = date(2016, 2, 29);
        Date stdDay = date(2020, 2, 27);
        assertThat(Age.calcAgeDateStd(birthday, stdDay), is(3));
    }
    @Test
    public void calcAgeDateStdTest4() {
        Date birthday = date(2016, 2, 29);
        Date stdDay = date(2020, 2, 28);
        assertThat(Age.calcAgeDateStd(birthday, stdDay), is(4));
    }

    private Date date(int year, int month, int date) {
        Calendar cal = Calendar.getInstance();
        cal.set(year, month, date);
        return cal.getTime();
    }
}
