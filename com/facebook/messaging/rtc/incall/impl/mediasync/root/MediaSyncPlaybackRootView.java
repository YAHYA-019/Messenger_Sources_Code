package com.facebook.messaging.rtc.incall.impl.mediasync.root;

import X.0FI;
import X.11T;
import X.AKW;
import X.AbH;
import X.AbI;
import X.C01g;
import X.C01i;
import X.C8uf;
import X.DKF;
import X.DKG;
import X.GVb;
import X.GVc;
import X.IZS;
import X.JDB;
import X.JFq;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.messaging.rtc.incall.impl.mediasync.playbackview.MediaSyncPlaybackView;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: MediaSyncPlaybackRootView.class */
public final class MediaSyncPlaybackRootView extends ConstraintLayout implements JFq {
    public final ViewGroup A00;
    public final ViewGroup A01;
    public final ViewGroup A02;
    public final C01i A03;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MediaSyncPlaybackRootView(Context context) {
        this(context, null, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MediaSyncPlaybackRootView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaSyncPlaybackRootView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        11T.A0F(context, 1);
        this.A03 = C01g.A01(new AKW(context, this, 5));
        MediaSyncPlaybackView mediaSyncPlaybackView = new MediaSyncPlaybackView(context, null, 0);
        this.A01 = mediaSyncPlaybackView;
        GVc gVc = new GVc(context);
        this.A00 = gVc;
        GVb c8uf = new C8uf(context);
        this.A02 = c8uf;
        AbH.A1J(c8uf, -1);
        AbH.A1J(mediaSyncPlaybackView, -1);
        AbH.A1J(gVc, -1);
    }

    public /* synthetic */ MediaSyncPlaybackRootView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, DKG.A0A(attributeSet, i2), DKF.A01(i2, i));
    }

    @Override // X.JFq
    public /* bridge */ /* synthetic */ void CfQ(JDB jdb) {
        IZS izs = (IZS) jdb;
        11T.A0F(izs, 0);
        ViewGroup viewGroup = (izs.A00 && izs.A01) ? this.A02 : izs.A02 ? this.A00 : this.A01;
        if (11T.A0O(getChildAt(0), viewGroup)) {
            return;
        }
        removeAllViews();
        addView(viewGroup);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        int A06 = 0FI.A06(2090373180);
        super.onAttachedToWindow();
        AbI.A1S(this, this.A03);
        0FI.A0C(-818089792, A06);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        int A06 = 0FI.A06(-1060397739);
        super.onDetachedFromWindow();
        AbI.A1X(this.A03);
        0FI.A0C(20080845, A06);
    }
}
