package X;

import android.content.Context;
import android.view.View;

/* loaded from: H2p.class */
public abstract class H2p extends C6d6 {
    public final View A00;

    /* JADX WARN: Multi-variable type inference failed */
    public H2p(Context context) {
        super(context, null, 0);
        A0C(2132541711);
        this.A00 = C09s.A01(this, 2131363033);
        GPl.A02(this, 77);
    }

    @Override // X.C6d6
    public String A0H() {
        return "ClickToPlayPlugin";
    }

    @Override // X.C6d6
    public void A0M() {
        this.A00.setOnClickListener(null);
    }

    @Override // X.C6d6
    public void A0e(6TI r302, boolean z) {
        if (z) {
            IKB.A00(this.A00, this, 64);
        }
    }

    public void A0j() {
        6U2 r0 = this.A06;
        if (r0 != null) {
            GOo.A1L(C52j.A2Z, r0);
        }
    }

    public void A0k() {
        6U2 r0 = this.A06;
        if (r0 != null) {
            GOo.A1M(C52j.A2Z, r0, -1);
        }
    }
}
