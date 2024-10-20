package X;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleRegistry;

/* loaded from: Fxq.class */
public final class Fxq implements GL4, GLc, GHR {
    public final LifecycleRegistry A00;
    public final E8b A01;
    public final Context A02;
    public final FYu A03;
    public final FZn A04;
    public final /* synthetic */ FZu A05;

    public Fxq(Context context, FZn fZn, GJ1 gj1) {
        7zR.A1O(fZn, gj1);
        this.A02 = context;
        this.A04 = fZn;
        this.A05 = FZu.A00;
        this.A00 = new LifecycleRegistry(this);
        this.A01 = new E8b(context);
        this.A03 = F6x.A00(context, fZn, this, gj1, 0S2.A00);
        this.A00.setCurrentState(Lifecycle.State.CREATED);
    }

    @Override // X.GL4
    public void AN2() {
        stop();
        FFn.A00(this.A03.A04);
    }

    @Override // X.GL4
    public String AWf() {
        return this.A04.A05;
    }

    @Override // X.GL4
    public String AZY() {
        return this.A04.A07;
    }

    @Override // X.GL4
    public View AeR(Context context) {
        FYu fYu = this.A03;
        Context context2 = fYu.A02;
        FFn fFn = fYu.A04;
        11T.A0F(fFn, 1);
        E8a e8a = new E8a(context2);
        7zR.A11(e8a);
        fFn.A04(e8a);
        return e8a;
    }

    @Override // X.GL4
    public View Aot() {
        return this.A01;
    }

    @Override // X.GL4
    public EL9 B3E() {
        return EL9.A02;
    }

    @Override // X.GHR
    public 25P BY8(C23d c23d, 25G r303, DLQ dlq, DLQ dlq2, int i, int i2) {
        11T.A0F(dlq2, 5);
        return this.A05.BY8(c23d, r303, dlq, dlq2, i, i2);
    }

    @Override // X.GLc
    public /* bridge */ /* synthetic */ void BqW(GHQ ghq) {
        FZr fZr = (FZr) ghq;
        11T.A0F(fZr, 0);
        2AS r0 = (2AS) fZr.A00;
        if (r0 != null) {
            this.A01.Ctt(r0);
        }
    }

    @Override // X.GL4
    public void CUY() {
        this.A00.setCurrentState(Lifecycle.State.RESUMED);
    }

    @Override // X.GL4
    public void Cbr() {
    }

    @Override // X.GLc
    public void Cra(En5 en5) {
        FYu fYu = this.A03;
        if (fYu != null) {
            fYu.A00 = en5;
            if (en5 != null) {
                fYu.A00();
            }
        }
    }

    @Override // X.GHR
    public boolean Cyy(DLQ dlq, DLQ dlq2, Object obj, Object obj2) {
        return this.A05.Cyy(dlq, dlq2, obj, obj2);
    }

    @Override // X.GL4
    public void destroy() {
        this.A00.setCurrentState(Lifecycle.State.DESTROYED);
    }

    @Override // X.GL4
    public Context getContext() {
        return this.A02;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public /* bridge */ /* synthetic */ Lifecycle getLifecycle() {
        return this.A00;
    }

    @Override // X.GL4
    public void pause() {
    }

    @Override // X.GL4
    public void resume() {
    }

    @Override // X.GL4
    public void stop() {
        this.A00.setCurrentState(Lifecycle.State.CREATED);
    }
}
