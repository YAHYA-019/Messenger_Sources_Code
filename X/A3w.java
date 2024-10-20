package X;

import android.content.Context;
import com.facebook.privacy.zone.policy.ZonePolicy;

/* loaded from: A3w.class */
public final class A3w implements AYf {
    public final 2Of A00;

    public A3w(2Of r302) {
        this.A00 = r302;
    }

    @Override // X.AYf
    public void C6e(1Iw r302, C5j5 c5j5, C9c2 c9c2, 5vW r305) {
        5vQ r0;
        82X AxW;
        CharSequence charSequence;
        11T.A0F(r302, 0);
        1BL.A1F(c5j5, r305);
        2Of r02 = this.A00;
        5vV r03 = (5vV) r305;
        C5fv c5fv = r03.A00;
        MrA.A00(MfU.A0K, r02, c5fv);
        Integer num = null;
        boolean z = false;
        if (!(c5fv instanceof 5gC) && ((!(c5fv instanceof C5n8) || ((C5n8) c5fv).A09.length() <= 0) && ((AxW = c5fv.AxW(C5m5.A00)) == null || (charSequence = (CharSequence) AxW.A01) == null || charSequence.length() == 0))) {
            0fH.A18("CopyMessageActionDrawerListener", "Tried to copy a message that wasn't a TextMessage or CopyableXMAMessage: {%s}", new Object[]{c5fv.getClass()});
            return;
        }
        5vU r04 = r03.A01;
        5vP r05 = (5vP) r04.A01.A00(5vP.A01);
        C82k c82k = (C82k) c5fv.AxW(5lX.A00);
        if (r04.A06) {
            if (r05 != null && (r0 = r05.A00) != null) {
                num = r0.A00;
            }
            if (num == 0S2.A0C) {
                z = true;
            }
        }
        Context A0A = 7zL.A0A(r302);
        C5ua.A00(new A27(1HG.A00(A0A, 100196), c82k, c5j5, c5fv, z), ZonePolicy.A0F);
        F8q.A00(new FEd(2131955033), (F8q) 1Hv.A02(A0A, 99435), false);
    }
}
