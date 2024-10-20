package X;

import android.os.Handler;

/* loaded from: Izb.class */
public final class Izb implements Runnable {
    public static final String __redex_internal_original_name = "AudioRecorder$4";
    public final /* synthetic */ Handler A00;
    public final /* synthetic */ ICK A01;
    public final /* synthetic */ JIk A02;

    public Izb(Handler handler, ICK ick, JIk jIk) {
        this.A01 = ick;
        this.A02 = jIk;
        this.A00 = handler;
    }

    @Override // java.lang.Runnable
    public void run() {
        Gty gty;
        ICK ick = this.A01;
        JIk jIk = this.A02;
        Handler handler = this.A00;
        synchronized (ick) {
            0fH.A0j("AudioRecorder", "Starting audio recorder");
            if (ick.A0F != 0S2.A01) {
                new Gty("prepare() must be called before starting audio recording.");
            } else {
                try {
                    I3J i3j = ick.A09;
                    i3j.A02("stAR");
                    ick.A03 = false;
                    ick.A02.startRecording();
                    i3j.A02("stARs");
                    ick.A0F = 0S2.A0C;
                    if (!ick.A0D) {
                        if (ick.A0C) {
                            ick.A06.post(ick.A0A);
                        } else {
                            ick.A06.post(ick.A0B);
                        }
                    }
                    Hvj.A01(jIk, handler);
                } catch (Exception e) {
                    ick.A09.A02("stARe");
                    new HDP(22002, e);
                }
            }
            ICK.A02(gty, ick);
            Hvj.A00(handler, gty, jIk);
        }
    }
}
