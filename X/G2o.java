package X;

import com.facebook.litho.LithoView;
import com.facebook.quicksilver.views.loading.QuicksilverCardlessLoadingView;
import java.util.HashMap;

/* loaded from: G2o.class */
public final class G2o implements Runnable {
    public static final String __redex_internal_original_name = "QuicksilverFlexibleLoadingContentController$1";
    public final /* synthetic */ Er6 A00;
    public final /* synthetic */ Fpv A01;

    public G2o(Er6 er6, Fpv fpv) {
        this.A01 = fpv;
        this.A00 = er6;
    }

    @Override // java.lang.Runnable
    public void run() {
        Fpv fpv = this.A01;
        String str = this.A00.A0h;
        if (str == null) {
            str = "";
        }
        QuicksilverCardlessLoadingView quicksilverCardlessLoadingView = (QuicksilverCardlessLoadingView) fpv.A01;
        FIT fit = (FIT) 1Hv.A02(quicksilverCardlessLoadingView.getContext(), 98368);
        HashMap A0u = AnonymousClass001.A0u();
        A0u.put("retry_button_on_loading_screen", "true");
        fit.A0J("retry_load_button_impression", A0u);
        FA8 fa8 = quicksilverCardlessLoadingView.A0B;
        DBh dBh = new DBh(fit, quicksilverCardlessLoadingView, 2);
        11T.A0F(str, 0);
        LithoView lithoView = fa8.A04;
        if (lithoView != null) {
            lithoView.setVisibility(0);
            lithoView.A0x(new Dv0(str, dBh));
        }
    }
}
