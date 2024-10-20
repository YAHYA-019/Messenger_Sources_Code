package X;

/* renamed from: X.1kj, reason: invalid class name */
/* loaded from: 1kj.class */
public abstract class C1kj implements C1kk {
    @Override // X.C1kk
    public long AV1() {
        if (this instanceof 2FI) {
            return ((2FI) this).A04;
        }
        if (this instanceof C1ki) {
            return Long.MAX_VALUE;
        }
        throw AnonymousClass001.A0p();
    }

    @Override // X.C1kk
    public int Aoj() {
        if (this instanceof 2FJ) {
            return ((2FJ) this).A00;
        }
        throw AnonymousClass001.A0p();
    }

    @Override // X.C1kk
    public C1kk Az6() {
        if (this instanceof 2FJ) {
            return ((2FJ) this).A01;
        }
        throw AnonymousClass001.A0p();
    }

    @Override // X.C1kk
    public C1kk AzA() {
        if (this instanceof C1ki) {
            return ((C1ki) this).A00;
        }
        if (this instanceof 2FI) {
            return ((2FI) this).A00;
        }
        throw AnonymousClass001.A0p();
    }

    @Override // X.C1kk
    public C1kk AzB() {
        if (this instanceof 2FI) {
            return ((2FI) this).A01;
        }
        throw AnonymousClass001.A0p();
    }

    @Override // X.C1kk
    public C1kk B4Z() {
        if (this instanceof C1ki) {
            return ((C1ki) this).A01;
        }
        if (this instanceof 2FI) {
            return ((2FI) this).A02;
        }
        throw AnonymousClass001.A0p();
    }

    @Override // X.C1kk
    public C1kk B4a() {
        if (this instanceof 2FI) {
            return ((2FI) this).A03;
        }
        throw AnonymousClass001.A0p();
    }

    @Override // X.C1kk
    public 1kP BIt() {
        if (this instanceof 2FJ) {
            return ((2FJ) this).A03;
        }
        throw AnonymousClass001.A0p();
    }

    @Override // X.C1kk
    public long BL5() {
        if (this instanceof 2FI) {
            return ((2FI) this).A05;
        }
        throw AnonymousClass001.A0p();
    }

    @Override // X.C1kk
    public void ClW(long j) {
        if (this instanceof 2FI) {
            ((2FI) this).A04 = j;
        } else if (!(this instanceof C1ki)) {
            throw AnonymousClass001.A0p();
        }
    }

    @Override // X.C1kk
    public void Crf(C1kk c1kk) {
        if (this instanceof C1ki) {
            ((C1ki) this).A00 = c1kk;
        } else {
            if (!(this instanceof 2FI)) {
                throw AnonymousClass001.A0p();
            }
            ((2FI) this).A00 = c1kk;
        }
    }

    @Override // X.C1kk
    public void Crg(C1kk c1kk) {
        if (!(this instanceof 2FI)) {
            throw AnonymousClass001.A0p();
        }
        ((2FI) this).A01 = c1kk;
    }

    @Override // X.C1kk
    public void CtK(C1kk c1kk) {
        if (this instanceof C1ki) {
            ((C1ki) this).A01 = c1kk;
        } else {
            if (!(this instanceof 2FI)) {
                throw AnonymousClass001.A0p();
            }
            ((2FI) this).A02 = c1kk;
        }
    }

    @Override // X.C1kk
    public void CtL(C1kk c1kk) {
        if (!(this instanceof 2FI)) {
            throw AnonymousClass001.A0p();
        }
        ((2FI) this).A03 = c1kk;
    }

    @Override // X.C1kk
    public void Cw2(1kP r302) {
        if (!(this instanceof 2FJ)) {
            throw AnonymousClass001.A0p();
        }
        ((2FJ) this).A03 = r302;
    }

    @Override // X.C1kk
    public void Cwk(long j) {
        if (!(this instanceof 2FI)) {
            throw AnonymousClass001.A0p();
        }
        ((2FI) this).A05 = j;
    }

    @Override // X.C1kk
    public Object getKey() {
        if (this instanceof 2FJ) {
            return ((2FJ) this).A02;
        }
        throw AnonymousClass001.A0p();
    }
}
