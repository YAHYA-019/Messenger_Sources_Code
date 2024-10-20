package com.facebook.messaging.rtc.incall.impl.effect.uicontrol;

import X.02L;
import X.0FI;
import X.11T;
import X.AbI;
import X.C01i;
import X.GWl;
import X.HVE;
import X.IZT;
import X.J9s;
import X.JDB;
import X.JFq;
import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.cameracore.mediapipeline.services.uicontrol.PickerConfiguration;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: PickerList.class */
public final class PickerList extends RecyclerView implements JFq {
    public GWl A00;
    public final C01i A01;
    public final HVE A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PickerList(Context context) {
        super(context, null);
        11T.A0F(context, 1);
        this.A01 = J9s.A01(this, 28);
        HVE hve = new HVE(this);
        this.A02 = hve;
        GWl.A00(hve, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PickerList(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        11T.A0G(context, 1, attributeSet);
        this.A01 = J9s.A01(this, 28);
        HVE hve = new HVE(this);
        this.A02 = hve;
        GWl.A00(hve, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PickerList(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        11T.A0G(context, 1, attributeSet);
        this.A01 = J9s.A01(this, 28);
        HVE hve = new HVE(this);
        this.A02 = hve;
        GWl.A00(hve, this);
    }

    @Override // X.JFq
    public /* bridge */ /* synthetic */ void CfQ(JDB jdb) {
        GWl gWl;
        int intValue;
        GWl gWl2;
        IZT izt = (IZT) jdb;
        int i = 0;
        11T.A0F(izt, 0);
        if (!izt.A03) {
            i = 8;
        }
        setVisibility(i);
        PickerConfiguration pickerConfiguration = izt.A00;
        if (pickerConfiguration != null && (gWl2 = this.A00) != null) {
            PickerConfiguration.ItemConfiguration[] itemConfigurationArr = pickerConfiguration.mItems;
            11T.A0A(itemConfigurationArr);
            List A09 = 02L.A09(itemConfigurationArr);
            ArrayList arrayList = gWl2.A01;
            arrayList.clear();
            arrayList.addAll(ImmutableList.copyOf((Collection) A09));
            gWl2.A07();
        }
        Integer num = izt.A01;
        if (num == null || (gWl = this.A00) == null || (intValue = num.intValue()) >= gWl.A01.size()) {
            return;
        }
        Integer num2 = gWl.A00;
        gWl.A00 = Integer.valueOf(intValue);
        gWl.A08(intValue);
        if (num2 != null) {
            gWl.A08(num2.intValue());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        int A06 = 0FI.A06(635103030);
        super.onAttachedToWindow();
        AbI.A1S(this, this.A01);
        0FI.A0C(-539116901, A06);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        int A06 = 0FI.A06(-15854073);
        AbI.A1X(this.A01);
        super.onDetachedFromWindow();
        0FI.A0C(-1856156248, A06);
    }
}
