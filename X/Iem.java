package X;

/* loaded from: Iem.class */
public final class Iem implements InterfaceC01073pn {
    public final /* synthetic */ String A00;

    public Iem(String str) {
        this.A00 = str;
    }

    @Override // X.InterfaceC01073pn
    public void BxV() {
        0fH.A14("DefaultEntityPresenceMqttPublisher", "%s publishMessage failure", new Object[]{this.A00});
    }

    @Override // X.InterfaceC01073pn
    public void COO(long j) {
        0fH.A0g(this.A00, "DefaultEntityPresenceMqttPublisher", "%s publishMessage success");
    }
}
