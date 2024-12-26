package entities;


public class Affiliate {
    private long affiliateId;
    private String name;
    private String email;
    private PaymentMethod paymentMethod;
    private long payment_threshold;
    private float commissionRate;

    public Affiliate(String name, String email, PaymentMethod paymentMethod, long payment_threshold, float commissionRate) {
        this.name = name;
        this.email = email;
        this.paymentMethod = paymentMethod;
        this.payment_threshold = payment_threshold;
        this.commissionRate = commissionRate;
    }


    public void setAffiliateId(long affiliateId){
        this.affiliateId = affiliateId;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setPaymentMethod(PaymentMethod paymentMethod){
        this.paymentMethod = paymentMethod;
    }
    public void setPayment_threshold(long payment_threshold){
        this.payment_threshold = payment_threshold;
    }
    public void setCommissionRate(float commissionRate){
        this.commissionRate = commissionRate;
    }



    public long getAffiliateId(){
        return this.affiliateId;
    }
    public String getName(){
        return this.name;
    }
    public String getEmail(){
        return this.email;
    }
    public PaymentMethod getPaymentMethod(){
        return this.paymentMethod;
    }
    public long getPayment_threshold(){
        return this.payment_threshold;
    }
    public float getCommissionRate(){
        return this.commissionRate;
    }

}

