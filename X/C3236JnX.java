package X;

import android.content.Context;
import android.content.Intent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewStub;

/* renamed from: X.JnX, reason: case insensitive filesystem */
/* loaded from: JnX.class */
public final class C3236JnX extends L5Y implements MNo, MNp {
    public String A00;
    public boolean A01 = true;
    public final View A02;
    public final Kip A03;

    public C3236JnX(Context context, View view, JgX jgX, MLg mLg) {
        ((L5Y) this).A03 = jgX;
        ((L5Y) this).A00 = context;
        ((L5Y) this).A02 = view;
        Intent A0T = jgX.A0T();
        A0T.getClass();
        ((L5Y) this).A01 = A0T;
        this.A00 = JQx.A0u(A0T);
        Kip kip = new Kip(((L5Y) this).A03, mLg);
        this.A03 = kip;
        ViewStub A0X = JQx.A0X(view, 2131366953);
        String str = this.A00;
        kip.A02.BZU(KOr.A0R, 0S2.A01);
        View A0C = DKF.A0C(A0X, 2132543257);
        kip.A00 = A0C;
        A0C.requireViewById(2131366952).setOnClickListener(new LKH(A0C.getContext(), kip, str, 1));
        if (kip.A00 != null) {
            KxI.A00(new LkW(kip));
        }
        this.A02 = kip.A00;
    }

    @Override // X.MNo
    public int Amw() {
        return 0;
    }

    @Override // X.MNo
    public View Amx() {
        return this.A02;
    }

    @Override // X.MNp
    public void BOG() {
    }

    @Override // X.MNo
    public boolean BSq() {
        return true;
    }

    @Override // X.MNo
    public boolean BSr() {
        return this.A01;
    }

    @Override // X.MNo
    public boolean BWA() {
        return true;
    }

    @Override // X.MNo
    public void BzQ(int i) {
    }

    @Override // X.MNp
    public boolean C24(long j) {
        return false;
    }

    @Override // X.MNp
    public void CAi(String str) {
    }

    @Override // X.MNp
    public void Cc2() {
        Kip kip = this.A03;
        if (kip.A00 != null) {
            KxI.A00(new LkW(kip));
        }
    }

    @Override // X.MNp
    public void Clk(boolean z) {
    }

    @Override // X.MNo
    public void Cox(boolean z) {
    }

    @Override // X.MNo
    public void Coy(boolean z) {
        this.A01 = z;
    }

    @Override // X.MNo
    public void Cq7(boolean z) {
    }

    @Override // X.MNp
    public void D0U() {
    }

    @Override // X.MNo
    public boolean isAvailable() {
        return true;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        return false;
    }

    @Override // X.MNp
    public void setProgress(int i) {
    }
}
