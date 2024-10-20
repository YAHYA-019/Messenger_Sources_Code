package X;

import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;

/* renamed from: X.6rj, reason: invalid class name */
/* loaded from: 6rj.class */
public final class C6rj {
    public WeakReference A00;
    public WeakReference A01;
    public boolean A02;
    public boolean A03;
    public final C2kx A04 = new C2kx();
    public final 3xS A05 = new 3xS() { // from class: X.6rk
        public final Integer C29(MotionEvent motionEvent, RecyclerView recyclerView) {
            return C6rj.this.A03 ? 0S2.A00 : 0S2.A0C;
        }
    };

    public void A00() {
        RecyclerView A02 = this.A04.A02();
        if (A02 != null) {
            A02.suppressLayout(false);
        }
        this.A03 = false;
        this.A00 = null;
        this.A01 = null;
        this.A02 = false;
    }
}
