import by.gsu.pms.Book;
import by.gsu.pms.Text;

public class Runner {
    public static void main(String[] args) {
        final String INPUT = "src/in.txt";
        final String ENCODING = "UTF8";
        Text text = new Text(new Book(INPUT, ENCODING));
        System.out.println(text);
        text.sort();
        System.out.println(text);
    }
}
