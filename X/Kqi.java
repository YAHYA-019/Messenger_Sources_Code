package X;

import com.facebook.exoplayer.monitor.VpsEventCallback;

/* loaded from: Kqi.class */
public final class Kqi {
    public int A00 = 3;
    public Integer A01 = 0S2.A00;
    public final Ks5 A02;
    public final VpsEventCallback A03;
    public final ROk A04;
    public final 6D1 A05;
    public final 6ZP A06;
    public final String A07;

    public Kqi(Ks5 ks5, VpsEventCallback vpsEventCallback, ROk rOk, 6D1 r305, 6ZP r306, String str) {
        this.A06 = r306;
        this.A05 = r305;
        this.A03 = vpsEventCallback;
        this.A07 = str;
        this.A02 = ks5;
        this.A04 = rOk;
    }

    public void A00(Integer num) {
        synchronized (this.A01) {
            if (this.A01 == 0S2.A00) {
                this.A01 = num;
                this.A06.A01();
            }
        }
    }
}
