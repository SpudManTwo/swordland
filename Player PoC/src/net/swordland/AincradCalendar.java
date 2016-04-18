/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.swordland;

import java.util.Calendar;
import java.util.TimeZone;

/**
 *
 * @author Kazumi
 */
public class AincradCalendar
{
    public static Calendar now()
    {
        Calendar currCalendar = Calendar.getInstance(TimeZone.getTimeZone("UTC+9"));
        currCalendar.add(Calendar.YEAR, 10);
        return currCalendar;
    }
}
