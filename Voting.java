import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Voting {
    private int type;
    private String question;
    private HashMap<String , HashSet<Vote>> choices;
    private boolean isAnonymous;
    private ArrayList<Person> voters;

    public Voting(int type, String question, HashMap<String, HashSet<Vote>> choices, boolean isAnonymous, ArrayList<Person> voters) {
        this.type = type;
        this.question = question;
        this.choices = choices;
        this.isAnonymous = isAnonymous;
        this.voters = voters;
    }
}
