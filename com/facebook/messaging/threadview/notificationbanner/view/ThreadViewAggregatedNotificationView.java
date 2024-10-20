package com.facebook.messaging.threadview.notificationbanner.view;

import X.0FI;
import X.1BQ;
import X.1BV;
import X.1Bn;
import X.5zD;
import X.6Id;
import X.6JM;
import X.7yW;
import X.C00i;
import X.C09s;
import X.C22a;
import X.C62n;
import X.JR1;
import X.Klp;
import X.LKO;
import X.LWg;
import X.R1Q;
import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.fbui.widget.glyph.GlyphButton;
import com.facebook.messaging.ui.facepile.UriCrescentPileView;
import com.facebook.widget.CustomLinearLayout;

/* loaded from: ThreadViewAggregatedNotificationView.class */
public class ThreadViewAggregatedNotificationView extends CustomLinearLayout implements 7yW, CallerContextable {
    public ColorStateList A00;
    public View A01;
    public TextView A02;
    public TextView A03;
    public GlyphButton A04;
    public C00i A05;
    public C00i A06;
    public C62n A07;
    public 6Id A08;
    public Klp A09;
    public 6JM A0A;
    public UriCrescentPileView A0B;
    public final View.OnClickListener A0C;
    public final View.OnClickListener A0D;

    public ThreadViewAggregatedNotificationView(Context context) {
        this(context, null);
    }

    public ThreadViewAggregatedNotificationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ThreadViewAggregatedNotificationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A0C = LKO.A00(this, 73);
        this.A0D = LKO.A00(this, 74);
        this.A06 = 1BV.A00(66207);
        this.A0A = (6JM) 1Bn.A0A(67632);
        this.A05 = 1BQ.A02(66067);
        A0D(2132542823);
        this.A0B = (UriCrescentPileView) C09s.A01(this, 2131363466);
        this.A02 = (TextView) C09s.A01(this, 2131366674);
        this.A03 = (TextView) C09s.A01(this, 2131367210);
        this.A04 = (GlyphButton) C09s.A01(this, 2131363678);
        this.A01 = C09s.A01(this, 2131361998);
        this.A02.getCurrentTextColor();
        this.A03.getCurrentTextColor();
        this.A00 = this.A04.A00;
        this.A07 = new C62n(new LWg(this, 2), null);
    }

    public void AC2(6Id r302, Klp klp) {
        this.A09 = klp;
        this.A08 = r302;
        if (klp != null) {
            this.A0B.A01(klp.A04);
            GlyphButton glyphButton = this.A04;
            int i = 0;
            glyphButton.setVisibility(8);
            TextView textView = this.A02;
            C00i c00i = this.A05;
            JR1.A1D(textView, (C22a) c00i.get(), this.A09.A05);
            JR1.A1D(this.A03, (C22a) c00i.get(), this.A09.A06);
            glyphButton.setOnClickListener(this.A0D);
            setOnClickListener(this.A0C);
            View view = this.A09.A02;
            View view2 = this.A01;
            if (view == null) {
                i = 8;
            }
            view2.setVisibility(i);
            if (view != null) {
                R1Q.A00(view, (ViewGroup) view2);
            }
        }
    }

    public void CvO(5zD r302) {
        this.A07.A02(r302);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        int A06 = 0FI.A06(388859440);
        super.onAttachedToWindow();
        this.A07.A00();
        0FI.A0C(-162189914, A06);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        int A06 = 0FI.A06(-1866361698);
        super.onDetachedFromWindow();
        this.A07.A01();
        0FI.A0C(-1218157141, A06);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0039, code lost:
    
        if (getTag(2131366014).equals(r308) == false) goto L6;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onVisibilityChanged(android.view.View r302, int r303) {
        /*
            r301 = this;
            r0 = r301
            r1 = r302
            r2 = r303
            super.onVisibilityChanged(r1, r2)
            r0 = 0
            r304 = r0
            r0 = r303
            boolean r0 = X.AnonymousClass001.A1O(r0)
            r305 = r0
            r0 = 2131366014(0x7f0a107e, float:1.835191E38)
            r306 = r0
            r0 = r301
            r1 = r306
            java.lang.Object r0 = r0.getTag(r1)
            r307 = r0
            java.lang.String r0 = "visible"
            r308 = r0
            r0 = r307
            if (r0 == 0) goto L3c
            r0 = r301
            r1 = r306
            java.lang.Object r0 = r0.getTag(r1)
            r307 = r0
            r0 = r307
            r1 = r308
            boolean r0 = r0.equals(r1)
            r309 = r0
            r0 = 1
            r310 = r0
            r0 = r309
            if (r0 != 0) goto L42
        L3c:
            r0 = 0
            r310 = r0
            r0 = 0
            r307 = r0
        L42:
            r0 = r305
            r1 = r310
            if (r0 == r1) goto L60
            r0 = r301
            X.6Id r0 = r0.A08
            r307 = r0
            r0 = r307
            if (r0 == 0) goto L60
            r0 = r303
            if (r0 != 0) goto L5a
            r0 = 1
            r304 = r0
        L5a:
            r0 = r307
            r1 = r304
            r0.A02(r1)
        L60:
            r0 = r305
            if (r0 != 0) goto L69
            java.lang.String r0 = "invisible"
            r308 = r0
        L69:
            r0 = r301
            r1 = r306
            r2 = r308
            r0.setTag(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.threadview.notificationbanner.view.ThreadViewAggregatedNotificationView.onVisibilityChanged(android.view.View, int):void");
    }
}
