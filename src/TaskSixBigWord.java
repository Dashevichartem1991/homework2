public class TaskSixBigWord {
    public static void main(String[] args) {

        String s = "sdkfjkjdjksklcccc scccccc wlkf;jw jklwflw;; 3424jkcccc wefjkkklwj cc ";
        String[] words = s.split(" ");
        String referenceWord = " ";

        for (String word: words) {
            if(word.length() > referenceWord.length()){
                referenceWord = word;
            }
        }
        System.out.println(referenceWord);

    }
}
