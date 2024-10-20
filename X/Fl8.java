package X;

import android.content.Intent;
import com.facebook.payments.cart.model.SimpleCartScreenConfig;
import com.facebook.widget.loadingindicator.LoadingIndicatorView;
import com.google.common.collect.ImmutableList;

/* loaded from: Fl8.class */
public final class Fl8 implements GK0 {
    public final /* synthetic */ DaA A00;

    public Fl8(DaA daA) {
        this.A00 = daA;
    }

    @Override // X.GK0
    public void BqM(Throwable th) {
        DaA.A05(this.A00);
    }

    @Override // X.GK0
    public void BqN(SimpleCartScreenConfig simpleCartScreenConfig) {
        DaA daA = this.A00;
        daA.A09 = simpleCartScreenConfig;
        if (!daA.A03.BMq()) {
            LoadingIndicatorView.A01(daA.A0C, 0S2.A0C, false);
        }
        DaA.A06(daA);
    }

    @Override // X.GK0
    public void CJS(Throwable th) {
        DaA.A05(this.A00);
    }

    @Override // X.GK0
    public void CJT(ImmutableList immutableList) {
        DaA daA = this.A00;
        daA.A0D = immutableList;
        if (!daA.A03.BMq()) {
            LoadingIndicatorView.A01(daA.A0C, 0S2.A0C, false);
        }
        DaA.A06(daA);
    }

    @Override // X.GK0
    public void Cbm(Intent intent) {
        this.A00.A04.A02(intent);
    }
}
