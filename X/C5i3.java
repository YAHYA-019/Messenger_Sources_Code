package X;

import java.util.ArrayList;

/* renamed from: X.5i3, reason: invalid class name */
/* loaded from: 5i3.class */
public final class C5i3 {
    public C5i5 A00;
    public final C5hz A03;
    public final C5i4 A04 = new C5i4();
    public final ArrayList A05 = new ArrayList();
    public boolean A02 = false;
    public boolean A01 = false;

    public C5i3(C5hz c5hz) {
        this.A03 = c5hz;
    }

    public void A00() {
        if (!this.A02) {
            return;
        }
        this.A02 = false;
        this.A03.A01(this);
        C5i4 c5i4 = this.A04;
        int i = 0;
        while (true) {
            int i2 = i;
            ArrayList arrayList = c5i4.A00;
            if (i2 >= arrayList.size()) {
                return;
            }
            C5i7 c5i7 = (C5i7) arrayList.get(i2);
            C5i7 c5i72 = (C5i7) c5i4.A02.get(i2);
            String str = (String) c5i4.A01.get(i2);
            java.util.Map map = c5i72.A03;
            if ((map == null ? null : map.get(str)) == c5i7) {
                C5i4.A00(c5i7, c5i72, str);
            }
            i = i2 + 1;
        }
    }

    public void A01(C5i7 c5i7, C5i7 c5i72, String str) {
        if (this.A01) {
            throw AnonymousClass001.A0T("Trying to add binding after DataFlowGraph has already been activated.");
        }
        C5i4 c5i4 = this.A04;
        c5i4.A00.add(c5i7);
        c5i4.A02.add(c5i72);
        c5i4.A01.add(str);
        ArrayList arrayList = this.A05;
        arrayList.add(c5i7);
        arrayList.add(c5i72);
    }
}
