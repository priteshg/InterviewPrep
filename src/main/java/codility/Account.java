package codility;

public class Account {
    private double balance;
    private double overDraftLimit;

    public Account(double overDraftLimit) {
        this.overDraftLimit = overDraftLimit > 0 ? overDraftLimit : 0;
        System.out.println();
    }


}
