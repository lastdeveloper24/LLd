package entities;

public class AffiliateLink {
    private long linkId;
    private long affiliateId;
    private String targetUrl;
    private float productPrice;

    public AffiliateLink(long linkId, long affiliateId, String targetUrl, float productAmount) {
        this.linkId = linkId;
        this.affiliateId = affiliateId;
        this.targetUrl = targetUrl;
        this.productPrice = productAmount;
    }


    public void setLinkId(long linkId){
        this.linkId = linkId;
    }
    public void setAffiliateId(long affiliateId){
        this.affiliateId = affiliateId;
    }
    public void setTargetUrl(String targetUrl){
        this.targetUrl = targetUrl;
    }
    public void setProductPrice(float productPrice) {
        this.productPrice = productPrice;
    }


    public long getLinkId(){
        return this.linkId;
    }
    public long getAffiliateId(){
        return this.affiliateId;
    }
    public String getTargetUrl(){
        return this.targetUrl;
    }
    public float getProductPrice() {
        return productPrice;
    }
}
