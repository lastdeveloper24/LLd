package services;

import GlobalDB.GlobalMap;
import entities.Affiliate;
import entities.AffiliateLink;

import java.util.ArrayList;
import java.util.List;

public class AffiliateLinkGenerationService {
    List<AffiliateLink> links = new ArrayList<>();

    public AffiliateLink generateLink(long affiliateId, String url,float price){
        long linkId = links.size()+1;
        AffiliateLink affiliateLink =new AffiliateLink(linkId, affiliateId, url, price);
        links.add(affiliateLink);

        GlobalMap.getInstance().put(affiliateId,affiliateLink);

        return affiliateLink;
    }

}
