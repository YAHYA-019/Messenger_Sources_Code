package X;

import com.facebook.wearable.common.comms.hera.shared.host.HeraHostSharedImplKt;
import java.nio.ByteBuffer;

/* loaded from: Idn.class */
public final /* synthetic */ class Idn implements JGC {
    public final /* synthetic */ C2420Gch A00;

    public /* synthetic */ Idn(C2420Gch c2420Gch) {
        this.A00 = c2420Gch;
    }

    public final void CDf(I40 i40) {
        ByteBuffer byteBuffer;
        C2420Gch c2420Gch = this.A00;
        JE9 je9 = c2420Gch.A08;
        JNk jNk = c2420Gch.A0g;
        if (jNk == null || !jNk.isConnected() || je9 == null) {
            return;
        }
        try {
            int BA0 = jNk.BA0();
            int i = c2420Gch.A00;
            if (i != -1) {
                BA0 = ((BA0 + HeraHostSharedImplKt.DEFAULT_RECV_VIDEO_INIT_WIDTH) + ((((AbstractC2421Gci) c2420Gch).A00 == 1 ? 90 : -90) * i)) % HeraHostSharedImplKt.DEFAULT_RECV_VIDEO_INIT_WIDTH;
            }
            Rlw[] rlwArr = null;
            if (i40 != null) {
                RLg[] rLgArr = i40.A0B;
                if (rLgArr != null) {
                    int length = rLgArr.length;
                    Rlw[] rlwArr2 = new Rlw[length];
                    for (int i2 = 0; i2 < length; i2++) {
                        RLg rLg = rLgArr[i2];
                        rlwArr2[i2] = (rLg == null || (byteBuffer = rLg.A02) == null) ? null : new Rlw(byteBuffer, rLg.A00, rLg.A01);
                    }
                    rlwArr = rlwArr2;
                }
                je9.onPreviewFrame(new RPC(i40.A04, i40.A05, i40.A07, i40.A06, i40.A09, i40.A0A, rlwArr, i40.A01, i40.A02, i40.A00, BA0, i40.A03, i40.A08));
            }
        } catch (J77 unused) {
        }
    }
}
