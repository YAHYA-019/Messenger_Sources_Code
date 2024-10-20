package X;

import android.content.Context;
import android.view.View;
import com.facebook.inject.FbInjector;
import com.facebook.messaging.composer.model.ComposerTopSheetOpenParams;

/* loaded from: Euw.class */
public final class Euw {
    public ComposerTopSheetOpenParams A00;
    public boolean A01;
    public final 1Br A02;
    public final F5e A03;
    public final View A04;

    public Euw(View view, ComposerTopSheetOpenParams composerTopSheetOpenParams) {
        this.A04 = view;
        this.A00 = composerTopSheetOpenParams;
        1Br A00 = 1Bu.A00(649);
        this.A02 = A00;
        C1F6 c1f6 = (C1F6) 1Br.A0B(A00);
        Context A01 = FbInjector.A01();
        AbL.A0y(c1f6);
        try {
            F5e f5e = new F5e(view);
            1Bn.A0K();
            FbInjector.A04(A01);
            this.A03 = f5e;
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A01);
            throw th;
        }
    }

    public final void A00() {
        if (this.A01) {
            return;
        }
        this.A01 = true;
        F5e f5e = this.A03;
        f5e.A00.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        f5e.A02.A07(r0.getMeasuredHeight());
    }
}
