package X;

import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import com.google.common.collect.ImmutableSet;

/* renamed from: X.6Mj, reason: invalid class name */
/* loaded from: 6Mj.class */
public final class C6Mj implements ViewTreeObserver.OnGlobalFocusChangeListener {
    public final /* synthetic */ 6F2 A00;

    public C6Mj(6F2 r302) {
        this.A00 = r302;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public void onGlobalFocusChanged(View view, View view2) {
        6F2 r0 = this.A00;
        ImmutableSet immutableSet = 6F2.A4P;
        if (view2 == null) {
            return;
        }
        ViewParent parent = view2.getParent();
        while (true) {
            ViewParent viewParent = parent;
            if (viewParent == null) {
                return;
            }
            if (viewParent == r0.A09) {
                r0.A1c();
                return;
            }
            parent = viewParent.getParent();
        }
    }
}
