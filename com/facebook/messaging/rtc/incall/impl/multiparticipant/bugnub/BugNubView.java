package com.facebook.messaging.rtc.incall.impl.multiparticipant.bugnub;

import X.0FI;
import X.11T;
import X.1Bn;
import X.E1o;
import X.FXr;
import X.Fjs;
import X.IDw;
import X.JDB;
import X.JFq;
import android.content.Context;
import android.util.AttributeSet;
import com.facebook.acra.constants.ActionId;
import com.facebook.fbui.widget.glyph.GlyphButton;

/* loaded from: BugNubView.class */
public final class BugNubView extends GlyphButton implements JFq {
    public E1o A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BugNubView(Context context) {
        super(context, null);
        11T.A0F(context, 1);
        A00();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BugNubView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        11T.A0F(context, 1);
        A00();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BugNubView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        11T.A0F(context, 1);
        A00();
    }

    private final void A00() {
        1Bn.A0A(147737);
        this.A00 = new E1o(IDw.A01(this, "BugNubView"), getContext());
        setOnClickListener(FXr.A02(this, ActionId.NEW_START_FOUND));
    }

    @Override // X.JFq
    public /* bridge */ /* synthetic */ void CfQ(JDB jdb) {
        Fjs fjs = (Fjs) jdb;
        11T.A0F(fjs, 0);
        setEnabled(fjs.A00);
        float f = 0.5f;
        if (isEnabled()) {
            f = 1.0f;
        }
        setAlpha(f);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        int A06 = 0FI.A06(-1613545193);
        super.onAttachedToWindow();
        E1o e1o = this.A00;
        11T.A0D(e1o);
        e1o.A0Y(this);
        0FI.A0C(411641238, A06);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        int A06 = 0FI.A06(1745308529);
        E1o e1o = this.A00;
        11T.A0D(e1o);
        e1o.A0X();
        super.onDetachedFromWindow();
        0FI.A0C(-464640878, A06);
    }
}
