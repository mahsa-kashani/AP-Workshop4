import java.util.ArrayList;
import java.util.Objects;

public class votingSystem {
    private ArrayList<Voting> votingList;

    public votingSystem(ArrayList<Voting> votingList) {
        this.votingList = votingList;
    }

    public ArrayList<Voting> getVotingList() {
        return votingList;
    }
    public Voting getVoting(int index){
        return votingList.get(index);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        votingSystem that = (votingSystem) o;
        return Objects.equals(votingList, that.votingList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(votingList);
    }
    public void createVoting(String question , boolean isAnonymous , int type , ArrayList<String> choices){
        votingList.add(new Voting(type , question , choices , isAnonymous));
    }
    public void vote(int index , Person voter , ArrayList<String> voterChoices){
        votingList.get(index).vote(voter , voterChoices);
    }
    public void vote(int index , Person voter){
        votingList.get(index).vote(voter);
    }
    public void printResults(int index){
        votingList.get(index).printResults();
    }
    public void printVoters(int index){
        votingList.get(index).printVoters();
    }
}
