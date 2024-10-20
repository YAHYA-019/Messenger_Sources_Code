package X;

import android.view.Choreographer;
import com.meta.metaai.components.voice.animation.transrcipt.widget.DisabledHorizontalScrollView;
import com.meta.metaai.components.voice.animation.transrcipt.widget.UserInputTextView;

/* loaded from: F6m.class */
public final class F6m {
    public float A00;
    public float A01;
    public float A02;
    public long A03;
    public boolean A04;
    public final float A05;
    public final float A06;
    public final float A07;
    public final float A08;
    public final FXH A09;
    public final DisabledHorizontalScrollView A0A;
    public final UserInputTextView A0B;

    /* JADX WARN: Multi-variable type inference failed */
    public F6m(DisabledHorizontalScrollView disabledHorizontalScrollView, UserInputTextView userInputTextView, float f, float f2, float f3, float f4, float f5) {
        11T.A0F(disabledHorizontalScrollView, 1);
        this.A0A = disabledHorizontalScrollView;
        this.A0B = userInputTextView;
        this.A06 = f2;
        this.A07 = f3;
        this.A08 = f4;
        this.A05 = f5;
        this.A00 = -1.0f;
        this.A09 = new FXH(this);
        disabledHorizontalScrollView.A01 = f;
        disabledHorizontalScrollView.A00 = f2;
        disabledHorizontalScrollView.addOnLayoutChangeListener(new FXz(this, 2));
        userInputTextView.addOnLayoutChangeListener(new FXz(this, 3));
        userInputTextView.A00 = new Egq(this);
    }

    public static final void A00(F6m f6m) {
        if (f6m.A04) {
            return;
        }
        DQw dQw = f6m.A0B;
        if (dQw.getVisibility() != 0 || DKC.A01(dQw.getTranslationX(), f6m.A02) < 0.5f) {
            return;
        }
        f6m.A04 = true;
        f6m.A03 = 0L;
        f6m.A00 = -1.0f;
        Choreographer.getInstance().postFrameCallback(f6m.A09);
    }
}
