package src;

public class switchgiris {
    public static void main(String[] args) {
        int day = 3;

       /* if(day == 1) {
            System.out.println("Bugun Pazartesi");
        } else if (day == 2) {
            System.out.println("Bugun Sali");
        } else if (day == 3) {
            System.out.println("Bugun Carsamba");
        } else if (day == 4) {
            System.out.println("Bugun Persembe");
        } else if (day == 5) {
            System.out.println("Bugun Cuma");
        } else if (day == 6) {
            System.out.println("Bugun Cumartesi");
        } else if (day == 7) {
            System.out.println("Bugun Pazar");
        }
        else {
            System.out.println("Hatali giris...");
        } */
        switch (day) {
            case 1:
                System.out.println("Bugun Pazartesi");
                break;
            case 2:
                System.out.println("Bugun Sali");
                break;
            case 3:
                System.out.println("Bugun Carsamba");
                break;
            case 4:
                System.out.println("Bugun Persembe");
                break;
            case 5:
                System.out.println("Bugun Cuma");
                break;
            case 6:
                System.out.println("Bugun Cumartesi");
                break;
            case 7:
                System.out.println("Bugun Pazzar");
                break;
            default:
                System.out.println("Hatali Giris");
        }

    }
}
