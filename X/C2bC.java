package X;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.facebook.interstitial.triggers.InterstitialTrigger;
import com.facebook.messaging.inbox.promotionbanner.InboxQPBottomSheetInserter$TriggerBottomSheetRunnable$run$1;
import java.lang.ref.WeakReference;

/* renamed from: X.2bC, reason: invalid class name */
/* loaded from: 2bC.class */
public final class C2bC implements Runnable {
    public static final String __redex_internal_original_name = "InboxQPBottomSheetInserter$TriggerBottomSheetRunnable";
    public final WeakReference A00;
    public final WeakReference A01;

    public C2bC(1pK r302, C2b9 c2b9) {
        this.A01 = new WeakReference(c2b9);
        this.A00 = new WeakReference(r302);
    }

    @Override // java.lang.Runnable
    public void run() {
        Fragment fragment;
        Context context;
        C2b9 c2b9 = (C2b9) this.A01.get();
        if (c2b9 == null || !c2b9.BSv() || (fragment = (Fragment) this.A00.get()) == null || (context = fragment.getContext()) == null) {
            return;
        }
        InterstitialTrigger interstitialTrigger = new InterstitialTrigger(24, (String) null);
        ComponentCallbacks2 A00 = 4bQ.A00(context);
        if (A00 instanceof LifecycleOwner) {
            2aH A002 = 2Zy.A00((LifecycleOwner) A00, 2Zo.A01());
            2aK.A03((Integer) null, (0DE) null, new InboxQPBottomSheetInserter$TriggerBottomSheetRunnable$run$1((Activity) A00, context, 1Fw.A04((1EZ) 1Bn.A0E(context, (1BY) null, 16428)), interstitialTrigger, 1Bq.A00(66742), null, A002), A002, 3);
        }
    }
}
