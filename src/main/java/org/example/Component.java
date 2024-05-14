package org.example;

public interface Component {
    void operation();
    void addComponent(Component component);

    void removeComponent(Component component);

    void getChild(int i);

    int getSizeInBytes();

    void print();
}
