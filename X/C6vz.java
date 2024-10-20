package X;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;

/* renamed from: X.6vz, reason: invalid class name */
/* loaded from: 6vz.class */
public final class C6vz implements LifecycleEventObserver {
    public final /* synthetic */ C6uy A00;

    public C6vz(C6uy c6uy) {
        this.A00 = c6uy;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        11T.A0F(event, 1);
        int ordinal = event.ordinal();
        if (ordinal == 1) {
            this.A00.A03 = false;
        } else if (ordinal == 4) {
            C6uy c6uy = this.A00;
            c6uy.A03 = true;
            c6uy.A05 = true;
        }
    }
}
