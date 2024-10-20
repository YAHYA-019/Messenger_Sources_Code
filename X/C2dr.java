package X;

import android.content.Context;

/* renamed from: X.2dr, reason: invalid class name */
/* loaded from: 2dr.class */
public final class C2dr {
    public Context A00;
    public 1PA A01;
    public 2Pr A02;
    public boolean A03;
    public 1BY A04;
    public final C00i A05;
    public final C00i A06;
    public final C00i A07;
    public final C00i A08;
    public final C00i A09;
    public final C00i A0A;

    public C2dr(1BO r302) {
        Context context = (Context) 1Bn.A0E((Context) null, (1BY) null, 83719);
        this.A00 = context;
        this.A08 = new 1HH(context, 65728);
        this.A07 = new 1BQ(67724);
        this.A05 = new 1BV((1BY) null, 17002);
        this.A09 = new 1BQ(6);
        this.A06 = new 1BQ(84021);
        this.A0A = new 1BQ(16461);
        this.A04 = new 1BY(r302);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0058, code lost:
    
        if (((X.2zS) r0.get()).A03() == X.2bZ.A02) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00a8, code lost:
    
        if (((X.2zS) r0.get()).A03() == X.2bZ.A05) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A00(X.C2dr r301, java.lang.String r302) {
        /*
            Method dump skipped, instructions count: 698
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2dr.A00(X.2dr, java.lang.String):void");
    }

    public String A01() {
        int ordinal = ((2zS) this.A07.get()).A03().ordinal();
        return ordinal != 4 ? ordinal != 3 ? ordinal != 2 ? ordinal != 1 ? "ConnectionStatusNotification - Connected" : "ConnectionStatusNotification - Connected To Captive Portal" : "ConnectionStatusNotification - Connecting" : "ConnectionStatusNotification - Waiting To Connect" : "ConnectionStatusNotification - No Internet";
    }
}
