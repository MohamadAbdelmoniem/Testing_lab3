package Lab3;

public class ATM {
    public float UserBalance = 0;
    public boolean CanMakeTransaction = false;
    public boolean CardOkay = true;
    public boolean PasswordCheck = true;

    public String ValidateCard() {
        if (CardOkay) {
            return "Card Okay by bank";
        } else {
            return "Card not validated";
        }
    }

     public String enterPassword() {
            if (PasswordCheck == true) {
                CanMakeTransaction = true;
                return "Welcome";
            } else {
                return "Wrong password! Please enter password again";
            }
        }
        public String deposit(float Amount){
            if (Amount >= 50 && Amount <= 20000) {
                UserBalance += Amount;
                return "Successful deposit";
            } else {
                return "Cant deposit money less than 50 and more than 20000 ";
            }
        }
        public String withdraw(float amount){
            if (amount < UserBalance) {
                UserBalance -= amount;
                return "Successful withdraw";
            } else {
                return "Not enough balance";
            }
        }


    }
