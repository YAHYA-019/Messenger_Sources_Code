package X;

import android.content.Context;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.mig.scheme.schemes.LightColorScheme;
import com.google.common.collect.ImmutableList;

/* loaded from: B0d.class */
public final class B0d extends C1rj {
    public static final MigColorScheme A05 = LightColorScheme.A00();
    public C2kx A00;
    public Bbt A01;
    public MigColorScheme A02;
    public ImmutableList A03;
    public boolean A04;

    public B0d() {
        super("SwitchAccountsComponent");
        this.A02 = A05;
    }

    public final Object[] A0k() {
        return new Object[]{this.A02, this.A00, this.A03, this.A01, Boolean.valueOf(this.A04)};
    }

    public boolean A0o() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x015d, code lost:
    
        if (X.CDo.A00(r0) == 7) goto L24;
     */
    @Override // X.C1rj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.1LI A0z(X.1Iw r302, int r303, int r304) {
        /*
            Method dump skipped, instructions count: 482
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.B0d.A0z(X.1Iw, int, int):X.1LI");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2Yv, java.lang.Object] */
    @Override // X.C1rj
    public /* bridge */ /* synthetic */ 2Yv A12() {
        return new Object();
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        Bbt bbt;
        int i = r302.A01;
        if (i == -1048037474) {
            1LI.A0J(r302, obj);
            return null;
        }
        if (i != 1925812722 || (bbt = ((B0d) r302.A00.A01).A01) == null) {
            return null;
        }
        B9K b9k = bbt.A00;
        CallerContext callerContext = B9K.A15;
        AbF.A0V(b9k.A0W).A0D(BMG.A3N, "");
        Integer num = 0S2.A01;
        ((C3T0) b9k.A0e.get()).A02(num);
        Context context = b9k.getContext();
        if (context == null) {
            return null;
        }
        ((2Vz) b9k.A0V.get()).A05(context, num, "", "", false, false);
        return null;
    }

    @Override // X.C1rj
    public void A1N(1Iw r302, 2Yv r303) {
        B1G b1g = (B1G) r303;
        Object A0A = 1Bn.A0A(85282);
        if (A0A != null) {
            b1g.A00 = (CDo) A0A;
        }
    }

    @Override // X.C1rj
    public boolean A1U() {
        return true;
    }
}
