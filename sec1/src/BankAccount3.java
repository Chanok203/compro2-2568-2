import java.util.Scanner;

class Account {
    String name;
    String code;
    double balance;
    boolean active;

    Account(String name, String code, double balance) {
        this.name = name;
        this.code = code;
        this.balance = balance;
        this.active = true;
        System.out.println("Open account");
    }

    void printInfo() {
        String fmt = "%s, %s, %s, %s";
        String isActive = (this.active) ? "active" : "inactive";
        String line = String.format(fmt,
                this.name, this.code, this.balance, isActive);
        System.out.println(line);
    }

    double checkBalance() {
        return this.balance;
    }

    void closeAccount() {
        this.active = false;
        this.printInfo();
    }

    boolean deposit(double n) {
        if (!this.active) {
            return false;
        }
        this.balance = this.balance + n;
        System.out.print(this.balance + " ");
        return true;
    }

    boolean withdrawn(double n) {
        if (!this.active) {
            return false;
        }

        if (this.balance < n) {
            return false;
        }

        this.balance = this.balance - n;
        System.out.print(this.balance + " ");
        return true;
    }
}

class Saving extends Account {
    String id;
    String tel;
    boolean promptPay;

    Saving(String name, String code, double balance) {
        super(name, code, balance);
        this.promptPay = false;
        System.out.println("Saving account");
    }

    @Override
    void printInfo() {
        super.printInfo();

        if (!this.promptPay) {
            System.out.println("no PromptPay");
            return;
        }

        String line = "PromptPay";
        if (this.id != null) {
            line = line + ", " + this.id;
        }
        if (this.tel != null) {
            line = line + ", " + this.tel;
        }
        System.out.println(line);
    }

    boolean openPromptPay(int type, String value) {
        if (type == 1) {
            if (value.length() != 13) {
                return false;
            }
            this.id = value;
            this.promptPay = true;
        } else if (type == 2) {
            if (value.length() != 10) {
                return false;
            }
            this.tel = value;
            this.promptPay = true;
        }
        return this.promptPay;
    }
}

class FixedDeposit extends Account {
    double fixedAmount;

    FixedDeposit(String name, String code, double balance, double fixedAmount) {
        super(name, code, balance);
        this.fixedAmount = fixedAmount;
        System.out.println("FixedDeposit account with " + this.fixedAmount);
    }

    @Override
    boolean deposit(double n) {
        if (n < this.fixedAmount) {
            System.out.print("deposit less than " + this.fixedAmount + " ");
            return false;
        }
        return super.deposit(n);
    }
}

class CurrentAccount extends Account {
    double overDraft;

    CurrentAccount(String name, String code, double balance, double overDraft) {
        super(name, code, balance);
        this.overDraft = overDraft;
        System.out.println("Current account with overdraft " + this.overDraft);
    }

    @Override
    boolean withdrawn(double n) {
        if (!this.active) {
            return false;
        }

        if (this.balance - n < -this.overDraft) {
            return false;
        }

        this.balance = this.balance - n;
        String line = this.balance + " ";
        if (this.balance < 0) {
            line = line + "overdraft ";
        }
        System.out.print(line);
        return true;
    }
}

public class BankAccount3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Saving sAcc = null;
        FixedDeposit fAcc = null;
        CurrentAccount cAcc = null;

        for (int t = 1; t <= 3; t++) {
            String name = scan.nextLine();
            String code = scan.nextLine();
            double money1 = scan.nextDouble();

            if (t == 1) {
                scan.nextLine();
                sAcc = new Saving(name, code, money1);
            } else if (t == 2) {
                double money2 = scan.nextDouble();
                scan.nextLine();
                fAcc = new FixedDeposit(name, code, money1, money2);
            } else if (t == 3) {
                double money2 = scan.nextDouble();
                scan.nextLine();
                cAcc = new CurrentAccount(name, code, money1, money2);
            }
        }

        int N = scan.nextInt();
        for (int i = 0; i < N; i++) {
            double n;
            boolean res;

            int type = scan.nextInt();
            Account account = null;
            if (type == 1) {
                account = sAcc;
            } else if (type == 2) {
                account = fAcc;
            } else if (type == 3) {
                account = cAcc;
            }

            int menu = scan.nextInt();
            switch (menu) {
                case 1:
                    account.printInfo();
                    break;
                case 2:
                    double balance = account.checkBalance();
                    System.out.println(balance);
                    break;
                case 3:
                    account.closeAccount();
                    break;
                case 4:
                    n = scan.nextDouble();
                    res = account.deposit(n);
                    System.out.println(res);
                    break;

                case 5:
                    n = scan.nextDouble();
                    res = account.withdrawn(n);
                    System.out.println(res);
                    break;
                default:
                    break;
            }
        }
    }
}
