package com.facebook.messaging.rtc.incall.impl.mediasync.playbackview;

import X.0FI;
import X.11T;
import X.1Bn;
import X.1Br;
import X.1Bu;
import X.1Lm;
import X.2JN;
import X.2Wo;
import X.2yD;
import X.7zM;
import X.7zP;
import X.7zQ;
import X.AKX;
import X.AbI;
import X.AbstractC2326GOr;
import X.AbstractC2327GOs;
import X.AnonymousClass001;
import X.C01g;
import X.C01i;
import X.C09s;
import X.C1oo;
import X.C1u3;
import X.DKF;
import X.DKG;
import X.GOn;
import X.GOo;
import X.GOp;
import X.GOq;
import X.GS2;
import X.GrG;
import X.HIl;
import X.HVO;
import X.Hq9;
import X.I9A;
import X.IAP;
import X.IAU;
import X.ICR;
import X.IDw;
import X.IKB;
import X.J0k;
import X.JPE;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.messaging.rtc.incall.impl.mediasync.player.MediaSyncPlayerView;
import com.facebook.messaging.rtc.incall.impl.mediasync.seekbarview.MediaSyncSeekBarView;
import com.facebook.messaging.rtc.incall.impl.mediasync.titleview.MediaSyncTitleExternalView;
import com.facebook.resources.ui.FbTextView;
import com.facebook.ui.compat.fbrelativelayout.FbRelativeLayout;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: MediaSyncPlaybackView.class */
public final class MediaSyncPlaybackView extends ConstraintLayout implements JPE {
    public int A00;
    public int A01;
    public LinearLayout A02;
    public MediaSyncTitleExternalView A03;
    public FbRelativeLayout A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final View A08;
    public final 1Br A09;
    public final 1Br A0A;
    public final 1Br A0B;
    public final 1Br A0C;
    public final 1Br A0D;
    public final 1Br A0E;
    public final IAU A0F;
    public final MediaSyncPlayerView A0G;
    public final I9A A0H;
    public final MediaSyncSeekBarView A0I;
    public final FbTextView A0J;
    public final 2Wo A0K;
    public final C01i A0L;
    public final HVO A0M;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MediaSyncPlaybackView(Context context) {
        this(context, null, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MediaSyncPlaybackView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v77, types: [android.widget.TextView, android.view.View, com.facebook.resources.ui.FbTextView] */
    public MediaSyncPlaybackView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        11T.A0F(context, 1);
        this.A0C = IDw.A04(context, this, "MediaSyncPlaybackView", 114853);
        this.A09 = 1Bu.A01(context, 115390);
        this.A0B = 1Bu.A00(114787);
        this.A0A = 1Bu.A01(context, 67593);
        this.A0E = 7zM.A0U();
        this.A0D = 1Bu.A01(context, 16979);
        this.A0L = C01g.A01(new AKX(context, this, 43));
        this.A0M = new HVO(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1oo.A1w, 0, 0);
        11T.A0A(obtainStyledAttributes);
        try {
            boolean z = obtainStyledAttributes.getBoolean(0, false);
            obtainStyledAttributes.recycle();
            this.A07 = z;
            LayoutInflater.from(context).inflate(2132542515, this);
            this.A03 = (MediaSyncTitleExternalView) C09s.A01(this, 2131365549);
            MediaSyncPlayerView mediaSyncPlayerView = (MediaSyncPlayerView) C09s.A01(this, 2131365543);
            this.A0G = mediaSyncPlayerView;
            1Bn.A0A(147735);
            this.A0H = new I9A(context, (2JN) 1Lm.A05(context, IDw.A01(this, "MediaSyncPlaybackView"), 33088), mediaSyncPlayerView.A04, this.A07);
            MediaSyncSeekBarView mediaSyncSeekBarView = (MediaSyncSeekBarView) C09s.A01(this, 2131365545);
            this.A0I = mediaSyncSeekBarView;
            View A01 = C09s.A01(this, 2131363428);
            this.A08 = A01;
            IKB.A00(A01, this, 13);
            ?? r0 = (FbTextView) C09s.A01(this, 2131363437);
            this.A0J = r0;
            r0.setCompoundDrawablesWithIntrinsicBounds(GOo.A0C(C1u3.A4u, 7zP.A0S(this.A0E), 7zQ.A0m(this.A0D)), null, null, null);
            IKB.A00((View) r0, this, 15);
            r0.setVisibility(DKG.A00(ICR.A00(this.A0A).AZk(36314390871613353L) ? 1 : 0));
            this.A02 = (LinearLayout) C09s.A01(this, 2131365544);
            View A012 = C09s.A01(mediaSyncPlayerView, 2131365527);
            11T.A0I(A012, "null cannot be cast to non-null type android.view.ViewStub");
            2Wo A00 = 2Wo.A00((ViewStub) A012);
            this.A0K = A00;
            A00.A03();
            Hq9 hq9 = (Hq9) 1Br.A0B(this.A0C);
            if (GOq.A0s(hq9.A04).A0S && 2yD.A03(1Br.A07(hq9.A03), 36313450272135768L)) {
                View A013 = C09s.A01(mediaSyncPlayerView, 2131365536);
                11T.A0I(A013, "null cannot be cast to non-null type android.view.ViewStub");
                this.A04 = (FbRelativeLayout) 2Wo.A00((ViewStub) A013).A01();
            }
            this.A0F = new IAU(this.A03, mediaSyncSeekBarView, GOp.A0K(this.A09), mediaSyncPlayerView);
            GrG A0M = AbstractC2326GOr.A0M(this);
            Resources resources = getResources();
            A0M.A05 = AnonymousClass001.A1Q(GOn.A06(resources), 1);
            GOp.A0K(A0M.A0H).A04(A0M.A08);
            if (GS2.A07(A0M)) {
                GrG.A08(A0M);
            }
            IKB.A00(mediaSyncPlayerView, this, 14);
            this.A01 = resources.getDimensionPixelOffset(2132279368);
            this.A00 = resources.getDimensionPixelOffset(2132279368);
            this.A05 = ICR.A00(this.A0A).AZk(36314390871875500L);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public /* synthetic */ MediaSyncPlaybackView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, DKG.A0A(attributeSet, i2), DKF.A01(i2, i));
    }

    private final void A00(boolean z) {
        this.A03.setVisibility(8);
        this.A02.setVisibility(8);
        MediaSyncPlayerView mediaSyncPlayerView = this.A0G;
        ViewGroup.LayoutParams layoutParams = mediaSyncPlayerView.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams).setMargins(0, 0, 0, 0);
            mediaSyncPlayerView.setLayoutParams(layoutParams);
        }
        if (!z || !isAttachedToWindow()) {
            this.A0F.A03();
            return;
        }
        IAU iau = this.A0F;
        IAU.A02(iau);
        IAU.A01(iau);
        MediaSyncPlayerView mediaSyncPlayerView2 = iau.A07;
        IAP iap = new IAP(mediaSyncPlayerView2);
        iau.A02 = HIl.A00(mediaSyncPlayerView2, new J0k(iap, AbstractC2327GOs.A0G(mediaSyncPlayerView2, iap), iau));
    }

    /* JADX WARN: Code restructure failed: missing block: B:133:0x068c, code lost:
    
        if (r340 != false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0709, code lost:
    
        if (r314 != null) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x07cd, code lost:
    
        if (r0 == r0) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x080d, code lost:
    
        if (r310.length() == 0) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x083c, code lost:
    
        if (r0.length() == 0) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0866, code lost:
    
        if (r0.length() == 0) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00ac, code lost:
    
        if (r0.A0A != false) goto L22;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0905  */
    /* JADX WARN: Removed duplicated region for block: B:234:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v107, types: [com.facebook.drawee.fbpipeline.FbDraweeView, android.view.View] */
    /* JADX WARN: Type inference failed for: r0v156 */
    /* JADX WARN: Type inference failed for: r0v176, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r0v212 */
    /* JADX WARN: Type inference failed for: r0v236, types: [com.facebook.drawee.fbpipeline.FbDraweeView, android.view.View] */
    /* JADX WARN: Type inference failed for: r0v250 */
    /* JADX WARN: Type inference failed for: r0v254 */
    /* JADX WARN: Type inference failed for: r0v288 */
    /* JADX WARN: Type inference failed for: r0v293, types: [com.facebook.resources.ui.FbTextView] */
    /* JADX WARN: Type inference failed for: r0v312, types: [android.view.View, com.facebook.resources.ui.FbTextView] */
    /* JADX WARN: Type inference failed for: r0v323 */
    /* JADX WARN: Type inference failed for: r0v416 */
    /* JADX WARN: Type inference failed for: r0v432 */
    /* JADX WARN: Type inference failed for: r0v477 */
    /* JADX WARN: Type inference failed for: r0v656, types: [android.view.View, com.facebook.litho.LithoView] */
    /* JADX WARN: Type inference failed for: r308v16 */
    /* JADX WARN: Type inference failed for: r308v17 */
    /* JADX WARN: Type inference failed for: r308v57 */
    /* JADX WARN: Type inference failed for: r340v0 */
    /* JADX WARN: Type inference failed for: r340v1 */
    /* JADX WARN: Type inference failed for: r340v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ void CfQ(X.JDB r302) {
        /*
            Method dump skipped, instructions count: 3447
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.rtc.incall.impl.mediasync.playbackview.MediaSyncPlaybackView.CfQ(X.JDB):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        int A06 = 0FI.A06(334658242);
        super.onAttachedToWindow();
        AbI.A1S(this, this.A0L);
        this.A03.A01 = this.A0M;
        0FI.A0C(-259122268, A06);
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        11T.A0F(configuration, 0);
        super.onConfigurationChanged(configuration);
        this.A0F.A03();
        int i = configuration.orientation;
        GrG A0M = AbstractC2326GOr.A0M(this);
        A0M.A05 = AnonymousClass001.A1Q(i, 1);
        GOp.A0K(A0M.A0H).A04(A0M.A08);
        if (GS2.A07(A0M)) {
            GrG.A08(A0M);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        int A06 = 0FI.A06(1600187372);
        super.onDetachedFromWindow();
        IAU.A02(this.A0F);
        AbI.A1X(this.A0L);
        this.A03.A01 = null;
        this.A06 = false;
        0FI.A0C(-600436645, A06);
    }
}
