package X;

import android.content.Context;
import com.facebook.acra.constants.ErrorReportingConstants;
import com.google.android.gms.common.GoogleApiAvailability;

/* renamed from: X.50j, reason: invalid class name */
/* loaded from: 50j.class */
public final class C50j implements C50k {
    public String A00;
    public String A01;
    public final int A02;
    public final C50i A03;
    public final C50l A04;
    public final String A05;

    public C50j(Context context, 04J r303, C50i c50i) {
        11T.A0F(r303, 1);
        11T.A0F(c50i, 2);
        this.A03 = c50i;
        this.A00 = AbstractC11504wo.A01();
        this.A02 = GoogleApiAvailability.A00.A04(context, 12451000);
        this.A05 = context.getPackageName();
        this.A04 = new C50l(r303);
        this.A01 = "all_products";
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.7cf, X.0DA] */
    private final C7cf A00(String str) {
        ?? r0 = new 0DA();
        r0.A01(EQL.A01, "dcp_flow");
        r0.A05("dcp_platform", 71);
        Boolean A0d = 1BK.A0d();
        r0.A03("is_retry", A0d);
        r0.A01(EQT.A03, "dcp_sub_flow");
        r0.A07(ErrorReportingConstants.APP_NAME_KEY, this.A05);
        r0.A03("is_retry", A0d);
        r0.A07("external_product_id", str);
        return r0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.7cg, X.0DA] */
    private final C7cg A01(Boolean bool, String str, String str2, String str3, String str4, String str5, String str6) {
        ?? r0 = new 0DA();
        r0.A01(EQL.A02, "dcp_flow");
        r0.A01(EQT.A01, "dcp_sub_flow");
        r0.A07(ErrorReportingConstants.APP_NAME_KEY, this.A05);
        r0.A07("external_transaction_id", str);
        if (bool != null) {
            r0.A03("is_retry", Boolean.valueOf(bool.booleanValue()));
        }
        A07(r0, str2, str4);
        A06(r0, str5);
        if (str6 != null) {
            r0.A06("quote_id", 1BK.A0n(str6));
        }
        if (str3 != null && str3.length() != 0) {
            r0.A06(JQw.A00(10), 1BK.A0n(str3));
        }
        return r0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0DA, X.7ch] */
    private final C7ch A02(String str, String str2, String str3, String str4, String str5, String str6, boolean z) {
        ?? r0 = new 0DA();
        r0.A01(EQL.A02, "dcp_flow");
        r0.A03("is_retry", Boolean.valueOf(z));
        r0.A01(EQT.A03, "dcp_sub_flow");
        r0.A07(ErrorReportingConstants.APP_NAME_KEY, this.A05);
        A07(r0, str, str2);
        A06(r0, str3);
        if (str4 != null) {
            r0.A06("quote_id", 1BK.A0n(str4));
        }
        if (str5 != null) {
            r0.A07("external_transaction_id", str5);
        }
        if (str6 != null) {
            r0.A06(JQw.A00(10), 1BK.A0n(str6));
        }
        return r0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0DA, X.7ci] */
    private final C7ci A03(EQT eqt, EQB eqb, Boolean bool, String str, String str2, String str3, String str4, String str5, String str6) {
        ?? r0 = new 0DA();
        r0.A01(EQL.A02, "dcp_flow");
        r0.A01(eqt, "dcp_sub_flow");
        r0.A07(ErrorReportingConstants.APP_NAME_KEY, this.A05);
        r0.A07("external_transaction_id", str);
        if (bool != null) {
            r0.A03("is_retry", Boolean.valueOf(bool.booleanValue()));
        }
        A07(r0, str2, str4);
        A06(r0, str5);
        if (str6 != null) {
            r0.A06("quote_id", 1BK.A0n(str6));
        }
        if (eqb != null) {
            r0.A01(eqb, 7zK.A00(44));
        }
        if (str3 != null && str3.length() != 0) {
            r0.A06(JQw.A00(10), 1BK.A0n(str3));
        }
        return r0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.7cj, X.0DA] */
    private final C7cj A04(String str, String str2, String str3, String str4) {
        ?? r0 = new 0DA();
        r0.A01(EQL.A02, "dcp_flow");
        Boolean A0d = 1BK.A0d();
        r0.A03("is_retry", A0d);
        r0.A07(ErrorReportingConstants.APP_NAME_KEY, this.A05);
        r0.A01(EQT.A03, "dcp_sub_flow");
        r0.A03("is_retry", A0d);
        A07(r0, str, str2);
        A06(r0, str3);
        if (str4 != null) {
            r0.A06("quote_id", 1BK.A0n(str4));
        }
        return r0;
    }

