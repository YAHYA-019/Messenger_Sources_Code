package X;

import com.facebook.proxygen.TraceFieldType;
import com.facebookpay.logging.LoggingContext;
import java.util.ArrayList;
import java.util.List;

/* loaded from: LZu.class */
public final class LZu implements GKt {
    public final 04J A00;

    public LZu(04J r302) {
        11T.A0F(r302, 1);
        this.A00 = r302;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.Jkn, X.0DA] */
    public static final C3152Jkn A00(LoggingContext loggingContext, java.util.Map map) {
        String str;
        List list;
        ?? r0 = new 0DA();
        7zR.A15((0DA) r0, loggingContext);
        String A0b = AnonymousClass001.A0b("PARTNER_ID", map);
        str = "";
        if (A0b == null) {
            A0b = str;
        }
        r0.A07("partner_merchant_id", A05(r0, A0b, map));
        String A0b2 = AnonymousClass001.A0b("MERCHANT_REQUEST_ID", map);
        r0.A07("merchant_request_id", A0b2 != null ? A0b2 : "");
        8FL A00 = L9N.A00(loggingContext);
        if (A00 == null) {
            throw 1BK.A0h();
        }
        r0.A02(A00, "logging_policy");
        r0.A03("cache_available", (Boolean) map.get("CACHE_AVAILABLE"));
        r0.A07("view_name", "ecp_checkout");
        Object obj = map.get("TARGET_NAME");
        if (obj != null && (obj instanceof String)) {
            JQz.A1D((0DA) r0, (String) obj);
        }
        Object obj2 = map.get("CACHE_AVAILABLE");
        if (obj2 != null && (obj2 instanceof Boolean)) {
            r0.A03("cache_available", (Boolean) obj2);
        }
        Object obj3 = map.get("AD_ID");
        if (obj3 != null && (obj3 instanceof String)) {
            r0.A06("ad_id", 0CW.A0e((String) obj3));
        }
        Object obj4 = map.get("INITIATOR");
        if (obj4 != null && (obj4 instanceof String)) {
            r0.A07("initiator", (String) obj4);
        }
        Object obj5 = map.get("IAB_SESSION_ID");
        if (obj5 != null && (obj5 instanceof String)) {
            r0.A07("iab_session_id", (String) obj5);
        }
        Object obj6 = map.get("MERCHANT_CONTAINER_TYPES");
        if ((obj6 instanceof List) && (list = (List) obj6) != null) {
            ArrayList A0s = AnonymousClass001.A0s();
            for (Object obj7 : list) {
                DKC.A1U(obj7);
                A0s.add(obj7);
            }
            r0.A08("merchant_container_types", A0s);
        }
        Object obj8 = map.get("USER_HAS_CARD");
        if (obj8 != null && (obj8 instanceof String)) {
            r0.A07("user_has_card", (String) obj8);
        }
        Object obj9 = map.get("USER_HAS_TOKENIZED_CARD");
        if (obj9 != null && (obj9 instanceof String)) {
            r0.A07("user_has_tokenized_card", (String) obj9);
        }
        Object obj10 = map.get("USER_HAS_SHIPPING_ADDRESS");
        if (obj10 != null && (obj10 instanceof String)) {
            r0.A07("user_has_shipping_address", (String) obj10);
        }
        Object obj11 = map.get("USER_HAS_EMAIL");
        if (obj11 != null && (obj11 instanceof String)) {
            r0.A07("user_has_email", (String) obj11);
        }
        Object obj12 = map.get("USER_HAS_PHONE");
        if (obj12 != null && (obj12 instanceof String)) {
            r0.A07("user_has_phone", (String) obj12);
        }
        return r0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.Jkr, X.0DA] */
    public static final C3154Jkr A01(LoggingContext loggingContext, java.util.Map map) {
        String str;
        Long l;
        ?? r0 = new 0DA();
        r0.A06("product_id", Long.valueOf(loggingContext.A00));
        8FL A00 = L9N.A00(loggingContext);
        if (A00 == null) {
            throw 1BK.A0h();
        }
        r0.A02(A00, "logging_policy");
        String A0b = AnonymousClass001.A0b("PARTNER_ID", map);
        str = "";
        if (A0b == null) {
            A0b = str;
        }
        r0.A07("partner_merchant_id", A05(r0, A0b, map));
        r0.A07("view_name", "ecp_checkout");
        String A0b2 = AnonymousClass001.A0b("ERROR_CODE", map);
        r0.A07(TraceFieldType.ErrorCode, A0b2 != null ? A0b2 : "");
        Object obj = map.get("CACHE_AVAILABLE");
        if (obj != null && (obj instanceof Boolean)) {
            r0.A03("cache_available", (Boolean) obj);
        }
        Object obj2 = map.get("PRODUCT_ID");
        if ((obj2 instanceof Long) && (l = (Long) obj2) != null) {
            r0.A06("product_id", l);
        }
        return r0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.Jks, X.0DA] */
    public static final C3155Jks A02(LoggingContext loggingContext, java.util.Map map) {
        String str;
        ?? r0 = new 0DA();
        String A0b = AnonymousClass001.A0b("PARTNER_ID", map);
        str = "";
        if (A0b == null) {
            A0b = str;
        }
        r0.A07("partner_merchant_id", A05(r0, A0b, map));
        String A0b2 = AnonymousClass001.A0b("MERCHANT_REQUEST_ID", map);
        if (A0b2 == null) {
            A0b2 = str;
        }
        r0.A07("merchant_request_id", A0b2);
        8FL A00 = L9N.A00(loggingContext);
        if (A00 == null) {
            throw 1BK.A0h();
        }
        r0.A02(A00, "logging_policy");
        r0.A07("view_name", "ecp_checkout");
        List A12 = JQx.A12("CHANGED_FIELDS", map);
        if (A12 == null) {
            A12 = C0ty.A00;
        }
        r0.A08("changed_fields", A12);
        String A0b3 = AnonymousClass001.A0b("ERROR_CODE", map);
        r0.A07(TraceFieldType.ErrorCode, A0b3 != null ? A0b3 : "");
        A06(r0, map);
        return r0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.Jkt, X.0DA] */
    public static final C3156Jkt A03(LoggingContext loggingContext, java.util.Map map) {
        String str;
        String str2;
        ?? r0 = new 0DA();
        String A0b = AnonymousClass001.A0b("PARTNER_ID", map);
        str = "";
        if (A0b == null) {
            A0b = str;
        }
        r0.A07("partner_merchant_id", A05(r0, A0b, map));
        String A0b2 = AnonymousClass001.A0b("MERCHANT_REQUEST_ID", map);
        if (A0b2 == null) {
            A0b2 = str;
        }
        r0.A07("merchant_request_id", A0b2);
        8FL A00 = L9N.A00(loggingContext);
        if (A00 == null) {
            throw 1BK.A0h();
        }
        r0.A02(A00, "logging_policy");
        r0.A07("view_name", "ecp_checkout");
        String A0b3 = AnonymousClass001.A0b("ERROR_CODE", map);
        if (A0b3 == null) {
            A0b3 = str;
        }
        r0.A07(TraceFieldType.ErrorCode, A0b3);
        r0.A03("retryable", Boolean.valueOf(JR0.A1U((Boolean) map.get("RETRYABLE"))));
        String A0b4 = AnonymousClass001.A0b("TYPED_CONTAINER_ID", map);
        r0.A07("typed_container_id", A0b4 != null ? A0b4 : "");
        A06(r0, map);
        Object obj = map.get("CONTAINER_TYPE");
        if ((obj instanceof String) && (str2 = (String) obj) != null) {
            r0.A07("container_type", str2);
        }
        return r0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.Jku, X.0DA] */
    public static final C3157Jku A04(LoggingContext loggingContext, java.util.Map map) {
        String str;
        ?? r0 = new 0DA();
        String A0b = AnonymousClass001.A0b("PARTNER_ID", map);
        str = "";
        if (A0b == null) {
            A0b = str;
        }
        r0.A07("partner_merchant_id", A05(r0, A0b, map));
        String A0b2 = AnonymousClass001.A0b("MERCHANT_REQUEST_ID", map);
        if (A0b2 == null) {
            A0b2 = str;
        }
        r0.A07("merchant_request_id", A0b2);
        8FL A00 = L9N.A00(loggingContext);
        if (A00 == null) {
            throw 1BK.A0h();
        }
        r0.A02(A00, "logging_policy");
        r0.A07("view_name", "ecp_checkout");
        r0.A03("proactive_checkout", Boolean.valueOf(JR0.A1U((Boolean) map.get("PROACTIVE_CHECKOUT"))));
        String A0b3 = AnonymousClass001.A0b("ERROR_CODE", map);
        r0.A07(TraceFieldType.ErrorCode, A0b3 != null ? A0b3 : "");
        List A12 = JQx.A12("PAYMENT_OPTIONS", map);
        if (A12 == null) {
            A12 = C0ty.A00;
        }
        r0.A08("payment_options", A12);
        A06(r0, map);
        return r0;
    }

    public static String A05(0DA r301, String str, java.util.Map map) {
        r301.A07("partner_id", str);
        String str2 = (String) map.get("PARTNER_MERCHANT_ID");
        return str2 == null ? "" : str2;
    }

    public static void A06(0DA r301, java.util.Map map) {
        Long l;
        Object obj = map.get("PRODUCT_ID");
        if (!(obj instanceof Long) || (l = (Long) obj) == null) {
            return;
        }
        r301.A06("product_id", l);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x003d. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0688  */
    /* JADX WARN: Removed duplicated region for block: B:147:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0617  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x063a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0652  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x048c  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x04c5  */
    @Override // X.GKt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void BZT(java.lang.String r302, java.util.Map r303) {
        /*
            Method dump skipped, instructions count: 1955
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LZu.BZT(java.lang.String, java.util.Map):void");
    }
}
