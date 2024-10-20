package X;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.widget.FbImageView;
import com.mapbox.mapboxsdk.R;

/* loaded from: H2g.class */
public final class H2g extends H3O {
    public LinearLayout A00;
    public TextView A01;
    public HST A02;
    public ThreadKey A03;
    public FbImageView A04;
    public SeekBar A05;
    public TextView A06;
    public final long A07;
    public final 1Br A08;
    public final 1Br A09;
    public final 1Br A0A;

    /* JADX WARN: Multi-variable type inference failed */
    public H2g(Context context, ThreadKey threadKey) {
        super(context, (AttributeSet) null, 0);
        this.A03 = threadKey;
        this.A07 = 42;
        this.A09 = GOn.A0R(context);
        this.A0A = 7zM.A0U();
        this.A08 = 1Bu.A00(66570);
        this.A00 = (LinearLayout) C09s.A01(this, 2131368353);
        this.A05 = (SeekBar) C09s.A01(this, 2131367249);
        this.A01 = DKF.A0E(this, 2131363845);
        this.A06 = DKF.A0E(this, 2131366883);
        this.A01.setTextColor(7zQ.A0m(this.A09).BKg());
        this.A06.setTextColor(7zQ.A0m(this.A09).BKg());
        A00(this);
        GPl.A02(this, 23);
        GPl.A02(this, 22);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A00(H2g h2g) {
        int i;
        TextView textView;
        LinearLayout linearLayout = h2g.A00;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) GOp.A0C(linearLayout);
        C00i c00i = h2g.A08.A00;
        if (((C6kc) c00i.get()).A07(h2g.A03)) {
            i = 2132279314;
            if (((C6kc) c00i.get()).A05(h2g.A03)) {
                i = 2132279306;
            }
        } else {
            i = 2132279451;
        }
        Resources resources = h2g.getResources();
        marginLayoutParams.bottomMargin = resources.getDimensionPixelSize(i);
        linearLayout.setLayoutParams(marginLayoutParams);
        int i2 = 0;
        if (((C6kc) c00i.get()).A04(h2g.A03)) {
            FbImageView fbImageView = (FbImageView) C09s.A01(h2g, 2131366597);
            h2g.A04 = fbImageView;
            if (fbImageView != null) {
                IKE.A01(fbImageView, h2g, 74);
            }
            linearLayout.setPadding(0, linearLayout.getPaddingTop(), linearLayout.getPaddingRight(), linearLayout.getPaddingBottom());
            textView = h2g.A01;
            i2 = 8;
        } else {
            linearLayout.setPadding(resources.getDimensionPixelSize(R.dimen.mapbox_eight_dp), linearLayout.getPaddingTop(), linearLayout.getPaddingRight(), linearLayout.getPaddingBottom());
            h2g.A04 = null;
            textView = h2g.A01;
        }
        textView.setVisibility(i2);
        C1u3 c1u3 = C1u3.A51;
        FbImageView fbImageView2 = h2g.A04;
        if (fbImageView2 != null) {
            GOo.A1E(fbImageView2, c1u3, 7zP.A0S(h2g.A0A), 7zQ.A0m(h2g.A09).BKg());
        }
    }

    public String A0H() {
        return "VideoMessageControlsPlugin";
    }

    public void A0p(int i) {
        super.A0p(i);
        FbImageView fbImageView = this.A04;
        if (fbImageView != null) {
            fbImageView.setVisibility(i);
        }
    }
}
