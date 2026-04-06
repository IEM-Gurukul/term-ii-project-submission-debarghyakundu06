public class StudentMember extends Member {
    private String course;

    public StudentMember(int memberId, String name, String course) {
        super(memberId, name); // calling parent constructor
        this.course = course;
    }

    @Override
    public void displayMember() {
        super.displayMember(); // call parent method
        System.out.println("Course: " + course);
    }
}
