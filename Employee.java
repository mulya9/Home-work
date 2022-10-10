public class Employee {
    private String full_name;
    private String job_title;
    private String email;
    private String telephone;
    private int age;
    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getJob_title() {
        return job_title;
    }

    public void setJob_title(String job_title) {
        this.job_title = job_title;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }




    public Employee(String full_name, String job_title, String email, String telephone, int age) {
        this.full_name = full_name;
        this.job_title = job_title;
        this.email = email;
        this.telephone = telephone;
        this.age = age;
    }
}
