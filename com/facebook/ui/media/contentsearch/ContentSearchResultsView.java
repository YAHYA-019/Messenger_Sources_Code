package com.facebook.ui.media.contentsearch;

import X.1Bn;
import X.1Hv;
import X.2XA;
import X.C09s;
import X.C1oo;
import X.GWm;
import X.GWz;
import X.GX3;
import X.GXC;
import X.GXE;
import X.HBG;
import X.HY5;
import X.HY6;
import X.HY7;
import X.HY9;
import X.Hey;
import X.Hmu;
import X.Ho3;
import X.HyF;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.facebook.resources.ui.FbLinearLayout;
import com.facebook.widget.CustomFrameLayout;
import com.facebook.widget.listview.EmptyListViewItem;
import com.facebook.widget.recyclerview.BetterRecyclerView;
import com.mapbox.mapboxsdk.R;

/* loaded from: ContentSearchResultsView.class */
public class ContentSearchResultsView extends CustomFrameLayout {
    public int A00;
    public Resources A01;
    public FbLinearLayout A02;
    public HY5 A03;
    public HY6 A04;
    public HyF A05;
    public HY7 A06;
    public GWm A07;
    public HBG A08;
    public Hey A09;
    public EmptyListViewItem A0A;
    public BetterRecyclerView A0B;
    public boolean A0C;
    public int A0D;
    public int A0E;
    public 2XA A0F;

    public ContentSearchResultsView(Context context) {
        super(context);
        this.A06 = null;
        this.A0D = 0;
        this.A0E = 2;
        this.A00 = -1;
        A00(context, null);
    }

    public ContentSearchResultsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A06 = null;
        this.A0D = 0;
        this.A0E = 2;
        this.A00 = -1;
        A00(context, attributeSet);
    }

    public ContentSearchResultsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A06 = null;
        this.A0D = 0;
        this.A0E = 2;
        this.A00 = -1;
        A00(context, attributeSet);
    }

    private void A00(Context context, AttributeSet attributeSet) {
        int i;
        int i2;
        TypedArray obtainStyledAttributes;
        this.A07 = (GWm) 1Bn.A0H(GWm.class, (Class) null);
        this.A09 = (Hey) 1Hv.A03(context, Hey.class, (Class) null);
        this.A01 = getResources();
        if (attributeSet != null) {
            obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1oo.A0Q);
            try {
                this.A0D = obtainStyledAttributes.getInt(1, 0);
                this.A0E = obtainStyledAttributes.getInt(5, 2);
                this.A07.A00 = this.A0D;
                this.A00 = obtainStyledAttributes.getDimensionPixelSize(0, -1);
                obtainStyledAttributes.recycle();
            } finally {
            }
        }
        if (this.A0D == 1) {
            A0U(2132542061);
            this.A0F = new StaggeredGridLayoutManager(this.A0E, 1);
        } else {
            int i3 = 2132541767;
            if (((Ho3) 1Bn.A0H(Ho3.class, (Class) null)).A00()) {
                i3 = 2132541766;
            }
            A0U(i3);
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
            this.A0F = linearLayoutManager;
            linearLayoutManager.A1p(0);
        }
        this.A0B = (BetterRecyclerView) C09s.A01(this, 2131366942);
        this.A0A = (EmptyListViewItem) C09s.A01(this, 2131363878);
        this.A02 = (FbLinearLayout) C09s.A01(this, 2131363504);
        this.A0B.A1D(this.A0F);
        this.A0B.A16(this.A07);
        int i4 = this.A00;
        if (i4 != -1) {
            this.A00 = i4;
            View A01 = C09s.A01(this, 2131363347);
            ViewGroup.LayoutParams layoutParams = A01.getLayoutParams();
            layoutParams.height = this.A00;
            A01.setLayoutParams(layoutParams);
        }
        GWm gWm = this.A07;
        gWm.A08 = new Hmu(this);
        gWm.A09 = new HY9(this);
        this.A0B.A1F(new GXC(this, 7));
        int dimensionPixelSize = this.A01.getDimensionPixelSize(2132279309);
        int dimensionPixelSize2 = this.A01.getDimensionPixelSize(R.dimen.mapbox_eight_dp);
        int dimensionPixelOffset = this.A01.getDimensionPixelOffset(R.dimen.mapbox_eight_dp);
        if (attributeSet != null) {
            obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1oo.A0Q);
            try {
                dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(3, dimensionPixelSize2);
                i = obtainStyledAttributes.getDimensionPixelSize(6, dimensionPixelOffset);
                i2 = obtainStyledAttributes.getDimensionPixelSize(4, 0);
                dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(2, dimensionPixelOffset);
            } finally {
            }
        } else {
            i = dimensionPixelOffset;
            i2 = 0;
        }
        setPadding(i2, i, i2, 0);
        this.A0B.A1B(this.A0D == 1 ? new GWz(this, dimensionPixelSize) : new GX3(this, dimensionPixelSize2, dimensionPixelSize, 1));
        this.A0B.A14.add(new GXE(this));
        String string = this.A01.getString(2131954915);
        this.A0A.A0E(string);
        this.A0A.setContentDescription(string);
    }
}
