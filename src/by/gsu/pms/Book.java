package by.gsu.pms;

import java.io.*;

public class Book {
    private String filePath;
    private String textEncoding;

    public Book(String filePath, String textEncoding) {
        this.filePath = filePath;
        this.textEncoding = textEncoding;
    }

    public String getText() {
        StringBuilder result = new StringBuilder(1024);
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(new File(filePath)), textEncoding))) {
            String textLine;
            while ((textLine = reader.readLine()) != null) {
                result.append(textLine).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result.toString();
    }
}
