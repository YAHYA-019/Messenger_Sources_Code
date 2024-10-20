package X;

import android.media.AudioAttributes;
import android.os.VibrationEffect;
import android.os.Vibrator;
import androidx.media.AudioAttributesCompat;

/* loaded from: I9i.class */
public abstract class I9i {
    public static void A00(Vibrator vibrator, int i, long j) {
        vibrator.vibrate(VibrationEffect.createOneShot(j, i));
    }

    public static void A02(Vibrator vibrator, AudioAttributesCompat audioAttributesCompat, long[] jArr) {
        vibrator.vibrate(VibrationEffect.createWaveform(jArr, 0), (AudioAttributes) audioAttributesCompat.A00.AXh());
    }
}
