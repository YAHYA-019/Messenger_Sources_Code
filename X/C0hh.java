package X;

import android.app.Application;
import java.util.List;

/* renamed from: X.0hh, reason: invalid class name */
/* loaded from: 0hh.class */
public final class C0hh {
    public int A00;
    public long A01;
    public 0WF A04;
    public C15h A05;
    public C15h A06;
    public C15h A07;
    public C15h A08;
    public C15h A09;
    public C15h A0A;
    public C15h A0B;
    public C15h A0C;
    public C15h A0D;
    public C15h A0E;
    public C15h A0F;
    public C15h A0G;
    public C15h A0H;
    public C15h A0I;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0Q;
    public final Application A0S;
    public long A02 = 0;
    public boolean A0O = true;
    public long A03 = 0;
    public final List A0T = AnonymousClass001.A0s();
    public final List A0U = AnonymousClass001.A0s();
    public final List A0V = AnonymousClass001.A0s();
    public final List A0W = AnonymousClass001.A0s();
    public boolean A0J = false;
    public boolean A0P = false;
    public boolean A0R = false;
    public boolean A0K = false;

    public C0hh(Application application) {
        this.A0S = application;
    }

    public static void A00(C0hh c0hh, int i) {
        c0hh.A01(new 0oK(i));
    }

    public void A01(C0ha c0ha) {
        List list;
        if (c0ha != null) {
            int intValue = c0ha.BKe().intValue();
            if (intValue == 0) {
                list = this.A0T;
            } else if (intValue == 1) {
                list = this.A0U;
            } else if (intValue == 2) {
                list = this.A0V;
            } else if (intValue != 3) {
                return;
            } else {
                list = this.A0W;
            }
            list.add(c0ha);
        }
    }
}
