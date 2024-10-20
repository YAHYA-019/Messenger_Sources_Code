package com.facebook.video.plugins.common;

import X.0S2;
import X.0fH;
import X.11T;
import X.1BK;
import X.1BY;
import X.1Bn;
import X.1Bq;
import X.1Br;
import X.1HG;
import X.4CE;
import X.6TI;
import X.6TJ;
import X.6TX;
import X.6Tu;
import X.6cT;
import X.6dE;
import X.6dF;
import X.6dG;
import X.82P;
import X.C00j;
import X.C09s;
import X.C0qy;
import X.C1F6;
import X.C52j;
import X.C6ce;
import X.C6d5;
import X.C6d6;
import X.C6d7;
import X.C6d8;
import X.C6d9;
import X.C7lz;
import X.GPm;
import X.GPn;
import X.GPs;
import X.GQJ;
import X.GU7;
import X.Gzu;
import X.HYL;
import X.HcP;
import X.IhQ;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.facebook.inject.FbInjector;
import com.facebook.video.player.RichVideoPlayer;
import com.facebook.widget.CustomRelativeLayout;
import com.google.common.base.Preconditions;

/* loaded from: VideoPlugin.class */
public class VideoPlugin extends C6d5 {
    public double A00;
    public double A01;
    public RectF A02;
    public FrameLayout A03;
    public 6dG A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final ImageView A08;
    public final 1Br A09;
    public final 1Br A0A;
    public final 1Br A0B;
    public final C6d8 A0C;
    public final int A0D;
    public final C6d7 A0E;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VideoPlugin(Context context) {
        this(context, null, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.6d7] */
    public VideoPlugin(Context context, AttributeSet attributeSet, int i) {
        super(context, null, 0);
        11T.A0F(context, 1);
        this.A0E = new Object() { // from class: X.6d7
        };
        this.A0C = (C6d8) 1Bn.A0E(context, (1BY) null, 66075);
        this.A0A = 1Bq.A00(116121);
        this.A09 = 1Bq.A00(16458);
        this.A0B = 1HG.A00(context, 115833);
        this.A00 = 1.7777777777777777d;
        this.A01 = -1.0d;
        this.A06 = true;
        this.A0D = 1;
        A0h(new 6TJ() { // from class: X.6co
            public boolean A00;

            {
                super(false, false);
            }
        }, new 82P(this, 34), new 82P(this, 37), new 82P(this, 38), new 82P(this, 33), new 82P(this, 36), new 82P(this, 35));
        ((CustomRelativeLayout) this).A0C(this instanceof C6d9 ? 2132541800 : 2132543554);
        this.A03 = (FrameLayout) C09s.A01((View) this, 2131368334);
        this.A08 = (ImageView) C09s.A01((View) this, 2131366319);
        C6d8 c6d8 = this.A0C;
        C1F6 c1f6 = (C1F6) c6d8.A03.A00.get();
        6dE r0 = (6dE) c6d8.A02.A00.get();
        Context A01 = FbInjector.A01();
        FbInjector.A04(c1f6.B92().Aqm());
        1Bn.A0M(c1f6);
        try {
            6dF r02 = new 6dF(r0);
            1Bn.A0K();
            FbInjector.A04(A01);
            this.A04 = r02;
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A01);
            throw th;
        }
    }

    public static final void A00(VideoPlugin videoPlugin) {
        boolean z = true;
        boolean z2 = !videoPlugin.A05;
        int i = 0;
        if (!z2) {
            6Tu r0 = ((C6d6) videoPlugin).A08;
            if (r0 == null || !r0.isPlaying()) {
                z = false;
            }
            z2 = z;
        }
        videoPlugin.A0B.A00.get();
        ImageView imageView = videoPlugin.A08;
        int i2 = 0;
        if (z2) {
            i2 = 8;
        }
        imageView.setVisibility(i2);
        FrameLayout frameLayout = videoPlugin.A03;
        if (!z2) {
            i = 4;
        }
        frameLayout.setVisibility(i);
    }

