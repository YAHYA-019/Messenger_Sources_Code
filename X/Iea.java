package X;

/* loaded from: Iea.class */
public final class Iea implements JIp {
    public final HX3 A00;
    public final Htl A01;
    public final JGI A02;
    public volatile int A03;
    public volatile JLt A04;
    public volatile Boolean A05;

    public Iea() {
        this(null);
    }

    public Iea(HX3 hx3) {
        this.A03 = 0;
        Ie0 ie0 = new Ie0(this);
        this.A02 = ie0;
        this.A00 = hx3;
        Htl htl = new Htl();
        this.A01 = htl;
        htl.A00 = ie0;
    }

    @Override // X.JIp
    public void ACQ() {
        this.A01.A00();
    }

    @Override // X.JIp
    public /* bridge */ /* synthetic */ Object B7p() {
        if (this.A05 == null) {
            throw AnonymousClass001.A0N("Configure Preview operation hasn't completed yet.");
        }
        if (this.A05.booleanValue()) {
            return this.A04;
        }
        throw new RuntimeException("Failed to configure preview.");
    }
}
