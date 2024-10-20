package X;

import android.content.Context;
import com.facebook.interstitial.triggers.InterstitialTrigger;
import java.lang.ref.WeakReference;

/* renamed from: X.4eb, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4eb.class */
public final class RunnableC05614eb implements Runnable {
    public static final String __redex_internal_original_name = "M4MainActivityDelegate$MaybeStartInterstitialAsyncRunnable";
    public final WeakReference A00;
    public final C05324dh A01;

    public RunnableC05614eb(Context context, C05324dh c05324dh) {
        this.A00 = new WeakReference(context);
        this.A01 = c05324dh;
    }

    @Override // java.lang.Runnable
    public void run() {
        WeakReference weakReference = this.A00;
        if (weakReference.get() != null) {
            this.A01.A02(new InterfaceC04564bc() { // from class: X.4vx
                @Override // X.InterfaceC04564bc
                public final boolean Cyc() {
                    return AnonymousClass001.A1T(RunnableC05614eb.this.A00.get());
                }
            }, new InterstitialTrigger(15, (String) null), weakReference);
        }
    }
}
