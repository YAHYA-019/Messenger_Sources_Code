package X;

import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.42i, reason: invalid class name */
/* loaded from: 42i.class */
public final class C42i extends ConcurrentHashMap {
    public static final C42i A00 = new C42i();
    public static final long serialVersionUID = 1;
    public final Object lock;

    public C42i() {
        super(180, 0.8f, 4);
        this.lock = new Object();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String A00(String str) {
        String str2 = (String) get(str);
        if (str2 == null) {
            if (size() >= 180) {
                synchronized (this.lock) {
                    if (size() >= 180) {
                        clear();
                    }
                }
            }
            str2 = str.intern();
            put(str2, str2);
        }
        return str2;
    }
}
