package X;

import android.content.Context;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.9ys, reason: invalid class name */
/* loaded from: 9ys.class */
public final class C9ys implements 5OT {
    public /* bridge */ /* synthetic */ 1LI AK3(1Iw r302, 55B r303, 58D r304) {
        C9yq c9yq = (C9yq) r303;
        11T.A0F(r302, 0);
        11T.A0G(c9yq, 1, r304);
        Context context = r302.A0D;
        MigColorScheme migColorScheme = (MigColorScheme) 7zN.A0k(context, 16979);
        2cM A01 = 2cK.A01(r302, (String) null, 0);
        CharSequence charSequence = c9yq.A02;
        if (charSequence != null) {
            2KD A13 = 7zM.A13(r302, charSequence, 0);
            7zQ.A1M(migColorScheme, A13);
            A13.A2q(c9yq.A00);
            A13.A32(true);
            A13.A2Z();
            A13.A30(r304.A03);
            A13.A01.A0A = 59T.A00(context);
            2lQ r0 = 2lO.A02;
            7zS.A1K(A13, (2lO) null, 0S2.A0A, 7zQ.A0A());
            4YU.A1K(A01, A13);
        }
        CharSequence charSequence2 = c9yq.A03;
        if (charSequence2 != null) {
            2KD A132 = 7zM.A13(r302, charSequence2, 0);
            7zQ.A1M(migColorScheme, A132);
            A132.A2q(c9yq.A01);
            A132.A32(true);
            A132.A2Z();
            A132.A30(r304.A03);
            A132.A01.A0A = 59T.A00(context);
            4YU.A1K(A01, A132);
        }
        return A01.A00;
    }

    public Class BDi() {
        return C9yq.class;
    }
}
