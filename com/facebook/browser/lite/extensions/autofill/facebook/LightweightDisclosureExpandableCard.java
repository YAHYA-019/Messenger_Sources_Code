package com.facebook.browser.lite.extensions.autofill.facebook;

import X.0AK;
import X.0FI;
import X.11T;
import X.4YU;
import X.7zM;
import X.C11474wl;
import X.JZ2;
import X.KOR;
import X.LKO;
import X.M6M;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.core.widget.NestedScrollView;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: LightweightDisclosureExpandableCard.class */
public final class LightweightDisclosureExpandableCard extends LinearLayout {
    public Bundle A00;
    public FrameLayout A01;
    public C11474wl A02;
    public Function1 A03;
    public final ImageView A04;
    public final LinearLayout A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LightweightDisclosureExpandableCard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        11T.A0F(context, 1);
        View.inflate(context, 2132542395, this);
        this.A04 = (ImageView) 7zM.A0H(this, 2131363943);
        this.A05 = (LinearLayout) 7zM.A0H(this, 2131363951);
        LKO.A01(7zM.A0H(this, 2131363950), this, 49);
    }

    public /* synthetic */ LightweightDisclosureExpandableCard(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    public final void A00(List list) {
        11T.A0F(list, 0);
        LinearLayout linearLayout = this.A05;
        linearLayout.removeAllViews();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            KOR kor = (KOR) it.next();
            linearLayout.addView(new JZ2(4YU.A08(this), this.A00, this.A02, kor, this.A03));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        FrameLayout frameLayout;
        Object obj;
        int A06 = 0FI.A06(-776790284);
        super.onAttachedToWindow();
        Iterator it = 0AK.A0A(getParent(), M6M.A00).iterator();
        while (true) {
            frameLayout = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if ((obj instanceof ScrollView) || (obj instanceof NestedScrollView)) {
                break;
            }
        }
        if (obj instanceof FrameLayout) {
            frameLayout = (FrameLayout) obj;
        }
        this.A01 = frameLayout;
        0FI.A0C(-1185361530, A06);
    }
}
