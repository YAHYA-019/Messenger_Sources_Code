package X;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

/* renamed from: X.3Ud, reason: invalid class name */
/* loaded from: 3Ud.class */
public final class C3Ud implements ViewModelProvider.Factory {
    public static final C3Ud A00 = new Object();

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public ViewModel create(0BZ r302, C1j9 c1j9) {
        11T.A0F(r302, 0);
        return 3Fx.A00(C11e.A00(r302));
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public /* synthetic */ ViewModel create(Class cls) {
        throw AnonymousClass001.A0q("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public /* synthetic */ ViewModel create(Class cls, C1j9 c1j9) {
        11T.A0F(cls, 1);
        return create(cls);
    }
}
