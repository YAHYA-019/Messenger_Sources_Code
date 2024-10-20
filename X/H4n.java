package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.music.ui.musicshare.ProgressCircle;
import com.facebook.resources.ui.FbImageButton;
import com.facebook.wearable.common.comms.hera.shared.host.HeraHostSharedImplKt;
import com.facebook.widget.CustomFrameLayout;

/* loaded from: H4n.class */
public final class H4n extends CustomFrameLayout {
    public int A00;
    public HWW A01;
    public Integer A02;
    public boolean A03;
    public GUj A04;
    public final C1u2 A05;
    public final C00i A06;
    public final MigColorScheme A07;
    public final ProgressCircle A08;
    public final FbImageButton A09;

    public H4n(Context context) {
        super(context, null, 0);
        this.A02 = null;
        MigColorScheme migColorScheme = (MigColorScheme) 1Bn.A0E(getContext(), (1BY) null, 16979);
        this.A07 = migColorScheme;
        this.A05 = 7zP.A0R();
        this.A06 = AbH.A0M();
        this.A01 = null;
        this.A03 = false;
        A0U(2132541542);
        this.A09 = (FbImageButton) C09s.A01(this, 2131366593);
        A02(this, true);
        this.A08 = (ProgressCircle) C09s.A01(this, 2131366707);
        A00(this, migColorScheme.B4h());
    }

    public static void A00(H4n h4n, int i) {
        ProgressCircle progressCircle = h4n.A08;
        Resources resources = h4n.getResources();
        progressCircle.A01(i, resources.getDimension(2132279309), resources.getDimension(2132279312));
        GUj gUj = new GUj(progressCircle);
        h4n.A04 = gUj;
        gUj.setInterpolator(new LinearInterpolator());
    }

    public static void A01(H4n h4n, short s) {
        synchronized (h4n) {
            Integer num = h4n.A02;
            if (num != null) {
                h4n.A02 = null;
                1BK.A0U(h4n.A06).markerEnd(385615800, num.intValue(), s);
            }
        }
    }

    public static void A02(H4n h4n, boolean z) {
        FbImageButton fbImageButton = h4n.A09;
        C1u3 c1u3 = z ? C1u3.A51 : !h4n.A03 ? C1u3.A4k : C1u3.A6F;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        Drawable A0F = 7zO.A0F(c1u3, h4n.A05, h4n.A07);
        shapeDrawable.getPaint().setColor(h4n.A00);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{shapeDrawable, A0F});
        int A00 = C0A8.A00(h4n.getContext(), 5.0f);
        layerDrawable.setLayerInset(1, A00, A00, A00, A00);
        fbImageButton.setImageDrawable(layerDrawable);
    }

    public void A0V() {
        A02(this, true);
        GUj gUj = this.A04;
        gUj.A00 = 0.0f;
        ProgressCircle progressCircle = gUj.A01;
        progressCircle.A00 = 0.0f;
        progressCircle.clearAnimation();
        progressCircle.setVisibility(8);
    }

    public void A0W(int i, int i2) {
        A02(this, true);
        if (i > 0) {
            ProgressCircle progressCircle = this.A08;
            progressCircle.A00 = (((i - i2) * HeraHostSharedImplKt.DEFAULT_RECV_VIDEO_INIT_WIDTH) / i) % 360.0f;
            progressCircle.requestLayout();
        }
        GUj gUj = this.A04;
        ProgressCircle progressCircle2 = gUj.A01;
        gUj.A00 = progressCircle2.A00;
        progressCircle2.clearAnimation();
    }

    public void A0X(int i, int i2) {
        Animation animation;
        ProgressCircle progressCircle;
        A02(this, false);
        if (i == i2) {
            animation = this.A04;
            animation.setDuration(i);
            progressCircle = ((GUj) animation).A01;
        } else {
            if (i > 0) {
                ProgressCircle progressCircle2 = this.A08;
                progressCircle2.A00 = (((i - i2) * HeraHostSharedImplKt.DEFAULT_RECV_VIDEO_INIT_WIDTH) / i) % 360.0f;
                progressCircle2.requestLayout();
            }
            animation = this.A04;
            progressCircle = ((GUj) animation).A01;
            ((GUj) animation).A00 = progressCircle.A00;
            animation.setDuration(i2);
        }
        progressCircle.setVisibility(0);
        progressCircle.startAnimation(animation);
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        HWW hww = this.A01;
        if (hww != null) {
            if (i == 8 || i == 4) {
                Hpu hpu = hww.A00;
                hpu.A04.A01(hpu.A00);
            }
        }
    }
}
