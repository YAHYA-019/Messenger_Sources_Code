package X;

import android.content.Context;
import com.facebook.forker.Process;

/* loaded from: Dxx.class */
public final class Dxx extends C1rj {
    public GL7 A00;
    public FyG A01;

    public Dxx() {
        super("NTCheckboxInputComponent");
    }

    public final Object[] A0k() {
        return new Object[]{this.A01, this.A00};
    }

    public /* bridge */ /* synthetic */ 1LI A0l() {
        return super.A0l();
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        QNu A0P = 4YU.A0P(r302);
        GL7 gl7 = this.A00;
        FyG fyG = this.A01;
        boolean z = A0P.A00;
        boolean z2 = A0P.A01;
        FIJ A05 = FJ9.A05(gl7, fyG, 55);
        FIJ A052 = FJ9.A05(gl7, fyG, 59);
        Context context = fyG.A00;
        2MR r0 = 2MR.A01;
        2Mg r02 = 2Me.A02;
        int Ad0 = gl7.Ad0(fyG, 72, 76, r02.A03(context, r0));
        int Ad02 = gl7.Ad0(fyG, 73, 77, r02.A03(context, 2MR.A28));
        boolean z3 = !gl7.getBoolean(57, false);
        boolean z4 = gl7.getBoolean(56, false);
        if (z2 != z4) {
            F4N f4n = (F4N) FJ3.A07(gl7, fyG);
            if (f4n != null) {
                F4N.A00(f4n, Boolean.valueOf(z4));
            }
            if (r302.A02 != null) {
                4YV.A1F(r302, Boolean.valueOf(z4), (-1) << (-1));
            }
            if (r302.A02 != null) {
                4YV.A1F(r302, Boolean.valueOf(z4), Process.WAIT_RESULT_STOPPED);
            }
            z = z4;
        }
        DrQ A00 = DzP.A00(r302);
        A00.A00.A03 = Boolean.valueOf(z);
        1Im A0C = z3 ? 1LI.A0C(r302, Dxx.class, "NTCheckboxInputComponent", new Object[]{A05, A052}, -952092468) : null;
        DzP dzP = A00.A00;
        dzP.A02 = A0C;
        dzP.A00 = Ad0;
        dzP.A01 = Ad02;
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
        if (i == -1048037474) {
            1LI.A0J(r302, obj);
            return null;
        }
        if (i != -952092468) {
            return null;
        }
        1Iv r0 = r302.A00;
        1Is r02 = r0.A01;
        1Iw r03 = r0.A00;
        boolean z = ((Ehh) obj).A01;
        Object[] objArr = r302.A03;
        FIJ fij = (FIJ) objArr[0];
        FIJ fij2 = (FIJ) objArr[1];
        Dxx dxx = (Dxx) r02;
        GL7 gl7 = dxx.A00;
        DKG.A0b(gl7, dxx.A01).A00[1] = z ? gl7.BCx(65, "on") : "";
        if (z) {
            if (fij != null) {
                fij.A07();
            }
        } else if (fij2 != null) {
            fij2.A07();
        }
        if (r03.A02 == null) {
            return null;
        }
        r03.A0H(7zS.A0M(0, z), "updateState:NTCheckboxInputComponent.updateChecked");
        return null;
    }

    @Override // X.C1rj
    public void A1N(1Iw r302, 2Yv r303) {
        QNu qNu = (QNu) r303;
        GL7 gl7 = this.A00;
        FyG fyG = this.A01;
        boolean z = gl7.getBoolean(56, false);
        Boolean valueOf = Boolean.valueOf(z);
        F4N.A00(DKG.A0b(gl7, fyG), z ? gl7.BCx(65, "on") : "");
        boolean booleanValue = valueOf.booleanValue();
        qNu.A00 = booleanValue;
        qNu.A01 = booleanValue;
    }

    @Override // X.C1rj
    public boolean A1U() {
        return true;
    }
}
