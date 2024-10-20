package X;

import androidx.media.AudioAttributesCompat;

/* loaded from: Ixt.class */
public final class Ixt implements Runnable {
    public static final String __redex_internal_original_name = "RtcAudioHandler$playDelayed$$inlined$Runnable$1";
    public final /* synthetic */ I4m A00;
    public final /* synthetic */ IEj A01;

    public Ixt(I4m i4m, IEj iEj) {
        this.A01 = iEj;
        this.A00 = i4m;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IEj iEj = this.A01;
        I4m i4m = this.A00;
        AudioAttributesCompat audioAttributesCompat = IEj.A0N;
        iEj.A08(i4m, true);
    }
}
