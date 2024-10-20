package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.7T9, reason: invalid class name */
/* loaded from: 7T9.class */
public abstract class C7T9 {
    public static final List A00(List list, List list2) {
        Object obj;
        if (!list.isEmpty() && !list2.isEmpty()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            07I it = C0s8.A16(list).iterator();
            while (it.hasNext()) {
                int A00 = it.A00();
                String str = ((C5fu) ((C5fv) list.get(A00))).A0B;
                if (str != null) {
                    linkedHashMap.put(str, Integer.valueOf(A00));
                }
            }
            ArrayList arrayList = new ArrayList();
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                String str2 = ((C5fu) ((C5fv) it2.next())).A0B;
                if (str2 != null) {
                    arrayList.add(str2);
                }
            }
            Iterator it3 = arrayList.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it3.next();
                if (linkedHashMap.get(obj) != null) {
                    break;
                }
            }
            Number number = (Number) linkedHashMap.get(obj);
            if (number != null) {
                return 0QD.A0Y(list, number.intValue());
            }
        }
        return 0QD.A0V(list);
    }
}
