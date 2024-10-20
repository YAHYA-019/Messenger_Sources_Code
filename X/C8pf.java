package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.8pf, reason: invalid class name */
/* loaded from: 8pf.class */
public final class C8pf extends 2Yv {
    public List A00;
    public List A01;
    public AtomicBoolean A02;

    public void A02(C2l4 c2l4) {
        String str;
        Object[] objArr = c2l4.A01;
        if (c2l4.A00 == 0) {
            List list = this.A00;
            11T.A0F(objArr[0], 2);
            if (list == null) {
                throw 1BK.A0h();
            }
            ArrayList A0t = AnonymousClass001.A0t(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                CharSequence A00 = C8oa.A00((C2iw) it.next());
                if (A00 != null) {
                    str = A00.toString();
                    if (str != null) {
                        A0t.add(str);
                    }
                }
                str = "";
                A0t.add(str);
            }
            this.A00 = list;
            this.A01 = A0t;
        }
    }
}
