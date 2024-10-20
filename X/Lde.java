package X;

import java.nio.charset.Charset;

/* loaded from: Lde.class */
public final class Lde implements MGL {
    public static final MIw A01 = new LdX();
    public final MIw A00;

    public Lde() {
        MIw mIw;
        MIw A00 = LdZ.A00();
        try {
            mIw = (MIw) JQy.A0p("com.google.protobuf.DescriptorMessageInfoFactory");
        } catch (Exception unused) {
            mIw = A01;
        }
        LdY ldY = new LdY(A00, mIw);
        Charset charset = LC1.A02;
        this.A00 = ldY;
    }

    public static boolean A00(MJf mJf) {
        boolean z = true;
        if (mJf.DCR() - 1 == 1) {
            z = false;
        }
        return z;
    }

    @Override // X.MGL
    public final MKz DC9(Class cls) {
        KYK A00;
        LAE A002;
        L5O A0C;
        L2m l2m;
        KwY A003;
        L5O A0C2;
        L2m A004;
        LEm.A0U(cls);
        MJf DCJ = this.A00.DCJ(cls);
        if (DCJ.DCP()) {
            if (K7f.class.isAssignableFrom(cls)) {
                A0C2 = LEm.A0D();
                A004 = L6y.A01();
            } else {
                A0C2 = LEm.A0C();
                A004 = L6y.A00();
            }
            return Ldc.A00(A004, DCJ.DC8(), A0C2);
        }
        boolean isAssignableFrom = K7f.class.isAssignableFrom(cls);
        boolean A005 = A00(DCJ);
        if (isAssignableFrom) {
            A00 = L70.A01();
            A002 = LAE.A01();
            A0C = LEm.A0D();
            if (A005) {
                l2m = L6y.A01();
                A003 = L6z.A01();
            } else {
                l2m = null;
                A003 = L6z.A01();
            }
        } else {
            A00 = L70.A00();
            A002 = LAE.A00();
            A0C = LEm.A0C();
            if (A005) {
                l2m = L6y.A00();
                A003 = L6z.A00();
            } else {
                l2m = null;
                A003 = L6z.A00();
            }
        }
        return Ldd.A0N(l2m, A002, A003, DCJ, A00, A0C);
    }
}
