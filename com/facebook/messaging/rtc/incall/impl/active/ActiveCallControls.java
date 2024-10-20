package com.facebook.messaging.rtc.incall.impl.active;

import X.0DE;
import X.0DR;
import X.0FI;
import X.0NA;
import X.11T;
import X.1Bi;
import X.1Bn;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.1YC;
import X.2Qa;
import X.2Qn;
import X.2Wo;
import X.2Zo;
import X.2Zy;
import X.2aK;
import X.3yG;
import X.4YT;
import X.4YU;
import X.4zI;
import X.7zM;
import X.7zP;
import X.7zQ;
import X.83U;
import X.9RQ;
import X.AJU;
import X.AJX;
import X.AbF;
import X.AbG;
import X.AbK;
import X.AbL;
import X.AbstractC06294ge;
import X.AnonymousClass001;
import X.C00i;
import X.C01i;
import X.C03i;
import X.C06144g2;
import X.C06204g8;
import X.C06274gb;
import X.C09s;
import X.C1F6;
import X.C1Y6;
import X.C1u3;
import X.C2a2;
import X.DCy;
import X.DKC;
import X.DKE;
import X.FFo;
import X.FJK;
import X.GOn;
import X.GOo;
import X.GOp;
import X.GOq;
import X.GSB;
import X.GSD;
import X.GrV;
import X.H0S;
import X.HFH;
import X.HG8;
import X.Huo;
import X.Hz5;
import X.I0g;
import X.I3N;
import X.I6F;
import X.I7l;
import X.IDw;
import X.IJM;
import X.IKE;
import X.IKN;
import X.IKS;
import X.IYv;
import X.IZy;
import X.IlB;
import X.IlT;
import X.Iwp;
import X.IxG;
import X.IxH;
import X.J8K;
import X.J9u;
import X.JBW;
import X.JBZ;
import X.JFq;
import X.JN7;
import X.JPK;
import X.JZj;
import X.KzE;
import X.LDR;
import android.animation.Animator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.ViewStub;
import android.view.animation.DecelerateInterpolator;
import android.widget.Chronometer;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import com.facebook.inject.FbInjector;
import com.facebook.litho.LithoView;
import com.facebook.messaging.rtc.incall.impl.actionbar.InCallActionBar;
import com.facebook.messaging.rtc.incall.impl.active.callcontrols.ui.MsgrCallControlsView;
import com.facebook.messaging.rtc.incall.impl.active.drawer.plugins.roster.RosterSheetView;
import com.facebook.messaging.rtc.incall.impl.expression.ExpressionListControl;
import com.facebook.messaging.sup.plugins.videocalling.impl.SUPVideoCallingImpl;
import com.facebook.messaging.ui.name.ThreadNameView;
import com.facebook.messaging.wearable.plugins.hera.impl.HeraMessengerPluginImplementation;
import com.facebook.resources.ui.FbImageButton;
import com.facebook.resources.ui.FbTextView;
import com.facebook.wearable.mediastream.ul.voltron.loader.MediaStreamLibraryLoader;
import com.facebook.widget.CustomFrameLayout;
import com.mapbox.mapboxsdk.R;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: ActiveCallControls.class */
public final class ActiveCallControls extends CustomFrameLayout implements JPK {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public int A05;
    public int A06;
    public int A07;
    public View A08;
    public View A09;
    public View A0A;
    public View A0B;
    public View A0C;
    public ViewGroup A0D;
    public Chronometer A0E;
    public LinearLayout A0F;
    public LinearLayout A0G;
    public JZj A0H;
    public HFH A0I;
    public HFH A0J;
    public LithoView A0K;
    public InCallActionBar A0L;
    public MsgrCallControlsView A0M;
    public I7l A0N;
    public RosterSheetView A0O;
    public ExpressionListControl A0P;
    public ThreadNameView A0Q;
    public FbImageButton A0R;
    public FbImageButton A0S;
    public FbTextView A0T;
    public FbTextView A0U;
    public FbTextView A0V;
    public 2Wo A0W;
    public 2Wo A0X;
    public 2Wo A0Y;
    public 2Wo A0Z;
    public 2Wo A0a;
    public 2Wo A0b;
    public 2Wo A0c;
    public 2Wo A0d;
    public 2Wo A0e;
    public 2Wo A0f;
    public 2Wo A0g;
    public 2Wo A0h;
    public boolean A0i;
    public boolean A0j;
    public boolean A0k;
    public boolean A0l;
    public ViewPropertyAnimator A0m;
    public Space A0n;
    public HFH A0o;
    public KzE A0p;
    public 2Wo A0q;
    public 2Wo A0r;
    public final Animator.AnimatorListener A0s;
    public final Animator.AnimatorListener A0t;
    public final Animator.AnimatorListener A0u;
    public final Animator.AnimatorListener A0v;
    public final DecelerateInterpolator A0w;
    public final 1Br A0x;
    public final 1Br A0y;
    public final 1Br A0z;
    public final 1Br A10;
    public final 1Br A11;
    public final 1Br A12;
    public final 1Br A13;
    public final 1Br A14;
    public final 1Br A15;
    public final 1Br A16;
    public final 1Br A17;
    public final 1Br A18;
    public final 1Br A19;
    public final 1Br A1A;
    public final 1Br A1B;
    public final C01i A1C;
    public final C01i A1D;
    public final Animator.AnimatorListener A1E;
    public final View.OnApplyWindowInsetsListener A1F;
    public final View.OnSystemUiVisibilityChangeListener A1G;
    public final 2Qn A1H;
    public final 2Qn A1I;
    public final C06144g2 A1J;
    public final FJK A1K;

