public class RentACar {
    public static void main(String[] args) {
        int age = 21;
        boolean hasDriversLicense = true;
        int carsAvailable = 0;
        boolean hasDUI = true;
        boolean hasInternationalLicense = true;
        // !
        if(age >= 21) {
            if((hasDriversLicense || hasInternationalLicense) && carsAvailable > 0 && !hasDUI) {
                System.out.println("Congrats, you're eligible for a car rental");
            }
            else if(!hasDriversLicense || !hasInternationalLicense) {
                System.out.println("Sorry, no license, no car.");
            }
            else if(hasDUI) {
                System.out.println("No drinky drivy");
            }
            else if(carsAvailable < 1) {
                System.out.println("Sorry, no cars available at present");
            }
            else {
                System.out.println("Sorry, we can't give you a car, and don't have a good reason");
            }
        }
        else {
            System.out.println("Sorry, your too young to rent a car with us");
        }
    }
}