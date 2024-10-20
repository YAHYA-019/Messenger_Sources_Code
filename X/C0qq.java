package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.0qq, reason: invalid class name */
/* loaded from: 0qq.class */
public final class C0qq implements C1A0 {
    public final List A00;

    public C0qq(C1A0... c1a0Arr) {
        this.A00 = 02L.A09(c1a0Arr);
    }

    @Override // X.C1A0
    public void Btd(int i, String str) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((C1A0) it.next()).Btd(i, str);
        }
    }

    @Override // X.C1A0
    public void C3z(int i, String str, String[] strArr) {
        11T.A0F(strArr, 2);
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((C1A0) it.next()).C3z(i, str, strArr);
        }
    }

    @Override // X.C1A0
    public void C4i(int i, String str, boolean z) {
        11T.A0F(str, 1);
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((C1A0) it.next()).C4i(i, str, z);
        }
    }

    @Override // X.C1A0
    public void C4j(int i, String str) {
        11T.A0F(str, 1);
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((C1A0) it.next()).C4j(i, str);
        }
    }

    @Override // X.C1A0
    public void C4k(String str) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((C1A0) it.next()).C4k(str);
        }
    }

    @Override // X.C1A0
    public void C8Q(int i, String str) {
        11T.A0F(str, 1);
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((C1A0) it.next()).C8Q(i, str);
        }
    }
}
