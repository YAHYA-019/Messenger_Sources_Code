package X;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;

/* loaded from: D23.class */
public final class D23 implements 4kV, LifecycleEventObserver {
    public final 4kV A00;
    public final InterfaceC07514k3 A01;

    public D23(4kV r302, InterfaceC07514k3 interfaceC07514k3) {
        this.A01 = interfaceC07514k3;
        this.A00 = r302;
    }

    public void C9B(Object obj) {
        this.A00.C9B(obj);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        11T.A0F(event, 1);
        int ordinal = event.ordinal();
        if (ordinal == 1) {
            this.A01.A6a(this);
        } else if (ordinal == 4) {
            this.A01.Cei(this);
        }
    }
}
