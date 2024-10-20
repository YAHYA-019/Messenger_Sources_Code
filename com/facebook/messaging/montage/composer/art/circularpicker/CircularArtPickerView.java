package com.facebook.messaging.montage.composer.art.circularpicker;

import X.0D2;
import X.0FI;
import X.0S2;
import X.11T;
import X.1BK;
import X.1Bi;
import X.1Bn;
import X.1CO;
import X.1ED;
import X.1Hv;
import X.1Kd;
import X.1Lo;
import X.1XU;
import X.2Xd;
import X.2kG;
import X.4YU;
import X.4YV;
import X.AbF;
import X.AbL;
import X.AnonymousClass001;
import X.C00i;
import X.C09964s0;
import X.C09s;
import X.C12;
import X.C1F6;
import X.C1oo;
import X.C2593Gic;
import X.C2594Gid;
import X.C2595Gie;
import X.C2778Gnv;
import X.C3lm;
import X.C62j;
import X.C66h;
import X.C66i;
import X.DKC;
import X.GOn;
import X.GOp;
import X.GWi;
import X.GcH;
import X.Gzz;
import X.H51;
import X.HCK;
import X.HTG;
import X.HTH;
import X.Hak;
import X.Hjs;
import X.HqO;
import X.HtG;
import X.I1l;
import X.I2Q;
import X.I3t;
import X.I4l;
import X.IAL;
import X.IF2;
import X.IKE;
import X.IKm;
import X.IQ1;
import X.IRV;
import X.IW5;
import X.IW9;
import X.InY;
import X.Inf;
import X.IwS;
import X.J5V;
import X.JI8;
import X.JMN;
import X.QqA;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.executors.annotations.ForUiThread;
import com.facebook.common.executors.annotations.SharedBackgroundExecutor;
import com.facebook.inject.FbInjector;
import com.facebook.messaging.montage.composer.art.circularpicker.CircularArtPickerView;
import com.facebook.messaging.montage.model.art.ArtCategoryItem;
import com.facebook.messaging.montage.model.art.BaseItem;
import com.facebook.messaging.montage.model.art.CompositionInfo;
import com.facebook.messaging.montage.model.art.EffectItem;
import com.facebook.widget.CustomFrameLayout;
import com.facebook.widget.CustomLinearLayout;
import com.facebook.widget.recyclerview.BetterRecyclerView;
import com.google.common.util.concurrent.ListenableFuture;
import com.mapbox.mapboxsdk.R;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* loaded from: CircularArtPickerView.class */
public class CircularArtPickerView extends CustomFrameLayout implements JI8 {
    public static final C66h A0o = C66h.A00();
    public float A00;
    public int A01;
    public View A02;
    public ViewTreeObserver.OnGlobalLayoutListener A03;
    public 0D2 A04;
    public 2kG A05;
    public 2kG A06;
    public C00i A07;
    public C00i A08;
    public C00i A09;
    public C00i A0A;
    public C00i A0B;
    public C00i A0C;
    public HtG A0D;
    public HtG A0E;
    public IAL A0F;
    public H51 A0G;
    public I3t A0H;
    public Hjs A0I;
    public IF2 A0J;
    public JMN A0K;
    public ArtCategoryItem A0L;
    public CustomLinearLayout A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public C00i A0S;
    public C00i A0T;
    public C00i A0U;
    public final int A0V;
    public final int A0W;
    public final int A0X;
    public final int A0Y;
    public final int A0Z;
    public final C00i A0a;
    public final C00i A0b;
    public final C00i A0c;
    public final HCK A0d;
    public final CircularArtPickerCallToActionButton A0e;
    public final CircularArtPickerItemDescriptionView A0f;
    public final CircularArtPickerResetButton A0g;
    public final C66i A0h;
    public final BetterRecyclerView A0i;
    public final boolean A0j;
    public final int A0k;
    public final int A0l;
    public final C00i A0m;
    public final boolean A0n;

