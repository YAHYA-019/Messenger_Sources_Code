package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.17v, reason: invalid class name */
/* loaded from: 17v.class */
public abstract class C17v implements AnonymousClass170 {
    public final String A00;
    public final HashMap A01 = AnonymousClass001.A0u();

    public C17v(String str) {
        this.A00 = str;
    }

    public static void A00(C16z c16z, C17v c17v) {
        ((AtomicLong) c17v.A01(c16z)).incrementAndGet();
    }

    public Object A01(C16z c16z) {
        Object obj;
        synchronized (this) {
            try {
                HashMap hashMap = this.A01;
                if (!hashMap.containsKey(c16z)) {
                    hashMap.put(c16z, c16z.BIx().newInstance());
                }
                obj = hashMap.get(c16z);
            } catch (Exception e) {
                throw new RuntimeException(String.format("Incorrect usage for %s type %s", c16z.Asm(), c16z.BIx()), e);
            }
        }
        return obj;
    }

    public JSONObject A02(boolean z, boolean z2) {
        JSONObject A12;
        synchronized (this) {
            A12 = AnonymousClass001.A12();
            Iterator A0x = AnonymousClass001.A0x(this.A01);
            while (A0x.hasNext()) {
                Map.Entry A0z = AnonymousClass001.A0z(A0x);
                A12.putOpt(((C16z) A0z.getKey()).Asm(), A0z.getValue());
            }
        }
        return A12;
    }

    public void A03(C16z c16z, Object obj) {
        synchronized (this) {
            this.A01.put(c16z, obj);
        }
    }

    public String toString() {
        try {
            return A02(false, false).toString();
        } catch (JSONException unused) {
            return "";
        }
    }
}
