/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package catcafeproject;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Crestfall
 */
public class CatCafe {

    // initialize ArrayList to contain cats and dietaries //
    private static final ArrayList<Cat> catList = new ArrayList();
    private static final ArrayList<Dietary> dietList = new ArrayList();

    public static void main(String[] args) {

        // initializations //
        Date date = new Date();
        Timestamp timestamp = new Timestamp(date.getTime());
        String time = timestamp.toString();

        Dietary f1 = new Dietary("whiskas", "10:00");
        Dietary f2 = new Dietary("catnip", "17:00");
        Dietary f3 = new Dietary("catviera", "21:00");

        Cat c1 = new Cat("C1T3R", "Nigga", time);
        c1.setCatDiet(f1);
        c1.setCatDiet(f2);
        c1.setCatDiet(f3);

        System.out.println(c1.toString());
        c1.printFeedingSchedule();

        // CMD Bootleg 1.0 by Davey //
        // Initial Creation //
        Scanner scanner = new Scanner(System.in);
        String command = "help";

        // Commands
        while (true) {
            switch (command) {
                // wrong command output //
                default:
                    System.out.println("Unknown command.");
                    System.out.println("Refer to 'help' for list of commands.");
                    break;
                // shows all commands //   
                case "help":
                    System.out.println("help: Show all commands.");
                    System.out.println("credits: Show credits.");
                    System.out.println("cat_add: Add a new cat.");
                    System.out.println("cat_edit: Edit a cat's data.");
                    System.out.println("cat_del: Delete a cat.");
                    System.out.println("cat_list: Show a cat's data.");
                    break;
                // maybe i should credit stack overflow too //
                case "credits":
                    System.out.println("Cat Cafe");
                    System.out.println("by: Davey, Ray, Hanwin, Rex, Wira");
                    break;
            }
            System.out.println("");
            System.out.print("Command: ");
            command = scanner.nextLine();
        }
    }
}
