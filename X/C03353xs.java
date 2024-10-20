package X;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3xs, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3xs.class */
public final class C03353xs extends 2DO implements Serializable {
    public static final long serialVersionUID = 1;
    public final List _children;

    public C03353xs(C26T c26t) {
        super(c26t);
        this._children = new ArrayList();
    }

    public boolean A01(C26c c26c) {
        return this._children.isEmpty();
    }

    public int A05() {
        return this._children.size();
    }

    public /* bridge */ /* synthetic */ 24X A0A() {
        C03353xs c03353xs = new C03353xs(((2DO) this)._nodeFactory);
        Iterator it = this._children.iterator();
        while (it.hasNext()) {
            c03353xs._children.add(((24X) it.next()).A0A());
        }
        return c03353xs;
    }

    public 24X A0B(int i) {
        if (i < 0 || i >= this._children.size()) {
            return null;
        }
        return (24X) this._children.get(i);
    }

    public 24X A0C(String str) {
        Iterator it = this._children.iterator();
        while (it.hasNext()) {
            24X A0C = ((24X) it.next()).A0C(str);
            if (A0C != null) {
                return A0C;
            }
        }
        return null;
    }

    public 24X A0D(String str) {
        return null;
    }

    public 24X A0E(String str) {
        return C10554tt.A00;
    }

    public 2wD A0F() {
        return 2wD.A01;
    }

    public Iterator A0L() {
        return this._children.iterator();
    }

    public boolean A0R() {
        return true;
    }

    public void A0d(24X r302) {
        if (r302 == null) {
            r302 = C09924rw.A00;
        }
        this._children.add(r302);
    }

    public void A0e(String str) {
        this._children.add(str == null ? C09924rw.A00 : 2Jz.A00(str));
    }

    public C42h AAi() {
        return C42h.A05;
    }

    public /* bridge */ /* synthetic */ C24a AUQ(String str) {
        return null;
    }

    public void ClJ(28Q r302, C26c c26c) {
        List list = this._children;
        int size = list.size();
        r302.A0n(this, size);
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= size) {
                r302.A0X();
                return;
            } else {
                ((24X) list.get(i2)).ClJ(r302, c26c);
                i = i2 + 1;
            }
        }
    }

    public void ClK(28Q r302, C26c c26c, C4Nr c4Nr) {
        Kls A01 = c4Nr.A01(r302, c4Nr.A03(C42h.A05, this));
        Iterator it = this._children.iterator();
        while (it.hasNext()) {
            ((24X) it.next()).ClJ(r302, c26c);
        }
        c4Nr.A02(r302, A01);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof C03353xs)) {
            return false;
        }
        return this._children.equals(((C03353xs) obj)._children);
    }

    public int hashCode() {
        return this._children.hashCode();
    }
}
