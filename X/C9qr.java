package X;

import android.view.View;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.facebook.user.model.UserKey;

/* renamed from: X.9qr, reason: invalid class name */
/* loaded from: 9qr.class */
public final class C9qr implements ViewModelProvider.Factory {
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
        1BK.A1M(cls, c1j9);
        if (!cls.equals(8DG.class)) {
            throw AnonymousClass002.A0C(cls, "Not supported View Model ", AnonymousClass001.A0k());
        }
        SavedStateHandleSupport.createSavedStateHandle(c1j9);
        C9ps c9ps = new View.OnClickListener() { // from class: X.9ps
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                0FI.A0B(-1405728211, 0FI.A05(964597395));
            }
        };
        C9pt c9pt = new View.OnClickListener() { // from class: X.9pt
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                0FI.A0B(748433868, 0FI.A05(1944754812));
            }
        };
        C9pu c9pu = new View.OnClickListener() { // from class: X.9pu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                0FI.A0B(-304910455, 0FI.A05(1668937740));
            }
        };
        Integer num = 0S2.A00;
        return new 8DG(c9ps, c9pt, c9pu, (8Lu) null, (UserKey) null, num, num, "PLACEHOLDER_STRING_WILL_NOT_RENDER_IF_NOT_REPLACED", "PLACEHOLDER_STRING_WILL_NOT_RENDER_IF_NOT_REPLACED", "PLACEHOLDER_STRING_WILL_NOT_RENDER_IF_NOT_REPLACED", "PLACEHOLDER_STRING_WILL_NOT_RENDER_IF_NOT_REPLACED", (String) null, (String) null, false, false);
    }
}
