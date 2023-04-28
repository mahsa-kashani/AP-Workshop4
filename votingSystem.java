import java.util.ArrayList;

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
    
}
