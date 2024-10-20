package X;

import android.util.SparseIntArray;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: L2c.class */
public final class L2c {
    public long A00;
    public boolean A01;
    public final Object A03 = AnonymousClass001.A0R();
    public final Object A04 = AnonymousClass001.A0R();
    public final Object A05 = AnonymousClass001.A0R();
    public final SparseIntArray A02 = new SparseIntArray();
    public final Set A08 = new HashSet(15);
    public final java.util.Map A06 = new HashMap(15);
    public final Set A07 = Collections.synchronizedSet(new HashSet(15));

    public static int A00(L2c l2c, KaS kaS) {
        KNC knc = KNC.GARBAGE_COLLECTION;
        Set set = l2c.A07;
        if (set.contains(kaS)) {
            return 0;
        }
        synchronized (l2c.A03) {
            java.util.Map map = l2c.A06;
            if (!map.containsKey(knc)) {
                map.put(knc, kaS);
                set.add(kaS);
            } else if (!set.contains(kaS)) {
                throw 1BK.A0f("Marker %s cannot be added since marker with priority %s has already been seen", new Object[]{"gc", "GARBAGE_COLLECTION"});
            }
        }
        return 0;
    }

    public void A01() {
        synchronized (this.A05) {
            Set set = this.A08;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                int A00 = A00(this, (KaS) it.next());
                synchronized (this.A04) {
                    SparseIntArray sparseIntArray = this.A02;
                    int i = sparseIntArray.get(A00) - 1;
                    if (i < 0) {
                        throw AnonymousClass001.A0N("Unset a marker which was not set.");
                    }
                    sparseIntArray.put(A00, i);
                    if (i == 0) {
                        this.A00 = ((1 << A00) ^ (-1)) & this.A00;
                    }
                }
            }
            set.clear();
        }
    }
}
