public class GymMembershipTester {
    public static void main(String[] args) {
        GymMembership gm1 = new GymMembership();
        gm1.setGymDetails("Andrew", "Premium", "Evening", 12);
        gm1.printDetails();
        System.out.println("1==============================");
        double fee1 = gm1.calculateFee();
        System.out.println("Calculated Membership Fee:(BDT) " + fee1);
        System.out.println("2==============================");
        gm1.printDetails();
        System.out.println("3==============================");
        GymMembership gm2 = new GymMembership();
        gm2.setGymDetails("Daniel", "Premium", "Morning", 18);
        double fee2 = gm2.calculateFee();
        System.out.println("Calculated Membership Fee:(BDT) " + fee2);
        System.out.println("4==============================");
        gm2.printDetails();
        System.out.println("5==============================");
        GymMembership gm3 = new GymMembership();
        gm3.setGymDetails("Pamella", "Standard", "Morning", 6);
        @SuppressWarnings("unused")
        double fee3 = gm3.calculateFee();
        gm3.printDetails();
    }
}