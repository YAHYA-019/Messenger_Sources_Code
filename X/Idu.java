package X;

import android.hardware.camera2.CaptureRequest;
import java.util.concurrent.Callable;

/* loaded from: Idu.class */
public final class Idu implements JGF {
    public final /* synthetic */ CaptureRequest.Builder A00;
    public final /* synthetic */ Huf A01;
    public final /* synthetic */ Ie3 A02;
    public final /* synthetic */ boolean A03;
    public final /* synthetic */ float[] A04;

    public Idu(CaptureRequest.Builder builder, Huf huf, Ie3 ie3, float[] fArr, boolean z) {
        this.A01 = huf;
        this.A02 = ie3;
        this.A04 = fArr;
        this.A00 = builder;
        this.A03 = z;
    }

    public void BzH(boolean z) {
        Huf huf = this.A01;
        boolean z2 = huf.A09;
        Ie3 ie3 = this.A02;
        if (z2) {
            huf.A03(ie3);
        } else {
            ie3.A05 = null;
        }
        huf.A04(z ? 0S2.A0N : 0S2.A0Y, this.A04);
        if (huf.A0E) {
            return;
        }
        CaptureRequest.Builder builder = this.A00;
        Number number = (Number) builder.get(CaptureRequest.CONTROL_AE_MODE);
        long j = 4000;
        if (number == null || number.intValue() != 1) {
            if (!this.A03) {
                j = 2000;
            }
            huf.A02(builder, ie3, j);
        } else {
            if (!this.A03) {
                j = 2000;
            }
            synchronized (huf) {
                Callable j5r = new J5R(14, huf, ie3, builder);
                huf.A00();
                huf.A08 = huf.A0B.A02("monitor_auto_exposure", j5r, j);
            }
        }
    }
}
