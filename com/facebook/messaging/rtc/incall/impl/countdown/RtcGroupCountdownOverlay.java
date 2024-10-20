package com.facebook.messaging.rtc.incall.impl.countdown;

import X.11T;
import X.1Br;
import X.1EZ;
import X.1Fw;
import X.1Iw;
import X.7zQ;
import X.C00i;
import X.GOn;
import X.GOo;
import X.HV4;
import android.content.Context;
import android.os.CountDownTimer;
import android.util.AttributeSet;
import android.widget.ImageButton;
import com.facebook.litho.LithoView;
import com.facebook.messaging.rtc.incall.impl.widgets.gradientbackground.GradientCallBackgroundView;
import com.facebook.resources.ui.FbTextView;
import com.facebook.rtc.views.common.CountdownView;
import com.facebook.widget.CustomFrameLayout;

/* loaded from: RtcGroupCountdownOverlay.class */
public final class RtcGroupCountdownOverlay extends CustomFrameLayout {
    public CountDownTimer A00;
    public ImageButton A01;
    public C00i A02;
    public C00i A03;
    public 1Iw A04;
    public LithoView A05;
    public HV4 A06;
    public GradientCallBackgroundView A07;
    public FbTextView A08;
    public FbTextView A09;
    public FbTextView A0A;
    public CountdownView A0B;
    public boolean A0C;
    public boolean A0D;
    public final 1Br A0E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RtcGroupCountdownOverlay(Context context) {
        super(context);
        11T.A0F(context, 1);
        this.A0E = GOo.A0L();
        1EZ A0O = 7zQ.A0O(context);
        this.A02 = GOn.A0R(context);
        this.A03 = GOn.A0W(context, 1Fw.A04(A0O));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RtcGroupCountdownOverlay(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        11T.A0F(context, 1);
        this.A0E = GOo.A0L();
        1EZ A0O = 7zQ.A0O(context);
        this.A02 = GOn.A0R(context);
        this.A03 = GOn.A0W(context, 1Fw.A04(A0O));
    }
}
