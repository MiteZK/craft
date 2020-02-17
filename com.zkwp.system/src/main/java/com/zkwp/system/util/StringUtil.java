package com.zkwp.system.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @auther zhangkun
 * @date 2020/2/16 12:17
 **/
public class StringUtil {

    public static boolean isEmail(Object args) {
        if(args == null){
            return false;
        }else{
            Pattern p = Pattern.compile("^\\s*\\w+(?:\\.{0,1}[\\w-]+)*@[a-zA-Z0-9]+(?:[-.][a-zA-Z0-9]+)*\\.[a-zA-Z]+\\s*$");
            Matcher m = p.matcher(args.toString());
            return m.matches();
        }
    }

    public static String dateToString(Date date){
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return format.format(date);
    }

}
