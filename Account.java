class Account {
        private String owner;
        private int balance;
        private String accountNumber;

        public Account(String owner, int balance, String accountNumber) {
            this.owner = owner;
            this.balance = balance;
            this.accountNumber = accountNumber;
        }

        public String getOwner() {
            return owner;
        }

        public void setOwner(String owner) {
            this.owner = owner;
        }

        public int getBalance() {
            return balance;
        }

        public void setBalance(int balance) {
            this.balance = balance;
        }

        public String getAccountNumber() {
            return accountNumber;
        }

        public void setAccountNumber(String accountNumber) {
            this.accountNumber = accountNumber;
        }

        // Metoda symulująca przelew
        public void transfer(int amount) throws NotEnoughMoneyException {
            if (amount > balance) {
                throw new NotEnoughMoneyException("Niewystarczające środki na koncie.");
            }
            balance -= amount;
            System.out.println("Przelew zakończony sukcesem. Kwota: " + amount);
        }
    }
