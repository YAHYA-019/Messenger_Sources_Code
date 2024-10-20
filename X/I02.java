package X;

import android.content.Context;
import com.facebook.inject.FbInjector;

/* loaded from: I02.class */
public final class I02 {
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public final C00p A03;
    public final 0QO A04;
    public final 2YL A05;
    public final Htv A06;
    public final 2YE A07;
    public final HQZ A08;
    public final HR3 A09;

    public I02(2YE r302, HR3 hr3, GXh gXh) {
        1BL.A1F(hr3, r302);
        this.A09 = hr3;
        this.A07 = r302;
        this.A05 = new 2YL(new Ipr(this));
        HQZ hqz = new HQZ(this);
        this.A08 = hqz;
        this.A03 = new C00p(10);
        this.A04 = new 0QO(0);
        AbR abR = hr3.A00;
        Context A01 = FbInjector.A01();
        AbL.A0y(abR);
        try {
            Htv htv = new Htv(hqz, gXh);
            1Bn.A0K();
            FbInjector.A04(A01);
            this.A06 = htv;
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A01);
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0016, code lost:
    
        if (r301.A02 == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A00(X.I02 r301) {
        /*
            r0 = r301
            boolean r0 = r0.A00
            r302 = r0
            r0 = r301
            boolean r0 = r0.A01
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L19
            r0 = r301
            boolean r0 = r0.A02
            r303 = r0
            r0 = 1
            r304 = r0
            r0 = r303
            if (r0 != 0) goto L1b
        L19:
            r0 = 0
            r304 = r0
        L1b:
            r0 = r301
            r1 = r304
            r0.A00 = r1
            r0 = r304
            r1 = r302
            if (r0 != r1) goto L31
            r0 = r301
            X.2YL r0 = r0.A05
            r305 = r0
            r0 = r305
            r0.A01()
        L30:
            return
        L31:
            r0 = r301
            X.Htv r0 = r0.A06
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L30
            r0 = r306
            boolean r0 = r0.A01
            r303 = r0
            r0 = r303
            r1 = r304
            if (r0 == r1) goto L30
            r0 = r306
            r1 = r304
            r0.A01 = r1
            r0 = r306
            r0.A01()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I02.A00(X.I02):void");
    }
}
