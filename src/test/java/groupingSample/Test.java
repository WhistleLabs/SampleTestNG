package groupingSample;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test {
    public static void main(String[] args) {

//        System.out.println(getSystemDate("MMMM dd, yyyy"));
//
//        String sCurrentDate=getSystemDate("MMMM dd, yyyy");
//
//
//        String sOneYearDate=getDateBasedOnNoOfMonths(sCurrentDate,"MMMM dd, yyyy",12);
//        System.out.println(sOneYearDate);
//
//        String sFormattedDate=convertFormatOfDate(sOneYearDate,"MMMM dd, yyyy","MM/dd/yyyy");
//        System.out.println("Formatted date : "+sFormattedDate);

//        //	April 13, 2021
//        System.out.println(getDateBasedOnNoOfMonths(getSystemDate("MMMM dd, yyyy"),"MMMM dd, yyyy",24));
//        System.out.println(getDateBasedOnNoOfMonths(getSystemDate("MM/dd/yyyy"),"MM/dd/yyyy",24));


    }
    public static String getSystemDate(String sFormat) {
        DateFormat dateFormat = new SimpleDateFormat(sFormat);
        Date date = new Date();
        String Date = dateFormat.format(date);
        return Date;
    }

    public static String getDateBasedOnNoOfMonths(String sDate, String sFormat, int iNoOfMonths) {
        SimpleDateFormat format = null;
        Date date;
        Calendar calendar = null;
        try {
            format = new SimpleDateFormat(sFormat);
            date = format.parse(sDate);
            calendar = Calendar.getInstance();
            calendar.setTime(date);
            calendar.add(Calendar.MONTH, iNoOfMonths);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return format.format(calendar.getTime());
    }

    public static String convertFormatOfDate(String sDate,String sOldFormat,String sNewFormat)
    {
        String  sFormattedDate="";
        SimpleDateFormat format = null;
        Date date;
        Calendar calendar = null;
        try {
            format = new SimpleDateFormat(sOldFormat);
            date = format.parse(sDate);

    sFormattedDate =new SimpleDateFormat(sNewFormat).format(date);


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return sFormattedDate;

    }

}
