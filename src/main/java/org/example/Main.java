package org.example;

public class Main {
    public static void main(String[] args) {
        Drive cdrive = new Drive("C");
        Directory appdir = new Directory("applications");
        Directory datadir = new Directory("my data");
        Directory coursedir = new Directory("cs525");
        File excelfile = new File("msexcel.exe", 2353256);
        File wordfile = new File("msword.exe", 3363858);
        File studentsfile = new File("students.doc", 34252);
        cdrive.addComponent(appdir);
        cdrive.addComponent(datadir);
        datadir.addComponent(coursedir);
        appdir.addComponent(excelfile);
        appdir.addComponent(wordfile);
        coursedir.addComponent(studentsfile);
        System.out.println(cdrive.getSizeInBytes());
        coursedir.addComponent(new Link("Sanzhar"));
        coursedir.addComponent(new File("Snazar.ext", 23432432));
        cdrive.print();
    }

//    - drive C
//-- dir applications size=5717114 bytes
//--- file msexcel.exe size=2353256 bytes
//--- file msword.exe size=3363858 bytes
//-- dir my data size=34252 bytes
//-- dir cs525 size=34252 bytes
//--- file students.doc size=34252 bytes

}