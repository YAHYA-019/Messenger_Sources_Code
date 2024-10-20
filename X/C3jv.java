package X;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: X.3jv, reason: invalid class name */
/* loaded from: 3jv.class */
public class C3jv extends WeakReference implements C1kk {
    public final int A00;
    public final C1kk A01;
    public volatile 1kP A02;

    public C3jv(C1kk c1kk, Object obj, ReferenceQueue referenceQueue, int i) {
        super(obj, referenceQueue);
        this.A02 = 1kN.A0M;
        this.A00 = i;
        this.A01 = c1kk;
    }

    @Override // X.C1kk
    public long AV1() {
        if (this instanceof 3CQ) {
            return ((3CQ) this).A04;
        }
        if (this instanceof 3CO) {
            return ((3CO) this).A02;
        }
        throw AnonymousClass001.A0p();
    }

    @Override // X.C1kk
    public int Aoj() {
        return this.A00;
    }

    @Override // X.C1kk
    public C1kk Az6() {
        return this.A01;
    }

    @Override // X.C1kk
    public C1kk AzA() {
        if (this instanceof 3CQ) {
            return ((3CQ) this).A00;
        }
        if (this instanceof 3CO) {
            return ((3CO) this).A00;
        }
        throw AnonymousClass001.A0p();
    }

    @Override // X.C1kk
    public C1kk AzB() {
        if (this instanceof 3CP) {
            return ((3CP) this).A00;
        }
        if (this instanceof 3CQ) {
            return ((3CQ) this).A01;
        }
        throw AnonymousClass001.A0p();
    }

    @Override // X.C1kk
    public C1kk B4Z() {
        if (this instanceof 3CQ) {
            return ((3CQ) this).A02;
        }
        if (this instanceof 3CO) {
            return ((3CO) this).A01;
        }
        throw AnonymousClass001.A0p();
    }

    @Override // X.C1kk
    public C1kk B4a() {
        if (this instanceof 3CP) {
            return ((3CP) this).A01;
        }
        if (this instanceof 3CQ) {
            return ((3CQ) this).A03;
        }
        throw AnonymousClass001.A0p();
    }

    @Override // X.C1kk
    public 1kP BIt() {
        return this.A02;
    }

    @Override // X.C1kk
    public long BL5() {
        if (this instanceof 3CP) {
            return ((3CP) this).A02;
        }
        if (this instanceof 3CQ) {
            return ((3CQ) this).A05;
        }
        throw AnonymousClass001.A0p();
    }

    @Override // X.C1kk
    public void ClW(long j) {
        if (this instanceof 3CQ) {
            ((3CQ) this).A04 = j;
        } else {
            if (!(this instanceof 3CO)) {
                throw AnonymousClass001.A0p();
            }
            ((3CO) this).A02 = j;
        }
    }

    @Override // X.C1kk
    public void Crf(C1kk c1kk) {
        if (this instanceof 3CQ) {
            ((3CQ) this).A00 = c1kk;
        } else {
            if (!(this instanceof 3CO)) {
                throw AnonymousClass001.A0p();
            }
            ((3CO) this).A00 = c1kk;
        }
    }

    @Override // X.C1kk
    public void Crg(C1kk c1kk) {
        if (this instanceof 3CP) {
            ((3CP) this).A00 = c1kk;
        } else {
            if (!(this instanceof 3CQ)) {
                throw AnonymousClass001.A0p();
            }
            ((3CQ) this).A01 = c1kk;
        }
    }

    @Override // X.C1kk
    public void CtK(C1kk c1kk) {
        if (this instanceof 3CQ) {
            ((3CQ) this).A02 = c1kk;
        } else {
            if (!(this instanceof 3CO)) {
                throw AnonymousClass001.A0p();
            }
            ((3CO) this).A01 = c1kk;
        }
    }

    @Override // X.C1kk
    public void CtL(C1kk c1kk) {
        if (this instanceof 3CP) {
            ((3CP) this).A01 = c1kk;
        } else {
            if (!(this instanceof 3CQ)) {
                throw AnonymousClass001.A0p();
            }
            ((3CQ) this).A03 = c1kk;
        }
    }

    @Override // X.C1kk
    public void Cw2(1kP r302) {
        this.A02 = r302;
    }

    @Override // X.C1kk
    public void Cwk(long j) {
        if (this instanceof 3CP) {
            ((3CP) this).A02 = j;
        } else {
            if (!(this instanceof 3CQ)) {
                throw AnonymousClass001.A0p();
            }
            ((3CQ) this).A05 = j;
        }
    }

    @Override // X.C1kk
    public Object getKey() {
        return get();
    }
}
