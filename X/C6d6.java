package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.facebook.acra.constants.ActionId;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.drawee.fbpipeline.FbDraweeView;
import com.facebook.video.common.playerorigin.PlayerOrigin;
import com.facebook.video.plugins.CoverImagePlugin;
import com.facebook.video.plugins.LoadingSpinnerPlugin;
import com.facebook.video.plugins.common.VideoPlugin;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/* renamed from: X.6d6, reason: invalid class name */
/* loaded from: 6d6.class */
public abstract class C6d6 extends 6cS implements 6A8 {
    public ViewGroup A00;
    public ViewGroup A01;
    public 3TI A02;
    public PlayerOrigin A03;
    public GRD A04;
    public 6TI A05;
    public 6U2 A06;
    public 6cT A07;
    public C6ce A08;
    public GRX A09;
    public String A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public final 1Br A0I;
    public final 1Br A0J;
    public final 1Br A0K;
    public final Queue A0L;
    public final 1Br A0M;
    public final List A0N;
    public volatile 6TN A0O;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C6d6(Context context) {
        this(context, null, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6d6(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        11T.A0F(context, 1);
        this.A0L = new LinkedList();
        this.A0N = new ArrayList();
        this.A0I = 1Bq.A00(16511);
        this.A0J = 1Bq.A00(115824);
        this.A0M = 1Bu.A00(420);
        this.A0K = 1Bq.A00(115215);
    }

    public GRS A0D() {
        PlayerOrigin playerOrigin;
        String str = this.A0A;
        GRS grs = null;
        if (str != null && (playerOrigin = this.A03) != null && this.A0B) {
            GRD grd = this.A04;
            if (grd == null) {
                return ((6Tb) 1Br.A0B(this.A0J)).A06(playerOrigin, str);
            }
            grs = grd.A04();
        }
        return grs;
    }

    public final GRD A0E() {
        GRD grd = this.A04;
        if (grd == null) {
            6TI r0 = this.A05;
            grd = null;
            if (r0 != null) {
                String A03 = r0.A03();
                PlayerOrigin playerOrigin = this.A03;
                if (playerOrigin != null) {
                    grd = ((6Tb) 1Br.A0B(this.A0J)).A07(playerOrigin, A03);
                }
            }
        }
        return grd;
    }

    public 6TI A0F() {
        if (this.A0B) {
            return this.A05;
        }
        6cT r0 = this.A07;
        if (r0 != null) {
            return r0.B82();
        }
        return null;
    }

    public HAM A0G() {
        return HAM.A02;
    }

    public String A0H() {
        return this instanceof 6dT ? "OverlayImagePlugin" : this instanceof LoadingSpinnerPlugin ? "LoadingSpinnerPlugin" : this instanceof 6eB ? "ThreadViewVideoUploadProgressTextPlugin" : this instanceof C6e7 ? "ThreadViewVideoTopGradientTintPlugin" : this instanceof 6eD ? "ThreadViewVideoStatusView" : this instanceof C6e1 ? "ThreadViewVideoPlayButton" : this instanceof C6e9 ? "ThreadViewVideoInfoButtonPlugin" : this instanceof 6eE ? "ThreadViewVideoMuteVolumePlugin" : this instanceof VideoPlugin ? ((VideoPlugin) this) instanceof 6dA ? "VideoSurfaceViewPlugin" : "VideoPlugin" : this instanceof CoverImagePlugin ? 7zK.A00(ActionId.FUTURE_LISTENERS_COMPLETE) : "SubtitlePlugin";
    }

    public void A0I() {
        ViewParent parent;
        if (this instanceof 6dL) {
            6dL r0 = (6dL) this;
            Queue queue = r0.A01;
            Iterator it = queue.iterator();
            while (it.hasNext()) {
                ((C6d6) it.next()).A0I();
            }
            ViewGroup viewGroup = r0.A01;
            if (viewGroup != null) {
                viewGroup.removeView(r0);
            } else {
                r0.A0g("pluginContainer", "detachPlugin");
            }
            while (!queue.isEmpty()) {
                6A8 r02 = (C6d6) queue.poll();
                if (!(r02 instanceof H2q)) {
                    if (r02 instanceof C6d5) {
                        ((C6d5) r02).A0j(null);
                    }
                    r0.addView((View) r02);
                }
            }
            r0.A01 = null;
            return;
        }
        while (true) {
            Queue queue2 = this.A0L;
            if (queue2.isEmpty()) {
                this.A00 = null;
                break;
            }
            View view = (View) queue2.poll();
            ViewGroup viewGroup2 = this.A01;
            if (viewGroup2 != null) {
                viewGroup2.removeView(view);
            } else {
                A0g("mPluginContainer", "detachInternal");
            }
            if (view != null && (parent = view.getParent()) != null) {
                ((ViewGroup) parent).removeView(view);
            }
            ViewGroup viewGroup3 = this.A00;
            if (viewGroup3 == null) {
                A0g("mChildContainer", "detachInternal");
                break;
            }
            viewGroup3.addView(view);
        }
        this.A01 = null;
        this.A0C = false;
    }

    public void A0J() {
    }

    public void A0K() {
        if (!(this instanceof 6dZ)) {
            if (this instanceof C6dv) {
                C6dv c6dv = (C6dv) this;
                if (c6dv.A01) {
                    ((LoadingSpinnerPlugin) c6dv).A04.setVisibility(4);
                    return;
                }
                return;
            }
            return;
        }
        6dZ r0 = (6dZ) this;
        6Tu r02 = r0.A08;
        if (r02 != null) {
            6UR B3e = r02.B3e();
            if (r02.B3f() == 6TN.A09) {
                if (B3e == null || !B3e.A00()) {
                    r0.A0m(true);
                }
            }
        }
    }

    public void A0L() {
        if (this instanceof LoadingSpinnerPlugin) {
            A0O();
            this.A08 = null;
        } else if (this instanceof 6dZ) {
            6dZ r0 = (6dZ) this;
            r0.A0O();
            6dZ.A04(r0);
        }
    }

    public void A0M() {
    }

    public void A0N() {
        A0O();
        A0P();
        this.A04 = null;
        this.A05 = null;
        this.A03 = null;
        this.A0O = null;
        this.A09 = null;
        this.A08 = null;
        this.A0B = false;
        this.A0E = false;
        this.A0H = false;
    }

    public void A0O() {
        6dM.A00((6U2) null, this.A06, this.A0N);
        this.A06 = null;
    }

    public void A0P() {
        A0M();
        this.A0A = null;
    }

    public final void A0Q() {
        if (this.A0G) {
            A0L();
            this.A0G = false;
        }
    }

    public final void A0R() {
        C00j.A07("%s.unload", C1km.A00(getClass()), 1009278283);
        try {
            A0M();
            6dM.A00((6U2) null, this.A06, this.A0N);
            this.A0E = false;
            this.A08 = null;
            this.A07 = null;
            C00j.A01(1415317320);
        } catch (Throwable th) {
            C00j.A01(-687283988);
            throw th;
        }
    }

    public final void A0S() {
        if (this.A0H) {
            if (this.A0G) {
                A0Q();
            }
            A0O();
            this.A08 = null;
            this.A07 = null;
            A0P();
            this.A0E = false;
            this.A0F = false;
            this.A0H = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A0T(ViewGroup viewGroup) {
        int i;
        if (!(this instanceof 6dL)) {
            if (this.A0C) {
                if (viewGroup != this.A01) {
                    String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe(AbE.A00(14), A0H(), "has already been attached to a RichVideoPlayer");
                    11T.A0A(formatStrLocaleSafe);
                    throw AnonymousClass001.A0N(formatStrLocaleSafe);
                }
                return;
            }
            this.A01 = viewGroup;
            while (((ViewGroup) this).getChildCount() > 0) {
                View childAt = ((ViewGroup) this).getChildAt(0);
                ((ViewGroup) this).removeView(childAt);
                if (this instanceof VideoPlugin) {
                    viewGroup.addView(childAt, 0);
                } else {
                    viewGroup.addView(childAt, -1);
                }
                this.A0L.add(childAt);
            }
            this.A00 = (ViewGroup) this;
            this.A0C = true;
            return;
        }
        6dL r0 = (6dL) this;
        r0.A01 = viewGroup;
        int childCount = r0.getChildCount();
        while (true) {
            int i2 = i;
            if (i2 >= childCount) {
                break;
            }
            Object childAt2 = r0.getChildAt(i2);
            if (childAt2 instanceof C6d5) {
                ((C6d5) childAt2).A0j(r0.A00);
            } else {
                i = childAt2 instanceof C6d6 ? 0 : i2 + 1;
            }
            r0.A01.add(childAt2);
        }
        Queue queue = r0.A01;
        Iterator it = queue.iterator();
        while (it.hasNext()) {
            r0.removeView((View) it.next());
        }
        queue.add(r0.A00);
        ViewParent parent = r0.getParent();
        if (parent != null) {
            ((ViewGroup) parent).removeView(r0);
        }
        viewGroup.addView(r0);
        Iterator it2 = queue.iterator();
        while (it2.hasNext()) {
            ((C6d6) it2.next()).A0T(r0);
        }
        ((6cS) r0).A03 = 2131368334;
        View findViewById = r0.findViewById(2131368334);
        ((6cS) r0).A06 = findViewById;
        if (findViewById == null) {
            throw AnonymousClass001.A0L("Invalid inner view resourceId specified.");
        }
    }

    public void A0U(6TN r302, PlayerOrigin playerOrigin, GRD grd, 6TI r305, 6U2 r306, C6ce c6ce, GRX grx) {
        11T.A0F(grd, 0);
        11T.A0F(playerOrigin, 1);
        11T.A0F(r302, 2);
        11T.A0F(r305, 3);
        11T.A0F(r306, 4);
        11T.A0F(grx, 5);
        this.A04 = grd;
        A0V(r302, playerOrigin, r305, r306, c6ce, grx);
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:?, code lost:
    
        throw r301;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0V(X.6TN r302, com.facebook.video.common.playerorigin.PlayerOrigin r303, X.6TI r304, X.6U2 r305, X.C6ce r306, X.GRX r307) {
        /*
            r301 = this;
            r0 = 0
            r308 = r0
            r0 = 0
            r309 = r0
            r0 = 1
            r310 = r0
            r0 = r301
            r1 = r305
            r0.A0f(r1)     // Catch: java.lang.Throwable -> Lc2
            r0 = r301
            r1 = r306
            r0.A08 = r1     // Catch: java.lang.Throwable -> Lc2
            r0 = r301
            r1 = r307
            r0.A09 = r1     // Catch: java.lang.Throwable -> Lc2
            r0 = r301
            r1 = r304
            r0.A05 = r1     // Catch: java.lang.Throwable -> Lc2
            r0 = r301
            r1 = r303
            r0.A03 = r1     // Catch: java.lang.Throwable -> Lc2
            r0 = r301
            r1 = r302
            r0.A0O = r1     // Catch: java.lang.Throwable -> Lc2
            r0 = r301
            r1 = r310
            r0.A0B = r1     // Catch: java.lang.Throwable -> Lc2
            r0 = r301
            r1 = 0
            r0.A0D = r1     // Catch: java.lang.Throwable -> Lc2
            r0 = r304
            java.lang.String r0 = r0.A03()     // Catch: java.lang.Throwable -> Lc2
            r309 = r0
            r0 = r301
            r1 = r309
            r0.A0A = r1     // Catch: java.lang.Throwable -> Lc2
            r0 = r301
            r1 = r304
            r0.A0Y(r1)     // Catch: java.lang.Throwable -> Lc2
            r0 = r301
            X.1Br r0 = r0.A0K     // Catch: java.lang.Throwable -> Lc2
            r309 = r0
            r0 = r309
            X.00i r0 = r0.A00     // Catch: java.lang.Throwable -> Lc2
            r309 = r0
            r0 = r309
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> Lc2
            r311 = r0
            r0 = r311
            X.7tq r0 = (X.C7tq) r0     // Catch: java.lang.Throwable -> Lc2
            r311 = r0
            r0 = r311
            boolean r0 = r0.A01     // Catch: java.lang.Throwable -> Lc2
            r308 = r0
            r0 = r308
            if (r0 != 0) goto L95
            r0 = r311
            X.1CO r0 = r0.A02     // Catch: java.lang.Throwable -> Lc2
            r312 = r0
            r0 = 36312574118073208(0x81021801301378, double:3.027556319044561E-306)
            r313 = r0
            r0 = r312
            r1 = r313
            boolean r0 = X.2yD.A04(r0, r1)     // Catch: java.lang.Throwable -> Lc2
            r308 = r0
            r0 = r311
            r1 = r308
            r0.A00 = r1     // Catch: java.lang.Throwable -> Lc2
            r0 = r311
            r1 = r310
            r0.A01 = r1     // Catch: java.lang.Throwable -> Lc2
            goto L9c
        L95:
            r0 = r311
            boolean r0 = r0.A00     // Catch: java.lang.Throwable -> Lc2
            r308 = r0
        L9c:
            r0 = r308
            if (r0 != 0) goto Lb5
            r0 = r301
            X.6U2 r0 = r0.A06     // Catch: java.lang.Throwable -> Lc2
            r312 = r0
            r0 = r301
            java.util.List r0 = r0.A0N     // Catch: java.lang.Throwable -> Lc2
            r309 = r0
            r0 = r312
            r1 = 0
            r2 = r309
            X.6dM.A00(r0, r1, r2)     // Catch: java.lang.Throwable -> Lc2
        Lb5:
            r0 = r301
            r1 = r310
            r0.A0E = r1     // Catch: java.lang.Throwable -> Lc2
            r0 = r301
            r1 = r310
            r0.A0H = r1     // Catch: java.lang.Throwable -> Lc2
            return
        Lc2:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6d6.A0V(X.6TN, com.facebook.video.common.playerorigin.PlayerOrigin, X.6TI, X.6U2, X.6ce, X.GRX):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:?, code lost:
    
        throw r301;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:?, code lost:
    
        throw r301;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0W(X.6TN r302, com.facebook.video.common.playerorigin.PlayerOrigin r303, X.6TI r304, X.C6ce r305) {
        /*
            r301 = this;
            r0 = r301
            boolean r0 = r0.A0H
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L44
            r0 = r301
            X.6ce r0 = r0.A08
            r307 = r0
            r0 = r307
            r1 = r305
            if (r0 != r1) goto L44
            r0 = r301
            X.6cT r0 = r0.A07
            r307 = r0
            r0 = r307
            r1 = 0
            if (r0 != r1) goto L44
            r0 = r301
            com.facebook.video.common.playerorigin.PlayerOrigin r0 = r0.A03
            r307 = r0
            r0 = r303
            r1 = r307
            if (r0 != r1) goto L44
            r0 = r304
            java.lang.String r0 = r0.A03()
            r308 = r0
            r0 = r301
            java.lang.String r0 = r0.A0A
            r307 = r0
            r0 = r308
            r1 = r307
            if (r0 != r1) goto L44
            return
        L44:
            r0 = r301
            r1 = r305
            r0.A08 = r1     // Catch: java.lang.Throwable -> Lb5
            r0 = r301
            r1 = 0
            r0.A07 = r1     // Catch: java.lang.Throwable -> Lb5
            r0 = r301
            r1 = r303
            r0.A03 = r1     // Catch: java.lang.Throwable -> Lb5
            r0 = r301
            r1 = r302
            r0.A0O = r1     // Catch: java.lang.Throwable -> Lb5
            r0 = r301
            boolean r0 = r0.A0F     // Catch: java.lang.Throwable -> Lb5
            r306 = r0
            r0 = r306
            if (r0 != 0) goto L86
            r0 = r301
            r1 = r304
            r0.A0X(r1)     // Catch: java.lang.Throwable -> L81
            r0 = 1
            r306 = r0
            r0 = r301
            r1 = r306
            r0.A0F = r1     // Catch: java.lang.Throwable -> L81
            r0 = r304
            java.lang.String r0 = r0.A03()     // Catch: java.lang.Throwable -> L81
            r307 = r0
            r0 = r301
            r1 = r307
            r0.A0A = r1     // Catch: java.lang.Throwable -> L81
            goto L86
        L81:
            r307 = move-exception
            r0 = r307
            throw r0     // Catch: java.lang.Throwable -> Lb5
        L86:
            r0 = r301
            r1 = r304
            r0.A0Y(r1)     // Catch: java.lang.Throwable -> Lb5
            r0 = r301
            X.6U2 r0 = r0.A06     // Catch: java.lang.Throwable -> Lb5
            r308 = r0
            r0 = r301
            java.util.List r0 = r0.A0N     // Catch: java.lang.Throwable -> Lb5
            r307 = r0
            r0 = r308
            r1 = 0
            r2 = r307
            X.6dM.A00(r0, r1, r2)     // Catch: java.lang.Throwable -> Lb5
            r0 = r304
            java.lang.String r0 = r0.A03()     // Catch: java.lang.Throwable -> Lb5
            r307 = r0
            r0 = r301
            r1 = r307
            r0.A0A = r1     // Catch: java.lang.Throwable -> Lb5
            r0 = 1
            r306 = r0
            r0 = r301
            r1 = r306
            r0.A0H = r1     // Catch: java.lang.Throwable -> Lb5
            return
        Lb5:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6d6.A0W(X.6TN, com.facebook.video.common.playerorigin.PlayerOrigin, X.6TI, X.6ce):void");
    }

    public void A0X(6TI r302) {
    }

    public void A0Y(6TI r302) {
        if (r302 != null) {
            A0e(r302, true);
        }
    }

    public void A0Z(6TI r302) {
        A0M();
        A0e(r302, true);
    }

    /* JADX WARN: Type inference failed for: r0v39, types: [com.facebook.drawee.view.DraweeView, com.facebook.drawee.fbpipeline.FbDraweeView] */
    public void A0a(6TI r302, 6U2 r303, C6ce c6ce) {
        if (this instanceof LoadingSpinnerPlugin) {
            LoadingSpinnerPlugin loadingSpinnerPlugin = (LoadingSpinnerPlugin) this;
            loadingSpinnerPlugin.A0f(r303);
            ((C6d6) loadingSpinnerPlugin).A08 = c6ce;
            LoadingSpinnerPlugin.A00(loadingSpinnerPlugin, false);
            return;
        }
        if (!(this instanceof 6dZ)) {
            if (this instanceof VideoPlugin) {
                VideoPlugin videoPlugin = (VideoPlugin) this;
                if (VideoPlugin.A02(r302, videoPlugin, false)) {
                    videoPlugin.A0k();
                    if (!(videoPlugin instanceof C6d9)) {
                        videoPlugin.A0l();
                    }
                }
                VideoPlugin.A01(videoPlugin, false);
                return;
            }
            String str = this.A0A;
            String A03 = r302.A03();
            if (11T.A0O(str, A03)) {
                return;
            }
            A0e(r302, false);
            this.A0A = A03;
            return;
        }
        6dZ r0 = (6dZ) this;
        r0.A08 = c6ce;
        r0.A0f(r303);
        6dZ.A04(r0);
        ?? r02 = r0.A02;
        if (r02 == 0) {
            throw 1BK.A0h();
        }
        if (r02.A00.A01 != null) {
            if (!6dZ.A07(r0.A03, r302)) {
                return;
            }
            6dZ.A08(r302, r0);
            r0.A03 = r302;
        }
        if (r0.A0D) {
            return;
        }
        C69t A08 = ((C69s) r0.A0A.A00.get()).A08();
        11T.A0A(A08);
        if (A08 instanceof 6A2) {
            6dZ.A02(A08, r302);
        }
        r02.A06(A08);
        6dZ.A00((FbDraweeView) r02, r302);
        6dZ.A04(r0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:?, code lost:
    
        throw r301;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0b(X.6TI r302, X.6U2 r303, X.C6ce r304) {
        /*
            r301 = this;
            r0 = 1
            r305 = r0
            r0 = r302
            r1 = r305
            X.11T.A0F(r0, r1)
            r0 = r303
            r1 = 2
            X.11T.A0F(r0, r1)
            r0 = r301
            boolean r0 = r0.A0H
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L34
            r0 = r301
            r1 = r302
            r2 = r303
            r3 = r304
            r0.A0a(r1, r2, r3)     // Catch: java.lang.Throwable -> L33
            r0 = r302
            java.lang.String r0 = r0.A03()     // Catch: java.lang.Throwable -> L33
            r307 = r0
            r0 = r301
            r1 = r307
            r0.A0A = r1     // Catch: java.lang.Throwable -> L33
            r0 = r301
            r1 = r305
            r0.A0G = r1     // Catch: java.lang.Throwable -> L33
            return
        L33:
            throw r0
        L34:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6d6.A0b(X.6TI, X.6U2, X.6ce):void");
    }

    public final void A0c(6TI r302, 6cT r303, C6ce c6ce) {
        Object obj;
        if (r302 != null) {
            C00j.A07("%s.load", C1km.A00(getClass()), 1193126659);
            boolean z = false;
            try {
                this.A0D = false;
                this.A08 = c6ce;
                this.A07 = r303;
                if (!this.A0E && r302.A02("LogContext") != null && (r302.A02("LogContext") instanceof 3TI)) {
                    3TI r0 = (3TI) r302.A02("LogContext");
                    String A0H = A0H();
                    3IW r310 = null;
                    if (r0 == null) {
                        obj = null;
                    } else {
                        obj = r0.A00;
                        r310 = r0.A03;
                    }
                    3TI r02 = new 3TI(r310, r0, obj, A0H);
                    this.A02 = r02;
                    3G0.A00(r02, 86, -2);
                }
                if (!this.A0E) {
                    z = true;
                }
                A0e(r302, z);
                if (!this.A0E) {
                    6dM.A00(this.A06, (6U2) null, this.A0N);
                }
                this.A0E = true;
                this.A0H = true;
                C00j.A01(428845952);
            } catch (Throwable th) {
                C00j.A01(-722291004);
                throw th;
            }
        }
    }

    public final void A0d(6TI r302, 6cT r303, C6ce c6ce) {
        11T.A0F(r302, 2);
        C00j.A07("%s.reload", C1km.A00(getClass()), 121507422);
        try {
            this.A0D = false;
            this.A08 = c6ce;
            this.A07 = r303;
            6dM.A00(this.A06, (6U2) null, this.A0N);
            A0Z(r302);
            this.A0E = true;
            C00j.A01(1254109211);
        } catch (Throwable th) {
            C00j.A01(-2100039854);
            throw th;
        }
    }

    public void A0e(6TI r302, boolean z) {
    }

    public void A0f(6U2 r302) {
        6U2 r0 = this.A06;
        if (r302 != r0) {
            6dM.A00(r302, r0, this.A0N);
            this.A06 = r302;
        }
    }

    public final void A0g(String str, String str2) {
        String str3;
        String str4;
        6Tu r0 = this.A08;
        str3 = "NA";
        if (r0 != null) {
            PlayerOrigin B3c = r0.B3c();
            String obj = B3c != null ? B3c.toString() : str3;
            6TN B3f = r0.B3f();
            str4 = B3f != null ? B3f.value : "NA";
            str3 = obj;
        } else {
            str4 = str3;
        }
        PlayerOrigin playerOrigin = this.A03;
        if (playerOrigin != null) {
            str3 = playerOrigin.toString();
        }
        1Br.A04(this.A0I).D11("RichVideoPlayerPlugin", StringFormatUtil.formatStrLocaleSafe("[%s]%s is null when calling %s(), isAttached: %s, isInitialized: %s, Player Origin: %s, Player Format: %s", A0H(), str, str2, String.valueOf(this.A0C), String.valueOf(this.A0E), str3, str4));
    }

    public final void A0h(6TJ... r302) {
        11T.A0F(r302, 0);
        int length = r302.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                return;
            }
            6TJ r0 = r302[i2];
            if (r0 != null) {
                this.A0N.add(r0);
            }
            i = i2 + 1;
        }
    }

    public final void A0i(6TJ... r302) {
        11T.A0F(r302, 0);
        int length = r302.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                return;
            }
            6TJ r0 = r302[i2];
            if (r0 != null) {
                this.A0N.remove(r0);
            }
            i = i2 + 1;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00c0, code lost:
    
        if (r310 == null) goto L12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void CgE(X.6TX r302) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6d6.CgE(X.6TX):void");
    }
}
