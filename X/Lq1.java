package X;

import android.os.Bundle;
import com.google.android.gms.common.api.internal.LifecycleCallback;

/* loaded from: Lq1.class */
public final class Lq1 implements Runnable {
    public static final String __redex_internal_original_name = "zza";
    public final /* synthetic */ LifecycleCallback A00;
    public final /* synthetic */ JUW A01;
    public final /* synthetic */ String A02;

    public Lq1(LifecycleCallback lifecycleCallback, JUW juw, String str) {
        this.A01 = juw;
        this.A00 = lifecycleCallback;
        this.A02 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        JUW juw = this.A01;
        if (juw.A00 > 0) {
            LifecycleCallback lifecycleCallback = this.A00;
            Bundle bundle = juw.A01;
            lifecycleCallback.A04(bundle != null ? bundle.getBundle(this.A02) : null);
        }
        if (juw.A00 >= 2) {
            this.A00.A06();
        }
        if (juw.A00 >= 3) {
            this.A00.A02();
        }
        if (juw.A00 >= 4) {
            this.A00.A07();
        }
    }
}
