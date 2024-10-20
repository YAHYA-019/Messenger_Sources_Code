package X;

import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: AE2.class */
public final class AE2 implements Runnable {
    public static final String __redex_internal_original_name = "RingtonePlayer$loopRingtoneRunnable$1";
    public final /* synthetic */ 9Vs A00;

    public AE2(9Vs r302) {
        this.A00 = r302;
    }

    @Override // java.lang.Runnable
    public void run() {
        9Vs r0 = this.A00;
        Ringtone ringtone = r0.A01;
        if (ringtone != null) {
            boolean z = false;
            if (!ringtone.isPlaying()) {
                Ringtone ringtone2 = r0.A01;
                if (ringtone2 != null) {
                    ringtone2.stop();
                }
                Uri uri = r0.A02;
                if (uri == null) {
                    return;
                }
                Ringtone ringtone3 = RingtoneManager.getRingtone(r0.A03, uri);
                r0.A01 = ringtone3;
                AtomicBoolean atomicBoolean = r0.A09;
                if (ringtone3 != null) {
                    z = true;
                }
                atomicBoolean.set(z);
                Ringtone ringtone4 = r0.A01;
                if (ringtone4 != null) {
                    ringtone4.play();
                }
            }
            r0.A05.postDelayed(r0.A08, 1000L);
        }
    }
}
