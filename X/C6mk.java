package X;

import android.util.SparseIntArray;
import com.google.common.collect.ImmutableList;
import java.util.HashMap;

/* renamed from: X.6mk, reason: invalid class name */
/* loaded from: 6mk.class */
public final class C6mk {
    public 1BY A00;
    public final SparseIntArray A01 = new SparseIntArray();
    public final C00i A02 = new 1BV((1BY) null, 49935);

    public C6mk(1BO r302) {
        this.A00 = new 1BY(r302);
    }

    public String A00() {
        SparseIntArray sparseIntArray = this.A01;
        int size = sparseIntArray.size();
        if (size <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(size * 50);
        sb.append('{');
        int i = 0;
        while (true) {
            sb.append(63V.A00[sparseIntArray.keyAt(i)]);
            sb.append('=');
            sb.append(sparseIntArray.valueAt(i));
            i++;
            if (i >= size) {
                sb.append('}');
                return sb.toString();
            }
            if (i > 0) {
                sb.append(", ");
            }
        }
    }

    public HashMap A01() {
        SparseIntArray sparseIntArray = this.A01;
        int size = sparseIntArray.size();
        HashMap hashMap = new HashMap();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= size) {
                return hashMap;
            }
            hashMap.put(63V.A00[sparseIntArray.keyAt(i2)].toString(), Integer.valueOf(sparseIntArray.valueAt(i2)));
            i = i2 + 1;
        }
    }

    public void A02(ImmutableList immutableList) {
        SparseIntArray sparseIntArray = this.A01;
        sparseIntArray.clear();
        int size = immutableList.size();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= size) {
                return;
            }
            int ordinal = ((C60h) this.A02.get()).A00((AnonymousClass624) immutableList.get(i2)).ordinal();
            sparseIntArray.put(ordinal, sparseIntArray.get(ordinal, 0) + 1);
            i = i2 + 1;
        }
    }
}
