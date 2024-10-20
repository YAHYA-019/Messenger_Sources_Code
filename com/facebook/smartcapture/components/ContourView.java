package com.facebook.smartcapture.components;

import X.11T;
import X.HL8;
import X.Kw8;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.mapbox.mapboxsdk.R;

/* loaded from: ContourView.class */
public final class ContourView extends FrameLayout {
    public int A00;
    public int A01;
    public boolean A02;
    public final float A03;
    public final float A04;
    public final int A05;
    public final ImageView A06;
    public final ImageView A07;
    public final ImageView A08;
    public final ImageView A09;
    public final TextView A0A;
    public final DarkenedFrameView A0B;
    public final DottedAlignmentView A0C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContourView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        11T.A0F(context, 1);
        View.inflate(getContext(), 2132541769, this);
        this.A0C = (DottedAlignmentView) HL8.A00(this, 2131363712);
        this.A0B = (DarkenedFrameView) HL8.A00(this, 2131363526);
        this.A08 = (ImageView) HL8.A00(this, 2131365087);
        this.A09 = (ImageView) HL8.A00(this, 2131365088);
        this.A06 = (ImageView) HL8.A00(this, 2131365085);
        this.A07 = (ImageView) HL8.A00(this, 2131365086);
        this.A0A = (TextView) HL8.A00(this, 2131368232);
        Resources resources = getResources();
        this.A03 = resources.getDimension(R.dimen.mapbox_four_dp);
        this.A04 = resources.getDimension(2132279309);
        this.A05 = Kw8.A00(context, 2130971552);
        this.A01 = 0;
        this.A00 = 0;
        setAlpha(0.0f);
        this.A02 = true;
    }
}
