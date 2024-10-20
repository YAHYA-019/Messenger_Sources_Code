package X;

import android.content.Context;
import java.util.AbstractCollection;
import java.util.HashSet;

/* renamed from: X.1pq, reason: invalid class name */
/* loaded from: 1pq.class */
public abstract class C1pq {
    public static final int A00(double d, int i) {
        long doubleToLongBits = Double.doubleToLongBits(d);
        return (i * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
    }

    public static final int A01(int i, long j) {
        return (i * 31) + ((int) (j ^ (j >>> 32)));
    }

    public static final int A02(int i, boolean z) {
        int i2 = i * 31;
        int i3 = 1237;
        if (z) {
            i3 = 1231;
        }
        return i2 + i3;
    }

    public static final int A03(Object obj) {
        return A04(obj, 1);
    }

    public static final int A04(Object obj, int i) {
        return (i * 31) + (obj != null ? obj.hashCode() : 0);
    }

    public static final int A05(boolean z) {
        int i = 1237;
        if (z) {
            i = 1231;
        }
        return i + 31;
    }

    public static String A06(Context context, int i) {
        String string = context.getString(i);
        A08("contentDescription", string);
        return string;
    }

    public static HashSet A07(Object obj, String str, AbstractCollection abstractCollection, HashSet hashSet) {
        A08(str, obj);
        if (!abstractCollection.contains(str)) {
            hashSet = new HashSet(abstractCollection);
            hashSet.add(str);
        }
        return hashSet;
    }

    public static final void A08(String str, Object obj) {
        if (obj == null) {
            throw AnonymousClass001.A0Q(0Pz.A0W(str, JQw.A00(11)));
        }
    }
}
