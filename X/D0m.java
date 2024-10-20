package X;

/* loaded from: D0m.class */
public final class D0m implements GIg {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C54q A01;
    public final /* synthetic */ String A02;

    public D0m(C54q c54q, String str, long j) {
        this.A01 = c54q;
        this.A00 = j;
        this.A02 = str;
    }

    @Override // X.GIg
    public Ejf ARL() {
        boolean z;
        Object obj;
        0fH.A0j("MessagesSyncConnectionHandler", "execute mMessagesSyncMqttPublisher.createQueue");
        C54p c54p = this.A01.A0E;
        long j = this.A00;
        String str = this.A02;
        0fH.A0d(Long.valueOf(j), str, 4YT.A00(691), "createQueue; initialSequenceId = %d, entityFbId = %s");
        D0k d0k = new D0k(c54p);
        int A03 = AnonymousClass001.A03(c54p.A08.get());
        C54d c54d = c54p.A05;
        CH7 A01 = 54X.A01(new BFl(c54d.A01, (C0dr) c54d.A02.get(), d0k, c54d, "/t_ms"), c54p, str, A03, j);
        if (A01.A04 && (obj = A01.A03) != null && ((BrC) obj).A02) {
            0fH.A0j("MessagesSyncConnectionHandler", "createQueue result success");
            z = false;
        } else {
            0fH.A0j("MessagesSyncConnectionHandler", "createQueue result failure");
            z = true;
        }
        return new Ejf(z, A01);
    }

    @Override // X.GIg
    public void BxQ(long j) {
        6E7 r0 = this.A01.A0F;
        2Jy A0H = 4YU.A0H("sync_create_queue_error");
        A0H.A0C("backOffAmount", j);
        r0.A00.A00(A0H, BLy.A02);
    }
}
