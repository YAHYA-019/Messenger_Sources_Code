package com.facebook.video.plugins.views;

import X.11T;
import X.GOn;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.resources.ui.FbFrameLayout;

/* loaded from: VideoPluginInnerContainer.class */
public class VideoPluginInnerContainer extends FbFrameLayout {
    public double A00;
    public double A01;
    public boolean A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoPluginInnerContainer(Context context) {
        super(context);
        11T.A0F(context, 1);
        this.A01 = 1.7777777777777777d;
        this.A00 = -1.0d;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoPluginInnerContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        11T.A0F(context, 1);
        this.A01 = 1.7777777777777777d;
        this.A00 = -1.0d;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoPluginInnerContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        11T.A0F(context, 1);
        this.A01 = 1.7777777777777777d;
        this.A00 = -1.0d;
    }

    public void A00(double d) {
        this.A01 = d;
    }

    public void A01(boolean z) {
        this.A02 = z;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        double d = size;
        double d2 = size2;
        double d3 = d / d2;
        double d4 = this.A00;
        if (d4 > 0.0d) {
            if (d4 > d3) {
                size2 = GOn.A02(d / d4);
            } else {
                size = GOn.A02(d2 * d4);
            }
            d3 = size / size2;
        }
        double d5 = this.A01;
        if ((d5 >= d3 || this.A02) && (d5 <= d3 || !this.A02)) {
            size2 = GOn.A02(size / d5);
        } else {
            size = GOn.A02(size2 * d5);
        }
        if (getChildCount() > 0) {
            getChildAt(0).measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        setMeasuredDimension(size, size2);
    }
}
