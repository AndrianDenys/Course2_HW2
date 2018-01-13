import java.time.LocalDate;

public class Card {
    private int id = 0;
    private String type = "unlimited";
    private int pass_number = 0;
    private boolean pass = true;
    private LocalDate creation_date = java.time.LocalDate;
    private LocalDate expire_date = java.time.LocalDate;

    public Card(int id, String type, int pass_number, boolean pass, LocalDate creation_date, LocalDate expire_date) {
        this.id = id;
        this.type = type;
        this.pass_number = pass_number;
        this.pass = pass;
        this.creation_date = creation_date;
        this.expire_date = expire_date;
    }

    public boolean isPass() {
        return pass;
    }

    public void setPass(boolean pass) {
        this.pass = pass;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPass_number() {
        return pass_number;
    }

    public void setPass_number(int pass_number) {
        this.pass_number = pass_number;
    }

    public void add(String type, LocalDate expire_date, int pass_number) {
        if (type == "unlimited") {
            int currentID = this.id + 5;
            setId(this.id + 10);
            Card id$currentID = new Card(currentID, "unlimited", 0, true, java.time.LocalDate, expire_date);
            Main.main("reg", id$currentID, true);

        } else if (type == "limited") {
            int currentID = this.id + 1;
            setId(this.id + 10);
            Card id$currentID = new Card(currentID, "limited", pass_number, true, java.time.LocalDate, expire_date);
            Main.main("reg", id$currentID, true);


        } else {
            System.out.println("You`r special");
        }
    }
    public  boolean check(Card card){
        if ((this.getId() % 5 == 0) && isPass()){
            return true;
        }else if ((this.getId() % 5 == 1) && isPass() && (this.getPass_number() > 0)){
            this.setPass_number(this.pass_number -1);
            return true;
        }else{return false;}
    }
    public void ban_card(Card card){
        card.setPass(false);
        Main.main("ban", card, true);
    }
}
