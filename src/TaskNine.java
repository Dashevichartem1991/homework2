import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskNine {
    public static void main(String[] args) {
        String s = " Test adkfjkjdjksklccca accccca 0000-1111-2222-3333 wlkf;jw jklwflw;; 3424jkcccc wefjkkklwj cc aa";
        String keyWord = "test";

        Pattern pattern = Pattern.compile("\\b" + keyWord.toLowerCase() + "\\b");
        Matcher matcher = pattern.matcher(s.toLowerCase());

        while (matcher.find()){

            System.out.println("Слово в строке найдено, индекс первого символа равен " + matcher.start());

        }
    }
}
