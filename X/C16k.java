package X;

import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.16k, reason: invalid class name */
/* loaded from: 16k.class */
public final class C16k {
    public final Context A00;
    public final 05L A01;
    public final ConcurrentHashMap A02;

    public C16k(Context context, C01s c01s) {
        this.A00 = context;
        this.A01 = c01s == null ? 05L.A02 : new 05L(c01s);
        this.A02 = new ConcurrentHashMap();
    }

    public 0Gp A00(Class cls, String str) {
        Object obj = null;
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (i >= 3) {
                0fH.A17("SystemServiceManager", "Cannot get system service after MAX_RETRIES: %s", new Object[]{cls.getName()});
                break;
            }
            ConcurrentHashMap concurrentHashMap = this.A02;
            obj = concurrentHashMap.get(cls);
            if (obj == null) {
                obj = this.A01.A02(this.A00, cls, str);
                if (obj != null) {
                    concurrentHashMap.putIfAbsent(cls, obj);
                }
            }
            i = i2;
            if (obj != null) {
                break;
            }
        }
        return 0Gp.A00(obj);
    }
}
