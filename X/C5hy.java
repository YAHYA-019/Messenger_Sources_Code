package X;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.5hy, reason: invalid class name */
/* loaded from: 5hy.class */
public abstract class C5hy {
    public Object A00;
    public CopyOnWriteArrayList A01 = new CopyOnWriteArrayList();

    public final void A02() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.A01;
        int size = copyOnWriteArrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((5XP) copyOnWriteArrayList.get(size)).Bn1(this);
            }
        }
    }

    public final void A03() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.A01;
        int size = copyOnWriteArrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((5XP) copyOnWriteArrayList.get(size)).Bye(this);
            }
        }
    }

    public final void A04() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.A01;
        int size = copyOnWriteArrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((5XP) copyOnWriteArrayList.get(size)).CIr(this);
            }
        }
    }

    public final void A05() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.A01;
        int size = copyOnWriteArrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((5XP) copyOnWriteArrayList.get(size)).CVA(this);
            }
        }
    }

    public final boolean A06() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.A01;
        boolean z = true;
        int size = copyOnWriteArrayList.size() - 1;
        while (true) {
            int i = size;
            if (i < 0) {
                break;
            }
            if (!((5XP) copyOnWriteArrayList.get(i)).Cyp(this)) {
                z = false;
                break;
            }
            size = i - 1;
        }
        return z;
    }

    public void A07() {
        if (this instanceof C5hx) {
            A04();
            return;
        }
        C5i8 c5i8 = (C5i8) this;
        c5i8.A04();
        List list = c5i8.A07;
        int size = list.size();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= size) {
                return;
            }
            ((C5hy) list.get(i2)).A07();
            i = i2 + 1;
        }
    }

    public void A08() {
        if (this instanceof C5hx) {
            C5i3 c5i3 = ((C5hx) this).A00;
            if (c5i3.A02) {
                c5i3.A00();
                return;
            }
            return;
        }
        C5i8 c5i8 = (C5i8) this;
        if (c5i8.A03) {
            c5i8.A03 = false;
            c5i8.A01 = null;
            List list = c5i8.A07;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                C5hy c5hy = (C5hy) list.get(i);
                if (c5hy.A0B()) {
                    c5hy.A08();
                }
            }
        }
    }

    public void A09(5XS r302) {
        C5i7 c5i7;
        C5i3 c5i3;
        String str;
        if (this instanceof C5i8) {
            C5i8 c5i8 = (C5i8) this;
            if (c5i8.A02) {
                throw AnonymousClass001.A0T("Starting binding multiple times");
            }
            c5i8.A02 = true;
            c5i8.A01 = r302;
            if (!c5i8.A06()) {
                c5i8.A02();
                return;
            }
            c5i8.A05();
            c5i8.A03 = true;
            List list = c5i8.A07;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((C5hy) it.next()).A01.add(c5i8.A06);
            }
            if (c5i8.A05 != 0) {
                int size = list.size();
                for (int i = 1; i < size; i++) {
                    ((C5hy) list.get(i)).A07();
                }
                C5i8.A01(c5i8);
                return;
            }
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((C5hy) list.get(i2)).A09(c5i8.A01);
            }
            c5i8.A00 = list.size();
            return;
        }
        C5hx c5hx = (C5hx) this;
        if (!c5hx.A06()) {
            c5hx.A02();
            return;
        }
        c5hx.A05();
        if (c5hx instanceof C5hw) {
            C5hw c5hw = (C5hw) c5hx;
            C5i9 c5i9 = new C5i9(c5hw.A00);
            C5hv c5hv = c5hw.A02;
            C5ht c5ht = c5hv.A01;
            C5i7 c5i72 = new 5iB(r302.Afw(c5ht));
            C5i7 c5i73 = new 5iB(c5hv.A00);
            C5i7 c5i74 = new C5i7();
            Interpolator interpolator = c5hw.A01;
            if (interpolator != null) {
                5iD r0 = new 5iD(interpolator);
                c5i3 = ((C5hx) c5hw).A00;
                str = "default_input";
                c5i3.A01(c5i9, r0, str);
                c5i3.A01(r0, c5i74, str);
            } else {
                c5i3 = ((C5hx) c5hw).A00;
                str = "default_input";
                c5i3.A01(c5i9, c5i74, str);
            }
            c5i3.A01(c5i72, c5i74, "initial");
            c5i3.A01(c5i73, c5i74, "end");
            c5i3.A01(c5i74, r302.AWt(c5ht), str);
        } else {
            C6c3 c6c3 = (C6c3) c5hx;
            C6c4 c6c4 = new C6c4(c6c3.A01);
            C5hv c5hv2 = c6c3.A00;
            C5ht c5ht2 = c5hv2.A01;
            C5i7 c5i75 = new 5iB(r302.Afw(c5ht2));
            C5i7 c5i76 = new 5iB(c5hv2.A00);
            C5i3 c5i32 = ((C5hx) c6c3).A00;
            c5i32.A01(c5i75, c6c4, "initial");
            c5i32.A01(c5i76, c6c4, "end");
            c5i32.A01(c6c4, r302.AWt(c5ht2), "default_input");
        }
        C5i3 c5i33 = c5hx.A00;
        C5i4 c5i4 = c5i33.A04;
        int i3 = 0;
        while (true) {
            ArrayList arrayList = c5i4.A00;
            if (i3 >= arrayList.size()) {
                c5i33.A01 = true;
                c5i33.A02 = true;
                c5i33.A03.A00(c5i33);
                return;
            }
            C5i7 c5i77 = (C5i7) arrayList.get(i3);
            C5i7 c5i78 = (C5i7) c5i4.A02.get(i3);
            String str2 = (String) c5i4.A01.get(i3);
            java.util.Map map = c5i78.A03;
            if (map != null && (c5i7 = (C5i7) map.get(str2)) != null) {
                C5i4.A00(c5i7, c5i78, str2);
            }
            ArrayList arrayList2 = c5i77.A02;
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                c5i77.A02 = arrayList2;
            }
            arrayList2.add(c5i78);
            java.util.Map map2 = c5i78.A03;
            if (map2 == null) {
                map2 = new LinkedHashMap();
                c5i78.A03 = map2;
            }
            map2.put(str2, c5i77);
            i3++;
        }
    }

    public void A0A(ArrayList arrayList) {
        C5hv c5hv;
        if (this instanceof C5hw) {
            c5hv = ((C5hw) this).A02;
        } else if (this instanceof C6c3) {
            c5hv = ((C6c3) this).A00;
        } else {
            List list = ((C5i8) this).A07;
            int size = list.size();
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= size) {
                    return;
                }
                ((C5hy) list.get(i2)).A0A(arrayList);
                i = i2 + 1;
            }
        }
        arrayList.add(c5hv);
    }

    public boolean A0B() {
        return this instanceof C5hx ? ((C5hx) this).A00.A02 : ((C5i8) this).A03;
    }
}
