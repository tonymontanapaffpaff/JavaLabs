package by.gsu.pms;

public class Utility {

    public static String toConvert(int beforeConvert) {
        return beforeConvert / 100 + ":" + beforeConvert % 100 / 10 + beforeConvert % 10;
    }
}
