package com.facebook.messaging.montage.viewer.replystatus;

import X.0FI;
import X.0S2;
import X.2qZ;
import X.4YU;
import X.AbG;
import X.C09s;
import X.C5eb;
import X.C5ec;
import X.C5ed;
import X.C62j;
import X.C66h;
import X.C66i;
import X.GOp;
import X.H00;
import X.H09;
import X.H0A;
import X.IKE;
import X.Ir6;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.facebook.acra.constants.ActionId;
import com.facebook.fbui.widget.glyph.GlyphButton;
import com.facebook.user.tiles.UserTileView;
import com.facebook.widget.CustomLinearLayout;

/* loaded from: MontageViewerReplyStatusView.class */
public class MontageViewerReplyStatusView extends CustomLinearLayout implements C5eb, C5ec {
    public C5ed A00;
    public boolean A01;
    public float A02;
    public C62j A03;
    public final int A04;
    public final ProgressBar A05;
    public final TextView A06;
    public final GlyphButton A07;
    public final C66i A08;
    public final C66i A09;
    public final C66i A0A;
    public final UserTileView A0B;
    public final Runnable A0C;

    public MontageViewerReplyStatusView(Context context) {
        this(context, null);
    }

    public MontageViewerReplyStatusView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MontageViewerReplyStatusView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A0C = new Ir6(this);
        this.A03 = GOp.A0x();
        A0D(2132542751);
        this.A0B = (UserTileView) C09s.A01(this, 2131368306);
        this.A06 = AbG.A09(this, 2131365608);
        this.A05 = (ProgressBar) C09s.A01(this, 2131366701);
        GlyphButton glyphButton = (GlyphButton) C09s.A01(this, 2131363049);
        this.A07 = glyphButton;
        IKE.A01(glyphButton, this, ActionId.RTMP_CONNECTION_REQUESTED);
        C66h A01 = C66h.A01();
        C66i c66i = new C66i(this.A03);
        c66i.A09(A01);
        c66i.A0A(new H00(this));
        c66i.A06(0.0d);
        c66i.A02();
        this.A0A = c66i;
        C66i c66i2 = new C66i(this.A03);
        c66i2.A09(A01);
        c66i2.A0A(new H09(this));
        c66i2.A06(0.0d);
        c66i2.A02();
        this.A08 = c66i2;
        C66i c66i3 = new C66i(this.A03);
        c66i3.A09(A01);
        c66i3.A06(0.0d);
        c66i3.A06 = true;
        c66i3.A02();
        c66i3.A0A(new H0A(this));
        this.A09 = c66i3;
        this.A04 = getResources().getDimensionPixelSize(2132279345);
        setTranslationY(-r0);
        C5ed c5ed = new C5ed(context);
        this.A00 = c5ed;
        Integer[] numArr = {0S2.A00, 0S2.A01};
        c5ed.A04 = 0;
        c5ed.A05(numArr);
        c5ed.A08 = this;
        c5ed.A07 = this;
        c5ed.A0G = true;
    }

    public static void A00(MontageViewerReplyStatusView montageViewerReplyStatusView, 2qZ r302, String str, long j) {
        if (montageViewerReplyStatusView.A01) {
            return;
        }
        montageViewerReplyStatusView.A08.A04();
        Resources resources = montageViewerReplyStatusView.getResources();
        if (str == null) {
            String string = resources.getString(2131960791);
            TextView textView = montageViewerReplyStatusView.A06;
            textView.setText(string);
            textView.setContentDescription(string);
            textView.announceForAccessibility(string);
            montageViewerReplyStatusView.A0A.A07(0.0d);
        } else {
            String A0u = 4YU.A0u(resources, str, 2131960792);
            TextView textView2 = montageViewerReplyStatusView.A06;
            textView2.setText(A0u);
            textView2.setContentDescription(A0u);
            textView2.announceForAccessibility(A0u);
            montageViewerReplyStatusView.A0B.A03(r302);
            montageViewerReplyStatusView.A0A.A04();
        }
        if (montageViewerReplyStatusView.A00.A0B != 0S2.A0C) {
            montageViewerReplyStatusView.A09.A04();
        }
        Runnable runnable = montageViewerReplyStatusView.A0C;
        montageViewerReplyStatusView.removeCallbacks(runnable);
        montageViewerReplyStatusView.postDelayed(runnable, j);
    }

    public void A0E() {
        C5ed c5ed = this.A00;
        if (c5ed.A0B == 0S2.A0C) {
            c5ed.A04();
        }
        this.A09.A07(0.0d);
    }

    @Override // X.C5ec
    public boolean BWn(float f, float f2) {
        return true;
    }

    @Override // X.C5eb
    public void Bv0() {
        this.A09.A04();
    }

    @Override // X.C5eb
    public void Bv1(float f, float f2) {
        if (this.A02 >= (-this.A04) / 2) {
            this.A09.A04();
        } else {
            this.A09.A07(0.0d);
            this.A01 = true;
        }
    }

    @Override // X.C5eb
    public void Bv2(Integer num, float f, float f2, int i) {
        if (num == 0S2.A00) {
            this.A09.A07(0.0d);
            this.A01 = true;
        } else if (num == 0S2.A01) {
            this.A09.A04();
        }
    }

    @Override // X.C5eb
    public void Bv4(Integer num, float f, float f2) {
        this.A02 = this.A02 + f2;
        double d = 1.0d;
        double round = (Math.round(r0) / ((this.A04 + getPaddingTop()) + getPaddingBottom())) + 1.0d;
        C66i c66i = this.A09;
        if (round < 1.0d) {
            d = round;
        }
        c66i.A07(d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0021, code lost:
    
        if (r302 == X.0S2.A01) goto L6;
     */
    @Override // X.C5eb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean Bv5(java.lang.Integer r302, float r303, float r304) {
        /*
            r301 = this;
            r0 = 0
            r305 = r0
            r0 = r301
            r1 = 0
            r0.A02 = r1
            java.lang.Integer r0 = X.0S2.A00
            r306 = r0
            r0 = r302
            r1 = r306
            if (r0 == r1) goto L24
            java.lang.Integer r0 = X.0S2.A01
            r307 = r0
            r0 = 0
            r305 = r0
            r0 = 0
            r306 = r0
            r0 = r302
            r1 = r307
            if (r0 != r1) goto L27
        L24:
            r0 = 1
            r305 = r0
        L27:
            r0 = r305
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.montage.viewer.replystatus.MontageViewerReplyStatusView.Bv5(java.lang.Integer, float, float):boolean");
    }

    @Override // X.C5ec
    public boolean Cxp(float f, float f2) {
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        int A06 = 0FI.A06(1657279599);
        removeCallbacks(this.A0C);
        super.onDetachedFromWindow();
        0FI.A0C(1094306278, A06);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int A05 = 0FI.A05(790109016);
        boolean A03 = C5ed.A03(motionEvent, this.A00);
        0FI.A0B(2140772122, A05);
        return A03;
    }

    public void setTextColor(int i) {
        this.A06.setTextColor(i);
    }
}
