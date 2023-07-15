package HWsem5_oop;

import HWsem5_oop.controllers.GroupController;
import HWsem5_oop.controllers.StudentController;
import HWsem5_oop.controllers.TeacherController;
import HWsem5_oop.repositories.StudentRepository;
import HWsem5_oop.repositories.TeacherRepository;
import HWsem5_oop.services.GroupService;
import HWsem5_oop.services.StudentService;
import HWsem5_oop.services.TeacherService;
import HWsem5_oop.view.GroupView;
import HWsem5_oop.view.SortType;
import HWsem5_oop.view.StudentView;
import HWsem5_oop.view.TeacherView;

public class Main {

    private static StudentRepository studentRepository;
    private static StudentService studentService;
    private static StudentController studentController;
    private static TeacherRepository teacherRepository;
    private static TeacherService teacherService;
    private static TeacherController teacherController;

    public static void main(String[] args) {

        StudentView view = getStudentController();
        TeacherView view1 = getTeacherController();
        GroupView groupView = getGroupView();


//        -------------------------------------------------------------------------
        view1.create("Ivan Ivanov", 55, "0984", "11Б");
        view1.create("Kolia Pupkin", 44, "024321", "11А");
        view1.create("Petr Holiday", 66, "03543", "10А");
        view.create("Ivan Morozov", 18, "02", "11Б");
        view.create("Ivan Morozov", 18, "02", "11Б");
        view.create("Petr Vorobev", 19, "03", "10А");
        view.create("Sidor Sidorov", 20, "112", "10А");
        view.create("Elena Ivanova", 19, "911", "10А");
        view.create("Anna Morozova", 17, "01", "11А");

//        UniversityApp uny = new UniversityApp();
//        uny.run();
        view1.sendOnConsole(SortType.AGE);
        groupView.printAllFromGroup("10А");
        view.sendOnConsole();
        view.sendOnConsole(SortType.NAME);
        view.sendOnConsole(SortType.ID);

        view.removeUser("Ivan Morozov");

        view.sendOnConsole();

    }

    private static StudentView getStudentController() {
        studentRepository = new StudentRepository();
        studentService = new StudentService(studentRepository);
        studentController = new StudentController(studentService);
        return new StudentView(studentController);
    }
    private static TeacherView getTeacherController() {
        teacherRepository = new TeacherRepository();
        teacherService = new TeacherService(teacherRepository);
        teacherController= new TeacherController(teacherService);
        return new TeacherView(teacherController);
    }

    private static GroupView getGroupView() {
        GroupService groupService = new GroupService(studentService,teacherService);
        GroupController groupController = new GroupController(groupService);
        return new GroupView(groupController);
    }




}
