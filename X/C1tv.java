package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1tv, reason: invalid class name */
/* loaded from: 1tv.class */
public final class C1tv {
    public List A00;
    public List A01;
    public List A02;

    public final void A00(3lE r302, C3mB c3mB) {
        C3s9 ALE;
        List list = this.A01;
        if (list == null) {
            list = new ArrayList();
            this.A01 = list;
        }
        list.add(c3mB);
        if (!c3mB.BDj() || (ALE = c3mB.ALE(r302)) == null) {
            return;
        }
        List list2 = this.A00;
        if (list2 == null) {
            list2 = AnonymousClass001.A0s();
            this.A00 = list2;
        }
        list2.add(ALE);
    }

    public final void A01(C1tv c1tv) {
        List list = c1tv.A02;
        if (list != null) {
            List list2 = this.A02;
            if (list2 == null) {
                list2 = new ArrayList(list.size());
                this.A02 = list2;
            }
            list2.addAll(list);
        }
        List list3 = c1tv.A01;
        if (list3 != null) {
            List list4 = this.A01;
            if (list4 == null) {
                list4 = new ArrayList(list3.size());
                this.A01 = list4;
            }
            list4.addAll(list3);
        }
        List list5 = c1tv.A00;
        if (list5 != null) {
            List list6 = this.A00;
            if (list6 == null) {
                list6 = AnonymousClass001.A0t(list5.size());
                this.A00 = list6;
            }
            list6.addAll(list5);
        }
    }
}