    public ActiveCallControls(Context context) {
        super(context);
        this.A12 = 1Bq.A00(115476);
        this.A1B = 7zM.A0O();
        this.A1A = 1Bu.A00(115709);
        Context context2 = getContext();
        this.A11 = 1Bu.A01(context2, 16980);
        this.A19 = 1Bu.A00(147681);
        this.A17 = 7zM.A0U();
        this.A0x = 1Bu.A01(context2, 83981);
        this.A13 = 1Bu.A00(115631);
        this.A14 = GOo.A0L();
        this.A0y = IDw.A04(context2, this, "ActiveCallControls", 98492);
        this.A10 = 1Bu.A01(context2, 67677);
        this.A0z = IDw.A04(context2, this, "ActiveCallControls", 99475);
        this.A18 = IDw.A04(context2, this, "ActiveCallControls", 33089);
        C03i c03i = C03i.A02;
        this.A1D = J9u.A00(this, c03i, 24);
        this.A15 = 1Bq.A00(115102);
        this.A1J = C06144g2.A00();
        this.A16 = AbG.A0a();
        this.A1C = J9u.A00(this, c03i, 20);
        this.A0w = new DecelerateInterpolator();
        this.A1H = IYv.A00(this, 6);
        this.A1I = IYv.A00(this, 7);
        this.A1K = new H0S(this, 1);
        this.A1E = new GSD(this, 4);
        this.A0u = new GSD(this, 7);
        this.A0v = new GSB(this, 0);
        this.A0s = new GSD(this, 5);
        this.A1G = new IKS(this, 1);
        this.A1F = new IJM(this);
        this.A0t = new GSD(this, 6);
        A02();
    }

    public ActiveCallControls(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A12 = 1Bq.A00(115476);
        this.A1B = 7zM.A0O();
        this.A1A = 1Bu.A00(115709);
        Context context2 = getContext();
        this.A11 = 1Bu.A01(context2, 16980);
        this.A19 = 1Bu.A00(147681);
        this.A17 = 7zM.A0U();
        this.A0x = 1Bu.A01(context2, 83981);
        this.A13 = 1Bu.A00(115631);
        this.A14 = GOo.A0L();
        this.A0y = IDw.A04(context2, this, "ActiveCallControls", 98492);
        this.A10 = 1Bu.A01(context2, 67677);
        this.A0z = IDw.A04(context2, this, "ActiveCallControls", 99475);
        this.A18 = IDw.A04(context2, this, "ActiveCallControls", 33089);
        C03i c03i = C03i.A02;
        this.A1D = J9u.A00(this, c03i, 24);
        this.A15 = 1Bq.A00(115102);
        this.A1J = C06144g2.A00();
        this.A16 = AbG.A0a();
        this.A1C = J9u.A00(this, c03i, 20);
        this.A0w = new DecelerateInterpolator();
        this.A1H = IYv.A00(this, 6);
        this.A1I = IYv.A00(this, 7);
        this.A1K = new H0S(this, 1);
        this.A1E = new GSD(this, 4);
        this.A0u = new GSD(this, 7);
        this.A0v = new GSB(this, 0);
        this.A0s = new GSD(this, 5);
        this.A1G = new IKS(this, 1);
        this.A1F = new IJM(this);
        this.A0t = new GSD(this, 6);
        A02();
    }

    public ActiveCallControls(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A12 = 1Bq.A00(115476);
        this.A1B = 7zM.A0O();
        this.A1A = 1Bu.A00(115709);
        Context context2 = getContext();
        this.A11 = 1Bu.A01(context2, 16980);
        this.A19 = 1Bu.A00(147681);
        this.A17 = 7zM.A0U();
        this.A0x = 1Bu.A01(context2, 83981);
        this.A13 = 1Bu.A00(115631);
        this.A14 = GOo.A0L();
        this.A0y = IDw.A04(context2, this, "ActiveCallControls", 98492);
        this.A10 = 1Bu.A01(context2, 67677);
        this.A0z = IDw.A04(context2, this, "ActiveCallControls", 99475);
        this.A18 = IDw.A04(context2, this, "ActiveCallControls", 33089);
        C03i c03i = C03i.A02;
        this.A1D = J9u.A00(this, c03i, 24);
        this.A15 = 1Bq.A00(115102);
        this.A1J = C06144g2.A00();
        this.A16 = AbG.A0a();
        this.A1C = J9u.A00(this, c03i, 20);
        this.A0w = new DecelerateInterpolator();
        this.A1H = IYv.A00(this, 6);
        this.A1I = IYv.A00(this, 7);
        this.A1K = new H0S(this, 1);
        this.A1E = new GSD(this, 4);
        this.A0u = new GSD(this, 7);
        this.A0v = new GSB(this, 0);
        this.A0s = new GSD(this, 5);
        this.A1G = new IKS(this, 1);
        this.A1F = new IJM(this);
        this.A0t = new GSD(this, 6);
        A02();
    }

    private final float A00(Animator.AnimatorListener animatorListener, View view, float f, float f2) {
        ViewPropertyAnimator translationY;
        int i = 0;
        if (f == f2) {
            return f;
        }
        InCallActionBar inCallActionBar = this.A0L;
        if (inCallActionBar != null) {
            i = inCallActionBar.getHeight();
        }
        float f3 = i * ((-1.0f) + f2);
        if (view != null) {
            ViewPropertyAnimator animate = view.animate();
            if (animate != null) {
                animate.cancel();
            }
            ViewPropertyAnimator animate2 = view.animate();
            if (animate2 != null && (translationY = animate2.translationY(f3)) != null) {
                translationY.setListener(animatorListener);
            }
        }
        return f2;
    }

