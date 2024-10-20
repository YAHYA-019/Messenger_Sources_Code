package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

/* renamed from: X.Glk, reason: case insensitive filesystem */
/* loaded from: Glk.class */
public final class C2697Glk extends C1rj {
    public C2578Ghr A00;
    public I3e A01;
    public I4p A02;
    public HxC A03;
    public GL2 A04;
    public Hnb A05;
    public HIQ A06;
    public String A07;
    public String A08;

    public C2697Glk() {
        super("StoryViewerTappableStickerComponent");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00fa, code lost:
    
        if (r314 != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00fd, code lost:
    
        r321 = r301.getTop();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x020b, code lost:
    
        r321 = r301.getTop();
        r313 = r301.getHeight();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0208, code lost:
    
        if (r314 != false) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A00(android.view.View r301, X.GEb r302, X.GEc r303, X.C2137Deq r304, int[] r305, double r306) {
        /*
            Method dump skipped, instructions count: 724
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2697Glk.A00(android.view.View, X.GEb, X.GEc, X.Deq, int[], double):void");
    }

    public static void A01(View view, GEc gEc, GEd gEd, 1Iw r304, double d, int i) {
        view.post(new J46(view, null, gEc, gEd, r304, view.getContext().getString(i), null, d, true));
    }

    public Integer A0m() {
        return 0S2.A0C;
    }

    public Object A0n(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        7zR.A11(frameLayout);
        return frameLayout;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2Yv, java.lang.Object] */
    @Override // X.C1rj
    public /* bridge */ /* synthetic */ 2Yv A12() {
        return new Object();
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        if (r302.A01 != -1048037474) {
            return null;
        }
        1LI.A0J(r302, obj);
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0836, code lost:
    
        if (r0.equals(com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt.CAMERA_ID_FRONT) != false) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0c77, code lost:
    
        if (r0.equals("StoryOverlayLinkSticker") == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x0c92, code lost:
    
        if (r0.equals("StoryOverlayResharedPost") == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0ca8, code lost:
    
        if (r0.equals("StoryOverlayLocationSticker") == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0cea, code lost:
    
        r342 = 2131958768;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x0ce7, code lost:
    
        if ("LOCATION".equals(r0.A0s(com.facebook.graphql.enums.GraphQLStringDefUtil.A00(), "GraphQLStoryOverlayTagType")) != false) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x03c3, code lost:
    
        if (r348 == null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x05fe, code lost:
    
        if (r0.equals("StoryOverlayDynamicBrandSticker") == false) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:116:0x07c7  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0b72  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0bc1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0bd9  */
    @Override // X.C1rj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A1K(X.1Iw r302, X.AnonymousClass274 r303, java.lang.Object r304) {
        /*
            Method dump skipped, instructions count: 3314
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2697Glk.A1K(X.1Iw, X.274, java.lang.Object):void");
    }

    @Override // X.C1rj
    public void A1N(1Iw r302, 2Yv r303) {
        C2706Glt c2706Glt = (C2706Glt) r303;
        Object A0E = 1Bn.A0E(r302.A0D, (1BY) null, 49963);
        Object A0A = 1Bn.A0A(116028);
        if (A0E != null) {
            c2706Glt.A00 = (C67Q) A0E;
        }
        if (A0A != null) {
            c2706Glt.A01 = (Hap) A0A;
        }
    }

    @Override // X.C1rj
    public boolean A1U() {
        return true;
    }

    @Override // X.C1rj
    public boolean A1a(1LI r302, boolean z) {
        if (this != r302) {
            if (r302 == null || getClass() != r302.getClass()) {
                return false;
            }
            C2697Glk c2697Glk = (C2697Glk) r302;
            HxC hxC = this.A03;
            HxC hxC2 = c2697Glk.A03;
            if (hxC != null) {
                if (!hxC.equals(hxC2)) {
                    return false;
                }
            } else if (hxC2 != null) {
                return false;
            }
            HIQ hiq = this.A06;
            HIQ hiq2 = c2697Glk.A06;
            if (hiq != null) {
                if (!hiq.equals(hiq2)) {
                    return false;
                }
            } else if (hiq2 != null) {
                return false;
            }
            GL2 gl2 = this.A04;
            GL2 gl22 = c2697Glk.A04;
            if (gl2 != null) {
                if (!gl2.equals(gl22)) {
                    return false;
                }
            } else if (gl22 != null) {
                return false;
            }
            String str = this.A07;
            String str2 = c2697Glk.A07;
            if (str != null) {
                if (!str.equals(str2)) {
                    return false;
                }
            } else if (str2 != null) {
                return false;
            }
            C2578Ghr c2578Ghr = this.A00;
            C2578Ghr c2578Ghr2 = c2697Glk.A00;
            if (c2578Ghr != null) {
                if (!c2578Ghr.equals(c2578Ghr2)) {
                    return false;
                }
            } else if (c2578Ghr2 != null) {
                return false;
            }
            I3e i3e = this.A01;
            I3e i3e2 = c2697Glk.A01;
            if (i3e != null) {
                if (!i3e.equals(i3e2)) {
                    return false;
                }
            } else if (i3e2 != null) {
                return false;
            }
            I4p i4p = this.A02;
            I4p i4p2 = c2697Glk.A02;
            if (i4p != null) {
                if (!i4p.equals(i4p2)) {
                    return false;
                }
            } else if (i4p2 != null) {
                return false;
            }
            Hnb hnb = this.A05;
            Hnb hnb2 = c2697Glk.A05;
            if (hnb != null) {
                if (!hnb.equals(hnb2)) {
                    return false;
                }
            } else if (hnb2 != null) {
                return false;
            }
            String str3 = this.A08;
            String str4 = c2697Glk.A08;
            if (str3 != null) {
                if (!str3.equals(str4)) {
                    return false;
                }
            } else if (str4 != null) {
                return false;
            }
        }
        return true;
    }
}
