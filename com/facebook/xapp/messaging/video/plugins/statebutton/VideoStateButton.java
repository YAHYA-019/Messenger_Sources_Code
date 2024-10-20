package com.facebook.xapp.messaging.video.plugins.statebutton;

import X.11T;
import X.1BL;
import X.C09s;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.facebook.widget.CustomFrameLayout;
import com.facebook.widget.FacebookProgressCircleView;

/* loaded from: VideoStateButton.class */
public final class VideoStateButton extends CustomFrameLayout {
    public final ImageView A00;
    public final ImageView A01;
    public final FacebookProgressCircleView A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoStateButton(Context context) {
        super(context);
        11T.A0F(context, 1);
        A0U(2132543557);
        this.A02 = (FacebookProgressCircleView) C09s.A01(this, 2131368348);
        this.A01 = (ImageView) C09s.A01(this, 2131368349);
        this.A00 = (ImageView) C09s.A01(this, 2131368350);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoStateButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        1BL.A1F(context, attributeSet);
        A0U(2132543557);
        this.A02 = (FacebookProgressCircleView) C09s.A01(this, 2131368348);
        this.A01 = (ImageView) C09s.A01(this, 2131368349);
        this.A00 = (ImageView) C09s.A01(this, 2131368350);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoStateButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        1BL.A1F(context, attributeSet);
        A0U(2132543557);
        this.A02 = (FacebookProgressCircleView) C09s.A01(this, 2131368348);
        this.A01 = (ImageView) C09s.A01(this, 2131368349);
        this.A00 = (ImageView) C09s.A01(this, 2131368350);
    }
}
