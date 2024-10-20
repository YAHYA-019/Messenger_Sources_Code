package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.google.common.base.Preconditions;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: X.31b, reason: invalid class name */
/* loaded from: 31b.class */
public final class C31b extends C08f {
    public final C08f A00;
    public final /* synthetic */ DL1 A01;

    public C31b(DL1 dl1, C08f c08f) {
        this.A01 = dl1;
        this.A00 = c08f;
    }

    @Override // X.C08f
    public boolean A09(Activity activity, Intent intent, int i) {
        return this.A00.A09(activity, intent, i);
    }

    @Override // X.C08f
    public boolean A0A(Context context, Intent intent) {
        try {
            Class<?> cls = Class.forName(intent.getComponent().getClassName());
            if (C1eq.class.isAssignableFrom(cls)) {
                1lW r0 = (1lW) this.A01.A03.get();
                if (((1GU) r0.A03.get()).BWu()) {
                    Class cls2 = r0.A00;
                    boolean z = true;
                    if (AnonymousClass001.A1U(cls2) != AnonymousClass001.A1U(r0.A01)) {
                        z = false;
                    }
                    Preconditions.checkState(z);
                    if (cls2 != null) {
                        0fH.A0V(cls, 1lW.class, "%s launched while tracking %s launch.", cls2);
                    } else {
                        0fH.A07(1lW.class, cls, "startTrackingActivityLaunch called for %s.");
                    }
                    r0.A00 = cls;
                    if (r0.A01 != null) {
                        ((C1fj) r0.A04.get()).A02(r0.A01);
                    }
                    r0.A01 = new Object();
                    ((C1fj) r0.A04.get()).A01(0S2.A01, r0.A01);
                    r0.A02 = ((ScheduledExecutorService) r0.A05.get()).schedule((Runnable) new 3gD(r0, cls), 5, TimeUnit.SECONDS);
                } else {
                    0fH.A07(1lW.class, cls, "%s launched off the ui thread. Not tracing.");
                }
            }
        } catch (ClassNotFoundException e) {
            0fH.A0u("DefaultSecureContextHelper", "Unable to track activity launch.", e);
        }
        return this.A00.A0A(context, intent);
    }

    @Override // X.C08f
    public boolean A0B(Intent intent, Fragment fragment, int i) {
        return this.A00.A0B(intent, fragment, i);
    }
}
