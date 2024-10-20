package X;

import android.content.Context;
import com.facebook.cameracore.audiograph.AudioGraphClientProvider;
import java.lang.ref.WeakReference;

/* loaded from: Hh4.class */
public final class Hh4 {
    public AudioGraphClientProvider A00;
    public HWd A01;
    public WeakReference A02;
    public final Context A03;
    public final boolean A04;

    public Hh4(Context context, AudioGraphClientProvider audioGraphClientProvider, boolean z) {
        this.A03 = context.getApplicationContext();
        this.A04 = z;
        this.A00 = audioGraphClientProvider;
    }
}
