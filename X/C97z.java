package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.97z, reason: invalid class name */
/* loaded from: 97z.class */
public final class C97z implements C07n {
    public static final /* synthetic */ C97z[] A00;
    public final String mValue;

    static {
        C97z c97z = new C97z("INVALID", 0, "invalid");
        C97z c97z2 = new C97z("IG_DIRECT_IN_THREAD_SUGGESTION_SR_UPSELL", 1, "ig_direct_in_thread_suggestion_sr_upsell");
        C97z c97z3 = new C97z("IG_EXAMPLE", 2, "ig_example");
        C97z c97z4 = new C97z("IG_IIC", 3, "ig_iic");
        C97z c97z5 = new C97z("IG_SEXUAL_HARASSMENT", 4, "ig_sexual_harassment");
        C97z c97z6 = new C97z("IG_SEXTORTION", 5, "ig_sextortion");
        C97z c97z7 = new C97z("IG_JOINER_TRANSPARENCY", 6, "ig_joiner_transparency");
        C97z c97z8 = new C97z("IG_SCAM_VICTIM_INITIATED_THREAD_VIEW", 7, "ig_scam_victim_initiated_thread_view");
        C97z c97z9 = new C97z("IG_SCAM_ABOUT_THIS_ACCOUNT_THREAD_VIEW", 8, "ig_scam_about_this_account_thread_view");
        C97z c97z10 = new C97z("IG_LOCATION_WARNING_THREAD_VIEW", 9, "ig_location_warning_thread_view");
        C97z c97z11 = new C97z("IG_UNVETTED_DEVICE", 10, "ig_unvetted_device");
        C97z c97z12 = new C97z("IG_COMPROMISED_THREAD_VIEW", 11, "ig_compromised_thread_view");
        C97z c97z13 = new C97z("MSGR_EXAMPLE", 12, "example");
        C97z c97z14 = new C97z("MSGR_SCAM", 13, "scam");
        C97z c97z15 = new C97z("MSGR_IIC", 14, "msgr_iic");
        C97z c97z16 = new C97z("MSGR_JOINER_TRANSPARENCY", 15, "msgr_joiner_transparency");
        C97z c97z17 = new C97z("MSGR_COMMON_ONLINE_SCAMS", 16, "common_online_scams");
        C97z c97z18 = new C97z("MSGR_COMMON_COUNTRY_SCAMS", 17, "msgr_common_country_scams");
        C97z c97z19 = new C97z("MESSENGER_TEEN_LOCATION_WARNING", 18, "messenger_teen_location_warning");
        C97z c97z20 = new C97z("MESSENGER_ADULT_LOCATION_WARNING", 19, "messenger_adult_location_warning");
        C97z c97z21 = new C97z("MSGR_SCAM_MARKETPLACE", 20, "msgr_scam_marketplace");
        C97z c97z22 = new C97z("MSGR_SCAM_MARKETPLACE_ADVANCED_PAYMENT", 21, "msgr_scam_marketplace_advanced_payment");
        C97z c97z23 = new C97z("MSGR_SCAM_MARKETPLACE_PAYMENT_APPS", 22, "msgr_scam_marketplace_payment_apps");
        C97z c97z24 = new C97z("MSGR_SCAM_MARKETPLACE_PERSONAL_INFO_PHONE_NUMBER", 23, "msgr_scam_marketplace_personal_info_phone_number");
        C97z c97z25 = new C97z("MSGR_SCAM_MARKETPLACE_PERSONAL_INFO_EMAIL", 24, "msgr_scam_marketplace_personal_info_email");
        C97z c97z26 = new C97z("MSGR_SCAM_MARKETPLACE_OFF_PLATFORM_LINK", 25, "msgr_scam_marketplace_off_platform_link");
        C97z c97z27 = new C97z("MSGR_SCAM_MARKETPLACE_VERIFICATION_CODE", 26, "msgr_scam_marketplace_verification_code");
        C97z c97z28 = new C97z("UNDEFINED", 27, "undefined");
        C97z[] c97zArr = new C97z[28];
        System.arraycopy(new C97z[]{c97z, c97z2, c97z3, c97z4, c97z5, c97z6, c97z7, c97z8, c97z9, c97z10, c97z11, c97z12, c97z13, c97z14, c97z15, c97z16, c97z17, c97z18, c97z19, c97z20, c97z21, c97z22, c97z23, c97z24, c97z25, c97z26, c97z27}, 0, c97zArr, 0, 27);
        System.arraycopy(new C97z[]{c97z28}, 0, c97zArr, 27, 1);
        A00 = c97zArr;
    }

    public C97z(String str, int i, String str2) {
        this.mValue = str2;
    }

    public static C97z valueOf(String str) {
        return (C97z) Enum.valueOf(C97z.class, str);
    }

    public static C97z[] values() {
        return (C97z[]) A00.clone();
    }

    @Override // X.C07n
    public /* bridge */ /* synthetic */ Object getValue() {
        return this.mValue;
    }
}
