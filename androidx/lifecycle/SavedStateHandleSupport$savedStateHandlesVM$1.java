package androidx.lifecycle;

import X.0BZ;
import X.AnonymousClass001;
import X.C1j9;
import androidx.lifecycle.ViewModelProvider;

/* loaded from: SavedStateHandleSupport$savedStateHandlesVM$1.class */
public final class SavedStateHandleSupport$savedStateHandlesVM$1 implements ViewModelProvider.Factory {
    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public /* synthetic */ ViewModel create(0BZ r302, C1j9 c1j9) {
        return ViewModelProvider.Factory.CC.$default$create(this, r302, c1j9);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public /* synthetic */ ViewModel create(Class cls) {
        throw AnonymousClass001.A0q("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public ViewModel create(Class cls, C1j9 c1j9) {
        return new SavedStateHandlesVM();
    }
}
