package X;

import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.fury.context.ReqContext;

/* renamed from: X.3ym, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3ym.class */
public final class C03633ym {
    public final C00i A00;
    public final 1Lb A01;
    public final 1Od A02;
    public final C03623yk A03;

    public C03633ym(1Lb r302, 1Od r303, C00i c00i, C03623yk c03623yk) {
        this.A01 = r302;
        this.A00 = c00i;
        this.A03 = c03623yk;
        this.A02 = r303;
    }

    public void A00(Boolean bool, Long l, String str, String str2, String str3, String str4, String str5) {
        ReqContext A00 = AnonymousClass018.A00();
        0fH.A0d(str3, A00 != null ? StringFormatUtil.formatStrLocaleSafe("%x", Long.valueOf(1EU.A00(A00))) : 1BJ.A00(911), "RuntimeTracing", "Request for GeoApiAnalyticsLogger.reportGeoApiInternalUse() from %s with pfhId %s");
        C00i c00i = this.A00;
        1UG A002 = 1UD.A00((04J) c00i.get(), 1ZG.A01, 1BJ.A00(956));
        if (A002.isSampled()) {
            A002.A7R("moduleName", str);
            A002.A7R("methodName", str2);
            A002.A7R("callerName", str3);
            A002.A7R("locatonProviderAccessType", str4);
            A002.A7R("locationProviderType", str5);
            A002.A5H("isCacheUsedDirectly", bool);
            A002.A6H("locationFreshness", l);
            A002.BZL();
        }
        Object obj = c00i.get();
        11T.A0A(obj);
        04J r0 = (04J) obj;
        11T.A0F(r0, 1);
        3tP.A00(r0, "reportGeoApiInternalUse", str, str2, str3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0024, code lost:
    
        if (X.C03623yk.A01(r0) == X.0S2.A00) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A01(java.lang.Boolean r302, java.lang.String r303, java.lang.String r304, java.lang.String r305, java.lang.String r306, java.lang.String r307, boolean r308) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03633ym.A01(java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean):void");
    }
}
