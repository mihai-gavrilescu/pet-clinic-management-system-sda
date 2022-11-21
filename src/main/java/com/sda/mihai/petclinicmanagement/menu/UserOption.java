package com.sda.mihai.petclinicmanagement.menu;

public enum UserOption {
    CREATE_VETERINARIAN(1, "Create veterinarian"),
    SHOW_ALL_VETERINARIANS(2, "Display all veterinarians"),
    UPDATE_VETERINARIAN(3, "Update veterinarian"),

    CREATE_PET(4, "Create pet"),
    SHOW_ALL_PETS(5, "Display all pets"),
    UPDATE_PET(6, "Update pet"),

    CREATE_CONSULT(7, "Create consult"),
    SHOW_ALL_CONSULTS(8, "Display all consults"),
    UPDATE_CONSULT(9, "Update consult"),

    EXIT(99, "Exit"),
    UNKNOWN(100, "Unknown option");

    private int numericOption;
    private String displayValue;

    UserOption(int numericOption, String displayValue) {
        this.numericOption = numericOption;
        this.displayValue = displayValue;
    }

    public int getNumericOption() {
        return numericOption;
    }

    public void setNumericOption(int numericOption) {
        this.numericOption = numericOption;
    }

    public String getDisplayValue() {
        return displayValue;
    }

    public void setDisplayValue(String displayValue) {
        this.displayValue = displayValue;
    }

    public static void printAllOptions() {
        for (UserOption value : values()) {
            if (value != UNKNOWN) {
                System.out.println(value.getNumericOption() + " - " + value.displayValue);
            }
        }
    }

    public static UserOption findUserOption(int numericValue) {
        for (UserOption value : values()) {
            if (value.getNumericOption() == numericValue) {
                return value;
            }
        }
        return UNKNOWN;
    }
}
