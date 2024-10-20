package X;

import android.media.AudioRecord;
import android.os.Handler;

/* loaded from: Iza.class */
public final class Iza implements Runnable {
    public static final String __redex_internal_original_name = "AudioRecorder$3";
    public final /* synthetic */ Handler A00;
    public final /* synthetic */ ICK A01;
    public final /* synthetic */ JIk A02;

    public Iza(Handler handler, ICK ick, JIk jIk) {
        this.A01 = ick;
        this.A02 = jIk;
        this.A00 = handler;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [X.HDP, X.Gty] */
    /* JADX WARN: Type inference failed for: r0v47, types: [X.HDP, X.Gty] */
    @Override // java.lang.Runnable
    public void run() {
        ICK ick = this.A01;
        JIk jIk = this.A02;
        Handler handler = this.A00;
        if (ick.A0F != 0S2.A00) {
            ?? hdp = new HDP(22002, "Must only call prepare() on a stopped AudioRecorder.");
            ICK.A02((Gty) hdp, ick);
            Hvj.A00(handler, hdp, jIk);
            return;
        }
        try {
            I3J i3j = ick.A09;
            i3j.A02("pAR");
            int i = ick.A04;
            I5F i5f = ick.A08;
            AudioRecord audioRecord = new AudioRecord(i, i5f.A03, i5f.A00, i5f.A01, ick.A01);
            ick.A02 = audioRecord;
            if (audioRecord.getState() == 0) {
                throw AnonymousClass001.A0N("Could not prepare audio recording");
            }
            i3j.A02("pARs");
            ick.A0F = 0S2.A01;
            Hvj.A01(jIk, handler);
        } catch (Exception e) {
            ick.A09.A02("pARe");
            ?? hdp2 = new HDP(22002, e);
            ICK.A02((Gty) hdp2, ick);
            Hvj.A00(handler, hdp2, jIk);
        }
    }
}
