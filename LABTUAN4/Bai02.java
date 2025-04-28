class Person {
    private String name;
    private String address;

    // Constructor có tham số
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    // Getter cho name
    public String getName() {
        return name;
    }

    // Getter cho address
    public String getAddress() {
        return address;
    }

    // Setter cho address
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person[name=" + name + ", address=" + address + "]";
    }
}

// 2. Định nghĩa lớp Student thừa kế từ Person
class Student extends Person {
    private String program;
    private int year;
    private double fee;

    // Hoàn thiện constructor có tham số (name, address, program, year, fee)
    public Student(String name, String address, String program, int year, double fee) {
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    // Hoàn thiện getter cho program
    public String getProgram() {
        return program;
    }

    // Hoàn thiện setter cho program
    public void setProgram(String program) {
        this.program = program;
    }

    // Hoàn thiện getter cho year
    public int getYear() {
        return year;
    }

    // Hoàn thiện setter cho year
    public void setYear(int year) {
        this.year = year;
    }

    // Hoàn thiện getter cho fee
    public double getFee() {
        return fee;
    }

    // Hoàn thiện setter cho fee
    public void setFee(double fee) {
        this.fee = fee;
    }

    // Hoàn thiện phương thức toString() cho Student
    @Override
    public String toString() {
        return "Student: " + super.toString() + ", program=" + program + ", year=" + year + ", fee=" + fee;
    }
}

// 3. Định nghĩa lớp Staff thừa kế từ Person
class Staff extends Person {
    private String school;
    private double pay;

    // Hoàn thiện constructor có tham số (name, address, school, pay)
    public Staff(String name, String address, String school, double pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    // Hoàn thiện getter cho school
    public String getSchool() {
        return school;
    }

    // Hoàn thiện setter cho school
    public void setSchool(String school) {
        this.school = school;
    }

    // Hoàn thiện getter cho pay
    public double getPay() {
        return pay;
    }

    // Hoàn thiện setter cho pay
    public void setPay(double pay) {
        this.pay = pay;
    }

    // Hoàn thiện phương thức toString() cho Staff
    @Override
    public String toString() {
        return "Staff: " + super.toString() + ", school=" + school + ", pay=" + pay;
    }
}

// 4. Tự hoàn thiện: Lớp Main để kiểm tra
public class Bai02 {
    public static void main(String[] args) {
        Person person = new Person("Nguyen Van Phep", "123 Le Van Sy");
        System.out.println(person.toString());

        Student student = new Student("Nguyen Thi No", "456 Cong Hoa", "Computer Science", 2, 5000.0);
        System.out.println(student.toString());

        Staff staff = new Staff("Anh Huynh", "789 Cao Thang", "Tech University", 60000.0);
        System.out.println(staff.toString());
    }
}
