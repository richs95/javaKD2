/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javakd1.model;
import java.util.concurrent.atomic.AtomicInteger; //for uniq int variable
import javasem04.activity.*;
/**
 *
 * @author Richs
 */
public abstract class Candidate extends Person{
    static AtomicInteger nextId = new AtomicInteger();
    int no; 
    int votes;

    public Candidate(int no, int votes, String name, int age, String comment) {
        super(name, age, comment);
        this.no = nextId.incrementAndGet(); //This will guarantee that if two objects are created at exactly the same time, they do not share the same Id.
        this.votes = 0;
    }

    public int getNo() {
        return no;
    }

    public int getVotes() { // name un age ir private klases mainiigie klase person
        return votes;
    }

    public String getComment() {
        return comment;
    }

    public void setVotes(int votes) {
        this.votes = votes;
    }

    
}
