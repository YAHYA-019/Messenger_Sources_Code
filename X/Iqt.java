package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;

/* loaded from: Iqt.class */
public final class Iqt implements Runnable {
    public static final String __redex_internal_original_name = "LayoutsPreloaderUtil$preloadMontageViewerLayouts$1";
    public final /* synthetic */ LayoutInflater A00;

    public Iqt(LayoutInflater layoutInflater) {
        this.A00 = layoutInflater;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C00j.A05("LayoutsPreloaderUtil:preloadMontageViewerLayouts", -1445384597);
        try {
            0fH.A0j("LayoutsPreloaderUtil", "Start pre-inflate StoryViewer layouts");
            int[] iArr = I2K.A05;
            int i = 0;
            do {
                try {
                    this.A00.inflate(iArr[i], (ViewGroup) null);
                } catch (Throwable unused) {
                }
                i++;
            } while (i < 9);
            C00j.A01(2091101765);
        } catch (Throwable th) {
            C00j.A01(56359608);
            throw th;
        }
    }
}
