package X;

import android.content.Context;
import android.content.res.Resources;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.drawee.fbpipeline.FbDraweeView;
import com.facebook.messaging.montage.composer.art.circularpicker.IconEmptyView;
import com.facebook.widget.CustomFrameLayout;
import com.facebook.widget.FacebookProgressCircleViewAnimated;
import com.facebook.widget.FbImageView;

/* loaded from: H51.class */
public final class H51 extends CustomFrameLayout implements CallerContextable {
    public static final CallerContext A08 = CallerContext.A0A(H51.class, "messenger_montage_art_prefetch", "art_item_drawee_load");
    public static final String __redex_internal_original_name = "CircularArtItemView";
    public IconEmptyView A00;
    public boolean A01;
    public final FbDraweeView A02;
    public final 1Br A03;
    public final Iqg A04;
    public final FacebookProgressCircleViewAnimated A05;
    public final FbImageView A06;
    public final FbImageView A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H51(Context context) {
        super(context, null, 0);
        11T.A0F(context, 1);
        this.A03 = 1Bu.A00(115802);
        A0U(2132541706);
        setFocusable(true);
        this.A02 = DKC.A0M(this, 2131362102);
        FbImageView fbImageView = (FbImageView) C09s.A01(this, 2131362104);
        this.A06 = fbImageView;
        int A03 = 4YV.A0I().A03(C1u3.A5K);
        Resources resources = getResources();
        fbImageView.setImageDrawable(new GSd(context, A03, 2132213766, 2132213825, GOn.A07(resources, 2132279328), GOn.A07(resources, 2132279298)));
        FacebookProgressCircleViewAnimated facebookProgressCircleViewAnimated = (FacebookProgressCircleViewAnimated) C09s.A01(this, 2131363718);
        this.A05 = facebookProgressCircleViewAnimated;
        this.A07 = (FbImageView) C09s.A01(this, 2131365964);
        this.A04 = new Iqg(this);
        facebookProgressCircleViewAnimated.setVisibility(0);
        C2rp.A01(this);
    }

    public final void A0V(HAR har) {
        11T.A0F(har, 0);
        int ordinal = har.ordinal();
        if (ordinal == 3) {
            C00i c00i = this.A03.A00;
            new I5M(this.A02, ((HQt) c00i.get()).A00).A01(1.0f);
            new I5M(this.A05, ((HQt) c00i.get()).A00).A01(0.0f);
            return;
        }
        if (ordinal == 2 || ordinal == 1) {
            new I5M(this.A05, ((HQt) 1Br.A0B(this.A03)).A00).A01(1.0f);
        } else if (ordinal == 0 || ordinal == 4) {
            this.A02.setAlpha(0.5f);
            this.A05.setAlpha(0.0f);
        }
    }
}
