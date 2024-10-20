package X;

import android.os.Handler;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;

/* renamed from: X.9qg, reason: invalid class name */
/* loaded from: 9qg.class */
public final class C9qg implements LifecycleEventObserver, LifecycleObserver {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C9qg(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
        this.A03 = obj3;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        C2lh c2lh;
        if (this.A00 == 0) {
            if (event == Lifecycle.Event.ON_DESTROY) {
                ((Handler) this.A02).removeCallbacks((Runnable) this.A03);
                lifecycleOwner.getLifecycle().removeObserver(this);
                return;
            }
            return;
        }
        boolean z = true;
        11T.A0F(event, 1);
        int ordinal = event.ordinal();
        if (ordinal != 3) {
            if (ordinal != 2 || !7zR.A1V((4NU) this.A01)) {
                return;
            }
            GRS A01 = C8hv.A01((C8hv) this.A03);
            if (A01 != null) {
                A01.CXU(C52j.A2Z);
            }
            c2lh = (C2lh) this.A02;
        } else {
            if (!7zR.A1V((4NU) this.A01)) {
                return;
            }
            GRS A012 = C8hv.A01((C8hv) this.A03);
            if (A012 != null) {
                A012.CWm(C52j.A2Z);
            }
            c2lh = (C2lh) this.A02;
            z = false;
        }
        7zN.A1U(c2lh, z);
    }
}
