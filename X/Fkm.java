package X;

import android.os.Looper;
import com.facebook.navigation.tabbar.glyph.BadgableGlyphView;

/* loaded from: Fkm.class */
public final class Fkm implements GFJ {
    public final /* synthetic */ BadgableGlyphView A00;

    public Fkm(BadgableGlyphView badgableGlyphView) {
        this.A00 = badgableGlyphView;
    }

    public final void CMT() {
        BadgableGlyphView badgableGlyphView = this.A00;
        if (11T.A0O(badgableGlyphView.A01, Looper.myLooper())) {
            badgableGlyphView.invalidate();
        } else {
            badgableGlyphView.postInvalidate();
        }
    }
}
