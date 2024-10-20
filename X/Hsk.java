package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.messaging.montage.widget.reboundhorizontalscrollview.ReboundHorizontalScrollView;
import com.google.common.collect.ImmutableList;
import com.mapbox.mapboxsdk.R;
import java.util.List;

/* loaded from: Hsk.class */
public final class Hsk {
    public int A00;
    public View A01;
    public C09964s0 A02;
    public HnT A03;
    public C6x4 A04;
    public ReboundHorizontalScrollView A05;
    public ImmutableList A06;
    public boolean A07;
    public static final C66h A09 = C66h.A03(0.0d, 60.0d);
    public static final String[] A08 = {"TEXT", "ROLL_CALL", "NORMAL", "VIDEO", "BOOMERANG", "SELFIE"};

    public void A00() {
        if (this.A07 || this.A06.size() < 1) {
            return;
        }
        this.A07 = true;
        this.A05 = (ReboundHorizontalScrollView) C09s.A01(this.A01, 2131365784);
        Context context = this.A01.getContext();
        int A07 = (GOn.A07(context.getResources(), 2132279303) * 2) + (GOn.A07(context.getResources(), R.dimen.mapbox_eight_dp) * 4);
        ViewGroup.LayoutParams layoutParams = this.A05.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = this.A02.A08() - A07;
            this.A05.setLayoutParams(layoutParams);
        }
        ReboundHorizontalScrollView reboundHorizontalScrollView = this.A05;
        reboundHorizontalScrollView.A05 = A09;
        Goq goq = new Goq(this);
        List list = reboundHorizontalScrollView.A0K;
        if (!list.contains(goq)) {
            list.add(goq);
        }
        IKN.A00(this.A05, this, 4);
        LayoutInflater A0A = DKD.A0A(this.A01);
        this.A05.removeAllViews();
        1Du it = this.A06.iterator();
        while (it.hasNext()) {
            C6x4 c6x4 = (C6x4) it.next();
            TextView textView = (TextView) AbG.A08(A0A, this.A05, 2132542663);
            textView.setText(GOo.A0A(this.A01).getText(c6x4.displayTextId));
            this.A05.addView(textView);
        }
    }

    public void A01(C6x4 c6x4) {
        int indexOf = this.A06.indexOf(c6x4);
        if (this.A06.size() < 1) {
            return;
        }
        float f = 0.0f / 0.0f;
        if (indexOf == -1) {
            return;
        }
        A00();
        int childCount = this.A05.getChildCount();
        int i = 0;
        while (true) {
            ReboundHorizontalScrollView reboundHorizontalScrollView = this.A05;
            if (i >= childCount) {
                reboundHorizontalScrollView.A0J.A06(ReboundHorizontalScrollView.A01(reboundHorizontalScrollView, indexOf));
                View childAt = this.A05.getChildAt(indexOf);
                childAt.setAlpha(1.0f);
                childAt.setScaleX(1.0f);
                childAt.setScaleY(1.0f);
                this.A00 = indexOf;
                return;
            }
            View childAt2 = reboundHorizontalScrollView.getChildAt(i);
            childAt2.setAlpha(0.5f);
            childAt2.setScaleX(0.9285714f);
            childAt2.setScaleY(0.9285714f);
            i++;
        }
    }
}
