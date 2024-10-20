package X;

import android.os.Handler;
import android.os.Looper;

/* loaded from: I7g.class */
public final class I7g {
    public int A00;
    public HXW A01;
    public boolean A02;
    public final Handler A03;
    public final I5D A04;
    public final Hmq A05;
    public final I9J A06;
    public final JKQ A07;
    public final JLv A08;
    public final Handler.Callback A09;

    public I7g(I5D i5d, I9J i9j, JKQ jkq, JLv jLv) {
        11T.A0F(i9j, 1);
        this.A06 = i9j;
        this.A08 = jLv;
        this.A04 = i5d;
        IHU ihu = new IHU(this, 3);
        this.A09 = ihu;
        this.A07 = new If8(jkq);
        this.A03 = new Handler(Looper.getMainLooper(), ihu);
        this.A05 = new Hmq(this);
    }

    public static final void A00(I7g i7g) {
        I9J i9j = i7g.A06;
        HFd hFd = i9j.A07;
        if (!(hFd instanceof Gyn ? 1Br.A06(((Gyn) hFd).A04).AZk(36318350829236630L) : true)) {
            i9j.A04(true);
            return;
        }
        i7g.A02 = true;
        Handler handler = i7g.A03;
        if (handler.hasMessages(1)) {
            return;
        }
        JLv jLv = i7g.A08;
        if (jLv != null) {
            jLv.ALc("BluetoothConnectionStrategy", 0Pz.A0T("turnBluetoothOn: send MSG_START_SCO | attempts: ", i7g.A00), new Object[0]);
        }
        i7g.A00 = 0;
        handler.sendEmptyMessage(1);
    }

    public static final void A01(I7g i7g, boolean z) {
        I9J i9j = i7g.A06;
        HFd hFd = i9j.A07;
        if (hFd instanceof Gyn ? 1Br.A06(((Gyn) hFd).A04).AZk(36318350829236630L) : true) {
            JLv jLv = i7g.A08;
            if (jLv != null) {
                jLv.ALc("BluetoothConnectionStrategy", "turnBluetoothOff: remove MSG_START_SCO messages", new Object[0]);
            }
            if (z) {
                i7g.A02 = false;
                i7g.A00 = 0;
            }
            Handler handler = i7g.A03;
            handler.removeMessages(1);
            handler.removeMessages(2);
        }
        i9j.A04(false);
    }
}
