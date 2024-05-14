package org.example;

import java.util.ArrayList;
import java.util.Collection;

public class Link implements  Component{
    String linkName;
    Collection<Component> componentCollection = new ArrayList<>();

    Link(String linkName){
        this.linkName = linkName;
    }
    @Override
    public void operation() {

    }

    @Override
    public void addComponent(Component component) {
        componentCollection.add(component);
    }

    @Override
    public void removeComponent(Component component) {

    }

    @Override
    public void getChild(int i) {

    }

    public int computeSize(){
        int sizeInBytes=0;

        for (Component component : componentCollection){
            sizeInBytes+=component.getSizeInBytes();
        }
        return sizeInBytes;
    }
    @Override
    public int getSizeInBytes() {
        return computeSize();
    }

    @Override
    public void print() {

    }
}
