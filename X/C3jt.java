package X;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;

/* renamed from: X.3jt, reason: invalid class name */
/* loaded from: 3jt.class */
public final class C3jt extends SoftReference implements 1kP {
    public final C1kk A00;

    public C3jt(C1kk c1kk, Object obj, ReferenceQueue referenceQueue) {
        super(obj, referenceQueue);
        this.A00 = c1kk;
    }

    public 1kP AIH(C1kk c1kk, Object obj, ReferenceQueue referenceQueue) {
        return new C3jt(c1kk, obj, referenceQueue);
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
