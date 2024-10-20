package X;

import com.facebook.auth.usersession.FbUserSession;
import com.mapbox.mapboxsdk.style.layers.Property;

/* renamed from: X.DbH, reason: case insensitive filesystem */
/* loaded from: DbH.class */
public final class C2092DbH extends 1Ni {
    /* JADX WARN: Type inference failed for: r0v8, types: [X.DbH, X.1Ni] */
    public static final C2092DbH A00(Object obj) {
        C02w c02w = (C02w) 1Bi.A03(0);
        Integer num = 1Lo.A05;
        return new 1Ni(new 1MV((FbUserSession) obj, 99680), c02w);
    }

    public static void A01(04J r301, EnumC07184j2 enumC07184j2, String str, String str2, String str3, long j) {
        String queryParameter = C0A2.A03(str).getQueryParameter(Property.SYMBOL_Z_ORDER_SOURCE);
        if (enumC07184j2 != EnumC07184j2.CLIENT_FLOW_LAUNCH) {
            0fH.A14(4YT.A00(241), "%s; flow name '%s', behavior '%s', deeplink '%s''", new Object[]{str3, queryParameter, "DEFAULT_LAUNCH", str});
        } else {
            0fH.A0Y(enumC07184j2.toString(), queryParameter, "DEFAULT_LAUNCH", str, 4YT.A00(241), "%s; flow name '%s', behavior '%s', deeplink '%s''");
        }
        1UG A08 = 1BK.A08(r301, 1BJ.A00(1943));
        if (A08.isSampled()) {
            A08.A5c(enumC07184j2, 4YT.A00(191));
            A08.A7R("flow_name", queryParameter);
            A08.A0C("ttl");
            A08.A7R("extra_data_json", str2);
            A08.A6H(4YT.A00(1386), Long.valueOf(j));
            if (enumC07184j2 == EnumC07184j2.CLIENT_ERROR) {
                A08.A7R(4YT.A00(1546), str3);
            }
            A08.BZL();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x012e, code lost:
    
        if (r0.equalsIgnoreCase("fb-messenger-secure") != false) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ void A02(android.content.Context r302, android.content.Intent r303, java.lang.Object r304) {
        /*
            Method dump skipped, instructions count: 460
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2092DbH.A02(android.content.Context, android.content.Intent, java.lang.Object):void");
    }
}
