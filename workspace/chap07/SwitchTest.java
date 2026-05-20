package chap07;

public class SwitchTest {
    public static void main(String[] args) {
        int month = 4;

        if(month < 1 || month > 12) {
            System.out.println("1이상 12 이하의 숫자만 가능합니다.");
            System.exit(0);
        }

        //v04
        int last_day = 0;
        switch (month) {
            case 2:
                last_day = 28;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                last_day = 30;
                break;
            default:
                last_day = 31;
                break;
        }

        System.out.println(month+"월의 마지막 날은 "+ last_day + "일입니다.");

        //v03
        switch (month) {
            case 2:
                System.out.println(month+"월의 마지막 날은 28일입니다.");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(month+"월의 마지막 날은 30일입니다.");
                break;
            default:
                System.out.println(month+"월의 마지막 날은 31일입니다.");
                break;
        }

        //v02
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println(month+"월의 마지막 날은 31일입니다.");
                break;
            case 2:
                System.out.println(month+"월의 마지막 날은 28일입니다.");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(month+"월의 마지막 날은 30일입니다.");
                break;
        }

        //v01
        switch (month) {
            case 1:
                System.out.println(month+"월의 마지막 날은 31일입니다.");
                break;
            case 2:
                System.out.println(month+"월의 마지막 날은 28일입니다.");
                break;
            case 3:
                System.out.println(month+"월의 마지막 날은 31일입니다.");
                break;
            case 4:
                System.out.println(month+"월의 마지막 날은 30일입니다.");
                break;
            case 5:
                System.out.println(month+"월의 마지막 날은 31일입니다.");
                break;
            case 6:
                System.out.println(month+"월의 마지막 날은 30일입니다.");
                break;
            case 7:
                System.out.println(month+"월의 마지막 날은 31일입니다.");
                break;
            case 8:
                System.out.println(month+"월의 마지막 날은 31일입니다.");
                break;
            case 9:
                System.out.println(month+"월의 마지막 날은 30일입니다.");
                break;
            case 10:
                System.out.println(month+"월의 마지막 날은 31일입니다.");
                break;
            case 11:
                System.out.println(month+"월의 마지막 날은 30일입니다.");
                break;
            case 12:
                System.out.println(month+"월의 마지막 날은 31일입니다.");
                break;
        }
        System.out.println("프로그램 종료");
    }
}