    public static void A05(C07n c07n, 0DA r302, 1UG r303, String str, java.util.Map map) {
        if (r303.isSampled()) {
            r303.A7R("session_id", str);
            r303.A5c(c07n, "product_type");
            r303.A08();
            r303.A6H("actual_event_time", Long.valueOf(System.currentTimeMillis()));
            r303.A7T(r302, "event_payload");
            r303.A6J("extra_data", map);
            r303.BZL();
        }
    }

    public static void A06(0DA r301, String str) {
        Long A0e;
        if (str == null || (A0e = 0CW.A0e(str)) == null) {
            return;
        }
        r301.A06("product_id", A0e);
    }

    public static void A07(0DA r301, String str, String str2) {
        Long A0e;
        r301.A07("external_product_id", str);
        if (str2 == null || (A0e = 0CW.A0e(str2)) == null) {
            return;
        }
        r301.A06("payee_id", A0e);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x002b, code lost:
    
        if (r0 != null) goto L8;
     */
    @Override // X.C50k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.LinkedHashMap B5U(X.L1w r302, com.android.billingclient.api.Purchase r303, boolean r304) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50j.B5U(X.L1w, com.android.billingclient.api.Purchase, boolean):java.util.LinkedHashMap");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0c4c, code lost:
    
        if (r305 == null) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x1129, code lost:
    
        if (r0 == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x1147, code lost:
    
        if (r0 == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x114d, code lost:
    
        r305 = X.EnumC11554wt.A05;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x1165, code lost:
    
        if (r0 == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x116b, code lost:
    
        r305 = X.EnumC11554wt.A08;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x1185, code lost:
    
        if (r0 == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x118b, code lost:
    
        r305 = X.EnumC11554wt.A0A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x112f, code lost:
    
        r305 = X.EnumC11554wt.A0D;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x11a3, code lost:
    
        if (r0 == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x11a9, code lost:
    
        r305 = X.EnumC11554wt.A09;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x11c1, code lost:
    
        if (r0 == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x11c7, code lost:
    
        r305 = X.EnumC11554wt.A07;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x11df, code lost:
    
        if (r0 == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x11e5, code lost:
    
        r305 = X.EnumC11554wt.A0C;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x11fd, code lost:
    
        if (r0 == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x1203, code lost:
    
        r305 = X.EnumC11554wt.A0E;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x121b, code lost:
    
        if (r0 == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x1221, code lost:
    
        r305 = X.EnumC11554wt.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x1239, code lost:
    
        if (r0 == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x123f, code lost:
    
        r305 = X.EnumC11554wt.A0B;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x1014, code lost:
    
        if ("FAN_FUNDING".equals("FAN_FUNDING") == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x1045, code lost:
    
        if ("AVATAR_CONTENT".equals("AVATAR_CONTENT") == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x105b, code lost:
    
        if ("NME_SUBSCRIPTION".equals("NME_SUBSCRIPTION") == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x1071, code lost:
    
        if ("GAME_TIPPING".equals("GAME_TIPPING") == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x10a2, code lost:
    
        if ("NFT".equals("NFT") == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x10b8, code lost:
    
        if ("MV4B".equals("MV4B") == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x10ce, code lost:
    
        if ("META_GEM".equals("META_GEM") == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x10e7, code lost:
    
        if (r0.equals(r0) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x10fd, code lost:
    
        if ("AFS_SUBSCRIPTION".equals("AFS_SUBSCRIPTION") == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x1113, code lost:
    
        if ("GAMES_SUBSCRIPTION".equals("GAMES_SUBSCRIPTION") == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x07f8, code lost:
    
        if (r305 == null) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0c53, code lost:
    
        r312.A7R("error_message", r305);
        r312.BZL();
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0c62, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0c4f, code lost:
    
        r305 = r314;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x02f4. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x07fe  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0806  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x080e  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0816  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x081e  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0884  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0893  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x08a2  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x08aa  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x08b2  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x08ba  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x08c2  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x08ca  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x08d2  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x08da  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x08e2  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x08ea  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x08f2  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0949  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0951  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0959  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0968  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0977  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0a36  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0a9b  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0aff  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0b07  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0b0f  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0b6c  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0b74  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0b7c  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0bc0  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0c63  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0c72  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0cd2  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0d31  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0d90  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0ddd  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0e8e  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0ef2  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0f56  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0fad  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x04b0 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0df0  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x04b9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0503  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x05f4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0644  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x09ec  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0692  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x069a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x06a2  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x06e6  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x06ee  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x06f6  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0753  */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.util.Map, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v101, types: [X.50l, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v104, types: [X.1UG, java.util.Map, X.0DA, java.lang.String, X.07n] */
    /* JADX WARN: Type inference failed for: r0v110, types: [X.50l, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v113, types: [X.1UG, java.util.Map, X.0DA, java.lang.String, X.07n] */
    /* JADX WARN: Type inference failed for: r0v118, types: [java.lang.Boolean, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v121, types: [X.50l, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v124, types: [X.1UG, java.util.Map, X.0DA, java.lang.String, X.07n] */
    /* JADX WARN: Type inference failed for: r0v129, types: [java.lang.Boolean, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v132, types: [X.50l, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v135, types: [X.1UG, java.util.Map, X.0DA, java.lang.String, X.07n] */
    /* JADX WARN: Type inference failed for: r0v139, types: [java.lang.String, boolean] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.util.Map, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v142, types: [X.50l, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v145, types: [X.1UG, java.util.Map, X.0DA, java.lang.String, X.07n] */
    /* JADX WARN: Type inference failed for: r0v148, types: [X.EQT, boolean] */
    /* JADX WARN: Type inference failed for: r0v149, types: [java.lang.Boolean, java.lang.String, X.EQT] */
    /* JADX WARN: Type inference failed for: r0v152, types: [X.50l, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v155, types: [X.1UG, java.util.Map, X.0DA, java.lang.String, X.07n] */
    /* JADX WARN: Type inference failed for: r0v158, types: [X.EQT, boolean] */
    /* JADX WARN: Type inference failed for: r0v159, types: [java.lang.Boolean, java.lang.String, X.EQT] */
    /* JADX WARN: Type inference failed for: r0v162, types: [X.50l, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v165, types: [X.1UG, java.util.Map, X.0DA, java.lang.String, X.07n] */
    /* JADX WARN: Type inference failed for: r0v170, types: [X.0DA, boolean] */
    /* JADX WARN: Type inference failed for: r0v171, types: [X.50l, java.lang.Boolean, X.0DA] */
    /* JADX WARN: Type inference failed for: r0v174, types: [X.1UG, java.util.Map, X.0DA, java.lang.String, X.07n] */
    /* JADX WARN: Type inference failed for: r0v181, types: [X.50l, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v184, types: [java.lang.String, boolean] */
    /* JADX WARN: Type inference failed for: r0v185, types: [java.lang.Long, java.util.Map, X.0DA] */
    /* JADX WARN: Type inference failed for: r0v187, types: [java.util.AbstractMap, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.util.Locale, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v193, types: [X.50l, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v196, types: [X.1UG, java.util.Map, X.0DA, java.lang.String, X.07n] */
    /* JADX WARN: Type inference failed for: r0v205, types: [X.50l, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v208, types: [X.1UG, java.util.Map, X.0DA, java.lang.String, X.07n] */
    /* JADX WARN: Type inference failed for: r0v215, types: [java.lang.Boolean, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v218, types: [X.50l, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v221, types: [X.1UG, java.util.Map, X.0DA, java.lang.String, X.07n] */
    /* JADX WARN: Type inference failed for: r0v226, types: [X.50l, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v231, types: [X.1UG, java.util.Map, X.0DA, java.lang.String, X.07n] */
    /* JADX WARN: Type inference failed for: r0v235, types: [X.50l, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v249, types: [X.50l, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v252, types: [X.1UG, java.util.Map, X.0DA, java.lang.String, X.07n] */
    /* JADX WARN: Type inference failed for: r0v270, types: [X.EQT, boolean] */
    /* JADX WARN: Type inference failed for: r0v271, types: [java.lang.Boolean, java.lang.String, X.EQT] */
    /* JADX WARN: Type inference failed for: r0v274, types: [X.50l, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v277, types: [X.1UG, java.util.Map, X.0DA, java.lang.String, X.07n] */
    /* JADX WARN: Type inference failed for: r0v289, types: [X.50l, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v292, types: [java.lang.String, boolean] */
    /* JADX WARN: Type inference failed for: r0v293, types: [java.lang.Long, java.util.Map, X.0DA] */
    /* JADX WARN: Type inference failed for: r0v295, types: [java.util.AbstractMap, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v302, types: [X.50l, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v305, types: [X.1UG, java.util.Map, X.0DA, java.lang.String, X.07n] */
    /* JADX WARN: Type inference failed for: r0v312, types: [X.50l, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v315, types: [X.1UG, java.util.Map, X.0DA, java.lang.String, X.07n] */
    /* JADX WARN: Type inference failed for: r0v324, types: [X.1UG, boolean] */
    /* JADX WARN: Type inference failed for: r0v327, types: [X.1UG, java.lang.Long, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v331, types: [X.50l, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v335, types: [java.lang.String, boolean] */
    /* JADX WARN: Type inference failed for: r0v338, types: [X.50l, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v341, types: [X.1UG, java.util.Map, X.0DA, java.lang.String, X.07n] */
    /* JADX WARN: Type inference failed for: r0v344, types: [java.lang.String, boolean] */
    /* JADX WARN: Type inference failed for: r0v347, types: [X.50l, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v350, types: [X.1UG, java.lang.String, boolean] */
    /* JADX WARN: Type inference failed for: r0v353, types: [X.1UG, java.lang.Long, java.util.Map, X.0DA] */
    /* JADX WARN: Type inference failed for: r0v355, types: [java.util.AbstractMap, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v359, types: [java.util.AbstractMap, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v365, types: [java.lang.String, boolean] */
    /* JADX WARN: Type inference failed for: r0v368, types: [X.50l, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v371, types: [X.1UG, java.util.Map, X.0DA, java.lang.String, X.07n] */
    /* JADX WARN: Type inference failed for: r0v375, types: [X.50l, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v382, types: [X.1UG, java.lang.String, boolean] */
    /* JADX WARN: Type inference failed for: r0v385, types: [X.1UG, java.lang.Long, java.util.Map, X.0DA] */
    /* JADX WARN: Type inference failed for: r0v395 */
    /* JADX WARN: Type inference failed for: r0v396, types: [int] */
    /* JADX WARN: Type inference failed for: r0v397, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v412, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v423 */
    /* JADX WARN: Type inference failed for: r0v424 */
    /* JADX WARN: Type inference failed for: r0v425 */
    /* JADX WARN: Type inference failed for: r0v426 */
    /* JADX WARN: Type inference failed for: r0v427 */
    /* JADX WARN: Type inference failed for: r0v428 */
    /* JADX WARN: Type inference failed for: r0v429 */
    /* JADX WARN: Type inference failed for: r0v430 */
    /* JADX WARN: Type inference failed for: r0v431 */
    /* JADX WARN: Type inference failed for: r0v432 */
    /* JADX WARN: Type inference failed for: r0v433 */
    /* JADX WARN: Type inference failed for: r0v434 */
    /* JADX WARN: Type inference failed for: r0v63, types: [java.util.Map, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v67, types: [java.util.Map, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.Map, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v71, types: [java.util.Map, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v75, types: [java.util.Map, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v79, types: [java.util.Map, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v83, types: [java.util.Map, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v87, types: [java.util.Map, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v91, types: [java.util.Map, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r301v0, types: [X.50j] */
    @Override // X.C50k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void BZX(java.util.Map r302, java.util.Map r303, java.lang.String r304) {
        /*
            Method dump skipped, instructions count: 4695
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50j.BZX(java.util.Map, java.util.Map, java.lang.String):void");
    }
}
