package services;

import entities.Affiliate;
import entities.AffiliateLink;


public class CommisionCalculator {
    public float calculateCommission(AffiliateLink affiliateLink, Affiliate affiliate){
        float productPrice =  affiliateLink.getProductPrice();
        float commissionRate = affiliate.getCommissionRate();

        float commission = (productPrice*commissionRate)/100;

        return commission;
    }

}
