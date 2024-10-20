package com.facebook.messaging.rtc.incall.impl.mediasync.player;

import X.11T;
import X.2Wo;
import X.C09s;
import X.DKF;
import X.DKG;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.drawee.fbpipeline.FbDraweeView;
import com.facebook.widget.RoundedCornersFrameLayout;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: MediaSyncPlayerView.class */
public final class MediaSyncPlayerView extends RoundedCornersFrameLayout implements CallerContextable {
    public static final CallerContext A05 = CallerContext.A06(MediaSyncPlayerView.class);
    public final View A00;
    public final TextView A01;
    public final TextView A02;
    public final FbDraweeView A03;
    public final 2Wo A04;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MediaSyncPlayerView(Context context) {
        this(context, null, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MediaSyncPlayerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaSyncPlayerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        11T.A0F(context, 1);
        Context context2 = getContext();
        LayoutInflater.from(context2).inflate(2132542516, this);
        this.A03 = (FbDraweeView) C09s.A01(this, 2131365532);
        this.A00 = C09s.A01(this, 2131365538);
        this.A02 = DKF.A0E(this, 2131365540);
        this.A01 = DKF.A0E(this, 2131365539);
        View A01 = C09s.A01(this, 2131368335);
        11T.A0I(A01, "null cannot be cast to non-null type android.view.ViewStub");
        this.A04 = 2Wo.A00((ViewStub) A01);
        setCornerRadius(context2.getResources().getDimension(2132279314));
    }

    public /* synthetic */ MediaSyncPlayerView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, DKG.A0A(attributeSet, i2), DKF.A01(i2, i));
    }
}
