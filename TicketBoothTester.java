public class TicketBoothTester {
    public static void main(String[] args) {
        TicketBooth matinee = new TicketBooth("Dune", 14, 12);
        TicketBooth evening = new TicketBooth("Heat", 19, 40);

        // Part A. Uncomment each group as you finish that method.

        System.out.println("seats left: " + matinee.getSeatsLeft());

        System.out.println("priceCategory(12): " + evening.priceCategory(12));
        System.out.println("priceCategory(13): " + evening.priceCategory(13));
        System.out.println("priceCategory(65): " + evening.priceCategory(65));

        System.out.println("evening ticketPrice(40, false): " + evening.ticketPrice(40, false));
        System.out.println("matinee ticketPrice(15, false): " + matinee.ticketPrice(15, false));
        System.out.println("");

        // Part B. Finish the constructor first. Then each call below shows
        // its method's bug. Run it before you fix anything.

        System.out.println("evening showtimeLabel(): " + evening.showtimeLabel());
        System.out.println("wristband(10): " + evening.wristband(10));
        System.out.println("memberDiscount(false): " + evening.memberDiscount(false));
        System.out.println("");

        // Part C. Uncomment each group as you finish that method.

        matinee.setShowHour(9);
        System.out.println("after setShowHour(9): " + matinee.getShowHour());
        matinee.setShowHour(10);
        System.out.println("after setShowHour(10): " + matinee.getShowHour());

        matinee.sell(13);
        System.out.println("after sell(13): " + matinee.getSeatsLeft());
    }
}
