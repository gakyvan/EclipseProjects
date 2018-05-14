/*
 * Created on Jan 23, 2018
 */
package edu.mum.asd.momento;


public class Originator {
    String orginatedState;

    
    public String getOrginatedState() {
        return orginatedState;
    }

    
    public void setOrginatedState(String orginatedState) {
        this.orginatedState = orginatedState;
    }
    
    public Memento saveToMemento() {
        return new Memento(orginatedState);
    }
    
    public String getStateFromMemento(Memento memento) {
        return memento.getState();
    }

}
