package X;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.facebook.litho.BaseMountingView;
import com.mapbox.mapboxsdk.style.layers.Property;
import java.util.ArrayList;

/* renamed from: X.2jr, reason: invalid class name */
/* loaded from: 2jr.class */
public final class C2jr implements C2jo {
    @Override // X.C2jo
    public float AUD(C29k c29k) {
        11T.A0F(c29k, 0);
        return c29k.A02.height();
    }

    @Override // X.C2jo
    public float AUE(Object obj) {
        int height;
        11T.A0F(obj, 0);
        if (obj instanceof View) {
            height = ((View) obj).getHeight();
        } else {
            if (!(obj instanceof Drawable)) {
                throw AnonymousClass001.A0q(AnonymousClass001.A0Z(obj, "Getting height from unsupported mount content: ", AnonymousClass001.A0k()));
            }
            height = ((Drawable) obj).getBounds().height();
        }
        return height;
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
                int top = view.getTop();
                2JL.A00((Rect) null, (1JX) null, obj, view.getLeft(), top, view.getRight(), (int) (top + f), false);
                return;
            }
            if (!(obj instanceof Drawable)) {
                throw AnonymousClass001.A0q(AnonymousClass001.A0Z(obj, "Setting height on unsupported mount content: ", AnonymousClass001.A0k()));
            }
            Drawable drawable = (Drawable) obj;
            5XD.A00(drawable, drawable.getBounds().width(), (int) f);
            return;
        }
        if (obj instanceof C1r1) {
            BaseMountingView baseMountingView = (BaseMountingView) ((C1r1) obj);
            baseMountingView.A00 = (int) f;
            baseMountingView.requestLayout();
        } else {
            View view2 = (View) obj;
            int top2 = view2.getTop();
            2JL.A00((Rect) null, (1JX) null, obj, view2.getLeft(), top2, view2.getRight(), (int) (top2 + f), false);
        }
        C1qv c1qv = (C1qv) obj;
        ArrayList A03 = C2jm.A03(c1qv);
        if (A03 != null) {
            int width = c1qv.getWidth();
            int i = (int) f;
            int size = A03.size();
            for (int i2 = 0; i2 < size; i2++) {
                5XD.A00((Drawable) A03.get(i2), width, i);
            }
        }
    }

    @Override // X.C2jo
    public String getName() {
        return Property.ICON_TEXT_FIT_HEIGHT;
    }
}
