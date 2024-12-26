package services;

import GlobalDB.GlobalMap;
import entities.Affiliate;
import entities.AffiliateLink;

import java.util.List;

public class PaymentService {
    CommisionCalculator commisionCalculator = new CommisionCalculator();


    public float pay(Affiliate affiliate){
        long affiliateId = affiliate.getAffiliateId();
        long sum = 0;

        //get all the affiliate links mapped to this affiliate
        List<Object> affliateLinks = GlobalMap.getInstance().get(affiliateId);

        //traverse through all the affiliates ,and calculate commission on each affiliate
        for(Object affliateLink:affliateLinks){
            AffiliateLink afLink = (AffiliateLink) affliateLink;

            float calculatedCommission = commisionCalculator.calculateCommission(afLink,affiliate);
            sum = sum + (long)calculatedCommission;
        }

        //return the sum of all the commissions
        return sum;
    }



}
