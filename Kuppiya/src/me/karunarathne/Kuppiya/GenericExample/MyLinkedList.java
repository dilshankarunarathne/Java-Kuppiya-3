package me.karunarathne.Kuppiya.GenericExample;

public class MyLinkedList <T> implements LinkedList {
    @Override
    public void add(Object element) {
        element = (T) element;
    }

    @Override
    public Object get() {
        return null;
    }

}

