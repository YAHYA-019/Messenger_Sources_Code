package X;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: X.3ju, reason: invalid class name */
/* loaded from: 3ju.class */
public final class C3ju extends WeakReference implements 1kP {
    public final C1kk A00;

    public C3ju(C1kk c1kk, Object obj, ReferenceQueue referenceQueue) {
        super(obj, referenceQueue);
        this.A00 = c1kk;
    }

    public 1kP AIH(C1kk c1kk, Object obj, ReferenceQueue referenceQueue) {
        return new C3ju(c1kk, obj, referenceQueue);
    }

    public C1kk Ak6() {
        return this.A00;
    }

    public int BKd() {
        return 1;
    }

    public boolean BQN() {
        return true;
    }

    public boolean BTn() {
        return false;
    }

    public void BgS(Object obj) {
    }

    public Object DA6() {
        return get();
    }
}
