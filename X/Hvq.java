package X;

import android.content.res.Resources;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: Hvq.class */
public final class Hvq {
    public static final String A00(Resources resources, List list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        int i = 0;
        Integer[] numArr = {7, AbG.A11(), 6, 2};
        do {
            int intValue = numArr[i].intValue();
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (GOn.A0w(it).state == intValue) {
                        return HKn.A00(resources, intValue);
                    }
                }
            }
            i++;
        } while (i < 4);
        return resources.getString(2131967864);
    }
}
