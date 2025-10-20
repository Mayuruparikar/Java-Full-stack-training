package com.training.training.ref.cons;

public class ConsMain {
    public static void main(String[] args) {
        System.out.println("learning constructor reference");
        //using lambda
//        Provider provider=()->{
//            return new student();
//        };
//        student st=provider.getstudent();
//        st.display();

        //using constructor reference
        //classname::new
        Provider provider=student::new;
        student st2=provider.getstudent();
        st2.display();


    }
}
