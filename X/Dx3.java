package X;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: Dx3.class */
public final class Dx3 extends C1rj {
    public GL7 A00;
    public FyG A01;

    public Dx3() {
        super("NTTapActionWrapperComponent");
    }

    public final Object[] A0k() {
        return new Object[]{this.A01, this.A00};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        GL7 gl7 = this.A00;
        FyG fyG = this.A01;
        GL7 A02 = GL7.A02(gl7);
        if (A02 == null) {
            return null;
        }
        C1rs A00 = FJ9.A00(r302, A02, fyG);
        FIJ A05 = FJ9.A05(gl7, fyG, 54);
        FIJ A052 = FJ9.A05(gl7, fyG, 59);
        if (gl7.getBoolean(48, true)) {
            A00.A1o(1LI.A09(r302, Dx3.class, "NTTapActionWrapperComponent", -1615766424));
            A00.A1s(1LI.A0C(r302, Dx3.class, "NTTapActionWrapperComponent", new Object[]{A05, A052}, -1824988210));
            7zN.A1D(A00, r302, Dx3.class, "NTTapActionWrapperComponent", 744681735);
        } else {
            A00.A1o(1LI.A0C(r302, Dx3.class, "NTTapActionWrapperComponent", new Object[]{A05, A052}, 389827567));
            A00.A1s(1LI.A0C(r302, Dx3.class, "NTTapActionWrapperComponent", new Object[]{A05, A052}, -1824988210));
        }
        return A00.A2V();
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        boolean z;
        switch (r302.A01) {
            case -1824988210:
                3xE r0 = (3xE) obj;
                Object[] objArr = r302.A03;
                FIJ fij = (FIJ) objArr[0];
                FIJ fij2 = (FIJ) objArr[1];
                View view = r0.A01;
                MotionEvent motionEvent = r0.A00;
                if (motionEvent.getAction() == 1 && fij != null) {
                    fij.A07();
                    view.performClick();
                    break;
                } else if (motionEvent.getAction() == 0 && fij2 != null) {
                    fij2.A07();
                    break;
                }
                break;
            case -1615766424:
                break;
            case -1048037474:
                1LI.A0J(r302, obj);
                return null;
            case 389827567:
                Object[] objArr2 = r302.A03;
                FIJ fij3 = (FIJ) objArr2[0];
                FIJ fij4 = (FIJ) objArr2[1];
                MotionEvent motionEvent2 = ((3xF) obj).A00;
                0fH.A0j("NTTapActionWrapperComponentSpec", motionEvent2.toString());
                if (motionEvent2.getAction() == 1 && fij3 != null) {
                    fij3.A07();
                } else if (motionEvent2.getAction() == 0 && fij4 != null) {
                    fij4.A07();
                }
                z = false;
                return Boolean.valueOf(z);
            default:
                return null;
        }
        z = true;
        return Boolean.valueOf(z);
    }
}
