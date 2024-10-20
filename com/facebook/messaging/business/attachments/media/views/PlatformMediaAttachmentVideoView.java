package com.facebook.messaging.business.attachments.media.views;

import X.0FI;
import X.1BK;
import X.1Bn;
import X.6TL;
import X.6TN;
import X.6eE;
import X.AbstractC00603o4;
import X.C09s;
import X.C52j;
import X.DKI;
import X.EWl;
import X.EdW;
import X.H31;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.messaging.business.attachments.media.model.PlatformMediaAttachmentVideoData;
import com.facebook.video.common.playerorigin.PlayerOrigin;
import com.facebook.video.engine.api.VideoPlayerParams;
import com.facebook.video.player.RichVideoPlayer;
import com.facebook.video.plugins.CoverImagePlugin;
import com.facebook.video.plugins.LoadingSpinnerPlugin;
import com.facebook.video.plugins.common.VideoPlugin;
import com.facebook.widget.CustomFrameLayout;

/* loaded from: PlatformMediaAttachmentVideoView.class */
public class PlatformMediaAttachmentVideoView extends CustomFrameLayout implements CallerContextable {
    public static final CallerContext A07 = CallerContext.A06(PlatformMediaAttachmentVideoView.class);
    public double A00;
    public double A01;
    public PlatformMediaAttachmentVideoData A02;
    public EdW A03;
    public EWl A04;
    public VideoPlayerParams A05;
    public RichVideoPlayer A06;

    public PlatformMediaAttachmentVideoView(Context context) {
        this(context, null);
    }

    public PlatformMediaAttachmentVideoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PlatformMediaAttachmentVideoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A02 = null;
        this.A05 = null;
        this.A04 = (EWl) 1Bn.A0A(100037);
        this.A03 = (EdW) 1Bn.A0A(100036);
        A0U(2132543130);
        RichVideoPlayer richVideoPlayer = (RichVideoPlayer) C09s.A01(this, 2131365488);
        this.A06 = richVideoPlayer;
        richVideoPlayer.A0M(new PlayerOrigin(6TL.A15, "media_template"));
        this.A06.A0J(6TN.A0F);
        RichVideoPlayer richVideoPlayer2 = this.A06;
        Context context2 = getContext();
        richVideoPlayer2.A0P(new VideoPlugin(context2));
        this.A06.A0P(new CoverImagePlugin(context2, A07));
        this.A06.A0P(new LoadingSpinnerPlugin(context2));
        this.A06.A0P(new H31(context2));
        this.A06.A0P(new 6eE(context2));
        this.A06.CrU(C52j.A09, true);
        this.A01 = 0.0d;
        this.A00 = 0.0d;
    }

    @Override // com.facebook.widget.CustomFrameLayout, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        int A06 = 0FI.A06(1412448189);
        super.onDetachedFromWindow();
        this.A06.CWm(C52j.A08);
        EdW edW = this.A03;
        if (edW != null) {
            DKI.A0X(1BK.A08(1BK.A07(edW.A00), AbstractC00603o4.A00(33)));
        }
        0FI.A0C(1697467146, A06);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0068, code lost:
    
        if (r0 == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x006b, code lost:
    
        r317 = 1073741824;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0073, code lost:
    
        if (r0 == 1073741824) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0076, code lost:
    
        super.onMeasure(r302, r303);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x007c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0085, code lost:
    
        r303 = android.view.View.MeasureSpec.makeMeasureSpec(r312, r317);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x007d, code lost:
    
        r312 = java.lang.Math.min(r0, r312);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0091, code lost:
    
        if (r303 == 0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0040, code lost:
    
        if (r0 >= r301.A00) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0043, code lost:
    
        r312 = (int) (r0 / r301.A01);
        r317 = (-1) << (-1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0063, code lost:
    
        if (r0 == r317) goto L16;
     */
    @Override // com.facebook.widget.CustomFrameLayout, android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r302, int r303) {
        /*
            r301 = this;
            r0 = r303
            int r0 = android.view.View.MeasureSpec.getSize(r0)
            r304 = r0
            r0 = r302
            int r0 = android.view.View.MeasureSpec.getSize(r0)
            r305 = r0
            r0 = r303
            int r0 = android.view.View.MeasureSpec.getMode(r0)
            r306 = r0
            r0 = r301
            com.facebook.messaging.business.attachments.media.model.PlatformMediaAttachmentVideoData r0 = r0.A02
            r307 = r0
            r0 = r307
            if (r0 == 0) goto L90
            r0 = r301
            double r0 = r0.A01
            r308 = r0
            r0 = 0
            r310 = r0
            r0 = r308
            r1 = r310
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r312 = r0
            r0 = r312
            if (r0 == 0) goto L90
            r0 = r301
            double r0 = r0.A00
            r310 = r0
            r0 = r308
            r1 = r310
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r312 = r0
            r0 = r312
            if (r0 < 0) goto L90
        L43:
            r0 = r305
            double r0 = (double) r0
            r313 = r0
            r0 = r301
            double r0 = r0.A01
            r315 = r0
            r0 = r313
            r1 = r315
            double r0 = r0 / r1
            r313 = r0
            r0 = r313
            int r0 = (int) r0
            r312 = r0
            r0 = -1
            r1 = -1
            int r0 = r0 << r1
            r317 = r0
            r0 = r306
            r1 = r317
            if (r0 == r1) goto L7d
            r0 = r306
            if (r0 == 0) goto L85
            r0 = 1073741824(0x40000000, float:2.0)
            r317 = r0
            r0 = r306
            r1 = r317
            if (r0 == r1) goto L7d
        L76:
            r0 = r301
            r1 = r302
            r2 = r303
            super.onMeasure(r1, r2)
            return
        L7d:
            r0 = r304
            r1 = r312
            int r0 = java.lang.Math.min(r0, r1)
            r312 = r0
        L85:
            r0 = r312
            r1 = r317
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
            r303 = r0
            goto L76
        L90:
            r0 = r303
            if (r0 != 0) goto L76
            goto L43
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.business.attachments.media.views.PlatformMediaAttachmentVideoView.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        this.A06.CWm(C52j.A08);
        EdW edW = this.A03;
        if (edW != null) {
            DKI.A0X(1BK.A08(1BK.A07(edW.A00), AbstractC00603o4.A00(33)));
        }
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i == 8 || i == 4) {
            this.A06.CWm(C52j.A08);
            EdW edW = this.A03;
            if (edW != null) {
                DKI.A0X(1BK.A08(1BK.A07(edW.A00), AbstractC00603o4.A00(33)));
            }
        }
    }
}
