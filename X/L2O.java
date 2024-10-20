package X;

import android.view.View;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;

/* loaded from: L2O.class */
public final class L2O {
    public static final C66h A04 = C66h.A01();
    public SettableFuture A00;
    public final View A01;
    public final C66i A02;
    public final C00i A03 = 1BV.A00(66470);

    public L2O(View view) {
        C62j c62j = (C62j) 1Bi.A03(66182);
        this.A01 = view;
        view.setAlpha(0.0f);
        C66i c66i = new C66i(c62j);
        c66i.A09(A04);
        c66i.A06 = true;
        c66i.A00 = 0.005d;
        c66i.A02 = 0.005d;
        c66i.A0A(new Jvg(this));
        this.A02 = c66i;
        SettableFuture A0j = 4YU.A0j();
        this.A00 = A0j;
        A0j.set((Object) null);
    }

    public ListenableFuture A00(double d) {
        C66i c66i = this.A02;
        if (c66i.A01 != d) {
            SettableFuture settableFuture = this.A00;
            if (settableFuture != null) {
                settableFuture.cancel(false);
                this.A00 = null;
            }
            this.A00 = 4YU.A0j();
            c66i.A07(d);
        }
        if (this.A00 == null) {
            return 1hM.A01;
        }
        if (((C81l) this.A03.get()).A00()) {
            this.A00.set((Object) null);
        }
        return this.A00;
    }
}
