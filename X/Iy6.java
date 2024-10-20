package X;

import androidx.media.AudioAttributesCompat;
import com.facebook.rsys.call.gen.CallModel;

/* loaded from: Iy6.class */
public final class Iy6 implements Runnable {
    public static final String __redex_internal_original_name = "WebrtcUiHandler$onMediaConnectionUpdate$1";
    public final /* synthetic */ IRF A00;
    public final /* synthetic */ boolean A01;

    public Iy6(IRF irf, boolean z) {
        this.A01 = z;
        this.A00 = irf;
    }

    @Override // java.lang.Runnable
    public final void run() {
        4zJ r0 = 4zI.A03;
        boolean z = this.A01;
        r0.A05("WebrtcUiHandler", "onMediaConnectionUpdate: [connected: %s]", new Object[]{Boolean.valueOf(z)});
        IRF irf = this.A00;
        if (z && irf.A1e.A00 != 4) {
            r0.A08("WebrtcUiHandler", "WebrtcCallState out of sync. Setting to CALL_STATE_IN_CALL", new Object[0]);
            IRF.A0Q(irf, 4);
        }
        if (irf.A0I != z) {
            CallModel A00 = GS1.A00(irf.A0Y);
            2QN r02 = irf.A1e;
            boolean z2 = r02.A0X;
            if (!z2 || A00 == null || !IFr.A0E(A00)) {
                if (z) {
                    if (!z2) {
                        1Br r03 = irf.A1G;
                        if (!GOp.A0o(r03).A0D(((HkQ) 1Br.A0B(irf.A1U)).A0C)) {
                            GOp.A0o(r03).A06();
                        }
                    }
                    if (r02.A0P) {
                        r02.A0P = false;
                    } else {
                        IEj A0o = GOp.A0o(irf.A1G);
                        I4m i4m = ((HkQ) 1Br.A0B(irf.A1U)).A02;
                        AudioAttributesCompat audioAttributesCompat = IEj.A0N;
                        A0o.A08(i4m, true);
                    }
                } else {
                    IEj A0o2 = GOp.A0o(irf.A1G);
                    C00i c00i = irf.A1U.A00;
                    A0o2.A0C(new I4m[]{((HkQ) c00i.get()).A03, ((HkQ) c00i.get()).A0C});
                }
            }
        }
        irf.A0I = z;
        JNE jne = ((I2h) irf.A0T.get()).A01;
        if (jne != null) {
            jne.D6m(IFr.A01(GS1.A00(irf.A0Y)));
        }
        JOY.A03(irf).Bcv("WebrtcUiHandler_onMediaConnectionUpdate", (String) null);
    }
}
