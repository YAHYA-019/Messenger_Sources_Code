package X;

import androidx.lifecycle.ProcessLifecycleOwner;

/* renamed from: X.3f0, reason: invalid class name */
/* loaded from: 3f0.class */
public final class C3f0 implements Runnable {
    public static final String __redex_internal_original_name = "MediaBankStorageManagement$register$1";
    public final /* synthetic */ C22S A00;

    public C3f0(C22S c22s) {
        this.A00 = c22s;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ProcessLifecycleOwner.newInstance.getLifecycle().addObserver(this.A00);
    }
}
