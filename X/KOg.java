package X;

/* loaded from: KOg.class */
public enum KOg {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    /* JADX INFO: Fake field, exist only in values array */
    MERCHANT_FUNDED_ONSITE("COMMERCE_CHECKOUT_COUPON"),
    /* JADX INFO: Fake field, exist only in values array */
    MERCHANT_FUNDED_ONSITE("COMMERCE_CHECKOUT_OFFER"),
    /* JADX INFO: Fake field, exist only in values array */
    MERCHANT_FUNDED_ONSITE("FB_FUNDED_OFFSITE"),
    /* JADX INFO: Fake field, exist only in values array */
    MERCHANT_FUNDED_ONSITE("FB_FUNDED_ONSITE"),
    /* JADX INFO: Fake field, exist only in values array */
    MERCHANT_FUNDED_ONSITE("FB_FUNDED_REWARD_OFFSITE"),
    /* JADX INFO: Fake field, exist only in values array */
    MERCHANT_FUNDED_ONSITE("MERCHANT_FUNDED_OFFSITE"),
    /* JADX INFO: Fake field, exist only in values array */
    MERCHANT_FUNDED_ONSITE("MERCHANT_FUNDED_ONSITE"),
    PROMO_CODE("PROMO_CODE"),
    /* JADX INFO: Fake field, exist only in values array */
    SUBSCRIPTION_OFFER("SUBSCRIPTION_OFFER"),
    /* JADX INFO: Fake field, exist only in values array */
    UPSELL_DISCOUNT("UPSELL_DISCOUNT");

    public final String serverValue;

    KOg(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
