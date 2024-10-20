package com.bloks.components.bkcomponentsvideo.subtitle;

import X.1BK;
import X.1Br;
import X.1ED;
import X.1K9;
import X.1Kd;
import X.4YT;
import X.6TI;
import X.6TX;
import X.6Tb;
import X.6U2;
import X.6UR;
import X.AnonymousClass001;
import X.C00i;
import X.C6d6;
import X.C6dd;
import X.C6df;
import X.C6dj;
import X.C7lx;
import X.C7lz;
import X.H2J;
import X.HOD;
import X.Hgo;
import X.HjA;
import X.HyJ;
import X.IvC;
import X.J58;
import android.net.Uri;
import android.view.View;
import com.facebook.video.engine.api.VideoDataSource;
import com.facebook.video.engine.api.VideoPlayerParams;
import com.facebook.video.subtitles.views.FbSubtitleView;
import com.google.common.base.Objects;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.ref.SoftReference;
import java.util.Map;

/* loaded from: BKBloksSubtitlePlugin.class */
public class BKBloksSubtitlePlugin extends C6dd {
    public VideoPlayerParams A00;
    public 6UR A01;
    public Hgo A02;
    public FbSubtitleView A03;
    public ListenableFuture A04;
    public SoftReference A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public final C00i A09;
    public final C00i A0A;
    public final C00i A0B;
    public final C00i A0C;
    public final C00i A0D;
    public final C6df A0E;
    public final C6dj A0F;
    public final 1K9 A0G;
    public final 1ED A0H;
    public final Map A0I;

