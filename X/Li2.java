package X;

import android.os.Handler;
import com.facebook.common.network.FbNetworkManager;
import java.io.Closeable;

/* loaded from: Li2.class */
public final class Li2 implements Closeable {
    public int A00;
    public boolean A01 = true;
    public final C3264JoU A02;
    public final 2Ao A03;
    public final FbNetworkManager A04;
    public final C0dr A05;
    public final boolean A06;
    public final boolean A07;
    public final /* synthetic */ C3263JoT A08;

    public Li2(C3264JoU c3264JoU, C3263JoT c3263JoT, 2Ao r304, FbNetworkManager fbNetworkManager, C0dr c0dr, boolean z, boolean z2) {
        this.A08 = c3263JoT;
        this.A03 = r304;
        1EK.A09("CarrierMonitor", 881081412356415L);
        ((Handler) r304.A08.get()).post(C0jy.A02(new LnI(this, r304), "CarrierMonitor", 0));
        1EK.A03();
        this.A02 = c3264JoU;
        this.A04 = fbNetworkManager;
        this.A05 = c0dr;
        this.A00 = 0;
        this.A07 = z;
        this.A06 = z2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            if (this.A01) {
                this.A01 = false;
                2Ao r0 = this.A03;
                1EK.A09("CarrierMonitor", 881081412356415L);
                ((Handler) r0.A08.get()).post(C0jy.A02(new LnH(this, r0), "CarrierMonitor", 0));
                1EK.A03();
            }
        }
    }

    public void finalize() {
        int A03 = 0FI.A03(1743606905);
        if (this.A01) {
            close();
            0fH.A0n("CarrierMonitor", "finalized without close");
        }
        0FI.A09(-2052529927, A03);
    }
}
