package X;

/* loaded from: Ieo.class */
public final class Ieo implements InterfaceC01073pn {
    public final /* synthetic */ Ifr A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;

    public Ieo(Ifr ifr, String str, String str2) {
        this.A00 = ifr;
        this.A02 = str;
        this.A01 = str2;
    }

    @Override // X.InterfaceC01073pn
    public void BxV() {
        5V5 r0 = this.A00.A00;
        if (r0 != null) {
            r0.C84(this.A02, this.A01, "ErrorDomain=MQTT Code=-3");
        }
    }

    @Override // X.InterfaceC01073pn
    public void COO(long j) {
        5V5 r0 = this.A00.A00;
        if (r0 != null) {
            r0.C85(this.A02, this.A01);
        }
    }
}
