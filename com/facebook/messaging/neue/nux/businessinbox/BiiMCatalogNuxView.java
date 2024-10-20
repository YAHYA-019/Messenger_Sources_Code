package com.facebook.messaging.neue.nux.businessinbox;

import X.7zO;
import X.AbH;
import X.C00i;
import X.CZF;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.litho.LithoView;
import com.facebook.widget.CustomLinearLayout;

/* loaded from: BiiMCatalogNuxView.class */
public class BiiMCatalogNuxView extends CustomLinearLayout implements CallerContextable {
    public View A00;
    public C00i A01;
    public C00i A02;
    public BiiMCatalogNuxFragment A03;
    public final View.OnClickListener A04;
    public final View.OnClickListener A05;
    public final C00i A06;

    public BiiMCatalogNuxView(Context context) {
        this(context, null);
    }

    public BiiMCatalogNuxView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A05 = CZF.A00(this, 17);
        this.A04 = CZF.A00(this, 18);
        this.A02 = AbH.A0Q();
        this.A01 = AbH.A0S();
        LithoView A0V = 7zO.A0V(context);
        this.A00 = A0V;
        addView(A0V, new ViewGroup.LayoutParams(-1, -1));
        this.A06 = AbH.A0N();
    }
}
