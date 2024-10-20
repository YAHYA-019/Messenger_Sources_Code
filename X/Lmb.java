package X;

import android.util.LongSparseArray;
import androidx.compose.ui.contentcapture.AndroidContentCaptureManager;

/* loaded from: Lmb.class */
public final /* synthetic */ class Lmb implements Runnable {
    public static final String __redex_internal_original_name = "AndroidContentCaptureManager$ViewTranslationHelperMethods$$ExternalSyntheticLambda0";
    public final /* synthetic */ LongSparseArray A00;
    public final /* synthetic */ AndroidContentCaptureManager A01;

    public /* synthetic */ Lmb(LongSparseArray longSparseArray, AndroidContentCaptureManager androidContentCaptureManager) {
        this.A01 = androidContentCaptureManager;
        this.A00 = longSparseArray;
    }

    @Override // java.lang.Runnable
    public final void run() {
        LC6.A01(this.A00, this.A01);
    }
}
