package X;

import android.os.Bundle;
import androidx.activity.result.ActivityResult;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;

/* renamed from: X.0no, reason: invalid class name */
/* loaded from: 0no.class */
public final class C0no implements LifecycleEventObserver, LifecycleObserver {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;

    public C0no(Object obj, Object obj2, Object obj3, String str, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A04 = str;
        this.A02 = obj;
        this.A03 = obj3;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (this.A00 != 0) {
            if (event == Lifecycle.Event.ON_START) {
                java.util.Map map = ((06Z) this.A01).A0X;
                String str = this.A04;
                Bundle bundle = (Bundle) map.get(str);
                if (bundle != null) {
                    ((0Tx) this.A03).Bza(str, bundle);
                    map.remove(str);
                    if (06Z.A0N()) {
                        android.util.Log.v("FragmentManager", 0Pz.A0W("Clearing fragment result with key ", str));
                    }
                }
            }
            if (event == Lifecycle.Event.ON_DESTROY) {
                ((Lifecycle) this.A02).removeObserver(this);
                ((06Z) this.A01).A0W.remove(this.A04);
                return;
            }
            return;
        }
        06D r0 = (06D) this.A01;
        String str2 = this.A04;
        final C07r c07r = (C07r) this.A02;
        final C07q c07q = (C07q) this.A03;
        11T.A0F(event, 5);
        if (Lifecycle.Event.ON_START != event) {
            if (Lifecycle.Event.ON_STOP == event) {
                r0.A06.remove(str2);
                return;
            } else {
                if (Lifecycle.Event.ON_DESTROY == event) {
                    r0.A04(str2);
                    return;
                }
                return;
            }
        }
        r0.A06.put(str2, new Object(c07r, c07q) { // from class: X.084
            public final C07r A00;
            public final C07q A01;

            {
                this.A00 = c07r;
                this.A01 = c07q;
            }
        });
        java.util.Map map2 = r0.A03;
        if (map2.containsKey(str2)) {
            Object obj = map2.get(str2);
            map2.remove(str2);
            c07r.Bho(obj);
        }
        Bundle bundle2 = r0.A00;
        ActivityResult activityResult = (ActivityResult) AnonymousClass086.A00(bundle2, ActivityResult.class, str2);
        if (activityResult != null) {
            bundle2.remove(str2);
            c07r.Bho(c07q.A02(activityResult.A01, activityResult.A00));
        }
    }
}
