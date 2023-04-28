import java.util.*;

public class Voting {
    private int type;
    private String question;
    private HashMap<String , HashSet<Vote>> choices = new HashMap<>();
    private boolean isAnonymous;
    private ArrayList<Person> voters = new ArrayList<>();

    public Voting(int type, String question, ArrayList<String> choices, boolean isAnonymous) {
        this.type = type;
        this.question = question;
        for(String choice : choices)
            createChoices(choice);
        this.isAnonymous = isAnonymous;
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

    public ArrayList<String> getChoices() {
        return new ArrayList<>(choices.keySet());
    }

    public void createChoices(String choices) {
        this.choices.put(choices , new HashSet<>());
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
        if(!isAnonymous){
            if(type == 0 && voter_choices.size() > 1){
                System.out.println("in this voting you can't choose more than one option");
            }
            Vote myVote = new Vote(voter , "ِdate is not important field in this project");
            for(String myChoice : voter_choices){
                for(String choice : choices.keySet()){
                    if(myChoice.equals(choice))
                        choices.get(choice).add(myVote);
                }
            }
            voters.add(voter);
        }
        else{
            System.out.println("this voting is anonymous!");
        }
    }
    public void vote(Person person){
        if(isAnonymous){
            Vote myVote = new Vote(person , "ِdate is not important field in this project");
            ArrayList<String> key = new ArrayList<>(choices.keySet());
            int rand = new Random().nextInt(0 , key.size());
            choices.get(key.get(rand)).add(myVote);
        }
        else{
            System.out.println("this voting is not anonymous!");
        }
    }
    public void printResults(){
        for(String key : choices.keySet()){
            System.out.println(key + " -> " + choices.get(key).size());
        }
    }
    public void printVoters(){
        if(!isAnonymous){
            for(String key : choices.keySet()){
                ArrayList<Vote> keyVotes = new ArrayList<>(choices.get(key));
                System.out.println("those who vote " + key + ":");
                for(Vote keyVote : keyVotes){
                    System.out.println(keyVote.getVoter().getFirstName() + " " + keyVote.getVoter().getLastName());
                }
            }
        }
        else{
            System.out.println("this voting is anonymous!");
        }
    }
}
