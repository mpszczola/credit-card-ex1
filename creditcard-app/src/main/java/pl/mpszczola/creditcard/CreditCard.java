class CreditCard {
    
    private boolean blocked = false;
    private double limit=0; 
    
    public void assignLimit(double money) {
        this.limit=money;
    }
    
    public double getLimit() {
        return 2000;
    }
    
    public void block() {
        this.blocked = true;
    }
    
    public boolean isBlocked() {
        return this.blockade;
    }
}