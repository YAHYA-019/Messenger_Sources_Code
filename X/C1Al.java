package X;

/* renamed from: X.1Al, reason: invalid class name */
/* loaded from: 1Al.class */
public final class C1Al extends C0kl {
    public int A00;
    public int A01;
    public AnonymousClass178 A02;

    @Override // X.C0kl
    public void A00() {
        AnonymousClass178 anonymousClass178 = this.A02;
        if (anonymousClass178 != null) {
            anonymousClass178.cancel(false);
            this.A02 = null;
        }
        super.A00();
    }

    @Override // X.C0kl
    public void A01() {
        AnonymousClass178 anonymousClass178 = this.A02;
        if (anonymousClass178 != null) {
            anonymousClass178.cancel(false);
            this.A02 = null;
        }
        super.A01();
    }

    @Override // X.C0kl
    public void A02(0Mb r302) {
        AnonymousClass178 anonymousClass178 = this.A02;
        if (anonymousClass178 != null) {
            anonymousClass178.cancel(false);
            this.A02 = null;
        }
        super.A02(r302);
    }

    @Override // X.C0kl
    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("MqttRetriableOperation{mResponseType=");
        A0k.append(this.A04);
        A0k.append(", mOperationId=");
        A0k.append(super.A01);
        A0k.append(", mCreationTime=");
        A0k.append(super.A02);
        return AnonymousClass001.A0f(A0k);
    }
}
