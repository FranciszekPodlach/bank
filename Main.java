public class Main {
    public static void main(String[] args) {
        Account account = new Account("Jan Kowalski", 500, "1234567890");

        try {
            // Próba wykonania przelewu z wartością większą niż dostępne środki
            account.transfer(600);
        } catch (NotEnoughMoneyException e) {
            System.out.println("Wyjątek: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Wystąpił nieoczekiwany wyjątek: " + e.toString());
        } finally {
            System.out.println("Aktualny stan konta: " + account.getBalance());
        }
    }
}
