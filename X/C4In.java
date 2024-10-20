package X;

import java.util.AbstractMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

/* renamed from: X.4In, reason: invalid class name */
/* loaded from: 4In.class */
public final class C4In {
    public final java.util.Map A00 = new LinkedHashMap();

    public void A00(C4Is... c4IsArr) {
        11T.A0F(c4IsArr, 0);
        int length = c4IsArr.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                return;
            }
            C4Is c4Is = c4IsArr[i2];
            int i3 = c4Is.A01;
            int i4 = c4Is.A00;
            java.util.Map map = this.A00;
            Integer valueOf = Integer.valueOf(i3);
            Object obj = map.get(valueOf);
            if (obj == null) {
                obj = new TreeMap();
                map.put(valueOf, obj);
            }
            AbstractMap abstractMap = (AbstractMap) obj;
            Integer valueOf2 = Integer.valueOf(i4);
            if (abstractMap.containsKey(valueOf2)) {
                StringBuilder A0k = AnonymousClass001.A0k();
                A0k.append("Overriding migration ");
                A0k.append(abstractMap.get(valueOf2));
                android.util.Log.w("ROOM", AnonymousClass001.A0Z(c4Is, 1BJ.A00(62), A0k));
            }
            abstractMap.put(valueOf2, c4Is);
            i = i2 + 1;
        }
    }
}
