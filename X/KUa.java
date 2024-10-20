package X;

import android.graphics.Outline;

/* loaded from: KUa.class */
public abstract class KUa {
    public static final void A00(Outline outline, MLe mLe) {
        if (!(mLe instanceof LOR)) {
            throw AnonymousClass001.A0q("Unable to obtain android.graphics.Path");
        }
        outline.setPath(((LOR) mLe).A03);
    }
}
