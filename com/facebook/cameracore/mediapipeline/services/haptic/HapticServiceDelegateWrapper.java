package com.facebook.cameracore.mediapipeline.services.haptic;

import X.AbK;
import X.GOp;
import X.HZl;
import android.os.VibrationEffect;
import android.os.Vibrator;
import java.util.List;

/* loaded from: HapticServiceDelegateWrapper.class */
public class HapticServiceDelegateWrapper {
    public final HZl mDelegate;

    public HapticServiceDelegateWrapper(HZl hZl) {
        this.mDelegate = hZl;
    }

    public void cancel() {
        Vibrator vibrator = this.mDelegate.A00;
        if (vibrator != null) {
            vibrator.cancel();
        }
    }

    public void vibrate(List list, List list2) {
        VibrationEffect createWaveform;
        Vibrator vibrator = this.mDelegate.A00;
        if (vibrator != null) {
            long[] jArr = new long[list.size()];
            for (int i = 0; i < list.size(); i++) {
                jArr[i] = Math.max(AbK.A08(list, i), 0L);
            }
            if (list2.isEmpty()) {
                createWaveform = VibrationEffect.createWaveform(jArr, -1);
            } else {
                int[] iArr = new int[list2.size()];
                int i2 = 0;
                while (true) {
                    int i3 = i2;
                    if (i3 >= list2.size()) {
                        break;
                    }
                    int A00 = (int) (GOp.A00(list2, i3) * 255.0f);
                    iArr[i3] = A00;
                    int max = Math.max(A00, 0);
                    iArr[i3] = max;
                    iArr[i3] = Math.min(max, 255);
                    i2 = i3 + 1;
                }
                createWaveform = VibrationEffect.createWaveform(jArr, iArr, -1);
            }
            vibrator.vibrate(createWaveform);
        }
    }

    public void vibrateSingleShot() {
        Vibrator vibrator = this.mDelegate.A00;
        if (vibrator != null) {
            vibrator.vibrate(VibrationEffect.createOneShot(100, -1));
        }
    }
}
