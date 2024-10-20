package com.facebook.video.plugins;

import X.0S2;
import X.11T;
import X.1BK;
import X.1Bi;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.2MR;
import X.6TJ;
import X.7zM;
import X.AbJ;
import X.AbstractC2327GOs;
import X.C1uu;
import X.C6d5;
import X.DKD;
import X.DKF;
import X.DKG;
import X.FXo;
import X.GDT;
import X.GPl;
import X.HYK;
import X.IJz;
import X.JGf;
import X.RQz;
import X.RaK;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.facebook.acra.constants.ActionId;
import com.facebook.resources.ui.FbTextView;
import com.facebook.video.engine.api.VideoPlayerParams;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: VideoQualityPlugin.class */
public class VideoQualityPlugin extends C6d5 implements JGf, GDT {
    public View A00;
    public View A01;
    public FbTextView A02;
    public FbTextView A03;
    public VideoPlayerParams A04;
    public FXo A05;
    public JGf A06;
    public Integer A07;
    public Integer A08;
    public boolean A09;
    public RQz A0A;
    public RaK A0B;
    public ImageView A0C;
    public FbTextView A0D;
    public final int A0E;
    public final int A0F;
    public final 1Br A0G;
    public final 1Br A0H;
    public final 1Br A0I;
    public final 1Br A0J;
    public final GPl A0K;
    public final IJz A0L;
    public final HYK A0M;
    public final boolean A0N;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VideoQualityPlugin(Context context) {
        this(context, null, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VideoQualityPlugin(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public VideoQualityPlugin(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        11T.A0F(context, 1);
        this.A07 = 0S2.A00;
        this.A0J = 1Bu.A00(115837);
        this.A0H = 1Bq.A00(116168);
        this.A0I = 1Bq.A00(49694);
        this.A0G = 1Bq.A00(115900);
        this.A0N = AbJ.A1U(DKD.A09(this).densityDpi, 240);
        this.A0L = new IJz(this);
        this.A0M = new HYK(this);
        6TJ gPl = new GPl(ActionId.ACTION_BAR_COMPLETE);
        this.A0K = gPl;
        Context context2 = getContext();
        this.A0F = 7zM.A02(context2, 2MR.A2f);
        this.A0E = context2.getColor(2132213990);
        this.A06 = this;
        A01(this);
        A0h(gPl);
    }

    public /* synthetic */ VideoQualityPlugin(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, DKG.A0A(attributeSet, i2), DKF.A01(i2, i));
    }

    private final View A00() {
        int intValue = this.A07.intValue();
        if (intValue == 1) {
            return this.A02;
        }
        if (intValue == 4) {
            return this.A03;
        }
        if (intValue == 2) {
            return this.A00;
        }
        if (intValue == 3) {
            return this.A01;
        }
        if (intValue == 0) {
            return null;
        }
        throw 1BK.A1F();
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [android.view.View, com.facebook.resources.ui.FbTextView] */
    /* JADX WARN: Type inference failed for: r0v39, types: [java.lang.Object, X.RQz] */
    /* JADX WARN: Type inference failed for: r0v5, types: [android.view.View, com.facebook.resources.ui.FbTextView] */
    public static final void A01(VideoQualityPlugin videoQualityPlugin) {
        ?? r0 = (FbTextView) AbstractC2327GOs.A0C(videoQualityPlugin.A06, 2131366935);
        videoQualityPlugin.A02 = r0;
        if (r0 != 0) {
            r0.setOnClickListener(videoQualityPlugin.A0L);
            videoQualityPlugin.A06.CwN(videoQualityPlugin.A0M);
        }
        View A0C = AbstractC2327GOs.A0C(videoQualityPlugin.A06, 2131364622);
        videoQualityPlugin.A00 = A0C;
        ?? r02 = (FbTextView) AbstractC2327GOs.A0C(videoQualityPlugin.A06, 2131364624);
        videoQualityPlugin.A0D = r02;
        ImageView imageView = (ImageView) AbstractC2327GOs.A0C(videoQualityPlugin.A06, 2131364623);
        videoQualityPlugin.A0C = imageView;
        if (r02 != 0) {
            r02.setVisibility(0);
        }
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        if (A0C != null && imageView != null && r02 != 0) {
            ?? obj = new Object();
            ((RQz) obj).A00 = imageView;
            ((RQz) obj).A02 = r02;
            ((RQz) obj).A01 = (C1uu) 1Bi.A03(66388);
            videoQualityPlugin.A0A = obj;
        }
        videoQualityPlugin.A03 = (FbTextView) AbstractC2327GOs.A0C(videoQualityPlugin.A06, 2131366936);
        videoQualityPlugin.A01 = AbstractC2327GOs.A0C(videoQualityPlugin.A06, 2131366937);
    }

    @Override // X.C6d6
    public String A0H() {
        return "VideoQualityPlugin";
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x012b, code lost:
    
        if (r314 == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0343, code lost:
    
        if ((r0 != null ? r0.B3f() : null) == X.6TN.A09) goto L93;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    @Override // X.C6d6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0e(X.6TI r302, boolean r303) {
        /*
            Method dump skipped, instructions count: 1064
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.video.plugins.VideoQualityPlugin.A0e(X.6TI, boolean):void");
    }

    @Override // X.JGf
    public void CwN(HYK hyk) {
    }
}
