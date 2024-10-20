package X;

import android.os.Handler;
import android.os.HandlerThread;

/* loaded from: Izi.class */
public final class Izi implements Runnable {
    public static final String __redex_internal_original_name = "ProcessingRecorderImpl$3";
    public final /* synthetic */ I5B A00;
    public final /* synthetic */ JHq A01;
    public final /* synthetic */ IAI A02;

    public Izi(I5B i5b, JHq jHq, IAI iai) {
        this.A02 = iai;
        this.A00 = i5b;
        this.A01 = jHq;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            IAI iai = this.A02;
            I5B i5b = this.A00;
            JHq jHq = this.A01;
            iai.A0A = 0S2.A00;
            iai.A05 = i5b;
            iai.A03.start();
            iai.A01 = new Handler(iai.A03.getLooper());
            HandlerThread handlerThread = iai.A02;
            if (handlerThread != null) {
                handlerThread.start();
                iai.A00 = new Handler(iai.A02.getLooper());
            }
            Hk4 hk4 = new Hk4();
            I5B i5b2 = iai.A05;
            hk4.A03 = i5b2.A00;
            hk4.A04 = i5b2.A01;
            hk4.A02 = 30;
            hk4.A07 = "baseline";
            I4t i4t = new I4t(hk4);
            JKK jkk = iai.A0G;
            IdT idT = new IdT(iai.A01, iai.A08, i4t, jkk, "video/avc", iai.A06.A01.AeY(1006));
            iai.A09 = idT;
            JOm jOm = iai.A0E;
            if (jOm instanceof JOp) {
                Handler handler = iai.A00;
                if (handler != null) {
                    iai.A04 = ((JOp) jOm).BOz(handler, iai.A0C);
                }
            }
            idT.CYZ(new IcK(iai, jHq, 3), iai.A0B);
        } catch (Exception e) {
            this.A01.onError(e);
        }
    }
}
