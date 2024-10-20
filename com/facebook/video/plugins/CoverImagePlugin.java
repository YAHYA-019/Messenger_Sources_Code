package com.facebook.video.plugins;

import X.11T;
import X.4gJ;
import X.6TI;
import X.6dZ;
import X.82P;
import X.C09s;
import X.C6db;
import android.content.Context;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.drawee.fbpipeline.FbDraweeView;

/* loaded from: CoverImagePlugin.class */
public class CoverImagePlugin extends 6dZ {
    public boolean A00;
    public final 82P A01;
    public final C6db A02;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CoverImagePlugin(Context context, CallerContext callerContext) {
        this(context, callerContext, null);
        11T.A0F(context, 1);
        11T.A0F(callerContext, 2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CoverImagePlugin(Context context, CallerContext callerContext, 4gJ r304) {
        this(context, callerContext, r304, 2132541787);
        11T.A0F(context, 1);
        11T.A0F(callerContext, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.6db] */
    public CoverImagePlugin(Context context, CallerContext callerContext, 4gJ r304, int i) {
        super(context, callerContext, r304);
        11T.A0F(context, 1);
        11T.A0F(callerContext, 2);
        this.A02 = new Object() { // from class: X.6db
        };
        this.A01 = new 82P(this, 28);
        A0C(i);
        ((6dZ) this).A02 = (FbDraweeView) C09s.A01(this, 2131363421);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A0M() {
        A0i(this.A01);
        6dZ.A05(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A0P() {
        A0i(this.A01);
        super.A0P();
    }

    public void A0X(6TI r302) {
        super.A0X(r302);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A0Y(6TI r302) {
        super.A0Y(r302);
        A0h(this.A01);
    }

    public void A0e(6TI r302, boolean z) {
        11T.A0F(r302, 0);
        super.A0e(r302, z);
    }
}
