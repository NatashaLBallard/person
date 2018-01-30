package com.person.demo;

//"public class Person" serves as the blueprint for methods and variables
public class person {
    private String eyes; //sets up the variables that will be used in this class
    private String nose;
    private String mouth;

    //default constructor - because there are no parameters set with in the ()
    public person()
    {

    }

    //overloaded constructor - because parameters are set within the ()
    public person(String eyeval)
    {
        eyes = eyeval;  //determines the value of the parameters
        //this.setEyes(eyeval);
    }

    public String getEyes() {  //"get" determines that it is a getter/accessor which is a method that gets the current state; "Eyes" is the attribute that is being accessed
        return eyes;
    }

    public void setEyes(String eyes) { //"set" determines that it is a setter/mutator which is a method that changes the state; "Eyes" is the attribute that is being accessed
        this.eyes = eyes;
    }

    public String getNose() {
        return nose;
    }

    public void setNose(String nose) {
        this.nose = nose;
    }

    public String getMouth() {
        return mouth;
    }

    public void setMouth(String mouth) {
        this.mouth = mouth;
    }
}
