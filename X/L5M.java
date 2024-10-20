package X;

import com.facebook.base.activity.DeliverOnNewIntentWhenFinishing;
import com.google.common.base.Preconditions;
import com.google.common.collect.ArrayTable;
import com.google.common.collect.StandardTable;
import java.util.Iterator;
import java.util.Set;

/* loaded from: L5M.class */
public abstract class L5M {
    public transient Set A00;

    public static Object[] A00(ArrayTable arrayTable, int i, int i2) {
        Preconditions.checkElementIndex(i, arrayTable.rowList.size());
        Preconditions.checkElementIndex(i2, arrayTable.columnList.size());
        return arrayTable.array[i];
    }

    public int A01() {
        int size;
        if (this instanceof StandardTable) {
            Iterator A1A = 1BK.A1A(((StandardTable) this).backingMap);
            int i = 0;
            while (true) {
                size = i;
                if (!A1A.hasNext()) {
                    break;
                }
                i = size + ((java.util.Map) A1A.next()).size();
            }
        } else {
            ArrayTable arrayTable = (ArrayTable) this;
            size = arrayTable.rowList.size() * arrayTable.columnList.size();
        }
        return size;
    }

    public Object A02(Object obj, Object obj2) {
        Object obj3;
        try {
            obj3 = A04().get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            obj3 = null;
        }
        java.util.Map map = (java.util.Map) obj3;
        if (map == null) {
            return null;
        }
        try {
            return map.get(DeliverOnNewIntentWhenFinishing.class);
        } catch (ClassCastException | NullPointerException unused2) {
            return null;
        }
    }

    public Object A03(Object obj, Object obj2, Object obj3) {
        if (this instanceof StandardTable) {
            StandardTable standardTable = (StandardTable) this;
            obj.getClass();
            java.util.Map map = (java.util.Map) standardTable.backingMap.get(obj);
            if (map == null) {
                map = (java.util.Map) standardTable.factory.get();
                standardTable.backingMap.put(obj, map);
            }
            return map.put(obj2, obj3);
        }
        ArrayTable arrayTable = (ArrayTable) this;
        obj.getClass();
        Number number = (Number) arrayTable.rowKeyToIndex.get(obj);
        boolean z = true;
        Preconditions.checkArgument(AnonymousClass001.A1T(number), "Row %s not in %s", obj, arrayTable.rowList);
        Number number2 = (Number) arrayTable.columnKeyToIndex.get(obj2);
        if (number2 == null) {
            z = false;
        }
        Preconditions.checkArgument(z, "Column %s not in %s", obj2, arrayTable.columnList);
        int intValue = number.intValue();
        int intValue2 = number2.intValue();
        Object[] A00 = A00(arrayTable, intValue, intValue2);
        Object obj4 = A00[intValue2];
        A00[intValue2] = obj3;
        return obj4;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [X.K9n, java.util.Map] */
    public java.util.Map A04() {
        KAj kAj;
        if (this instanceof StandardTable) {
            StandardTable standardTable = (StandardTable) this;
            kAj = standardTable.A00;
            if (kAj == null) {
                kAj = new KAj(standardTable);
                standardTable.A00 = kAj;
            }
        } else {
            ArrayTable arrayTable = (ArrayTable) this;
            kAj = arrayTable.A00;
            if (kAj == null) {
                ?? k9n = new K9n(arrayTable);
                arrayTable.A00 = k9n;
                return k9n;
            }
        }
        return kAj;
    }

    public boolean A05() {
        boolean z;
        if (this instanceof StandardTable) {
            z = ((StandardTable) this).backingMap.isEmpty();
        } else {
            ArrayTable arrayTable = (ArrayTable) this;
            if (arrayTable.rowList.isEmpty()) {
                return true;
            }
            z = false;
            if (arrayTable.columnList.isEmpty()) {
                return true;
            }
        }
        return z;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof L5M)) {
            return false;
        }
        L5M l5m = (L5M) obj;
        LyO lyO = this.A00;
        if (lyO == null) {
            lyO = new LyO(this);
            this.A00 = lyO;
        }
        LyO lyO2 = l5m.A00;
        if (lyO2 == null) {
            lyO2 = new LyO(l5m);
            l5m.A00 = lyO2;
        }
        return lyO.equals(lyO2);
    }

    public int hashCode() {
        LyO lyO = this.A00;
        if (lyO == null) {
            lyO = new LyO(this);
            this.A00 = lyO;
        }
        return lyO.hashCode();
    }

    public String toString() {
        return A04().toString();
    }
}
