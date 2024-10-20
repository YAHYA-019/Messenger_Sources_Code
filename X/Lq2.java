package X;

import android.os.Bundle;
import com.google.android.gms.common.api.internal.LifecycleCallback;

/* loaded from: Lq2.class */
public final class Lq2 implements Runnable {
    public static final String __redex_internal_original_name = "zzc";
    public final /* synthetic */ LifecycleCallback A00;
    public final /* synthetic */ JgY A01;
    public final /* synthetic */ String A02;

    public Lq2(LifecycleCallback lifecycleCallback, JgY jgY, String str) {
        this.A01 = jgY;
        this.A00 = lifecycleCallback;
        this.A02 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        JgY jgY = this.A01;
        if (jgY.A00 > 0) {
            LifecycleCallback lifecycleCallback = this.A00;
            Bundle bundle = jgY.A01;
            lifecycleCallback.A04(bundle != null ? bundle.getBundle(this.A02) : null);
        }
        if (jgY.A00 >= 2) {
            this.A00.A06();
        }
        if (jgY.A00 >= 3) {
            this.A00.A02();
        }
        if (jgY.A00 >= 4) {
            this.A00.A07();
        }
    }
}
