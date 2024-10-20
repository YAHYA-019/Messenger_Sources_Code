package X;

import android.view.View;
import android.view.ViewParent;
import com.facebook.resources.ui.FbFrameLayout;
import com.facebook.widget.CustomFrameLayout;

/* loaded from: H5H.class */
public final class H5H extends CustomFrameLayout implements JFq {
    public C00i A00;
    public C00i A01;
    public FbFrameLayout A02;

    @Override // X.JFq
    public /* bridge */ /* synthetic */ void CfQ(JDB jdb) {
        String str;
        IZZ izz = (IZZ) jdb;
        11T.A0F(izz, 0);
        C00i c00i = this.A01;
        if (c00i == null) {
            str = "thumbnailViewProvider";
        } else {
            Hp0 hp0 = (Hp0) c00i.get();
            String str2 = izz.A00;
            11T.A0A(str2);
            View view = (View) hp0.A00(4YU.A08(this), str2, 4);
            ViewParent parent = view.getParent();
            FbFrameLayout fbFrameLayout = this.A02;
            str = "participantViewHolder";
            if (fbFrameLayout != null) {
                if (parent == fbFrameLayout) {
                    return;
                }
                AbstractC2326GOr.A0z(view);
                FbFrameLayout fbFrameLayout2 = this.A02;
                if (fbFrameLayout2 != null) {
                    fbFrameLayout2.removeAllViews();
                    FbFrameLayout fbFrameLayout3 = this.A02;
                    if (fbFrameLayout3 != null) {
                        fbFrameLayout3.addView(view);
                        return;
                    }
                }
            }
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    @Override // com.facebook.widget.CustomFrameLayout, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        int A06 = 0FI.A06(-1088576563);
        super.onAttachedToWindow();
        C00i c00i = this.A00;
        if (c00i == null) {
            AbF.A1H();
            throw 0Q8.createAndThrow();
        }
        ((GS2) c00i.get()).A0Y(this);
        0FI.A0C(1472689628, A06);
    }

    @Override // com.facebook.widget.CustomFrameLayout, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        int A06 = 0FI.A06(2057976609);
        C00i c00i = this.A00;
        if (c00i == null) {
            AbF.A1H();
            throw 0Q8.createAndThrow();
        }
        ((GS2) c00i.get()).A0X();
        super.onDetachedFromWindow();
        0FI.A0C(-2039212784, A06);
    }
}
