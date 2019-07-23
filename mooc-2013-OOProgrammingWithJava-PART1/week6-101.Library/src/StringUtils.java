
/**
 *
 * @author Chuqui
 */
public class StringUtils {

    public static boolean included(String word, String searched) {

        if(word != null && searched != null) {
           word = word.trim();
           word = word.toUpperCase();
           searched = searched.trim();
           searched = searched.toUpperCase();
           
           return word.contains(searched);
        }
        return false;
    }
}
