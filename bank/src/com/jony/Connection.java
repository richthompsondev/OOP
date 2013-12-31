package com.jony;

public class Connection implements AutoCloseable{ // Because of try() with resources;
    public Connection(){
        System.out.println("Opening connection");
        // For testing object not constructed
        //throw new IllegalStateException();
    }

    public void readData() {
        System.out.println("Receiving data");
        throw new IllegalStateException();
    }

    @Override
    public void close() {
        System.out.println("Closing connection");
    }
}
