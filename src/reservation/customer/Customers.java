package reservation.customer;

import java.util.ArrayList;

public abstract class Customers {

    private ArrayList<String> fname = new ArrayList<>();
    private ArrayList<String> lname = new ArrayList<>();
    private ArrayList<String> phoneNo = new ArrayList<>();
    private ArrayList<String> email = new ArrayList<>();
    private ArrayList<Integer> age = new ArrayList<>();
    private ArrayList<Integer> price = new ArrayList<>();
    private int totalPassenger = 0;

    public void addToList(String fname, String lname, String phoneNo,
            String email, int age, int price) {

        this.fname.add(fname);
        this.lname.add(lname);
        this.phoneNo.add(phoneNo);
        this.email.add(email);
        this.age.add(age);
        this.price.add(price);
        totalPassenger++;
    }

    public abstract int calcTotalPrice();

    public int getTotalPassenger() {
        return totalPassenger;
    }

    public ArrayList<String> getFname() {
        return fname;
    }

    public ArrayList<String> getLname() {
        return lname;
    }

    public ArrayList<String> getPhoneNo() {
        return phoneNo;
    }

    public ArrayList<String> getEmail() {
        return email;
    }

    public ArrayList<Integer> getAge() {
        return age;
    }

    public ArrayList<Integer> getPrice() {
        return price;
    }

    public String getFnameAt(int index) {
        try {
            return fname.get(index);
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
            return null;
        }
    }

    public String getLnameAt(int index) {
        try {
            return lname.get(index);
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
            return null;
        }
    }

    public String getPhoneNoAt(int index) {
        try {
            return phoneNo.get(index);
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
            return null;
        }
    }

    public String getEmailAt(int index) {
        try {
            return email.get(index);
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
            return null;
        }
    }

    public Integer getAgeAt(int index) {
        try {
            return age.get(index);
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
            return null;
        }
    }

    public Integer getPriceAt(int index) {
        try {
            return price.get(index);
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
            return null;
        }
    }

    public Object getPhoneAt(int i) {
        return null;
    }

    public String getGenderAt(int i) {
        return null;
    }

    public String getReceiptAt(int i) {
        return null;
    }
}
