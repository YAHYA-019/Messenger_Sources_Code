package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;

/* loaded from: Hsr.class */
public final class Hsr {
    public Context A00;
    public 1BY A01;
    public final C00i A02;
    public final C00i A03;
    public final C00i A04;
    public final C00i A05;
    public final C00i A06;
    public final C00i A07;
    public final C00i A08;
    public final C00i A09;
    public final C00i A0A;

    public Hsr(1BO r302) {
        Context A04 = AbF.A04((1BY) null);
        this.A00 = A04;
        this.A02 = AbF.A0Q(A04, 100181);
        this.A03 = AbH.A0E();
        this.A04 = 1BQ.A02(116158);
        this.A05 = 1BQ.A02(49642);
        this.A0A = 1BQ.A00();
        this.A06 = 1BQ.A02(116163);
        this.A07 = 1BV.A01((1BY) null, 116154);
        this.A08 = 1BQ.A02(116152);
        this.A09 = 1BQ.A02(83793);
        this.A01 = 7zL.A0Q(r302);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0048, code lost:
    
        if (r304 == null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.C5en A00(android.net.Uri r302, android.net.Uri r303, java.lang.String r304) {
        /*
            Method dump skipped, instructions count: 487
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Hsr.A00(android.net.Uri, android.net.Uri, java.lang.String):X.5en");
    }

    public ListenableFuture A01(FbUserSession fbUserSession, List list) {
        return AbF.A13(this.A03).D3C(new J5C(1, fbUserSession, null, this, list));
    }
}
