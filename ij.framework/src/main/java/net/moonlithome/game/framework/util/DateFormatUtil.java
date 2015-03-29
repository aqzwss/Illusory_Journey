package net.moonlithome.game.framework.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by moonlithome on 2015/3/17.
 */
public class DateFormatUtil {

    private static SimpleDateFormat sfLang = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    private static SimpleDateFormat sfShort = new SimpleDateFormat("yyyy-MM-dd");

    public static String formatLangDate(Date date){
        return sfLang.format(date);
    }

    public static Date parseLangDate(String dateString) throws ParseException {
        return sfLang.parse(dateString);
    }

    public static String formatShortDate(Date date){
        return sfShort.format(date);
    }

    public static Date parseShortDate(String dateString) throws ParseException{
        return sfShort.parse(dateString);
    }

}
