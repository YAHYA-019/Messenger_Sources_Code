package X;

import android.os.Bundle;
import com.facebook.quicksilver.QuicksilverActivity;

/* loaded from: G2h.class */
public final class G2h implements Runnable {
    public static final String __redex_internal_original_name = "QuicksilverActivity$4";
    public final /* synthetic */ Bundle A00;
    public final /* synthetic */ QuicksilverActivity A01;

    public G2h(Bundle bundle, QuicksilverActivity quicksilverActivity) {
        this.A01 = quicksilverActivity;
        this.A00 = bundle;
    }

    @Override // java.lang.Runnable
    public void run() {
        QuicksilverActivity.A1D(this.A00, this.A01);
    }
}
