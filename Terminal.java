import java.time.LocalDate;

public class Terminal {
    public static void check(Card card){
        if (Card.check(card))
        {
            System.out.println("Access granted");
            Main.main("pass", card, true);

        }
        else
        {
            System.out.println("Access denied");
            Main.main("pass", card, false);

        }

    }

    public static void register_card(String type, LocalDate expire_date, int pass_number){
        Card.add(type, expire_date, pass_number);
    }

    public static void ban_card(Card card){
        card.ban_card(card);
    }
}
