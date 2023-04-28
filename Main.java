import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args){
        votingSystem votingSystem = new votingSystem(new ArrayList<>());
        ArrayList<String> choices = new ArrayList<>();
        choices.add("saturday");
        choices.add("thursday");
        choices.add("monday");
        choices.add("friday");
        votingSystem.createVoting("choose the best day for class" , true , 1 , choices);
        choices.clear();
        choices.add("11:30");
        choices.add("13:00");
        choices.add("9:30");
        choices.add("16:30");
        votingSystem.createVoting("choose the best time for exam" , false , 0 , choices);
        choices.clear();
        choices.add("the weekend");
        choices.add("ariana grande");
        choices.add("taylor swift");
        choices.add("BTS");
        votingSystem.createVoting("who do you think is the best singer of the year" , false , 1 , choices);
        Person person1 = new Person("ali" , "alavi");
        Person person2 = new Person("taghi" , "taghavi");
        Person person3 = new Person("hossein" , "goodarzi");
        Person person4 = new Person("mahsa" , "kashani");
        Person person5 = new Person("amir" , "hakimi");
        Person person6 = new Person("aref" , "abdi");
        ArrayList<String> voterChoices = new ArrayList<>();
        voterChoices.add("saturday");
        votingSystem.vote(0 , person1 , voterChoices);
        voterChoices.clear();
        voterChoices.add("11:30");
        voterChoices.add("16:30");
        votingSystem.vote(1 , person2 , voterChoices);
        voterChoices.remove("11:30");
        votingSystem.vote(1 , person3 , voterChoices);
        voterChoices.clear();
        votingSystem.vote(1 , person4);
        votingSystem.vote(2 , person5);
        voterChoices.add("BTS");
        votingSystem.vote(2 , person6 , voterChoices);
        votingSystem.printResults(0);
        votingSystem.printResults(1);
        votingSystem.printResults(2);
        votingSystem.printVoters(0);
        votingSystem.printVoters(1);
        votingSystem.printVoters(2);
        votingSystem.printVoting(0);
        votingSystem.printVoting(1);
        votingSystem.printVoting(2);
    }
}
