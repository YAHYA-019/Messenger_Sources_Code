package X;

import com.google.common.util.concurrent.SettableFuture;
import java.util.HashMap;

/* loaded from: AEr.class */
public final class AEr implements Runnable {
    public static final String __redex_internal_original_name = "HighlightsTabTamImageHelper$processImagesForXMA$2";
    public final /* synthetic */ SettableFuture A00;
    public final /* synthetic */ HashMap A01;

    public AEr(SettableFuture settableFuture, HashMap hashMap) {
        this.A00 = settableFuture;
        this.A01 = hashMap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.set(this.A01);
    }
}
