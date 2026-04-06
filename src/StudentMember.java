public class StudentMember extends Member {

    private String course;

    public StudentMember(int memberId, String name, String course) {
        super(memberId, name);
        this.course = course;
    }

    @Override
    public void displayMember() {
        super.displayMember();
        System.out.println("Course: " + course);
    }
}
