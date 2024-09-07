package Week2.assignment;

public class TestRental {
    public static void main(String[] args) {
        Rental rental1 = new Rental();
        rental1.id = 1;
        rental1.memberName = "John Doe";
        rental1.gameName = "FIFA 23";
        rental1.rentalDays = 3;
        rental1.pricePerDay = 15000;
        rental1.displayData();
    }
}
