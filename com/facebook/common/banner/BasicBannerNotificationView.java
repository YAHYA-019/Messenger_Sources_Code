package com.facebook.common.banner;

import X.0S2;
import X.2Wo;
import X.3UJ;
import X.3lL;
import X.C09s;
import X.C0k4;
import X.C2rp;
import X.C47c;
import X.C47d;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.facebook.widget.CustomLinearLayout;
import com.facebook.widget.text.BetterTextView;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;

/* loaded from: BasicBannerNotificationView.class */
public class BasicBannerNotificationView extends CustomLinearLayout {
    public 3lL A00;
    public 2Wo A01;
    public 2Wo A02;
    public final LinearLayout A03;
    public final TextView A04;
    public final ProgressBar A05;

    public BasicBannerNotificationView(Context context) {
        this(context, null);
    }

    public BasicBannerNotificationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BasicBannerNotificationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A0D(2132542821);
        this.A04 = (TextView) C09s.A01(this, 2131366013);
        C0k4.A00(this);
        this.A05 = (ProgressBar) findViewById(2131366722);
        C0k4.A00(this);
        this.A03 = (LinearLayout) findViewById(2131366011);
        this.A02 = 2Wo.A00((ViewStub) C09s.A01(this, 2131362377));
        this.A01 = 2Wo.A00((ViewStub) C09s.A01(this, 2131362372));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void A00(C47c c47c, BetterTextView betterTextView, int i) {
        betterTextView.setText((CharSequence) c47c.A05.get(i));
        betterTextView.setTag(c47c.A04.get(i));
        int i2 = c47c.A01;
        if (i2 != 0) {
            betterTextView.setTextColor(i2);
        }
        C2rp.A02(betterTextView, 0S2.A01);
        betterTextView.setOnClickListener(new 3UJ(betterTextView, this, 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v113, types: [com.facebook.widget.text.BetterTextView, android.view.View] */
    public void A0E(C47c c47c) {
        LinearLayout linearLayout;
        int i;
        TextView textView = this.A04;
        textView.setText(c47c.A06);
        float f = c47c.A00;
        if (f > 0.0f) {
            textView.setTextSize(0, f);
        } else {
            textView.setTextSize(2, 14.0f);
        }
        int i2 = c47c.A02;
        if (i2 != 0) {
            textView.setTextColor(i2);
        }
        setBackgroundDrawable(c47c.A03);
        ImmutableList immutableList = c47c.A05;
        if (immutableList == null || immutableList.isEmpty()) {
            this.A02.A02();
            this.A01.A02();
            linearLayout = this.A03;
            if (linearLayout != null) {
                i = 17;
                linearLayout.setGravity(i);
            }
        } else if (immutableList.size() == 1) {
            Preconditions.checkState(immutableList.size() == 1);
            2Wo r0 = this.A02;
            r0.A03();
            A00(c47c, (BetterTextView) r0.A01(), 0);
            textView.setGravity(19);
        } else {
            Preconditions.checkState(immutableList.size() <= 3, "No current support for more than 3 buttons in banner view.");
            Preconditions.checkState(immutableList.size() > 1);
            2Wo r02 = this.A01;
            r02.A03();
            ViewGroup viewGroup = (ViewGroup) r02.A01();
            LayoutInflater from = LayoutInflater.from(getContext());
            for (int i3 = 0; i3 < immutableList.size(); i3++) {
                ?? r03 = (BetterTextView) from.inflate(2132542827, viewGroup, false);
                A00(c47c, (BetterTextView) r03, i3);
                viewGroup.addView(r03);
            }
            linearLayout = this.A03;
            if (linearLayout != null) {
                Resources resources = getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(2132279311);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(2132279310);
                linearLayout.setPadding(dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize);
                i = 19;
                linearLayout.setGravity(i);
            }
        }
        ProgressBar progressBar = this.A05;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof C47d) {
            C47d c47d = (C47d) layoutParams;
            c47d.A02 = c47c.A07 == 0S2.A01;
        }
        requestLayout();
    }
}
