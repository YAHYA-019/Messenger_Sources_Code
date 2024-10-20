package com.facebook.payments.model;

import X.1BK;
import X.AbI;
import X.DKF;
import X.ER6;
import X.EVD;
import X.GEP;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: PaymentItemType.class */
public final class PaymentItemType implements GEP {
    public static final /* synthetic */ PaymentItemType[] A00;
    public static final PaymentItemType A01;
    public static final PaymentItemType A02;
    public static final PaymentItemType A03;
    public static final PaymentItemType A04;
    public static final PaymentItemType A05;
    public static final PaymentItemType A06;
    public static final PaymentItemType A07;
    public static final PaymentItemType A08;
    public static final PaymentItemType A09;
    public static final PaymentItemType A0A;
    public static final PaymentItemType A0B;
    public static final PaymentItemType A0C;
    public static final PaymentItemType A0D;
    public static final PaymentItemType A0E;
    public static final PaymentItemType A0F;
    public static final PaymentItemType A0G;
    public static final PaymentItemType A0H;
    public static final PaymentItemType A0I;
    public static final PaymentItemType A0J;
    public static final PaymentItemType A0K;
    public static final PaymentItemType A0L;
    public static final PaymentItemType A0M;
    public static final PaymentItemType A0N;
    public static final PaymentItemType A0O;
    public static final PaymentItemType A0P;
    public static final PaymentItemType A0Q;
    public static final PaymentItemType A0R;
    public static final PaymentItemType A0S;
    public static final PaymentItemType A0T;
    public static final PaymentItemType A0U;
    public static final PaymentItemType A0V;
    public static final PaymentItemType A0W;
    public final String mValue;

    static {
        PaymentItemType A0a = DKF.A0a("FBPAY_HUB", "fbpay_hub", 0);
        A01 = A0a;
        PaymentItemType A0a2 = DKF.A0a("INVOICE", "ads_invoice", 1);
        A02 = A0a2;
        PaymentItemType A0a3 = DKF.A0a("MOR_DUMMY_THIRD_PARTY", "mor_dummy_third_party", 2);
        A04 = A0a3;
        PaymentItemType A0a4 = DKF.A0a("MOR_NONE", "mor_none", 3);
        A0A = A0a4;
        PaymentItemType A0a5 = DKF.A0a("NMOR_MOVIE_TICKETING", "nmor_movie_ticketing", 4);
        A0Q = A0a5;
        PaymentItemType A0a6 = DKF.A0a("NMOR_EVENT_TICKETING", "nmor_event_ticketing", 5);
        A0J = A0a6;
        PaymentItemType A0a7 = DKF.A0a("MOR_MESSENGER_COMMERCE", "mor_messenger_commerce", 6);
        A09 = A0a7;
        PaymentItemType A0a8 = DKF.A0a("MOR_P2P_TRANSFER", "mor_p2p_transfer", 7);
        A0C = A0a8;
        PaymentItemType A0a9 = DKF.A0a("MOR_FAN_FUNDING", "mor_fan_funding", 8);
        A05 = A0a9;
        PaymentItemType A0a10 = DKF.A0a("MOR_SOTTO", "mor_sotto", 9);
        A0D = A0a10;
        PaymentItemType A0a11 = DKF.A0a("MOR_GROUP_SUBSCRIPTION", "mor_group_subscription", 10);
        A07 = A0a11;
        PaymentItemType A0a12 = DKF.A0a("MOR_GAME_TIPPING_TOKEN", "mor_game_tipping_token", 11);
        A06 = A0a12;
        PaymentItemType A0a13 = DKF.A0a("MOR_INSTANT_GAMES", "mor_instant_games", 12);
        A08 = A0a13;
        PaymentItemType A0a14 = DKF.A0a("MOR_OCULUS_CV1", "mor_oculus_cv1", 13);
        A0B = A0a14;
        PaymentItemType A0a15 = DKF.A0a("NMOR_BUSINESS_PLATFORM_COMMERCE", "nmor_business_platform_commerce", 14);
        A0F = A0a15;
        PaymentItemType A0a16 = DKF.A0a("NMOR_SHIPPING_LABEL", "nmor_shipping_label", 15);
        A0T = A0a16;
        PaymentItemType A0a17 = DKF.A0a("NMOR_MESSENGER_PLATFORM", "nmor_messenger_platform", 16);
        A0N = A0a17;
        PaymentItemType A0a18 = DKF.A0a("NMOR_MESSENGER_OMNIM", "nmor_messenger_omnim", 17);
        A0M = A0a18;
        PaymentItemType A0a19 = DKF.A0a("MESSENGER_PAY_PREFS", "messenger_pay_prefs", 18);
        A03 = A0a19;
        PaymentItemType A0a20 = DKF.A0a("NMOR_PAGES_COMMERCE", "nmor_pages_commerce", 19);
        A0R = A0a20;
        PaymentItemType A0a21 = DKF.A0a("NMOR_SYNCHRONOUS_COMPONENT_FLOW", "nmor_synchronous_component_flow", 20);
        A0U = A0a21;
        PaymentItemType A0a22 = DKF.A0a("NMOR_TIP_JAR", "nmor_tip_jar", 21);
        A0V = A0a22;
        PaymentItemType A0a23 = DKF.A0a("NMOR_DONATION_P4P", "nmor_donation_p4p", 22);
        A0I = A0a23;
        PaymentItemType A0a24 = DKF.A0a("NMOR_INSTANT_EXPERIENCES", "nmor_instant_experiences", 23);
        A0L = A0a24;
        PaymentItemType A0a25 = DKF.A0a("NMOR_MFS", "nmor_mfs", 24);
        A0O = A0a25;
        PaymentItemType A0a26 = DKF.A0a("NMOR_MOBILE_TOP_UP", "nmor_mobile_top_up", 25);
        A0P = A0a26;
        PaymentItemType A0a27 = DKF.A0a("NMOR_PAGES_SOLUTION", "nmor_pages_solution", 26);
        A0S = A0a27;
        PaymentItemType A0a28 = DKF.A0a("PAYMENT_SETTINGS", "payment_settings", 27);
        A0W = A0a28;
        PaymentItemType A0a29 = DKF.A0a("NMOR_CHECKOUT_EXPERIENCES", "nmor_checkout_experiences", 28);
        A0H = A0a29;
        PaymentItemType A0a30 = DKF.A0a("NMOR_C2C_CHECKOUT_EXPERIENCES", "nmor_c2c_checkout_experiences", 29);
        A0G = A0a30;
        PaymentItemType A0a31 = DKF.A0a("NMOR_ADVERTISER_SUBSCRIPTION", "nmor_advertiser_subscription", 30);
        A0E = A0a31;
        PaymentItemType A0a32 = DKF.A0a("NMOR_FB_BROWSER_PAY", "fb_browser_payment", 31);
        A0K = A0a32;
        PaymentItemType[] paymentItemTypeArr = new PaymentItemType[32];
        AbI.A1W(new PaymentItemType[]{A0a28, A0a29, A0a30, A0a31, A0a32}, 1BK.A1W(new PaymentItemType[]{A0a, A0a2, A0a3, A0a4, A0a5, A0a6, A0a7, A0a8, A0a9, A0a10, A0a11, A0a12, A0a13, A0a14, A0a15, A0a16, A0a17, A0a18, A0a19, A0a20, A0a21, A0a22, A0a23, A0a24, A0a25, A0a26, A0a27}, paymentItemTypeArr) ? 1 : 0, paymentItemTypeArr);
        A00 = paymentItemTypeArr;
    }

