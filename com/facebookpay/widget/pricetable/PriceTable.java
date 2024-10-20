package com.facebookpay.widget.pricetable;

import X.0G2;
import X.11T;
import X.C06014fk;
import X.C06z;
import X.C1oo;
import X.JQx;
import X.LBg;
import X.M9M;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TableLayout;

/* loaded from: PriceTable.class */
public final class PriceTable extends TableLayout {
    public static final /* synthetic */ C06z[] A06 = {JQx.A16(PriceTable.class, "priceTableRowDataList", "getPriceTableRowDataList()Ljava/util/List;")};
    public boolean A00;
    public boolean A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final 0G2 A05;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PriceTable(Context context) {
        this(context, null);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PriceTable(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        11T.A0F(context, 1);
        this.A01 = true;
        this.A05 = new M9M(this, 75);
        C06014fk.A04();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(2132607327, C1oo.A0t);
        this.A03 = obtainStyledAttributes.getDimensionPixelOffset(3, 0);
        this.A04 = obtainStyledAttributes.getDimensionPixelOffset(4, 0);
        this.A02 = obtainStyledAttributes.getDimensionPixelOffset(2, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        int dimensionPixelOffset2 = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        setPadding(dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset, dimensionPixelOffset2);
        obtainStyledAttributes.recycle();
        setColumnShrinkable(1, true);
        setColumnStretchable(2, true);
        LBg.A01(this, 2);
        setImportantForAccessibility(2);
    }
}
