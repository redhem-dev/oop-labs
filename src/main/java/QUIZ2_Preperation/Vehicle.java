package QUIZ2_Preperation;

class Vehicle {
    String color;
    int yearOfProduction;

    public Vehicle (String color, int yearOfProduction){
        this.color = color;
        this.yearOfProduction = yearOfProduction;

    }

    public void setColor(String newcolor){
        this.color = newcolor;
    }

    public String getColor(){
        return this.color;
    }

    public void setYearOfProduction(int newyearodproducitom){
        this.yearOfProduction = newyearodproducitom;
    }

    public int getYearOfProduction(){
        return this.yearOfProduction;
    }

}

class Motor extends Vehicle{

        String motortype;


        public Motor(String color, int yearOfProduction, String motortype){
            super(color, yearOfProduction);
            this.motortype = motortype;
        }

        public String getMotortype(){
            return this.motortype;
        }

        public void setMotortype(String newmotortype){
            this.motortype = newmotortype;
        }




}


