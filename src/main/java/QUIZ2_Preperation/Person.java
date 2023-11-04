package QUIZ2_Preperation;

class Person {
    private String name;
    private String address;

    public Person (String name, String address){

        this.name = name;
        this.address = address;


    }

    public void setName(String newName){
        this.name = newName;

    }

    public String getName(){
        return this.name;
    }

    public void setAddress(String newAddress){
        this.address = newAddress;

    }

    public String getAddress(){
        return this.address;
    }

    @Override
    public String toString(){
        return this.getName() + "\n  " + this.getAddress();
    }

}

class Student extends Person{
    int credit =0;

    public Student(int credit, String name, String address){
        super(name, address);
        this.credit=0;

    }

    public int getCredit(){
        return this.credit;
    }

    @Override
    public String toString(){
     return this.getName() + "\n  " + this.getAddress() + "\n" + this.getCredit();
    }
}

enum Status{
    NOT_ONLINE, ONLINE
}