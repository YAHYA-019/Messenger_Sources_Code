package X;

import android.view.View;

/* renamed from: X.3a4, reason: invalid class name */
/* loaded from: 3a4.class */
public final class C3a4 implements DIX {
    public final /* synthetic */ 2Ok A00;

    public C3a4(2Ok r302) {
        this.A00 = r302;
    }

    public void BzF(View view, boolean z) {
        if (z) {
            C5fi.A02(view);
        } else {
            C5fi.A01(view);
        }
    }

    public void CF5(CharSequence charSequence) {
    }

    public void CJd(CharSequence charSequence) {
        String trim = charSequence.toString().trim();
        2Ok r0 = this.A00;
        if (1JF.A0C(trim, r0.A08)) {
            return;
        }
        r0.A08 = trim;
        r0.A07.A00.A0G(trim);
        ((CM7) 1Lo.A04(r0.getContext(), r0.A02, (1BY) null, 83622)).A01 = r0.A08;
    }

    public void onBackPressed() {
        C8y c8y = this.A00.A06;
        if (c8y != null) {
            c8y.A00();
        }
    }
}
