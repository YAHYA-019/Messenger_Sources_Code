package X;

import java.util.TimerTask;

/* loaded from: G8f.class */
public final class G8f extends TimerTask {
    public static final String __redex_internal_original_name = "MerlinDebugComponent$render$1$invoke$lambda$1$$inlined$timerTask$1";
    public final /* synthetic */ C2lh A00;
    public final /* synthetic */ DwC A01;

    public G8f(C2lh c2lh, DwC dwC) {
        this.A01 = dwC;
        this.A00 = c2lh;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() {
        DLu dLu;
        DLt dLt;
        DwC dwC = this.A01;
        6KI r0 = dwC.A01;
        String BHy = dwC.A00.BHy();
        11T.A0F(BHy, 0);
        6KK r02 = r0.A03;
        synchronized (r02) {
            dLu = (DLu) r02.A09.get(BHy);
        }
        synchronized (r0) {
            synchronized (r02) {
                81E r03 = (81E) r02.A0C.get(BHy);
                dLt = r03 != null ? r03.A01 : null;
            }
        }
        this.A00.A02(new EiA(dLt, dLu));
        0fH.A0j("MerlinDebugComponent", 0Pz.A0W("Updating ", BHy));
    }
}
