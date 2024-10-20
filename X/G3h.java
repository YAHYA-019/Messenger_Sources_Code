package X;

import android.view.View;

/* loaded from: G3h.class */
public final class G3h implements Runnable {
    public static final String __redex_internal_original_name = "AlertController$3";
    public final /* synthetic */ View A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ FEx A02;

    public G3h(View view, View view2, FEx fEx) {
        this.A02 = fEx;
        this.A01 = view;
        this.A00 = view2;
    }

    @Override // java.lang.Runnable
    public void run() {
        FEx.A00(this.A02.A0I, this.A01, this.A00);
    }
}