    /* JADX WARN: Code restructure failed: missing block: B:8:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Throwable, java.util.concurrent.ExecutorService] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public BKBloksSubtitlePlugin(android.content.Context r302) {
        /*
            Method dump skipped, instructions count: 208
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bloks.components.bkcomponentsvideo.subtitle.BKBloksSubtitlePlugin.<init>(android.content.Context):void");
    }

    public static void A00(BKBloksSubtitlePlugin bKBloksSubtitlePlugin) {
        VideoDataSource videoDataSource;
        Uri uri;
        String str;
        Hgo hgo;
        VideoPlayerParams videoPlayerParams = bKBloksSubtitlePlugin.A00;
        if (videoPlayerParams == null || (videoDataSource = videoPlayerParams.A0V) == null || (uri = videoDataSource.A01) == null || (str = videoPlayerParams.A0k) == null) {
            return;
        }
        String obj = uri.toString();
        Map map = bKBloksSubtitlePlugin.A0I;
        if (map.containsKey(obj) && (hgo = (Hgo) map.get(obj)) != null) {
            1BK.A1E(bKBloksSubtitlePlugin.A0A).execute(new IvC(bKBloksSubtitlePlugin, hgo));
            return;
        }
        ListenableFuture listenableFuture = bKBloksSubtitlePlugin.A04;
        if (listenableFuture != null) {
            listenableFuture.cancel(true);
            bKBloksSubtitlePlugin.A04 = null;
        }
        ListenableFuture D3C = bKBloksSubtitlePlugin.A0H.D3C(new J58(bKBloksSubtitlePlugin, obj, str, 2));
        bKBloksSubtitlePlugin.A04 = D3C;
        1Kd.A0D(bKBloksSubtitlePlugin.A0A, bKBloksSubtitlePlugin.A0G, D3C);
    }

    public static void A01(BKBloksSubtitlePlugin bKBloksSubtitlePlugin, 6UR r302) {
        FbSubtitleView fbSubtitleView = bKBloksSubtitlePlugin.A03;
        if (fbSubtitleView == null || bKBloksSubtitlePlugin.A02 == null || r302 == null) {
            return;
        }
        int ordinal = r302.ordinal();
        if (ordinal == 4) {
            fbSubtitleView.A0G();
            return;
        }
        if (ordinal != 7) {
            if (ordinal == 9 || ordinal == 10) {
                fbSubtitleView.A0H();
            } else {
                fbSubtitleView.A0F();
            }
        }
    }

    public static void A02(BKBloksSubtitlePlugin bKBloksSubtitlePlugin, boolean z) {
        FbSubtitleView fbSubtitleView = bKBloksSubtitlePlugin.A03;
        if (fbSubtitleView != null) {
            if (((C6d6) bKBloksSubtitlePlugin).A07 == null && ((C6d6) bKBloksSubtitlePlugin).A09 == null) {
                return;
            }
            int i = 8;
            if (bKBloksSubtitlePlugin.A00 == null) {
                fbSubtitleView.setVisibility(8);
                return;
            }
            boolean A1T = z & AnonymousClass001.A1T(bKBloksSubtitlePlugin.A02);
            if (A1T) {
                i = 0;
            }
            if (A1T == bKBloksSubtitlePlugin.A07) {
                if (i == fbSubtitleView.getVisibility()) {
                    return;
                }
            }
            bKBloksSubtitlePlugin.A07 = A1T;
            bKBloksSubtitlePlugin.A03.setVisibility(i);
            bKBloksSubtitlePlugin.A0C.get();
            SoftReference softReference = bKBloksSubtitlePlugin.A05;
            if (softReference == null || softReference.get() == null) {
                return;
            }
            ((6U2) softReference.get()).A06(new H2J(bKBloksSubtitlePlugin.A00.A0k, A1T));
        }
    }

    @Override // X.C6d6
    public String A0H() {
        return "BKBloksSubtitlePlugin";
    }

    @Override // X.C6d6
    public void A0M() {
        ListenableFuture listenableFuture = this.A04;
        if (listenableFuture != null) {
            listenableFuture.cancel(true);
            this.A04 = null;
        }
        A0q(null);
        this.A05 = null;
        this.A00 = null;
        FbSubtitleView fbSubtitleView = this.A03;
        if (fbSubtitleView != null) {
            fbSubtitleView.A0H();
        }
    }

    @Override // X.C6d6
    public void A0P() {
        this.A06 = false;
        A0M();
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0016, code lost:
    
        if (r0.A1b != false) goto L8;
     */
    @Override // X.C6d6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0Y(X.6TI r302) {
        /*
            r301 = this;
            r0 = r302
            if (r0 == 0) goto L19
            r0 = r302
            com.facebook.video.engine.api.VideoPlayerParams r0 = r0.A03
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L19
            r0 = r303
            boolean r0 = r0.A1b
            r304 = r0
            r0 = 1
            r305 = r0
            r0 = r304
            if (r0 == 0) goto L1e
        L19:
            r0 = 0
            r305 = r0
            r0 = 0
            r303 = r0
        L1e:
            r0 = r301
            r1 = r302
            r0.A00 = r1
            r0 = 1
            r306 = r0
            r0 = r305
            if (r0 == 0) goto L93
            r0 = r302
            if (r0 == 0) goto L8b
            r0 = r302
            com.facebook.video.engine.api.VideoPlayerParams r0 = r0.A03
            r307 = r0
        L35:
            r0 = r301
            r1 = r307
            r0.A00 = r1
            r0 = r301
            X.00i r0 = r0.A0D
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L6b
            r0 = r307
            if (r0 == 0) goto L6b
            r0 = r303
            java.lang.Object r0 = r0.get()
            X.6Tb r0 = (X.6Tb) r0
            r308 = r0
            r0 = r301
            com.facebook.video.engine.api.VideoPlayerParams r0 = r0.A00
            java.lang.String r0 = r0.A0k
            r307 = r0
            r0 = r301
            com.facebook.video.common.playerorigin.PlayerOrigin r0 = r0.A03
            r303 = r0
            r0 = r308
            r1 = r303
            r2 = r307
            boolean r0 = r0.A0K(r1, r2)
        L6b:
            r0 = r301
            X.6U2 r0 = r0.A06
            r307 = r0
            java.lang.ref.SoftReference r0 = new java.lang.ref.SoftReference
            r303 = r0
            r0 = r303
            r1 = r307
            r0.<init>(r1)
            r0 = r301
            r1 = r303
            r0.A05 = r1
            r0 = r301
            r1 = r306
            r0.A06 = r1
            r0 = r301
            r0.A0p()
        L8a:
            return
        L8b:
            r0 = 0
            r304 = r0
            r0 = 0
            r307 = r0
            goto L35
        L93:
            r0 = r302
            if (r0 == 0) goto L8a
            r0 = r301
            r1 = r302
            r2 = r306
            r0.A0e(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bloks.components.bkcomponentsvideo.subtitle.BKBloksSubtitlePlugin.A0Y(X.6TI):void");
    }

    @Override // X.C6dd, X.C6d6
    public void A0e(6TI r302, boolean z) {
        super.A0e(r302, z);
        VideoPlayerParams videoPlayerParams = r302.A03;
        this.A00 = videoPlayerParams;
        C00i c00i = this.A0D;
        if (c00i != null && videoPlayerParams != null) {
            ((6Tb) c00i.get()).A0K(super.A03, this.A00.A0k);
        }
        A00(this);
        this.A05 = new SoftReference(super.A06);
    }

    @Override // X.C6dd
    public int A0k() {
        return 2132543408;
    }

    @Override // X.C6dd
    public int A0l() {
        return 2132543409;
    }

    @Override // X.C6dd
    public void A0m(View view) {
        this.A03 = (FbSubtitleView) view.findViewById(2131367733);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0015, code lost:
    
        if (r301.A02 != null) goto L8;
     */
    @Override // X.C6dd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A0o(X.6TI r302) {
        /*
            r301 = this;
            r0 = r302
            if (r0 == 0) goto Ld
            r0 = r302
            boolean r0 = r0.A04()
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L18
        Ld:
            r0 = r301
            X.Hgo r0 = r0.A02
            r304 = r0
            r0 = 0
            r303 = r0
            r0 = r304
            if (r0 == 0) goto L1a
        L18:
            r0 = 1
            r303 = r0
        L1a:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bloks.components.bkcomponentsvideo.subtitle.BKBloksSubtitlePlugin.A0o(X.6TI):boolean");
    }

    public void A0p() {
        Hgo hgo;
        if (this.A00 != null) {
            if (!(super.A08 == null && super.A09 == null) && A0n()) {
                this.A08 = true;
                this.A07 = true;
                FbSubtitleView fbSubtitleView = this.A03;
                if (fbSubtitleView != null && (hgo = this.A02) != null) {
                    String str = hgo.A01;
                    fbSubtitleView.A01 = 1Br.A07(((HyJ) this.A0C.get()).A01).Auy(36594646075771052L);
                    fbSubtitleView.A05 = str;
                    HjA hjA = null;
                    if (C7lx.A00(null, super.A03, ((C6dd) this).A00)) {
                        hjA = HOD.A00(this.A03.A0C);
                    }
                    this.A03.A0I(null, this.A0E, this.A0F, this.A02, hjA);
                }
                A01(this, this.A01);
            }
        }
    }

    public void A0q(Hgo hgo) {
        if (super.A09 == null && super.A07 == null) {
            return;
        }
        if (!Objects.equal(this.A02, hgo) || this.A02 == null) {
            this.A02 = hgo;
            boolean z = false;
            if (hgo != null) {
                A0p();
            } else {
                FbSubtitleView fbSubtitleView = this.A03;
                if (fbSubtitleView != null) {
                    fbSubtitleView.A0E();
                }
                this.A08 = false;
            }
            if (this.A02 != null) {
                z = true;
            }
            A02(this, z);
        }
    }

    @Override // X.C6d6
    public void CgE(6TX r302) {
        super.CgE(r302);
        FbSubtitleView fbSubtitleView = this.A03;
        if (fbSubtitleView != null) {
            C7lz.A00(fbSubtitleView, r302, 4YT.A00(243));
        } else {
            r302.A04("BKBloksSubtitlePlugin", 4YT.A00(776), "");
        }
    }
}
