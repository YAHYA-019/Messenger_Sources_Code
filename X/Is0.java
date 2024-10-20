package X;

import com.facebook.rtc.views.omnigrid.GridLayoutConfigForLayoutInput;
import com.facebook.rtc.views.omnigrid.GridLayoutInput;
import com.facebook.rtc.views.omnigrid.GridSelfViewLocation;

/* loaded from: Is0.class */
public final class Is0 implements Runnable {
    public static final String __redex_internal_original_name = "PictureInPictureActivityController$preloadMarloGrid$1";
    public final /* synthetic */ GeK A00;

    public Is0(GeK geK) {
        this.A00 = geK;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HJy.A00(new GridLayoutInput(C0ty.A00, new GridLayoutConfigForLayoutInput(0, 0, 0, 0, 0, 0, 0, 0, false, false, false, false, false, GridSelfViewLocation.TOP_RIGHT, null), 1000, 1000));
        GeK geK = this.A00;
        geK.A0i = true;
        GeK.A03(geK);
    }
}
