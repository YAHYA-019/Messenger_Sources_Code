package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.forker.Process;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.graphql.query.GraphQlQueryParamSet;
import com.facebook.inject.FbInjector;
import com.facebook.litho.LithoView;
import com.facebook.messaging.integrity.frx.ui.fragment.FeedbackReportFragment;
import com.facebook.messaging.montage.composer.MontageComposerActivity;
import com.facebook.messaging.montage.model.MontageBucket;
import com.facebook.messaging.montage.model.MontageCard;
import com.facebook.messaging.montage.model.MontageUser;
import com.facebook.messaging.montage.model.cards.MontageFeedbackOverlay;
import com.facebook.messaging.montage.model.montagemetadata.MontageActorInfo;
import com.facebook.messaging.montage.model.montagemetadata.MontageMetadata;
import com.facebook.messaging.montage.viewer.MontageViewerFragment;
import com.facebook.messaging.montage.viewer.avatarquickreplies.MontageViewerAvatarQuickRepliesView;
import com.facebook.messaging.montage.viewer.controlsoverlay.MontageViewerControlsContainer;
import com.facebook.messaging.montage.viewer.progressindicator.MontageProgressIndicatorView;
import com.facebook.messaging.montage.viewer.quickreply.MontageViewerQuickRepliesOverlay;
import com.facebook.messaging.montage.viewer.reaction.MontageMessageReactionViewModel;
import com.facebook.messaging.montage.viewer.reaction.MontageViewerReactionsComposerView;
import com.facebook.messaging.montage.viewer.reaction.MontageViewerReactionsOverlayView;
import com.facebook.messaging.montage.viewer.seensheet.MontageViewerFollowerSeenCountSubscription;
import com.facebook.messaging.send.trigger.NavigationTrigger;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.resources.ui.FbTextView;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.facebook.user.model.User;
import com.facebook.user.model.UserKey;
import com.facebook.user.tiles.UserTileView;
import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.mapbox.mapboxsdk.style.layers.Property;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* renamed from: X.Gbz, reason: case insensitive filesystem */
/* loaded from: Gbz.class */
public final class C2397Gbz extends 1pK implements JLj, JKA, 2Ob, CallerContextable {
    public static final String __redex_internal_original_name = "MontageViewerPageFragment";
    public int A00;
    public long A01;
    public long A02;
    public View A03;
    public View A04;
    public View A05;
    public View A06;
    public View A07;
    public ProgressBar A08;
    public TextView A09;
    public TextView A0A;
    public FbUserSession A0B;
    public EAX A0C;
    public C00i A0D;
    public C00i A0E;
    public C00i A0F;
    public C00i A0G;
    public C00i A0H;
    public C00i A0I;
    public C00i A0J;
    public C00i A0K;
    public C00i A0L;
    public AeX A0M;
    public MontageBucket A0N;
    public MontageBucket A0O;
    public MontageCard A0P;
    public MontageViewerFragment A0Q;
    public I5c A0R;
    public Ht2 A0S;
    public COm A0T;
    public MontageViewerControlsContainer A0U;
    public HAG A0V;
    public 7Mg A0W;
    public HGD A0X;
    public MontageProgressIndicatorView A0Y;
    public MontageViewerQuickRepliesOverlay A0Z;
    public HoQ A0a;
    public HU5 A0b;
    public GTk A0c;
    public C9c8 A0d;
    public I3z A0e;
    public NavigationTrigger A0f;
    public UserTileView A0g;
    public 2Wo A0h;
    public 2Wo A0i;
    public 2Wo A0j;
    public L5Q A0k;
    public String A0l;
    public String A0m;
    public boolean A0n;
    public boolean A0o;
    public boolean A0p;
    public boolean A0q;
    public boolean A0s;
    public boolean A0t;
    public boolean A0u;
    public boolean A0v;
    public boolean A0w;
    public boolean A0x;
    public boolean A0y;
    public boolean A0z;
    public boolean A10;
    public int A11;
    public long A12;
    public long A13;
    public FrameLayout A14;
    public TextView A15;
    public TextView A16;
    public C00i A17;
    public C00i A18;
    public HTw A19;
    public Ht2 A1A;
    public Ht2 A1B;
    public Ht2 A1C;
    public I2w A1D;
    public 53U A1E;
    public 2Wo A1F;
    public 2Wo A1G;
    public String A1H;
    public boolean A1I;
    public final C00i A1V;
    public final HTo A1j;
    public final HTs A1k;
    public final HTt A1l;
    public final HTu A1m;
    public final IXR A1n;
    public final Ht2 A1p;
    public final 1CO A1q;
    public final MailboxCallback A1r;
    public final boolean A1v;
    public final C5S5 A2F;
    public final I1X A2G;
    public final JFO A2H;
    public final 2TO A2K;
    public final C00i A20 = AbF.A0S(this, 68436);
    public boolean A0r = false;
    public final HTv A1o = new HTv(this);
    public final AZR A2I = new IXW(this);
    public final Runnable A1s = new Ir0(this);
    public final Runnable A1t = new Ir1(this);
    public final Runnable A1u = new Ir2(this);
    public final C00i A28 = 1BV.A00(706);
    public final C00i A2B = AbF.A0S(this, 49478);
    public final C00i A1K = AbH.A0a();
    public final C00i A1N = 1BV.A00(16430);
    public final C00i A1i = AbH.A0I();
    public final C00i A1a = 1BQ.A02(16477);
    public final C00i A1J = AbH.A0K();
    public final C00i A21 = new 1HH(this, 66579);
    public final C00i A29 = 1BV.A00(711);
    public final C00i A1b = 1BV.A00(707);
    public final C00i A2C = 1BV.A00(708);
    public final C00i A2D = 1BV.A00(709);
    public final C00i A2E = 1BV.A00(710);
    public final C00i A1g = 1BQ.A02(83273);
    public final C00i A1M = 1BQ.A01();
    public final C00i A1P = 1BQ.A02(50098);
    public final C00i A1R = 1BQ.A02(83168);
    public final C00i A26 = 1BQ.A02(67927);
    public final C00i A1d = 1BV.A00(68150);
    public final C00i A1y = AbH.A0Q();
    public final C00i A1T = AbH.A0c(this);
    public final C00i A1w = AbF.A0S(this, 116018);
    public final C00i A1S = 1BQ.A02(85048);
    public final C00i A2A = 1BQ.A02(65723);
    public final C00i A1e = AbH.A0D();
    public final C00i A1O = 1BV.A00(83436);
    public final C00i A1c = AbF.A0S(this, 116022);
    public final C00i A22 = AbF.A0S(this, 451);
    public final C00i A1h = new 1HH(this, 99435);
    public final C00i A1L = AbF.A0S(this, 68120);
    public final C00i A1U = AbF.A0S(this, 115450);
    public final C00i A1Q = AbF.A0S(this, 85198);
    public final C00i A23 = AbF.A0S(this, 83984);
    public final C00i A1W = 1BV.A00(116002);
    public final C00i A1f = new 1HH(this, 67720);
    public final C00i A27 = 1BV.A00(116016);
    public final C00i A1z = 1BV.A00(84045);
    public final C00i A1Z = AbF.A0S(this, 116014);
    public final C00i A25 = 1BV.A00(147880);
    public final C00i A1Y = 1BV.A00(147652);
    public final C00i A24 = 1BV.A00(147879);
    public final C00i A1X = AbF.A0S(this, 49802);
    public final C00i A1x = 1BV.A00(67867);
    public final 1CO A2J = AbJ.A0e();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v157, types: [java.lang.Object, X.Ht2] */
    public C2397Gbz() {
        1CO r0 = (1CO) 1Bi.A03(16387);
        this.A1q = r0;
        this.A2F = (C5S5) 1Bi.A03(67922);
        this.A2G = (I1X) 1Bi.A03(115926);
        this.A1p = new Object();
        this.A0n = true;
        this.A0m = "";
        this.A0p = false;
        this.A0v = false;
        this.A0y = false;
        this.A0s = false;
        this.A02 = Long.MAX_VALUE;
        this.A2K = new Gv4(this, 0);
        this.A1V = 1BV.A00(49262);
        this.A1v = r0.AZk(72341298102735428L);
        this.A2H = new IXP(this);
        this.A1k = new HTs(this);
        this.A1l = new HTt(this);
        this.A1m = new HTu(this);
        this.A1j = new HTo(this);
        this.A1r = new Iby(this, 15);
        this.A1n = new IXR(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private float A03() {
        if (!A0o()) {
            return 1.0f;
        }
        Context requireContext = requireContext();
        Float f = C9mV.A00;
        if (f != null) {
            return f.floatValue();
        }
        float A00 = 7zO.A0I(requireContext).widthPixels / C9mV.A00(requireContext);
        C9mV.A00 = Float.valueOf(A00);
        return A00;
    }

    public static int A06(C2397Gbz c2397Gbz) {
        2Wo r0 = c2397Gbz.A0j;
        if (r0 == null || r0.A00 == null) {
            return 0;
        }
        return ((MontageViewerReactionsComposerView) r0.A01()).A04.getScrollX();
    }

    public static long A07(C2397Gbz c2397Gbz) {
        long A08;
        if (c2397Gbz.A0P == null) {
            return 0L;
        }
        Object A0E = A0E(c2397Gbz);
        if (A0E instanceof JP7) {
            return ((JP7) A0E).BFm();
        }
        MontageCard montageCard = c2397Gbz.A0P;
        long j = montageCard == null ? 0L : montageCard.A04;
        if (c2397Gbz.A0w) {
            A08 = c2397Gbz.A12;
        } else {
            if (!c2397Gbz.A0n() || c2397Gbz.A13 == 0) {
                return j;
            }
            A08 = 1BL.A08(c2397Gbz.A1K) - c2397Gbz.A13;
        }
        return Math.max(0L, j - A08);
    }

    public static final Drawable A08(Context context) {
        Drawable drawable = context.getResources().getDrawable(2132345258);
        if (drawable == null) {
            return null;
        }
        drawable.setColorFilter((-1) >>> 1, PorterDuff.Mode.SRC_IN);
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        return drawable;
    }

    public static ICj A09(C2397Gbz c2397Gbz) {
        C00i c00i = c2397Gbz.A0G;
        c00i.getClass();
        return (ICj) c00i.get();
    }

    public static MontageActorInfo A0A(C2397Gbz c2397Gbz) {
        ImmutableList immutableList;
        MontageMetadata montageMetadata;
        MontageBucket montageBucket = c2397Gbz.A0N;
        if (montageBucket == null || (immutableList = montageBucket.A03) == null || immutableList.isEmpty() || (montageMetadata = ((MontageCard) 1BK.A0r(c2397Gbz.A0N.A03)).A0A) == null) {
            return null;
        }
        return montageMetadata.A04;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r302v4 ??, still in use, count: 2, list:
          (r302v4 ??) from 0x004e: PHI (r302v1 ??) = (r302v0 ??), (r302v4 ??) binds: [B:2:0x0006, B:8:0x0041] A[DONT_GENERATE, DONT_INLINE]
          (r302v4 ?? I:X.Ht2) from 0x004b: IPUT (r302v4 ?? I:X.Ht2), (r301v0 'this' ?? I:X.Gbz A[IMMUTABLE_TYPE, THIS]) X.Gbz.A1A X.Ht2
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
    private X.Ht2 A0B() {
        /*
            r301 = this;
            r0 = r301
            X.Ht2 r0 = r0.A1A
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L4e
            r0 = r301
            X.00i r0 = r0.A2C
            r302 = r0
            r0 = r302
            X.1F6 r0 = X.AbF.A0P(r0)
            r303 = r0
            r0 = 2131367597(0x7f0a16ad, float:1.835512E38)
            r304 = r0
            r0 = r301
            r1 = r304
            android.view.ViewStub r0 = X.GOp.A0D(r0, r1)
            r305 = r0
            android.content.Context r0 = com.facebook.inject.FbInjector.A01()
            r306 = r0
            r0 = r303
            X.AbL.A0y(r0)
            X.GoX r0 = new X.GoX     // Catch: java.lang.Throwable -> L36
            r302 = r0
            r0 = r302
            r1 = r305
            r2 = r301
            r3 = r301
            r0.<init>(r1, r2, r3)     // Catch: java.lang.Throwable -> L36
            goto L41
        L36:
            r302 = move-exception
            X.1Bn.A0K()
            r0 = r306
            com.facebook.inject.FbInjector.A04(r0)
            r0 = r302
            throw r0
        L41:
            X.1Bn.A0K()
            r0 = r306
            com.facebook.inject.FbInjector.A04(r0)
            r0 = r301
            r1 = r302
            r0.A1A = r1
        L4e:
            r0 = r302
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2397Gbz.A0B():X.Ht2");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r302v4 ??, still in use, count: 2, list:
          (r302v4 ??) from 0x004e: PHI (r302v1 ??) = (r302v0 ??), (r302v4 ??) binds: [B:2:0x0006, B:8:0x0041] A[DONT_GENERATE, DONT_INLINE]
          (r302v4 ?? I:X.Ht2) from 0x004b: IPUT (r302v4 ?? I:X.Ht2), (r301v0 'this' ?? I:X.Gbz A[IMMUTABLE_TYPE, THIS]) X.Gbz.A1B X.Ht2
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
    private X.Ht2 A0C() {
        /*
            r301 = this;
            r0 = r301
            X.Ht2 r0 = r0.A1B
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L4e
            r0 = r301
            X.00i r0 = r0.A2D
            r302 = r0
            r0 = r302
            X.1F6 r0 = X.AbF.A0P(r0)
            r303 = r0
            r0 = 2131367944(0x7f0a1808, float:1.8355824E38)
            r304 = r0
            r0 = r301
            r1 = r304
            android.view.ViewStub r0 = X.GOp.A0D(r0, r1)
            r305 = r0
            android.content.Context r0 = com.facebook.inject.FbInjector.A01()
            r306 = r0
            r0 = r303
            X.AbL.A0y(r0)
            X.GoV r0 = new X.GoV     // Catch: java.lang.Throwable -> L36
            r302 = r0
            r0 = r302
            r1 = r305
            r2 = r301
            r3 = r301
            r0.<init>(r1, r2, r3)     // Catch: java.lang.Throwable -> L36
            goto L41
        L36:
            r302 = move-exception
            X.1Bn.A0K()
            r0 = r306
            com.facebook.inject.FbInjector.A04(r0)
            r0 = r302
            throw r0
        L41:
            X.1Bn.A0K()
            r0 = r306
            com.facebook.inject.FbInjector.A04(r0)
            r0 = r301
            r1 = r302
            r0.A1B = r1
        L4e:
            r0 = r302
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2397Gbz.A0C():X.Ht2");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r302v3 ??, still in use, count: 2, list:
          (r302v3 ??) from 0x008d: PHI (r302v1 ??) = (r302v0 ??), (r302v3 ??) binds: [B:2:0x0006, B:8:0x0080] A[DONT_GENERATE, DONT_INLINE]
          (r302v3 ?? I:X.Ht2) from 0x008a: IPUT (r302v3 ?? I:X.Ht2), (r301v0 'this' ?? I:X.Gbz A[IMMUTABLE_TYPE, THIS]) X.Gbz.A1C X.Ht2
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
    private X.Ht2 A0D() {
        /*
            r301 = this;
            r0 = r301
            X.Ht2 r0 = r0.A1C
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L8d
            r0 = r301
            X.00i r0 = r0.A2E
            r303 = r0
            r0 = r303
            X.1F6 r0 = X.GOo.A0I(r0)
            r302 = r0
            r0 = r301
            android.content.Context r0 = r0.requireContext()
            r304 = r0
            r0 = r301
            X.53U r0 = A0G(r0)
            r305 = r0
            r0 = r301
            r1 = 2131368336(0x7f0a1990, float:1.835662E38)
            android.view.ViewStub r0 = X.GOp.A0D(r0, r1)
            r306 = r0
            r0 = r301
            com.facebook.auth.usersession.FbUserSession r0 = r0.A0B
            r307 = r0
            com.facebook.video.common.playerorigin.PlayerOrigin r0 = com.facebook.video.common.playerorigin.PlayerOrigin.A0M
            r308 = r0
            r0 = r301
            boolean r0 = r0.A0o()
            r309 = r0
            r0 = r301
            float r0 = r0.A03()
            r310 = r0
            r0 = r301
            boolean r0 = r0.A0p()
            r311 = r0
            X.Hg8 r0 = new X.Hg8
            r312 = r0
            r0 = r312
            r1 = r308
            r2 = r310
            r3 = r309
            r4 = r311
            r0.<init>(r1, r2, r3, r4)
            android.content.Context r0 = com.facebook.inject.FbInjector.A01()
            r313 = r0
            r0 = r302
            X.AbL.A0y(r0)
            X.GoY r0 = new X.GoY     // Catch: java.lang.Throwable -> L75
            r302 = r0
            r0 = r302
            r1 = r304
            r2 = r306
            r3 = r307
            r4 = r301
            r5 = r312
            r6 = r301
            r7 = r305
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L75
            goto L80
        L75:
            r303 = move-exception
            X.1Bn.A0K()
            r0 = r313
            com.facebook.inject.FbInjector.A04(r0)
            r0 = r303
            throw r0
        L80:
            X.1Bn.A0K()
            r0 = r313
            com.facebook.inject.FbInjector.A04(r0)
            r0 = r301
            r1 = r302
            r0.A1C = r1
        L8d:
            r0 = r302
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2397Gbz.A0D():X.Ht2");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Ht2 A0E(C2397Gbz c2397Gbz) {
        Ht2 ht2;
        GOn.A1T(c2397Gbz);
        int ordinal = c2397Gbz.A0P.A07.ordinal();
        if (ordinal != 0) {
            if (ordinal == 2) {
                return c2397Gbz.A0D();
            }
            if (ordinal == 3) {
                return c2397Gbz.A0B();
            }
            if (ordinal != 4) {
                throw AnonymousClass001.A0L("Unsupported content type");
            }
            ht2 = c2397Gbz.A0C();
        } else {
            if (!c2397Gbz.A0r && !c2397Gbz.A2J.AZk(36324926425288918L)) {
                return c2397Gbz.A1p;
            }
            ht2 = c2397Gbz.A0S;
            if (ht2 == null) {
                C1F6 A0I = GOo.A0I(c2397Gbz.A1b);
                Context requireContext = c2397Gbz.requireContext();
                FbUserSession fbUserSession = c2397Gbz.A0B;
                fbUserSession.getClass();
                53U A0G = A0G(c2397Gbz);
                ViewStub A0D = GOp.A0D(c2397Gbz, 2131366437);
                Context A01 = FbInjector.A01();
                AbL.A0y(A0I);
                try {
                    C2796GoZ c2796GoZ = new C2796GoZ(requireContext, A0D, fbUserSession, c2397Gbz, c2397Gbz, A0G);
                    1Bn.A0K();
                    FbInjector.A04(A01);
                    c2397Gbz.A0S = c2796GoZ;
                    return c2796GoZ;
                } catch (Throwable th) {
                    1Bn.A0K();
                    FbInjector.A04(A01);
                    throw th;
                }
            }
        }
        return ht2;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r302v4 ??, still in use, count: 2, list:
          (r302v4 ??) from 0x0040: PHI (r302v1 ??) = (r302v0 ??), (r302v4 ??) binds: [B:2:0x0006, B:8:0x0034] A[DONT_GENERATE, DONT_INLINE]
          (r302v4 ?? I:X.I2w) from 0x003d: IPUT (r302v4 ?? I:X.I2w), (r301v0 'this' ?? I:X.Gbz A[IMMUTABLE_TYPE, THIS]) X.Gbz.A1D X.I2w
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
    private X.I2w A0F() {
        /*
            r301 = this;
            r0 = r301
            X.I2w r0 = r0.A1D
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L40
            r0 = r301
            X.00i r0 = r0.A29
            X.1F6 r0 = X.AbF.A0P(r0)
            r302 = r0
            r0 = r301
            android.content.Context r0 = r0.requireContext()
            r303 = r0
            android.content.Context r0 = com.facebook.inject.FbInjector.A01()
            r304 = r0
            r0 = r302
            X.AbL.A0y(r0)
            X.I2w r0 = new X.I2w     // Catch: java.lang.Throwable -> L2a
            r302 = r0
            r0 = r302
            r1 = r303
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L2a
            goto L34
        L2a:
            r302 = move-exception
            X.1Bn.A0K()
            r0 = r304
            com.facebook.inject.FbInjector.A04(r0)
            r0 = r302
            throw r0
        L34:
            X.1Bn.A0K()
            r0 = r304
            com.facebook.inject.FbInjector.A04(r0)
            r0 = r301
            r1 = r302
            r0.A1D = r1
        L40:
            r0 = r302
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2397Gbz.A0F():X.I2w");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static 53U A0G(C2397Gbz c2397Gbz) {
        53U r302 = c2397Gbz.A1E;
        if (r302 == null) {
            r302 = ((53S) c2397Gbz.A2B.get()).A01(c2397Gbz);
            c2397Gbz.A1E = r302;
        }
        return r302;
    }

    public static Double A0H(0DA r301) {
        r301.A05("entry_point", 1);
        r301.A03("request_multi_phase_image", false);
        r301.A03("multi_phase_high_res_image", false);
        r301.A05("load_category", 0);
        r301.A05("download_type", 0);
        Double valueOf = Double.valueOf(-1.0d);
        r301.A04("content_load_start_time", valueOf);
        r301.A04("media_load_start_time", valueOf);
        r301.A04("media_load_end_time", valueOf);
        r301.A04("primary_model_fetcher_start_time", valueOf);
        r301.A04("primary_model_fetcher_end_time", valueOf);
        r301.A04("secondary_model_fetcher_start_time", valueOf);
        r301.A04("secondary_model_fetcher_end_time", valueOf);
        r301.A04("media_model_fetcher_start_time", valueOf);
        r301.A04("media_model_fetcher_end_time", valueOf);
        return valueOf;
    }

    private String A0I(Bundle bundle) {
        long j;
        if (bundle == null) {
            return null;
        }
        String str = this.A1H;
        if (str == null) {
            MontageBucket montageBucket = (MontageBucket) bundle.getParcelable("montage_message_info");
            if (montageBucket != null) {
                j = montageBucket.A01.A00;
            } else {
                MontageCard montageCard = (MontageCard) bundle.getParcelable("archived_messages");
                if (montageCard == null) {
                    return null;
                }
                j = montageCard.A03;
            }
            str = String.valueOf(j);
            this.A1H = str;
        }
        return str;
    }

    public static String A0J(C2397Gbz c2397Gbz) {
        String str;
        User A00;
        MontageActorInfo montageActorInfo;
        MontageBucket montageBucket = c2397Gbz.A0N;
        if (montageBucket == null || GOn.A0o(montageBucket) == null) {
            return null;
        }
        CIt cIt = (CIt) c2397Gbz.A23.get();
        FbUserSession fbUserSession = c2397Gbz.A0B;
        fbUserSession.getClass();
        MontageCard A0o = GOn.A0o(c2397Gbz.A0N);
        MontageMetadata montageMetadata = A0o.A0A;
        if (montageMetadata == null || (montageActorInfo = montageMetadata.A04) == null) {
            23F r0 = (23F) 1Lo.A04((Context) null, fbUserSession, cIt.A00, 33102);
            MontageUser montageUser = A0o.A08;
            str = null;
            if (montageUser != null && (A00 = r0.A00(montageUser.A01)) != null) {
                return A00.A0X.firstName;
            }
        } else {
            str = montageActorInfo.A03;
        }
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void A0K() {
        C00i c00i;
        if (getContext() == null || (c00i = this.A1N) == null || c00i.get() == null) {
            return;
        }
        4YU.A0G(c00i).removeCallbacks(this.A1s);
    }

    private void A0L() {
        C00j.A05("MontageViewerPageFragment.maybeRebindSeenByList", -1571651374);
        try {
            GOn.A1T(this);
            if (A1m() && this.A0N != null) {
                EAX eax = A0F().A02;
                if (eax != null && eax.isShowing()) {
                    I2w i2w = this.A1D;
                    FbUserSession fbUserSession = this.A0B;
                    fbUserSession.getClass();
                    MontageCard montageCard = this.A0P;
                    MontageBucket montageBucket = this.A0N;
                    int i = ((MontageViewerFollowerSeenCountSubscription) this.A1w.get()).A00;
                    MontageBucket montageBucket2 = this.A0N;
                    I2w.A00(fbUserSession, montageBucket, i2w, montageCard.A0B, montageCard.A03(), montageCard.A04(), montageCard.A0E, i, montageBucket2 != null ? montageBucket2.A00 : -1);
                }
            }
            C00j.A01(-2043615832);
        } catch (Throwable th) {
            C00j.A01(-628957012);
            throw th;
        }
    }

    private void A0M() {
        HGD hgd;
        if (this.A1I || (hgd = this.A0X) == null || !this.A0u || !this.A0t) {
            return;
        }
        Preconditions.checkState(AnonymousClass001.A1P((this.A01 > 0L ? 1 : (this.A01 == 0L ? 0 : -1))));
        hgd.A06(this, 1BL.A08(this.A1K) - this.A01);
        this.A1I = true;
    }

    private void A0N() {
        int i;
        C00j.A05("MontageViewerPageFragment.maybeSetupRetryButton", -1736094775);
        try {
            GOn.A1T(this);
            if (A1m()) {
                MontageCard montageCard = this.A0P;
                if (montageCard != null && montageCard.A02 == 3) {
                    this.A1G.A03();
                    i = 1409018003;
                    C00j.A01(i);
                }
            }
            2Wo r0 = this.A1G;
            if (r0.A00 != null) {
                ((FbTextView) r0.A01()).setVisibility(4);
            }
            i = -1976957096;
            C00j.A01(i);
        } catch (Throwable th) {
            C00j.A01(-1070871261);
            throw th;
        }
    }

    private void A0O() {
        if (!A1n() || this.A0u) {
            return;
        }
        A0g(this);
        this.A0u = true;
        this.A01 = 1BL.A08(this.A1K);
        A0M();
        A0j(this);
    }

    private void A0P() {
        int i;
        C00j.A05("MontageViewerPageFragment.maybeSubscribeFollowerSeenCount", -1918827711);
        try {
            MontageCard montageCard = this.A0P;
            if (montageCard != null) {
                String str = montageCard.A0E;
                if (str != null && !str.startsWith("sent")) {
                    C00i c00i = this.A21;
                    c00i.get();
                    if (60V.A04(this.A0P)) {
                        MontageViewerFollowerSeenCountSubscription montageViewerFollowerSeenCountSubscription = (MontageViewerFollowerSeenCountSubscription) this.A1w.get();
                        HU4 hu4 = new HU4(str);
                        montageViewerFollowerSeenCountSubscription.A02();
                        String str2 = hu4.A00;
                        if (!str2.startsWith("sent")) {
                            GraphQlQueryParamSet A0M = 7zL.A0M();
                            A0M.A05("story_id", str2);
                            A0M.A03("include_participants", false);
                            2Jf r0 = new 2Jf(2JX.class, (Class) null, "FollowerSeenCountQuery", (String) null, "fbandroid", -1853566911, 0, 3964367243L, 3964367243L, false, true);
                            AbstractC2326GOr.A1D(A0M, r0);
                            C3sa A00 = C3sa.A00(r0);
                            4fE r02 = montageViewerFollowerSeenCountSubscription.A05;
                            String A0W = 0Pz.A0W("MontageViewerFollowerSeenCountFetch", str2);
                            4YU.A1J(A00, 1567251216773138L);
                            r02.A0I(A00, new Inh(7, hu4, this, montageViewerFollowerSeenCountSubscription), A0W, montageViewerFollowerSeenCountSubscription.A08);
                        }
                    } else if (!A1m() || this.A0B == null) {
                        c00i.get();
                        if (!60V.A05(this.A0P)) {
                            c00i.get();
                            MontageCard montageCard2 = this.A0P;
                            11T.A0F(montageCard2, 0);
                            ImmutableList A03 = montageCard2.A03();
                            if (A03 != null && !A03.isEmpty()) {
                                1Du it = A03.iterator();
                                while (it.hasNext()) {
                                    if (((MontageFeedbackOverlay) it.next()).A09 != null) {
                                    }
                                }
                            }
                        }
                        if (this.A0B != null) {
                            MontageViewerFollowerSeenCountSubscription montageViewerFollowerSeenCountSubscription2 = (MontageViewerFollowerSeenCountSubscription) this.A1w.get();
                            HU4 hu42 = new HU4(str);
                            FbUserSession fbUserSession = this.A0B;
                            montageViewerFollowerSeenCountSubscription2.A02();
                            MontageViewerFollowerSeenCountSubscription.A01(fbUserSession, this, hu42, montageViewerFollowerSeenCountSubscription2);
                        }
                    } else {
                        MontageViewerFollowerSeenCountSubscription montageViewerFollowerSeenCountSubscription3 = (MontageViewerFollowerSeenCountSubscription) this.A1w.get();
                        HU4 hu43 = new HU4(str);
                        FbUserSession fbUserSession2 = this.A0B;
                        montageViewerFollowerSeenCountSubscription3.A02();
                        MontageViewerFollowerSeenCountSubscription.A01(fbUserSession2, this, hu43, montageViewerFollowerSeenCountSubscription3);
                        String str3 = hu43.A00;
                        if (!str3.startsWith("sent")) {
                            07S A0J = 4YU.A0J(GraphQlCallInput.A02, str3, "story_id");
                            GraphQlQueryParamSet A0M2 = 7zL.A0M();
                            4YV.A1A(A0J, A0M2, "input");
                            A0M2.A03("include_participants", 1BK.A0d());
                            C01983tf c01983tf = new C01983tf(C2571Ghk.class, "FollowerSeenCount", "montage_message_follower_read_subscribe", -1515365864, 1297670676L, 1297670676L);
                            AbstractC2326GOr.A1D(A0M2, c01983tf);
                            montageViewerFollowerSeenCountSubscription3.A01 = ((Eua) 1Lo.A04((Context) null, fbUserSession2, montageViewerFollowerSeenCountSubscription3.A02, 99905)).A00(null, C3sa.A00(c01983tf), new Inh(8, hu43, this, montageViewerFollowerSeenCountSubscription3));
                        }
                    }
                    i = -629834942;
                    C00j.A01(i);
                }
            }
            i = 248674966;
            C00j.A01(i);
        } catch (Throwable th) {
            C00j.A01(1423561333);
            throw th;
        }
    }

    private void A0Q() {
        C00i c00i = this.A1N;
        4YU.A0G(c00i).removeCallbacks(this.A1u);
        4YU.A0G(c00i).post(this.A1t);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0033, code lost:
    
        if (r0.equalsIgnoreCase("NEWSFEED") == false) goto L13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A0R() {
        /*
            Method dump skipped, instructions count: 1098
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2397Gbz.A0R():void");
    }

    private void A0S() {
        if (this.A0u) {
            MontageCard montageCard = this.A0P;
            0fH.A0g(montageCard == null ? null : montageCard.toString(), __redex_internal_original_name, "Stopping display for %s");
            2Wo r0 = this.A0j;
            if (r0 != null && r0.A00 != null) {
                r0.A01().scrollTo(0, 0);
            }
            this.A0u = false;
            A0h(this);
        }
    }

    private void A0T(long j) {
        GOn.A1T(this);
        this.A0Y.A05(j);
        1Br r0 = this.A2G.A00;
        7zP.A0e(r0).markerAnnotate(13248089, "marker_end_reason", "progress_indicator_start");
        7zP.A0e(r0).markerEnd(13248089, (short) 2);
        0fH.A0l("MontageViewerInboxTrayPlayMediaLogger", "marker_end_reason: success progress_indicator_start");
    }

    public static void A0U(Context context, ImmutableList.Builder builder, Object obj) {
        1Bn.A0K();
        FbInjector.A04(context);
        builder.m11011add(obj);
    }

    public static void A0V(0DA r301, 0DA r302, 0DA r303, 0DA r304, 1UG r305) {
        r305.A7T(r301, "message");
        r305.A7T(r302, "story");
        r305.A7T(r303, "mediaload");
        r305.A7T(r304, "media_info");
        r305.BZL();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void A0W(C1u3 c1u3, C2397Gbz c2397Gbz, C92i c92i, String str, int i) {
        int A03 = GOn.A0M(c2397Gbz.A1y).A03(c1u3);
        FXN A0K = c92i.A0K(c92i, str, i, 0);
        c92i.A0M(A0K);
        A0K.A02(A03);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void A0X(C6r6 c6r6, C2397Gbz c2397Gbz) {
        0LS.A0A(c2397Gbz.requireContext(), MontageComposerActivity.A12(c2397Gbz.requireContext(), 6zV.A00(c2397Gbz.requireContext(), (5Q1) 1Bn.A0A(115935), C6x1.A04, c6r6), NavigationTrigger.A03("messenger_montage_viewer")));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void A0Y(C2397Gbz c2397Gbz) {
        Activity A00;
        Window window;
        C00i c00i = c2397Gbz.A1L;
        if (((6In) c00i.get()).BSW()) {
            6Iq r0 = ((6In) c00i.get()).A05;
            FeedbackReportFragment feedbackReportFragment = r0.A00;
            if (feedbackReportFragment != null) {
                feedbackReportFragment.A0o();
            }
            r0.A00 = null;
            if (!HIP.A00(c2397Gbz) || (A00 = 4bQ.A00(c2397Gbz.requireContext())) == null || (window = A00.getWindow()) == null) {
                return;
            }
            window.setStatusBarColor(0);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r305v12 ??, still in use, count: 6, list:
          (r305v12 ??) from 0x0229: PHI (r305v11 ??) = (r305v10 ??), (r305v12 ??) binds: [B:79:0x0193, B:111:0x0224] A[DONT_GENERATE, DONT_INLINE]
          (r305v12 ?? I:android.view.View) from 0x01cf: INVOKE (r305v12 ?? I:android.view.View), (r0v289 ?? I:android.view.ViewGroup$LayoutParams) VIRTUAL call: android.view.View.setLayoutParams(android.view.ViewGroup$LayoutParams):void A[Catch: all -> 0x0594, MD:(android.view.ViewGroup$LayoutParams):void (c)]
          (r305v12 ?? I:android.view.View) from 0x01f2: INVOKE (r0v299 ?? I:X.IKl), (r305v12 ?? I:android.view.View), (r0v301 ?? I:X.JEW) VIRTUAL call: X.IKl.A01(android.view.View, X.JEW):void A[Catch: all -> 0x0594]
          (r305v12 ?? I:android.view.View) from 0x0205: INVOKE (r0v304 ?? I:android.view.ViewGroup), (r305v12 ?? I:android.view.View) VIRTUAL call: android.view.ViewGroup.addView(android.view.View):void A[Catch: all -> 0x0594, MD:(android.view.View):void (c)]
          (r305v12 ?? I:java.lang.Object) from 0x0215: INVOKE 
          (r0v263 ?? I:com.google.common.collect.HashBiMap)
          (r0v261 ?? I:java.lang.Object)
          (r305v12 ?? I:java.lang.Object)
          (r0v306 ?? I:boolean)
         STATIC call: com.google.common.collect.HashBiMap.A01(com.google.common.collect.HashBiMap, java.lang.Object, java.lang.Object, boolean):java.lang.Object A[Catch: all -> 0x0594, MD:(com.google.common.collect.HashBiMap, java.lang.Object, java.lang.Object, boolean):java.lang.Object (m)]
          (r305v12 ?? I:java.lang.Object) from 0x0225: INVOKE (r0v311 ?? I:java.util.AbstractMap), (r305v12 ?? I:java.lang.Object), (r0v299 ?? I:java.lang.Object) VIRTUAL call: java.util.AbstractMap.put(java.lang.Object, java.lang.Object):java.lang.Object A[Catch: all -> 0x0594, MD:(K, V):V (c)]
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
    public static void A0Z(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r305v12 ??, still in use, count: 6, list:
          (r305v12 ??) from 0x0229: PHI (r305v11 ??) = (r305v10 ??), (r305v12 ??) binds: [B:79:0x0193, B:111:0x0224] A[DONT_GENERATE, DONT_INLINE]
          (r305v12 ?? I:android.view.View) from 0x01cf: INVOKE (r305v12 ?? I:android.view.View), (r0v289 ?? I:android.view.ViewGroup$LayoutParams) VIRTUAL call: android.view.View.setLayoutParams(android.view.ViewGroup$LayoutParams):void A[Catch: all -> 0x0594, MD:(android.view.ViewGroup$LayoutParams):void (c)]
          (r305v12 ?? I:android.view.View) from 0x01f2: INVOKE (r0v299 ?? I:X.IKl), (r305v12 ?? I:android.view.View), (r0v301 ?? I:X.JEW) VIRTUAL call: X.IKl.A01(android.view.View, X.JEW):void A[Catch: all -> 0x0594]
          (r305v12 ?? I:android.view.View) from 0x0205: INVOKE (r0v304 ?? I:android.view.ViewGroup), (r305v12 ?? I:android.view.View) VIRTUAL call: android.view.ViewGroup.addView(android.view.View):void A[Catch: all -> 0x0594, MD:(android.view.View):void (c)]
          (r305v12 ?? I:java.lang.Object) from 0x0215: INVOKE 
          (r0v263 ?? I:com.google.common.collect.HashBiMap)
          (r0v261 ?? I:java.lang.Object)
          (r305v12 ?? I:java.lang.Object)
          (r0v306 ?? I:boolean)
         STATIC call: com.google.common.collect.HashBiMap.A01(com.google.common.collect.HashBiMap, java.lang.Object, java.lang.Object, boolean):java.lang.Object A[Catch: all -> 0x0594, MD:(com.google.common.collect.HashBiMap, java.lang.Object, java.lang.Object, boolean):java.lang.Object (m)]
          (r305v12 ?? I:java.lang.Object) from 0x0225: INVOKE (r0v311 ?? I:java.util.AbstractMap), (r305v12 ?? I:java.lang.Object), (r0v299 ?? I:java.lang.Object) VIRTUAL call: java.util.AbstractMap.put(java.lang.Object, java.lang.Object):java.lang.Object A[Catch: all -> 0x0594, MD:(K, V):V (c)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:80)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1107)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1118)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1156)
        	at jadx.core.dex.visitors.ConstructorVisitor.removeAssignChain(ConstructorVisitor.java:180)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:80)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:51)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r301v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:237)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:285)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:151)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:174)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:636)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
        	at jadx.core.ProcessClass.process(ProcessClass.java:80)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:118)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:400)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:388)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:338)
        */

    /* JADX WARN: Failed to find 'out' block for switch in B:25:0x00b9. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    public static void A0a(C2397Gbz c2397Gbz) {
        MontageCard montageCard;
        Object obj;
        if (!c2397Gbz.A0r || (montageCard = c2397Gbz.A0P) == null) {
            return;
        }
        ImmutableList A03 = montageCard.A03();
        if (A03 != null && !A03.isEmpty()) {
            c2397Gbz.A21.get();
            if (60V.A05(c2397Gbz.A0P)) {
                AbR A0V = DKC.A0V(c2397Gbz.A22);
                MontageCard montageCard2 = c2397Gbz.A0P;
                Context A01 = FbInjector.A01();
                AbL.A0y(A0V);
                try {
                    IXN ixn = new IXN(A0V, montageCard2);
                    1Bn.A0K();
                    FbInjector.A04(A01);
                    C2578Ghr c2578Ghr = (C2578Ghr) HII.A00(ixn.AmF(), "StoryOverlayPollSticker").get(0);
                    2JX A0u = c2578Ghr.A0u();
                    if (A0u == null || c2578Ghr.BKY() == null || TextUtils.isEmpty(A0u.A0k())) {
                        return;
                    }
                    String A0v = c2578Ghr.A0v();
                    if (A0v != null) {
                        switch (A0v.hashCode()) {
                            case -405921061:
                                obj = "IG_TWO_OPTION_COMBINED";
                                if (A0v.equals(obj) || A0u.A2K(-892168674, 333599975).size() != 2) {
                                    return;
                                }
                                break;
                            case -392708595:
                                if (!A0v.equals("FIVE_OPTION_STAR_RATING") || A0u.A2K(-892168674, 333599975).size() != 5) {
                                    return;
                                }
                                break;
                            case 405882748:
                                obj = "TWO_OPTION_COMBINED";
                                if (A0v.equals(obj)) {
                                    return;
                                } else {
                                    return;
                                }
                            default:
                                return;
                        }
                    }
                    if ("TWO_OPTION_COMBINED".equals(A0v)) {
                        1Du it = A0u.A2K(-892168674, 333599975).iterator();
                        while (it.hasNext()) {
                            if (TextUtils.isEmpty(7zL.A0P(it).A0i())) {
                                return;
                            }
                        }
                        C00i c00i = c2397Gbz.A1c;
                        IFW ifw = (IFW) c00i.get();
                        ifw.A08 = ixn;
                        2JX A0u2 = I6C.A00(ixn).A0u();
                        GOq.A0X(1Fw.A04(ifw.A0I), ifw).A01(I6C.A01(A0u2, A0u2.getBooleanValue(-282985720) ? -1 : A0u2.getIntValue(1760627594), true), A0u2.A0k(), 4YU.A06(ifw.A08.A01.A05 + 86400000));
                        View view = ifw.A04;
                        if (view != null) {
                            view.setVisibility(GOp.A03(view.isLaidOut() ? 1 : 0));
                            FGQ.A00(ifw.A04, new S8B(ifw));
                        }
                        if (c2397Gbz.getContext() != null) {
                            IFW ifw2 = (IFW) c00i.get();
                            ((HsD) 1Lo.A04((Context) null, 1Fw.A04(ifw2.A0I), ifw2.A05, 99757)).A01(c2397Gbz.getContext(), ifw2.A0N);
                            return;
                        }
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    1Bn.A0K();
                    FbInjector.A04(A01);
                    throw th;
                }
            }
        }
        c2397Gbz.A0h.A02();
        if (c2397Gbz.getContext() != null) {
            ((IFW) c2397Gbz.A1c.get()).A09();
        }
    }

    public static void A0b(C2397Gbz c2397Gbz) {
        GOn.A1T(c2397Gbz);
        I8O i8o = (I8O) c2397Gbz.A27.get();
        MontageCard montageCard = c2397Gbz.A0P;
        if (montageCard != null) {
            String str = (montageCard.A01() == null || montageCard.A01().isEmpty()) ? "" : GOp.A0L(montageCard).A0I;
            String valueOf = String.valueOf(montageCard.A03);
            String str2 = montageCard.A0E;
            boolean A00 = C48H.A00(montageCard.A0H);
            String str3 = A00 ? "28790" : "2048";
            1UG A08 = 1BK.A08(1Br.A02(i8o.A02), 1BJ.A00(1513));
            0DA r0 = new 0DA();
            r0.A07("media_id", str);
            0DA r02 = new 0DA();
            String str4 = montageCard.A0I;
            if (str4 == null) {
                str4 = "";
            }
            r02.A07("optimistic_client_id", str4);
            0DA r03 = new 0DA();
            r03.A07("owner_id", "");
            r03.A07("bucket_id", valueOf);
            r03.A07("story_id", str2);
            7zN.A14(r03, "story_source", A00 ? 1 : 0);
            r03.A07("sender_fbtype", str3);
            0DA r04 = new 0DA();
            r04.A07("session_id", "");
            Double A0H = A0H(r04);
            0DA r05 = new 0DA();
            Long A0i = 4YV.A0i();
            r05.A06(Property.ICON_TEXT_FIT_HEIGHT, A0i);
            r05.A06(Property.ICON_TEXT_FIT_WIDTH, A0i);
            0DA r06 = new 0DA();
            r06.A04("original_bit_rate", A0H);
            r06.A04("length_in_sec", A0H);
            0DA r07 = new 0DA();
            r07.A02(r06, "video");
            0DA r08 = new 0DA();
            r08.A07("raw_type", I8O.A00(montageCard));
            r08.A06(Property.ICON_TEXT_FIT_HEIGHT, A0i);
            r08.A06(Property.ICON_TEXT_FIT_WIDTH, A0i);
            r08.A02(r05, "downsized_dimensions");
            r08.A02(r07, "subtype_attrs");
            0DA r09 = new 0DA();
            r09.A02(r08, "client_data");
            if (A08.isSampled()) {
                A08.A7T(r0, "media");
                A0V(r02, r03, r04, r09, A08);
            }
        }
        C00i c00i = c2397Gbz.A1N;
        4YU.A0G(c00i).removeCallbacks(c2397Gbz.A1t);
        4YU.A0G(c00i).postDelayed(c2397Gbz.A1u, 500L);
        if (c2397Gbz.A0n()) {
            c2397Gbz.BrJ();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void A0c(C2397Gbz c2397Gbz) {
        A0h(c2397Gbz);
        I2w i2w = c2397Gbz.A1D;
        if (i2w != null) {
            FbUserSession fbUserSession = c2397Gbz.A0B;
            fbUserSession.getClass();
            i2w.A04 = null;
            i2w.A01();
            I2w.A00(fbUserSession, null, i2w, null, null, null, null, 0, 0);
        }
        A0Y(c2397Gbz);
        c2397Gbz.A0A.setText("");
        c2397Gbz.A0A.setVisibility(8);
        c2397Gbz.A0A.setOnClickListener(null);
        c2397Gbz.A09.setText("");
        c2397Gbz.A09.setVisibility(8);
        c2397Gbz.A09.setOnClickListener(null);
        c2397Gbz.A15.setText("");
        c2397Gbz.A15.setVisibility(8);
        7zL.A0F(c2397Gbz, 2131363685).setVisibility(8);
        c2397Gbz.A15.setOnClickListener(null);
        c2397Gbz.A16.setText("");
        c2397Gbz.A16.setVisibility(8);
        c2397Gbz.A16.setOnClickListener(null);
        c2397Gbz.A0j.A02();
        HGD hgd = c2397Gbz.A0X;
        if (hgd != null && (hgd instanceof C2800God)) {
            ((C2800God) hgd).A00.A0S.A02();
        }
        c2397Gbz.A0g.setVisibility(4);
        c2397Gbz.A0g.A03(null);
        c2397Gbz.A0g.setOnClickListener(null);
        UserTileView userTileView = GOo.A0Q(c2397Gbz).A07;
        userTileView.setVisibility(8);
        userTileView.A03(null);
        userTileView.setOnClickListener(null);
        c2397Gbz.A05.setVisibility(8);
        c2397Gbz.A1F.A02();
        2Wo r0 = c2397Gbz.A1G;
        if (r0.A00 != null) {
            GOo.A1N(r0, 4);
        }
        c2397Gbz.A0Q();
        c2397Gbz.CnF(-16777216);
        I5c i5c = c2397Gbz.A0R;
        C00j.A05("MontageViewerPageController.resetMontageViewerViewControllers", 625425926);
        try {
            int size = i5c.A04.size();
            for (int i = 0; i < size; i++) {
                ((IXY) i5c.A04.get(i)).A04();
            }
            C00j.A01(-1152822199);
            c2397Gbz.A0Y.A01();
            if (HIP.A00(c2397Gbz)) {
                ViewGroup.MarginLayoutParams A0I = DKC.A0I(c2397Gbz.A0Y);
                A0I.setMargins(A0I.leftMargin, 7zO.A0D(c2397Gbz).getDimensionPixelSize(2132279321), A0I.rightMargin, A0I.bottomMargin);
                c2397Gbz.A0Y.setLayoutParams(A0I);
                int dimensionPixelSize = 7zO.A0D(c2397Gbz).getDimensionPixelSize(2132279310);
                ViewGroup.LayoutParams layoutParams = c2397Gbz.A07.getLayoutParams();
                layoutParams.width = dimensionPixelSize;
                layoutParams.height = dimensionPixelSize;
                ViewGroup.LayoutParams layoutParams2 = c2397Gbz.A06.getLayoutParams();
                layoutParams2.width = dimensionPixelSize;
                layoutParams2.height = dimensionPixelSize;
                DKC.A0I(c2397Gbz.A04).rightMargin = 7zO.A0D(c2397Gbz).getDimensionPixelSize(2132279326);
            }
            c2397Gbz.A0t = false;
            c2397Gbz.A0q = false;
            c2397Gbz.A1I = false;
            c2397Gbz.A0p = false;
            c2397Gbz.A0o = false;
            c2397Gbz.A13 = 0L;
            c2397Gbz.A11 = 0;
            c2397Gbz.A0w = false;
            c2397Gbz.A0z = false;
            c2397Gbz.A12 = 0L;
            Ht2 ht2 = c2397Gbz.A1C;
            if (ht2 != null) {
                ht2.A02();
            }
            Ht2 ht22 = c2397Gbz.A1A;
            if (ht22 != null) {
                ht22.A02();
            }
            Ht2 ht23 = c2397Gbz.A1B;
            if (ht23 != null) {
                ht23.A02();
            }
            c2397Gbz.A0R.A04(false);
            I3z i3z = c2397Gbz.A0e;
            if (i3z != null) {
                i3z.A01();
            }
        } catch (Throwable th) {
            C00j.A01(-1829551551);
            throw th;
        }
    }

    public static void A0d(C2397Gbz c2397Gbz) {
        MontageViewerReactionsComposerView A0Q = GOo.A0Q(c2397Gbz);
        ViewGroup.LayoutParams layoutParams = A0Q.getLayoutParams();
        if ((layoutParams instanceof LinearLayout.LayoutParams) && c2397Gbz.A0p()) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, 3yG.A01(16.0f));
        }
        A0Q.A01 = c2397Gbz.A1n;
        A0Q.A04.A03 = new IXS(A0Q);
        c2397Gbz.A0j.A03();
        A0Z(c2397Gbz);
    }

    public static void A0e(C2397Gbz c2397Gbz) {
        if (c2397Gbz.A19 == null) {
            c2397Gbz.A19 = new HTw(c2397Gbz);
        }
        c2397Gbz.A0F().A04 = c2397Gbz.A19;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x009b, code lost:
    
        if (X.1JF.A0A(r302) == false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A0f(X.C2397Gbz r301) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2397Gbz.A0f(X.Gbz):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0038, code lost:
    
        if (r0 == null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003b, code lost:
    
        r304 = r0.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0041, code lost:
    
        r0 = r301.A0P;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0049, code lost:
    
        if (r0 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005a, code lost:
    
        if (X.C48H.A01(r0.A0H) != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005d, code lost:
    
        r0 = A0A(r301);
        r0.getClass();
        r303 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0082, code lost:
    
        if (r0.A01.equalsIgnoreCase("Page") != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x008b, code lost:
    
        if (r303 == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x008f, code lost:
    
        if (r304 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0092, code lost:
    
        r301.A0g.A03(X.2qZ.A07(r304));
        r301.A0g.setVisibility(0);
        r301.A0g.setClickable(false);
        r0 = X.GOo.A0Q(r301).A07;
        r0.setVisibility(8);
        r0.A03(null);
        r0.setOnClickListener(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00d2, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00d5, code lost:
    
        if (r306 == null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00d8, code lost:
    
        r0 = r301.A0P;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00e0, code lost:
    
        if (r0 == null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00f1, code lost:
    
        if (X.C48H.A00(r0.A0H) == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00f4, code lost:
    
        r0 = (X.9R4) r301.A20.get();
        r301.A0B.getClass();
        r0 = r306.id;
        r0 = r301.A0g;
        r0 = X.7zL.A0M();
        com.google.common.base.Preconditions.checkArgument(X.DKE.A1W(r0, X.AbE.A00(80), r0));
        X.1Kd.A0D(r0.A02, new X.ABp(r0, r0, 14), ((X.DKN) X.1Bn.A0E((android.content.Context) null, r0.A00, 68643)).A01().A09(X.7zM.A0L(r0, new X.2Jf(X.2JX.class, (java.lang.Class) null, "MontageInstagramProfilePicture", (java.lang.String) null, "fbandroid", 190816902, 0, 1374304352, 1374304352, false, true))));
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x01ad, code lost:
    
        if (r0 == null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x01b0, code lost:
    
        r0 = r0.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x01b9, code lost:
    
        if (r0 == null) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x01c3, code lost:
    
        if (r0.isEmpty() != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x01c6, code lost:
    
        r301.A0g.setContentDescription(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01cf, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01db, code lost:
    
        if ((!r301.A1m()) == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01f7, code lost:
    
        if (((X.1XZ) r301.A2A.get()).BX3(r306) == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01fa, code lost:
    
        r306 = X.2qZ.A06(r306, X.C2fd.A01);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0208, code lost:
    
        r301.A0g.A03(r306);
        r301.A0g.setVisibility(0);
        r301.A0g.setClickable(true);
        r0 = X.GOo.A0Q(r301).A07;
        r0.setVisibility(8);
        r0.A03(null);
        r0.setOnClickListener(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0246, code lost:
    
        r306 = X.2qZ.A04(r306);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0085, code lost:
    
        r303 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0264, code lost:
    
        if (r306 != null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002d, code lost:
    
        if (r306 != null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0030, code lost:
    
        r0 = A0A(r301);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A0g(X.C2397Gbz r301) {
        /*
            Method dump skipped, instructions count: 627
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2397Gbz.A0g(X.Gbz):void");
    }

    public static void A0h(C2397Gbz c2397Gbz) {
        L5Q l5q = c2397Gbz.A0k;
        if (l5q != null) {
            l5q.A01();
            c2397Gbz.A0k = null;
        }
        if (c2397Gbz.A0P != null) {
            c2397Gbz.A0K();
            c2397Gbz.A0Y.A01();
            c2397Gbz.A12 = 0L;
            c2397Gbz.A13 = 0L;
            Object A0E = A0E(c2397Gbz);
            if (A0E instanceof JP7) {
                ((JP7) A0E).stop();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0019, code lost:
    
        if (r301.A1m() != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0064, code lost:
    
        if (r305 != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0043, code lost:
    
        if (((X.I4p) r0.A01(X.I4p.class)).A03() == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A0i(X.C2397Gbz r301) {
        /*
            Method dump skipped, instructions count: 334
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2397Gbz.A0i(X.Gbz):void");
    }

    public static void A0j(C2397Gbz c2397Gbz) {
        int i;
        C00j.A05("MontageViewerPageFragment.updatePlayState", -1216330526);
        try {
            if (c2397Gbz.A0p) {
                c2397Gbz.A1e();
                i = -1305267592;
            } else if (c2397Gbz.A0n()) {
                I3e A1X = c2397Gbz.A1X();
                if (c2397Gbz.A0u) {
                    MontageViewerFragment montageViewerFragment = c2397Gbz.A0Q;
                    if (montageViewerFragment == null || !montageViewerFragment.A1C()) {
                        MontageViewerFragment montageViewerFragment2 = c2397Gbz.A0Q;
                        if ((montageViewerFragment2 == null || !montageViewerFragment2.A0U.A05()) && !c2397Gbz.A0U.A02()) {
                            EAX eax = c2397Gbz.A0F().A02;
                            if (eax == null || !eax.isShowing()) {
                                2Wo r0 = c2397Gbz.A0i;
                                if (r0 != null && r0.A05()) {
                                    MontageViewerReactionsOverlayView montageViewerReactionsOverlayView = (MontageViewerReactionsOverlayView) c2397Gbz.A0i.A01();
                                    int childCount = montageViewerReactionsOverlayView.getChildCount();
                                    for (int i2 = 0; i2 < childCount; i2++) {
                                        if (montageViewerReactionsOverlayView.getChildAt(i2).getVisibility() == 0) {
                                            break;
                                        }
                                    }
                                }
                                if (!c2397Gbz.A0z && !c2397Gbz.A0x && c2397Gbz.A0C == null && !((6In) c2397Gbz.A1L.get()).BSW() && ((A1X == null || !((I4p) A1X.A01(I4p.class)).A03()) && !c2397Gbz.A0v)) {
                                    c2397Gbz.A1e();
                                    i = 1270966062;
                                }
                            }
                        }
                    }
                }
                c2397Gbz.A1c();
                i = 1270966062;
            } else {
                i = -18974018;
            }
            C00j.A01(i);
        } catch (Throwable th) {
            C00j.A01(-1901141754);
            throw th;
        }
    }

    public static void A0k(C2397Gbz c2397Gbz, String str) {
        I3K i3k = c2397Gbz.A0R.A03;
        I0O A01 = i3k.A01();
        A01.A01 = str;
        C1pq.A08("emojiReaction", str);
        I3K.A00(A01, i3k);
        c2397Gbz.A0z = true;
        I3K i3k2 = c2397Gbz.A0R.A03;
        I0O A012 = i3k2.A01();
        A012.A01 = "";
        I3K.A00(A012, i3k2);
    }

    public static void A0l(C2397Gbz c2397Gbz, String str) {
        ((MontageViewerReactionsOverlayView) c2397Gbz.A0i.A01()).A0V(new HU3(new MontageMessageReactionViewModel((UserKey) c2397Gbz.A1O.get(), str, ((C9hd) c2397Gbz.A1d.get()).A00(str))));
        c2397Gbz.A0i.A03();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private boolean A0m() {
        MontageMetadata montageMetadata;
        if (this.A0P == null || HIP.A00(this)) {
            return false;
        }
        return A1m() || (montageMetadata = this.A0P.A0A) == null || montageMetadata.A0O || montageMetadata.A0Q;
    }

    private boolean A0n() {
        MontageBucket montageBucket;
        GL2 gl2;
        boolean z = false;
        if (this.A0P != null) {
            if (A0E(this) != this.A1p || this.A0b == null) {
                return this.A0t;
            }
            HhX A1Y = A1Y();
            if (A1Y != null && (montageBucket = this.A0N) != null) {
                int i = montageBucket.A00;
                ImmutableList immutableList = A1Y.A02;
                if (i < immutableList.size() && (gl2 = (GL2) immutableList.get(this.A0N.A00)) != null) {
                    Integer A01 = F1z.A01(gl2);
                    if (A01.equals(0S2.A0Y) || A01.equals(0S2.A0u) || A01.equals(0S2.A0N)) {
                        return true;
                    }
                    z = this.A0R.A03.A02().A09;
                }
            }
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001e, code lost:
    
        if (X.1BL.A0Q().AZk(2342168768863097815L) == false) goto L6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A0o() {
        /*
            r301 = this;
            r0 = r301
            boolean r0 = X.HIP.A00(r0)
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L21
            X.2yD r0 = X.1BL.A0Q()
            r303 = r0
            r0 = 2342168768863097815(0x20810e16001953d7, double:4.070469574354509E-152)
            r304 = r0
            r0 = r303
            r1 = r304
            boolean r0 = r0.AZk(r1)
            r306 = r0
            r0 = 1
            r302 = r0
            r0 = r306
            if (r0 != 0) goto L23
        L21:
            r0 = 0
            r302 = r0
        L23:
            r0 = r302
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2397Gbz.A0o():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private boolean A0p() {
        return requireArguments().getInt("extra_render_destination", 1) == 1 && this.A2F.A00.AZk(72341323872473684L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0063, code lost:
    
        if (X.0CV.A0b(r0, "sent", false) == false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A0q(com.facebook.messaging.montage.model.MontageCard r301, X.C2397Gbz r302) {
        /*
            r0 = r301
            int r0 = r0.A02
            r303 = r0
            r0 = 0
            r304 = r0
            r0 = 3
            r305 = r0
            r0 = r303
            r1 = r305
            if (r0 == r1) goto L68
            r0 = r302
            X.00i r0 = r0.A0E
            java.lang.Object r0 = X.4YU.A0p(r0)
            X.5HO r0 = (X.5HO) r0
            r1 = r301
            X.81P r0 = r0.AyH(r1)
            X.81O r0 = r0.A00
            r306 = r0
            X.81O r0 = X.C81O.FAILED
            r307 = r0
            r0 = r306
            r1 = r307
            if (r0 == r1) goto L68
            r0 = 1
            r305 = r0
            r0 = r303
            r1 = r305
            if (r0 == r1) goto L66
            r0 = r301
            java.lang.String r0 = r0.A0E
            r306 = r0
            r0 = r306
            r1 = 0
            X.11T.A0F(r0, r1)
            r0 = r306
            int r0 = r0.length()
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L66
            java.lang.String r0 = "sent"
            r307 = r0
            r0 = r306
            r1 = r307
            r2 = 0
            boolean r0 = X.0CV.A0b(r0, r1, r2)
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L68
        L66:
            r0 = 1
            r304 = r0
        L68:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2397Gbz.A0q(com.facebook.messaging.montage.model.MontageCard, X.Gbz):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0028, code lost:
    
        if (r301.A1q.AZk(72341160663781836L) != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A0r(X.C2397Gbz r301) {
        /*
            r0 = r301
            X.9c8 r0 = r0.A0d
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L2b
            r0 = r302
            boolean r0 = r0.A05
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L2b
            r0 = r301
            X.1CO r0 = r0.A1q
            r301 = r0
            r0 = 72341160663781836(0x10101e7000111cc, double:7.750203430170564E-304)
            r304 = r0
            r0 = r301
            r1 = r304
            boolean r0 = r0.AZk(r1)
            r306 = r0
            r0 = 1
            r303 = r0
            r0 = r306
            if (r0 == 0) goto L2f
        L2b:
            r0 = 0
            r303 = r0
            r0 = 0
            r302 = r0
        L2f:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2397Gbz.A0r(X.Gbz):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001f, code lost:
    
        if (r301.A1q.AZk(72341160663716299L) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A0s(X.C2397Gbz r301) {
        /*
            r0 = r301
            boolean r0 = A0r(r0)
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L22
            r0 = r301
            X.1CO r0 = r0.A1q
            r301 = r0
            r0 = 72341160663716299(0x10101e7000011cb, double:7.750203430064462E-304)
            r303 = r0
            r0 = r301
            r1 = r303
            boolean r0 = r0.AZk(r1)
            r305 = r0
            r0 = 1
            r302 = r0
            r0 = r305
            if (r0 != 0) goto L24
        L22:
            r0 = 0
            r302 = r0
        L24:
            r0 = r302
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2397Gbz.A0s(X.Gbz):boolean");
    }

    private I3e A1X() {
        MontageViewerFragment montageViewerFragment = this.A0Q;
        if (montageViewerFragment == null) {
            return null;
        }
        return (I3e) montageViewerFragment.A19.get();
    }

    public void A1O(boolean z, boolean z2) {
        super.A1O(z, z2);
        if (z) {
            A0O();
            A0Z(this);
            return;
        }
        A0S();
        2Wo r0 = this.A0j;
        if (r0 != null && r0.A05()) {
            GOo.A0Q(this).A04.fullScroll(17);
        }
        this.A1I = false;
    }

    public 1iF A1R() {
        return AbF.A0C(1567251216773138L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1S(Bundle bundle) {
        FbUserSession A0G = 1BL.A0G(this);
        this.A0B = A0G;
        this.A0D = 1Lo.A02(A0G, this, 67417);
        this.A0E = 1Lo.A02(this.A0B, this, 82477);
        this.A0F = 1Lo.A02(this.A0B, this, 33258);
        this.A0J = 1Lo.A02(this.A0B, this, 84844);
        this.A0K = 1Lo.A02(this.A0B, this, 49712);
        this.A0H = 1Lo.A02(this.A0B, this, 116003);
        this.A17 = 1Lo.A02(this.A0B, this, 116009);
        this.A0G = 1Lo.A02(this.A0B, this, 116010);
        this.A0I = 1Lo.A02(this.A0B, this, 116013);
        this.A0L = 1Lo.A02(this.A0B, this, 33124);
        this.A18 = 1Lo.A02(this.A0B, this, 33201);
        String A0I = A0I(this.mArguments);
        A09(this).A09(A0I, "viewer_page_fragment_on_create_start");
        HeK heK = new HeK(A03(), A0o(), A0p());
        C1F6 A0P = AbF.A0P(this.A28);
        Context A01 = FbInjector.A01();
        AbL.A0y(A0P);
        try {
            I5c i5c = new I5c(this, heK);
            1Bn.A0K();
            FbInjector.A04(A01);
            this.A0R = i5c;
            this.A0a = new HoQ((HIJ) this.A26.get(), new HTq(this));
            A09(this).A09(A0I, "viewer_page_fragment_on_create_end");
            this.A0M = (AeX) 7zO.A0l(this, 82710);
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A01);
            throw th;
        }
    }

    public HhX A1Y() {
        MontageViewerFragment montageViewerFragment;
        MontageBucket montageBucket;
        ICk iCk;
        int A04;
        HhX hhX = null;
        if (this.A0b != null && (montageViewerFragment = this.A0Q) != null && (montageBucket = this.A0N) != null) {
            long j = montageBucket.A01.A00;
            if (j > 0 && montageBucket.A00 != -1 && (iCk = montageViewerFragment.A0M) != null && (A04 = iCk.A04(j)) >= 0) {
                hhX = (HhX) GOo.A0s(this.A0b.A00, A04);
            }
        }
        return hhX;
    }

    public void A1Z() {
        MontageMetadata montageMetadata;
        GOn.A1T(this);
        if (A1m() || (montageMetadata = this.A0P.A0A) == null || !montageMetadata.A0P || this.A0R.A03.A02().A0D) {
            return;
        }
        A0d(this);
        2Wo r0 = this.A0j;
        if (r0 == null || r0.A00 == null) {
            return;
        }
        r0.A01().scrollTo(0, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1a() {
        this.A0N.getClass();
        Preconditions.checkState(!A1m());
        String A0J = A0J(this);
        Resources A0D = 7zO.A0D(this);
        String A0u = A0J != null ? 4YU.A0u(A0D, A0J, 2131960727) : A0D.getString(2131960726);
        UserKey userKey = this.A0N.A02;
        if (userKey != null) {
            ((C4Nu) 4YU.A0p(this.A0F)).A00(userKey);
        }
        MontageViewerFragment montageViewerFragment = this.A0Q;
        if (montageViewerFragment != null) {
            MontageViewerFragment.A0T(montageViewerFragment, 0S2.A1J, this.A0N.A01.A00);
        }
        if (isAdded()) {
            AbstractC2327GOs.A0r(this.A1h, A0u);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x00c4, code lost:
    
        if (r309 == null) goto L10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A1b() {
        /*
            Method dump skipped, instructions count: 454
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2397Gbz.A1b():void");
    }

    public void A1c() {
        if (this.A0w || this.A0P == null) {
            return;
        }
        GOo.A1H(this.A0Y);
        MontageCard montageCard = this.A0P;
        this.A12 = (montageCard == null ? 0L : montageCard.A04) - A07(this);
        this.A0w = true;
        this.A0R.A03();
        JFM A0E = A0E(this);
        if (A0E instanceof JFM) {
            A0E.pause();
        }
        A0K();
    }

    public void A1d() {
        if (this.A0P != null) {
            A0h(this);
            A0j(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A1e() {
        /*
            Method dump skipped, instructions count: 507
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2397Gbz.A1e():void");
    }

    public void A1f() {
        Window window;
        GOn.A1T(this);
        if (this.A0P == null || this.A0N == null) {
            return;
        }
        A1c();
        I2w A0F = A0F();
        FbUserSession fbUserSession = this.A0B;
        fbUserSession.getClass();
        MontageCard montageCard = this.A0P;
        MontageBucket montageBucket = this.A0N;
        int i = ((MontageViewerFollowerSeenCountSubscription) this.A1w.get()).A00;
        MontageBucket montageBucket2 = this.A0N;
        I2w.A00(fbUserSession, montageBucket, A0F, montageCard.A0B, montageCard.A03(), montageCard.A04(), montageCard.A0E, i, montageBucket2 != null ? montageBucket2.A00 : -1);
        EAX eax = A0F.A02;
        if (eax == null || !eax.isShowing()) {
            if (A0F.A02 == null) {
                Context context = A0F.A0F;
                A0F.A02 = new EAX(context);
                Hb5 hb5 = new Hb5(fbUserSession, A0F);
                C1F6 A0I = GOo.A0I(A0F.A0J);
                List list = A0F.A0A;
                int i2 = A0F.A00;
                ImmutableList immutableList = A0F.A07;
                1Mu r0 = A0F.A08;
                Context A01 = FbInjector.A01();
                AbL.A0y(A0I);
                try {
                    GWe gWe = new GWe(context, r0, list, immutableList, i2);
                    1Bn.A0K();
                    FbInjector.A04(A01);
                    A0F.A05 = gWe;
                    gWe.A01 = hb5;
                    EAX eax2 = A0F.A02;
                    LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, 1, false);
                    linearLayoutManager.A0f();
                    RecyclerView recyclerView = new RecyclerView(context, null);
                    DKD.A1B(recyclerView, -1, -2);
                    recyclerView.A1D(linearLayoutManager);
                    recyclerView.setBackgroundColor(-1);
                    recyclerView.A16(A0F.A05);
                    eax2.setContentView(recyclerView);
                    A0F.A02.setOnDismissListener(new IGZ(A0F, 9));
                } catch (Throwable th) {
                    1Bn.A0K();
                    FbInjector.A04(A01);
                    throw th;
                }
            }
            EAX eax3 = A0F.A02;
            if (eax3 != null && (window = eax3.getWindow()) != null) {
                window.addFlags(8);
                A0F.A01 = 0AU.A00(16) ? window.getDecorView().getSystemUiVisibility() : window.getAttributes().flags;
                1tJ.A04(window, 5381);
                A0F.A02.show();
                window.clearFlags(8);
            }
        }
        A0e(this);
        HGD hgd = this.A0X;
        if (hgd == null || !(hgd instanceof C2800God)) {
            return;
        }
        MontageViewerFragment montageViewerFragment = ((C2800God) hgd).A00;
        IAR iar = montageViewerFragment.A0G;
        if (iar == null || iar.A02 == null) {
            1BK.A09(montageViewerFragment.A10).D11("MontageViewerFragment", "onSeenListOpened before setting mCurrentPageItem");
            return;
        }
        C00i c00i = montageViewerFragment.A16;
        I8O i8o = (I8O) c00i.get();
        String obj = Boolean.TRUE.toString();
        11T.A0F(obj, 1);
        i8o.A00.put("open_seen_list", obj);
        I8O i8o2 = (I8O) c00i.get();
        MontageCard A0o = GOn.A0o(montageViewerFragment.A0G.A02);
        if (A0o == null || !A0o.A0M) {
            return;
        }
        ArrayList A0s = AnonymousClass001.A0s();
        1Du it = A0o.A0B.iterator();
        while (it.hasNext()) {
            String str = ((MontageUser) it.next()).A01.id;
            11T.A0A(str);
            A0s.add(str);
        }
        HashMap A0u = AnonymousClass001.A0u();
        String str2 = A0o.A0E;
        11T.A0A(str2);
        A0u.put(TraceFieldType.MsgId, str2);
        A0u.put("viewer_ids", 0QD.A0K(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, "", "", A0s, (Function1) null, -1));
        1UG A08 = 1BK.A08(1BK.A07(i8o2.A06.A00), AbstractC00603o4.A00(Process.SD_PIPE));
        if (A08.isSampled()) {
            try {
                A08.A7R("pigeon_reserved_keyword_module", "");
                A08.A6H(TraceFieldType.MsgId, 1BK.A0n(AbstractC2327GOs.A0T(TraceFieldType.MsgId, ConstantsKt.CAMERA_ID_FRONT, A0u)));
                A08.A7R("viewer_ids", AbstractC2327GOs.A0T("viewer_ids", "", A0u));
                A08.A7R(1BJ.A00(212), "");
                A08.A7R(1BJ.A00(211), "");
                A08.BZL();
            } catch (NumberFormatException e) {
                0fH.A0r("MontageLogger", "exception = %s", e);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x01f8, code lost:
    
        if (com.google.common.base.Objects.equal(r0.A0E, r0.A0E) == false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x0513, code lost:
    
        if (r301.A0s != false) goto L288;
     */
    /* JADX WARN: Code restructure failed: missing block: B:484:0x0937, code lost:
    
        if (r302.A00() != 0) goto L503;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:443:0x0831 A[Catch: all -> 0x098c, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x098c, blocks: (B:3:0x0010, B:5:0x0019, B:7:0x0026, B:9:0x002c, B:13:0x003c, B:15:0x0041, B:17:0x004f, B:22:0x0057, B:25:0x0062, B:28:0x006c, B:29:0x0072, B:31:0x0084, B:33:0x008c, B:35:0x009a, B:37:0x00a6, B:40:0x00b2, B:41:0x00b9, B:43:0x00cb, B:45:0x00d4, B:47:0x00e2, B:49:0x00ee, B:51:0x00f7, B:54:0x0101, B:56:0x0111, B:59:0x0124, B:61:0x012a, B:62:0x012f, B:65:0x013b, B:68:0x0147, B:71:0x0151, B:74:0x015d, B:75:0x0164, B:76:0x016d, B:77:0x0174, B:78:0x017b, B:79:0x0181, B:80:0x0186, B:84:0x0194, B:86:0x019a, B:87:0x01a1, B:88:0x01a8, B:89:0x01ae, B:93:0x01bc, B:95:0x01c2, B:96:0x01c9, B:97:0x01d0, B:102:0x01df, B:103:0x01e5, B:105:0x01ed, B:113:0x0219, B:115:0x0224, B:117:0x022a, B:118:0x0231, B:119:0x0238, B:121:0x023f, B:122:0x0244, B:123:0x024a, B:125:0x0254, B:127:0x025b, B:128:0x0260, B:129:0x0267, B:130:0x026e, B:132:0x0278, B:134:0x027e, B:135:0x0283, B:140:0x02a1, B:142:0x02a8, B:144:0x02ad, B:146:0x02b2, B:148:0x02b7, B:150:0x02bc, B:152:0x02c1, B:154:0x02c6, B:155:0x02cb, B:157:0x02d2, B:159:0x02d7, B:162:0x02e1, B:165:0x02eb, B:168:0x02f7, B:171:0x0301, B:172:0x0308, B:173:0x030f, B:175:0x0317, B:176:0x031b, B:178:0x0327, B:180:0x032e, B:182:0x033c, B:184:0x0298, B:185:0x0348, B:186:0x034f, B:187:0x0356, B:188:0x035d, B:190:0x0364, B:193:0x036c, B:194:0x0373, B:196:0x037c, B:198:0x0383, B:201:0x038d, B:202:0x0394, B:203:0x039a, B:205:0x03a4, B:207:0x03ab, B:208:0x03b0, B:211:0x03ba, B:212:0x03c1, B:213:0x03c8, B:214:0x03cf, B:219:0x03e8, B:222:0x03f7, B:223:0x03fe, B:225:0x0405, B:231:0x0417, B:233:0x0427, B:234:0x042e, B:236:0x0435, B:238:0x043a, B:240:0x043f, B:242:0x0444, B:244:0x0449, B:246:0x044e, B:248:0x0453, B:250:0x0458, B:253:0x0460, B:256:0x046a, B:257:0x0470, B:260:0x047a, B:263:0x0485, B:266:0x048f, B:267:0x0496, B:268:0x049d, B:270:0x04a8, B:272:0x04ae, B:273:0x04b2, B:275:0x04c7, B:277:0x04cd, B:278:0x04d1, B:280:0x04dd, B:282:0x04e3, B:283:0x04e8, B:286:0x04f4, B:289:0x0505, B:293:0x051b, B:295:0x0521, B:296:0x0525, B:299:0x0531, B:302:0x0542, B:306:0x054d, B:308:0x0554, B:311:0x055c, B:312:0x0563, B:313:0x056a, B:314:0x0570, B:315:0x0575, B:317:0x057d, B:318:0x0584, B:319:0x058b, B:321:0x0592, B:322:0x0597, B:323:0x059e, B:324:0x05a5, B:327:0x05b1, B:328:0x05ba, B:330:0x05c3, B:331:0x05ca, B:332:0x05d1, B:335:0x05dd, B:336:0x05e6, B:337:0x05ed, B:339:0x0627, B:341:0x0632, B:342:0x0639, B:345:0x064e, B:346:0x0654, B:348:0x065b, B:349:0x0661, B:351:0x066e, B:352:0x0675, B:354:0x0680, B:356:0x0686, B:357:0x068b, B:360:0x0697, B:361:0x069e, B:364:0x06a8, B:365:0x06af, B:366:0x06b6, B:367:0x06bc, B:369:0x06ca, B:371:0x06d3, B:373:0x06d9, B:376:0x06fe, B:378:0x0707, B:380:0x070e, B:382:0x0714, B:384:0x071a, B:386:0x071f, B:387:0x0723, B:389:0x072b, B:391:0x0732, B:393:0x073b, B:395:0x0742, B:396:0x0747, B:397:0x074e, B:398:0x0755, B:399:0x075c, B:401:0x0767, B:403:0x077a, B:404:0x0781, B:405:0x0788, B:407:0x079f, B:409:0x07a8, B:414:0x07bd, B:416:0x07c4, B:417:0x07c9, B:419:0x07d0, B:422:0x07da, B:425:0x07e4, B:428:0x07f0, B:431:0x07fa, B:432:0x0801, B:433:0x0808, B:435:0x0810, B:436:0x0814, B:438:0x0820, B:440:0x0827, B:443:0x0831, B:446:0x083b, B:449:0x0846, B:450:0x084c, B:452:0x0853, B:454:0x0859, B:457:0x085f, B:462:0x0878, B:464:0x0880, B:466:0x06e6, B:467:0x06ec, B:470:0x0888, B:473:0x0892, B:476:0x089c, B:477:0x08a3, B:478:0x08a8, B:478:0x08a8, B:482:0x092c, B:486:0x0941, B:488:0x094d, B:490:0x0955, B:492:0x095b, B:494:0x0962, B:496:0x096b, B:498:0x0977, B:500:0x08b0, B:503:0x08ba, B:504:0x08c1, B:505:0x08c7, B:507:0x08d1, B:509:0x08d8, B:510:0x08dd, B:511:0x08e3, B:513:0x08eb, B:515:0x08f2, B:516:0x08f7, B:518:0x090c, B:520:0x0914, B:522:0x0920), top: B:2:0x0010 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A1g(com.facebook.messaging.montage.model.MontageBucket r302) {
        /*
            Method dump skipped, instructions count: 2453
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2397Gbz.A1g(com.facebook.messaging.montage.model.MontageBucket):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x019e, code lost:
    
        if (r317 == 0) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A1h(java.lang.String r302) {
        /*
            Method dump skipped, instructions count: 562
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2397Gbz.A1h(java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0123, code lost:
    
        if (r301.A0s != false) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A1i(boolean r302) {
        /*
            Method dump skipped, instructions count: 369
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2397Gbz.A1i(boolean):void");
    }

    public void A1j(boolean z) {
        I5c i5c = this.A0R;
        if (i5c == null || i5c.A03.A02().A03 == z) {
            return;
        }
        I3K i3k = i5c.A03;
        I0O A01 = i3k.A01();
        A01.A03 = z;
        I3K.A00(A01, i3k);
    }

    public void A1k(boolean z) {
        if (this.A0P != null) {
            Object A0E = A0E(this);
            if (A0E instanceof JP7) {
                ((JP7) A0E).CrT(z);
                this.A0s = z;
            }
        }
    }

    public void A1l(boolean z) {
        if (this.A0P == null || !(A0E(this) instanceof JP7)) {
            return;
        }
        A1k(z);
        View view = this.A06;
        if (z) {
            view.setVisibility(8);
            this.A07.setVisibility(0);
        } else {
            view.setVisibility(0);
            this.A07.setVisibility(8);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (r0.A0M == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A1m() {
        /*
            r301 = this;
            r0 = r301
            com.facebook.messaging.montage.model.MontageCard r0 = r0.A0P
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L14
            r0 = r302
            boolean r0 = r0.A0M
            r303 = r0
            r0 = 1
            r304 = r0
            r0 = r303
            if (r0 != 0) goto L18
        L14:
            r0 = 0
            r304 = r0
            r0 = 0
            r302 = r0
        L18:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2397Gbz.A1m():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001a, code lost:
    
        if (r301.mUserVisibleHint == false) goto L8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A1n() {
        /*
            r301 = this;
            r0 = r301
            boolean r0 = r0.isAdded()
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L1d
            r0 = r301
            boolean r0 = r0.isHidden()
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L1d
            r0 = r301
            boolean r0 = r0.mUserVisibleHint
            r303 = r0
            r0 = 1
            r302 = r0
            r0 = r303
            if (r0 != 0) goto L1f
        L1d:
            r0 = 0
            r302 = r0
        L1f:
            r0 = r302
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2397Gbz.A1n():boolean");
    }

    public boolean ADo(MotionEvent motionEvent) {
        Ht2 A0E;
        boolean z = true;
        if (this.A0P != null && (A0E = A0E(this)) != null && (A0E instanceof C2795GoV)) {
            2Wo r0 = ((C2795GoV) A0E).A04;
            if (r0.A00 != null && r0.A01().getScrollY() != 0) {
                z = false;
            }
        }
        return z;
    }

    @Override // X.JLj
    public void BrD(Throwable th) {
        String str;
        48J r0;
        int i;
        String message;
        if (th == null) {
            0fH.A0k(__redex_internal_original_name, "Montage viewer content failed to load");
        } else {
            0fH.A0s(__redex_internal_original_name, "Montage viewer content failed to load", th);
        }
        1Br r02 = this.A2G.A00;
        7zP.A0e(r02).markerAnnotate(13248089, "marker_end_reason", "content_load_failed");
        7zP.A0e(r02).markerEnd(13248089, (short) 3);
        0fH.A0k("MontageViewerInboxTrayPlayMediaLogger", "marker_end_reason: fail content_load_failed");
        GOn.A1T(this);
        MontageCard montageCard = this.A0P;
        String str2 = null;
        if (montageCard != null && (r0 = montageCard.A07) != null && th != null && ((48J.A05 != r0 || ((th instanceof RuntimeException) && (message = th.getMessage()) != null && !message.contains("URL_EXPIRED") && !message.contains("ERROR_IO") && !message.contains("ATOM_PARSE_ERROR"))) && (i = this.A11) < 1)) {
            this.A11 = i + 1;
            ICj A09 = A09(this);
            MontageBucket montageBucket = this.A0N;
            if (montageBucket != null) {
                str2 = GOo.A0v(montageBucket);
            }
            A09.A09(str2, "story_load_auto_retry");
            A0E(this).A04(this.A0P);
            return;
        }
        I8O i8o = (I8O) this.A27.get();
        MontageCard montageCard2 = this.A0P;
        if (montageCard2 != null) {
            String str3 = (montageCard2.A01() == null || montageCard2.A01().isEmpty()) ? "" : GOp.A0L(montageCard2).A0I;
            String valueOf = String.valueOf(montageCard2.A03);
            String str4 = montageCard2.A0E;
            boolean A00 = C48H.A00(montageCard2.A0H);
            String str5 = A00 ? "28790" : "2048";
            1UG A08 = 1BK.A08(1Br.A02(i8o.A02), 1BJ.A00(1514));
            0DA r03 = new 0DA();
            r03.A07("media_id", str3);
            0DA r04 = new 0DA();
            String str6 = montageCard2.A0I;
            if (str6 == null) {
                str6 = "";
            }
            r04.A07("optimistic_client_id", str6);
            0DA r05 = new 0DA();
            r05.A07("owner_id", "");
            r05.A07("bucket_id", valueOf);
            r05.A07("story_id", str4);
            7zN.A14(r05, "story_source", A00 ? 1 : 0);
            r05.A07("sender_fbtype", str5);
            0DA r06 = new 0DA();
            r06.A07("session_id", "");
            Double A0H = A0H(r06);
            0DA r07 = new 0DA();
            Long A0i = 4YV.A0i();
            r07.A06(Property.ICON_TEXT_FIT_HEIGHT, A0i);
            r07.A06(Property.ICON_TEXT_FIT_WIDTH, A0i);
            0DA r08 = new 0DA();
            r08.A04("original_bit_rate", A0H);
            r08.A04("length_in_sec", A0H);
            0DA r09 = new 0DA();
            r09.A02(r08, "video");
            0DA r010 = new 0DA();
            r010.A07("raw_type", I8O.A00(montageCard2));
            r010.A06(Property.ICON_TEXT_FIT_HEIGHT, A0i);
            r010.A06(Property.ICON_TEXT_FIT_WIDTH, A0i);
            r010.A02(r07, "downsized_dimensions");
            r010.A02(r09, "subtype_attrs");
            0DA r011 = new 0DA();
            r011.A02(r010, "client_data");
            if (A08.isSampled()) {
                A08.A7T(r03, "media");
                A0V(r04, r05, r06, r011, A08);
            }
        }
        if (this.A0N != null) {
            A09(this).A03(this.A0N, this.A0V);
        }
        ICj A092 = A09(this);
        MontageBucket montageBucket2 = this.A0N;
        if (montageBucket2 != null) {
            str2 = GOo.A0v(montageBucket2);
        }
        str = "";
        A092.A07(str2, th == null ? str : th.getMessage());
        I3U i3u = (I3U) 4YU.A0p(this.A0I);
        MontageBucket montageBucket3 = this.A0N;
        str = th != null ? th.getMessage() : "";
        synchronized (i3u) {
            if (I3U.A00(i3u, montageBucket3)) {
                AbG.A0r(i3u.A02).flowMarkError(i3u.A01, "media_load_error", str);
            }
        }
        this.A0p = true;
        this.A0o = false;
        this.A0t = false;
        A0Q();
        long A07 = A07(this);
        A0T(A07);
        this.A0R.A04(true);
        4YU.A0G(this.A1N).postDelayed(this.A1s, A07);
        this.A0j.A02();
        I3z i3z = this.A0e;
        if (i3z != null) {
            i3z.A01();
        }
        HGD hgd = this.A0X;
        if (hgd == null || !(hgd instanceof C2800God)) {
            return;
        }
        MontageViewerFragment.A0N(((C2800God) hgd).A00);
    }

    @Override // X.JLj
    public void BrE() {
        this.A0p = false;
    }

    @Override // X.JLj
    public void BrH() {
        if (this.A0P != null) {
            boolean A1U = DKD.A1U(((1BL.A08(this.A1K) - 3000) > this.A02 ? 1 : ((1BL.A08(this.A1K) - 3000) == this.A02 ? 0 : -1)));
            int A06 = A06(this);
            if (A06 != 0 && this.A00 != A06 && A1U) {
                A1d();
                return;
            }
            I3U i3u = (I3U) 4YU.A0p(this.A0I);
            MontageBucket montageBucket = this.A0N;
            synchronized (i3u) {
                if (I3U.A00(i3u, montageBucket)) {
                    AbG.A0r(i3u.A02).flowMarkPoint(i3u.A01, "story_playback_finished");
                }
            }
            HGD hgd = this.A0X;
            if (hgd != null) {
                hgd.A05(this);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0204, code lost:
    
        if (X.C48H.A00(r0) == false) goto L57;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.JLj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void BrI() {
        /*
            Method dump skipped, instructions count: 861
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2397Gbz.BrI():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.JLj
    public void BrJ() {
        HGG hgg;
        GOn.A1T(this);
        Preconditions.checkArgument(!this.A0p);
        I8O i8o = (I8O) this.A27.get();
        MontageCard montageCard = this.A0P;
        if (montageCard != null) {
            String str = (montageCard.A01() == null || montageCard.A01().isEmpty()) ? "" : GOp.A0L(montageCard).A0I;
            String valueOf = String.valueOf(montageCard.A03);
            String str2 = montageCard.A0E;
            boolean A00 = C48H.A00(montageCard.A0H);
            String str3 = A00 ? "28790" : "2048";
            1UG A08 = 1BK.A08(1Br.A02(i8o.A02), 1BJ.A00(1515));
            0DA r0 = new 0DA();
            r0.A07("media_id", str);
            0DA r02 = new 0DA();
            String str4 = montageCard.A0I;
            if (str4 == null) {
                str4 = "";
            }
            r02.A07("optimistic_client_id", str4);
            0DA r03 = new 0DA();
            r03.A07("owner_id", "");
            r03.A07("bucket_id", valueOf);
            r03.A07("story_id", str2);
            7zN.A14(r03, "story_source", A00 ? 1 : 0);
            r03.A07("sender_fbtype", str3);
            0DA r04 = new 0DA();
            r04.A07("session_id", "");
            Double A0H = A0H(r04);
            0DA r05 = new 0DA();
            Long A0i = 4YV.A0i();
            r05.A06(Property.ICON_TEXT_FIT_HEIGHT, A0i);
            r05.A06(Property.ICON_TEXT_FIT_WIDTH, A0i);
            0DA r06 = new 0DA();
            r06.A04("original_bit_rate", A0H);
            r06.A04("length_in_sec", A0H);
            0DA r07 = new 0DA();
            r07.A02(r06, "video");
            0DA r08 = new 0DA();
            r08.A07("raw_type", I8O.A00(montageCard));
            r08.A06(Property.ICON_TEXT_FIT_HEIGHT, A0i);
            r08.A06(Property.ICON_TEXT_FIT_WIDTH, A0i);
            r08.A02(r05, "downsized_dimensions");
            r08.A02(r07, "subtype_attrs");
            0DA r09 = new 0DA();
            r09.A02(r08, "client_data");
            if (A08.isSampled()) {
                A08.A7T(r0, "media");
                A0V(r02, r03, r04, r09, A08);
            }
        }
        this.A0t = true;
        A0M();
        A0j(this);
        if (this.A0R.A03.A02().A0D) {
            A1k(true);
        }
        if (HIP.A00(this) && (A0E(this) instanceof JP7)) {
            FbUserSession fbUserSession = this.A0B;
            fbUserSession.getClass();
            A1l(((9Yc) 1Lo.A06(fbUserSession, 68362)).A00);
        }
        MontageViewerFragment montageViewerFragment = this.A0Q;
        if (montageViewerFragment == null || (hgg = montageViewerFragment.A0L) == null) {
            return;
        }
        hgg.A08();
    }

    public void CnF(int i) {
        AbH.A1K(this.A14, i);
    }

    public void CnG(Drawable drawable) {
        this.A14.setBackground(drawable);
    }

    public void D7g(float f) {
        this.A0Y.A03(Math.min(Math.max(0.0f, f), 1.0f));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(-1223750612);
        String A0I = A0I(this.mArguments);
        A09(this).A09(A0I, "viewer_page_fragment_on_create_view_start");
        View A08 = AbG.A08(layoutInflater.cloneInContext(requireContext()), viewGroup, 2132542742);
        A09(this).A09(A0I, "viewer_page_fragment_on_create_view_end");
        0FI.A08(-1574905697, A02);
        return A08;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDestroyView() {
        int A02 = 0FI.A02(-56879200);
        A0h(this);
        Ht2 ht2 = this.A1C;
        if (ht2 != null) {
            ht2.A02();
        }
        I5c i5c = this.A0R;
        C00j.A05("MontageViewerPageController.onDestroyMontageViewerViewControllers", -2078449680);
        try {
            int size = i5c.A04.size();
            for (int i = 0; i < size; i++) {
                IXY ixy = (IXY) i5c.A04.get(i);
                if (ixy instanceof C2808Gol) {
                    LithoView lithoView = (LithoView) ixy.A00;
                    if (lithoView != null) {
                        lithoView.A0w();
                    }
                } else if (ixy instanceof C2810Gon) {
                    I3K i3k = ixy.A06;
                    I0O i0o = new I0O(i3k.A02());
                    i0o.A09 = false;
                    I3K.A00(i0o, i3k);
                }
            }
            C00j.A01(2044127531);
            I3z i3z = this.A0e;
            if (i3z != null) {
                i3z.A01 = null;
            }
            C9c8 c9c8 = this.A0d;
            if (c9c8 != null) {
                c9c8.A00 = null;
                2Wo r0 = c9c8.A0A;
                if (r0.A00 != null) {
                    View A01 = r0.A01();
                    11T.A0I(A01, 7zK.A00(383));
                    ((MontageViewerAvatarQuickRepliesView) A01).A00 = null;
                }
                9Vz r02 = (9Vz) 1Br.A0B(c9c8.A08);
                C9Jt c9Jt = c9c8.A09;
                synchronized (r02) {
                    11T.A0F(c9Jt, 0);
                    r02.A06.remove(c9Jt);
                }
                C2a2 c2a2 = c9c8.A04;
                if (c2a2 != null) {
                    c2a2.AE0(null);
                }
                C2a2 c2a22 = c9c8.A02;
                if (c2a22 != null) {
                    c2a22.AE0(null);
                }
                C2a2 c2a23 = c9c8.A03;
                if (c2a23 != null) {
                    c2a23.AE0(null);
                }
            }
            MontageViewerQuickRepliesOverlay montageViewerQuickRepliesOverlay = this.A0Z;
            if (montageViewerQuickRepliesOverlay != null) {
                montageViewerQuickRepliesOverlay.A01 = JAJ.A00;
                montageViewerQuickRepliesOverlay.A00 = JAK.A00;
            }
            I3e A1X = A1X();
            if (A1X != null) {
                ((I4p) A1X.A01(I4p.class)).A00.A04(this.A1o);
                View A0F = 7zL.A0F(this, 2131368412);
                Hot hot = (Hot) A1X.A01(Hot.class);
                11T.A0F(A0F, 0);
                hot.A01.remove(A0F);
            }
            L5Q l5q = this.A0k;
            if (l5q != null) {
                l5q.A01();
                this.A0k = null;
            }
            super/*androidx.fragment.app.Fragment*/.onDestroyView();
            0FI.A08(828331578, A02);
        } catch (Throwable th) {
            C00j.A01(-291501050);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onPause() {
        int A02 = 0FI.A02(1940044490);
        super/*androidx.fragment.app.Fragment*/.onPause();
        A0S();
        Ht2 ht2 = this.A0S;
        if (ht2 != null) {
            C2796GoZ c2796GoZ = (C2796GoZ) ht2;
            HsD hsD = (HsD) 1Lo.A0A(c2796GoZ.A06, HsD.class);
            hsD.A03.remove(c2796GoZ.A0B);
        }
        I2w i2w = this.A1D;
        if (i2w != null) {
            i2w.A04 = null;
        }
        this.A0R.A03();
        0FI.A08(2018742937, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onResume() {
        int A02 = 0FI.A02(883633051);
        super/*androidx.fragment.app.Fragment*/.onResume();
        if (!HIP.A00(this)) {
            ((1XZ) this.A2A.get()).A77(this.A2K);
        }
        A0O();
        EAX eax = A0F().A02;
        if (eax != null && eax.isShowing()) {
            A0e(this);
        }
        C9c8 c9c8 = this.A0d;
        if (c9c8 != null) {
            c9c8.A0A.A02();
            C9c8 c9c82 = this.A0d;
            MontageCard montageCard = this.A0P;
            if (montageCard != null && montageCard.A0A != null) {
                String str = montageCard.A0E;
                11T.A0A(str);
                0CW.A0f(str);
                c9c82.A00();
            }
        }
        0FI.A08(-602906108, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onStart() {
        int A02 = 0FI.A02(1560776436);
        super/*androidx.fragment.app.Fragment*/.onStart();
        A0P();
        0FI.A08(-2052380202, A02);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x002e, code lost:
    
        if (X.60V.A04(r301.A0P) != false) goto L8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onStop() {
        /*
            r301 = this;
            r0 = 424002683(0x1945c47b, float:1.022434E-23)
            int r0 = X.0FI.A02(r0)
            r302 = r0
            r0 = r301
            boolean r0 = r0.A1m()
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L31
            r0 = r301
            com.facebook.messaging.montage.model.MontageCard r0 = r0.A0P
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L42
            r0 = r301
            X.00i r0 = r0.A21
            java.lang.Object r0 = r0.get()
            r0 = r301
            com.facebook.messaging.montage.model.MontageCard r0 = r0.A0P
            r304 = r0
            r0 = r304
            boolean r0 = X.60V.A04(r0)
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L42
        L31:
            r0 = r301
            X.00i r0 = r0.A1w
            java.lang.Object r0 = r0.get()
            com.facebook.messaging.montage.viewer.seensheet.MontageViewerFollowerSeenCountSubscription r0 = (com.facebook.messaging.montage.viewer.seensheet.MontageViewerFollowerSeenCountSubscription) r0
            r304 = r0
            r0 = r304
            r0.A02()
        L42:
            r0 = r301
            boolean r0 = X.HIP.A00(r0)
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L66
            r0 = r301
            X.00i r0 = r0.A2A
            java.lang.Object r0 = r0.get()
            X.1XZ r0 = (X.1XZ) r0
            r305 = r0
            r0 = r301
            X.2TO r0 = r0.A2K
            r304 = r0
            r0 = r305
            r1 = r304
            r0.Cez(r1)
        L66:
            r0 = r301
            super/*androidx.fragment.app.Fragment*/.onStop()
            r0 = 321513133(0x1329e6ad, float:2.144453E-27)
            r1 = r302
            X.0FI.A08(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2397Gbz.onStop():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:131:0x02b2, code lost:
    
        if (((X.5yW) X.1Bi.A03(67347)).A03(X.0S2.A0C) != false) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:469:0x0ae3, code lost:
    
        if (r301.A0s != false) goto L600;
     */
    /* JADX WARN: Code restructure failed: missing block: B:631:0x051b, code lost:
    
        if (r0.AZk(36324926425354455L) == false) goto L268;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v172, types: [X.Gbz, androidx.fragment.app.Fragment] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onViewCreated(android.view.View r302, android.os.Bundle r303) {
        /*
            Method dump skipped, instructions count: 3196
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2397Gbz.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
