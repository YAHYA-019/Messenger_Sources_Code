package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.search.constants.DataSourceIdentifier;

/* loaded from: Cq5.class */
public final class Cq5 implements DIW, DEk {
    public String A01;
    public final C00i A02;
    public final C00i A03;
    public final 53M A04;
    public final C1gb A05;
    public final Context A07;
    public final C1325Ae3 A06 = new C1325Ae3();
    public String A00 = "";

    public Cq5(Context context, FbUserSession fbUserSession, 53M r304) {
        this.A07 = context;
        this.A04 = r304;
        1MV A00 = 1Lo.A00(context, fbUserSession, 84330);
        this.A03 = A00;
        ((CQU) A00.get()).A09(context);
        this.A05 = AbJ.A0Z();
        this.A02 = 7zL.A0R(context, 16454);
    }

    public void A5L(DFe dFe) {
        this.A06.A00(dFe);
    }

    public DataSourceIdentifier AgX() {
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0089, code lost:
    
        if (r312 == (-1)) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0111, code lost:
    
        if (r0.equals(X.53M.A0b) != false) goto L33;
     */
    /* JADX WARN: Type inference failed for: r0v41, types: [com.google.common.util.concurrent.ListenableFuture, com.google.common.util.concurrent.SettableFuture] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ X.C1323Ae1 Cpm(X.ByH r302, java.lang.Object r303) {
        /*
            Method dump skipped, instructions count: 554
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Cq5.Cpm(X.ByH, java.lang.Object):X.Ae1");
    }

    @Override // X.DEk
    public void CuT(String str) {
        this.A01 = str;
    }

    public String getFriendlyName() {
        return "ServerMsysNonSDKDatasource";
    }
}
