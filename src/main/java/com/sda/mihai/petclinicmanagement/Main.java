package com.sda.mihai.petclinicmanagement;

import com.sda.mihai.petclinicmanagement.menu.UserOption;
import com.sda.mihai.petclinicmanagement.model.Veterinarian;
import com.sda.mihai.petclinicmanagement.utils.SessionManager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SessionManager.getSessionFactory();


        Scanner scanner = new Scanner(System.in);

        UserOption userOption;
        do {
            UserOption.printAllOptions();
            System.out.println("Please select an option!");
            try {
                int numericOption = Integer.parseInt(scanner.nextLine());
                userOption = UserOption.findUserOption(numericOption);
            } catch (NumberFormatException e) {
                userOption = UserOption.UNKNOWN;
            }

            switch (userOption) {
                case CREATE_VETERINARIAN:
                    System.out.println("Not implemented yet on veterinarians");
                    break;
                case SHOW_ALL_VETERINARIANS:
                    System.out.println("Nothing to show yet on veterinarians");
                    break;
                case UPDATE_VETERINARIAN:
                    System.out.println("Nothing to update yet on veterinarians");
                    break;
                case CREATE_PET:
                    System.out.println("Not implemented yet on pets");
                    break;
                case SHOW_ALL_PETS:
                    System.out.println("Nothing to show yet on pets");
                    break;
                case UPDATE_PET:
                    System.out.println("Nothing to update yet on pets");
                    break;
                case CREATE_CONSULT:
                    System.out.println("Not implemented yet on consults");
                    break;
                case SHOW_ALL_CONSULTS:
                    System.out.println("Nothing to show yet on consults");
                    break;
                case UPDATE_CONSULT:
                    System.out.println("Nothing to update yet on consults");
                    break;
                case EXIT:
                    System.out.println("Goodbye!");
                    break;
                case UNKNOWN:
                    System.out.println("Option unknown");
                    break;
                default:
                    System.out.println("User option " + userOption + " is not implemented");
                    break;
            }
        } while (userOption != UserOption.EXIT);
        SessionManager.shutDown();
    }
}
