package com.facebook.messaging.audio.playback.view;

import X.0Pz;
import X.0S2;
import X.11T;
import X.1BK;
import X.1BY;
import X.1Bn;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.4YU;
import X.7zM;
import X.AbstractC2326GOr;
import X.AnonymousClass001;
import X.C09s;
import X.DKF;
import X.DKG;
import X.GOo;
import X.JEk;
import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.TextView;
import com.facebook.messaging.threadview.scheme.interfaces.ThreadViewColorScheme;
import com.facebook.resources.ui.FbView;
import com.facebook.widget.CustomLinearLayout;
import com.facebook.widget.FbImageView;
import com.facebook.xapp.messaging.audio.waveforms.VoiceVisualizer;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: AudioPlayerWaveformBubbleView.class */
public final class AudioPlayerWaveformBubbleView extends CustomLinearLayout {
    public JEk A00;
    public ThreadViewColorScheme A01;
    public Integer A02;
    public boolean A03;
    public boolean A04;
    public int A05;
    public Drawable A06;
    public Drawable A07;
    public Drawable A08;
    public final TextView A09;
    public final TextView A0A;
    public final 1Br A0B;
    public final 1Br A0C;
    public final 1Br A0D;
    public final FbView A0E;
    public final FbImageView A0F;
    public final VoiceVisualizer A0G;
    public final long A0H;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AudioPlayerWaveformBubbleView(Context context) {
        this(context, null, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AudioPlayerWaveformBubbleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioPlayerWaveformBubbleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        11T.A0F(context, 1);
        this.A0B = 1Bq.A00(68024);
        this.A0C = 7zM.A0U();
        this.A0D = 1Bu.A01(context, 16979);
        this.A0H = AnonymousClass001.A05(1Bn.A0E(4YU.A08(this), (1BY) null, 65857));
        this.A02 = 0S2.A0N;
        this.A05 = -1;
        A0D(2132541543);
        VoiceVisualizer voiceVisualizer = (VoiceVisualizer) C09s.A01(this, 2131362151);
        this.A0G = voiceVisualizer;
        this.A0F = (FbImageView) C09s.A01(this, 2131362145);
        this.A0A = DKF.A0E(this, 2131362155);
        this.A09 = DKF.A0E(this, 2131362146);
        this.A0E = (FbView) C09s.A01(this, 2131362302);
        voiceVisualizer.A05 = true;
    }

    public /* synthetic */ AudioPlayerWaveformBubbleView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, DKG.A0A(attributeSet, i2), DKF.A01(i2, i));
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0188, code lost:
    
        if (r304 == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0205, code lost:
    
        if (r304 == null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0066, code lost:
    
        if (r0.length() > 0) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A00(com.facebook.messaging.audio.playback.view.AudioPlayerWaveformBubbleView r301) {
        /*
            Method dump skipped, instructions count: 723
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.audio.playback.view.AudioPlayerWaveformBubbleView.A00(com.facebook.messaging.audio.playback.view.AudioPlayerWaveformBubbleView):void");
    }

    private final void A01(boolean z) {
        AnimationDrawable animationDrawable;
        if (this.A02 == 0S2.A00 && (this.A08 instanceof AnimationDrawable)) {
            FbImageView fbImageView = this.A0F;
            fbImageView.setImageDrawable(null);
            fbImageView.setBackground(this.A08);
            Drawable drawable = this.A08;
            if (!(drawable instanceof AnimationDrawable) || (animationDrawable = (AnimationDrawable) drawable) == null) {
                return;
            }
            animationDrawable.start();
            return;
        }
        Drawable drawable2 = this.A08;
        if (drawable2 instanceof AnimationDrawable) {
            AnimationDrawable animationDrawable2 = (AnimationDrawable) drawable2;
            if (animationDrawable2 != null) {
                animationDrawable2.start();
            }
            this.A0F.setBackground(null);
        }
        FbImageView fbImageView2 = this.A0F;
        Integer num = this.A02;
        Integer num2 = 0S2.A01;
        fbImageView2.setImageDrawable(num == num2 ? this.A06 : this.A07);
        Integer num3 = this.A02;
        Context context = getContext();
        int i = 2131952944;
        if (num3 == num2) {
            i = 2131952943;
        }
        GOo.A16(context, fbImageView2, i);
        if (z && fbImageView2.isFocused()) {
            fbImageView2.sendAccessibilityEvent(8);
        }
    }

    public final void A0E(long j) {
        String A0f;
        if (j == -1) {
            A0f = getResources().getString(2131952947);
        } else {
            if (j == -2) {
                A0f = 0Pz.A0J(AbstractC2326GOr.A0f(this.A0H), '+');
                this.A0A.setText(A0f);
            }
            A0f = AbstractC2326GOr.A0f(j);
        }
        11T.A0A(A0f);
        this.A0A.setText(A0f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0092, code lost:
    
        if (r310 == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0025, code lost:
    
        if (r310 == null) goto L6;
     */
    /* JADX WARN: Type inference failed for: r0v20, types: [X.66T, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0F(X.66S r302, java.lang.Integer r303, int r304, int r305, boolean r306, boolean r307) {
        /*
            Method dump skipped, instructions count: 448
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.audio.playback.view.AudioPlayerWaveformBubbleView.A0F(X.66S, java.lang.Integer, int, int, boolean, boolean):void");
    }

    public final void A0G(Integer num) {
        boolean z = true;
        boolean A1V = 1BK.A1V(this.A02, num);
        this.A02 = num;
        A01(A1V);
        A00(this);
        if (num != 0S2.A01) {
            z = false;
        }
        setKeepScreenOn(z);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        11T.A0F(motionEvent, 0);
        JEk jEk = this.A00;
        if (jEk == null || !jEk.C27(motionEvent)) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return true;
    }

    public final void setProgress(float f) {
        VoiceVisualizer voiceVisualizer = this.A0G;
        voiceVisualizer.A00 = f;
        voiceVisualizer.postInvalidateOnAnimation();
    }
}
