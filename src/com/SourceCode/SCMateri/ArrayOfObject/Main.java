package com.SourceCode.SCMateri.ArrayOfObject;

import java.util.*;

class Student {
    int marks;
}

public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Student[] StudentArray = new Student[2];
        
        for (int i = 0; i < StudentArray.length; i++) {
            StudentArray[i] = new Student();
        }

        for (Student s : StudentArray) {
            s.marks = scan.nextInt();
        }

        System.out.println(StudentArray[0].marks);
        modify(StudentArray);
        System.out.println(StudentArray[0].marks);
        
    }
    
    public static void modify (Student[] s){
        s[0].marks = 5;
    }
}