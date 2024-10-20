package com.facebook.messaging.composer;

import X.0S2;
import X.11T;
import X.1BQ;
import X.1Bi;
import X.2yD;
import X.6P0;
import X.C00i;
import X.C1u2;
import X.C1u3;
import X.C1u4;
import X.C2rp;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.widget.CustomFrameLayout;

/* loaded from: ComposerBarLeftPrimaryButtonsView.class */
public class ComposerBarLeftPrimaryButtonsView extends CustomFrameLayout {
    public ComposerActionButton A00;
    public ComposerActionButton A01;
    public ComposerActionButton A02;
    public ComposerActionButton A03;
    public Integer A04;
    public final C00i A05;

    public ComposerBarLeftPrimaryButtonsView(Context context) {
        super(context);
        this.A05 = 1BQ.A02(68024);
        A00(context);
    }

    public ComposerBarLeftPrimaryButtonsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A05 = new 1BQ(68024);
        A00(context);
    }

    public ComposerBarLeftPrimaryButtonsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A05 = 1BQ.A02(68024);
        A00(context);
    }

    private void A00(Context context) {
        boolean AZk = ((2yD) ((6P0) this.A05.get()).A00.A00.get()).AZk(36322061680985134L);
        LayoutInflater.from(context).inflate(2132541731, (ViewGroup) this, true);
        this.A03 = (ComposerActionButton) findViewById(2131363255);
        this.A00 = (ComposerActionButton) findViewById(2131363244);
        this.A02 = (ComposerActionButton) findViewById(2131363248);
        C1u2 c1u2 = (C1u2) 1Bi.A03(16839);
        ComposerActionButton composerActionButton = this.A00;
        C1u3 c1u3 = C1u3.A1w;
        C1u4 c1u4 = C1u4.SIZE_32;
        composerActionButton.setImageResource(c1u2.A04(c1u3, c1u4));
        this.A03.setImageResource(c1u2.A04(AZk ? C1u3.A1x : C1u3.A2b, c1u4));
        if (AZk) {
            this.A03.setRotation(45.0f);
        }
        this.A02.setImageResource(c1u2.A04(C1u3.A6a, c1u4));
        this.A01 = (ComposerActionButton) findViewById(2131363245);
        ComposerActionButton composerActionButton2 = this.A03;
        Integer num = 0S2.A01;
        C2rp.A02(composerActionButton2, num);
        C2rp.A02(this.A01, num);
        C2rp.A02(this.A00, num);
        C2rp.A02(this.A02, num);
    }

    @Override // android.view.View
    public void clearAnimation() {
        super.clearAnimation();
        this.A03.clearAnimation();
        this.A00.clearAnimation();
        this.A01.clearAnimation();
        ComposerActionButton composerActionButton = this.A02;
        11T.A0F(composerActionButton, 0);
        composerActionButton.clearAnimation();
        composerActionButton.setRotation(0.0f);
        composerActionButton.setScaleX(1.0f);
        composerActionButton.setScaleY(1.0f);
        composerActionButton.setTranslationY(0.0f);
    }
}
