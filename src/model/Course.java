package model;

public class Course {
    int id;
    int code;
    String name;
    String description;
    int credit;

    public Course(int aID, int aCode, String aName, String aDescription, int aCredit){
        id = aID;
        code = aCode;
        name = aName;
        description = aDescription;
        credit = aCredit;
    }

    public int getID(){
        return this.id;
    }

    public int getCode(){
        return this.code;
    }

    public String getName(){
        return this.name;
    }

    public String getDescription(){
        return this.description;
    }

    public int getCredit(){
        return this.credit;
    }
}
