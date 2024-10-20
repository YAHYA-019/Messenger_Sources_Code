package X;

/* renamed from: X.0y6, reason: invalid class name */
/* loaded from: 0y6.class */
public final class C0y6 extends 0IY {
    public void A00(0IV r302, 0IV r303) {
        r302.next = r303;
    }

    public void A01(0IV r302, Thread thread) {
        r302.thread = thread;
    }

    public boolean A02(0IW r302, 0IW r303, 0IU r304) {
        boolean z;
        synchronized (r304) {
            if (r304.listeners == r302) {
                r304.listeners = r303;
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    public boolean A03(0IV r302, 0IV r303, 0IU r304) {
        boolean z;
        synchronized (r304) {
            if (r304.waiters == r302) {
                r304.waiters = r303;
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    public boolean A04(0IU r302, Object obj, Object obj2) {
        boolean z;
        synchronized (r302) {
            if (r302.value == null) {
                r302.value = obj2;
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }
}
