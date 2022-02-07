import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskFiveC {
    public static void main(String[] args) {
        Integer count = Integer.valueOf(0);
        String s = "sdkfjkjdjksklcccc scccccc wlkf;jw jklwflw;; 3424jkcccc wefjkkklwj cc ";


        Pattern pattern = Pattern.compile("c{3,}");
        Matcher matcher = pattern.matcher(s);

        while (matcher.find()){

            count++;
        }
        System.out.println("Количество слов в строке, где встречается буква с три и более раз = " + count);
    }
}
