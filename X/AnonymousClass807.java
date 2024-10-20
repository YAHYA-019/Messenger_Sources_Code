package X;

import android.content.res.Resources;
import com.facebook.inject.FbInjector;

/* renamed from: X.807, reason: invalid class name */
/* loaded from: 807.class */
public final class AnonymousClass807 implements InterfaceC12197zl {
    public final C00i A00 = FbInjector.A00;

    @Override // X.InterfaceC12197zl
    public String AKz(C12167zi c12167zi) {
        String str = c12167zi.A02;
        Resources A0B = 1BL.A0B(this.A00);
        return str == null ? A0B.getString(2131965726) : 4YU.A0u(A0B, str, 2131964205);
    }

    @Override // X.InterfaceC12197zl
    public boolean Cx8() {
        return true;
    }
}
