import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskFiveC {
    public static void main(String[] args) {
        Integer count = Integer.valueOf(0);
        String s = "afdhfjhajscjwhchjllhjllc ccccccccc hghgghjjhcc c ghghghgkccjhhchg";


        Pattern pattern = Pattern.compile("c\\S{3,}");
        Matcher matcher = pattern.matcher(s);

        while (matcher.find()){

            count++;
        }
        System.out.println("Количество слов в строке, где встречается буква с три и более раз = " + count);
    }
}
