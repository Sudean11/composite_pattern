package org.example;

import java.util.ArrayList;
import java.util.Collection;

public class Directory implements  Component{
    protected String name;
    protected Collection<Component> componentList = new ArrayList<Component>();


    public Directory(String name) {
        this.name = name;
    }
    public void print(){
        System.out.println("-- dir "+name+" size="+computeSize()+" bytes");
        for (Component component : componentList){
            component.print();
        }

    }

    public int computeSize(){
        int sizeInBytes=0;

        for (Component dir : componentList){
            sizeInBytes+=dir.getSizeInBytes();
        }
        return sizeInBytes;
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