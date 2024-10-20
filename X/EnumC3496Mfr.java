package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Mfr, reason: case insensitive filesystem */
/* loaded from: Mfr.class */
public final class EnumC3496Mfr implements C07n {
    public static final /* synthetic */ EnumC3496Mfr[] A00;
    public static final EnumC3496Mfr A01;
    public static final EnumC3496Mfr A02;
    public static final EnumC3496Mfr A03;
    public final String mValue;

    static {
        EnumC3496Mfr A002 = A00("APPLE_IAP", "apple_iap", 0);
        EnumC3496Mfr A003 = A00("CREDIT_CARD", "credit_card", 1);
        A01 = A003;
        EnumC3496Mfr A004 = A00("PAYPAL_BA", "paypal_ba", 2);
        A03 = A004;
        EnumC3496Mfr A005 = A00("PAYPAL_TOKEN", "paypal_token", 3);
        EnumC3496Mfr A006 = A00("PAYPAL_PAYOUT", "paypal_payout", 4);
        EnumC3496Mfr A007 = A00("PAYONEER", "payoneer", 5);
        EnumC3496Mfr A008 = A00("STORED_CREDIT", "stored_credit", 6);
        EnumC3496Mfr A009 = A00("FACEBOOK_PAY", "facebook_pay", 7);
        EnumC3496Mfr A0010 = A00("META_PAY", "meta_pay", 8);
        EnumC3496Mfr A0011 = A00("ADS_STORED_BALANCE", "ads_stored_balance", 9);
        EnumC3496Mfr A0012 = A00("NEW_BUSINESS_STORED_BALANCE", "new_business_store_balance", 10);
        EnumC3496Mfr A0013 = A00("EXTENDED_CREDIT", "extended_credit", 11);
        EnumC3496Mfr A0014 = A00("NEW_EXTENDED_CREDIT", "new_extended_credit", 12);
        EnumC3496Mfr A0015 = A00("FB_TOKEN", "fb_token", 13);
        EnumC3496Mfr A0016 = A00("UPI", "upi", 14);
        EnumC3496Mfr A0017 = A00("EXTERNAL_UPI", "external_upi", 15);
        EnumC3496Mfr A0018 = A00("DIRECT_DEBIT", "direct_debit", 16);
        EnumC3496Mfr A0019 = A00("EXTERNAL_WALLET", "external_wallet", 17);
        EnumC3496Mfr A0020 = A00("STORED_VALUE", "stored_value", 18);
        EnumC3496Mfr A0021 = A00("NET_BANKING", "net_banking", 19);
        EnumC3496Mfr A0022 = A00("ALT_PAY", "alt_pay", 20);
        EnumC3496Mfr A0023 = A00("GIFTCARD", "giftcard", 21);
        EnumC3496Mfr A0024 = A00("GIFTCARD_BALANCE", "giftcard_balance", 22);
        EnumC3496Mfr A0025 = A00("AFFIRM", "affirm", 23);
        EnumC3496Mfr A0026 = A00("DUMMY", "dummy", 24);
        A02 = A0026;
        EnumC3496Mfr A0027 = A00("WA_EXTERNAL_WALLET", "wa_external_wallet", 25);
        EnumC3496Mfr A0028 = A00("NEW_CREDIT_CARD", "new_credit_card", 26);
        EnumC3496Mfr A0029 = A00("NEW_PAYPAL_BA", "new_paypal_ba", 27);
        EnumC3496Mfr A0030 = A00("NEW_EXTERNAL_WALLET", "new_external_wallet", 28);
        EnumC3496Mfr A0031 = A00("NEW_WA_EXTERNAL_WALLET", "wa_new_external_wallet", 29);
        EnumC3496Mfr A0032 = A00("NEW_CREDENTIAL_NUX", "new_credential_nux", 30);
        EnumC3496Mfr A0033 = A00("NETWORK_TOKEN", "network_token", 31);
        EnumC3496Mfr A0034 = A00("SHOP_PAY", "shop_pay", 32);
        EnumC3496Mfr A0035 = A00("NEW_SHOP_PAY", "new_shop_pay", 33);
        EnumC3496Mfr A0036 = A00("NEW_PAYPAL_CHECKOUT", "new_paypal_checkout", 34);
        EnumC3496Mfr A0037 = A00("NEW_PAYPAL_BNPL_CHECKOUT", "new_paypal_bnpl_checkout", 35);
        EnumC3496Mfr A0038 = A00("EXTERNAL_CREDENTIAL", "external_credential", 36);
        EnumC3496Mfr A0039 = A00("QR_CODE", "qr_code", 37);
        EnumC3496Mfr A0040 = A00("CREDIT_CARD_DINERSCLUB", "credit_card_dinersclub", 38);
        EnumC3496Mfr A0041 = A00("CREDIT_CARD_AMERICANEXPRESS", "credit_card_americanexpress", 39);
        EnumC3496Mfr A0042 = A00("CREDIT_CARD_DISCOVER", "credit_card_discover", 40);
        EnumC3496Mfr A0043 = A00("CREDIT_CARD_ELO", "credit_card_elo", 41);
        EnumC3496Mfr A0044 = A00("CREDIT_CARD_INTERAC", "credit_card_interac", 42);
        EnumC3496Mfr A0045 = A00("CREDIT_CARD_JCB", "credit_card_jcb", 43);
        EnumC3496Mfr A0046 = A00("CREDIT_CARD_MASTERCARD", "credit_card_mastercard", 44);
        EnumC3496Mfr A0047 = A00("CREDIT_CARD_PIN_ONLY", "credit_card_pin_only", 45);
        EnumC3496Mfr A0048 = A00("CREDIT_CARD_CUP", "credit_card_cup", 46);
        EnumC3496Mfr A0049 = A00("CREDIT_CARD_VISA", "credit_card_visa", 47);
        EnumC3496Mfr A0050 = A00("CREDIT_CARD_RUPAY", "credit_card_rupay", 48);
        EnumC3496Mfr A0051 = A00("CREDIT_CARD_MAESTRO", "credit_card_maestro", 49);
        EnumC3496Mfr A0052 = A00("INCENTIVE_FUNDING", "incentive_funding", 50);
        EnumC3496Mfr A0053 = A00("OFFER", "offer", 51);
        EnumC3496Mfr A0054 = A00("REWARD", "reward", 52);
        EnumC3496Mfr A0055 = A00("INCENTIVE_NMOR_OMNIPE_MIGRATION", "incentive_nmor_omnipe_migration", 53);
        EnumC3496Mfr A0056 = A00("META_DUMMY", "meta_dummy", 54);
        EnumC3496Mfr A0057 = A00("VIRTUAL_CARD_KLARNA_BNPL", "virtual_card_klarna_bnpl", 55);
        EnumC3496Mfr A0058 = A00("HPP_PAYMENT_LINK", "hpp_payment_link", 56);
        EnumC3496Mfr[] enumC3496MfrArr = new EnumC3496Mfr[57];
        System.arraycopy(new EnumC3496Mfr[]{A002, A003, A004, A005, A006, A007, A008, A009, A0010, A0011, A0012, A0013, A0014, A0015, A0016, A0017, A0018, A0019, A0020, A0021, A0022, A0023, A0024, A0025, A0026, A0027, A0028}, 0, enumC3496MfrArr, 0, 27);
        System.arraycopy(new EnumC3496Mfr[]{A0029, A0030, A0031, A0032, A0033, A0034, A0035, A0036, A0037, A0038, A0039, A0040, A0041, A0042, A0043, A0044, A0045, A0046, A0047, A0048, A0049, A0050, A0051, A0052, A0053, A0054, A0055}, 0, enumC3496MfrArr, 27, 27);
        System.arraycopy(new EnumC3496Mfr[]{A0056, A0057, A0058}, 0, enumC3496MfrArr, 54, 3);
        A00 = enumC3496MfrArr;
    }

    public EnumC3496Mfr(String str, int i, String str2) {
        this.mValue = str2;
    }

    public static EnumC3496Mfr A00(String str, String str2, int i) {
        return new EnumC3496Mfr(str, i, str2);
    }

    public static EnumC3496Mfr valueOf(String str) {
        return (EnumC3496Mfr) Enum.valueOf(EnumC3496Mfr.class, str);
    }

    public static EnumC3496Mfr[] values() {
        return (EnumC3496Mfr[]) A00.clone();
    }

    @Override // X.C07n
    public /* bridge */ /* synthetic */ Object getValue() {
        return this.mValue;
    }
}
