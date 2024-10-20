package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: X.6js, reason: invalid class name */
/* loaded from: 6js.class */
public final class C6js {
    public final Set A00 = new LinkedHashSet();
    public final java.util.Map A02 = new LinkedHashMap();
    public final Set A01 = new LinkedHashSet();

    public final void A00(7yY r302, String str) {
        11T.A0F(str, 0);
        11T.A0F(r302, 1);
        java.util.Map map = this.A02;
        Object obj = map.get(str);
        if (obj == null) {
            obj = new LinkedHashSet();
            map.put(str, obj);
        }
        ((Set) obj).add(r302);
    }

    public final void A01(7yY r302, String str) {
        11T.A0F(str, 0);
        11T.A0F(r302, 1);
        Set set = (Set) this.A02.get(str);
        if (set != null) {
            set.remove(r302);
        }
    }

    public final boolean A02(String str) {
        11T.A0F(str, 0);
        if (!this.A01.contains(str)) {
            this.A00.add(str);
            return false;
        }
        java.util.Map map = this.A02;
        Set set = (Set) map.get(str);
        if (set == null) {
            return false;
        }
        if (!(set instanceof Collection) || !set.isEmpty()) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!((7yY) it.next()).BVE()) {
                    return false;
                }
            }
        }
        Set set2 = (Set) map.get(str);
        if (set2 != null) {
            Iterator it2 = set2.iterator();
            while (it2.hasNext()) {
                ((7yY) it2.next()).run();
            }
        }
        this.A00.remove(str);
        return true;
    }
}
