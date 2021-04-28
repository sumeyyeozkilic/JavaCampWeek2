public class Main {
    public static void main(String[] args) {
        Course course1=new Course("JAVA+REACT", "Engin DEMİROĞ", 32);
        Course course2=new Course("C# +ANGULAR","Engin Demiroğ",10);

        Course[] courses={course1, course2};

        System.out.println("Courses: ");
        for(Course course : courses){
            System.out.println(course.courseName);
        }

        CourseManager courseManager=new CourseManager();
        courseManager.Add(course1);
        courseManager.Add(course2);





    }
}
