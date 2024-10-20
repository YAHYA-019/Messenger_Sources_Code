package X;

import com.facebook.wearable.common.comms.rtc.hera.intf.IRawVideoSink;

/* loaded from: Ikm.class */
public abstract class Ikm implements IRawVideoSink {
    public volatile int A01;
    public final long A00 = System.nanoTime();
    public volatile RaA A02 = RaA.A04;

    public abstract void A00(int i, int i2, int i3);

    public void A01(C00m c00m) {
        H3y h3y = (H3y) this;
        h3y.A07.A04.A06(h3y, c00m);
    }

    public void A02(boolean z) {
        H3y h3y = (H3y) this;
        h3y.A0B = z;
        if (z) {
            h3y.A07.A04.A07(h3y, true);
        }
    }

    public boolean A03() {
        return ((H3y) this).A0B;
    }
}
