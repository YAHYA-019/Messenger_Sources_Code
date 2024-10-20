package X;

import android.media.Ringtone;

/* loaded from: AE1.class */
public final class AE1 implements Runnable {
    public static final String __redex_internal_original_name = "RingtonePlayer$deferredRingtoneRunnable$1";
    public final /* synthetic */ 9Vs A00;

    public AE1(9Vs r302) {
        this.A00 = r302;
    }

    @Override // java.lang.Runnable
    public final void run() {
        9Vs r0 = this.A00;
        Ringtone ringtone = r0.A01;
        if (ringtone == null || !ringtone.isPlaying()) {
            int i = r0.A00;
            if (i >= 3) {
                r0.A06.ALc("RingtonePlayer", "Ringtone failed to play after %d tries", AnonymousClass001.A1a(3));
                return;
            }
            r0.A00 = i + 1;
            Ringtone ringtone2 = r0.A01;
            if (ringtone2 != null) {
                ringtone2.play();
            }
            r0.A05.postDelayed(r0.A07, 450L);
        }
    }
}
