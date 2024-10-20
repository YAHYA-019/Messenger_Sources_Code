package com.facebookpay.widget.banner;

import X.0G2;
import X.0Q8;
import X.11T;
import X.4YU;
import X.C06014fk;
import X.DKG;
import X.KOv;
import X.L9O;
import X.LBg;
import X.M9M;
import X.Qq8;
import X.RbR;
import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebookpay.widget.accessibility.AccessibleTextView;

/* loaded from: FBPayBanner.class */
public final class FBPayBanner extends FrameLayout {
    public ImageView A00;
    public TextView A01;
    public ConstraintLayout A02;
    public AccessibleTextView A03;
    public final 0G2 A04;
    public final 0G2 A05;
    public final 0G2 A06;
    public final 0G2 A07;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FBPayBanner(Context context) {
        this(context, null);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FBPayBanner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FBPayBanner(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        11T.A0F(context, 1);
        this.A05 = new M9M(this, 2);
        this.A06 = new M9M(this, 3);
        this.A07 = new M9M(this, 4);
        this.A04 = new M9M(this, 5);
        View.inflate(context, 2132541979, this);
        this.A00 = (ImageView) DKG.A0B(this, 2131364519);
        this.A01 = (TextView) DKG.A0B(this, 2131366672);
        this.A03 = (AccessibleTextView) DKG.A0B(this, 2131367209);
        this.A02 = (ConstraintLayout) DKG.A0B(this, 2131362379);
        TextView textView = this.A01;
        String str = "primaryTextView";
        if (textView != null) {
            C06014fk.A04();
            LBg.A04(textView, 2132607410, false);
            TextView textView2 = this.A01;
            if (textView2 != null) {
                L9O.A01(textView2, KOv.A06);
                AccessibleTextView accessibleTextView = this.A03;
                str = "secondaryTextView";
                if (accessibleTextView != null) {
                    L9O.A01(accessibleTextView, KOv.A07);
                    AccessibleTextView accessibleTextView2 = this.A03;
                    if (accessibleTextView2 != null) {
                        accessibleTextView2.setMovementMethod(new LinkMovementMethod());
                        Context A08 = 4YU.A08(this);
                        ConstraintLayout constraintLayout = this.A02;
                        str = "bannerContainer";
                        if (constraintLayout != null) {
                            RbR.A02(A08, constraintLayout, Qq8.A02, 59, 60);
                            ConstraintLayout constraintLayout2 = this.A02;
                            if (constraintLayout2 != null) {
                                LBg.A03(constraintLayout2, 32, false);
                                return;
                            }
                        }
                    }
                }
            }
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        ConstraintLayout constraintLayout = this.A02;
        if (constraintLayout == null) {
            11T.A0L("bannerContainer");
            throw 0Q8.createAndThrow();
        }
        constraintLayout.setVisibility(i);
    }
}