    public static final Huo A01() {
        Huo A00;
        C06274gb c06274gb = (C06274gb) 1Bi.A03(115700);
        if (c06274gb == null || c06274gb.A00() == null || (A00 = c06274gb.A00()) == null) {
            return null;
        }
        Hz5 hz5 = A00.A00.A00;
        AtomicInteger atomicInteger = C1Y6.A04;
        int andIncrement = atomicInteger.getAndIncrement();
        1YC r0 = hz5.A03;
        r0.A08("com.facebook.messaging.wearable.plugins.interfaces.hera.HeraMessengerPluginInterfaceSpec", "messaging.wearable.hera.HeraMessengerPluginInterfaceSpec", "isPluginEnabled", andIncrement);
        boolean z = false;
        try {
            if (Hz5.A00(hz5)) {
                int andIncrement2 = atomicInteger.getAndIncrement();
                String A1B = GOp.A1B(r0, "isPluginEnabled", andIncrement2);
                try {
                    try {
                        z = AbstractC06294ge.A00(hz5.A01.A0E);
                        r0.A09(A1B, "messaging.wearable.hera.HeraMessengerPluginInterfaceSpec", "isPluginEnabled", andIncrement2);
                    } catch (Exception e) {
                        throw e;
                    }
                } catch (Throwable th) {
                    r0.A04((Exception) null, A1B, "messaging.wearable.hera.HeraMessengerPluginInterfaceSpec", "isPluginEnabled", andIncrement2);
                    throw th;
                }
            }
            r0.A02((Exception) null, "messaging.wearable.hera.HeraMessengerPluginInterfaceSpec", "isPluginEnabled", andIncrement);
            if (z) {
                return c06274gb.A00();
            }
            return null;
        } catch (Throwable th2) {
            r0.A02((Exception) null, "messaging.wearable.hera.HeraMessengerPluginInterfaceSpec", "isPluginEnabled", andIncrement);
            throw th2;
        }
    }

