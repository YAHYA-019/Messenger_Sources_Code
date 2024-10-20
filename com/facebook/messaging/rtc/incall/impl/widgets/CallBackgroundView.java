package com.facebook.messaging.rtc.incall.impl.widgets;

import X.0FI;
import X.11T;
import X.1BL;
import X.5YD;
import X.7zM;
import X.C01i;
import X.C03i;
import X.C2fr;
import X.GS2;
import X.J9t;
import X.JDB;
import X.JFq;
import X.RrI;
import android.content.Context;
import android.util.AttributeSet;
import com.facebook.widget.tiles.BlurThreadTileView;

/* loaded from: CallBackgroundView.class */
public class CallBackgroundView extends BlurThreadTileView implements JFq {
    public final C01i A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CallBackgroundView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        1BL.A1F(context, attributeSet);
        this.A00 = J9t.A00(this, C03i.A02, 20);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CallBackgroundView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        1BL.A1F(context, attributeSet);
        this.A00 = J9t.A00(this, C03i.A02, 20);
    }

    @Override // X.JFq
    public /* bridge */ /* synthetic */ void CfQ(JDB jdb) {
        RrI rrI = (RrI) jdb;
        11T.A0F(rrI, 0);
        C2fr c2fr = rrI.A01;
        5YD r0 = this.A06;
        r0.getClass();
        r0.A0A = c2fr;
        5YD.A03(r0);
        A0V(rrI.A00);
    }

    @Override // com.facebook.widget.tiles.BlurThreadTileView, com.facebook.widget.CustomFrameLayout, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        int A06 = 0FI.A06(-1242596039);
        super.onAttachedToWindow();
        ((GS2) 7zM.A1B(this.A00)).A0Y(this);
        0FI.A0C(312765822, A06);
    }

    @Override // com.facebook.widget.tiles.BlurThreadTileView, com.facebook.widget.CustomFrameLayout, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        int A06 = 0FI.A06(1209263950);
        ((GS2) 7zM.A1B(this.A00)).A0X();
        super.onDetachedFromWindow();
        0FI.A0C(737588876, A06);
    }
}
