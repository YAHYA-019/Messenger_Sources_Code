package X;

import java.lang.ref.WeakReference;

/* renamed from: X.20C, reason: invalid class name */
/* loaded from: 20C.class */
public final class C20C implements Runnable {
    public static final String __redex_internal_original_name = "DebugOverlayController$1";
    public final /* synthetic */ 20A A00;

    public C20C(20A r302) {
        this.A00 = r302;
    }

    @Override // java.lang.Runnable
    public void run() {
        WeakReference weakReference = this.A00.A00;
        if (weakReference.get() != null) {
            AnonymousClass336 anonymousClass336 = (AnonymousClass336) weakReference.get();
            anonymousClass336.A00.clear();
            AnonymousClass336.A00(anonymousClass336);
            anonymousClass336.setVisibility(8);
        }
    }
}
