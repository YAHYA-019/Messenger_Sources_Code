package X;

import android.content.Context;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;

/* renamed from: X.6yv, reason: invalid class name */
/* loaded from: 6yv.class */
public final class C6yv implements DefaultLifecycleObserver {
    public C00m A00;
    public final 1Br A01;
    public final Context A02;
    public final C21h A03;

    public C6yv(Context context) {
        11T.A0F(context, 1);
        this.A02 = context;
        this.A01 = 1Bu.A01(context, 16428);
        this.A03 = new C1242Abk(this);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onDestroy(LifecycleOwner lifecycleOwner) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onPause(LifecycleOwner lifecycleOwner) {
        C21S.A01(this.A03, (1Uj) 1Lm.A05(this.A02, 1Fw.A04((1EZ) this.A01.A00.get()), 16686));
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onResume(LifecycleOwner lifecycleOwner) {
        C21S.A00(this.A03, (1Uj) 1Lm.A05(this.A02, 1Fw.A04((1EZ) this.A01.A00.get()), 16686));
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
    }
}
