// import java.util.HashMap;
// import java.util.LinkedList;
// import java.util.Map;
// import java.util.Random;
// import java.util.Scanner;

// public class main_4 {
//     public static void main(String[] args) {
//         menuMain();
//     }
//      public static Object[] consoleAdd() {
//         Scanner iScanner = new Scanner(System.in, "cp866");

//         Object[] arrObj = new Object[2];
//         System.out.print("Input name : ");
//         String str = iScanner.nextLine();
//         System.out.print("Input number: ");
//         Integer number = iScanner.nextInt();
//         arrObj[0] = str;
//         arrObj[1] = number;
//         return arrObj;
//     }
//     public static void phoneBook(HashMap<String, LinkedList<Integer>> bookPhones) {
//         Object[] arrObj = new Object[2];
//         LinkedList<Integer> listPhoneTemp = new LinkedList<>();
//         arrObj = consoleAdd();
//         if (bookPhones.containsKey(arrObj[0])) {
//             bookPhones.get(arrObj[0]).add((int) arrObj[1]);
//         } else {
//             listPhoneTemp.add((int) arrObj[1]);
//             bookPhones.put(arrObj[0].toString(), listPhoneTemp);
//         }   
//     }

//     public static void menuMain() {
//         Scanner iScanner = new Scanner(System.in, "cp866");
//         HashMap<String, LinkedList<Integer>> bookPhones = new HashMap<>();
//         while (true) {
//             printMenu();
//             String str = iScanner.nextLine();
//             if (str.equals("3")) {
//                 break;
//             } else if (str.equals("1")) {
//                 phoneBook(bookPhones);
//             } else if (str.equals("2")) {
//                 System.out.println(bookPhones);
//             }
//         }
//         iScanner.close();
//     }

//     public static void printMenu() {
//         System.out.println();
//         System.out.println("1. Добавить контакт");
//         System.out.println("2. Вывести все контакты");
//         System.out.println("3. Выход");
//         System.out.println();
//     }
// }