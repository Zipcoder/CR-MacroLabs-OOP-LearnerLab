package io.zipcoder.interfaces;

import java.util.ArrayList;

public class  People<E extends Person> {

    private ArrayList<E> personList;

    public People ( ){
        personList=new ArrayList<E>();
    }

    public void add(E person) {
        personList.add(person);
    }

    public E findById(long id) {
        for (E person : personList) {
            if (person.getId() == id)
                return person;
        }
        return null;
    }

    public void remove(E person) {
        personList.remove(person);
    }

    public void remove(long id) {

                personList.remove(findById(id));
    }

    public int getCount(){
        return personList.size();
    }

    public E [] getArray(){

        return (E[]) personList.toArray();
    }

    public void removeAll() {
        personList.clear();
    }
}



