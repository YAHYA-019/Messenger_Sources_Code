package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import java.lang.ref.WeakReference;

/* renamed from: X.2jB, reason: invalid class name */
/* loaded from: 2jB.class */
public final class C2jB implements 1Vf {
    public final Context A00;
    public final 1Br A01 = 1Bq.A00(66818);

    public C2jB(Context context) {
        this.A00 = context;
    }

    public void BQC(1Q5 r302, 1Vp r303, String str) {
        11T.A0F(str, 1);
        if (!str.equals("com.facebook.xapp.messaging.events.common.lifecycle.OnResume")) {
            throw 0Pz.A05("Internal error, event not handled by this handler: ", str);
        }
        Context context = this.A00;
        if (context instanceof FragmentActivity) {
            2JV r0 = (2JV) this.A01.A00.get();
            WeakReference weakReference = r0.A00;
            if (weakReference == null || weakReference.get() == null || !11T.A0O(weakReference.get(), context)) {
                r0.A00 = new WeakReference(context);
            }
        }
    }
}
