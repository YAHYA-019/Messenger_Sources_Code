package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.drawee.fbpipeline.FbDraweeView;
import com.facebook.widget.CustomRelativeLayout;

/* loaded from: H5n.class */
public class H5n extends CustomRelativeLayout implements CallerContextable {
    public static Drawable A05;
    public static final CallerContext A06 = CallerContext.A06(H5n.class);
    public static final String __redex_internal_original_name = "NearbyPlaceListItemView";
    public TextView A00;
    public TextView A01;
    public TextView A02;
    public FbDraweeView A03;
    public final C1uu A04;

    public H5n(Context context) {
        super(context);
        this.A04 = (C1uu) 1Bi.A03(66388);
        A0C(2132542815);
        setBackgroundResource(2132411302);
        int A09 = GOq.A09(this);
        setPadding(A09, A09, A09, 0);
        this.A03 = DKC.A0M(this, 2131365952);
        this.A02 = AbG.A09(this, 2131365951);
        this.A00 = AbF.A06(this, 2131365949);
        this.A01 = AbF.A06(this, 2131365950);
    }
}
