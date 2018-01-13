import java.util.ArrayList;
import java.util.List;

public class Main {
    static List<Card> card_register = new ArrayList<Card>();
    static List<String> pass_history = new ArrayList<String>();
    public static void main(String action, Card id, boolean result){
        if (action == "reg"){
            card_register.add(id);
            pass_history.add("$java.time.LocalDateTime ~ $id ~ $action ~ $result");
        }else if (action == "pass"){
            pass_history.add("$java.time.LocalDateTime ~ $id ~ $action ~ $result");
        }else if (action == "ban"){
            pass_history.add("$java.time.LocalDateTime ~ $id ~ $action ~ $result");
        }

    }
}
