package X;

import android.content.Context;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* renamed from: X.9r2, reason: invalid class name */
/* loaded from: 9r2.class */
public final class C9r2 implements ViewModelProvider.Factory {
    public final Context A00;
    public final FbUserSession A01;
    public final ThreadKey A02;
    public final C95n A03;
    public final String A04;
    public final boolean A05;

    public C9r2(Context context, FbUserSession fbUserSession, ThreadKey threadKey, C95n c95n, String str, boolean z) {
        C3o5.A0k(fbUserSession, 2, c95n);
        this.A00 = context;
        this.A01 = fbUserSession;
        this.A04 = str;
        this.A05 = z;
        this.A03 = c95n;
        this.A02 = threadKey;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public /* synthetic */ ViewModel create(0BZ r302, C1j9 c1j9) {
        return ViewModelProvider.Factory.CC.$default$create(this, r302, c1j9);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public ViewModel create(Class cls) {
        11T.A0F(cls, 0);
        if (!cls.isAssignableFrom(8DO.class)) {
            throw AnonymousClass002.A0C(cls, "Unknown ViewModel class: ", AnonymousClass001.A0k());
        }
        Context context = this.A00;
        FbUserSession fbUserSession = this.A01;
        String str = this.A04;
        boolean z = this.A05;
        return new 8DO(context, fbUserSession, this.A02, this.A03, str, z);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public /* synthetic */ ViewModel create(Class cls, C1j9 c1j9) {
        return ViewModelProvider.Factory.CC.$default$create(this, cls, c1j9);
    }
}