    public CircularArtPickerView(Context context) {
        this(context, null);
    }

    public CircularArtPickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CircularArtPickerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int i2;
        int i3;
        Resources resources = getResources();
        this.A0Z = GOn.A07(resources, 2132279328);
        this.A0V = resources.getDimensionPixelSize(R.dimen.mapbox_eight_dp);
        this.A0l = resources.getDimensionPixelSize(2132279604);
        this.A0k = resources.getDimensionPixelSize(R.dimen.mapbox_eight_dp);
        this.A0b = 1Bi.A02(I1l.class, (Class) null);
        this.A0m = 1Bi.A02(I2Q.class, (Class) null);
        this.A0c = 1Bi.A02(C09964s0.class, (Class) null);
        this.A0a = 1Bi.A02(1CO.class, (Class) null);
        this.A04 = null;
        this.A0O = false;
        this.A07 = 1Bn.A06(context, GWi.class, (Class) null);
        this.A0A = 1Bn.A09(C2595Gie.class, (Class) null);
        this.A09 = 1Bn.A06(context, C2593Gic.class, (Class) null);
        this.A0S = 1Bn.A09(C2594Gid.class, (Class) null);
        this.A0C = 1Bi.A02(ExecutorService.class, ForUiThread.class);
        this.A08 = 1Bi.A02(1ED.class, SharedBackgroundExecutor.class);
        this.A0U = 1Bn.A09(C62j.class, (Class) null);
        this.A0B = 1Bn.A06(context, I4l.class, (Class) null);
        this.A0T = 1Hv.A01(context, HqO.class);
        A0U(2132541707);
        BetterRecyclerView betterRecyclerView = (BetterRecyclerView) C09s.A01(this, 2131366869);
        this.A0i = betterRecyclerView;
        this.A0f = (CircularArtPickerItemDescriptionView) C09s.A01(this, 2131363606);
        this.A0e = (CircularArtPickerCallToActionButton) C09s.A01(this, 2131363475);
        CircularArtPickerResetButton circularArtPickerResetButton = (CircularArtPickerResetButton) C09s.A01(this, 2131366921);
        this.A0g = circularArtPickerResetButton;
        int A07 = GOn.A07(resources, 2132279342);
        int dimensionPixelSize = resources.getDimensionPixelSize(2132279365);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.mapbox_eight_dp);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1oo.A0N, i, 0);
        this.A0X = (int) obtainStyledAttributes.getDimension(1, A07);
        this.A0W = (int) obtainStyledAttributes.getDimension(0, dimensionPixelSize);
        this.A0Y = (int) obtainStyledAttributes.getDimension(5, dimensionPixelSize2);
        this.A0n = obtainStyledAttributes.getBoolean(2, false);
        this.A0j = obtainStyledAttributes.getBoolean(3, false);
        boolean z = obtainStyledAttributes.getBoolean(6, false);
        this.A0R = obtainStyledAttributes.getBoolean(4, false);
        obtainStyledAttributes.recycle();
        C66i c66i = new C66i((C62j) this.A0U.get());
        c66i.A09(A0o);
        c66i.A06 = true;
        c66i.A0A(new Gzz(this));
        this.A0h = c66i;
        if (1XU.A00(context) || z) {
            this.A01 = 4YU.A0B(context).orientation;
        } else {
            this.A01 = 1;
        }
        this.A0d = ((HqO) this.A0T.get()).A01;
        int i4 = this.A01;
        View view = this.A0M;
        if (view != null) {
            removeView(view);
        }
        Context context2 = getContext();
        CustomLinearLayout customLinearLayout = (CustomLinearLayout) View.inflate(context2, 2131558402, null);
        this.A0M = customLinearLayout;
        addView(customLinearLayout);
        this.A0M.setVisibility(8);
        boolean A1V = 4YV.A1V(i4, 1);
        CircularArtPickerLoadingView circularArtPickerLoadingView = (CircularArtPickerLoadingView) C09s.A01(this, 2131364134);
        CircularArtPickerLoadingView circularArtPickerLoadingView2 = (CircularArtPickerLoadingView) C09s.A01(this, 2131367199);
        circularArtPickerLoadingView.A00 = A1V ? 0S2.A0C : 0S2.A00;
        circularArtPickerLoadingView2.A00 = A1V ? 0S2.A0N : 0S2.A01;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.A0M.getLayoutParams();
        int i5 = -1;
        if (A1V) {
            i2 = -1;
            float f = 0.0f / 0.0f;
        } else {
            i2 = this.A0X;
        }
        ((ViewGroup.LayoutParams) layoutParams).width = i2;
        ((ViewGroup.LayoutParams) layoutParams).height = A1V ? this.A0X : i5;
        if (!this.A0R) {
            layoutParams.gravity = A1V ? 80 : 8388613;
        }
        if (this.A0j) {
            this.A0M.requireViewById(2131365325).setVisibility(4);
        }
        this.A0M.setLayoutParams(layoutParams);
        BetterRecyclerView betterRecyclerView2 = this.A0i;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) betterRecyclerView2.getLayoutParams();
        if (((RecyclerView) betterRecyclerView2).A0F == null) {
            boolean z2 = !AnonymousClass001.A1Q(i4, 1);
            betterRecyclerView2.A1D(new LinearLayoutManager(context2, z2 ? 1 : 0, z2));
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) ((RecyclerView) betterRecyclerView2).A0F;
        int i6 = 1;
        if (i4 == 2) {
            linearLayoutManager.A1p(1);
            linearLayoutManager.A1u(true);
            ((ViewGroup.LayoutParams) layoutParams2).height = -1;
            ((ViewGroup.LayoutParams) layoutParams2).width = this.A0X;
            if (!this.A0R) {
                i3 = 8388613;
                layoutParams2.gravity = i3;
            }
        } else if (i4 == 1) {
            linearLayoutManager.A1p(0);
            linearLayoutManager.A1u(false);
            ((ViewGroup.LayoutParams) layoutParams2).height = this.A0X;
            ((ViewGroup.LayoutParams) layoutParams2).width = -1;
            if (!this.A0R) {
                i3 = 80;
                layoutParams2.gravity = i3;
            }
        }
        betterRecyclerView2.setLayoutParams(layoutParams2);
        betterRecyclerView2.post(new IwS(this, i4));
        CircularArtPickerResetButton circularArtPickerResetButton2 = this.A0g;
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) circularArtPickerResetButton2.getLayoutParams();
        int i7 = this.A0X;
        ((ViewGroup.LayoutParams) layoutParams3).height = i7;
        ((ViewGroup.LayoutParams) layoutParams3).width = i7;
        if (!this.A0R) {
            i6 = 21;
            if (i4 == 1) {
                i6 = 81;
            }
        } else if (i4 != 1) {
            i6 = 16;
        }
        layoutParams3.gravity = i6;
        circularArtPickerResetButton2.setLayoutParams(layoutParams3);
        ViewGroup.LayoutParams layoutParams4 = circularArtPickerResetButton2.A03.getLayoutParams();
        if (layoutParams4 == null) {
            throw 1BK.A0h();
        }
        layoutParams4.height = i7;
        layoutParams4.width = i7;
        IKE.A01(circularArtPickerResetButton, this, 83);
        ((GWi) this.A07.get()).A03 = new HTH(this);
        betterRecyclerView.A0T = true;
        betterRecyclerView.A16((2Xd) this.A07.get());
        IKm.A00(betterRecyclerView, this, 9);
        C3lm c3lm = new C3lm() { // from class: X.Ila
            @Override // X.C3lm
            public final void C2X(View view2, BetterRecyclerView betterRecyclerView3, int i8, long j) {
                CircularArtPickerView circularArtPickerView = CircularArtPickerView.this;
                circularArtPickerView.A0P = false;
                if (view2.isSelected() || circularArtPickerView.A0J == null || !(!(view2 instanceof H4D))) {
                    return;
                }
                circularArtPickerView.A0i.post(new IwT(circularArtPickerView, i8));
            }
        };
        if (!betterRecyclerView.A06) {
            betterRecyclerView.A14.add(betterRecyclerView.A0B);
        }
        betterRecyclerView.A05 = c3lm;
        betterRecyclerView.A06 = true;
        HTG htg = new HTG(this);
        if (!betterRecyclerView.isLongClickable()) {
            betterRecyclerView.setLongClickable(true);
        }
        if (!betterRecyclerView.A07) {
            betterRecyclerView.A14.add(betterRecyclerView.A0C);
        }
        betterRecyclerView.A02 = htg;
        betterRecyclerView.A07 = true;
        C1F6 A0P = AbF.A0P(this.A0S);
        Hak hak = new Hak(this, this);
        Context A01 = FbInjector.A01();
        AbL.A0y(A0P);
        try {
            Hjs hjs = new Hjs(context, hak);
            1Bn.A0K();
            FbInjector.A04(A01);
            this.A0I = hjs;
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A01);
            throw th;
        }
    }

    public static void A00(View view, FbUserSession fbUserSession, CircularArtPickerView circularArtPickerView, CompositionInfo compositionInfo, EffectItem effectItem) {
        C12 c12;
        I2Q i2q = (I2Q) circularArtPickerView.A0m.get();
        11T.A0F(effectItem, 0);
        Map map = i2q.A01;
        if (map != null) {
            AnonymousClass001.A18(BaseItem.A02(effectItem), -1, map);
            I2Q.A00(i2q, map);
        }
        ((H51) view).A07.setVisibility(8);
        HtG htG = circularArtPickerView.A0E;
        if (htG != null && (c12 = htG.A00.A0A) != null) {
            IQ1 iq1 = c12.A00;
            CallerContext callerContext = IQ1.A1m;
            iq1.A1Q.DAF();
        }
        1Kd.A0D(circularArtPickerView.A0C, new InY(0, view, fbUserSession, circularArtPickerView, compositionInfo, effectItem), J5V.A01(AbF.A13(circularArtPickerView.A08), effectItem, 1Lo.A01(circularArtPickerView.getContext(), fbUserSession, C2778Gnv.class), 10));
    }

    public static void A01(View view, FbUserSession fbUserSession, CircularArtPickerView circularArtPickerView, CompositionInfo compositionInfo, EffectItem effectItem, boolean z) {
        C2778Gnv c2778Gnv = (C2778Gnv) 1Lo.A05(circularArtPickerView.getContext(), fbUserSession, C2778Gnv.class);
        if (z || !(view instanceof H51)) {
            c2778Gnv.A01(new IW9(2, compositionInfo, circularArtPickerView, effectItem), effectItem);
            return;
        }
        H51 h51 = (H51) view;
        c2778Gnv.A06(new GcH(h51, circularArtPickerView, 2), new IW5(fbUserSession, c2778Gnv, h51, circularArtPickerView, compositionInfo), effectItem, false);
        A02(fbUserSession, h51, circularArtPickerView, effectItem);
    }

    public static void A02(FbUserSession fbUserSession, H51 h51, CircularArtPickerView circularArtPickerView, EffectItem effectItem) {
        ListenableFuture A01 = J5V.A01(AbF.A13(circularArtPickerView.A08), effectItem, 1Lo.A01(circularArtPickerView.getContext(), fbUserSession, C2778Gnv.class), 11);
        1Kd.A0D(circularArtPickerView.A0C, Inf.A00(h51, circularArtPickerView, 18), A01);
    }

    public static void A03(CircularArtPickerCallToActionButton circularArtPickerCallToActionButton, CircularArtPickerItemDescriptionView circularArtPickerItemDescriptionView, CircularArtPickerResetButton circularArtPickerResetButton, CircularArtPickerView circularArtPickerView, JMN jmn, CustomLinearLayout customLinearLayout, BetterRecyclerView betterRecyclerView) {
        View BJw;
        float B85;
        int width;
        if (circularArtPickerView.A0R || (BJw = jmn.BJw()) == null || circularArtPickerResetButton == null) {
            return;
        }
        ViewGroup.MarginLayoutParams A0I = DKC.A0I(betterRecyclerView);
        ViewGroup.MarginLayoutParams A0I2 = DKC.A0I(customLinearLayout);
        ViewGroup.MarginLayoutParams A0I3 = DKC.A0I(circularArtPickerResetButton);
        ViewGroup.MarginLayoutParams A0I4 = DKC.A0I(circularArtPickerItemDescriptionView);
        ViewGroup.MarginLayoutParams A0I5 = DKC.A0I(circularArtPickerCallToActionButton);
        int i = ((LinearLayoutManager) ((RecyclerView) betterRecyclerView).A0F).A01;
        if (AnonymousClass001.A1Q(circularArtPickerView.A01, 1)) {
            B85 = jmn.AZv();
            width = BJw.getHeight();
        } else {
            B85 = jmn.B85();
            width = BJw.getWidth();
        }
        float f = (B85 + (width / 2.0f)) - (circularArtPickerView.A0X / 2.0f);
        if (i == 0) {
            A0I.rightMargin = 0;
            int i2 = (int) f;
            A0I.bottomMargin = i2;
            A0I2.rightMargin = 0;
            A0I2.bottomMargin = i2;
            A0I3.rightMargin = 0;
            A0I3.bottomMargin = i2;
            A0I4.rightMargin = 0;
            A0I4.bottomMargin = circularArtPickerView.A0l;
            A0I5.rightMargin = 0;
            A0I5.bottomMargin = circularArtPickerView.A0k;
        } else {
            int i3 = (int) f;
            A0I.rightMargin = i3;
            A0I.bottomMargin = 0;
            A0I2.rightMargin = i3;
            A0I2.bottomMargin = 0;
            A0I3.rightMargin = i3;
            A0I3.bottomMargin = 0;
            A0I4.rightMargin = circularArtPickerView.A0l;
            A0I4.bottomMargin = 0;
            A0I5.rightMargin = circularArtPickerView.A0k;
            A0I5.bottomMargin = 0;
        }
        betterRecyclerView.setLayoutParams(A0I);
        customLinearLayout.setLayoutParams(A0I2);
        circularArtPickerResetButton.setLayoutParams(A0I3);
        circularArtPickerItemDescriptionView.setLayoutParams(A0I4);
        circularArtPickerCallToActionButton.setLayoutParams(A0I5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00c0, code lost:
    
        r308 = 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A04(com.facebook.messaging.montage.composer.art.circularpicker.CircularArtPickerView r301) {
        /*
            Method dump skipped, instructions count: 224
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.montage.composer.art.circularpicker.CircularArtPickerView.A04(com.facebook.messaging.montage.composer.art.circularpicker.CircularArtPickerView):void");
    }

    public void A0V() {
        int i;
        IF2 if2;
        if (this.A02 != null) {
            BetterRecyclerView betterRecyclerView = this.A0i;
            if (betterRecyclerView.A0d() != 0) {
                betterRecyclerView.A0q();
            }
            int A05 = RecyclerView.A05(this.A02);
            C00i c00i = this.A07;
            GWi gWi = (GWi) c00i.get();
            if (gWi.A04 == null || A05 < 0) {
                i = 0;
                if (A05 == -1) {
                    return;
                }
            } else {
                i = (A05 / GWi.A01(gWi)) * GWi.A01(gWi);
                int A01 = ((A05 / GWi.A01(gWi)) + 1) * GWi.A01(gWi);
                if (A05 - i > A01 - A05) {
                    i = A01;
                }
            }
            if (((2Xd) c00i.get()).getItemViewType(i) != 0 || (if2 = this.A0J) == null) {
                return;
            }
            if2.A06(i, true);
        }
    }

    public void A0W() {
        View childAt;
        IF2 if2 = this.A0J;
        if (if2 == null || (childAt = if2.A0A.getChildAt(IF2.A04(if2))) == null) {
            return;
        }
        IF2.A05(childAt, if2);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v72, types: [java.lang.Object, X.HFD] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0X(com.facebook.auth.usersession.FbUserSession r302, X.I3t r303) {
        /*
            Method dump skipped, instructions count: 933
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.montage.composer.art.circularpicker.CircularArtPickerView.A0X(com.facebook.auth.usersession.FbUserSession, X.I3t):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x014b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0Y(com.facebook.auth.usersession.FbUserSession r302, X.JMN r303) {
        /*
            Method dump skipped, instructions count: 434
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.montage.composer.art.circularpicker.CircularArtPickerView.A0Y(com.facebook.auth.usersession.FbUserSession, X.JMN):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x003c, code lost:
    
        if (X.I4l.A00(r0).A03 == false) goto L6;
     */
    @Override // X.JI8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean CyZ() {
        /*
            r301 = this;
            r0 = r301
            X.00i r0 = r0.A0B
            java.lang.Object r0 = X.4YU.A0p(r0)
            X.I4l r0 = (X.I4l) r0
            r302 = r0
            r0 = r302
            X.ExQ r0 = X.I4l.A00(r0)
            X.1Br r0 = r0.A0A
            r303 = r0
            r0 = r303
            X.2yD r0 = X.1Br.A07(r0)
            r304 = r0
            r0 = 36321486155301255(0x810a3300004187, double:3.0331923272734717E-306)
            r305 = r0
            r0 = r304
            r1 = r305
            boolean r0 = r0.AZk(r1)
            r307 = r0
            r0 = r307
            if (r0 == 0) goto L3f
            r0 = r302
            X.ExQ r0 = X.I4l.A00(r0)
            r303 = r0
            r0 = r303
            boolean r0 = r0.A03
            r308 = r0
            r0 = 1
            r307 = r0
            r0 = r308
            if (r0 != 0) goto L44
        L3f:
            r0 = 0
            r307 = r0
            r0 = 0
            r303 = r0
        L44:
            r0 = r307
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.montage.composer.art.circularpicker.CircularArtPickerView.CyZ():boolean");
    }

    @Override // X.JI8
    public void Czx(QqA qqA, Runnable runnable, Runnable runnable2) {
        this.A0O = true;
        this.A04 = ((I4l) 4YU.A0p(this.A0B)).A01(getContext(), new IRV(this, runnable, runnable2), qqA, true);
    }

    @Override // com.facebook.widget.CustomFrameLayout, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        int A06 = 0FI.A06(382707738);
        super.onAttachedToWindow();
        IF2 if2 = this.A0J;
        if (if2 != null) {
            if2.A0A.A1F(if2.A09);
        }
        0FI.A0C(-1628080194, A06);
    }

    @Override // com.facebook.widget.CustomFrameLayout, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        int A06 = 0FI.A06(1179071509);
        super.onDetachedFromWindow();
        this.A0P = false;
        this.A00 = 0.0f;
        Hjs hjs = this.A0I;
        GOp.A1P(hjs.A02);
        GOp.A1P(hjs.A06);
        GOp.A1P(hjs.A03);
        IF2 if2 = this.A0J;
        if (if2 != null) {
            if2.A02 = null;
            if2.A0A.A1G(if2.A09);
        }
        0FI.A0C(-928354496, A06);
    }
}
