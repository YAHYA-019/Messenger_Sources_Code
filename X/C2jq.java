package X;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.facebook.litho.BaseMountingView;
import com.mapbox.mapboxsdk.style.layers.Property;
import java.util.ArrayList;

/* renamed from: X.2jq, reason: invalid class name */
/* loaded from: 2jq.class */
public final class C2jq implements C2jo {
    @Override // X.C2jo
    public float AUD(C29k c29k) {
        11T.A0F(c29k, 0);
        return c29k.A02.width();
    }

    @Override // X.C2jo
    public float AUE(Object obj) {
        int width;
        11T.A0F(obj, 0);
        if (obj instanceof View) {
            width = ((View) obj).getWidth();
        } else {
            if (!(obj instanceof Drawable)) {
                throw AnonymousClass001.A0q(AnonymousClass001.A0Z(obj, "Getting width from unsupported mount content: ", AnonymousClass001.A0k()));
            }
            width = ((Drawable) obj).getBounds().width();
        }
        return width;
    }

    @Override // X.C2jo
    public void ChS(Object obj) {
    }

    @Override // X.C2jo
    public void ClN(Object obj, float f) {
        11T.A0F(obj, 0);
        if (!(obj instanceof C1qv)) {
            if (obj instanceof View) {
                View view = (View) obj;
                int left = view.getLeft();
                2JL.A00((Rect) null, (1JX) null, obj, left, view.getTop(), (int) (left + f), view.getBottom(), false);
                return;
            }
            if (!(obj instanceof Drawable)) {
                throw AnonymousClass001.A0q(AnonymousClass001.A0Z(obj, "Setting width on unsupported mount content: ", AnonymousClass001.A0k()));
            }
            Drawable drawable = (Drawable) obj;
            5XD.A00(drawable, (int) f, drawable.getBounds().height());
            return;
        }
        if (obj instanceof C1r1) {
            BaseMountingView baseMountingView = (BaseMountingView) ((C1r1) obj);
            baseMountingView.A01 = (int) f;
            baseMountingView.requestLayout();
        } else {
            View view2 = (View) obj;
            int left2 = view2.getLeft();
            2JL.A00((Rect) null, (1JX) null, obj, left2, view2.getTop(), (int) (left2 + f), view2.getBottom(), false);
        }
        C1qv c1qv = (C1qv) obj;
        ArrayList A03 = C2jm.A03(c1qv);
        if (A03 != null) {
            int i = (int) f;
            int height = c1qv.getHeight();
            int size = A03.size();
            for (int i2 = 0; i2 < size; i2++) {
                5XD.A00((Drawable) A03.get(i2), i, height);
            }
        }
    }

    @Override // X.C2jo
    public String getName() {
        return Property.ICON_TEXT_FIT_WIDTH;
    }
}
