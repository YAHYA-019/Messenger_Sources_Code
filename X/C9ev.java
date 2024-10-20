package X;

import com.facebook.messaging.model.threadkey.ThreadKey;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9ev, reason: invalid class name */
/* loaded from: 9ev.class */
public final class C9ev {
    public final 1Br A00 = 7zM.A0a();

    public static final Integer A00(ThreadKey threadKey, C9ev c9ev, List list) {
        boolean A0y = threadKey.A0y();
        Integer num = null;
        if (A0y) {
            8KG r0 = (8KG) 0QD.A0E(list);
            if ((r0 != null ? r0.A03 : null) == 0S2.A00 && (!(list instanceof Collection) || !list.isEmpty())) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (((8KG) it.next()).A07 != null) {
                        if (4YV.A0V(c9ev.A00.A00).AZk(36322796125243258L)) {
                            return 0S2.A0N;
                        }
                    }
                }
            }
        }
        if (A0y) {
            8KG r02 = (8KG) 0QD.A0E(list);
            Integer num2 = r02 != null ? r02.A03 : null;
            Integer num3 = 0S2.A01;
            if (num2 == num3) {
                return 0S2.A0C;
            }
            if (4YV.A0V(c9ev.A00.A00).AZk(36322796124063593L)) {
                return num3;
            }
        }
        8KG r03 = (8KG) 0QD.A0E(list);
        if (r03 != null) {
            num = r03.A03;
        }
        return num == 0S2.A0N ? 0S2.A0Y : 0S2.A00;
    }
}
