package X;

import android.content.res.Resources;
import com.facebook.inject.FbInjector;

/* renamed from: X.7zo, reason: invalid class name and case insensitive filesystem */
/* loaded from: 7zo.class */
public final class C12227zo implements InterfaceC12197zl {
    public final 1BP A00 = FbInjector.A00;

    @Override // X.InterfaceC12197zl
    public String AKz(C12167zi c12167zi) {
        int i;
        Object[] objArr;
        11T.A0F(c12167zi, 0);
        String str = c12167zi.A02;
        boolean A1U = AnonymousClass001.A1U(str);
        Resources resources = 7zL.A09().getResources();
        if (A1U) {
            i = 2131820881;
            objArr = new Object[]{1};
        } else {
            i = 2131820757;
            objArr = new Object[]{str, 1};
        }
        String quantityString = resources.getQuantityString(i, 1, objArr);
        11T.A0A(quantityString);
        return quantityString;
    }

    @Override // X.InterfaceC12197zl
    public boolean Cx8() {
        return false;
    }
}
