package X;

import androidx.lifecycle.LifecycleOwner;

/* renamed from: X.6mt, reason: invalid class name */
/* loaded from: 6mt.class */
public final class C6mt implements InterfaceC00713oe, C1ry, 53Q {
    public 53R A00;
    public final /* synthetic */ 2iK A01;

    public C6mt(2iK r302) {
        this.A01 = r302;
        r302.A0D.A5v(this);
        this.A00 = new 53R();
    }

    @Override // X.InterfaceC00713oe
    public void A5v(C1ry c1ry) {
        synchronized (this) {
            this.A00.A5v(c1ry);
        }
    }

    public LifecycleOwner Atk() {
        53Q r0 = this.A01.A0D;
        if (r0 == null || !(r0 instanceof 53Q)) {
            return null;
        }
        return r0.Atk();
    }

    @Override // X.InterfaceC00713oe
    public Integer BKQ() {
        return this.A00.A00;
    }

    @Override // X.InterfaceC00713oe
    public void Bef(Integer num) {
        1sP.A00();
        this.A00.Bef(num);
        if (num == 0S2.A0C) {
            2iK r0 = this.A01;
            r0.A0D.CeS(this);
            r0.A01 = null;
            r0.A07 = false;
        }
    }

    @Override // X.C1ry
    public void C7m(Integer num) {
        int intValue = num.intValue();
        Bef(intValue != 0 ? intValue != 1 ? 0S2.A0C : 0S2.A01 : 0S2.A00);
    }

    @Override // X.InterfaceC00713oe
    public void CeS(C1ry c1ry) {
        synchronized (this) {
            this.A00.CeS(c1ry);
        }
    }
}
