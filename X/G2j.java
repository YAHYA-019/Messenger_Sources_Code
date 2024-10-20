package X;

import android.content.Intent;
import com.facebook.quicksilver.QuicksilverActivity;

/* loaded from: G2j.class */
public final class G2j implements Runnable {
    public static final String __redex_internal_original_name = "QuicksilverActivity$9";
    public final /* synthetic */ Intent A00;
    public final /* synthetic */ QuicksilverActivity A01;

    public G2j(Intent intent, QuicksilverActivity quicksilverActivity) {
        this.A01 = quicksilverActivity;
        this.A00 = intent;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.A01.A3C(this.A00);
    }
}
