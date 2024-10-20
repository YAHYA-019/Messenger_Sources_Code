package com.facebook.contacts.picker;

import X.0NA;
import X.0S2;
import X.AoS;
import X.AoU;
import X.C09s;
import X.Cf5;
import X.FXr;
import X.RkI;
import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.ProgressBar;
import com.facebook.common.time.RealtimeSinceBootClock;
import com.facebook.fbui.widget.glyph.GlyphView;
import com.facebook.widget.CustomFrameLayout;
import com.facebook.widget.text.BetterButton;

/* loaded from: ContactPickerSingleTapActionButton.class */
public class ContactPickerSingleTapActionButton extends CustomFrameLayout {
    public int A00;
    public AnimatorSet A01;
    public ProgressBar A02;
    public GlyphView A03;
    public BetterButton A04;
    public Integer A05;
    public Cf5 A06;

    public ContactPickerSingleTapActionButton(Context context) {
        super(context);
        A01();
    }

    public ContactPickerSingleTapActionButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A01();
    }

    public ContactPickerSingleTapActionButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A01();
    }

    public static SingleTapActionConfig A00(ContactPickerSingleTapActionButton contactPickerSingleTapActionButton) {
        AoS aoS = contactPickerSingleTapActionButton.A06;
        SingleTapActionConfig singleTapActionConfig = null;
        if (aoS != null) {
            if (aoS instanceof AoS) {
                singleTapActionConfig = aoS.A05;
            } else if (aoS instanceof AoU) {
                return ((AoU) aoS).A00;
            }
        }
        return singleTapActionConfig;
    }

    private void A01() {
        A0U(2132542899);
        this.A02 = (ProgressBar) C09s.A01(this, 2131368244);
        this.A03 = (GlyphView) C09s.A01(this, 2131368245);
        this.A04 = (BetterButton) C09s.A01(this, 2131367410);
        A03(this, 0S2.A00, false);
        View.OnClickListener A02 = FXr.A02(this, 26);
        this.A04.setOnClickListener(A02);
        setOnClickListener(A02);
        this.A00 = 0NA.A01(getContext(), 2130971725, 0);
    }

    private void A02(View view, int i, boolean z) {
        float f = 1.0f;
        if (z) {
            f = 0.0f;
        }
        view.setVisibility(0);
        AlphaAnimation alphaAnimation = new AlphaAnimation(f, 1.0f - f);
        alphaAnimation.setAnimationListener(new RkI(view, this, i, z));
        alphaAnimation.setDuration(300L);
        view.startAnimation(alphaAnimation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00eb, code lost:
    
        if (r306 != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x02d1, code lost:
    
        if (r305 != null) goto L63;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A03(com.facebook.contacts.picker.ContactPickerSingleTapActionButton r301, java.lang.Integer r302, boolean r303) {
        /*
            Method dump skipped, instructions count: 773
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.contacts.picker.ContactPickerSingleTapActionButton.A03(com.facebook.contacts.picker.ContactPickerSingleTapActionButton, java.lang.Integer, boolean):void");
    }

    public void A0V(Cf5 cf5) {
        this.A06 = cf5;
        if (cf5.A02()) {
            A03(this, 0S2.A0N, false);
        } else {
            RealtimeSinceBootClock.A00.now();
            A03(this, 0S2.A00, false);
        }
    }
}
