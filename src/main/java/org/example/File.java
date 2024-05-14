package org.example;

public class File implements Component{
    private String name;
    private int sizeInBytes;

    public File(String name, int sizeInBytes) {
        this.name = name;
        this.sizeInBytes = sizeInBytes;
    }

    public int getSizeInBytes() {
        return sizeInBytes;
    }
    public void print(){
        System.out.println("--- file "+name+" size="+getSizeInBytes()+" bytes");
    }

    @Override
    public void operation() {

    }

    @Override
    public void addComponent(Component component) {

    }

    @Override
    public void removeComponent(Component component) {

    }

    @Override
    public void getChild(int i) {

    }
}