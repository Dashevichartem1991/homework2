import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskSevenLetterA {
    public static void main(String[] args) {
        Integer count = Integer.valueOf(0);
        String s = "adkfjkjdjksklccca accccca wlkf;jw jklwflw;; 3424jkcccc wefjkkklwj cc aa";


        Pattern pattern = Pattern.compile("a\\S*a");
        Matcher matcher = pattern.matcher(s);

        while (matcher.find()){

            count++;
        }
        System.out.println("Количество слов в строке, которые начинаются и заканчиваются на букву а = " + count);
    }
}
