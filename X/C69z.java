package X;

import android.graphics.Rect;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.69z, reason: invalid class name */
/* loaded from: 69z.class */
public final class C69z implements 4hQ {
    public 6A1 A00;
    public 6A0 A01;
    public 2ID A02;
    public List A03;
    public boolean A04;
    public final C0dr A05;
    public final C69u A06;
    public final C06664hk A07 = new C06664hk(0S2.A0C);

    public C69z(C0dr c0dr, C69u c69u) {
        this.A05 = c0dr;
        this.A06 = c69u;
    }

    public void Bgh(C06664hk c06664hk, Integer num) {
        List list;
        C69f c69f;
        11T.A0F(num, 0);
        if (!this.A04 || (list = this.A03) == null || list.isEmpty()) {
            return;
        }
        if (num == 0S2.A0N && (c69f = ((C69v) this.A06).A02) != null) {
            Rect bounds = c69f.A05.getBounds();
            C06664hk c06664hk2 = this.A07;
            c06664hk2.A01 = bounds.width();
            c06664hk2.A00 = bounds.height();
        }
        5CQ A00 = c06664hk.A00();
        Iterator it = this.A03.iterator();
        while (it.hasNext()) {
            ((5CK) it.next()).C1P(A00, num);
        }
    }

    public void Bgn(C06664hk c06664hk, Integer num) {
        List list;
        if (!this.A04 || (list = this.A03) == null || list.isEmpty()) {
            return;
        }
        5CQ A00 = c06664hk.A00();
        Iterator it = this.A03.iterator();
        while (it.hasNext()) {
            ((5CK) it.next()).C1S(A00, num);
        }
    }
}
