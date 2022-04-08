package com.SourceCode;

public class CobaCoba {
   public static void main(String[] args) {
      Student s1 = new Student();
      System.out.println("Student description:\n"
              + "ID: " + s1.getId() + "\n"
              + "Name: " + s1.getName() + "\n");
   }
}

class Student {
   private String id;
   private String name;
   private String internalCode;
   public Student() {
      id = "None";
      name = "Anonymous";
      internalCode = "003";
      // Student("None", "Anonymous");
   }
   public Student(String id, String name) {
      this.id = id;
      this.name = name;
   }
   public String getId() {
      return id;
   }
   public void setId(String id) {
      this.id = id;
   }
   public String getName() {
      return name;
   }
   public void setName(String name) {
      this.name = name;
   }
}