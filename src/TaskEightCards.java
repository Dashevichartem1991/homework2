import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class TaskEightCards {
    public static void main(String[] args) {

        String s = "adkfjkjdjksklccca accccca 0000-1111-2222-3333 wlkf;jw jklwflw;; 3424jkcccc wefjkkklwj cc aa";


        Pattern pattern = Pattern.compile("[0-9]{4}-[0-9]{4}-[0-9]{4}-[0-9]{4}");
        Matcher matcher = pattern.matcher(s);

        while (matcher.find()){

            System.out.println("Номер карты = " + matcher.group());

        }

    }
}
