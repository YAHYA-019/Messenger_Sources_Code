package X;

import android.content.Context;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* renamed from: X.9qz, reason: invalid class name */
/* loaded from: 9qz.class */
public final class C9qz implements ViewModelProvider.Factory {
    public final Context A00;
    public final ThreadKey A01;
    public final boolean A02;

    public C9qz(Context context, ThreadKey threadKey, boolean z) {
        this.A00 = context;
        this.A01 = threadKey;
        this.A02 = z;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public /* synthetic */ ViewModel create(0BZ r302, C1j9 c1j9) {
        return ViewModelProvider.Factory.CC.$default$create(this, r302, c1j9);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public ViewModel create(Class cls) {
        11T.A0F(cls, 0);
        if (!cls.isAssignableFrom(8DC.class)) {
            throw AnonymousClass002.A0C(cls, "Unknown ViewModel class: ", AnonymousClass001.A0k());
        }
        9WW r0 = (9WW) 1Bn.A0A(68189);
        AbR abR = (AbR) 1Bu.A06(this.A00, 541);
        ThreadKey threadKey = this.A01;
        return new 8DC(abR.A0L(threadKey), threadKey, r0, this.A02);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public /* synthetic */ ViewModel create(Class cls, C1j9 c1j9) {
        return ViewModelProvider.Factory.CC.$default$create(this, cls, c1j9);
    }
}
