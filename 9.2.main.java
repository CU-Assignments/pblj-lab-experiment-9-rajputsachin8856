public class Main {
    public static void main(String[] args) {
        StudentDao dao = new StudentDao();

        // Create
        Student s1 = new Student("Sameer", 22);
        dao.createStudent(s1);
        System.out.println("Student Created: " + s1.getId());

        // Read
        Student retrieved = dao.getStudent(s1.getId());
        System.out.println("Retrieved: " + retrieved.getName() + ", " + retrieved.getAge());

        // Update
        retrieved.setAge(23);
        dao.updateStudent(retrieved);
        System.out.println("Updated Age to: " + retrieved.getAge());

        // Delete
        dao.deleteStudent(retrieved.getId());
        System.out.println("Student Deleted: " + retrieved.getId());
    }
}
