package X;

import android.content.Context;
import android.view.View;

/* renamed from: X.Df6, reason: case insensitive filesystem */
/* loaded from: Df6.class */
public final class C2145Df6 extends KTY {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ EAX A01;

    public C2145Df6(Context context, EAX eax) {
        this.A01 = eax;
        this.A00 = context;
    }

    public void A01(View view, int i, int i2) {
        11T.A0F(view, 0);
        EAX eax = this.A01;
        if (eax.A0E) {
            eax.A02 = i;
            eax.A03 = view.getTop();
            eax.A01 = eax.A0M ? eax.A02 : view.getHeight();
            EAX.A03(eax, eax.A03, eax.A02);
        }
        ETa eTa = eax.A08;
        if (eTa != null) {
            eTa.A00(view, i2);
        }
    }

    public void A02(View view, MFG mfg) {
        this.A01.A0K = false;
    }

    public void A03(View view, MFG mfg) {
        View view2;
        View A01;
        EAX eax = this.A01;
        eax.A0K = true;
        GHj gHj = eax.A09;
        if (gHj == null) {
            11T.A0L("transitionConfiguration");
            throw 0Q8.createAndThrow();
        }
        EAX.A01(gHj.B9G(0S2.A0C), eax);
        if (mfg == EAX.A0T) {
            if (!eax.A0J) {
                eax.A0B(0S2.A00);
            }
            eax.A05();
        } else if (AnonymousClass524.A00(this.A00) && eax.A0L && (view2 = eax.A04) != null && (A01 = C2cd.A01(view2)) != null) {
            C2cd.A04(A01, 1000L);
        }
        ETa eTa = eax.A08;
        if (eTa != null) {
            eTa.A01(mfg);
        }
        Runnable runnable = eax.A0D;
        if (runnable != null) {
            runnable.run();
        }
        eax.A0D = null;
    }
}
