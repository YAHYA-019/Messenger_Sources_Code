package com.facebook.video.player;

import X.0FI;
import X.0PP;
import X.0Pz;
import X.0S2;
import X.0fH;
import X.11T;
import X.1BQ;
import X.1BV;
import X.1Bi;
import X.1Bn;
import X.1CO;
import X.1GD;
import X.1GU;
import X.1HH;
import X.1Iw;
import X.1gM;
import X.1vU;
import X.2CF;
import X.2yD;
import X.4CE;
import X.4YU;
import X.4qV;
import X.5Fu;
import X.5KL;
import X.5Kv;
import X.5TE;
import X.5YB;
import X.67N;
import X.6TF;
import X.6TI;
import X.6TM;
import X.6TN;
import X.6TU;
import X.6TW;
import X.6TX;
import X.6Te;
import X.6U2;
import X.6U5;
import X.6U7;
import X.6U9;
import X.6UA;
import X.6UF;
import X.6UR;
import X.6UZ;
import X.6Um;
import X.6VI;
import X.6cS;
import X.6cT;
import X.6cV;
import X.6dF;
import X.6dK;
import X.6dT;
import X.6dZ;
import X.7Qm;
import X.81Z;
import X.82P;
import X.AFR;
import X.AHe;
import X.AnonymousClass001;
import X.AnonymousClass016;
import X.C00i;
import X.C00j;
import X.C01o;
import X.C15h;
import X.C1F6;
import X.C1km;
import X.C4s1;
import X.C52j;
import X.C69w;
import X.C6cd;
import X.C6ce;
import X.C6cf;
import X.C6cg;
import X.C6cy;
import X.C6cz;
import X.C6d0;
import X.C6d5;
import X.C6d6;
import X.C6d9;
import X.C7lz;
import X.GOm;
import X.GPl;
import X.GPp;
import X.GPr;
import X.GPs;
import X.GQW;
import X.GRD;
import X.GRS;
import X.GRX;
import X.H2p;
import X.H31;
import X.HAM;
import X.I0K;
import X.IgQ;
import X.JDT;
import X.JQP;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.AudioManager;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.SparseBooleanArray;
import android.view.View;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.common.util.TriState;
import com.facebook.drawee.fbpipeline.FbDraweeView;
import com.facebook.inject.FbInjector;
import com.facebook.litho.LithoView;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.video.common.playerorigin.PlayerOrigin;
import com.facebook.video.engine.api.VideoDataSource;
import com.facebook.video.engine.api.VideoPlayerParams;
import com.facebook.video.player.RichVideoPlayer;
import com.facebook.video.plugins.VideoControlPlugin;
import com.facebook.video.plugins.common.VideoPlugin;
import com.google.common.base.Objects;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: RichVideoPlayer.class */
public class RichVideoPlayer extends 6cS implements 6cT, 6Te, CallerContextable {
    public static final List A0t = Arrays.asList("REGULAR_360_VIDEO", "LIVE_360_VIDEO", "PREVIOUSLY_LIVE_360_VIDEO");
    public static final Set A0u = Collections.newSetFromMap(new WeakHashMap());
    public float A00;
    public int A01;
    public C69w A02;
    public C00i A03;
    public C00i A04;
    public C00i A05;
    public C00i A06;
    public C00i A07;
    public C00i A08;
    public 6TM A09;
    public 6TN A0A;
    public C52j A0B;
    public 6dK A0C;
    public GPs A0D;
    public 6UF A0E;
    public 6TI A0F;
    public 6TI A0G;
    public JDT A0H;
    public 6U2 A0I;
    public Integer A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public FbDraweeView A0N;
    public C00i A0O;
    public C00i A0P;
    public C00i A0Q;
    public C00i A0R;
    public C00i A0S;
    public C00i A0T;
    public C00i A0U;
    public C00i A0V;
    public C15h A0W;
    public boolean A0X;
    public final Rect A0Y;
    public final C00i A0Z;
    public final C00i A0a;
    public final C00i A0b;
    public final C00i A0c;
    public final C00i A0d;
    public final C00i A0e;
    public final C00i A0f;
    public final C00i A0g;
    public final 82P A0h;
    public final 6cV A0i;
    public final C6cg A0j;
    public final AtomicBoolean A0k;
    public final boolean A0l;
    public final AudioManager A0m;
    public final C00i A0n;
    public final C00i A0o;
    public final C6cd A0p;
    public volatile Pair A0q;
    public volatile PlayerOrigin A0r;
    public volatile Boolean A0s;

    public RichVideoPlayer(Context context) {
        this(context, null);
    }

