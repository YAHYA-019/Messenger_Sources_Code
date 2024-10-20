package X;

/* loaded from: A6m.class */
public final class A6m implements NAd {
    public final /* synthetic */ 6RU A00;
    public final /* synthetic */ 79B A01;

    public A6m(6RU r302, 79B r303) {
        this.A01 = r303;
        this.A00 = r302;
    }

    @Override // X.NAd
    public void BpX() {
        this.A01.A09.Bym(false, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.9MD, java.lang.Object] */
    @Override // X.NAd
    public void Bph() {
        C2ko c2ko = this.A01.A0B.A00;
        ?? obj = new Object();
        ((9MD) obj).A00 = false;
        c2ko.A00(obj, new Object[0]);
        7FI.A02(this.A00, 7B5.A02);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.9MD, java.lang.Object] */
    @Override // X.NAd
    public void Bx9() {
        C2ko c2ko = this.A01.A0B.A00;
        ?? obj = new Object();
        ((9MD) obj).A00 = true;
        7zO.A1P(c2ko, (Object) obj);
        7FI.A02(this.A00, 7B5.A03);
    }

    @Override // X.NAd
    public void C0y(int i) {
        this.A01.A09.BvB(i);
    }

    @Override // X.NAd
    public void CA3(int i) {
        this.A01.A09.Bym(true, i);
    }

    @Override // X.NAd
    public void CDG(boolean z) {
        this.A01.A09.CDK(z);
    }
}
