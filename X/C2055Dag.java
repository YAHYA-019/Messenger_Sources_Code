package X;

import android.app.Activity;
import android.content.Intent;
import com.facebook.base.activity.FbFragmentActivity;

/* renamed from: X.Dag, reason: case insensitive filesystem */
/* loaded from: Dag.class */
public final class C2055Dag extends AbstractC2060Dal {
    public final /* synthetic */ FbFragmentActivity A00;
    public final /* synthetic */ C00m A01;
    public final /* synthetic */ C00m A02;

    public C2055Dag(FbFragmentActivity fbFragmentActivity, C00m c00m, C00m c00m2) {
        this.A00 = fbFragmentActivity;
        this.A02 = c00m;
        this.A01 = c00m2;
    }

    public void Bhr(Activity activity, Intent intent, int i, int i2) {
        if (i == 212) {
            this.A00.Cdt(this);
            (i2 == -1 ? this.A02 : this.A01).invoke();
        }
    }
}
