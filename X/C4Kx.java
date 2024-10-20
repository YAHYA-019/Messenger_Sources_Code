package X;

/* renamed from: X.4Kx, reason: invalid class name */
/* loaded from: 4Kx.class */
public abstract class C4Kx {
    public boolean A00(C4Kv c4Kv, C4Kv c4Kv2, C4Kt c4Kt) {
        boolean z;
        if (this instanceof C4Kw) {
            return C2am.A00(c4Kt, c4Kv, c4Kv2, ((C4Kw) this).A00);
        }
        synchronized (c4Kt) {
            if (c4Kt.listeners == c4Kv) {
                c4Kt.listeners = c4Kv2;
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    public boolean A01(C4Ku c4Ku, C4Ku c4Ku2, C4Kt c4Kt) {
        boolean z;
        if (this instanceof C4Kw) {
            return C2am.A00(c4Kt, c4Ku, c4Ku2, ((C4Kw) this).A04);
        }
        synchronized (c4Kt) {
            if (c4Kt.waiters == c4Ku) {
                c4Kt.waiters = c4Ku2;
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    public boolean A02(C4Kt c4Kt, Object obj, Object obj2) {
        boolean z;
        if (this instanceof C4Kw) {
            return C2am.A00(c4Kt, obj, obj2, ((C4Kw) this).A01);
        }
        synchronized (c4Kt) {
            if (c4Kt.value == obj) {
                c4Kt.value = obj2;
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }
}
