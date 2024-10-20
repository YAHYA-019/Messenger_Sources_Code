package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2i0, reason: invalid class name */
/* loaded from: 2i0.class */
public final class C2i0 implements C2i1 {
    public final int A00;
    public final C2hq A01;
    public final C2hr A02;
    public final List A03;
    public final List A04;
    public final List A05;
    public final List A06;
    public final List A07;

    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, X.2i3] */
    public C2i0(C2hq c2hq, C2hr c2hr, List list, List list2) {
        this.A07 = list;
        this.A00 = list != null ? list.size() : 0;
        this.A04 = list2;
        this.A01 = c2hq;
        this.A02 = c2hr;
        this.A05 = new ArrayList();
        this.A06 = new ArrayList();
        this.A03 = new ArrayList();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= this.A00) {
                return;
            }
            List list3 = this.A06;
            ?? obj = new Object();
            obj.A00 = null;
            obj.A01 = false;
            list3.add(obj);
            this.A03.add(new C2i4(this.A07.get(i2), null));
            i = i2 + 1;
        }
    }

    @Override // X.C2i1
    public void Bnh(int i, int i2, Object obj) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = i + i3;
            C2i3 c2i3 = (C2i3) this.A06.get(i4);
            c2i3.A01 = true;
            arrayList.add(c2i3);
            arrayList2.add(this.A03.get(i4));
        }
        this.A05.add(new C2i5(arrayList, arrayList2, 1, i, -1));
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, X.2i3] */
    @Override // X.C2i1
    public void C1x(int i, int i2) {
        ArrayList arrayList = new ArrayList(i2);
        ArrayList arrayList2 = new ArrayList(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = i + i3;
            ?? obj = new Object();
            obj.A00 = null;
            obj.A01 = true;
            this.A06.add(i4, obj);
            arrayList.add(obj);
            C2i4 c2i4 = new C2i4(null, null);
            this.A03.add(i4, c2i4);
            arrayList2.add(c2i4);
        }
        this.A05.add(new C2i5(arrayList, arrayList2, 0, i, -1));
    }

    @Override // X.C2i1
    public void C7k(int i, int i2) {
        ArrayList arrayList = new ArrayList(1);
        List list = this.A06;
        list.add(i2, list.remove(i));
        List list2 = this.A03;
        Object remove = list2.remove(i);
        arrayList.add(remove);
        list2.add(i2, remove);
        this.A05.add(new C2i5(null, arrayList, 3, i, i2));
    }

    @Override // X.C2i1
    public void CGT(int i, int i2) {
        ArrayList arrayList = new ArrayList(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            this.A06.remove(i);
            arrayList.add(this.A03.remove(i));
        }
        this.A05.add(new C2i5(null, arrayList, 2, i, i2));
    }
}
