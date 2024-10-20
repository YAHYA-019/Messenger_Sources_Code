package X;

import com.facebook.litho.LithoView;
import com.facebook.quicksilver.QuicksilverActivity;
import java.util.Queue;

/* loaded from: G2i.class */
public final class G2i implements Runnable {
    public static final String __redex_internal_original_name = "QuicksilverActivity$8";
    public final /* synthetic */ QuicksilverActivity A00;
    public final /* synthetic */ boolean A01;

    public G2i(QuicksilverActivity quicksilverActivity, boolean z) {
        this.A00 = quicksilverActivity;
        this.A01 = z;
    }

    @Override // java.lang.Runnable
    public void run() {
        QuicksilverActivity quicksilverActivity = this.A00;
        LithoView lithoView = quicksilverActivity.A0C;
        if (lithoView != null) {
            FGt fGt = quicksilverActivity.A0F;
            1Iw r0 = quicksilverActivity.A0B;
            boolean A1Q = AnonymousClass001.A1Q(quicksilverActivity.A00, 11);
            boolean A1O = QuicksilverActivity.A1O(quicksilverActivity);
            boolean z = this.A01;
            DZW dzw = quicksilverActivity.A0E;
            lithoView.A0x(fGt.A03((Dky) null, dzw != null ? dzw.A1X().A01 : null, r0, quicksilverActivity.A0c, 0, A1Q, A1O, z, QuicksilverActivity.A1Q(quicksilverActivity), 0S2.A01.equals(quicksilverActivity.A0G.A07), false, QuicksilverActivity.A1R(quicksilverActivity), QuicksilverActivity.A1P(quicksilverActivity)));
            Queue queue = quicksilverActivity.A0e;
            queue.poll();
            Runnable runnable = (Runnable) queue.peek();
            if (runnable != null) {
                4YU.A0G(quicksilverActivity.A0A).postDelayed(runnable, 250L);
            }
        }
    }
}
