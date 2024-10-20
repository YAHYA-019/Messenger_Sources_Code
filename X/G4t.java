package X;

import com.facebook.auth.usersession.FbUserSession;

/* loaded from: G4t.class */
public final class G4t implements Runnable {
    public static final String __redex_internal_original_name = "BrowserReportingOrchestrator$1";
    public final /* synthetic */ FbUserSession A00;
    public final /* synthetic */ F6X A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    public G4t(FbUserSession fbUserSession, F6X f6x, String str, String str2) {
        this.A01 = f6x;
        this.A00 = fbUserSession;
        this.A02 = str;
        this.A03 = str2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x019f, code lost:
    
        if (r312 != null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x01ad, code lost:
    
        r0.A09(X.1BJ.A00(com.facebook.acra.constants.ActionId.VIDEO_DISPLAYED), r312);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x01c3, code lost:
    
        if (r0 == null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01c6, code lost:
    
        r0.A09("thread_id", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01d2, code lost:
    
        r0 = X.AnonymousClass001.A0b(r0, r0.A05);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01e4, code lost:
    
        if (r0 == null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01e7, code lost:
    
        r0.A09("tracking_codes", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01f4, code lost:
    
        r0.A09(com.mapbox.mapboxsdk.style.layers.Property.SYMBOL_Z_ORDER_SOURCE, "MSGR");
        r0.A0A("redirect_chain", r0);
        r0 = new X.Q6f();
        X.DKC.A1S(r0, r0, "input");
        X.DKC.A1S(((X.C3t8) r0.A06.get()).A00(), r0, "nt_context");
        r0 = new X.5Dh(r0);
        r0 = r0.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0269, code lost:
    
        r0 = ((X.AbstractC08294mh) ((com.facebook.graphql.executor.GraphQLResult) X.AbL.A0Z(X.7zM.A0K(r0), r0, 718770159051174L).get())).A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0270, code lost:
    
        if (r0 == null) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0273, code lost:
    
        r0 = (X.2JX) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0285, code lost:
    
        r0 = X.1BL.A0L(r0, 782239731, -1765610735);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x028e, code lost:
    
        if (r0 == null) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x02ad, code lost:
    
        r0 = (X.C2221Dhd) r0.A0L(947624312, X.C2221Dhd.class, 2015130118);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x02b6, code lost:
    
        if (r0 == null) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x02bf, code lost:
    
        r0 = r0.A0r(1338727505);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x02c6, code lost:
    
        if (r0 == null) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x02c9, code lost:
    
        r0 = X.1BK.A05();
        r0.putBoolean("EXTRA_REPORT_SUCCEED", true);
        X.L5x.A01(r0, r0, "ACTION_REPORT_RESULT", true, false);
        r0 = X.C3o5.A0D(r0, com.facebook.browser.liteclient.report.BrowserRapidReportingHostActivity.class);
        X.FJ8.A07(r0, r0, "reporting_prompt");
        r0.putExtra("report_id", r0);
        r0.putExtra("screenshot_uri", r301.A02);
        r0.putExtra("html_source_uri", (java.lang.String) null);
        r0.addFlags(268435456);
        r0.addFlags(65536);
        X.0LS.A0A(r0, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0338, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01aa, code lost:
    
        if (r0 != null) goto L48;
     */
    /* JADX WARN: Type inference failed for: r0v161, types: [X.0w6, java.lang.Object] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void run() {
        /*
            Method dump skipped, instructions count: 870
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.G4t.run():void");
    }
}
