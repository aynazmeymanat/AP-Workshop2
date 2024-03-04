public class student {

    private String firstname;

    private String lastname;

    private String id;

    private String grade;

    public student(String firstname, String lastname, String id , String grade) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.id = id;
        if (id.length() != 7) {
            this.id = "invlaid idCode";
        }
        this.grade = grade;
        if (Double.valueOf(grade) < 0 || Double.valueOf(grade) > 20) {
            this.grade = "invalid grade";
        }
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
        if (Double.valueOf(grade) < 0 || Double.valueOf(grade) > 20) {
            this.grade = "invalid grade";
        }
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
        if (id.length()!=7){
            this.id = "invalid" ;
        }
    }



    public void PrintStudentInfo() {
        System.out.println(firstname + " " + lastname + "\nID : " + id + "\nGRADE : " + grade);
        System.out.println();
    }

}


