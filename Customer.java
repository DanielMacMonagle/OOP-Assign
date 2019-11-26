public class Customer {

    String forename, surname, DateOfBirth, street, town, county, gender, email;
    int houseNo, contactNo;

    public Customer(){
        this.forename = "Unknown";
        this.surname = "Unknown";
        this.DateOfBirth = "Unknown";
        this.street = "Unknown";
        this.town = "Unknown";
        this.county = "Unknown";
        this.gender = "Unknown";
        this.email = "Unknown";
        this.houseNo = 0;
        this.contactNo = 0;
    }

    public Customer(String forename, String surname, String DateOfBirth, String street, String town, String county,
                    String gender, String email){
        this.forename = forename;
        this.surname = surname;
        this.DateOfBirth = DateOfBirth;
        this.street = street;
        this.town = town;
        this.county = county;
        this.gender = gender;
        this.email = email;
        this.houseNo = houseNo;
        this.contactNo = contactNo;
    }

    public String getForename(){
        return forename;
    }

    public void setForename(){
        this.forename = forename;
    }

    public String getSurname(){
        return surname;
    }

    public void setSurname(){
        this.surname = surname;
    }

    public String getDateOfBirth(){
        return DateOfBirth;
    }

    public void DateOfBirth(){
        this.DateOfBirth = DateOfBirth;
    }

    public int getHouseNo(){
        return houseNo;
    }

    public void setHouseNo(){
        this.houseNo = houseNo;
    }

    public String getStreet(){
        return street;
    }

    public void setStreet(){
        this.street = street;
    }

    public String getTown(){
        return town;
    }

    public void setTown(){
        this.town = town;
    }

    public String getCounty(){
        return county;
    }

    public void setCounty(){
        this.county = county;
    }

    public int getContactNo(){
        return contactNo;
    }

    public void setContactNo(){
        this.contactNo = contactNo;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(){
        this.email = email;
    }

    public String getGender(){
        return gender;
    }

    public void setGender(){
        this.gender = gender;
    }

    public String toString(){
        return "Forename: " + getForename() +
                "\nSurname: " + getSurname() +
                "\nGender: " + getGender() +
                "\nDate of Birth: " + getDateOfBirth() +
                "\nHouse Number: " + getHouseNo() +
                "\nStreet: " + getStreet() +
                "\nTown: " + getTown() +
                "\nCounty: " + getCounty() +
                "\nContact Number: " + getContactNo() +
                "\nEmail: " + getEmail();

    }

}
