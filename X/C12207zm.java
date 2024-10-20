package X;

import android.content.Context;
import com.facebook.inject.FbInjector;
import com.google.common.base.Platform;

/* renamed from: X.7zm, reason: invalid class name and case insensitive filesystem */
/* loaded from: 7zm.class */
public final class C12207zm implements InterfaceC12197zl {
    public final Context A00 = FbInjector.A00();

    @Override // X.InterfaceC12197zl
    public String AKz(C12167zi c12167zi) {
        6Ay BCm = c12167zi.A01.BCm();
        if (BCm == null || BCm.BEO() == null) {
            return "";
        }
        String A0r = BCm.A0r(-2061635299);
        if (Platform.stringIsNullOrEmpty(A0r)) {
            A0r = 1BK.A0v(this.A00, c12167zi.A02, 2131968198);
        }
        return A0r;
    }

    @Override // X.InterfaceC12197zl
    public boolean Cx8() {
        return false;
    }
}
