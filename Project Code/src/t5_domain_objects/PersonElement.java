package t5_domain_objects;

import java.util.Vector;

public class PersonElement implements PersonInterface {
    private Vector<PersonInterface> personElements = new Vector<PersonInterface>();

    public void add(PersonInterface p){
        personElements.add(p);
    }

    public void remove(PersonInterface p){
        personElements.remove(p);
    }

    public String toString(){
        String s = "";

        for(PersonInterface p: personElements)
            s += p.toString();
        return s;
    }
}
