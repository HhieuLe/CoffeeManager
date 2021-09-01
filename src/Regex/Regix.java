package Regex;

//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//public class Regix {
//    public static   boolean CheckName(String string) {
//        final String regex = "[a-zA-ZaAàÀảẢãÃáÁạẠăĂằẰẳẲẵẴắẮặẶâÂầẦẩẨẫẪấẤậẬbBcCdDđĐeEèÈẻẺẽẼéÉẹẸêÊềỀểỂễỄếẾệỆ\n"
//                + "fFgGhHiIìÌỉỈĩĨíÍịỊjJkKlLmMnNoOòÒỏỎõÕóÓọỌôÔồỒổỔỗỖốỐộỘơƠờỜởỞỡỠớỚợỢpPqQrRsStTu\n"
//                + "UùÙủỦũŨúÚụỤưƯừỪửỬữỮứỨựỰvVwWxXyYỳỲỷỶỹỸýÝỵỴzZ]+";
//        Pattern pattern =Pattern.compile(regex);
//        Matcher matcher = pattern.matcher(string);
//        return matcher.matches();
//    }
//

//}


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regix {
    public static final int TOTAL_PACKING_SPACES = 15;

    public static int enterInteger() {
        int choice;
        Scanner scanner = new Scanner(System.in);
        try {
            choice = scanner.nextInt();
        } catch (Exception e) {
            System.out.print("Vui lòng chỉ nhập số !!! \nNhập lại nào : ");
            choice = enterInteger();
        }
        return choice;
    }

    public static long enterLong() {
        long choice;
        Scanner scanner = new Scanner(System.in);
        try {
            choice = scanner.nextLong();
        } catch (Exception e) {
            System.out.println("The input invalid!");
            choice = enterInteger();
        }
        return choice;
    }

    public static float enterFloat() {
        float choice;
        Scanner scanner = new Scanner(System.in);
        try {
            choice = scanner.nextFloat();
        } catch (Exception e) {
            System.out.println("The input value must be a real number!");
            choice = enterFloat();
        }
        return choice;
    }

    public static double enterDouble() {
        double choice;
        Scanner scanner = new Scanner(System.in);
        try {
            choice = scanner.nextDouble();
        } catch (Exception e) {
            System.out.println("The input value must be a real number!");
            choice = enterDouble();
        }
        return choice;
    }

    public static int enterIDTicket() {
        int idTemp = enterInteger();

        while (idTemp <= 0) {
            System.out.print("\nEnter number > 0");
        }
        return idTemp;
    }

    public static String enterPhoneNumber() {
        String phoneNumber = null;
        Matcher matcher = null;
        do {
            phoneNumber = (new Scanner(System.in)).nextLine();
            Pattern pattern = Pattern.compile("^[0][1-9]{3}[ ][0-9]{3}[ ][0-9]{4}$");
            matcher = pattern.matcher(phoneNumber);
        } while (!matcher.find());

        return phoneNumber;
    }

    public static String enterName() {
        String name = null;
        Matcher matcher;
        String regex = "^([aAàÀảẢãÃáÁạẠăĂằẰẳẲẵẴắẮặẶâÂầẦẩẨẫẪấẤậẬbBcCdDđĐeEèÈẻẺẽẼéÉẹẸêÊềỀểỂễỄếẾệỆfFgGhHiIìÌỉỈĩĨíÍịỊjJkKlLmMnNoOòÒỏỎõÕóÓọỌôÔồỒổỔỗỖốỐộỘơƠờỜởỞỡỠớỚợỢpPqQrRsStTuUùÙủỦũŨúÚụỤưƯừỪửỬữỮứỨựỰvVwWxXyYỳỲỷỶỹỸýÝỵỴzZ]+[ ]*)+$";

        do {
            name = (new Scanner(System.in)).nextLine();
            Pattern pattern = Pattern.compile(regex);
            matcher = pattern.matcher(name);
            boolean b = matcher.matches();
            if (!b) {
                System.out.print("Nhập lại nào (chỉ nhập chữ thôi nhé ) : ");
            } else {
                break;
            }
        } while (!matcher.find());
        return name;
    }

    public static String checkDateTime() {
        String dayTime;
        Matcher matcher;
        String regex = "([0-2][0-9]|(3)[0-1])(\\/)(((0)[0-9])|((1)[0-2]))(\\/)(((1)(9)[5-9][0-9])|((2)(0)[0][0-3]))";
        do {
            dayTime = new Scanner(System.in).nextLine();
            Pattern pattern = Pattern.compile(regex);
            matcher = pattern.matcher(dayTime);
            boolean b = matcher.matches();
            if(!b){
                System.out.print("Nhập lại nào (theo mẫu dd/mm/yyyy): ");
            }else {
                break;
            }
        }while (!matcher.find());

        return dayTime;
    }

    public static Date StringToDate(String s) {

        Date result = null;
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            result = dateFormat.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();

        }
        return result;
    }

    public static float hourDiff(Date startTime, Date endTime) {
        long milisecond = endTime.getTime() - startTime.getTime();
        long a = 1000 * 60 * 60;
        return (milisecond / a);
    }

    public static boolean dayCheck() {
        LocalDateTime dateTime = LocalDateTime.now();
        int hourNow = dateTime.getHour();
        return hourNow >= 6 && hourNow <= 18;
    }

    public static Date plusDay(Date startTime, int addDay) {
        Calendar c = Calendar.getInstance();
        try {
            c.setTime(startTime);
        } catch (Exception e) {
            e.printStackTrace();
        }

        c.add(Calendar.DAY_OF_MONTH, addDay);
        //String newDate = sdf.format(c.getTime());
        Date date = c.getTime();

        return date;
    }

    public static String enterIDNumber() {
        String name = null;
        Matcher matcher = null;
        do {
            name = (new Scanner(System.in)).nextLine();
            Pattern pattern = Pattern.compile("^[0-9]+$");
            matcher = pattern.matcher(name);
        } while (!matcher.find());

        return name;
    }
}