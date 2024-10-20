package com.facebook.messaging.search.singlepickerview;

import X.0NA;
import X.7zL;
import X.AbF;
import X.AbG;
import X.C00i;
import X.C09s;
import X.CZF;
import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import com.facebook.fbui.widget.glyph.GlyphView;
import com.facebook.widget.CustomLinearLayout;
import com.mapbox.mapboxsdk.R;

/* loaded from: SinglePickerSearchView.class */
public class SinglePickerSearchView extends CustomLinearLayout {
    public static final LinearLayout.LayoutParams A05 = new LinearLayout.LayoutParams(0, 0);
    public View.OnClickListener A00;
    public SearchView A01;
    public View A02;
    public GlyphView A03;
    public C00i A04;

    public SinglePickerSearchView(Context context) {
        super(context);
        A00();
    }

    public SinglePickerSearchView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }

    public SinglePickerSearchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00();
    }

    private void A00() {
        Context context = getContext();
        LayoutInflater.from(0NA.A06(context, 2130968601, 2132608305)).inflate(2132543353, this);
        this.A01 = (SearchView) C09s.A01(this, 2131367193);
        View.OnClickListener A00 = CZF.A00(this, 65);
        this.A04 = 7zL.A0R(context, 16979);
        GlyphView glyphView = (GlyphView) C09s.A01(this, 2131367139);
        this.A03 = glyphView;
        glyphView.A00(AbF.A0p(this.A04).Azp());
        this.A03.setOnClickListener(A00);
        TextView A09 = AbG.A09(this, 2131367189);
        A09.setTextSize(2, 16.0f);
        this.A02 = A09;
        C09s.A01(this, 2131367180).setLayoutParams(A05);
        setGravity(16);
        setElevation(getResources().getDimension(R.dimen.mapbox_four_dp));
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.A01.clearFocus();
    }
}
