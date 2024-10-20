package com.google.android.material.theme;

import X.6LS;
import X.6Lc;
import X.6Ld;
import X.DLW;
import X.DPc;
import X.DQw;
import X.DRF;
import X.FFz;
import X.JZw;
import X.JZy;
import X.L6H;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: MaterialComponentsViewInflater.class */
public class MaterialComponentsViewInflater extends FFz {
    public DLW A02(Context context, AttributeSet attributeSet) {
        return new JZw(context, attributeSet);
    }

    public DPc A03(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    public AppCompatCheckBox A04(Context context, AttributeSet attributeSet) {
        AppCompatCheckBox appCompatCheckBox = new AppCompatCheckBox(6LS.A00(context, attributeSet, 2130969059, 2132608588), attributeSet, 2130969059);
        Context context2 = appCompatCheckBox.getContext();
        TypedArray A00 = 6Lc.A00(context2, attributeSet, 6Ld.A0G, new int[0], 2130969059, 2132608588);
        if (A00.hasValue(0)) {
            appCompatCheckBox.setButtonTintList(L6H.A00(context2, A00, 0));
        }
        ((JZy) appCompatCheckBox).A01 = A00.getBoolean(1, false);
        A00.recycle();
        return appCompatCheckBox;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [android.widget.CompoundButton, X.Ja6, android.view.View, X.DRF] */
    public DRF A05(Context context, AttributeSet attributeSet) {
        ?? drf = new DRF(6LS.A00(context, attributeSet, 2130971449, 2132608589), attributeSet);
        Context context2 = drf.getContext();
        TypedArray A00 = 6Lc.A00(context2, attributeSet, 6Ld.A0H, new int[0], 2130971449, 2132608589);
        if (A00.hasValue(0)) {
            drf.setButtonTintList(L6H.A00(context2, A00, 0));
        }
        drf.A01 = A00.getBoolean(1, false);
        A00.recycle();
        return drf;
    }

    public DQw A06(Context context, AttributeSet attributeSet) {
        return new MaterialTextView(context, attributeSet);
    }
}