    public PaymentItemType(String str, int i, String str2) {
        this.mValue = str2;
    }

    public static PaymentItemType forValue(String str) {
        GEP A002 = EVD.A00(str, values());
        A002.getClass();
        return (PaymentItemType) A002;
    }

    public static PaymentItemType valueOf(String str) {
        return (PaymentItemType) Enum.valueOf(PaymentItemType.class, str);
    }

    public static PaymentItemType[] values() {
        return (PaymentItemType[]) A00.clone();
    }

    public ER6 A00() {
        switch (ordinal()) {
            case 2:
                return ER6.A0G;
            case 3:
            case 5:
            case 6:
            case 7:
            case 9:
            case 18:
            case 21:
            case 24:
            case 27:
            default:
                throw 1BK.A0i("Not defined for ", this.mValue);
            case 4:
                return ER6.A0I;
            case 8:
                return ER6.A07;
            case 10:
                return ER6.A09;
            case 11:
                return ER6.A08;
            case 12:
                return ER6.A0B;
            case 13:
                return ER6.A0H;
            case 14:
                return ER6.A02;
            case 15:
                return ER6.A0N;
            case 16:
                return ER6.A0D;
            case 17:
                return ER6.A0C;
            case 19:
                return ER6.A0L;
            case 20:
                return ER6.A0O;
            case 22:
                return ER6.A06;
            case 23:
                return ER6.A0A;
            case 25:
                return ER6.A0F;
            case 26:
                return ER6.A0M;
            case 28:
            case 29:
                return ER6.A04;
            case 30:
                return ER6.A01;
            case 31:
                return ER6.A0J;
        }
    }

    public /* bridge */ /* synthetic */ Object getValue() {
        return this.mValue;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.mValue;
    }
}
