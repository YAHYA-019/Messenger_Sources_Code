package X;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* renamed from: X.2ky, reason: invalid class name */
/* loaded from: 2ky.class */
public class C2ky {
    public 3wX A00;
    public AXW A01;
    public 2Z6 A02;
    public final Runnable A03 = new Runnable() { // from class: X.2kz
        public static final String __redex_internal_original_name = "RecyclerEventsController$1";

        @Override // java.lang.Runnable
        public void run() {
            2Z6 r0 = C2ky.this.A02;
            if (r0 == null || !r0.A0E) {
                return;
            }
            SwipeRefreshLayout.A04(r0, false, false);
        }
    };

    public RecyclerView A02() {
        2Z6 r0 = this.A02;
        if (r0 == null) {
            return null;
        }
        return r0.A04;
    }

    public void A03() {
        2Z6 r0 = this.A02;
        if (r0 == null || !r0.A0E) {
            return;
        }
        if (1sP.A01()) {
            SwipeRefreshLayout.A04(r0, false, false);
            return;
        }
        Runnable runnable = this.A03;
        r0.removeCallbacks(runnable);
        r0.post(runnable);
    }

    public void A04(int i, int i2) {
        2Z6 r0 = this.A02;
        if (r0 != null) {
            2XA r02 = r0.A04.A0F;
            if (r02 instanceof LinearLayoutManager) {
                ((LinearLayoutManager) r02).Cjt(i, i2);
            } else {
                A05(i, false);
            }
        }
    }

    public void A05(int i, boolean z) {
        2Z6 r0 = this.A02;
        if (r0 != null) {
            RecyclerView recyclerView = r0.A04;
            if (z) {
                recyclerView.A0w(i);
            } else {
                recyclerView.A0u(i);
            }
        }
    }
}
