package X;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.drawee.fbpipeline.FbDraweeView;
import com.facebook.widget.CustomRelativeLayout;
import com.facebook.widget.text.BetterTextView;
import com.google.common.collect.ImmutableList;

/* loaded from: H5o.class */
public final class H5o extends CustomRelativeLayout implements CallerContextable {
    public static final CallerContext A0I = CallerContext.A06(H5o.class);
    public static final String __redex_internal_original_name = "MultiItemReceiptView";
    public I1w A00;
    public final View A01;
    public final View A02;
    public final View A03;
    public final View A04;
    public final LinearLayout A05;
    public final FbDraweeView A06;
    public final RQd A07;
    public final 2Wo A08;
    public final BetterTextView A09;
    public final BetterTextView A0A;
    public final BetterTextView A0B;
    public final BetterTextView A0C;
    public final BetterTextView A0D;
    public final BetterTextView A0E;
    public final BetterTextView A0F;
    public final BetterTextView A0G;
    public final ImmutableList A0H;

    public H5o(Context context) {
        super(context, null, 0);
        this.A00 = (I1w) 1Bn.A0A(116223);
        A0C(2132542869);
        this.A07 = new RQd(context);
        this.A05 = (LinearLayout) C09s.A01(this, 2131363119);
        this.A04 = C09s.A01(this, 2131363158);
        this.A03 = C09s.A01(this, 2131363159);
        this.A0E = DKC.A0g(this, 2131363160);
        this.A01 = C09s.A01(this, 2131363156);
        this.A02 = C09s.A01(this, 2131363157);
        this.A06 = DKC.A0M(this, 2131363167);
        this.A09 = DKC.A0g(this, 2131363168);
        this.A0A = DKC.A0g(this, 2131363169);
        this.A0C = DKC.A0g(this, 2131363124);
        this.A0B = DKC.A0g(this, 2131363123);
        this.A0G = DKC.A0g(this, 2131363170);
        this.A0F = DKC.A0g(this, 2131363171);
        this.A0D = DKC.A0g(this, 2131363118);
        this.A0H = ImmutableList.of((Object) C09s.A01(this, 2131363120), (Object) C09s.A01(this, 2131363121));
        this.A08 = AbK.A0v(this, 2131363166);
    }
}