    public RichVideoPlayer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RichVideoPlayer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A0n = new 1BQ(16385);
        this.A0f = new 1BQ(115830);
        this.A0d = new 1BQ(49322);
        this.A0g = new 1BQ(49694);
        1BQ r0 = new 1BQ(116105);
        this.A0o = r0;
        this.A0a = new 1BQ(50109);
        this.A0Z = new 1BQ(82042);
        this.A0b = new 1BQ(16936);
        this.A0c = new 1BQ(16385);
        this.A0e = new 1BQ(115826);
        this.A0k = new AtomicBoolean(false);
        this.A0r = PlayerOrigin.A0g;
        this.A0A = 6TN.A0F;
        this.A09 = 6TM.A05;
        this.A0B = C52j.A2Z;
        this.A0J = 0S2.A01;
        this.A0Y = new Rect();
        this.A0q = new Pair(false, "");
        this.A0h = new 82P(this, 6);
        this.A0O = new 1BQ(16458);
        this.A05 = new 1BQ(83603);
        this.A06 = new 1BV(context, 423);
        this.A0P = new 1BV(context, 99954);
        this.A0W = new AHe(this, 64);
        this.A04 = new 1BQ(82100);
        this.A0T = new 1BV(100187);
        this.A03 = new 1BV(16453);
        this.A07 = new 1BQ(16520);
        this.A0Q = new 1BQ(115902);
        this.A0S = new 1BQ(115898);
        1BV r02 = new 1BV(424);
        this.A0R = r02;
        this.A0U = new 1HH(context, 49734);
        this.A08 = new 1HH(context, 115833);
        this.A0V = new 1HH(context, 115906);
        C1F6 c1f6 = (C1F6) r02.get();
        Context A01 = FbInjector.A01();
        FbInjector.A04(c1f6.B92().Aqm());
        1Bn.A0M(c1f6);
        try {
            6cV r03 = new 6cV(context);
            1Bn.A0K();
            FbInjector.A04(A01);
            this.A0i = r03;
            this.A0p = new C6cd(r03);
            ((C6cf) r0.get()).A01(hashCode());
            C00j.A05("RichVideoPlayer.create", -1155676501);
            try {
                this.A0m = (AudioManager) context.getSystemService("audio");
                1GU r04 = (1GU) this.A0O.get();
                this.A08.get();
                C6cg c6cg = new C6cg(r04, this);
                this.A0j = c6cg;
                c6cg.A00 = (1CO) 1Bi.A03(16385);
                A01();
                C6cz c6cz = (C6cz) this.A0Z.get();
                final C6d0 c6d0 = new C6d0(this);
                ((1vU) c6cz.A00.A00.get()).A01(new Runnable() { // from class: X.6d1
                    public static final String __redex_internal_original_name = "FacecastLiveWithFeature$checkLiveWithGuestEnabled$1";

                    @Override // java.lang.Runnable
                    public final void run() {
                        RichVideoPlayer richVideoPlayer = C6d0.this.A00;
                        82P r05 = richVideoPlayer.A0h;
                        6U2 r06 = richVideoPlayer.A0I;
                        if (r06 != null) {
                            r06.A05(r05);
                        }
                    }
                });
                1gM r05 = (5TE) this.A0U.get();
                synchronized (r05) {
                    if (!((5TE) r05).A01) {
                        Context context2 = ((5TE) r05).A03;
                        if (AnonymousClass016.A00(context2, FbFragmentActivity.class) != null) {
                            ((FbFragmentActivity) AnonymousClass016.A00(context2, FbFragmentActivity.class)).A5D(r05);
                            final 81Z r06 = (81Z) ((5TE) r05).A07.get();
                            r06.A03.set(r05);
                            r06.A02.set(new C01o(new IgQ(r06, 5), "android.intent.action.HDMI_PLUGGED"));
                            r06.A00();
                            ((Executor) r06.A01.get()).execute(new Runnable() { // from class: X.81b
                                public static final String __redex_internal_original_name = "HDMIConnectionListener$2";

                                /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
                                    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r308v0 ??, still in use, count: 2, list:
                                      (r308v0 ??) from 0x0060: PHI (r308v1 ??) = (r308v0 ??), (r308v2 ??) binds: [B:10:0x0030, B:18:0x004c] A[DONT_GENERATE, DONT_INLINE]
                                      (r308v0 ?? I:java.io.File) from 0x0029: INVOKE (r0v23 ?? I:boolean) = (r308v0 ?? I:java.io.File) VIRTUAL call: java.io.File.exists():boolean A[Catch: Exception -> 0x0080, all -> 0x00c8, MD:():boolean (c)]
                                    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
                                    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
                                    	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:80)
                                    	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1107)
                                    	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1118)
                                    	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1156)
                                    	at jadx.core.dex.visitors.ConstructorVisitor.removeAssignChain(ConstructorVisitor.java:180)
                                    	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:80)
                                    	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:51)
                                    	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:34)
                                    */
                                @Override // java.lang.Runnable
                                public void run() {
                                    /*
                                        Method dump skipped, instructions count: 208
                                        To view this dump change 'Code comments level' option to 'DEBUG'
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: X.C81b.run():void");
                                }
                            });
                            ((5TE) r05).A01 = true;
                        }
                    }
                    ((5TE) r05).A0E.add(new WeakReference(this));
                }
                this.A0l = ((TriState) this.A0W.get()).asBoolean(false);
                A0u.add(this);
                C00j.A01(-2066049231);
            } catch (Throwable th) {
                C00j.A01(270702027);
                throw th;
            }
        } catch (Throwable th2) {
            1Bn.A0K();
            FbInjector.A04(A01);
            throw th2;
        }
    }

    private CallerContext A00() {
        CallerContext callerContext;
        6TI r0 = this.A0F;
        return (r0 == null || (callerContext = r0.A02) == null) ? CallerContext.A06(getClass()) : callerContext;
    }

    private void A01() {
        if (this.A0I == null) {
            1GU r0 = (1GU) this.A0O.get();
            Handler handler = (Handler) this.A03.get();
            this.A0c.get();
            this.A07.get();
            6U2 r02 = new 6U2(handler, r0);
            synchronized (r02) {
            }
            if (r02 != this.A0I) {
                C6cg c6cg = this.A0j;
                if (c6cg.A01 != null) {
                    for (67N r03 : c6cg.A0N) {
                        6U2 r04 = c6cg.A01;
                        if (r04 != null) {
                            r04.A04(r03);
                        }
                    }
                }
                c6cg.A01 = r02;
                for (67N r05 : c6cg.A0N) {
                    6U2 r06 = c6cg.A01;
                    if (r06 != null) {
                        r06.A05(r05);
                    }
                }
                r02.A05(((C6cy) this.A0a.get()).A00);
                this.A0I = r02;
                6dK r07 = this.A0C;
                if (r07 != null) {
                    r07.A03 = r02;
                    Iterator it = r07.A0A.iterator();
                    while (it.hasNext()) {
                        ((C6d6) it.next()).A0f(r02);
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:158:0x04ec, code lost:
    
        if (r307 != null) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x051a, code lost:
    
        if (r307 != null) goto L146;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v365, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r302v0, types: [com.facebook.video.player.RichVideoPlayer, android.view.View, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A02(X.C52j r301, com.facebook.video.player.RichVideoPlayer r302, int r303) {
        /*
            Method dump skipped, instructions count: 1612
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.video.player.RichVideoPlayer.A02(X.52j, com.facebook.video.player.RichVideoPlayer, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0238, code lost:
    
        if (r307 == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:627:0x0562, code lost:
    
        if (r0.BUs() != false) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0437, code lost:
    
        if (r0.equals(r306.A03()) == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:732:0x07a2, code lost:
    
        if (r314.A0H == r0.A0H) goto L235;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:523:0x0f95 A[Catch: all -> 0x1029, TRY_ENTER, TRY_LEAVE, TryCatch #5 {all -> 0x1029, blocks: (B:478:0x0e6a, B:481:0x0e74, B:487:0x0e87, B:490:0x0e93, B:491:0x0e9a, B:494:0x0ea6, B:497:0x0eb2, B:499:0x0ec4, B:500:0x0ec8, B:500:0x0ec8, B:504:0x0ed4, B:507:0x0ee0, B:510:0x0eec, B:513:0x0ef8, B:515:0x0eff, B:518:0x0f7f, B:520:0x0f86, B:523:0x0f95, B:525:0x0fa8, B:526:0x0faf, B:529:0x0fbb, B:533:0x0fca, B:534:0x0fd1, B:536:0x0fee, B:537:0x0ff5, B:538:0x0ffc, B:540:0x1012, B:544:0x0f07, B:547:0x0f13, B:552:0x0f24, B:555:0x0f30, B:557:0x0f39, B:560:0x0f45, B:561:0x0f4d, B:562:0x0f54, B:565:0x0f60, B:568:0x0f6c, B:570:0x0f73), top: B:477:0x0e6a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A03(com.facebook.video.player.RichVideoPlayer r301, X.6TI r302, boolean r303, boolean r304) {
        /*
            Method dump skipped, instructions count: 4306
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.video.player.RichVideoPlayer.A03(com.facebook.video.player.RichVideoPlayer, X.6TI, boolean, boolean):void");
    }

    private void A04(6TI r302) {
        C00i c00i = this.A0o;
        ((QuickPerformanceLogger) ((C6cf) c00i.get()).A01.A00.get()).markerAnnotate(1900570, hashCode(), "playerOrigin", this.A0r.toString());
        if (r302 != null) {
            ((QuickPerformanceLogger) ((C6cf) c00i.get()).A01.A00.get()).markerAnnotate(1900570, hashCode(), "videoFormat", r302.A04() ? "live" : "vod");
        }
    }

    private void A05(6TI r302) {
        6TI r0 = this.A0F;
        if (r0 != null && Objects.equal(r0.A03(), r302.A03())) {
            6TI r02 = this.A0F;
            6TF r03 = new 6TF();
            if (r02 != null) {
                r03.A02(r02);
            }
            r03.A02(r302);
            r302 = r03.A01();
        }
        this.A0F = r302;
    }

    public static boolean A06(5Kv r301, PlayerOrigin playerOrigin, 6TI r303) {
        boolean z;
        VideoPlayerParams videoPlayerParams;
        boolean z2;
        if (r303 == null || (videoPlayerParams = r303.A03) == null) {
            z = false;
        } else {
            GQW A01 = GPp.A01(r303);
            if (!videoPlayerParams.A1N) {
                if (r301.A2q) {
                    z2 = r301.A2p;
                } else {
                    z2 = r301.A3g.AZr(1GD.A06, 36311719431507223L);
                    r301.A2p = z2;
                    r301.A2q = true;
                }
                z = z2 & (!A0t.contains(A01.name()));
                Iterator it = Collections.singletonList("background_play").iterator();
                while (it.hasNext()) {
                    z &= !playerOrigin.toString().contains((String) it.next());
                }
            } else if (r301.A2o) {
                z = r301.A2n;
            } else {
                z = 2yD.A04(r301.A3g, 36311719431572760L);
                r301.A2n = z;
                r301.A2o = true;
            }
        }
        List singletonList = Collections.singletonList("simple_picker");
        if (!z && playerOrigin != PlayerOrigin.A0g) {
            Iterator it2 = singletonList.iterator();
            while (it2.hasNext()) {
                if (playerOrigin.toString().contains((String) it2.next())) {
                    z = true;
                }
            }
        }
        return z;
    }

    public static boolean A07(RichVideoPlayer richVideoPlayer) {
        6TI r0;
        synchronized (richVideoPlayer) {
            r0 = richVideoPlayer.A0F;
        }
        return A06((5Kv) richVideoPlayer.A0S.get(), richVideoPlayer.A0r, r0);
    }

    public static boolean A08(RichVideoPlayer richVideoPlayer, 6TI r302) {
        return A06((5Kv) richVideoPlayer.A0S.get(), richVideoPlayer.A0r, r302);
    }

    public int A0D() {
        AudioManager audioManager = this.A0m;
        int streamVolume = audioManager.getStreamVolume(3);
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        if (streamMaxVolume == 0) {
            return 0;
        }
        return (streamVolume * 100) / streamMaxVolume;
    }

    public FbDraweeView A0E() {
        FbDraweeView fbDraweeView = this.A0N;
        if (fbDraweeView == null) {
            Iterator it = A0F().A0A.iterator();
            while (true) {
                if (!it.hasNext()) {
                    fbDraweeView = null;
                    break;
                }
                6dZ r0 = (C6d6) it.next();
                if (r0 instanceof 6dZ) {
                    fbDraweeView = r0.A02;
                    break;
                }
            }
            this.A0N = fbDraweeView;
        }
        return fbDraweeView;
    }

    public final 6dK A0F() {
        6dK r302 = this.A0C;
        if (r302 == null) {
            r302 = new 6dK((1GU) this.A0O.get(), this.A0n, (4CE) this.A08.get(), this, this.A0I);
            this.A0C = r302;
        }
        return r302;
    }

    public void A0G() {
        Iterator it = A0F().A0A.iterator();
        while (it.hasNext()) {
            it.next();
        }
        6TI r0 = this.A0F;
        if (r0 == null || A08(this, r0)) {
            return;
        }
        5YB A0E = A0E();
        this.A02 = A0E != null ? A0E.A00.A01 : null;
        GPs gPs = this.A0D;
        if (gPs != null) {
            this.A01 = gPs.Afn();
            GPs gPs2 = this.A0D;
            this.A0J = gPs2.BJc();
            if (gPs2.A06.BXL()) {
                this.A00 = this.A0D.A06.BKU();
            }
        }
        6TI r02 = this.A0F;
        if (B3f() == 6TN.A09) {
            this.A05.get();
        }
        A0H();
        this.A0G = r02;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A0H() {
        boolean z;
        GPl gPl;
        if (A08(this, this.A0F)) {
            6cV r0 = this.A0i;
            LithoView lithoView = r0.A00;
            if (lithoView != null) {
                removeView(lithoView);
                6U2 r02 = r0.A04;
                if (r02 != null && (gPl = r0.A05) != null) {
                    r02.A04(gPl);
                }
                r0.A00 = null;
                z = true;
            } else {
                z = false;
            }
            r0.A02 = null;
            r0.A05 = null;
            r0.A0C.clear();
            r0.A06 = null;
            r0.A04 = null;
            r0.A01 = 6TN.A0F;
            if (z) {
                this.A0I = null;
                A01();
            }
            this.A0F = null;
            return;
        }
        this.A0q = new Pair(false, "");
        if (this.A0H != null) {
            this.A0H = null;
        }
        this.A0F = null;
        this.A0G = null;
        6dK r03 = this.A0C;
        if (r03 != null) {
            r03.A01 = null;
            6dK.A00();
            C00j.A05("RichVideoPlayer.unload", -1337971486);
            try {
                for (C6d6 c6d6 : r03.A0A) {
                    C00j.A07("%s.unload", C1km.A00(c6d6.getClass()), 701738344);
                    c6d6.A0R();
                    C00j.A01(1343159120);
                }
                GPs gPs = r03.A00;
                if (gPs != null) {
                    0fH.A0j(GOm.A00(42), "Player UI reset");
                    GPr gPr = gPs.A06;
                    if (gPr instanceof GPr) {
                        gPr.A00();
                    }
                    if (4qV.A00((4qV) gPs.A0S.get()).AZk(36311723707206981L)) {
                        GPs.A05(gPs);
                    }
                    GPs.A07(gPs);
                }
                C00j.A01(1623714455);
            } catch (Throwable th) {
                C00j.A01(1807251675);
                throw th;
            }
        }
        this.A0i.A0F.set(false);
    }

    public void A0I(RectF rectF) {
        VideoPlayerParams videoPlayerParams;
        VideoDataSource videoDataSource;
        VideoPlugin videoPlugin = A0F().A04;
        if (videoPlugin != null) {
            videoPlugin.A02 = new RectF(rectF);
            6TI r0 = this.A0F;
            if (r0 == null || (videoPlayerParams = r0.A03) == null || (videoDataSource = videoPlayerParams.A0V) == null) {
                return;
            }
            videoDataSource.A00.set(rectF);
            GPs gPs = this.A0D;
            if (gPs != null) {
                gPs.A06.D8H(rectF);
            }
        }
    }

    public void A0J(6TN r302) {
        StringBuilder sb = new StringBuilder();
        sb.append("setPlayerType=");
        sb.append(r302);
        0fH.A0j("RichVideoPlayer", sb.toString());
        this.A0A = r302;
        GPs gPs = this.A0D;
        if (gPs != null) {
            gPs.A04 = r302;
            gPs.A06.Csw(r302);
        }
    }

    public void A0K(C52j c52j, float f) {
        6U2 A07;
        if (!A07(this)) {
            GPs gPs = this.A0D;
            if (gPs != null) {
                gPs.A0E(c52j, f);
                return;
            }
            return;
        }
        6cV r0 = this.A0i;
        11T.A0F(c52j, 1);
        GRD A00 = 6cV.A00(r0);
        if (A00 == null || (A07 = A00.A07()) == null) {
            return;
        }
        A07.A06(new 6U7(c52j, f));
    }

    public void A0L(C52j c52j, int i) {
        6U2 r308;
        int Afn;
        6UA r315;
        VideoPlayerParams videoPlayerParams;
        6TI r0 = this.A0F;
        if (r0 != null && (videoPlayerParams = r0.A03) != null) {
            boolean z = videoPlayerParams.A1F;
            if (z && c52j == C52j.A04) {
                r308 = this.A0I;
                if (A07(this)) {
                    6cV r02 = this.A0i;
                    Afn = r02.A02().A01(r02.A02, r02.A06);
                } else {
                    GPs gPs = this.A0D;
                    Afn = gPs == null ? 0 : gPs.AUv();
                }
                11T.A0F(c52j, 4);
                r315 = new 6UA(c52j, i, -1, Afn, false, false);
                r308.A06(r315);
            }
            if (z && c52j != C52j.A1Q && c52j != C52j.A05) {
                r308 = this.A0I;
                11T.A0F(c52j, 3);
                r315 = new 6UA(c52j, -1, i, -1, false, false);
                r308.A06(r315);
            }
        }
        r308 = this.A0I;
        Afn = Afn();
        11T.A0F(c52j, 4);
        r315 = new 6UA(c52j, i, -1, Afn, false, false);
        r308.A06(r315);
    }

    public void A0M(PlayerOrigin playerOrigin) {
        this.A0r = playerOrigin;
        GPs gPs = this.A0D;
        if (gPs != null) {
            gPs.A06.Csu(playerOrigin);
        }
    }

    public void A0N(6TI r302) {
        synchronized (this) {
            ((C6cf) this.A0o.get()).A01(hashCode());
            A04(r302);
            A03(this, r302, false, false);
        }
    }

    public void A0O(6TI r302) {
        synchronized (this) {
            C00i c00i = this.A0b;
            if (((2CF) c00i.get()).A01 || !((2CF) c00i.get()).A00()) {
                ((C6cf) this.A0o.get()).A01(hashCode());
                A04(r302);
                A03(this, r302, true, false);
            } else {
                ((1GU) this.A0O.get()).CY2(new AFR(this, r302), 500L);
            }
        }
    }

    public void A0P(C6d6 c6d6) {
        JDT jdt;
        if (A08(this, this.A0F)) {
            0fH.A0g(4YU.A14(this), "RichVideoPlayer", "Skipping plugin add for player [%s] since using groot fallback");
            HAM A0G = c6d6.A0G();
            6cV r0 = this.A0i;
            11T.A0F(A0G, 0);
            r0.A0D.add(A0G);
            return;
        }
        if (!((5KL) this.A0f.get()).A00() && !(c6d6 instanceof VideoPlugin) && !(c6d6 instanceof 6dZ) && !(c6d6 instanceof 6dT) && !(c6d6 instanceof H2p) && !(c6d6 instanceof H31) && !(c6d6 instanceof VideoControlPlugin)) {
            String A0X = AnonymousClass001.A0X(c6d6);
            if (!A0X.equals("WnGQueueingPlugin") && !A0X.equals("PlayDownloadAfterPlaybackPlugin") && !A0X.equals("CallToActionEndscreenBasePlugin") && !A0X.equals("PlayButtonPlugin") && !A0X.equals("ThreadViewVideoPlayButton")) {
                return;
            }
        }
        0fH.A0a(0PP.A00(c6d6), c6d6.A0H(), Integer.toHexString(hashCode()), "RichVideoPlayer", "Adding plugin[%s] %s to player[%s]");
        6dK A0F = A0F();
        4CE r02 = A0F.A07;
        boolean z = r02.A03;
        boolean z2 = c6d6 instanceof VideoPlugin;
        if (z2) {
            if ((z ? r02.A00 : ((2yD) r02.A02.A00.get()).AZk(36311727989787999L)) && A0F.A08.A0F().A04 != null) {
                0fH.A0n("RichVideoPlayer", "VideoPlugin is available, should reuse it");
                return;
            }
        }
        if (c6d6.A0C) {
            c6d6.A0f(A0F.A03);
            return;
        }
        6cT r03 = A0F.A08;
        c6d6.A0T(r03);
        c6d6.A0f(A0F.A03);
        List list = A0F.A0A;
        if (z2) {
            list.add(0, c6d6);
        } else {
            list.add(c6d6);
        }
        if ((c6d6 instanceof C6d5) && (jdt = A0F.A02) != null) {
            ((C6d5) c6d6).A0j(jdt);
        }
        if (z2) {
            A0F.A04 = (VideoPlugin) c6d6;
            ((6cS) r03).A03 = 2131368334;
            View findViewById = r03.findViewById(2131368334);
            ((6cS) r03).A06 = findViewById;
            if (findViewById == null) {
                throw AnonymousClass001.A0L("Invalid inner view resourceId specified.");
            }
        }
    }

    public void A0Q(List list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0P((C6d6) it.next());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [com.facebook.video.plugins.common.VideoPlugin, X.6d9] */
    public void A0R(boolean z) {
        LithoView lithoView;
        if (!A07(this)) {
            VideoPlugin videoPlugin = A0F().A04;
            if (videoPlugin != 0) {
                if (!(videoPlugin instanceof C6d9)) {
                    videoPlugin.A07 = z;
                    return;
                }
                ?? r0 = (C6d9) videoPlugin;
                r0.A07 = z;
                r0.A08.A01(z);
                return;
            }
            return;
        }
        6cV r02 = this.A0i;
        if (!r02.A0E.compareAndSet(!z, z) || (lithoView = r02.A00) == null || r02.A02 == null || r02.A03 == null) {
            return;
        }
        1Iw r03 = lithoView.A09;
        11T.A0A(r03);
        6TI r04 = r02.A03;
        if (r04 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        6U2 r05 = r02.A04;
        6TN r06 = r02.A01;
        PlayerOrigin playerOrigin = r02.A02;
        if (playerOrigin == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        lithoView.A0x(6cV.A01(r03, r06, playerOrigin, r04, r05, r02, (Set) null));
    }

    public boolean A0S() {
        JQP jqp;
        6VI AxR;
        GPs gPs = this.A0D;
        if (gPs != null && (jqp = gPs.A06) != null && (AxR = jqp.AxR()) != null) {
            return AxR.A0C;
        }
        0fH.A0g(BJQ(), "RichVideoPlayer", "Couldn't find isProtectedContent status for RVP %s. Considering it as non-protected");
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View AAm() {
        return this;
    }

    public boolean ADd() {
        if (((5KL) this.A0f.get()).A00()) {
            this.A0D.getClass();
            return false;
        }
        0fH.A0j("RichVideoPlayer", "no use player service.");
        return true;
    }

    public int Afn() {
        if (A07(this)) {
            6cV r0 = this.A0i;
            return r0.A02().A02(r0.A02, r0.A06);
        }
        GPs gPs = this.A0D;
        if (gPs == null) {
            return 0;
        }
        return gPs.Afn();
    }

    public C6ce B3I() {
        boolean z;
        C6cd c6cd = this.A0D;
        if (A07(this)) {
            I0K i0k = (I0K) this.A0Q.get();
            if (i0k.A08) {
                z = i0k.A07;
            } else {
                z = 2yD.A04(i0k.A0A, 36312634231690146L);
                i0k.A07 = z;
                i0k.A08 = true;
            }
            if (z) {
                c6cd = this.A0p;
            }
        }
        return c6cd;
    }

    public PlayerOrigin B3c() {
        return this.A0r;
    }

    public 6UR B3e() {
        GRS A04;
        if (A07(this)) {
            GRD A00 = 6cV.A00(this.A0i);
            return (A00 == null || (A04 = A00.A04()) == null) ? 6UR.A0B : A04.B3e();
        }
        GPs gPs = this.A0D;
        if (gPs == null) {
            return null;
        }
        return gPs.A09;
    }

    public 6TN B3f() {
        return A07(this) ? this.A0i.A01 : this.A0A;
    }

    public C6d6 B3h(Class cls) {
        for (C6d6 c6d6 : A0F().A0A) {
            if (cls.isInstance(c6d6)) {
                return c6d6;
            }
        }
        return null;
    }

    public 6TI B82() {
        return this.A0F;
    }

    public int BJL() {
        if (A07(this)) {
            6cV r0 = this.A0i;
            return r0.A02().A03(r0.A02, r0.A06);
        }
        GPs gPs = this.A0D;
        if (gPs == null) {
            return 0;
        }
        return gPs.BJL();
    }

    public 6TW BJN() {
        return 6TU.A00();
    }

    public String BJQ() {
        VideoPlayerParams videoPlayerParams;
        6TI r0 = this.A0F;
        if (r0 == null || (videoPlayerParams = r0.A03) == null) {
            return null;
        }
        return videoPlayerParams.A0k;
    }

    public View BJt() {
        6dF r0;
        GPs gPs = this.A0D;
        if (gPs == null || (r0 = gPs.A07) == null) {
            return null;
        }
        return r0.A01;
    }

    public boolean BUR() {
        if (!A07(this)) {
            GPs gPs = this.A0D;
            if (gPs != null) {
                return gPs.A0G;
            }
            return true;
        }
        6cV r0 = this.A0i;
        if (r0.A02 == null) {
            return false;
        }
        GRX A02 = r0.A02();
        String str = r0.A06;
        PlayerOrigin playerOrigin = r0.A02;
        11T.A0D(playerOrigin);
        return A02.A0A(playerOrigin, str);
    }

    public boolean BWa() {
        boolean z;
        if (A07(this)) {
            6cV r0 = this.A0i;
            z = r0.A02().A0D(r0.A02, r0.A06);
        } else {
            GPs gPs = this.A0D;
            if (gPs == null) {
                return false;
            }
            z = true;
            if (!gPs.BWa()) {
                return false;
            }
        }
        return z;
    }

    public void CWm(C52j c52j) {
        6U2 A07;
        if (A08(this, this.A0F)) {
            6cV r0 = this.A0i;
            11T.A0F(c52j, 0);
            GRD A00 = 6cV.A00(r0);
            if (A00 == null || (A07 = A00.A07()) == null) {
                return;
            }
            A07.A06(new 6U9(c52j));
            return;
        }
        A04(this.A0F);
        C00j.A05("RichVideoPlayer.pause", -938698541);
        try {
            6dK A0F = A0F();
            Iterator it = A0F.A09.iterator();
            while (it.hasNext()) {
                it.next();
            }
            6U2 r02 = A0F.A03;
            r02.getClass();
            r02.A06(new 6U9(c52j));
            C00j.A01(-952952124);
            C6cf c6cf = (C6cf) this.A0o.get();
            int hashCode = hashCode();
            C6cf.A00(c6cf, hashCode);
            SparseBooleanArray sparseBooleanArray = c6cf.A00;
            synchronized (sparseBooleanArray) {
                sparseBooleanArray.delete(hashCode);
            }
            ((QuickPerformanceLogger) c6cf.A01.A00.get()).markerEnd(1900570, hashCode, (short) 549);
        } catch (Throwable th) {
            C00j.A01(-623644398);
            throw th;
        }
    }

    public void CXU(C52j c52j) {
        A02(c52j, this, -1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void CgE(6TX r302) {
        String str;
        6TX r0 = 6TU.A00().A02;
        r0.A00();
        r0.A02(0S2.A0u, "RichVideoPlayer");
        Integer num = 0S2.A00;
        r0.A02(num, this.A0r.toString());
        Integer num2 = 0S2.A01;
        r0.A02(num2, B3f().toString());
        r0.A02(0S2.A0C, this.A0B.toString());
        6TI r02 = this.A0F;
        if (r02 != null) {
            r02.CgE(r0);
        } else {
            r0.A04("RVP", "Error", "RichVideoPlayerParamsNotExist");
        }
        r0.A02(0S2.A0I, String.valueOf(((5Fu) this.A0e.get()).A00));
        GPs gPs = this.A0D;
        r0.A02(0S2.A0T, gPs == null ? "PlaybackControllerNull" : ((6Um) gPs.A0i.get()).name());
        r0.A02(0S2.A0k, String.valueOf(6UZ.A00()));
        r0.A02(0S2.A0a, 4YU.A14(this));
        C7lz.A00(this, r0, "RVP");
        GPs gPs2 = this.A0D;
        str = "";
        r0.A04("RVP", "PlaybackController", gPs2 == null ? str : 4YU.A15(gPs2));
        r0.A04("RVP", "State", 0Pz.A0j(0Pz.A1C("initialized=", AnonymousClass001.A1T(this.A0F)), 0Pz.A1C(";dialogOpen=", this.A0L), 0Pz.A1C(";resumeFromDialog", this.A0K)));
        6U2 r03 = this.A0I;
        r0.A04("RVP", "EventBus", r03 != null ? 4YU.A15(r03) : "");
        r0.A04("RVP", "AudioVolume", String.valueOf(A0D()));
        r0.A04("RVP", "Muted", String.valueOf(BUR()));
        if (A0D() == 0 && !BUR()) {
            r0.A03("ZeroSoundVolume", num2);
        }
        Rect rect = this.A0Y;
        getHitRect(rect);
        int height = rect.height();
        int width = rect.width();
        boolean globalVisibleRect = getGlobalVisibleRect(rect);
        int height2 = rect.height();
        int width2 = rect.width();
        float f = (height2 * width2) / (height * width);
        int[] iArr = new int[2];
        getLocationOnScreen(iArr);
        String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("%s, Pos: [%d, %d/%d]", rect.toString(), Integer.valueOf(iArr[0]), Integer.valueOf(iArr[1]), Integer.valueOf(((C4s1) this.A0d.get()).A06()));
        String formatStrLocaleSafe2 = StringFormatUtil.formatStrLocaleSafe("h(%d/%d) - w(%d/%d), %f", Integer.valueOf(height2), Integer.valueOf(height), Integer.valueOf(width2), Integer.valueOf(width), Float.valueOf(f));
        String str2 = A00().A03;
        Integer valueOf = Integer.valueOf(A00().describeContents());
        String str3 = A00().A02;
        if (str3 == null) {
            str3 = "unknown";
        }
        String str4 = A00().A05;
        if (str4 == null) {
            str4 = "unknown";
        }
        String str5 = A00().A04;
        if (str5 == null) {
            str5 = "unknown";
        }
        String formatStrLocaleSafe3 = StringFormatUtil.formatStrLocaleSafe("%s | %s | %s | %s | %s", str2, valueOf, str3, str4, str5);
        boolean z = !globalVisibleRect;
        if (z) {
            r0.A03("VideoOffScreen", num);
        }
        r0.A04("RVP", "OffScreen", String.valueOf(z));
        r0.A04("RVP", "RvpPos", formatStrLocaleSafe);
        r0.A04("RVP", "RvpSize", formatStrLocaleSafe2);
        r0.A04("RVP", "RvpCaller", formatStrLocaleSafe3);
        6dK r04 = this.A0C;
        if (r04 == null) {
            r0.A03("RVPPluginManagerNotExist", num);
            r0.A04("RVP", "Error", "RVPPluginManagerNotExist");
        } else {
            r04.CgE(r0);
        }
        GPs gPs3 = this.A0D;
        if (gPs3 == null) {
            r0.A03("PlaybackControllerNotExist", num);
            r0.A04("RVP", "Error", "PlaybackControllerNotExist");
        } else {
            gPs3.CgE(r0);
        }
        r0.A01(r302);
        r0.A00();
        r302.A02(0S2.A0m, "PostCollect");
    }

    public void CkD(C52j c52j, int i) {
        VideoPlayerParams videoPlayerParams;
        6U2 A07;
        if (!A07(this)) {
            6TI r0 = this.A0F;
            if (r0 == null || (videoPlayerParams = r0.A03) == null || !videoPlayerParams.A1F) {
                A0L(c52j, i);
                return;
            }
            return;
        }
        6cV r02 = this.A0i;
        11T.A0F(c52j, 1);
        GRD A00 = 6cV.A00(r02);
        if (A00 == null || (A07 = A00.A07()) == null) {
            return;
        }
        A07.A06(new 6UA(c52j, i));
    }

    public void CrU(C52j c52j, boolean z) {
        6U2 r305;
        6U7 r308;
        if (A07(this)) {
            6cV r0 = this.A0i;
            float f = 1.0f;
            if (z) {
                f = 0.0f;
            }
            11T.A0F(c52j, 1);
            GRD A00 = 6cV.A00(r0);
            if (A00 == null) {
                return;
            }
            r305 = A00.A07();
            if (r305 == null) {
                return;
            } else {
                r308 = new 6U7(c52j, f);
            }
        } else {
            GPs gPs = this.A0D;
            if (gPs == null) {
                return;
            }
            if (GPs.A0C(c52j, gPs, z)) {
                gPs.A0G = z;
                if (z) {
                    GPs.A05(gPs);
                } else if (gPs.A09.A00() || gPs.A06.BWa()) {
                    GPs.A06(gPs);
                }
                gPs.A06.Ber(c52j, z);
                float f2 = 1.0f;
                if (z) {
                    f2 = 0.0f;
                }
                gPs.A00 = f2;
            }
            r305 = this.A0I;
            if (r305 == null) {
                return;
            } else {
                r308 = new 7Qm(z);
            }
        }
        r305.A06(r308);
    }

    public boolean isPlaying() {
        boolean z;
        if (A07(this)) {
            6cV r0 = this.A0i;
            z = r0.A02().A0B(r0.A02, r0.A06);
        } else {
            GPs gPs = this.A0D;
            if (gPs == null) {
                return false;
            }
            z = true;
            if (!gPs.isPlaying()) {
                return false;
            }
        }
        return z;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, X.6U5] */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.A0I.A06((6U5) new Object());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [android.view.View, X.6d6] */
    public void onFinishInflate() {
        int A06 = 0FI.A06(-869127604);
        super.onFinishInflate();
        if (!this.A0X) {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= getChildCount()) {
                    break;
                }
                View childAt = getChildAt(i2);
                if (childAt instanceof C6d6) {
                    arrayList.add(childAt);
                }
                i = i2 + 1;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ?? r0 = (C6d6) it.next();
                A0P(r0);
                removeViewInLayout(r0);
            }
            this.A0X = true;
        }
        0FI.A0C(-1737034164, A06);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            ((1GU) this.A0O.get()).CY3(new Runnable() { // from class: X.81e
                public static final String __redex_internal_original_name = "RichVideoPlayer$2";

                /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, X.6U5] */
                @Override // java.lang.Runnable
                public void run() {
                    6U2 r0 = RichVideoPlayer.this.A0I;
                    if (r0 != null) {
                        r0.A06((6U5) new Object());
                    }
                }
            });
        }
    }
}
