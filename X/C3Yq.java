package X;

/* renamed from: X.3Yq, reason: invalid class name */
/* loaded from: 3Yq.class */
public final class C3Yq implements InterfaceC00713oe, C1ry {
    public final 53R A00 = new 53R();

    public C3Yq(InterfaceC00713oe interfaceC00713oe) {
        interfaceC00713oe.A5v(this);
    }

    @Override // X.InterfaceC00713oe
    public void A5v(C1ry c1ry) {
        this.A00.A5v(c1ry);
    }

    @Override // X.InterfaceC00713oe
    public Integer BKQ() {
        return this.A00.A00;
    }

    @Override // X.InterfaceC00713oe
    public void Bef(Integer num) {
        11T.A0F(num, 0);
        this.A00.Bef(num);
    }

    @Override // X.C1ry
    public void C7m(Integer num) {
        Integer num2;
        11T.A0F(num, 0);
        int intValue = num.intValue();
        if (intValue == 0) {
            num2 = 0S2.A00;
        } else if (intValue == 1) {
            num2 = 0S2.A01;
        } else if (!C02A.defaultInstance.A0M) {
            return;
        } else {
            num2 = 0S2.A0C;
        }
        Bef(num2);
    }

    @Override // X.InterfaceC00713oe
    public void CeS(C1ry c1ry) {
        this.A00.CeS(c1ry);
    }
}
