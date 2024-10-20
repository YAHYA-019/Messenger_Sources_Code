package X;

/* loaded from: Hti.class */
public final class Hti {
    public long A00;
    public final 2Jy A01;
    public final C0dr A02;
    public final java.util.Map A03;

    public Hti(C0dr c0dr, String str, String str2) {
        11T.A0F(c0dr, 3);
        2Jy A0H = 4YU.A0H(AbstractC00603o4.A00(249));
        this.A01 = A0H;
        this.A02 = c0dr;
        this.A03 = AnonymousClass001.A0u();
        this.A00 = -1;
        A0H.A0D(DKB.A00(9), str);
        A0H.A0D(1BJ.A00(1364), str2);
        A0H.A0D("cpu_arch", System.getProperty("os.arch"));
    }

    public final void A00() {
        long now = this.A02.now();
        long j = this.A00;
        long j2 = now - j;
        if (j == -1) {
            throw 1BK.A0g();
        }
        this.A01.A0C("transcoder_duration", j2);
    }

    public final void A01(H9w h9w) {
        this.A00 = this.A02.now();
        this.A01.A09(h9w, "transcoder_name");
    }

    public final void A02(Exception exc) {
        2Jy r0 = this.A01;
        r0.A0D("transcoder_exception", AnonymousClass001.A0Y(exc));
        r0.A0D("transcoder_exception_message", exc.getMessage());
    }
}
