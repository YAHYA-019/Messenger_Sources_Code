package X;

import com.fasterxml.jackson.databind.JsonSerializer;
import java.util.Map;

/* renamed from: X.3pe, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3pe.class */
public final class C01013pe {
    public final int A00;
    public final 3sZ[] A01;

    public C01013pe(java.util.Map map) {
        int i;
        int size = map.size();
        int i2 = size > 64 ? (size >> 2) + size : size + size;
        int i3 = 8;
        while (true) {
            i = i3;
            if (i >= i2) {
                break;
            } else {
                i3 = i + i;
            }
        }
        this.A00 = i - 1;
        3sZ[] r0 = new 3sZ[i];
        for (Map.Entry entry : map.entrySet()) {
            C43J c43j = (C43J) entry.getKey();
            int hashCode = c43j.hashCode() & this.A00;
            r0[hashCode] = new 3sZ((JsonSerializer) entry.getValue(), r0[hashCode], c43j);
        }
        this.A01 = r0;
    }

    public JsonSerializer A00(24S r302) {
        3sZ r303 = this.A01[(r302.hashCode() - 1) & this.A00];
        if (r303 == null) {
            return null;
        }
        do {
            if (!r303.A04 && r302.equals(r303.A00)) {
                return r303.A01;
            }
            r303 = r303.A02;
        } while (r303 != null);
        return null;
    }

    public JsonSerializer A01(Class cls) {
        3sZ r303 = this.A01[cls.getName().hashCode() & this.A00];
        if (r303 == null) {
            return null;
        }
        do {
            if (r303.A03 == cls && !r303.A04) {
                return r303.A01;
            }
            r303 = r303.A02;
        } while (r303 != null);
        return null;
    }
}