    /* JADX WARN: Type inference failed for: r0v43, types: [java.lang.Object, X.HFH] */
    /* JADX WARN: Type inference failed for: r302v40, types: [java.lang.Object, X.HFH] */
    private final void A02() {
        A0U(2132541474);
        this.A0D = (ViewGroup) C09s.A01(this, 2131363082);
        Resources resources = getResources();
        this.A05 = resources.getDimensionPixelSize(2132279320);
        this.A0L = (InCallActionBar) C09s.A01(this, 2131361866);
        1Br r0 = this.A14;
        1Br.A0B(r0);
        C09s.A01(this, 2131361870).setVisibility(8);
        Context context = getContext();
        View inflate = LayoutInflater.from(context).inflate(2132543548, this.A0D, false);
        11T.A0I(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        ExpressionListControl expressionListControl = (ExpressionListControl) inflate.findViewById(2131368345);
        this.A0P = expressionListControl;
        if (expressionListControl != null) {
            1Br.A0B(r0);
            ExpressionListControl expressionListControl2 = this.A0P;
            if (expressionListControl2 != null) {
                IKN.A00(expressionListControl2, this, 6);
            }
        }
        ViewGroup viewGroup = this.A0D;
        11T.A0I(viewGroup, "null cannot be cast to non-null type android.view.ViewGroup");
        ?? obj = new Object();
        ((HFH) obj).A00 = -1;
        ((HFH) obj).A03 = viewGroup;
        ((HFH) obj).A02 = inflate;
        this.A0J = obj;
        ViewGroup viewGroup2 = this.A0D;
        11T.A0I(viewGroup2, "null cannot be cast to non-null type android.view.ViewGroup");
        SparseArray sparseArray = (SparseArray) viewGroup2.getTag(2131368196);
        if (sparseArray == null) {
            sparseArray = DKC.A0E();
            viewGroup2.setTag(2131368196, sparseArray);
        }
        HFH hfh = (HFH) sparseArray.get(2132541476);
        HFH hfh2 = hfh;
        if (hfh == null) {
            ?? obj2 = new Object();
            ((HFH) obj2).A01 = context;
            ((HFH) obj2).A03 = viewGroup2;
            ((HFH) obj2).A00 = 2132541476;
            sparseArray.put(2132541476, obj2);
            hfh2 = obj2;
        }
        this.A0I = hfh2;
        View view = null;
        if (this.A0J != null) {
            C1F6 A0F = AbG.A0F(1033);
            HFH hfh3 = this.A0J;
            HFH hfh4 = this.A0I;
            Context A01 = FbInjector.A01();
            AbL.A0y(A0F);
            try {
                KzE kzE = new KzE(hfh3, hfh4);
                1Bn.A0K();
                FbInjector.A04(A01);
                this.A0p = kzE;
                A05(this.A0I);
            } catch (Throwable th) {
                1Bn.A0K();
                FbInjector.A04(A01);
                throw th;
            }
        }
        this.A0h = AbK.A0v(this, 2131368341);
        this.A0B = C09s.A01(this, 2131365190);
        this.A0X = AbK.A0v(this, 2131364429);
        2Wo A0v = AbK.A0v(this, 2131364431);
        this.A0Y = A0v;
        IlT.A00(A0v, this, 15);
        this.A0W = AbK.A0v(this, 2131364571);
        this.A0Z = AbK.A0v(this, 2131365154);
        this.A0f = AbK.A0v(this, 2131367394);
        2Wo A0v2 = AbK.A0v(this, 2131366297);
        this.A0b = A0v2;
        IlT.A00(A0v2, this, 16);
        this.A0c = AbK.A0v(this, 2131366298);
        this.A0d = AbK.A0v(this, 2131366399);
        this.A0a = AbK.A0v(this, 2131365279);
        int A02 = 0NA.A02(context, 2130970634, 0);
        this.A06 = A02;
        this.A07 = A02 + resources.getDimensionPixelSize(2132279321) + resources.getDimensionPixelSize(R.dimen.mapbox_eight_dp);
        this.A0A = C09s.A01(this, 2131364612);
        this.A0N = new I7l(IDw.A01(this, "ActiveCallControls"), 7zQ.A0m(this.A11), AbK.A0v(this, 2131363870), I6F.A01(this), new J9u(this, 21), new J9u(this, 22));
        1Br.A0B(r0);
        2Wo A0v3 = AbK.A0v(this, 2131362787);
        this.A0q = A0v3;
        A0v3.A01();
        this.A0M = (MsgrCallControlsView) C09s.A01(this, 2131362768);
        this.A0G = (LinearLayout) C09s.A01(this, 2131362780);
        this.A0F = (LinearLayout) C09s.A01(this, 2131362769);
        this.A0n = (Space) C09s.A01(this, 2131362786);
        Object A0A = 1Bn.A0A(147980);
        MsgrCallControlsView msgrCallControlsView = this.A0M;
        if (msgrCallControlsView != null) {
            msgrCallControlsView.A01 = new 83U(A0A, this, 8);
        }
        I0g i0g = new I0g();
        i0g.A0h = false;
        A07(new IZy(i0g));
        if (((I3N) 1Br.A0B(this.A13)).A01()) {
            2Wo A0v4 = AbK.A0v(this, 2131362784);
            this.A0r = A0v4;
            A0v4.A01();
            2Wo r02 = this.A0r;
            if (r02 != null) {
                view = r02.A01();
            }
            GOn.A1X(view);
            RosterSheetView rosterSheetView = (RosterSheetView) C09s.A01(view, 2131362783);
            this.A0O = rosterSheetView;
            if (rosterSheetView != null) {
                rosterSheetView.A00("ROSTER_TYPE_HALO_CALL_CONTROLS");
            }
        }
        1Br.A0B(r0);
        2Wo r03 = this.A0X;
        FbImageButton fbImageButton = r03 != null ? (FbImageButton) r03.A01() : null;
        this.A0R = fbImageButton;
        if (fbImageButton != null) {
            fbImageButton.setImageDrawable(7zP.A0S(this.A17).A07(C1u3.A2Q));
        }
        FbImageButton fbImageButton2 = this.A0R;
        if (fbImageButton2 != null) {
            IKE.A01(fbImageButton2, this, 128);
        }
        2Wo A0v5 = AbK.A0v(this, 2131367392);
        this.A0e = A0v5;
        A0v5.A01();
        this.A0g = AbK.A0v(this, 2131368147);
        1Br.A0B(r0);
        2Wo r04 = this.A0g;
        if (r04 != null) {
            r04.A01();
        }
        this.A0C = C09s.A01(this, 2131368164);
        IKN.A00(findViewById(2131361866), this, 7);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x005a, code lost:
    
        setOnApplyWindowInsetsListener(r301.A1F);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0064, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x006a, code lost:
    
        if (r0 >= 30) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0030, code lost:
    
        if (X.1Br.A06(((X.HmX) X.1Br.A0B(r301.A14)).A00).AZk(36315494680437761L) == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0057, code lost:
    
        if (X.1Br.A06(((X.HmX) X.1Br.A0B(r301.A14)).A00).AZk(36315494680503298L) != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0070, code lost:
    
        setOnSystemUiVisibilityChangeListener(r301.A1G);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x007a, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void A03() {
        /*
            r301 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r302 = r0
            r0 = 34
            r303 = r0
            r0 = r302
            r1 = r303
            if (r0 < r1) goto L65
            r0 = r301
            X.1Br r0 = r0.A14
            java.lang.Object r0 = X.1Br.A0B(r0)
            X.HmX r0 = (X.HmX) r0
            X.1Br r0 = r0.A00
            r304 = r0
            r0 = r304
            X.1CO r0 = X.1Br.A06(r0)
            r305 = r0
            r0 = 36315494680437761(0x8104c000452401, double:3.029403294444065E-306)
            r306 = r0
            r0 = r305
            r1 = r306
            boolean r0 = r0.AZk(r1)
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L5a
        L33:
            r0 = r301
            X.1Br r0 = r0.A14
            java.lang.Object r0 = X.1Br.A0B(r0)
            X.HmX r0 = (X.HmX) r0
            X.1Br r0 = r0.A00
            r304 = r0
            r0 = r304
            X.1CO r0 = X.1Br.A06(r0)
            r305 = r0
            r0 = 36315494680503298(0x8104c000462402, double:3.029403294485511E-306)
            r306 = r0
            r0 = r305
            r1 = r306
            boolean r0 = r0.AZk(r1)
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L70
        L5a:
            r0 = r301
            android.view.View$OnApplyWindowInsetsListener r0 = r0.A1F
            r304 = r0
            r0 = r301
            r1 = r304
            r0.setOnApplyWindowInsetsListener(r1)
            return
        L65:
            r0 = 30
            r303 = r0
            r0 = r302
            r1 = r303
            if (r0 < r1) goto L70
            goto L33
        L70:
            r0 = r301
            android.view.View$OnSystemUiVisibilityChangeListener r0 = r0.A1G
            r304 = r0
            r0 = r301
            r1 = r304
            r0.setOnSystemUiVisibilityChangeListener(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.rtc.incall.impl.active.ActiveCallControls.A03():void");
    }

    private final void A04(float f) {
        ViewPropertyAnimator animate;
        ViewPropertyAnimator animate2;
        ViewPropertyAnimator animate3;
        ViewPropertyAnimator listener;
        ViewPropertyAnimator viewPropertyAnimator;
        boolean z = false;
        if (this.A00 != f) {
            this.A00 = f;
            C00i c00i = this.A10.A00;
            if (((FFo) c00i.get()).A0L && (viewPropertyAnimator = this.A0m) != null) {
                viewPropertyAnimator.cancel();
            }
            ViewGroup viewGroup = this.A0D;
            if (viewGroup != null) {
                viewGroup.setVisibility(0);
            }
            ViewGroup viewGroup2 = this.A0D;
            ViewPropertyAnimator viewPropertyAnimator2 = null;
            if (viewGroup2 != null && (animate3 = viewGroup2.animate()) != null && (listener = animate3.setListener(null)) != null) {
                listener.cancel();
            }
            LinearLayout linearLayout = this.A0G;
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
            }
            boolean z2 = ((FFo) c00i.get()).A0L;
            ViewGroup viewGroup3 = this.A0D;
            if (z2) {
                ViewPropertyAnimator alpha = (viewGroup3 == null || (animate2 = viewGroup3.animate()) == null) ? null : animate2.alpha(f);
                this.A0m = alpha;
                if (f != 0.0f) {
                    if (alpha != null) {
                        alpha.setListener(null);
                    }
                    z = true;
                } else if (alpha != null) {
                    alpha.setListener(this.A1K);
                }
            } else {
                if (viewGroup3 != null && (animate = viewGroup3.animate()) != null) {
                    viewPropertyAnimator2 = animate.alpha(f);
                }
                if (f == 0.0f) {
                    if (viewPropertyAnimator2 != null) {
                        viewPropertyAnimator2.setListener(this.A1K);
                    }
                }
                z = true;
            }
            post(new Iwp(this, z));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0065, code lost:
    
        if (r307 != null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void A05(X.HFH r302) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.rtc.incall.impl.active.ActiveCallControls.A05(X.HFH):void");
    }

    public static final void A06(ActiveCallControls activeCallControls, boolean z) {
        Exception e;
        String str;
        int andIncrement;
        String str2;
        C06204g8 c06204g8 = activeCallControls.A1J.A00.A00;
        AtomicInteger atomicInteger = C1Y6.A04;
        int andIncrement2 = atomicInteger.getAndIncrement();
        1YC r0 = c06204g8.A02;
        try {
            try {
                try {
                    if (z) {
                        str = "showComponent";
                        r0.A08("com.facebook.messaging.sup.plugins.interfaces.videocalling.SUPVideoCallingSpec", "messaging.sup.videocalling.SUPVideoCallingSpec", str, andIncrement2);
                        e = null;
                        if (C06204g8.A00(c06204g8)) {
                            andIncrement = atomicInteger.getAndIncrement();
                            str2 = "messaging.sup.videocalling.impl.SUPVideoCallingImpl";
                            r0.A0A(4YT.A00(14), str2, "com.facebook.messaging.sup.plugins.interfaces.videocalling.SUPVideoCallingSpec", andIncrement, "messaging.sup.videocalling.SUPVideoCallingSpec", 4YT.A00(13), str);
                            c06204g8.A00.A01();
                            r0.A09(str2, "messaging.sup.videocalling.SUPVideoCallingSpec", str, andIncrement);
                        }
                        r0.A02((Exception) null, "messaging.sup.videocalling.SUPVideoCallingSpec", str, andIncrement2);
                        return;
                    }
                    str = "hideComponent";
                    r0.A08("com.facebook.messaging.sup.plugins.interfaces.videocalling.SUPVideoCallingSpec", "messaging.sup.videocalling.SUPVideoCallingSpec", str, andIncrement2);
                    e = null;
                    if (C06204g8.A00(c06204g8)) {
                        andIncrement = atomicInteger.getAndIncrement();
                        str2 = "messaging.sup.videocalling.impl.SUPVideoCallingImpl";
                        r0.A0A(4YT.A00(14), str2, "com.facebook.messaging.sup.plugins.interfaces.videocalling.SUPVideoCallingSpec", andIncrement, "messaging.sup.videocalling.SUPVideoCallingSpec", 4YT.A00(13), str);
                        c06204g8.A00.A00();
                        r0.A09(str2, "messaging.sup.videocalling.SUPVideoCallingSpec", str, andIncrement);
                    }
                    r0.A02((Exception) null, "messaging.sup.videocalling.SUPVideoCallingSpec", str, andIncrement2);
                    return;
                } catch (Exception e2) {
                    e = e2;
                    throw e;
                }
                e = e2;
                throw e;
            } catch (Throwable th) {
                r0.A04(e, str2, "messaging.sup.videocalling.SUPVideoCallingSpec", str, andIncrement);
                throw th;
            }
        } catch (Throwable th2) {
            r0.A02(e, "messaging.sup.videocalling.SUPVideoCallingSpec", str, andIncrement2);
            throw th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x0254, code lost:
    
        if (r319 == null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0057, code lost:
    
        if (X.GOq.A1S(r301.A18) != false) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void A07(X.IZy r302) {
        /*
            Method dump skipped, instructions count: 665
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.rtc.incall.impl.active.ActiveCallControls.A07(X.IZy):void");
    }

    private final void A08(2Wo r302) {
        TextView textView;
        Drawable A07 = 7zP.A0S(this.A17).A07(C1u3.A48);
        Resources A0E = GOn.A0E(this);
        A07.setBounds(0, 3yG.A04(A0E, 1.0f), 3yG.A04(A0E, 13.0f), 3yG.A04(A0E, 14.0f));
        if (r302 == null || (textView = (TextView) r302.A01()) == null) {
            return;
        }
        textView.setCompoundDrawables(A07, null, null, null);
    }

    private final void A09(2Wo r302) {
        float f = 4YU.A0B(getContext()).fontScale;
        1Br.A0C(this.A19);
        TextView textView = (TextView) GOo.A0F(r302);
        11T.A0F(textView, 0);
        textView.setTextSize(12.0f / ((float) Math.pow(f, 0.800000011920929d)));
    }

    public static final boolean A0A(ActiveCallControls activeCallControls) {
        return AnonymousClass001.A1Q(GOq.A0a(activeCallControls.A0z).A03, 2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:119:0x02ce, code lost:
    
        if (r301.A0j != false) goto L270;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0ab1, code lost:
    
        if (r301.A0k != false) goto L270;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x098b, code lost:
    
        if (r321 == null) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x0642, code lost:
    
        if (r0.A01 == r301.A05) goto L169;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0cc5  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0529  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x054f  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x05b3  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x091b  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0991  */
    /* JADX WARN: Removed duplicated region for block: B:549:0x1690  */
    /* JADX WARN: Removed duplicated region for block: B:561:0x16d3  */
    /* JADX WARN: Removed duplicated region for block: B:564:0x16e5  */
    /* JADX WARN: Removed duplicated region for block: B:566:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0ac8  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0b9f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0bfe  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0c46  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ void CfQ(X.JDB r302) {
        /*
            Method dump skipped, instructions count: 6221
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.rtc.incall.impl.active.ActiveCallControls.CfQ(X.JDB):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v75, types: [java.lang.Object, X.9RQ] */
    /* JADX WARN: Type inference failed for: r301v0, types: [X.JFq, com.facebook.widget.CustomFrameLayout, android.view.View, java.lang.Object, com.facebook.messaging.rtc.incall.impl.active.ActiveCallControls] */
    /* JADX WARN: Type inference failed for: r307v0, types: [X.4g2] */
    /* JADX WARN: Type inference failed for: r307v1 */
    /* JADX WARN: Type inference failed for: r307v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r307v6, types: [java.lang.String] */
    @Override // com.facebook.widget.CustomFrameLayout, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        String str;
        String str2;
        1YC r314;
        int i;
        int i2;
        Huo A01;
        int A06 = 0FI.A06(-852129655);
        super.onAttachedToWindow();
        A03();
        C00i c00i = this.A18.A00;
        2Qa r306 = (2Qa) c00i.get();
        r306.A02(this.A1H);
        ((GrV) this.A1D.getValue()).A0Y((JFq) this);
        String str3 = this.A1J;
        try {
            if (str3.A01()) {
                ViewStub viewStub = (ViewStub) C09s.A01(this, 2131367757);
                Context context = getContext();
                J9u j9u = new J9u(this, 23);
                C06204g8 c06204g8 = str3.A00.A00;
                AtomicInteger atomicInteger = C1Y6.A04;
                i = atomicInteger.getAndIncrement();
                r314 = c06204g8.A02;
                str2 = "messaging.sup.videocalling.SUPVideoCallingSpec";
                str = "onAttachedToWindow";
                r314.A08("com.facebook.messaging.sup.plugins.interfaces.videocalling.SUPVideoCallingSpec", str2, str, i);
                r306 = null;
                try {
                    if (C06204g8.A00(c06204g8)) {
                        i2 = atomicInteger.getAndIncrement();
                        str3 = "messaging.sup.videocalling.impl.SUPVideoCallingImpl";
                        r314.A0A(4YT.A00(14), (String) str3, "com.facebook.messaging.sup.plugins.interfaces.videocalling.SUPVideoCallingSpec", i2, str2, 4YT.A00(13), str);
                        try {
                            SUPVideoCallingImpl sUPVideoCallingImpl = c06204g8.A00;
                            11T.A0H(viewStub, context);
                            if (SUPVideoCallingImpl.A07 == null) {
                                MediaStreamLibraryLoader.A02(new IlB(), (MediaStreamLibraryLoader) 1Br.A0B(sUPVideoCallingImpl.A02), false);
                            }
                            JBW jbw = new JBW(context, viewStub, sUPVideoCallingImpl);
                            HG8 hg8 = SUPVideoCallingImpl.A07;
                            if (hg8 != null) {
                                DKE.A0K(sUPVideoCallingImpl.A04).post(new IxG(hg8, jbw));
                            }
                            sUPVideoCallingImpl.A02();
                            83U r0 = new 83U(j9u, sUPVideoCallingImpl, 31);
                            HG8 hg82 = SUPVideoCallingImpl.A07;
                            if (hg82 != null) {
                                r0.invoke(hg82);
                            }
                            r314.A09((String) str3, str2, str, i2);
                        } catch (Exception e) {
                            throw e;
                        }
                    }
                    r314.A02((Exception) null, str2, str, i);
                    ((2Qa) c00i.get()).A02(this.A1I);
                } catch (Throwable th) {
                    r314.A02(r306, str2, str, i);
                    throw th;
                }
            }
            Huo A012 = A01();
            if (A012 != null && A012.A04()) {
                Huo A013 = A01();
                if (A013 != null) {
                    ViewStub viewStub2 = (ViewStub) C09s.A01(this, 2131364476);
                    Context context2 = getContext();
                    Hz5 hz5 = A013.A00.A00;
                    AtomicInteger atomicInteger2 = C1Y6.A04;
                    int andIncrement = atomicInteger2.getAndIncrement();
                    1YC r02 = hz5.A03;
                    r02.A08("com.facebook.messaging.wearable.plugins.interfaces.hera.HeraMessengerPluginInterfaceSpec", "messaging.wearable.hera.HeraMessengerPluginInterfaceSpec", "onToggleButtonAttachedToWindow", andIncrement);
                    if (Hz5.A00(hz5)) {
                        int andIncrement2 = atomicInteger2.getAndIncrement();
                        String A1B = GOp.A1B(r02, "onToggleButtonAttachedToWindow", andIncrement2);
                        HeraMessengerPluginImplementation heraMessengerPluginImplementation = hz5.A01;
                        7zQ.A1Y(viewStub2, context2, 1);
                        JN7 jn7 = heraMessengerPluginImplementation.A03;
                        if (jn7 != null) {
                            jn7.BOe(context2, viewStub2);
                        }
                        JN7 jn72 = heraMessengerPluginImplementation.A03;
                        if (jn72 != null) {
                            jn72.Cs2(new DCy(heraMessengerPluginImplementation, 32));
                        }
                        Boolean bool = heraMessengerPluginImplementation.A09;
                        if (bool != null) {
                            boolean booleanValue = bool.booleanValue();
                            if (jn72 != null) {
                                jn72.CwX(booleanValue);
                            }
                        }
                        2aK.A03((Integer) null, (0DE) null, new AJX(viewStub2, heraMessengerPluginImplementation, (0DR) null, 8), heraMessengerPluginImplementation.A0U, 3);
                        r02.A09(A1B, "messaging.wearable.hera.HeraMessengerPluginInterfaceSpec", "onToggleButtonAttachedToWindow", andIncrement2);
                        r02.A02((Exception) null, "messaging.wearable.hera.HeraMessengerPluginInterfaceSpec", "onToggleButtonAttachedToWindow", andIncrement);
                    } else {
                        r02.A02((Exception) null, "messaging.wearable.hera.HeraMessengerPluginInterfaceSpec", "onToggleButtonAttachedToWindow", andIncrement);
                    }
                }
                Huo A014 = A01();
                if (A014 != null) {
                    Context context3 = getContext();
                    Hz5 hz52 = A014.A00.A00;
                    AtomicInteger atomicInteger3 = C1Y6.A04;
                    int andIncrement3 = atomicInteger3.getAndIncrement();
                    1YC r03 = hz52.A03;
                    r03.A08("com.facebook.messaging.wearable.plugins.interfaces.hera.HeraMessengerPluginInterfaceSpec", "messaging.wearable.hera.HeraMessengerPluginInterfaceSpec", "onActivityContextAvailable", andIncrement3);
                    if (Hz5.A00(hz52)) {
                        int andIncrement4 = atomicInteger3.getAndIncrement();
                        String A1B2 = GOp.A1B(r03, "onActivityContextAvailable", andIncrement4);
                        HeraMessengerPluginImplementation heraMessengerPluginImplementation2 = hz52.A01;
                        11T.A0F(context3, 0);
                        HeraMessengerPluginImplementation.A02(context3, heraMessengerPluginImplementation2);
                        r03.A09(A1B2, "messaging.wearable.hera.HeraMessengerPluginInterfaceSpec", "onActivityContextAvailable", andIncrement4);
                    }
                    r03.A02((Exception) null, "messaging.wearable.hera.HeraMessengerPluginInterfaceSpec", "onActivityContextAvailable", andIncrement3);
                }
            }
            Huo A015 = A01();
            if (A015 != null && A015.A03() && (A01 = A01()) != null) {
                ViewStub viewStub3 = (ViewStub) C09s.A01(this, 2131364473);
                Hz5 hz53 = A01.A00.A00;
                AtomicInteger atomicInteger4 = C1Y6.A04;
                i = atomicInteger4.getAndIncrement();
                r314 = hz53.A03;
                str2 = "messaging.wearable.hera.HeraMessengerPluginInterfaceSpec";
                str = "onDebugViewAttachedToWindow";
                r314.A08("com.facebook.messaging.wearable.plugins.interfaces.hera.HeraMessengerPluginInterfaceSpec", str2, str, i);
                r306 = null;
                if (Hz5.A00(hz53)) {
                    i2 = atomicInteger4.getAndIncrement();
                    str3 = GOp.A1B(r314, str, i2);
                    HeraMessengerPluginImplementation heraMessengerPluginImplementation3 = hz53.A01;
                    11T.A0F(viewStub3, 0);
                    ?? obj = new Object();
                    ((9RQ) obj).A01 = new J8K(heraMessengerPluginImplementation3, 7);
                    viewStub3.setLayoutResource(2132542112);
                    ((9RQ) obj).A00 = AbF.A06(viewStub3.inflate(), 2131363571);
                    ((9RQ) obj).A02 = 2aK.A04(new AJU(obj, null, 18), 2Zy.A01(2Zo.A04(false)));
                    heraMessengerPluginImplementation3.A02 = obj;
                    r314.A09((String) str3, str2, str, i2);
                    r314.A02((Exception) null, str2, str, i);
                } else {
                    r314.A02((Exception) null, str2, str, i);
                }
            }
            0FI.A0C(-915843219, A06);
        } catch (Throwable th2) {
            r314.A04(r306, str3, str2, str, i2);
            throw th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x00c2, code lost:
    
        if (X.4YU.A0B(r0.A04).orientation != 2) goto L11;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onConfigurationChanged(android.content.res.Configuration r302) {
        /*
            Method dump skipped, instructions count: 217
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.rtc.incall.impl.active.ActiveCallControls.onConfigurationChanged(android.content.res.Configuration):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r311v0, types: [X.00i] */
    /* JADX WARN: Type inference failed for: r311v2 */
    /* JADX WARN: Type inference failed for: r311v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r311v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r314v2 */
    /* JADX WARN: Type inference failed for: r314v3 */
    /* JADX WARN: Type inference failed for: r314v4 */
    /* JADX WARN: Type inference failed for: r314v6 */
    /* JADX WARN: Type inference failed for: r314v7, types: [java.util.concurrent.atomic.AtomicInteger] */
    @Override // com.facebook.widget.CustomFrameLayout, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        Huo A01;
        1YC r323;
        int i;
        JBZ jbz;
        Exception exc;
        HG8 hg8;
        int i2;
        int A06 = 0FI.A06(-1437740898);
        setOnSystemUiVisibilityChangeListener(null);
        ((GrV) this.A1D.getValue()).A0X();
        try {
            LDR.A02(this.A0D);
        } catch (NullPointerException e) {
            4zI.A03.A03("ActiveCallControls", "TransitionManager error", e, new Object[0]);
        }
        String str = this.A18.A00;
        ((2Qa) str.get()).A03(this.A1H);
        C06144g2 c06144g2 = this.A1J;
        if (c06144g2.A01()) {
            hg8 = c06144g2.A00.A00;
            exc = C1Y6.A04;
            int andIncrement = exc.getAndIncrement();
            1YC r0 = hg8.A02;
            r0.A08("com.facebook.messaging.sup.plugins.interfaces.videocalling.SUPVideoCallingSpec", "messaging.sup.videocalling.SUPVideoCallingSpec", "onDetachedFromWindow", andIncrement);
            Exception e2 = null;
            try {
                if (C06204g8.A00(hg8)) {
                    int andIncrement2 = exc.getAndIncrement();
                    r0.A0A(4YT.A00(14), "messaging.sup.videocalling.impl.SUPVideoCallingImpl", "com.facebook.messaging.sup.plugins.interfaces.videocalling.SUPVideoCallingSpec", andIncrement2, "messaging.sup.videocalling.SUPVideoCallingSpec", 4YT.A00(13), "onDetachedFromWindow");
                    try {
                        try {
                            SUPVideoCallingImpl sUPVideoCallingImpl = hg8.A00;
                            jbz = JBZ.A00;
                            hg8 = SUPVideoCallingImpl.A07;
                            if (hg8 != null) {
                                DKE.A0K(sUPVideoCallingImpl.A04).post(new IxH(hg8, jbz));
                            }
                            r0.A09("messaging.sup.videocalling.impl.SUPVideoCallingImpl", "messaging.sup.videocalling.SUPVideoCallingSpec", "onDetachedFromWindow", andIncrement2);
                            r0.A02((Exception) null, "messaging.sup.videocalling.SUPVideoCallingSpec", "onDetachedFromWindow", andIncrement);
                        } catch (Exception e3) {
                            e2 = e3;
                            throw e2;
                        }
                    } catch (Throwable th) {
                        r0.A04(e2, "messaging.sup.videocalling.impl.SUPVideoCallingImpl", "messaging.sup.videocalling.SUPVideoCallingSpec", "onDetachedFromWindow", andIncrement2);
                        throw th;
                    }
                } else {
                    r0.A02((Exception) null, "messaging.sup.videocalling.SUPVideoCallingSpec", "onDetachedFromWindow", andIncrement);
                }
                ((2Qa) str.get()).A03(this.A1I);
            } catch (Throwable th2) {
                r0.A02(e2, "messaging.sup.videocalling.SUPVideoCallingSpec", "onDetachedFromWindow", andIncrement);
                throw th2;
            }
        }
        Huo A012 = A01();
        if (A012 != null && A012.A04()) {
            Huo A013 = A01();
            try {
                if (A013 != null) {
                    Hz5 hz5 = A013.A00.A00;
                    AtomicInteger atomicInteger = C1Y6.A04;
                    i = atomicInteger.getAndIncrement();
                    r323 = hz5.A03;
                    hg8 = "messaging.wearable.hera.HeraMessengerPluginInterfaceSpec";
                    jbz = "onToggleButtonDetachedFromWindow";
                    r323.A08("com.facebook.messaging.wearable.plugins.interfaces.hera.HeraMessengerPluginInterfaceSpec", hg8, jbz, i);
                    exc = 0;
                    try {
                        if (Hz5.A00(hz5)) {
                            i2 = atomicInteger.getAndIncrement();
                            str = GOp.A1B(r323, jbz, i2);
                            try {
                                JN7 jn7 = hz5.A01.A03;
                                if (jn7 != null) {
                                    jn7.AN8();
                                }
                                r323.A09((String) str, hg8, jbz, i2);
                                r323.A02((Exception) null, hg8, jbz, i);
                            } catch (Exception e4) {
                                throw e4;
                            }
                        } else {
                            r323.A02((Exception) null, hg8, jbz, i);
                        }
                    } catch (Throwable th3) {
                        r323.A02(exc, hg8, jbz, i);
                        throw th3;
                    }
                }
                Huo A014 = A01();
                if (A014 != null) {
                    Hz5 hz52 = A014.A00.A00;
                    AtomicInteger atomicInteger2 = C1Y6.A04;
                    i = atomicInteger2.getAndIncrement();
                    r323 = hz52.A03;
                    hg8 = "messaging.wearable.hera.HeraMessengerPluginInterfaceSpec";
                    jbz = "onActivityContextUnavailable";
                    r323.A08("com.facebook.messaging.wearable.plugins.interfaces.hera.HeraMessengerPluginInterfaceSpec", hg8, jbz, i);
                    exc = 0;
                    if (Hz5.A00(hz52)) {
                        i2 = atomicInteger2.getAndIncrement();
                        str = GOp.A1B(r323, jbz, i2);
                        HeraMessengerPluginImplementation.A02(null, hz52.A01);
                        r323.A09((String) str, hg8, jbz, i2);
                        r323.A02((Exception) null, hg8, jbz, i);
                    } else {
                        r323.A02((Exception) null, hg8, jbz, i);
                    }
                }
            } catch (Throwable th4) {
                r323.A04(exc, str, hg8, jbz, i2);
                throw th4;
            }
        }
        JZj jZj = this.A0H;
        if (jZj != null) {
            jZj.dismiss();
        }
        this.A0H = null;
        Huo A015 = A01();
        if (A015 != null && A015.A03() && (A01 = A01()) != null) {
            Hz5 hz53 = A01.A00.A00;
            AtomicInteger atomicInteger3 = C1Y6.A04;
            int andIncrement3 = atomicInteger3.getAndIncrement();
            1YC r02 = hz53.A03;
            r02.A08("com.facebook.messaging.wearable.plugins.interfaces.hera.HeraMessengerPluginInterfaceSpec", "messaging.wearable.hera.HeraMessengerPluginInterfaceSpec", "onDebugViewDetachedFromWindow", andIncrement3);
            try {
                if (Hz5.A00(hz53)) {
                    int andIncrement4 = atomicInteger3.getAndIncrement();
                    String A1B = GOp.A1B(r02, "onDebugViewDetachedFromWindow", andIncrement4);
                    try {
                        try {
                            9RQ r03 = hz53.A01.A02;
                            if (r03 != null) {
                                C2a2 c2a2 = r03.A02;
                                if (c2a2 != null) {
                                    c2a2.AE0(null);
                                }
                                r03.A02 = null;
                                r03.A00 = null;
                                r03.A01 = null;
                            }
                            r02.A09(A1B, "messaging.wearable.hera.HeraMessengerPluginInterfaceSpec", "onDebugViewDetachedFromWindow", andIncrement4);
                            r02.A02((Exception) null, "messaging.wearable.hera.HeraMessengerPluginInterfaceSpec", "onDebugViewDetachedFromWindow", andIncrement3);
                        } catch (Exception e5) {
                            throw e5;
                        }
                    } catch (Throwable th5) {
                        r02.A04((Exception) null, A1B, "messaging.wearable.hera.HeraMessengerPluginInterfaceSpec", "onDebugViewDetachedFromWindow", andIncrement4);
                        throw th5;
                    }
                } else {
                    r02.A02((Exception) null, "messaging.wearable.hera.HeraMessengerPluginInterfaceSpec", "onDebugViewDetachedFromWindow", andIncrement3);
                }
            } catch (Throwable th6) {
                r02.A02((Exception) null, "messaging.wearable.hera.HeraMessengerPluginInterfaceSpec", "onDebugViewDetachedFromWindow", andIncrement3);
                throw th6;
            }
        }
        super.onDetachedFromWindow();
        0FI.A0C(1741944768, A06);
    }
}
