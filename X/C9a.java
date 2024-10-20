package X;

import android.os.Bundle;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.google.common.collect.ImmutableList;
import java.util.Set;

/* loaded from: C9a.class */
public abstract class C9a {
    public ImmutableList A00 = 1BK.A0b();

    public void A01() {
        if (this instanceof B8B) {
            B8B b8b = (B8B) this;
            b8b.A01 = false;
            B8C b8c = b8b.A00;
            if (b8c != null) {
                b8c.A01();
                return;
            }
            return;
        }
        if (!(this instanceof B8C)) {
            ((B8A) this).A00 = false;
            return;
        }
        B8C b8c2 = (B8C) this;
        ((B8A) b8c2).A00 = false;
        b8c2.A04.A01 = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A02() {
        B8C b8c;
        if (this instanceof B8D) {
            B8D b8d = (B8D) this;
            C10264sx c10264sx = b8d.A03;
            FbUserSession fbUserSession = b8d.A01;
            String str = b8d.A04;
            c10264sx.A07(fbUserSession, b8d.A02, new Cmw(b8d), str, Long.MAX_VALUE, b8d.A05);
            b8c = b8d;
        } else {
            if (this instanceof B8B) {
                B8B b8b = (B8B) this;
                b8b.A07.A02();
                b8b.A01 = true;
                return;
            }
            B8C b8c2 = (B8C) this;
            Long l = b8c2.A01;
            if (l == null) {
                return;
            }
            long longValue = l.longValue();
            C10264sx c10264sx2 = b8c2.A04;
            FbUserSession fbUserSession2 = b8c2.A02;
            String str2 = b8c2.A06;
            ThreadSummary threadSummary = b8c2.A03;
            Cmy cmy = new Cmy(b8c2);
            if (c10264sx2.A01 == null) {
                c10264sx2.A01 = new BD2(fbUserSession2, threadSummary, cmy, c10264sx2, (C00683ob) 4YU.A0o(fbUserSession2, c10264sx2.A02, 67629), str2, longValue);
                C10264sx.A03(fbUserSession2, c10264sx2);
            }
            c10264sx2.A09(fbUserSession2, Long.valueOf(longValue), str2, null, 2);
            b8c = b8c2;
        }
        ((B8A) b8c).A00 = true;
    }

    public void A03() {
        if (this instanceof B8B) {
            B8B b8b = (B8B) this;
            B8A b8a = b8b.A07;
            if (!b8a.A01) {
                b8a = b8b.A00;
                if (b8a == null) {
                    B8B.A00(b8b);
                    return;
                } else if (!b8a.A01) {
                    return;
                }
            }
            b8a.A03();
            return;
        }
        if (this instanceof B8C) {
            B8C b8c = (B8C) this;
            b8c.A04.A09(b8c.A02, b8c.A01, b8c.A06, String.valueOf(b8c.A00), 2);
            return;
        }
        B8D b8d = (B8D) this;
        ((B8A) b8d).A02 = true;
        Long l = b8d.A00;
        if (l != null) {
            long longValue = l.longValue();
            C10264sx c10264sx = b8d.A03;
            FbUserSession fbUserSession = b8d.A01;
            String str = b8d.A04;
            c10264sx.A07(fbUserSession, b8d.A02, new Cmx(b8d), str, longValue - 1, b8d.A05);
        }
    }

    public abstract void A04(Bundle bundle);

    public abstract void A05(Bundle bundle);

    public void A06(ImmutableList immutableList) {
        Set A0e = 0QD.A0e(this.A00);
        0QU.A0t(immutableList, A0e);
        this.A00 = 1BL.A0a(A0e);
        if (this instanceof B8A) {
            ((B8A) this).A02 = false;
        } else {
            ((B8B) this).A03 = false;
        }
    }
}
