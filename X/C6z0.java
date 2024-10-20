package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.google.common.collect.ImmutableSet;

/* renamed from: X.6z0, reason: invalid class name */
/* loaded from: 6z0.class */
public final class C6z0 implements 6yR {
    public final /* synthetic */ 6rJ A00;

    public C6z0(6rJ r302) {
        this.A00 = r302;
    }

    public final LifecycleOwner BdM() {
        6rJ r0 = this.A00;
        ImmutableSet immutableSet = 6rJ.A1N;
        Fragment fragment = r0.A03;
        if (fragment.mView != null) {
            return fragment.getViewLifecycleOwner();
        }
        return null;
    }
}
