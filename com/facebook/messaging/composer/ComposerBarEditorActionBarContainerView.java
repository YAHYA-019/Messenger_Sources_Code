package com.facebook.messaging.composer;

import X.0FI;
import X.0S2;
import X.6PF;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.litho.LithoView;
import com.facebook.messaging.composer.ComposerBarEditorActionBarContainerView;
import com.facebook.resources.ui.FbFrameLayout;
import com.facebook.resources.ui.FbLinearLayout;
import com.facebook.widget.text.BetterEditTextView;

/* loaded from: ComposerBarEditorActionBarContainerView.class */
public class ComposerBarEditorActionBarContainerView extends FbFrameLayout {
    public int A00;
    public int A01;
    public int A02;
    public Context A03;
    public FrameLayout A04;
    public FrameLayout A05;
    public LithoView A06;
    public LithoView A07;
    public ComposerActionBar A08;
    public ComposerActionButton A09;
    public ComposerActionButton A0A;
    public FbLinearLayout A0B;
    public FbLinearLayout A0C;
    public BetterEditTextView A0D;
    public Integer A0E;
    public int A0F;
    public final Runnable A0G;

    public ComposerBarEditorActionBarContainerView(Context context) {
        super(context);
        this.A0E = 0S2.A00;
        this.A0G = new Runnable() { // from class: X.6P3
            public static final String __redex_internal_original_name = "ComposerBarEditorActionBarContainerView$1";

            @Override // java.lang.Runnable
            public void run() {
                ComposerBarEditorActionBarContainerView composerBarEditorActionBarContainerView = ComposerBarEditorActionBarContainerView.this;
                if (composerBarEditorActionBarContainerView.A0E == 0S2.A00) {
                    composerBarEditorActionBarContainerView.A01();
                } else {
                    composerBarEditorActionBarContainerView.A0B.getLayoutParams().width = composerBarEditorActionBarContainerView.getMeasuredWidth() - composerBarEditorActionBarContainerView.A02;
                    composerBarEditorActionBarContainerView.A0B.requestLayout();
                }
                composerBarEditorActionBarContainerView.A0B.requestLayout();
                composerBarEditorActionBarContainerView.A08.requestLayout();
            }
        };
        A00(context);
    }

    public ComposerBarEditorActionBarContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A0E = 0S2.A00;
        this.A0G = new Runnable() { // from class: X.6P3
            public static final String __redex_internal_original_name = "ComposerBarEditorActionBarContainerView$1";

            @Override // java.lang.Runnable
            public void run() {
                ComposerBarEditorActionBarContainerView composerBarEditorActionBarContainerView = ComposerBarEditorActionBarContainerView.this;
                if (composerBarEditorActionBarContainerView.A0E == 0S2.A00) {
                    composerBarEditorActionBarContainerView.A01();
                } else {
                    composerBarEditorActionBarContainerView.A0B.getLayoutParams().width = composerBarEditorActionBarContainerView.getMeasuredWidth() - composerBarEditorActionBarContainerView.A02;
                    composerBarEditorActionBarContainerView.A0B.requestLayout();
                }
                composerBarEditorActionBarContainerView.A0B.requestLayout();
                composerBarEditorActionBarContainerView.A08.requestLayout();
            }
        };
        A00(context);
    }

    public ComposerBarEditorActionBarContainerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A0E = 0S2.A00;
        this.A0G = new Runnable() { // from class: X.6P3
            public static final String __redex_internal_original_name = "ComposerBarEditorActionBarContainerView$1";

            @Override // java.lang.Runnable
            public void run() {
                ComposerBarEditorActionBarContainerView composerBarEditorActionBarContainerView = ComposerBarEditorActionBarContainerView.this;
                if (composerBarEditorActionBarContainerView.A0E == 0S2.A00) {
                    composerBarEditorActionBarContainerView.A01();
                } else {
                    composerBarEditorActionBarContainerView.A0B.getLayoutParams().width = composerBarEditorActionBarContainerView.getMeasuredWidth() - composerBarEditorActionBarContainerView.A02;
                    composerBarEditorActionBarContainerView.A0B.requestLayout();
                }
                composerBarEditorActionBarContainerView.A0B.requestLayout();
                composerBarEditorActionBarContainerView.A08.requestLayout();
            }
        };
        A00(context);
    }

    private void A00(Context context) {
        this.A03 = context;
        LayoutInflater.from(context).inflate(2132541730, (ViewGroup) this, true);
        this.A08 = (ComposerActionBar) findViewById(2131363229);
        this.A0B = (FbLinearLayout) findViewById(2131363797);
        this.A0C = (FbLinearLayout) findViewById(2131363795);
        this.A09 = (ComposerActionButton) findViewById(2131363249);
        this.A0A = (ComposerActionButton) findViewById(2131363251);
        this.A0D = (BetterEditTextView) findViewById(2131367952);
        this.A04 = (FrameLayout) findViewById(2131362160);
        this.A06 = (LithoView) findViewById(2131365521);
        this.A07 = (LithoView) findViewById(2131368215);
        this.A05 = (FrameLayout) findViewById(2131365522);
        this.A02 = ((ViewGroup.MarginLayoutParams) this.A0C.getLayoutParams()).rightMargin;
        A01();
        FbLinearLayout fbLinearLayout = this.A0C;
        if (fbLinearLayout != null) {
            fbLinearLayout.addOnLayoutChangeListener(new 6PF(this));
        }
    }

    public void A01() {
        ViewGroup.LayoutParams layoutParams = this.A0B.getLayoutParams();
        int measuredWidth = getMeasuredWidth();
        this.A08.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        layoutParams.width = (measuredWidth - this.A08.getMeasuredWidth()) - this.A02;
        this.A0B.requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        int A06 = 0FI.A06(1465232264);
        removeCallbacks(this.A0G);
        super.onDetachedFromWindow();
        0FI.A0C(2028637614, A06);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = i3 - i;
        if (this.A0F != i5) {
            post(this.A0G);
        }
        this.A0F = i5;
    }
}
