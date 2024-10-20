package X;

import android.view.View;
import java.util.Iterator;

/* loaded from: J0g.class */
public final class J0g implements Runnable {
    public static final String __redex_internal_original_name = "PromotionsViewPresenter$getPromotionRunnable$1";
    public final /* synthetic */ int A00;
    public final /* synthetic */ 1Br A01;
    public final /* synthetic */ Gqj A02;

    public J0g(1Br r302, Gqj gqj, int i) {
        this.A00 = i;
        this.A02 = gqj;
        this.A01 = r302;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IYG iyg = (JOI) 1Br.A0B(this.A01);
        int i = this.A00;
        Object A05 = GS2.A05(this.A02);
        GOn.A1X(A05);
        View view = (View) A05;
        11T.A0F(view, 1);
        Iterator it = iyg.A0B.iterator();
        while (it.hasNext()) {
            ((HG7) it.next()).A03(view, i);
        }
    }
}
