package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.73a, reason: invalid class name */
/* loaded from: 73a.class */
public final class C73a implements 6zD {
    public final List A00;

    public C73a(List list) {
        this.A00 = list;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.75B, java.lang.Object] */
    public boolean BUV(5vW r302, int i) {
        11T.A0F(r302, 0);
        if (new Object().BUV(r302, i)) {
            return false;
        }
        List list = this.A00;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((73S) it.next()).BUU(r302)) {
                return true;
            }
        }
        return false;
    }
}
