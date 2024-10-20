package com.facebook.messaging.montage.composer;

import X.0FI;
import X.1BQ;
import X.1BV;
import X.1Bn;
import X.2Wo;
import X.5Q1;
import X.7zL;
import X.8XN;
import X.9Qx;
import X.AVB;
import X.AbF;
import X.AbK;
import X.AnonymousClass001;
import X.C00i;
import X.C09s;
import X.C1uu;
import X.C6r6;
import X.C6x1;
import X.C6x9;
import X.DKC;
import X.DKE;
import X.GOo;
import X.GOp;
import X.GP7;
import X.GpC;
import X.H3A;
import X.HRZ;
import X.HSz;
import X.HTX;
import X.HaN;
import X.HaO;
import X.HhS;
import X.Hm7;
import X.HmH;
import X.Hrs;
import X.Hrt;
import X.IDq;
import X.IKJ;
import X.J2j;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.litho.LithoView;
import com.facebook.messaging.media.editing.ContentFramingLayout;
import com.facebook.messaging.media.editing.MultimediaEditorPhotoImageViewer;
import com.facebook.messaging.media.editing.MultimediaEditorScrimOverlayView;
import com.facebook.messaging.photos.editing.layer.Layer;
import com.facebook.video.player.RichVideoPlayer;
import com.facebook.widget.FbImageView;
import java.util.List;

/* loaded from: CanvasEditorView.class */
public class CanvasEditorView extends ContentFramingLayout {
    public C00i A00;
    public HRZ A01;
    public MultimediaEditorPhotoImageViewer A02;
    public Hrt A03;
    public HaO A04;
    public HSz A05;
    public Hm7 A06;
    public HhS A07;
    public HTX A08;
    public HmH A09;
    public 5Q1 A0A;
    public C6r6 A0B;
    public GP7 A0C;
    public String A0D;
    public C00i A0E;
    public final Rect A0F;
    public final ViewGroup A0G;
    public final ImageView A0H;
    public final MultimediaEditorScrimOverlayView A0I;
    public final FbImageView A0J;
    public final 2Wo A0K;
    public final 2Wo A0L;
    public final 2Wo A0M;
    public final 2Wo A0N;
    public final 2Wo A0O;
    public final 2Wo A0P;
    public final 2Wo A0Q;
    public final 2Wo A0R;
    public final C00i A0S;

    public CanvasEditorView(Context context) {
        this(context, null);
    }

