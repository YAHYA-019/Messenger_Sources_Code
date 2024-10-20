package X;

import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.drawee.fbpipeline.FbDraweeView;
import com.facebook.resources.ui.FbTextView;
import com.facebook.widget.CustomLinearLayout;

/* loaded from: H5d.class */
public final class H5d extends CustomLinearLayout implements CallerContextable {
    public static final CallerContext A05 = CallerContext.A08(H5d.class, "stickers_in_composer");
    public static final String __redex_internal_original_name = "StickerTagItemView";
    public FbDraweeView A00;
    public C00i A01;
    public FbTextView A02;
    public HXx A03;
    public C6xd A04;

    public static GradientDrawable A00(H5d h5d) {
        C6xd c6xd;
        Resources resources = h5d.getResources();
        GradientDrawable gradientDrawable = (GradientDrawable) resources.getDrawable(2132411319, h5d.getContext().getTheme()).mutate();
        if (1Br.A07(h5d.A03.A00).AZk(36311848249527881L) || GOp.A0l(h5d.A01).AZk(36310808867898562L) || (c6xd = h5d.A04) == C6xd.A06 || c6xd == C6xd.A07 || c6xd == C6xd.A0B) {
            gradientDrawable.setCornerRadius(7zL.A01(resources, 2132279320));
        }
        return gradientDrawable;
    }
}
