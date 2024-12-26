import entities.Affiliate;
import entities.AffiliateLink;
import entities.PaymentMethod;
import services.AffiliateLinkGenerationService;
import services.PaymentService;

public class Main {
    public static void main(String[] args) {
        AffiliateLinkGenerationService affiliateLinkGenerationService = new AffiliateLinkGenerationService();
        PaymentService paymentService = new PaymentService();


        Affiliate affiliate1 = new Affiliate("Partha", "upstartpssi@gmail.com", PaymentMethod.upi,0,10);

        affiliateLinkGenerationService.generateLink(affiliate1.getAffiliateId(),"https://www.amazon.in/Miss-Ethnik",500);
        affiliateLinkGenerationService.generateLink(affiliate1.getAffiliateId(),"xyz.example.com",2000);

        System.out.println(paymentService.pay(affiliate1));

    }
}