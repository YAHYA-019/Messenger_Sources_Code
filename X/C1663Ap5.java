package X;

import android.view.ViewStub;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.Ap5, reason: case insensitive filesystem */
/* loaded from: Ap5.class */
public final class C1663Ap5 extends HGC {
    public final int A00;
    public final MigColorScheme A01;
    public final C11184vr A02;

    public C1663Ap5(MigColorScheme migColorScheme, C11184vr c11184vr) {
        11T.A0F(migColorScheme, 2);
        this.A02 = c11184vr;
        this.A01 = migColorScheme;
        this.A00 = c11184vr.hashCode();
    }

    public int A00() {
        return this.A00;
    }

    public int A01() {
        return 2132543398;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [X.2Wo, java.lang.Object] */
    public void A03(C2lb c2lb, int i) {
        ViewStub viewStub = (ViewStub) c2lb.A0I.findViewById(2131366770);
        if (viewStub != null) {
            ?? obj = new Object();
            ((2Wo) obj).A01 = viewStub;
            6JN r0 = (6JN) 1Bn.A0A(99640);
            r0.A09 = true;
            r0.A04 = this.A01;
            r0.A08 = obj;
            r0.A03(new Cow(r0), this.A02);
        }
    }

    public boolean A04() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001c, code lost:
    
        if (r301.A00 != r302.A00()) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A05(X.HGC r302) {
        /*
            r301 = this;
            r0 = r302
            boolean r0 = r0 instanceof X.C1663Ap5
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L1f
            r0 = r301
            int r0 = r0.A00
            r304 = r0
            r0 = r302
            X.HGC r0 = (X.HGC) r0
            int r0 = r0.A00()
            r305 = r0
            r0 = 1
            r303 = r0
            r0 = r304
            r1 = r305
            if (r0 == r1) goto L21
        L1f:
            r0 = 0
            r303 = r0
        L21:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1663Ap5.A05(X.HGC):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001c, code lost:
    
        if (r301.A00 != r302.A00()) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A06(X.HGC r302) {
        /*
            r301 = this;
            r0 = r302
            boolean r0 = r0 instanceof X.C1663Ap5
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L1f
            r0 = r301
            int r0 = r0.A00
            r304 = r0
            r0 = r302
            X.HGC r0 = (X.HGC) r0
            int r0 = r0.A00()
            r305 = r0
            r0 = 1
            r303 = r0
            r0 = r304
            r1 = r305
            if (r0 == r1) goto L21
        L1f:
            r0 = 0
            r303 = r0
        L21:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1663Ap5.A06(X.HGC):boolean");
    }
}
