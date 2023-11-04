package day19_oop_concept03;

    /*

        Encapsulation: Data hiding...
        Why we hide data?
        1: Because some data are private like: ssn, ID, credit card...
        2: Because we may not want people to reach that data.

         How we can hide data?
         We use private keyword in front of the class member.




    */
public class C05Student {

    private  String stId = "TH001";
    private String illness = "Depression";
    private double gpa = 3.98;
    private boolean disability = false;

    //
        public String getStId() {
            return stId;
        }

        public String getIllness() {
            return illness;
        }

        public double getGpa() {
            return gpa;
        }

        public boolean isDisability() { // boolean getters starts with "Is"
            return disability;
        }


        // If we want to update encapsulated data we use setters:
        public void setStId(String stId) {
            this.stId = stId;
        }














}
