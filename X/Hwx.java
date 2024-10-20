package X;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: Hwx.class */
public final class Hwx {
    public List A00 = new CopyOnWriteArrayList();

    public static void A00(List list) {
        Iterator it = list.iterator();
        if (it.hasNext()) {
            it.next();
            throw AnonymousClass001.A0Q("onPost");
        }
    }
}
