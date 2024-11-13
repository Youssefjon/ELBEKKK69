package uz;

public class Main {
    //    public static void main(String[] args) {
//        System.out.println(diff21(1));
//    }
//
//    public static int diff21(int n) {
//        return 1;
//
//    }
//
//    public String theEnd(String str, boolean front) {
//        return (front) ? str.substring(0, 1) : str.substring(str.length() - 1);


    public String withouEnd2(String str) {

        if (str.length() < 3) {
            return "";
        }
        String s = str.substring(1, str.length() - 1);
        return s;

    }
}

