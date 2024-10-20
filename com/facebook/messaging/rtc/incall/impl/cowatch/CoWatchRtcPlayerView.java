package com.facebook.messaging.rtc.incall.impl.cowatch;

import X.0FI;
import X.0Q8;
import X.11T;
import X.1BK;
import X.1Bq;
import X.1Br;
import X.AbI;
import X.C01i;
import X.C03i;
import X.C09s;
import X.C2729Gme;
import X.GPl;
import X.HDW;
import X.I2J;
import X.J9s;
import X.JPA;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.video.player.RichVideoPlayer;
import com.facebook.widget.CustomFrameLayout;
import com.facebook.widget.RoundedCornersFrameLayout;
import com.facebook.widget.loadingindicator.LoadingIndicatorView;

/* loaded from: CoWatchRtcPlayerView.class */
public final class CoWatchRtcPlayerView extends CustomFrameLayout implements JPA {
    public RichVideoPlayer A00;
    public RoundedCornersFrameLayout A01;
    public LoadingIndicatorView A02;
    public final 1Br A03;
    public final C01i A04;
    public final HDW A05;
    public final GPl A06;

    public CoWatchRtcPlayerView(Context context) {
        super(context);
        this.A04 = J9s.A00(this, C03i.A02, 25);
        this.A03 = 1Bq.A00(115528);
        this.A06 = GPl.A00(this, 26);
        this.A05 = new C2729Gme(this, 3);
        A00();
    }

    public CoWatchRtcPlayerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A04 = J9s.A00(this, C03i.A02, 25);
        this.A03 = 1Bq.A00(115528);
        this.A06 = GPl.A00(this, 26);
        this.A05 = new C2729Gme(this, 3);
        A00();
    }

    public CoWatchRtcPlayerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A04 = J9s.A00(this, C03i.A02, 25);
        this.A03 = 1Bq.A00(115528);
        this.A06 = GPl.A00(this, 26);
        this.A05 = new C2729Gme(this, 3);
        A00();
    }

    private final void A00() {
        View.inflate(getContext(), 2132541798, this);
        this.A00 = (RichVideoPlayer) C09s.A01(this, 2131366967);
        this.A02 = (LoadingIndicatorView) C09s.A01(this, 2131363436);
        this.A01 = (RoundedCornersFrameLayout) C09s.A01(this, 2131366968);
        LoadingIndicatorView loadingIndicatorView = this.A02;
        if (loadingIndicatorView == null) {
            11T.A0L("loadingIndicatorView");
            throw 0Q8.createAndThrow();
        }
        loadingIndicatorView.A0V();
        if (A0V().A0I == null) {
            throw 1BK.A0h();
        }
        A0V().A0I.A05(this.A06);
        I2J i2j = (I2J) 1Br.A0B(this.A03);
        HDW hdw = this.A05;
        11T.A0F(hdw, 0);
        i2j.A02.add(hdw);
    }

    public final RichVideoPlayer A0V() {
        RichVideoPlayer richVideoPlayer = this.A00;
        if (richVideoPlayer != null) {
            return richVideoPlayer;
        }
        11T.A0L("_richVideoPlayer");
        throw 0Q8.createAndThrow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ void CfQ(X.JDB r302) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.rtc.incall.impl.cowatch.CoWatchRtcPlayerView.CfQ(X.JDB):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.widget.CustomFrameLayout, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        int A06 = 0FI.A06(956466863);
        super.onAttachedToWindow();
        AbI.A1S(this, this.A04);
        0FI.A0C(-2018067276, A06);
    }

    @Override // com.facebook.widget.CustomFrameLayout, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        int A06 = 0FI.A06(-516165555);
        AbI.A1X(this.A04);
        super.onDetachedFromWindow();
        0FI.A0C(654224176, A06);
    }
}
