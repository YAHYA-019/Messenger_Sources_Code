package X;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import java.util.Arrays;

/* renamed from: X.9qs, reason: invalid class name */
/* loaded from: 9qs.class */
public final class C9qs implements ViewModelProvider.Factory {
    public final 9Mf[] A00;

    public C9qs(9Mf... r302) {
        11T.A0F(r302, 1);
        this.A00 = r302;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public /* synthetic */ ViewModel create(0BZ r302, C1j9 c1j9) {
        return ViewModelProvider.Factory.CC.$default$create(this, r302, c1j9);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public /* synthetic */ ViewModel create(Class cls) {
        throw new UnsupportedOperationException(1BJ.A00(322));
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public ViewModel create(Class cls, C1j9 c1j9) {
        11T.A0H(cls, c1j9);
        0BY A18 = 7zL.A18(cls);
        9Mf[] r0 = this.A00;
        9Mf[] r02 = (9Mf[]) Arrays.copyOf(r0, r0.length);
        11T.A0F(r02, 2);
        int length = r02.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                break;
            }
            9Mf r03 = r02[i2];
            if (11T.A0O(r03.A01, A18)) {
                ViewModel viewModel = (ViewModel) r03.A00.invoke(c1j9);
                if (viewModel != null) {
                    return viewModel;
                }
            } else {
                i = i2 + 1;
            }
        }
        throw 0Pz.A05("No initializer set for given class ", C0Bx.A00(A18.A00));
    }
}
