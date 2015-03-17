package net.moonlithome.game.framework.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by moonlithome on 2015/3/17.
 */
public class DateFormatUtil {

    private static SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public static String formatDateToString(Date date){
        return sf.format(date);
    }

    public static Date parseStringToDate(String dateString) throws ParseException {
        return sf.parse(dateString);
    }
}
