package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.collect.ImmutableList;

/* renamed from: X.Azc, reason: case insensitive filesystem */
/* loaded from: Azc.class */
public final class C2015Azc extends C1rj {
    public int A00;
    public BgS A01;
    public MigColorScheme A02;
    public ImmutableList A03;

    public C2015Azc() {
        super("ActiveStatusRadioButtonGroupLayout");
    }

    public final Object[] A0k() {
        return new Object[]{this.A02, Integer.valueOf(this.A00), this.A03, this.A01};
    }

    public /* bridge */ /* synthetic */ 1LI A0l() {
        return super.A0l();
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        B1N A0P = 4YU.A0P(r302);
        MigColorScheme migColorScheme = this.A02;
        ImmutableList immutableList = this.A03;
        BgS bgS = this.A01;
        int i = A0P.A00;
        1BL.A1H(migColorScheme, immutableList, bgS);
        CNf cNf = new CNf();
        cNf.A01 = Integer.valueOf(i);
        CNf.A01(cNf, r302, 10);
        int size = immutableList.size();
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= size) {
                break;
            }
            cNf.A05(((DHI) immutableList.get(i3)).B0Q(), Integer.valueOf(i3));
            i2 = i3 + 1;
        }
        Bmz A02 = cNf.A02();
        2cM A01 = 2cK.A01(r302, (String) null, 0);
        ImmutableList immutableList2 = A02.A01;
        11T.A0A(immutableList2);
        DFn dFn = A02.A00;
        11T.A0A(dFn);
        2cM A012 = 2cK.A01(r302, (String) null, 0);
        int size2 = immutableList2.size();
        for (int i4 = 0; i4 < size2; i4++) {
            BRP brp = (BRP) immutableList2.get(i4);
            55N A00 = 55M.A00(r302);
            11T.A0D(brp);
            Integer B0R = ((DHI) immutableList.get(i4)).B0R();
            CvX cvX = new CvX(6, dFn, immutableList, brp, bgS);
            11T.A0F(brp, 0);
            boolean A1Z = 7zP.A1Z(B0R);
            CJ4 cj4 = new CJ4();
            cj4.A07 = migColorScheme;
            55E c58r = B0R != 0S2.A00 ? new C58r(migColorScheme, brp.A03, A1Z) : new C58e(0S2.A01);
            11T.A0D(c58r);
            cj4.A04 = c58r;
            CharSequence charSequence = brp.A01;
            cj4.A04(charSequence);
            cj4.A02(C5wy.A00(cvX, null, migColorScheme, charSequence, 7zK.A00(23), A1Z, brp.A03));
            AnonymousClass544 A013 = cj4.A01();
            11T.A0A(A013);
            A00.A2X(A013);
            A012.A2d(A00);
            4YU.A1O(A012, 2RH.A09, C26z.START);
        }
        7zL.A1G(A012, A01);
        4YU.A1O(A01, 2RH.A09, C26z.START);
        7zO.A1G(A01, 2RH.A04);
        return A01.A00;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2Yv, java.lang.Object] */
    @Override // X.C1rj
    public /* bridge */ /* synthetic */ 2Yv A12() {
        return new Object();
    }

    @Override // X.C1rj
    public void A1N(1Iw r302, 2Yv r303) {
        ((B1N) r303).A00 = Integer.valueOf(this.A00).intValue();
    }

    @Override // X.C1rj
    public boolean A1U() {
        return true;
    }
}
