import java.util.Scanner;

class StudentInfo {
    private int intAge;
    private double doubleAllowance;
    private String strName;
    private String strAddress;
    private boolean boolFlag;

    public int getAge() {
        return intAge;
    }

    public double getAllowance() {
        return doubleAllowance;
    }

    public String getName() {
        return strName;
    }

    public String getAddress() {
        return strAddress;
    }

    public boolean getFlag() {
        return boolFlag;
    }

    public void setInfo(int intAge, double doubleAllowance, String strName, String strAddress, boolean boolFlag) {
        this.intAge = intAge;
        this.doubleAllowance = doubleAllowance;
        this.strName = strName;
        this.strAddress = strAddress;
        this.boolFlag = boolFlag;
    }
}

class Extraction {

    String extractFirst(String name) {
        int lastSpaceIndex = name.lastIndexOf(' ');
        String extractedName = name.substring(0, lastSpaceIndex);
        return extractedName;
    }

    String extractLast(String name) {
        int lastSpaceIndex = name.lastIndexOf(' ');
        String extractedName = name.substring(lastSpaceIndex + 1);
        return extractedName;
    }

    String extractCity(String address) {
        int lastCommaIndex = address.lastIndexOf(',');
        String extractedCity = address.substring(lastCommaIndex + 2);
        return extractedCity;
    }
}

class GroupClass {
    class Greetings {
        String strName;

        Greetings(String strName) {
            this.strName = strName;
        }

        void greet() {
            System.out.printf("\n\tMember Inner Class: Welcome to the system, %s!\n", this.strName);
        }
    }

    static class AgeAdd {
        int intAge;

        AgeAdd(int intAge) {
            this.intAge = intAge;
        }
        
        int addToAge() {
            return (this.intAge + 10);
        }
    }
}

class FinalActivity1 {
    public static StudentInfo inputs() {
        Scanner scnInput = new Scanner(System.in);
        boolean boolFlag = false;

        System.out.println("\n\n\tPlease enter the following information: ");
        System.out.print("\tAge: ");
        String strAge = scnInput.nextLine();

        System.out.print("\tMonthly Allowance: ");
        String strAllowance = scnInput.nextLine();

        System.out.print("\tName (FirstName LastName): ");
        String strName = scnInput.nextLine();

        System.out.print("\tComplete Address: ");
        String strAddress = scnInput.nextLine();
        StudentInfo info = new StudentInfo();

        int intAge = 0;
        double doubleAllowance = 0;

        try {
            intAge = Integer.parseInt(strAge);
            doubleAllowance = Double.parseDouble(strAllowance);

            System.out.println("\n\n\tNo Error Detected! Your input follow the format!");
        }
        catch (NumberFormatException e) {
            System.out.println("\n\n\tError Detected! You entered an invalid number");
            boolFlag = true;
        }
        finally {
            info.setInfo(intAge, doubleAllowance, strName, strAddress, boolFlag);
            scnInput.close();
        }

        return info;
    }

    public static int numCharacters(String strInput) {
        return strInput.length();
    } 

    public static String upperCase(String strInput) {
        return strInput.toUpperCase();
    }

    public static String lowerCase(String strInput) {
        return strInput.toLowerCase();
    }

    public static void main(String[] args) {
        StudentInfo printer = inputs();
        Integer convertedAge = printer.getAge();
        Double convertedAllowance = printer.getAllowance();

        System.out.printf("\n\n\t----- Converted Value -----");
        System.out.printf("\n\tAge: %d", convertedAge);
        System.out.printf("\n\tMonthly Allowance: %.2f", convertedAllowance);

        String strName = printer.getName();
        String strAddress = printer.getAddress();
        
        int charInName = numCharacters(strName);
        int charInAddress = numCharacters(strAddress);

        System.out.printf("\n\n\t----- Number of Characters -----");
        System.out.printf("\n\tNumber of characters in name (excluding spaces): %s", charInName);
        System.out.printf("\n\tNumber of characters in address (excluding spaces): %s", charInAddress);

        String strUpperName = upperCase(strName);
        String strUpperAddress = upperCase(strAddress);

        String strLowerName = lowerCase(strName);
        String strLowerAddress = lowerCase(strAddress);

        System.out.printf("\n\n\t----- Uppercase Version of Details -----");
        System.out.printf("\n\tName: %s", strUpperName);
        System.out.printf("\n\tAddress: %s", strUpperAddress);

        System.out.printf("\n\n\t----- Lowercase Version of Details -----");
        System.out.printf("\n\tName: %s", strLowerName);
        System.out.printf("\n\tAddress: %s", strLowerAddress);

        Extraction extractor = new Extraction();

        String strFirstName = extractor.extractFirst(strName);
        String strLastName = extractor.extractLast(strName);
        String strCity = extractor.extractCity(strAddress);

        System.out.printf("\n\n\t----- Extracted Details -----");
        System.out.printf("\n\tFirst Name: %s", strFirstName);
        System.out.printf("\n\tLast Name: %s", strLastName);
        System.out.printf("\n\tCity: %s", strCity);

        boolean aChecker = (strName.contains("a") || strName.contains("A"));
        
        System.out.printf("\n\n\t----- Check for 'a' -----");
        System.out.printf("\n\tContains letter in 'a' in name: %b", aChecker);

        GroupClass outerClass = new GroupClass();
        GroupClass.Greetings innerClassGreetings = outerClass.new Greetings(strName);
        GroupClass.AgeAdd innerClassAddition = new GroupClass.AgeAdd(convertedAge);

        System.out.printf("\n\n\t----- Inner Class Outputs -----");
        innerClassGreetings.greet();
        int intAddedAge = innerClassAddition.addToAge();
        System.out.printf("\tStatic Class Computation: %d + 10 = %d", convertedAge, intAddedAge);
    
        String boolFlag = (printer.getFlag()) ? "The exception is used, there's an invalid input" : "The exception was not used, input is valid" ;

        System.out.printf("\n\n\t----- Final Summary -----");
        System.out.printf("\n\tName: %s", strName);
        System.out.printf("\n\tAddress: %s", strAddress);
        System.out.printf("\n\n\tExtracted Name: ");
        System.out.printf("\n\t\tFirst Name: %s", strFirstName);
        System.out.printf("\n\t\tLast Name: %s", strLastName);
        System.out.printf("\n\tExtracted City: %s", strCity);
        System.out.printf("\n\n\tConverted Numeric Values: ");
        System.out.printf("\n\t\tAge (integer): %d", convertedAge);
        System.out.printf("\n\t\tMonthly Allowance (double): %.2f", convertedAllowance);
        System.out.printf("\n\n\tInner Class Computation: ");
        System.out.printf("\n\t\tUpdated Age (Static Inner Class): %d", intAddedAge);
        System.out.printf("\n\tConfirmation that exception handling is used: %s", boolFlag);
        System.out.printf("\n\n\t----- Program Finished Successfully -----\n\n");
    }
}