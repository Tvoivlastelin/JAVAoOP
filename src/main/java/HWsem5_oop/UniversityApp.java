//package HWsem5_oop;
//
//import HWsem5_oop.controllers.GroupController;
//import HWsem5_oop.view.GroupView;
//import HWsem5_oop.view.SortType;
//import HWsem5_oop.view.UserView;
//
//import java.util.Scanner;
//
//public class UniversityApp implements UserView {
//    @SuppressWarnings("InfiniteLoopStatement")
//
//    public void run() {
//        Scanner scanner = new Scanner(System.in);
//        while (true) {
//            String command = scanner.nextLine();
//            String[] commandParts = command.split(" ");
//            switch (commandParts[0]) {
//                case "/get-student":
//                    if (commandParts.length == 1) {
//                        view.sendOnConsole();
//                    } else if (commandParts[1].matches("\\d+")) {
//                        int id = Integer.parseInt(commandParts[1]);
//                        sendOnConsole(SortType.ID);
//                    } else {
//                        String name = commandParts[1].replace("_", " ");
//                        sendOnConsole(SortType.NAME);
//                    }
//                    break;
//                case "/get-group":
//                    // Получить группу
//                    String groupName = commandParts[1];
//                    break;
//                case "/create-student":
//                    // Создать студента
//                    String name = commandParts[1].replace("_", " ");
//                    int age = Integer.parseInt(commandParts[2]);
//                    String group = commandParts[3];
//                    break;
//                case "/delete-teacher":
//                    // Удалить учителя
//                    String teacherName = commandParts[1].replace("_", " ");
//                    break;
//                case "/set-group-student-by-id":
//                    // Установить группу студента по id
//                    int studentId = Integer.parseInt(commandParts[1]);
//                    String newGroup = commandParts[2];
//                    break;
//                default:
//                    System.out.println("Неизвестная команда");
//            }
//        }
//    }
//
//    @Override
//    public void sendOnConsole() {
//
//    }
//
//    @Override
//    public void sendOnConsole(SortType sortType) {
//
//    }
//
//    @Override
//    public void create(String fullName, Integer age, String phoneNumber, String groupTitle) {
//
//    }
//
//    @Override
//    public void removeUser(String fullName) {
//
//    }
//}