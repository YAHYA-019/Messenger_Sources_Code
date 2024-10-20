package X;

import android.app.Application;
import android.content.Context;
import android.util.Pair;

/* renamed from: X.0lZ, reason: invalid class name */
/* loaded from: 0lZ.class */
public final class C0lZ implements 0hY {
    public static final C0lZ A00 = new C0lZ();

    public /* bridge */ /* synthetic */ Object AIl(C0hg c0hg) {
        final Application application = c0hg.A0K;
        final Integer num = 0S2.A00;
        final String A01 = C15h.A01(c0hg.A0S);
        return new 0gG(application, num, A01) { // from class: X.006
            public final Context A00;
            public final Integer A01;
            public final String A02;

            {
                this.A00 = application;
                this.A01 = num;
                this.A02 = A01;
            }

            public Integer Ayh() {
                return 0S2.A0d;
            }

            public /* synthetic */ boolean BN1(Integer num2) {
                return false;
            }

            public void CXo(C0qh c0qh, C0gq c0gq) {
                Pair A002;
                C0g9 c0g9;
                synchronized (this) {
                    A002 = C02g.A00(this.A00, this.A02);
                }
                if (A002 != null) {
                    int intValue = this.A01.intValue();
                    if (intValue == 0) {
                        c0qh.A04(C0g6.A3U, (Long) A002.first);
                        c0g9 = C0g6.A3V;
                    } else if (intValue != 1) {
                        c0qh.A04(C0g6.A2y, (Long) A002.first);
                        c0g9 = C0g6.A30;
                    } else {
                        c0qh.A04(C0g6.A2K, (Long) A002.first);
                        c0g9 = C0g6.A2L;
                    }
                    c0qh.A04(c0g9, (Long) A002.second);
                }
            }
        };
    }
}
