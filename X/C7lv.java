package X;

import java.util.List;

/* renamed from: X.7lv, reason: invalid class name */
/* loaded from: 7lv.class */
public abstract class C7lv {
    public static 6Yl[] A00(List list) {
        6Yl[] r304;
        if (list == null || list.isEmpty()) {
            r304 = new 6Yl[0];
        } else {
            r304 = new 6Yl[list.size()];
            for (int i = 0; i < list.size(); i++) {
                r304[i] = ((6Cu) list.get(i)).A03;
            }
        }
        return r304;
    }
}
