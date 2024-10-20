package X;

import android.view.View;
import com.facebook.common.staggeredgrid.HorizontalStaggeredLayoutManager;
import java.util.concurrent.ConcurrentMap;

/* loaded from: Izp.class */
public final class Izp implements Runnable {
    public static final String __redex_internal_original_name = "HorizontalStaggeredLayoutManager$fill$1";
    public final /* synthetic */ View A00;
    public final /* synthetic */ HorizontalStaggeredLayoutManager A01;
    public final /* synthetic */ boolean A02;

    public Izp(View view, HorizontalStaggeredLayoutManager horizontalStaggeredLayoutManager, boolean z) {
        this.A01 = horizontalStaggeredLayoutManager;
        this.A00 = view;
        this.A02 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ConcurrentMap concurrentMap = this.A01.A0D;
        View view = this.A00;
        if (concurrentMap.containsKey(view)) {
            concurrentMap.remove(view);
        }
        view.setVisibility(DKG.A00(this.A02 ? 1 : 0));
    }
}
