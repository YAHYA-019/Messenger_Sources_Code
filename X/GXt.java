package X;

import android.view.View;
import android.widget.ImageView;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.widget.text.BetterTextView;

/* loaded from: GXt.class */
public final class GXt extends C2lb implements CallerContextable {
    public static final String __redex_internal_original_name = "MoreDrawerGenericGridItemViewHolder";
    public HR2 A00;
    public IU6 A01;
    public final int A02;
    public final ImageView A03;
    public final C00i A04;
    public final BetterTextView A05;

    public GXt(View view, int i) {
        super(view);
        this.A04 = AbH.A0Q();
        this.A02 = i;
        this.A03 = (ImageView) C09s.A01(view, 2131362696);
        this.A05 = (BetterTextView) C09s.A01(view, 2131362699);
        IKE.A01(view, this, 25);
        view.setOnLongClickListener(new IKO(this, 1));
        IKm.A00(view, this, 4);
    }
}
