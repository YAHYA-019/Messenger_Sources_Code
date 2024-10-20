package X;

import android.content.Context;
import com.facebook.forker.Process;

/* loaded from: Dxn.class */
public final class Dxn extends C1rj {
    public GL7 A00;
    public FyG A01;

    public Dxn() {
        super("NTSwitchComponent");
    }

    public final Object[] A0k() {
        return new Object[]{this.A01, this.A00};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        QNv A0P = 4YU.A0P(r302);
        GL7 gl7 = this.A00;
        FyG fyG = this.A01;
        boolean z = A0P.A01;
        GL7 gl72 = A0P.A00;
        GL7 Ay2 = gl7.Ay2(56);
        GL7 Ay22 = gl7.Ay2(58);
        Context context = fyG.A00;
        2MR r0 = 2MR.A05;
        2Mg r02 = 2Me.A02;
        int Ad0 = gl7.Ad0(fyG, 67, 73, r02.A03(context, r0));
        FIJ fij = null;
        FIJ A04 = Ay2 != null ? FJ9.A04(Ay2, fyG) : null;
        if (Ay22 != null) {
            fij = FJ9.A04(Ay22, fyG);
        }
        boolean z2 = gl7.getBoolean(57, false);
        if (gl72.getBoolean(57, false) != z2) {
            F4N f4n = (F4N) FJ3.A07(gl7, fyG);
            Boolean valueOf = Boolean.valueOf(z2);
            F4N.A00(f4n, valueOf);
            if (r302.A02 != null) {
                4YV.A1F(r302, gl7, Process.WAIT_RESULT_STOPPED);
            }
            if (r302.A02 != null) {
                float f = -0.0f;
                4YV.A1F(r302, valueOf, (-1) << (-1));
            }
            z = z2;
        }
        DrM A00 = DzJ.A00(r302);
        A00.A00.A05 = z;
        A00.A2J(Integer.toString(gl7.Acj()));
        A00.A00.A04 = 1LI.A0C(r302, Dxn.class, "NTSwitchComponent", new Object[]{fij, A04}, -1554445437);
        A00.A0S();
        A00.A2C(C26z.LEFT, 1);
        A00.A2C(C26z.RIGHT, 1);
        if (Ad0 != 0) {
            Context context2 = r302.A0D;
            A00.A00.A00 = EXz.A00(Ad0, r02.A01(context2));
            context2.getResources();
            A00.A00.A01 = EXz.A00(0De.A00(Ad0, 0.3f), r02.A03(context2, 2MR.A0p));
        }
        A00.A0J();
        return A00.A00;
    }

    @Override // X.C1rj
    public /* bridge */ /* synthetic */ 2Yv A12() {
        return (2Yv) new Object();
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        int i = r302.A01;
        if (i != -1554445437) {
            4YV.A1G(r302, obj, i);
            return null;
        }
        1Iv r0 = r302.A00;
        1Is r02 = r0.A01;
        1Iw r03 = r0.A00;
        boolean z = ((Ehh) obj).A01;
        Object[] objArr = r302.A03;
        FIJ fij = (FIJ) objArr[0];
        FIJ fij2 = (FIJ) objArr[1];
        Dxn dxn = (Dxn) r02;
        GL7 gl7 = dxn.A00;
        FyG fyG = dxn.A01;
        F4N A0b = DKG.A0b(gl7, fyG);
        Boolean valueOf = Boolean.valueOf(z);
        A0b.A00[1] = valueOf;
        if (r03.A02 != null) {
            4YV.A1F(r03, valueOf, (-1) << (-1));
        }
        FAd A0Y = DKC.A0Y(fyG);
        A0Y.A09(fyG, new SEF(A0Y, gl7, fyG, z));
        if (z) {
            if (fij == null) {
                return null;
            }
            fij.A07();
            return null;
        }
        if (fij2 == null) {
            return null;
        }
        fij2.A07();
        return null;
    }

    @Override // X.C1rj
    public void A1N(1Iw r302, 2Yv r303) {
        QNv qNv = (QNv) r303;
        GL7 gl7 = this.A00;
        FyG fyG = this.A01;
        Boolean A03 = GL7.A03(gl7, 57);
        F4N.A00(DKG.A0b(gl7, fyG), A03);
        qNv.A01 = A03.booleanValue();
        qNv.A00 = gl7;
    }

    @Override // X.C1rj
    public boolean A1U() {
        return true;
    }
}
