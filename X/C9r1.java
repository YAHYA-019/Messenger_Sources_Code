package X;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.facebook.rp.platform.metaai.messenger.MessengerMetaAiRealTimeSessionController;

/* renamed from: X.9r1, reason: invalid class name */
/* loaded from: 9r1.class */
public final class C9r1 implements ViewModelProvider.Factory {
    public final MessengerMetaAiRealTimeSessionController A00;
    public final 0DE A01;
    public final C00m A02;
    public final C00m A03;

    public C9r1(MessengerMetaAiRealTimeSessionController messengerMetaAiRealTimeSessionController, 0DE r303, C00m c00m, C00m c00m2) {
        1BK.A1K(r303, 2, c00m2);
        this.A00 = messengerMetaAiRealTimeSessionController;
        this.A01 = r303;
        this.A02 = c00m;
        this.A03 = c00m2;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public /* synthetic */ ViewModel create(0BZ r302, C1j9 c1j9) {
        return ViewModelProvider.Factory.CC.$default$create(this, r302, c1j9);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public ViewModel create(Class cls) {
        11T.A0F(cls, 0);
        if (cls.isAssignableFrom(8DP.class)) {
            return new 8DP(this.A00, this.A01, this.A02, this.A03);
        }
        throw AnonymousClass002.A0C(cls, "Unknown ViewModel class: ", AnonymousClass001.A0k());
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public /* synthetic */ ViewModel create(Class cls, C1j9 c1j9) {
        return ViewModelProvider.Factory.CC.$default$create(this, cls, c1j9);
    }
}
