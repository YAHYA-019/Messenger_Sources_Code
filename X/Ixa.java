package X;

import android.os.Handler;
import android.view.Surface;
import com.facebook.proxygen.TraceFieldType;

/* loaded from: Ixa.class */
public final class Ixa implements Runnable {
    public static final String __redex_internal_original_name = "SurfaceVideoEncoderImpl$1";
    public final /* synthetic */ IcJ A00;
    public final /* synthetic */ IdT A01;

    public Ixa(IcJ icJ, IdT idT) {
        this.A01 = idT;
        this.A00 = icJ;
    }

    @Override // java.lang.Runnable
    public void run() {
        IdT idT = this.A01;
        IcJ icJ = this.A00;
        Handler A00 = icJ.A00();
        StringBuilder sb = idT.A06;
        sb.append("asyncStop, ");
        try {
            if (idT.A00 != null) {
                if (idT.A0C) {
                    idT.A00.signalEndOfInputStream();
                    IdT.A03(idT, true);
                } else {
                    idT.A03 = true;
                }
            }
            Surface surface = idT.A02;
            if (surface != null) {
                surface.release();
            }
            if (idT.A00 != null) {
                if (idT.A0C) {
                    idT.A00.stop();
                }
                idT.A00.release();
            }
            idT.A0B = 0S2.A0N;
            idT.A00 = null;
            idT.A02 = null;
            idT.A01 = null;
            sb.append("asyncStop end, ");
            if (idT.A03) {
                Hvj.A01(icJ, A00);
                return;
            }
            HDP hdp = new HDP(23001, "Codec not in End-Of-Stream stage when stopping");
            hdp.A03(TraceFieldType.CurrentState, R2S.A00(idT.A0B));
            hdp.A03("method_invocation", sb.toString());
            Hvj.A00(A00, hdp, icJ);
        } catch (Exception e) {
            HDP hdp2 = new HDP(23001, e);
            IdT.A02(hdp2, idT, e);
            idT.A0B = 0S2.A0N;
            idT.A00 = null;
            idT.A02 = null;
            idT.A01 = null;
            Hvj.A00(A00, hdp2, icJ);
        }
    }
}
