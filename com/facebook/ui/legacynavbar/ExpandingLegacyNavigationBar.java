package com.facebook.ui.legacynavbar;

import X.11T;
import X.AnonymousClass524;
import X.C2137Deq;
import X.DKF;
import X.DKG;
import X.FXs;
import android.content.Context;
import android.util.AttributeSet;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: ExpandingLegacyNavigationBar.class */
public class ExpandingLegacyNavigationBar extends LegacyNavigationBar {
    public C2137Deq A00;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ExpandingLegacyNavigationBar(Context context) {
        this(context, null, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ExpandingLegacyNavigationBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExpandingLegacyNavigationBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        11T.A0F(context, 1);
        if (AnonymousClass524.A01(context, true)) {
            return;
        }
        FXs.A01(this.A0F, this, context, 76);
    }

    public /* synthetic */ ExpandingLegacyNavigationBar(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, DKG.A0A(attributeSet, i2), DKF.A01(i2, i));
    }

    @Override // com.facebook.ui.legacynavbar.LegacyNavigationBar, X.GL6
    public void CvV(CharSequence charSequence) {
        C2137Deq c2137Deq;
        super.CvV(charSequence);
        if (charSequence == null || (c2137Deq = this.A00) == null) {
            return;
        }
        c2137Deq.A0G(charSequence);
    }
}