    public static final void A01(VideoPlugin videoPlugin, boolean z) {
        6cT r0;
        HcP hcP;
        if ((z || !videoPlugin.A05) && (r0 = ((C6d6) videoPlugin).A07) != null && r0.Afn() > 0) {
            6cT r02 = ((C6d6) videoPlugin).A07;
            Bitmap bitmap = null;
            if (r02 != null) {
                HYL hyl = (HYL) videoPlugin.A0A.A00.get();
                String BJQ = r02.BJQ();
                Bitmap bitmap2 = null;
                if (BJQ != null && (hcP = (HcP) hyl.A00.A02(BJQ)) != null) {
                    bitmap2 = hcP.A00;
                    if (bitmap2 != null && !bitmap2.isRecycled()) {
                        Bitmap.Config config = bitmap2.getConfig();
                        if (config == null) {
                            throw 1BK.A0h();
                        }
                        bitmap = bitmap2.copy(config, bitmap2.isMutable());
                    }
                }
                4CE r03 = (4CE) videoPlugin.A0B.A00.get();
                if (!r03.A01()) {
                    if (!11T.A0O(((C0qy) 1Br.A0B(r03.A01)) != null ? "256002347743983" : null, "312713275593566")) {
                        bitmap = bitmap2;
                    }
                }
            }
            videoPlugin.A08.setImageBitmap(bitmap);
            boolean z2 = false;
            if (bitmap != null) {
                z2 = true;
            }
            videoPlugin.A05 = z2;
            A00(videoPlugin);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00bd, code lost:
    
        if (r325 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0148, code lost:
    
        if (r317 != false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0037, code lost:
    
        if (java.lang.Math.abs(r0 - r302.A00) <= 0.001d) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean A02(X.6TI r301, com.facebook.video.plugins.common.VideoPlugin r302, boolean r303) {
        /*
            Method dump skipped, instructions count: 334
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.video.plugins.common.VideoPlugin.A02(X.6TI, com.facebook.video.plugins.common.VideoPlugin, boolean):boolean");
    }

    @Override // X.C6d6
    public void A0M() {
        6dF r0 = this.A04;
        TextureView textureView = r0.A01;
        if (textureView == null || textureView.getParent() == null) {
            return;
        }
        r0.A06();
    }

    @Override // X.C6d6
    public void A0P() {
        6dF r0 = this.A04;
        TextureView textureView = r0.A01;
        if (textureView == null || textureView.getParent() == null) {
            return;
        }
        r0.A06();
    }

    @Override // X.C6d6
    public void A0X(6TI r302) {
        A02(r302, this, true);
    }

    @Override // X.C6d6
    public void A0Y(6TI r302) {
        A0k();
        if (!(this instanceof C6d9)) {
            A0l();
        }
        A01(this, true);
    }

    @Override // X.C6d6
    public void A0Z(6TI r302) {
        GPs gPs;
        6dF r0;
        6cT r02 = super.A07;
        if (r02 == null || (gPs = ((RichVideoPlayer) r02).A0D) == null || !gPs.A06.D3V()) {
            super.A0Z(r302);
            return;
        }
        6dF r03 = this.A04;
        if ((r03 instanceof 6dF) && (r0 = r03) != null) {
            GQJ gqj = ((6dG) r0).A02;
            if (gqj != null) {
                boolean z = true;
                if (r0.A03 == 0S2.A0C) {
                    z = !r0.A05;
                }
                if (!z) {
                    GPm gPm = gqj.A00;
                    if (gPm.A0A) {
                        GPm.A07(gPm, "onCleanPlayerForReuse performing only lightweight reuse preparations", new Object[0]);
                    }
                    gPm.A0D = false;
                    gPm.A0q = -1;
                    gPm.A09 = null;
                    gPm.A0s = null;
                } else {
                    C00j.A05("FbHeroPlayer.onCleanPlayerForReuse", -950804254);
                    try {
                        GPm gPm2 = gqj.A00;
                        if (gPm2.A0A) {
                            GPm.A07(gPm2, "onCleanPlayerForReuse", new Object[0]);
                        }
                        gPm2.A0s = null;
                        gPm2.A0v = false;
                        GPn gPn = gPm2.A05;
                        if (gPn != null) {
                            C52j c52j = C52j.A2O;
                            11T.A0F(c52j, 0);
                            gPn.A0n = c52j;
                            gPn.A0A("onCleanPlayerForReuse");
                        }
                        gPm2.A07.A0S((String) null);
                        GPm.A08(gPm2, "onCleanPlayerForReuse invoking HeroPlayer.setSurface(null)", new Object[0]);
                        gPm2.A07.A0M((Surface) null);
                        gPm2.A0D = false;
                        gPm2.A0q = -1;
                        gPm2.A09 = null;
                        C00j.A01(2109277840);
                    } catch (Throwable th) {
                        C00j.A01(-1619907238);
                        throw th;
                    }
                }
            }
            r0.A04 = false;
        }
        A0e(r302, true);
    }

    @Override // X.C6d6
    public void A0e(6TI r302, boolean z) {
        11T.A0F(r302, 0);
        boolean A02 = A02(r302, this, z);
        if (z || A02) {
            A0k();
            if (!(this instanceof C6d9)) {
                A0l();
            }
        }
        A01(this, z);
    }

    public void A0k() {
        C6ce c6ce;
        6dG r0 = this.A04;
        6dF r02 = (6dF) r0;
        r02.A05 = false;
        6cT r03 = super.A07;
        if (r03 != null && !r03.ADd() && (c6ce = super.A08) != null) {
            c6ce.Ctr(r0);
        }
        TextureView textureView = r02.A01;
        if (textureView == null || textureView.getParent() == null) {
            FrameLayout frameLayout = this.A03;
            Preconditions.checkNotNull(frameLayout, "Must pass a parent as an argument");
            ((6dG) r02).A01 = frameLayout;
            0fH.A0g(r02.A05(), "VideoViewSurface", "Attaching surface target to view, ViewType: %s");
            if (r02.A00 != null && r02.A03 == 0S2.A01) {
                r02.A0C("attachToView", "onSurfaceTextureDestroyed wasn't called", (Throwable) null);
                r02.A0A(r02.A00, "missing_onSurfaceTextureDestroyed_on_attach_to_view");
                TextureView textureView2 = r02.A01;
                if (textureView2 != null) {
                    textureView2.setSurfaceTextureListener(null);
                    r02.A01 = null;
                }
            }
            GU7 gu7 = r02.A01;
            if (gu7 == null) {
                gu7 = r02.A09.BfJ(r02.A05);
                r02.A01 = gu7;
                if (r02.A05 && (gu7 instanceof GU7)) {
                    gu7.A00(new IhQ(r02));
                }
            }
            ((TextureView) gu7).setSurfaceTextureListener(r02.A02);
            if (!r02.A01.isAvailable()) {
                TextureView textureView3 = r02.A01;
                if (textureView3 instanceof Gzu) {
                    r02.A03 = r02.A05 ? 0S2.A0Y : 0S2.A0N;
                } else if (textureView3 instanceof GU7) {
                    r02.A03 = 0S2.A0C;
                } else {
                    r02.A03 = 0S2.A01;
                }
            }
            if (!r02.A05 && r02.A03 == 0S2.A0C) {
                r02.A05 = true;
            }
            boolean z = false;
            if (r02.A03 != 0S2.A00) {
                z = true;
            }
            Preconditions.checkArgument(z);
            boolean z2 = false;
            if (r02.A01.getParent() == null) {
                z2 = true;
            }
            Preconditions.checkArgument(z2, "Must detach before re-attaching");
            r02.A01.setTransform(null);
            if (r02.A00 != null) {
                SurfaceTexture surfaceTexture = r02.A01.getSurfaceTexture();
                SurfaceTexture surfaceTexture2 = r02.A00;
                if (surfaceTexture != surfaceTexture2) {
                    try {
                        r02.A01.setSurfaceTexture(surfaceTexture2);
                    } catch (IllegalArgumentException e) {
                        0fH.A14("TextureView", "IAE happens when invoking TextureView[%s]#setSurfaceTexture %s", new Object[]{r02.A01, e.toString()});
                    }
                }
            }
            ((6dG) r02).A01.addView(r02.A01);
            r02.A04 = false;
            if (r02.A01.getParent() == null) {
                r02.A0C("attachToView", "addView TextureView failed", (Throwable) null);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0148, code lost:
    
        if (r312 <= 0) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0l() {
        /*
            Method dump skipped, instructions count: 352
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.video.plugins.common.VideoPlugin.A0l():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [com.facebook.video.plugins.common.VideoPlugin, X.6d9] */
    public void A0m(double d) {
        if (!(this instanceof C6d9)) {
            this.A00 = d;
            return;
        }
        ?? r0 = (C6d9) this;
        if (r0.A01) {
            r0.A00 = d;
            r0.A08.A00(d);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [com.facebook.video.plugins.common.VideoPlugin, X.6d9] */
    public void A0n(double d) {
        if (!(this instanceof C6d9)) {
            this.A01 = d;
            return;
        }
        ?? r0 = (C6d9) this;
        r0.A01 = d;
        r0.A08.A00 = d;
    }

    public final void A0o(Integer... numArr) {
        FrameLayout frameLayout = this.A03;
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        11T.A0I(layoutParams, "null cannot be cast to non-null type com.facebook.video.plugins.common.AnchorLayout.LayoutParams");
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
        layoutParams2.addRule(15, 0);
        layoutParams2.addRule(10, 0);
        layoutParams2.addRule(9, 0);
        int intValue = numArr[0].intValue();
        if (intValue == 1) {
            layoutParams2.addRule(10);
        } else if (intValue == 2) {
            layoutParams2.addRule(9);
        } else if (intValue == 0) {
            layoutParams2.addRule(15);
        }
        frameLayout.setLayoutParams(layoutParams2);
    }

    @Override // X.C6d6
    public void CgE(6TX r302) {
        11T.A0F(r302, 0);
        super.CgE(r302);
        String A0H = A0H();
        r302.A04(A0H, "mAspectRatio", String.valueOf(this.A00));
        r302.A04(A0H, "minAspectRatio", String.valueOf(this.A01));
        r302.A04(A0H, "shouldCropToFit", String.valueOf(this.A07));
        r302.A04(A0H, "isPauseFrameSet", String.valueOf(this.A05));
        RectF rectF = this.A02;
        if (rectF != null) {
            r302.A04(A0H, "cropRect", rectF.toString());
        }
        r302.A04(A0H, "needCentering", String.valueOf(this.A06));
        r302.A04(A0H, "keyboardState", String.valueOf(this.A0D));
        String valueOf = String.valueOf(0);
        r302.A04(A0H, "videoMaxHeight", valueOf);
        r302.A04(A0H, "videoMaxWidth", valueOf);
        C7lz.A00(this.A03, r302, "VideoContainer");
        this.A04.CgE(r302);
    }
}
