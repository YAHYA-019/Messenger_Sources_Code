package com.facebook.messaging.montage.viewer.contextualreplies;

import X.11T;
import X.1Bq;
import X.1Br;
import X.4YU;
import X.7zL;
import X.7zM;
import X.7zN;
import X.8PC;
import X.AZQ;
import X.C1rs;
import X.C22a;
import X.C2797Goa;
import X.C4s1;
import X.C8kq;
import android.content.Context;
import android.content.res.Resources;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import com.facebook.litho.LithoView;
import com.facebook.widget.CustomLinearLayout;
import com.google.common.collect.ImmutableList;
import com.mapbox.mapboxsdk.R;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: MontageViewerContextualRepliesView.class */
public final class MontageViewerContextualRepliesView extends CustomLinearLayout {
    public AZQ A00;
    public final 1Br A01;
    public final 1Br A02;
    public final TextPaint A03;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MontageViewerContextualRepliesView(Context context) {
        this(context, null, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MontageViewerContextualRepliesView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MontageViewerContextualRepliesView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        11T.A0F(context, 1);
        this.A02 = 1Bq.A00(49322);
        this.A01 = 7zM.A0X();
        setOrientation(0);
        setGravity(17);
        TextPaint textPaint = new TextPaint();
        this.A03 = textPaint;
        Resources resources = getResources();
        textPaint.setTextSize(TypedValue.applyDimension(0, 7zL.A01(resources, 2132279352), resources.getDisplayMetrics()));
    }

    public /* synthetic */ MontageViewerContextualRepliesView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public final ImmutableList A0E(List list) {
        ImmutableList build;
        if (list.isEmpty()) {
            build = ImmutableList.of();
        } else {
            Resources resources = getResources();
            11T.A0A(resources);
            int i = 0;
            int A08 = ((C4s1) 1Br.A0B(this.A02)).A08() - (resources.getDimensionPixelSize(2132279320) * 2);
            int dimensionPixelSize = resources.getDimensionPixelSize(2132279352);
            int A01 = (7zN.A01(resources) + resources.getDimensionPixelSize(R.dimen.mapbox_four_dp)) * 2;
            ImmutableList.Builder A0h = 4YU.A0h();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C2797Goa c2797Goa = (C2797Goa) it.next();
                int measureText = (int) (A01 + this.A03.measureText(((C22a) 1Br.A0B(this.A01)).BdF(dimensionPixelSize, c2797Goa.A01).toString()));
                if (A08 > measureText) {
                    A08 -= measureText;
                    A0h.m11011add((Object) c2797Goa);
                    i++;
                    if (i == 3) {
                        break;
                    }
                }
            }
            build = A0h.build();
        }
        11T.A0A(build);
        return build;
    }

    public final void A0F(AZQ azq, List list) {
        11T.A0F(list, 0);
        this.A00 = azq;
        removeAllViews();
        ImmutableList A0E = A0E(list);
        View A0G = 7zM.A0G(LayoutInflater.from(getContext()), this, 2132542425, false);
        View requireViewById = A0G.requireViewById(2131363356);
        11T.A0A(requireViewById);
        LithoView lithoView = (LithoView) requireViewById;
        8PC r0 = new 8PC(lithoView.A09, new C8kq());
        C8kq c8kq = r0.A01;
        c8kq.A01 = A0E;
        BitSet bitSet = r0.A02;
        bitSet.set(0);
        c8kq.A00 = this.A00;
        bitSet.set(1);
        C1rs.A00(bitSet, r0.A03);
        r0.A0J();
        lithoView.A0y(c8kq);
        addView(A0G);
    }
}
