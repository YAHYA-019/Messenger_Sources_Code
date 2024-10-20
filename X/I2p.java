package X;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;

/* loaded from: I2p.class */
public final class I2p {
    public int A00;
    public Handler A01;
    public HandlerThread A02;
    public C6df A03;
    public C6dj A04;
    public Hgo A05;
    public Ihu A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public final 1Gh A0B;
    public final 5Kt A0C;
    public final RHJ A0D;

    public I2p(1Gh r302, 5Kt r303, RHJ rhj) {
        7zR.A1N(r302, r303);
        this.A0B = r302;
        this.A0D = rhj;
        this.A0C = r303;
    }

    public static final void A00(I2p i2p) {
        if (i2p.A0A) {
            i2p.A01();
        }
        if (i2p.A05 != null) {
            if (!i2p.A08 && i2p.A03 != null) {
                i2p.A00 = 0;
            }
            i2p.A08 = false;
            if (!i2p.A0A) {
                HandlerThread A01 = i2p.A0B.A01(1DW.A02, "background_video_subtitle_thread");
                i2p.A02 = A01;
                11T.A0D(A01);
                A01.start();
                HandlerThread handlerThread = i2p.A02;
                11T.A0D(handlerThread);
                Looper looper = handlerThread.getLooper();
                11T.A0A(looper);
                i2p.A01 = new Q03(looper, i2p);
                i2p.A0A = true;
            }
            Handler handler = i2p.A01;
            11T.A0D(handler);
            Message obtainMessage = handler.obtainMessage(322420958);
            11T.A0A(obtainMessage);
            Handler handler2 = i2p.A01;
            11T.A0D(handler2);
            handler2.sendMessageDelayed(obtainMessage, 0L);
        }
    }

    public void A01() {
        if (this.A0A) {
            HandlerThread handlerThread = this.A02;
            11T.A0D(handlerThread);
            handlerThread.quit();
            this.A0A = false;
        }
        this.A00 = 0;
        this.A09 = false;
    }
}
