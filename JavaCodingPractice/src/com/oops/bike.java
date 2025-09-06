package com.oops;

public  class bike implements Vehicle{

    @Override
    public void changeGear(int a) {
        
        System.out.println("changed gear to "+a);
    }

    @Override
    public void speedUp(int a) {
        
        System.out.println("speed increased by "+a);

    }

    public static void main(String[] args) {
       /* bike b = new bike();
        b.changeGear(3);
        b.speedUp(20);
        System.out.println(speed);*/

       /* int a = 10;
        int b = 10;*/
        String name = "hello";
        String name1 = "hello";
//        System.out.println(a == b);
        System.out.println(name == name1);


        
    }
}
