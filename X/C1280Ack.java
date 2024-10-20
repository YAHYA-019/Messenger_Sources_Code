package X;

/* renamed from: X.Ack, reason: case insensitive filesystem */
/* loaded from: Ack.class */
public final class C1280Ack {
    public final C0dp A00;
    public final JTp A01;
    public final C1282Acm A02;

    public C1280Ack() {
        C10064sb c10064sb = (C10064sb) 1Bi.A03(49327);
        C0dp A0G = 7zR.A0G();
        1BL.A1F(c10064sb, A0G);
        this.A00 = A0G;
        this.A02 = new C1282Acm(false, 0S2.A00);
        this.A01 = new JTp(c10064sb, A0G);
    }

    public final Bj1 A00(String str) {
        synchronized (this) {
            C1282Acm c1282Acm = (C1282Acm) this.A01.A01(str, this.A00.now() - 180000);
            if (c1282Acm == null) {
                return null;
            }
            if (11T.A0O(this.A02, c1282Acm)) {
                c1282Acm = null;
            }
            return new Bj1(c1282Acm);
        }
    }
}
