package com.facebook.video.plugins;

import X.11T;
import X.1BK;
import X.1Bn;
import X.1Bq;
import X.1Br;
import X.1Hv;
import X.6TI;
import X.C09s;
import X.C6d6;
import X.DKF;
import X.DKG;
import X.ErN;
import X.F5h;
import X.GPl;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: PopoutButtonPlugin.class */
public final class PopoutButtonPlugin extends C6d6 {
    public 6TI A00;
    public final ImageView A01;
    public final 1Br A02;
    public final 1Br A03;
    public final ErN A04;
    public final F5h A05;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PopoutButtonPlugin(Context context) {
        this(context, null, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PopoutButtonPlugin(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PopoutButtonPlugin(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        11T.A0F(context, 1);
        this.A04 = (ErN) 1Bn.A0A(99560);
        this.A05 = (F5h) 1Hv.A02(context, 98759);
        this.A03 = 1BK.A0C();
        this.A02 = 1Bq.A00(66388);
        A0C(2132543133);
        this.A01 = (ImageView) C09s.A01(this, 2131366616);
        A0h(new GPl(this, 80));
    }

    public /* synthetic */ PopoutButtonPlugin(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, DKG.A0A(attributeSet, i2), DKF.A01(i2, i));
    }

    @Override // X.C6d6
    public String A0H() {
        return "PopoutButtonPlugin";
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00d8, code lost:
    
        if (r313 != null) goto L22;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C6d6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0e(X.6TI r302, boolean r303) {
        /*
            Method dump skipped, instructions count: 492
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.video.plugins.PopoutButtonPlugin.A0e(X.6TI, boolean):void");
    }
}
