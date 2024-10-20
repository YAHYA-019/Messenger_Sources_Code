package X;

import com.facebook.acra.constants.ActionId;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.4U9, reason: invalid class name */
/* loaded from: 4U9.class */
public final class C4U9 {
    public final Set A00 = 1Bi.A06(ActionId.FILE_SYSTEM_FAIL);

    public 4AG A00(1OZ r302) {
        4AG r0;
        synchronized (this) {
            Iterator it = this.A00.iterator();
            do {
                if (!it.hasNext()) {
                    return null;
                }
                r0 = (4AG) it.next();
            } while (r0.BAD() != r302);
            return r0;
        }
    }
}