    public CanvasEditorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CanvasEditorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A0F = DKC.A0C();
        this.A0A = (5Q1) 1Bn.A0A(115935);
        this.A0C = (GP7) 1Bn.A0A(115993);
        1BQ A02 = 1BQ.A02(66388);
        this.A0S = A02;
        this.A00 = 1BV.A00(67527);
        this.A0E = 7zL.A0R(context, 16980);
        A0U(2132542698);
        this.A0L = AbK.A0v(this, 2131363674);
        this.A0G = (ViewGroup) C09s.A01(this, 2131365169);
        this.A0Q = AbK.A0v(this, 2131367967);
        this.A0K = AbK.A0v(this, 2131363089);
        this.A0O = AbK.A0v(this, 2131365596);
        this.A0R = AbK.A0v(this, 2131367985);
        this.A0N = AbK.A0v(this, 2131365046);
        this.A0M = AbK.A0v(this, 2131363090);
        FbImageView fbImageView = (FbImageView) C09s.A01(this, 2131363592);
        this.A0J = fbImageView;
        fbImageView.setImageDrawable(((C1uu) A02.get()).A01(2132346561, -1));
        this.A0I = (MultimediaEditorScrimOverlayView) C09s.A01(this, 2131367114);
        this.A0H = (ImageView) C09s.A01(this, 2131368368);
        this.A0P = AbK.A0v(this, 2131367129);
    }

    public static void A00(CanvasEditorView canvasEditorView) {
        if (canvasEditorView.A02 == null) {
            C6r6 c6r6 = canvasEditorView.A0B;
            2Wo A0v = AbK.A0v(canvasEditorView, 2131363733);
            2Wo A0v2 = AbK.A0v(canvasEditorView, 2131363515);
            canvasEditorView.A02 = new MultimediaEditorPhotoImageViewer(A0v);
            boolean A03 = C6x9.A03(c6r6);
            if (A03) {
                HhS hhS = new HhS(AbF.A0p(canvasEditorView.A0E), A0v2, DKE.A03(canvasEditorView.getContext()) * 2);
                canvasEditorView.A07 = hhS;
                2Wo r0 = hhS.A04;
                r0.A03();
                r0.A03();
                ((LithoView) r0.A01()).A0y(new 8XN(hhS.A03, (List) hhS.A02.A01, new AVB(hhS, 11)));
            }
            IKJ ikj = new IKJ(canvasEditorView);
            A00(canvasEditorView);
            MultimediaEditorPhotoImageViewer multimediaEditorPhotoImageViewer = canvasEditorView.A02;
            if (multimediaEditorPhotoImageViewer != null) {
                multimediaEditorPhotoImageViewer.A02 = ikj;
                HTX htx = canvasEditorView.A08;
                if (htx != null) {
                    multimediaEditorPhotoImageViewer.A06 = htx;
                }
                if (c6r6 != null && C6x9.A02(c6r6)) {
                    MultimediaEditorPhotoImageViewer multimediaEditorPhotoImageViewer2 = canvasEditorView.A02;
                    if (multimediaEditorPhotoImageViewer2.A07 == null) {
                        multimediaEditorPhotoImageViewer2.A07 = new GpC(multimediaEditorPhotoImageViewer2.A0A.A01(), multimediaEditorPhotoImageViewer2, multimediaEditorPhotoImageViewer2);
                    }
                }
            }
            MultimediaEditorPhotoImageViewer multimediaEditorPhotoImageViewer3 = canvasEditorView.A02;
            if (multimediaEditorPhotoImageViewer3 == null || !A03) {
                return;
            }
            multimediaEditorPhotoImageViewer3.A09 = true;
            multimediaEditorPhotoImageViewer3.A08 = true;
            multimediaEditorPhotoImageViewer3.A00 = 2132279314;
        }
    }

    public static void A01(CanvasEditorView canvasEditorView) {
        if (canvasEditorView.A03 == null) {
            canvasEditorView.A03 = new Hrt(AbK.A0v(canvasEditorView, 2131366970));
            IKJ ikj = new IKJ(canvasEditorView);
            A01(canvasEditorView);
            if (canvasEditorView.A03 != null) {
                A01(canvasEditorView);
                canvasEditorView.A03.A00 = ikj;
            }
        }
    }

    public static void A02(CanvasEditorView canvasEditorView) {
        Hm7 hm7;
        A00(canvasEditorView);
        MultimediaEditorPhotoImageViewer multimediaEditorPhotoImageViewer = canvasEditorView.A02;
        if (multimediaEditorPhotoImageViewer != null) {
            multimediaEditorPhotoImageViewer.A03(0.0f, 0.0f);
            multimediaEditorPhotoImageViewer.A01(-((Layer) multimediaEditorPhotoImageViewer).A02);
            multimediaEditorPhotoImageViewer.A02(1.0f);
            C6r6 c6r6 = C6r6.A0O;
            C6r6 c6r62 = canvasEditorView.A0B;
            if (c6r6.equals(c6r62) || C6r6.A0I.equals(c6r62) || C6r6.A0k.equals(c6r62) || C6r6.A04.equals(c6r62) || C6r6.A0n.equals(c6r62) || ((hm7 = canvasEditorView.A06) != null && hm7.A00() == C6x1.A04)) {
                IDq iDq = multimediaEditorPhotoImageViewer.A07;
                if (iDq == null || iDq.A01) {
                    return;
                }
                iDq.A0D();
                return;
            }
            IDq iDq2 = multimediaEditorPhotoImageViewer.A07;
            if (iDq2 == null || !iDq2.A01) {
                return;
            }
            iDq2.A0G();
        }
    }

    public static void A03(CanvasEditorView canvasEditorView, int i) {
        MultimediaEditorScrimOverlayView multimediaEditorScrimOverlayView = canvasEditorView.A0I;
        if (multimediaEditorScrimOverlayView != null) {
            if (C6x9.A03(canvasEditorView.A0B)) {
                multimediaEditorScrimOverlayView.A01 = 2132279321;
                multimediaEditorScrimOverlayView.invalidate();
            }
            multimediaEditorScrimOverlayView.setVisibility(i);
        }
    }

    public void A0V() {
        A00(this);
        MultimediaEditorPhotoImageViewer multimediaEditorPhotoImageViewer = this.A02;
        if (multimediaEditorPhotoImageViewer != null) {
            multimediaEditorPhotoImageViewer.A0A();
        }
        A01(this);
        if (this.A03 != null) {
            A01(this);
            this.A03.A01();
        }
        A01(this);
        if (this.A03 != null) {
            A01(this);
            2Wo r0 = this.A03.A02;
            if (r0.A00 != null) {
                ((RichVideoPlayer) r0.A01()).A0H();
            }
        }
        A01(this);
        if (this.A03 != null) {
            A01(this);
            this.A03.A02.A02();
        }
        A03(this, 8);
    }

    public void A0W(Uri uri, HaN haN) {
        A00(this);
        MultimediaEditorPhotoImageViewer multimediaEditorPhotoImageViewer = this.A02;
        HhS hhS = this.A07;
        if (multimediaEditorPhotoImageViewer != null) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((Activity) getContext()).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            A02(this);
            multimediaEditorPhotoImageViewer.A0C(uri, haN);
            if (hhS != null) {
                int i = displayMetrics.widthPixels;
                View A0F = GOo.A0F(hhS.A04);
                ViewGroup.LayoutParams layoutParams = A0F.getLayoutParams();
                if (layoutParams == null) {
                    throw AnonymousClass001.A0Q("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.topMargin = hhS.A01 + (i / 2);
                A0F.setLayoutParams(marginLayoutParams);
                hhS.A00 = new 9Qx(multimediaEditorPhotoImageViewer, haN, this);
            }
            A03(this, GOp.A01(haN.A01 ? 1 : 0));
        }
    }

    public void A0X(ImageView.ScaleType scaleType) {
        A00(this);
        MultimediaEditorPhotoImageViewer multimediaEditorPhotoImageViewer = this.A02;
        if (multimediaEditorPhotoImageViewer != null) {
            ((ImageView) multimediaEditorPhotoImageViewer.A0A.A01()).setScaleType(scaleType);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x003c, code lost:
    
        if (r0.A1H.A01.A0G != false) goto L8;
     */
    /* JADX WARN: Type inference failed for: r0v14, types: [com.facebook.video.player.RichVideoPlayer, android.view.View] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0Y(X.C2608Gix r302, com.facebook.video.engine.api.VideoPlayerParams r303, boolean r304, boolean r305) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.montage.composer.CanvasEditorView.A0Y(X.Gix, com.facebook.video.engine.api.VideoPlayerParams, boolean, boolean):void");
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        H3A h3a;
        Hrs hrs;
        super.onConfigurationChanged(configuration);
        MultimediaEditorPhotoImageViewer multimediaEditorPhotoImageViewer = this.A02;
        if (multimediaEditorPhotoImageViewer != null && (hrs = multimediaEditorPhotoImageViewer.A04) != null) {
            hrs.A00();
        }
        Hrt hrt = this.A03;
        if (hrt == null || (h3a = hrt.A01) == null) {
            return;
        }
        h3a.A00.A00();
    }

    @Override // com.facebook.messaging.media.editing.ContentFramingLayout, android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        int A06 = 0FI.A06(-903776240);
        super.onSizeChanged(i, i2, i3, i4);
        post(new J2j(this, i, i2, i3, i4));
        0FI.A0C(-545291677, A06);
    }
}
