package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.drawee.fbpipeline.FbDraweeView;
import com.facebook.maps.FbMapViewDelegate;
import com.facebook.widget.CustomRelativeLayout;
import com.facebook.widget.text.BetterTextView;
import com.google.common.collect.ImmutableList;

/* loaded from: H5p.class */
public final class H5p extends CustomRelativeLayout implements CallerContextable {
    public static final CallerContext A0I = CallerContext.A06(H5p.class);
    public static final String __redex_internal_original_name = "ShippingNotificationView";
    public FbMapViewDelegate A00;
    public MFO A01;
    public MFP A02;
    public MFR A03;
    public I1w A04;
    public I2W A05;
    public final ViewStub A06;
    public final FbDraweeView A07;
    public final C00i A08;
    public final 7pD A09;
    public final BetterTextView A0A;
    public final BetterTextView A0B;
    public final BetterTextView A0C;
    public final BetterTextView A0D;
    public final BetterTextView A0E;
    public final BetterTextView A0F;
    public final BetterTextView A0G;
    public final ImmutableList A0H;

    public H5p(Context context) {
        super(context, null, 0);
        this.A08 = AbH.A0D();
        this.A04 = (I1w) 1Bn.A0A(116223);
        this.A05 = (I2W) 1Bn.A0E(context, (1BY) null, 116227);
        this.A09 = new 7pD(context);
        A0C(2132542880);
        this.A06 = (ViewStub) C09s.A01(this, 2131363117);
        this.A07 = DKC.A0M(this, 2131363114);
        this.A0C = DKC.A0g(this, 2131363172);
        this.A0D = DKC.A0g(this, 2131363184);
        this.A0F = DKC.A0g(this, 2131363183);
        this.A0E = DKC.A0g(this, 2131363186);
        this.A0G = DKC.A0g(this, 2131363185);
        this.A0A = DKC.A0g(this, 2131363180);
        this.A0H = ImmutableList.of((Object) C09s.A01(this, 2131363174), (Object) C09s.A01(this, 2131363175), (Object) C09s.A01(this, 2131363176));
        this.A0B = DKC.A0g(this, 2131363182);
    }

    @Override // com.facebook.widget.CustomRelativeLayout, com.facebook.ui.compat.fbrelativelayout.FbRelativeLayout, android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        ViewStub viewStub = this.A06;
        ViewGroup.LayoutParams layoutParams = viewStub.getLayoutParams();
        layoutParams.width = size;
        layoutParams.height = (int) (size / 1.9d);
        viewStub.setLayoutParams(layoutParams);
        super.onMeasure(i, i2);
    }
}
