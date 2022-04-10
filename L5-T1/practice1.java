package tamrin1;

import java.util.Scanner;

public class Ta1 {

    public static void main(String[] args) {

        BuilderInfo builderInfo = new BuilderInfo() .setName("mehrshad").setAge(19).setNumber(12345).setUsername("ghamari").setPassword("54321").setAddress("tehran").setEducation("diploma");
        System.out.println("name= "+builderInfo.getName());
        System.out.println("age= "+ builderInfo.getAge());
        System.out.println("number= "+ builderInfo.getNumber());
        System.out.println("education= "+ builderInfo.getEducation());
        System.out.println("address= "+ builderInfo.getAddress());
        System.out.println("username= "+ builderInfo.getUsername());
        System.out.println("password= "+ builderInfo.getPassword());

        //end
    }
}