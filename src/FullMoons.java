/**
 * Created by RSadykov on 29.01.2017.
 */
import  java.io.*;
import java.util.*;
import static java.lang.System.out;

public class FullMoons {
    private static int DAY_IM=1000*60*60*24;
    public static void main(String[] args){
        Calendar c=Calendar.getInstance();
        TimeZone timeZone=TimeZone.getDefault();
        c.setTimeZone(timeZone);
        c.set(2004,0,7,15,40);
        long day1=c.getTimeInMillis();
        for (int x=0;x<60;x++){
            day1+=(DAY_IM*29.52);
            c.setTimeInMillis(day1);
            out.println(String.format("Полнолуние было в %tc",day1));
        }
    }
}
