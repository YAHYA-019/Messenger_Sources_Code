package X;

import com.facebook.xapp.messaging.threadview.model.audio.WaveformData;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.util.List;

/* renamed from: X.7ui, reason: invalid class name */
/* loaded from: 7ui.class */
public abstract class C7ui {
    public static final double A00(double d) {
        return Math.min(Math.max(0.0d, 1.0d), Math.max(Math.min(0.0d, 1.0d), d / 12000.0d));
    }

    public static final WaveformData A01(String str) {
        if (str == null) {
            return null;
        }
        try {
            return (WaveformData) AnonymousClass243.A00().A0Q(new 7hD(), str);
        } catch (C2cb | 5DK | IOException e) {
            0fH.A0s("WaveformDataSpec.Util", "Unable to deserialize Waveform Data", e);
            return null;
        }
    }

    public static final ImmutableList A02(List list, boolean z) {
        ImmutableList.Builder builder = ImmutableList.builder();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= list.size()) {
                return 1Fj.A01(builder);
            }
            builder.m11011add((Object) Double.valueOf(((int) (A00(((Number) list.get(i2)).doubleValue()) * 1000.0d)) / 1000.0d));
            int i3 = 10;
            if (z) {
                i3 = 1;
            }
            i = i2 + i3;
        }
    }

    public static final String A03(WaveformData waveformData) {
        if (waveformData == null) {
            return null;
        }
        try {
            return AnonymousClass243.A00().A0W(waveformData);
        } catch (2LD e) {
            0fH.A0s("WaveformDataSpec.Util", "Unable to serialize Waveform Data", e);
            return null;
        }
    }
}
