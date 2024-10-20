package X;

import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.internal.LifecycleCallback;

/* renamed from: X.3pj, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3pj.class */
public final class C01043pj extends AbstractDialogInterfaceOnCancelListenerC01053pk {
    public final 0WH A00;
    public final 28O A01;

    public C01043pj(GoogleApiAvailability googleApiAvailability, 28O r303, MKC mkc) {
        super(googleApiAvailability, mkc);
        this.A00 = new 0WH(0);
        this.A01 = r303;
        ((LifecycleCallback) this).A00.A5N(this, "ConnectionlessLifecycleHelper");
    }

    @Override // X.AbstractDialogInterfaceOnCancelListenerC01053pk, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void A06() {
        this.A03 = true;
        if (this.A00.isEmpty()) {
            return;
        }
        this.A01.A06(this);
    }

    @Override // X.AbstractDialogInterfaceOnCancelListenerC01053pk, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void A07() {
        this.A03 = false;
        28O r0 = this.A01;
        synchronized (28O.A0I) {
            if (r0.A01 == this) {
                r0.A01 = null;
                r0.A0A.clear();
            }
        }
    }
}
