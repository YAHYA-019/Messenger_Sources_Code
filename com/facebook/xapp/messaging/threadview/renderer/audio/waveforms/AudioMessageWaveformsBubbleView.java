package com.facebook.xapp.messaging.threadview.renderer.audio.waveforms;

import X.0AT;
import X.0S2;
import X.11T;
import X.1G2;
import X.66S;
import X.66T;
import X.6Sn;
import X.C09s;
import X.C6nd;
import X.DKF;
import X.DKG;
import X.GOq;
import X.GPV;
import X.GPZ;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.TextView;
import com.facebook.fbui.widget.glyph.GlyphView;
import com.facebook.resources.ui.FbView;
import com.facebook.widget.CustomLinearLayout;
import com.facebook.xapp.messaging.audio.waveforms.VoiceVisualizer;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: AudioMessageWaveformsBubbleView.class */
public final class AudioMessageWaveformsBubbleView extends CustomLinearLayout {
    public int A00;
    public FbView A01;
    public 6Sn A02;
    public GPZ A03;
    public Integer A04;
    public boolean A05;
    public final float A06;
    public final TextView A07;
    public final TextView A08;
    public final GlyphView A09;
    public final VoiceVisualizer A0A;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AudioMessageWaveformsBubbleView(Context context) {
        this(context, null, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AudioMessageWaveformsBubbleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioMessageWaveformsBubbleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        11T.A0F(context, 1);
        this.A06 = 1.0f;
        A0D(2132541537);
        this.A04 = 0S2.A0N;
        VoiceVisualizer voiceVisualizer = (VoiceVisualizer) C09s.A01(this, 2131362151);
        this.A0A = voiceVisualizer;
        this.A09 = (GlyphView) C09s.A01(this, 2131362145);
        this.A08 = DKF.A0E(this, 2131362155);
        this.A07 = DKF.A0E(this, 2131362146);
        this.A01 = (FbView) C09s.A01(this, 2131362302);
        voiceVisualizer.A05 = true;
        this.A0A.A04(VoiceVisualizer.A0J, this.A06);
    }

    public /* synthetic */ AudioMessageWaveformsBubbleView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, DKG.A0A(attributeSet, i2), DKF.A01(i2, i));
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        GPZ gpz = this.A03;
        if (gpz == null) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (motionEvent == null || motionEvent.getAction() != 2) {
            return false;
        }
        GPV gpv = gpz.A00;
        1G2 r0 = GPV.A0S;
        return gpv.A08.A01(motionEvent);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        super.setBackgroundColor(i);
        this.A05 = 0AT.A02(i);
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [X.66T, java.lang.Object] */
    public final void setColor(int i) {
        this.A00 = i;
        this.A09.A00(i);
        this.A0A.A03(i);
        this.A08.setTextColor(i);
        TextView textView = this.A07;
        textView.setTextColor(i);
        int A08 = GOq.A08(this);
        ?? obj = new Object();
        obj.A00(A08);
        66S r0 = new 66S((66T) obj);
        int i2 = -1;
        if (!this.A05) {
            i2 = -16777216;
        }
        C6nd c6nd = new C6nd();
        c6nd.A07(r0);
        c6nd.A05(i2, false);
        int i3 = 255;
        if (!this.A05) {
            i3 = 51;
        }
        c6nd.setAlpha(i3);
        textView.setBackground(c6nd);
    }

    public final void setProgress(float f) {
        VoiceVisualizer voiceVisualizer = this.A0A;
        voiceVisualizer.A00 = f;
        voiceVisualizer.postInvalidateOnAnimation();
    }
}
