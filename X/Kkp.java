package X;

import android.content.res.AssetManager;
import android.graphics.drawable.Drawable;
import android.view.View;

/* loaded from: Kkp.class */
public final class Kkp {
    public final AssetManager A01;
    public final Ksk A02 = new Object();
    public final java.util.Map A04 = AnonymousClass001.A0u();
    public final java.util.Map A03 = AnonymousClass001.A0u();
    public String A00 = ".ttf";

    /* JADX WARN: Type inference failed for: r0v1, types: [X.Ksk, java.lang.Object] */
    public Kkp(Drawable.Callback callback) {
        AssetManager assets;
        if (callback instanceof View) {
            assets = ((View) callback).getContext().getAssets();
        } else {
            Hv6.A00("LottieDrawable must be inside of a view for images to work.");
            assets = null;
        }
        this.A01 = assets;
    }
}
