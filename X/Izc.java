package X;

import android.media.AudioRecord;
import android.os.Handler;

/* loaded from: Izc.class */
public final class Izc implements Runnable {
    public static final String __redex_internal_original_name = "AudioRecorder$5";
    public final /* synthetic */ Handler A00;
    public final /* synthetic */ ICK A01;
    public final /* synthetic */ JIk A02;

    public Izc(Handler handler, ICK ick, JIk jIk) {
        this.A01 = ick;
        this.A02 = jIk;
        this.A00 = handler;
    }

    @Override // java.lang.Runnable
    public void run() {
        ICK ick = this.A01;
        JIk jIk = this.A02;
        Handler handler = this.A00;
        synchronized (ick) {
            0fH.A0j("AudioRecorder", "Stopping audio recorder");
            I3J i3j = ick.A09;
            i3j.A02("sAR");
            ick.A0F = 0S2.A00;
            AudioRecord audioRecord = ick.A02;
            if (audioRecord != null) {
                audioRecord.release();
            }
            ick.A02 = null;
            i3j.A02("sARs");
            Hvj.A01(jIk, handler);
        }
    }
}
