public class TicketBooth {

    private String showName;
    private int showHour;
    private int seatsLeft;

    // Creates a booth selling one showing.
    // to-do: store all three values in the instance variables
    public TicketBooth(String newShowName, int newShowHour, int newSeatsLeft) {
        this.showName = newShowName;
        this.showHour = newShowHour;
        this.seatsLeft = newSeatsLeft;
    }

    // Returns the name of the show.
    // to-do: implement getShowName
    public String getShowName() {
        return showName;
    }

    // Returns the hour the show starts, on a 24-hour clock.
    // to-do: implement getShowHour
    public int getShowHour() {
        return showHour;
    }

    // Returns how many seats are still unsold.
    // to-do: implement getSeatsLeft
    public int getSeatsLeft() {
        return seatsLeft;
    }

    // ---------- Part A: write these methods ----------

    // Returns "child", "student", "adult", or "senior" for one age.
    // to-do: implement priceCategory
    public String priceCategory(int age) {
        if (age <= 0) {
            return "Invalid age";
        }
        if ((age <= 12) && (age > 0)) {
            return "child";
        }
        if ((age <= 17) && (age > 12)) {
            return "student";
        }
        if ((age <= 64) && (age > 17)) {
            return "adult";
        }
        return "senior";
    }

    // Returns the price in whole dollars after the matinee and member discounts.
    // to-do: implement ticketPrice
    // child = 8, student = 12, adult = 18, senior = 10
    public int ticketPrice(int age, boolean isMember) {
        int price = 0;
        if (priceCategory(age).equals("child")) {
            price = 8;
        }
        if (priceCategory(age).equals("student")) {
            price = 12;
        }
        if (priceCategory(age).equals("adult")) {
            price = 18;
        }
        if (priceCategory(age).equals("senior")) {
            price = 10;
        }
        if ((showHour >= 12) && (showHour < 16) && (age > 12) && (age <= 64)) {
            price -= 3;
        }
        if (isMember) {
            price -= 2;
        }
        return price;
    }

    // ---------- Part B: each method below compiles and has exactly one bug ----------

    // Returns "morning" before 12, "matinee" from 12 through 16, and "evening" from 17 on.
    public String showtimeLabel() {
        if (showHour >= 17) {
            return "evening";
        }
        if (showHour >= 12) {
            return "matinee";
        }

        return "morning";
    }

    // Returns "red" for 12 and under, "yellow" for 13 through 17, and "green" for 18 and up.
    public String wristband(int age) {
        String color = "green";
        if (age <= 12) {
            color = "red";
        }
        if ((age <= 17) && (age > 12)) {
            color = "yellow";
        }
        return color;
    }

    // Returns 2 for a member and 0 for anyone else.
    public int memberDiscount(boolean isMember) {
        if (isMember) {
            return 2;
        }
        return 0;
    }

    // ---------- Part C: write these with guard clauses ----------

    // Stores the new hour only when it is 10 through 23.
    // to-do: implement setShowHour
    public void setShowHour(int newShowHour) {
        if ((newShowHour >= 10) && (newShowHour <= 23)) {
            newShowHour = showHour;
        } else {
            System.out.println("Invalid show hour: " + newShowHour);
        }

    }

    // Stores the new count only when it is 0 through 200.
    // to-do: implement setSeatsLeft
    public void setSeatsLeft(int newSeatsLeft) {
        if ((newSeatsLeft >= 0) && (newSeatsLeft <= 200)) {
            seatsLeft = newSeatsLeft;
        } else {
            System.out.println("Invalid seat count: " + newSeatsLeft);
        }
    }

    // Stores the new name only when it is present and not empty.
    // to-do: implement setShowName
    public void setShowName(String newShowName) {
        if ((newShowName == null) || (newShowName.length() == 0)) {
            System.out.println("Invalid Show Name");
        } else {
            showName = newShowName;
        }

    }

    // Sells the seats when the group fits. Otherwise prints why and changes nothing.
    // to-do: implement sell
    public void sell(int groupSize) {
        if (groupSize < 1) {
            System.out.println("Invalid Group Size");
        }
        if (groupSize > seatsLeft) {
            System.out.println("Not enough seats for " + groupSize);
        } else {
            seatsLeft = -groupSize;
        }

    }
}
