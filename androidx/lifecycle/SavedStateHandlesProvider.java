package androidx.lifecycle;

import X.06L;
import X.11T;
import X.AnonymousClass001;
import X.AnonymousClass068;
import X.C01g;
import X.C01i;
import X.C2xl;
import android.os.Bundle;
import java.util.Iterator;
import java.util.Map;

/* loaded from: SavedStateHandlesProvider.class */
public final class SavedStateHandlesProvider implements 06L {
    public boolean restored;
    public Bundle restoredState;
    public final AnonymousClass068 savedStateRegistry;
    public final C01i viewModel$delegate;

    public SavedStateHandlesProvider(AnonymousClass068 anonymousClass068, ViewModelStoreOwner viewModelStoreOwner) {
        11T.A0F(anonymousClass068, 1);
        11T.A0F(viewModelStoreOwner, 2);
        this.savedStateRegistry = anonymousClass068;
        this.viewModel$delegate = C01g.A01(new C2xl(viewModelStoreOwner, 0));
    }

    public final void performRestore() {
        if (this.restored) {
            return;
        }
        Bundle A00 = this.savedStateRegistry.A00("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.restoredState;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        if (A00 != null) {
            bundle.putAll(A00);
        }
        this.restoredState = bundle;
        this.restored = true;
        this.viewModel$delegate.getValue();
    }

    public Bundle saveState() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.restoredState;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        Iterator it = ((SavedStateHandlesVM) this.viewModel$delegate.getValue()).handles.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry A0z = AnonymousClass001.A0z(it);
            String A0j = AnonymousClass001.A0j(A0z);
            Bundle saveState = ((SavedStateHandle) A0z.getValue()).savedStateProvider.saveState();
            if (!11T.A0O(saveState, Bundle.EMPTY)) {
                bundle.putBundle(A0j, saveState);
            }
        }
        this.restored = false;
        return bundle;
    }
}
