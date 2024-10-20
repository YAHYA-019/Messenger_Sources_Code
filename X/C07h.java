package X;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;

/* renamed from: X.07h, reason: invalid class name */
/* loaded from: 07h.class */
public final class C07h implements C07i, LifecycleEventObserver {
    public C07i A00;
    public final C06g A01;
    public final Lifecycle A02;
    public final /* synthetic */ 07Z A03;

    public C07h(C06g c06g, 07Z r303, Lifecycle lifecycle) {
        this.A03 = r303;
        this.A02 = lifecycle;
        this.A01 = c06g;
        lifecycle.addObserver(this);
    }

    @Override // X.C07i
    public void cancel() {
        this.A02.removeObserver(this);
        this.A01.A02.remove(this);
        C07i c07i = this.A00;
        if (c07i != null) {
            c07i.cancel();
        }
        this.A00 = null;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        11T.A0F(event, 1);
        if (event == Lifecycle.Event.ON_START) {
            this.A00 = this.A03.A03(this.A01);
            return;
        }
        if (event != Lifecycle.Event.ON_STOP) {
            if (event == Lifecycle.Event.ON_DESTROY) {
                cancel();
            }
        } else {
            C07i c07i = this.A00;
            if (c07i != null) {
                c07i.cancel();
            }
        }
    }
}
