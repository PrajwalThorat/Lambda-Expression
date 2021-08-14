package com.stackroute.lambdaexpression;

/* Complete the class as per the requirements given in PROBLEM.md */
public class CustomFunctionalInterfaceImplementation {
    private String  name;
    private int num;
    public String getWord(){
        return name;
    }

    public int getCube(){
        return num;
    }

    public void caseSensitive(String name)
    {

        MyFunction<String> first = (a) -> {
            String newName="";
            for (int i = 0; i < a.length(); i++) {

                if (Character.isLowerCase(a.charAt(i)))
                    newName=newName+Character.toUpperCase(a.charAt(i));
                else
                    newName=newName+Character.toLowerCase(a.charAt(i));
            }
            return newName;
        };
        this.name=first.doJob(name);

    }

    public void cubeOfNumber(int num){
        MyFunction<Integer> cube=(a)-> a * a * a;
        this.num=cube.doJob(num);
    }
}
