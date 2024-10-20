package X;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: Dz4.class */
public final class Dz4 extends C1rj {
    public GL7 A00;
    public FyG A01;

    public Dz4() {
        super("NTButton2Component");
    }

    public static GL7 A00(GL7 gl7, int... iArr) {
        GL7 gl72;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= iArr.length) {
                gl72 = null;
                break;
            }
            gl72 = gl7.Ay2(iArr[i2]);
            if (gl72 != null) {
                break;
            }
            i = i2 + 1;
        }
        return gl72;
    }

    public final Object[] A0k() {
        return new Object[]{this.A01, this.A00};
    }

    public /* bridge */ /* synthetic */ 1LI A0l() {
        return super.A0l();
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        GL7 A00;
        GL7 A002;
        E0C A0P = 4YU.A0P(r302);
        GL7 gl7 = this.A00;
        FyG fyG = this.A01;
        boolean z = A0P.A01;
        boolean z2 = A0P.A00;
        GL7 Ay2 = gl7.Ay2(55);
        GHz gHz = null;
        FIJ A04 = Ay2 != null ? FJ9.A04(Ay2, fyG) : null;
        boolean z3 = gl7.getBoolean(61, true);
        if (!z3) {
            A00 = A00(gl7, 59, 57);
            A002 = A00(gl7, 58, 56);
        } else if (z2 && z) {
            A00 = A00(gl7, 63, 57);
            A002 = A00(gl7, 62, 56);
        } else {
            A00 = A00(gl7, 57);
            A002 = A00(gl7, 56);
        }
        1LI A01 = A00 != null ? FJ9.A01(r302, A00, fyG) : null;
        if (A002 != null) {
            gHz = FJ9.A06(A002, fyG);
        }
        if (A01 == null) {
            A01 = AbJ.A0L(r302).A00;
        }
        DtL A003 = F29.A00(A01, r302, gHz, z3);
        if (z3) {
            A003.A1s(1LI.A0C(r302, Dz4.class, "NTButton2Component", 7zN.A1b(A04, z), -1336101728));
        }
        7zL.A1J(A003);
        return A003.A2V();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2Yv, java.lang.Object] */
    @Override // X.C1rj
    public /* bridge */ /* synthetic */ 2Yv A12() {
        return new Object();
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        int i = r302.A01;
        if (i != -1336101728) {
            if (i != -1048037474) {
                return null;
            }
            1LI.A0J(r302, obj);
            return null;
        }
        3xE r0 = (3xE) obj;
        1Iw r02 = r302.A00.A00;
        MotionEvent motionEvent = r0.A00;
        View view = r0.A01;
        Object[] objArr = r302.A03;
        FIJ fij = (FIJ) objArr[0];
        boolean A1Z = 7zO.A1Z(objArr, 1);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            if (A1Z && r02.A02 != null) {
                r02.A0H(new C2l4(new Object[0], 0), "updateState:NTButton2Component.onPressDown");
            }
        } else if (actionMasked == 1 || actionMasked == 3) {
            if (A1Z && r02.A02 != null) {
                r02.A0H(new C2l4(new Object[0], 1), "updateState:NTButton2Component.onPressUp");
            }
            if (actionMasked == 1 && fij != null && F29.A01(view, motionEvent)) {
                fij.A07();
            }
        }
        return true;
    }

    @Override // X.C1rj
    public void A1N(1Iw r302, 2Yv r303) {
        E0C e0c = (E0C) r303;
        boolean z = false;
        if (A00(this.A00, 63, 62) != null) {
            z = true;
        }
        Boolean valueOf = Boolean.valueOf(z);
        e0c.A00 = false;
        e0c.A01 = valueOf.booleanValue();
    }

    @Override // X.C1rj
    public boolean A1U() {
        return true;
    }
}
