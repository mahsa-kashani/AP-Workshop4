import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;

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

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public HashMap<String, HashSet<Vote>> getChoices() {
        return choices;
    }

    public void setChoices(HashMap<String, HashSet<Vote>> choices) {
        this.choices = choices;
    }

    public boolean isAnonymous() {
        return isAnonymous;
    }

    public void setAnonymous(boolean anonymous) {
        isAnonymous = anonymous;
    }

    public ArrayList<Person> getVoters() {
        return voters;
    }

    public void setVoters(ArrayList<Person> voters) {
        this.voters = voters;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Voting voting = (Voting) o;
        return type == voting.type && isAnonymous == voting.isAnonymous && Objects.equals(question, voting.question) && Objects.equals(choices, voting.choices) && Objects.equals(voters, voting.voters);
    }
    public void vote(Person voter , ArrayList<String> voter_choices){
        Vote myVote = new Vote(voter , "ِdate is not important field in this project");
        for(String myChoice : voter_choices){
            for(String choice : choices.keySet()){
                if(myChoice.equals(choice))
                    choices.get(choice).add(myVote);
            }
        }
        voters.add(voter);
    }
}
