package com.facebook.messaging.rtc.incall.impl.facecast.ui;

import X.0FI;
import X.0S2;
import X.11T;
import X.1Bn;
import X.1Bq;
import X.1Br;
import X.C09s;
import X.CLr;
import X.DKF;
import X.DKG;
import X.GOp;
import X.Gqs;
import X.IDw;
import X.IKE;
import X.JFq;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.facecast.display.livestatus.LiveVideoStatusView;
import com.facebook.fbui.widget.text.GlyphWithTextView;
import com.facebook.resources.ui.FbFrameLayout;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: LiveVideoStatusWrapper.class */
public final class LiveVideoStatusWrapper extends FbFrameLayout implements JFq {
    public LiveVideoStatusView A00;
    public CLr A01;
    public float A02;
    public Gqs A03;
    public final 1Br A04;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LiveVideoStatusWrapper(Context context) {
        this(context, null, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LiveVideoStatusWrapper(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v28, types: [android.view.View, com.facebook.fbui.widget.text.GlyphWithTextView] */
    public LiveVideoStatusWrapper(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        11T.A0F(context, 1);
        this.A04 = 1Bq.A00(16766);
        1Bn.A0A(147727);
        FbUserSession A01 = IDw.A01(this, "LiveVideoStatusWrapper");
        Context context2 = getContext();
        this.A03 = new Gqs(A01, context2);
        LiveVideoStatusView liveVideoStatusView = new LiveVideoStatusView(context, (AttributeSet) null, 0);
        this.A00 = liveVideoStatusView;
        addView(liveVideoStatusView);
        LiveVideoStatusView liveVideoStatusView2 = this.A00;
        liveVideoStatusView2.A00 = 0;
        liveVideoStatusView2.A0E(0);
        ?? r0 = (GlyphWithTextView) C09s.A01(liveVideoStatusView2, 2131368379);
        liveVideoStatusView2.A02 = r0;
        if (r0 != 0) {
            IKE.A01((View) r0, liveVideoStatusView2, 6);
        }
        liveVideoStatusView2.A06 = true;
        liveVideoStatusView2.A05 = true;
        LiveVideoStatusView.A01(liveVideoStatusView2, false);
        liveVideoStatusView2.A04 = 0S2.A00;
        LiveVideoStatusView.A01(liveVideoStatusView2, true);
        liveVideoStatusView2.A0E(0);
        this.A02 = ViewConfiguration.get(context).getScaledTouchSlop();
        1Bn.A0A(147726);
        this.A01 = new CLr(IDw.A01(this, "LiveVideoStatusWrapper"), context2);
    }

    public /* synthetic */ LiveVideoStatusWrapper(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, DKG.A0A(attributeSet, i2), DKF.A01(i2, i));
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0037, code lost:
    
        if (r0.A04 == false) goto L6;
     */
    @Override // X.JFq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ void CfQ(X.JDB r302) {
        /*
            Method dump skipped, instructions count: 687
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.rtc.incall.impl.facecast.ui.LiveVideoStatusWrapper.CfQ(X.JDB):void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        int A06 = 0FI.A06(-2084067068);
        super.onAttachedToWindow();
        this.A03.A0Y(this);
        0FI.A0C(2044930306, A06);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        int A06 = 0FI.A06(-400598886);
        this.A03.A0X();
        super.onDetachedFromWindow();
        0FI.A0C(-1250956879, A06);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        11T.A0F(motionEvent, 0);
        boolean z = true;
        if (motionEvent.getHistorySize() != 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (((float) Math.sqrt(Math.pow(x - motionEvent.getHistoricalX(0), 2.0d) + Math.pow(y - motionEvent.getHistoricalY(0), 2.0d))) >= this.A02) {
                z = false;
            }
        }
        return z;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int A06 = GOp.A06(motionEvent, 1828384615);
        if (motionEvent.getAction() == 1) {
            performClick();
        }
        0FI.A0B(867385687, A06);
        return true;
    }
}
