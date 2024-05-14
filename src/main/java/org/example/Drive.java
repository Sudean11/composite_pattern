package org.example;

import java.util.ArrayList;
import java.util.Collection;

public class Drive implements  Component{
    protected String name;
    protected Collection<Component> componentList = new ArrayList<Component>();
    public Drive(String name) {
        this.name = name;
    }


    public int computeSize(){
        int sizeInBytes=0;

        for (Component dir : componentList){
            sizeInBytes+=dir.getSizeInBytes();
        }
        return sizeInBytes;
    }
    public void print(){
        System.out.println("- drive "+name);
        for (Component component : componentList){
            component.print();
        }
    }

    @Override
    public void operation() {

    }

    @Override
    public void addComponent(Component component) {
        componentList.add(component);
    }

    @Override
    public void removeComponent(Component component) {

    }

    @Override
    public void getChild(int i) {

    }


    @Override
    public int getSizeInBytes() {
        return computeSize();
    }
}
