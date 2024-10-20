package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.2yw, reason: invalid class name */
/* loaded from: 2yw.class */
public final class C2yw extends C1rs {
    public 1Iw A00;
    public 2dA A01;

    public void A2W(float f) {
        this.A01.A00 = this.A02.A02(f);
    }

    public void A2X(1LI r302) {
        if (r302 != null) {
            2dA r0 = this.A01;
            List list = r0.A01;
            if (list == Collections.EMPTY_LIST) {
                list = new ArrayList();
                r0.A01 = list;
            }
            list.add(r302);
        }
    }

    public void A2Y(List list) {
        if (list != null) {
            2dA r0 = this.A01;
            if (r0.A01.isEmpty()) {
                r0.A01 = list;
            } else {
                r0.A01.addAll(list);
            }
        }
    }
}
