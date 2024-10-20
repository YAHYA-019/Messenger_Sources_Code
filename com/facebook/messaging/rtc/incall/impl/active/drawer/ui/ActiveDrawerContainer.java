package com.facebook.messaging.rtc.incall.impl.active.drawer.ui;

import X.0FI;
import X.11T;
import X.1BK;
import X.1Br;
import X.1Bu;
import X.1Lm;
import X.2OB;
import X.4YU;
import X.5WH;
import X.7zO;
import X.7zQ;
import X.AbG;
import X.AbI;
import X.AnonymousClass001;
import X.AyG;
import X.Az6;
import X.C01i;
import X.C03i;
import X.C06974ih;
import X.C1Y6;
import X.C2644Gjy;
import X.C2671Gkn;
import X.DKE;
import X.DKF;
import X.DKG;
import X.GOn;
import X.GOo;
import X.GOq;
import X.GR1;
import X.GUz;
import X.GVY;
import X.GpS;
import X.GpZ;
import X.Gpi;
import X.Gpj;
import X.Gpl;
import X.GrQ;
import X.GrV;
import X.GvO;
import X.HGB;
import X.HPW;
import X.HUy;
import X.I3N;
import X.IDw;
import X.IKE;
import X.IMK;
import X.IYH;
import X.IZA;
import X.IrR;
import X.IrS;
import X.J0f;
import X.J9s;
import X.JD8;
import X.JDB;
import X.JLm;
import X.JOL;
import X.JP9;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.litho.LithoView;
import com.facebook.messaging.rtc.incall.impl.active.drawer.ui.sheet.DrawerBehavior;
import com.facebook.messaging.rtc.incall.impl.widgets.overflow.ParticipantOverflowPill;
import com.facebook.messaging.rtc.incall.impl.widgets.overflow.ParticipantOverflowPillForScrollableGrid;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.resources.ui.FbTextView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: ActiveDrawerContainer.class */
public final class ActiveDrawerContainer extends CoordinatorLayout implements JP9 {
    public int A00;
    public int A01;
    public int A02;
    public LithoView A03;
    public Gpi A04;
    public Gpj A05;
    public GvO A06;
    public GVY A07;
    public GVY A08;
    public ParticipantOverflowPill A09;
    public ParticipantOverflowPillForScrollableGrid A0A;
    public FbTextView A0B;
    public ViewGroup A0C;
    public HUy A0D;
    public final FbUserSession A0E;
    public final 1Br A0F;
    public final 1Br A0G;
    public final 1Br A0H;
    public final 1Br A0I;
    public final 1Br A0J;
    public final 1Br A0K;
    public final 1Br A0L;
    public final JD8 A0M;
    public final JD8 A0N;
    public final JD8 A0O;
    public final Map A0P;
    public final C01i A0Q;
    public final JLm A0R;
    public final JD8 A0S;
    public final HGB A0T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActiveDrawerContainer(Context context) {
        super(context, null);
        11T.A0F(context, 1);
        this.A0G = 1Bu.A00(147704);
        this.A0E = IDw.A01(this, "ActiveDrawerContainer");
        this.A0I = AbG.A0M();
        this.A0F = 1Bu.A01(4YU.A08(this), 16980);
        this.A0J = GOo.A0L();
        this.A0Q = J9s.A00(this, C03i.A02, 10);
        this.A0L = 1Bu.A00(115631);
        this.A0H = 1Bu.A00(98337);
        this.A0K = 1Bu.A00(115696);
        this.A0P = AnonymousClass001.A0u();
        this.A0T = new Gpl(this, 4);
        this.A0S = new IYH(this, 0);
        this.A0O = new IYH(this, 4);
        this.A0N = new IYH(this, 2);
        this.A0M = new IYH(this, 1);
        this.A0R = GpZ.A00(this, 11);
        A02(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActiveDrawerContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        11T.A0F(context, 1);
        this.A0G = 1Bu.A00(147704);
        this.A0E = IDw.A01(this, "ActiveDrawerContainer");
        this.A0I = AbG.A0M();
        this.A0F = 1Bu.A01(4YU.A08(this), 16980);
        this.A0J = GOo.A0L();
        this.A0Q = J9s.A00(this, C03i.A02, 10);
        this.A0L = 1Bu.A00(115631);
        this.A0H = 1Bu.A00(98337);
        this.A0K = 1Bu.A00(115696);
        this.A0P = AnonymousClass001.A0u();
        this.A0T = new Gpl(this, 4);
        this.A0S = new IYH(this, 0);
        this.A0O = new IYH(this, 4);
        this.A0N = new IYH(this, 2);
        this.A0M = new IYH(this, 1);
        this.A0R = GpZ.A00(this, 11);
        A02(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActiveDrawerContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        11T.A0F(context, 1);
        this.A0G = 1Bu.A00(147704);
        this.A0E = IDw.A01(this, "ActiveDrawerContainer");
        this.A0I = AbG.A0M();
        this.A0F = 1Bu.A01(4YU.A08(this), 16980);
        this.A0J = GOo.A0L();
        this.A0Q = J9s.A00(this, C03i.A02, 10);
        this.A0L = 1Bu.A00(115631);
        this.A0H = 1Bu.A00(98337);
        this.A0K = 1Bu.A00(115696);
        this.A0P = AnonymousClass001.A0u();
        this.A0T = new Gpl(this, 4);
        this.A0S = new IYH(this, 0);
        this.A0O = new IYH(this, 4);
        this.A0N = new IYH(this, 2);
        this.A0M = new IYH(this, 1);
        this.A0R = GpZ.A00(this, 11);
        A02(context);
    }

    private final ViewGroup A00() {
        ViewGroup viewGroup = this.A0C;
        ViewGroup viewGroup2 = viewGroup;
        if (viewGroup == null) {
            LinearLayout linearLayout = new LinearLayout(getContext());
            linearLayout.setOrientation(1);
            linearLayout.setGravity(1);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 81;
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = GOq.A08(this);
            this.A0C = linearLayout;
            viewGroup2 = linearLayout;
        }
        11T.A0I(viewGroup2, "null cannot be cast to non-null type android.view.ViewGroup");
        return viewGroup2;
    }

    private final DrawerBehavior A01(5WH r302, JD8 jd8) {
        DrawerBehavior drawerBehavior = new DrawerBehavior(getContext(), 1Br.A04(this.A0I));
        if (!drawerBehavior.A0D) {
            drawerBehavior.A0D = true;
        }
        drawerBehavior.A0F = true;
        ArrayList arrayList = drawerBehavior.A0N;
        arrayList.clear();
        if (jd8 != null) {
            arrayList.add(jd8);
        }
        drawerBehavior.A05(0);
        r302.A01(drawerBehavior);
        return drawerBehavior;
    }

    /* JADX WARN: Type inference failed for: r0v66, types: [X.Gpi, android.view.View, X.GVY] */
    private final void A02(Context context) {
        1Br r0 = this.A0J;
        1Br.A0B(r0);
        this.A0D = new HUy((HPW) C1Y6.A00(context, "com_facebook_messaging_rtc_incall_impl_active_drawer_ui_plugins_interfaces_abovedrawercontent_AboveDrawerContentInterfaceSpec", "AboveDrawerContent", new Object[]{this.A0E}));
        1Br.A0B(r0);
        if (this.A04 == null) {
            5WH r02 = new 5WH(-1, -1);
            Context A08 = 4YU.A08(this);
            ?? gvy = new GVY(A08, (JOL) null, A01(r02, this.A0N));
            View gUz = new GUz(A08);
            gvy.A00 = gUz;
            ((GVY) gvy).A01.addView(gUz);
            this.A04 = gvy;
            gvy.setLayoutParams(r02);
        }
        if (((I3N) 1Br.A0B(this.A0L)).A01() && this.A07 == null) {
            ViewGroup.LayoutParams layoutParams = new 5WH(-1, -1);
            Context context2 = getContext();
            GVY gvy2 = new GVY(context2, (JOL) null, A01(layoutParams, new IYH(this, 3)));
            this.A07 = gvy2;
            gvy2.setLayoutParams(layoutParams);
            GVY gvy3 = this.A07;
            if (gvy3 != null) {
                GpS gpS = (GpS) 1Br.A0B(this.A0K);
                11T.A0A(context2);
                gvy3.A01.addView(gpS.Az5(context2));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x031f, code lost:
    
        if (r0 == null) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x032d, code lost:
    
        if (r0 != r0.A05()) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0330, code lost:
    
        r313 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0335, code lost:
    
        if (r0 != false) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0347, code lost:
    
        if (r0.getParent() == null) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x034a, code lost:
    
        r0 = r301.A08;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0352, code lost:
    
        if (r0 == null) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x035f, code lost:
    
        if (r0.getParent() != r301) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0362, code lost:
    
        r304 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0366, code lost:
    
        if (r307 != false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x036b, code lost:
    
        if (r313 == false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x03d4, code lost:
    
        X.AbstractC2326GOr.A0N(r301).A02(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x03dd, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x036f, code lost:
    
        if (r304 == false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0372, code lost:
    
        X.AbstractC2326GOr.A0N(r301).A03(r0, 11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x037d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0338, code lost:
    
        r313 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x019b, code lost:
    
        r0 = r0.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x01bb, code lost:
    
        if (X.1Br.A06(r0).AZk(36315494676767736L) != false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x01c0, code lost:
    
        if (r315 == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x01dc, code lost:
    
        if (X.1Br.A06(r0).AZk(36315494680699909L) != false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x01e1, code lost:
    
        if (r316 == false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x01fd, code lost:
    
        if (X.1Br.A06(r0).AZk(36315494680765446L) == false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x02b6, code lost:
    
        r0 = (X.HmX) X.1Br.A0B(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x02c1, code lost:
    
        if (r302 == null) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x02ce, code lost:
    
        if (r302.A0D != true) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x039e, code lost:
    
        if (X.1Br.A06(r0.A00).AZk(36315494680765446L) == false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0160, code lost:
    
        r316 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x016d, code lost:
    
        if (r302.A0D == true) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0146, code lost:
    
        if (r302 != null) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x009b, code lost:
    
        if (r0.getParent() != r301) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x013c, code lost:
    
        if (r302.A0I != true) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0149, code lost:
    
        r315 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0156, code lost:
    
        if (r302.A0F == true) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0159, code lost:
    
        r315 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x015d, code lost:
    
        if (r302 == null) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0170, code lost:
    
        r316 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0175, code lost:
    
        if (r313 == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0198, code lost:
    
        if (X.1Br.A06(r0.A00).AZk(36315494680372224L) != false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0200, code lost:
    
        r0 = r301.A04;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0208, code lost:
    
        if (r0 == null) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x020b, code lost:
    
        r0 = X.AnonymousClass001.A0s();
        r0.add(r301.A05);
        r0.add(r301.A08);
        r0.add(r301.A07);
        r319 = null;
        r0 = r0.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0249, code lost:
    
        if (r0 == null) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x024c, code lost:
    
        r319 = r0.A0K;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x025c, code lost:
    
        if (r0.getParent() == null) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x025f, code lost:
    
        r0 = r301.A04;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0267, code lost:
    
        if (r0 == null) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x026a, code lost:
    
        r313 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0277, code lost:
    
        if (r0.getParent() == r301) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0281, code lost:
    
        if (r302 == null) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x028c, code lost:
    
        if (r302.A0G == false) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001e, code lost:
    
        if (r0 == 3) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0291, code lost:
    
        if (r313 == false) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0296, code lost:
    
        if (r307 == false) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x02a2, code lost:
    
        if (A06(r0) != false) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x02a7, code lost:
    
        if (r319 == null) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x02aa, code lost:
    
        X.AbstractC2326GOr.A0N(r301).A03(r319, 11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x02b5, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x03a1, code lost:
    
        r0 = r301.A04;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x03a9, code lost:
    
        if (r0 == null) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x03ac, code lost:
    
        r0 = ((X.GVY) r0).A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x03b5, code lost:
    
        if (r0 == null) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x03b8, code lost:
    
        r0 = r0.A0K;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x03c1, code lost:
    
        if (r0 == null) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x03c4, code lost:
    
        X.AbstractC2326GOr.A0N(r301).A02(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x027a, code lost:
    
        r313 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x02d9, code lost:
    
        if (r301.A08 == null) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x02dc, code lost:
    
        X.1Br.A0B(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x02e2, code lost:
    
        r0 = r301.A08;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x02ea, code lost:
    
        if (r0 == null) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x02ed, code lost:
    
        r0 = r0.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x02f6, code lost:
    
        if (r0 == null) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x02f9, code lost:
    
        r0 = r0.A0K;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0302, code lost:
    
        if (r0 == null) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0306, code lost:
    
        if (r302 == null) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0309, code lost:
    
        r0 = r302.A05;
        r0 = X.AnonymousClass001.A1Q(r302.A03, 3);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void A03(X.C2644Gjy r302) {
        /*
            Method dump skipped, instructions count: 990
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.rtc.incall.impl.active.drawer.ui.ActiveDrawerContainer.A03(X.Gjy):void");
    }

    private final void A04(C2644Gjy c2644Gjy) {
        boolean z;
        int i;
        Rect rect = c2644Gjy.A04;
        Resources resources = getResources();
        if (GOn.A06(resources) == 2) {
            z = true;
            i = 0;
        } else {
            z = false;
            i = rect.bottom;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt != null && childAt != this.A0C && childAt != this.A09 && childAt != this.A0A && childAt != this.A03) {
                childAt.setPadding(0, 0, 0, i);
            }
        }
        int i3 = rect.bottom;
        int i4 = this.A00;
        if (i4 != i3 && c2644Gjy.A02 != 0) {
            int i5 = this.A02 + (i3 - i4);
            if (i5 < 0) {
                i5 = 0;
            }
            GOo.A0S(this).A0g(i5);
            this.A02 = i5;
            this.A00 = i3;
        }
        this.A01 = z ? resources.getDimensionPixelSize(2131165192) : 0;
        GOo.A0S(this).A0g(this.A02 + this.A01);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x003f, code lost:
    
        if (r302.A0E != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void A05(X.C2644Gjy r302, X.GVY r303) {
        /*
            r301 = this;
            r0 = r301
            com.facebook.auth.usersession.FbUserSession r0 = r0.A0E
            r304 = r0
            r0 = r301
            r1 = r304
            r2 = 99475(0x18493, float:1.39394E-40)
            java.lang.Object r0 = X.GOq.A0y(r0, r1, r2)
            X.JOS r0 = (X.JOS) r0
            X.GR1 r0 = (X.GR1) r0
            int r0 = r0.A03
            r1 = 2
            boolean r0 = X.AnonymousClass001.A1Q(r0, r1)
            r305 = r0
            r0 = 0
            r306 = r0
            r0 = 0
            r304 = r0
            r0 = r303
            r1 = 0
            if (r0 != r1) goto L2d
            java.lang.String r0 = "mDrawerBehavior"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0Q(r0)
            throw r0
        L2d:
            r0 = r305
            if (r0 != 0) goto L42
            r0 = r302
            boolean r0 = r0.A0E
            r305 = r0
            r0 = 2132410425(0x7f1a0039, float:2.0470227E38)
            r306 = r0
            r0 = r305
            if (r0 == 0) goto L47
        L42:
            r0 = 2132410426(0x7f1a003a, float:2.0470229E38)
            r306 = r0
        L47:
            r0 = r303
            r1 = r306
            r0.setBackgroundResource(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.rtc.incall.impl.active.drawer.ui.ActiveDrawerContainer.A05(X.Gjy, X.GVY):void");
    }

    public static final boolean A06(List list) {
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            GVY gvy = (GVY) it.next();
            if (gvy != null && gvy.A03.A04 != 0) {
                return true;
            }
        }
        return false;
    }

    public final void A0F(boolean z) {
        DrawerBehavior drawerBehavior;
        Gpi gpi = this.A04;
        if (gpi == null || (drawerBehavior = ((GVY) gpi).A03) == null) {
            return;
        }
        drawerBehavior.A0L.A02 = z;
        drawerBehavior.A0M.A02 = z;
    }

    /* JADX WARN: Type inference failed for: r0v214, types: [X.Gpj, android.view.View, X.GVY] */
    /* JADX WARN: Type inference failed for: r0v310, types: [android.widget.TextView, com.facebook.resources.ui.FbTextView] */
    @Override // X.JFq
    public /* bridge */ /* synthetic */ void CfQ(JDB jdb) {
        GVY gvy;
        View view;
        View view2;
        Runnable j0f;
        DrawerBehavior drawerBehavior;
        int i;
        DrawerBehavior drawerBehavior2;
        int i2;
        DrawerBehavior drawerBehavior3;
        DrawerBehavior drawerBehavior4;
        DrawerBehavior drawerBehavior5;
        int i3;
        int i4;
        int dimensionPixelSize;
        DrawerBehavior drawerBehavior6;
        JOL A05;
        JOL A052;
        C2644Gjy c2644Gjy = (C2644Gjy) jdb;
        11T.A0F(c2644Gjy, 0);
        A04(c2644Gjy);
        1Br r0 = this.A0J;
        1Br.A0B(r0);
        JOL jol = c2644Gjy.A05;
        View view3 = this.A08;
        if ((view3 == null || (A052 = view3.A05()) == null || (jol != null && A052.getType() != jol.getType())) && (gvy = this.A04) != null && view3 != gvy) {
            if (view3 != null) {
                removeView(view3);
            }
            if (gvy.getParent() == null) {
                addView(gvy);
            }
            A04(c2644Gjy);
            A05(c2644Gjy, gvy);
        }
        GVY gvy2 = this.A08;
        if ((gvy2 == null || (A05 = gvy2.A05()) == null || (jol != null && A05.getType() != jol.getType())) && ((I3N) 1Br.A0B(this.A0L)).A01() && (view = this.A07) != null && (view2 = this.A08) != view) {
            if (view2 != null) {
                removeView(view2);
            }
            if (view.getParent() == null) {
                addView(view);
            }
            A04(c2644Gjy);
            A05(c2644Gjy, view);
        }
        1Br.A0B(r0);
        if (jol == null || !jol.BT9()) {
            Gpi gpi = this.A04;
            if ((gpi == null || (drawerBehavior5 = ((GVY) gpi).A03) == null || drawerBehavior5.A04 != 0) && jol == null && gpi != null) {
                gpi.A06();
            }
            1Br.A0B(r0);
            if (jol == null || !jol.BT8()) {
                Gpj gpj = this.A05;
                if (gpj != null && (((drawerBehavior3 = ((GVY) gpj).A03) == null || drawerBehavior3.A04 != 0) && jol == null)) {
                    gpj.A06();
                }
                GVY gvy3 = this.A08;
                if (gvy3 != null && (drawerBehavior2 = gvy3.A03) != null && (((i2 = drawerBehavior2.A04) == 3 || i2 == 0) && gvy3.A05() == jol)) {
                    1Br.A0B(r0);
                }
                GVY gvy4 = this.A08;
                if (jol != (gvy4 != null ? gvy4.A05() : null)) {
                    if (gvy4 != null && (drawerBehavior = gvy4.A03) != null && ((i = drawerBehavior.A04) == 4 || i == 1)) {
                        gvy4.A06();
                    }
                    if (jol != null && jol.getType() != 0) {
                        if (this.A08 != null) {
                            1Br.A0B(r0);
                        }
                        float f = 0.0f / 0.0f;
                        5WH r02 = new 5WH(-1, -1);
                        DrawerBehavior A01 = A01(r02, this.A0O);
                        Context context = getContext();
                        GVY gvy5 = new GVY(context, jol, A01);
                        this.A08 = gvy5;
                        11T.A0D(context);
                        gvy5.A01.addView(jol.Az5(context));
                        addView(this.A08, (ViewGroup.LayoutParams) r02);
                        A04(c2644Gjy);
                        GVY gvy6 = this.A08;
                        11T.A0I(gvy6, "null cannot be cast to non-null type com.facebook.messaging.rtc.incall.impl.active.drawer.ui.sheet.ActiveDrawerSheet");
                        A05(c2644Gjy, gvy6);
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestLayout();
                        }
                        j0f = new J0f(context, this, A01);
                        post(j0f);
                    }
                } else if (gvy4 != null) {
                    if (gvy4.getParent() == null) {
                        addView(this.A08);
                    }
                    GVY gvy7 = this.A08;
                    11T.A0I(gvy7, "null cannot be cast to non-null type com.facebook.messaging.rtc.incall.impl.active.drawer.ui.sheet.ActiveDrawerSheet");
                    A05(c2644Gjy, gvy7);
                }
            } else {
                if (this.A05 == null) {
                    5WH r03 = new 5WH(-1, -1);
                    Context A08 = 4YU.A08(this);
                    ?? gvy8 = new GVY(A08, (JOL) null, A01(r03, this.A0M));
                    AyG ayG = new AyG(A08);
                    gvy8.A00 = ayG;
                    ayG.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
                    ((GVY) gvy8).A01.addView(gvy8.A00);
                    this.A05 = gvy8;
                    gvy8.setLayoutParams(r03);
                }
                View view4 = this.A08;
                if (view4 != this.A05) {
                    if (view4 != null) {
                        removeView(view4);
                    }
                    GVY gvy9 = this.A05;
                    if (gvy9 == null || gvy9.getParent() == null) {
                        addView(this.A05);
                    }
                    A04(c2644Gjy);
                    GVY gvy10 = this.A05;
                    11T.A0I(gvy10, "null cannot be cast to non-null type com.facebook.messaging.rtc.incall.impl.active.drawer.ui.sheet.ActiveDrawerSheet");
                    A05(c2644Gjy, gvy10);
                }
                Gpj gpj2 = this.A05;
                if (gpj2 != null && (drawerBehavior4 = ((GVY) gpj2).A03) != null && drawerBehavior4.A04 == 0) {
                    j0f = new IrR(drawerBehavior4);
                    post(j0f);
                }
            }
        } else {
            Gpi gpi2 = this.A04;
            if (gpi2 != null && (drawerBehavior6 = ((GVY) gpi2).A03) != null && drawerBehavior6.A04 == 0) {
                j0f = new IrS(drawerBehavior6);
                post(j0f);
            }
        }
        if (c2644Gjy.A0B && c2644Gjy.A0A && this.A06 == null) {
            C06974ih c06974ih = GvO.A06;
            this.A06 = new GvO(4YU.A08(this));
            LinearLayout.LayoutParams A0M = DKE.A0M();
            A0M.gravity = 48;
            GvO gvO = this.A06;
            if (gvO != null) {
                gvO.setLayoutParams(A0M);
            }
        }
        Iterator A1A = 1BK.A1A(this.A0P);
        while (A1A.hasNext()) {
            ((View) A1A.next()).setVisibility(8);
        }
        int i5 = c2644Gjy.A03;
        if (i5 != 0 && (i5 == 1 || i5 == 3 || c2644Gjy.A02 == 0)) {
            int childCount = getChildCount() - 1;
            while (true) {
                int i6 = childCount;
                float f2 = 0.0f / 0.0f;
                if (-1 >= i6) {
                    break;
                }
                View childAt = getChildAt(i6);
                if (childAt instanceof GVY) {
                    GVY gvy11 = (GVY) childAt;
                    DrawerBehavior drawerBehavior7 = gvy11.A03;
                    11T.A0A(drawerBehavior7);
                    JOL A053 = gvy11.A05();
                    if (drawerBehavior7.A0D && (jol == null || ((A053 != jol && (A053 == null || ((!A053.BT9() || !jol.BT9()) && (!A053.BT8() || !jol.BT8())))) || i5 == 1))) {
                        int i7 = drawerBehavior7.A04;
                        if (i7 == 4 || i7 == 3 || i7 == 1) {
                            drawerBehavior7.A05(0);
                        }
                        if (i6 == 0) {
                            break;
                        }
                        if (A053 != null && A053 != jol && childAt == this.A08) {
                            GOo.A0S(this).A0i(A053, "none");
                        }
                    }
                }
                childCount = i6 - 1;
            }
        }
        A03(c2644Gjy);
        if (c2644Gjy.A08) {
            if (this.A09 == null) {
                this.A09 = new ParticipantOverflowPill(getContext());
                ViewGroup A00 = A00();
                float f3 = 0.0f / 0.0f;
                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                marginLayoutParams.bottomMargin = GOq.A08(this);
                A00.addView(this.A09, marginLayoutParams);
            }
            ParticipantOverflowPill participantOverflowPill = this.A09;
            if (participantOverflowPill != null) {
                participantOverflowPill.setVisibility(0);
            }
            ParticipantOverflowPill participantOverflowPill2 = this.A09;
            if (participantOverflowPill2 != null) {
                participantOverflowPill2.setAlpha(c2644Gjy.A00);
            }
            ParticipantOverflowPill participantOverflowPill3 = this.A09;
            if (participantOverflowPill3 != null) {
                participantOverflowPill3.A02 = new IZA(this);
            }
        } else {
            DKG.A1J(this.A09);
        }
        boolean z = c2644Gjy.A07;
        ParticipantOverflowPillForScrollableGrid participantOverflowPillForScrollableGrid = this.A0A;
        if (z) {
            if (participantOverflowPillForScrollableGrid == null) {
                this.A0A = new ParticipantOverflowPillForScrollableGrid(getContext());
                ViewGroup A002 = A00();
                float f4 = 0.0f / 0.0f;
                ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(-2, -2);
                marginLayoutParams2.bottomMargin = GOq.A09(this);
                A002.addView(this.A0A, marginLayoutParams2);
            }
            participantOverflowPillForScrollableGrid = this.A0A;
            if (participantOverflowPillForScrollableGrid != null) {
                i3 = 0;
                participantOverflowPillForScrollableGrid.setVisibility(i3);
            }
        } else if (participantOverflowPillForScrollableGrid != null) {
            i3 = 4;
            participantOverflowPillForScrollableGrid.setVisibility(i3);
        }
        if (c2644Gjy.A09) {
            if (this.A03 == null) {
                this.A03 = 7zO.A0V(getContext());
                ViewGroup A003 = A00();
                float f5 = 0.0f / 0.0f;
                ViewGroup.MarginLayoutParams marginLayoutParams3 = new ViewGroup.MarginLayoutParams(-2, -2);
                marginLayoutParams3.bottomMargin = GOq.A08(this);
                A003.addView(this.A03, marginLayoutParams3);
            }
            LithoView lithoView = this.A03;
            if (lithoView != null) {
                lithoView.setVisibility(0);
            }
            LithoView lithoView2 = this.A03;
            if (lithoView2 != null) {
                lithoView2.setAlpha(c2644Gjy.A01);
            }
            LithoView lithoView3 = this.A03;
            if (lithoView3 != null) {
                C2671Gkn c2671Gkn = new C2671Gkn(lithoView3.A09, new Az6());
                MigColorScheme A0m = 7zQ.A0m(this.A0F);
                Az6 az6 = c2671Gkn.A01;
                az6.A01 = A0m;
                c2671Gkn.A02.set(0);
                az6.A00 = IKE.A00(this, ActionId.APP_DID_ENTER_BACKGROUND);
                lithoView3.A0y(c2671Gkn.A2V());
            }
        } else {
            DKG.A1J(this.A03);
        }
        ViewGroup.LayoutParams layoutParams = A00().getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams;
            if ((!c2644Gjy.A0A || this.A06 == null) && c2644Gjy.A02 != 0) {
                Resources resources = getResources();
                dimensionPixelSize = resources.getDimensionPixelSize(2132279298) + resources.getDimensionPixelSize(2132279413);
            } else {
                dimensionPixelSize = GOq.A08(this);
            }
            marginLayoutParams4.bottomMargin = dimensionPixelSize;
        }
        FbUserSession fbUserSession = this.A0E;
        Context A082 = 4YU.A08(this);
        GR1 A0s = GOn.A0s(A082, fbUserSession);
        GvO gvO2 = c2644Gjy.A0A ? this.A06 : null;
        int i8 = 0;
        if (gvO2 != null) {
            int height = gvO2.getHeight();
            C06974ih c06974ih2 = GvO.A06;
            i8 = height - A082.getResources().getDimensionPixelSize(2132279413);
            if (i8 < 0) {
                i8 = 0;
            }
        }
        GR1 gr1 = A0s;
        if (gr1.A01 != i8) {
            gr1.A01 = i8;
            Iterator A012 = GR1.A01(gr1);
            while (A012.hasNext()) {
                A012.next();
            }
            GR1.A03(gr1);
        }
        boolean z2 = c2644Gjy.A06;
        2OB r04 = this.A0B;
        if (z2) {
            if (r04 == null) {
                ?? fbTextView = new FbTextView(A082);
                this.A0B = fbTextView;
                fbTextView.setText(2131959309);
                2OB r05 = this.A0B;
                if (r05 != null) {
                    DKF.A11(A082, r05, 2132214253);
                }
                2OB r06 = this.A0B;
                if (r06 != null) {
                    r06.setTextSize(2, 12.0f);
                }
                2OB r07 = this.A0B;
                if (r07 != null) {
                    r07.setGravity(17);
                }
                int A09 = GOq.A09(this);
                2OB r08 = this.A0B;
                if (r08 != null) {
                    r08.setPadding(A09, A09, A09, A09);
                    return;
                }
                return;
            }
            i4 = 0;
        } else if (r04 == null) {
            return;
        } else {
            i4 = 8;
        }
        r04.setVisibility(i4);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        int A06 = 0FI.A06(254775322);
        super.onAttachedToWindow();
        FbUserSession fbUserSession = this.A0E;
        Context A08 = 4YU.A08(this);
        GR1 A0s = GOn.A0s(A08, fbUserSession);
        GR1 gr1 = A0s;
        gr1.A03 = GOq.A0A(this);
        Iterator A01 = GR1.A01(gr1);
        while (A01.hasNext()) {
            GpZ gpZ = (JLm) A01.next();
            if (gpZ instanceof GpZ) {
                GpZ gpZ2 = gpZ;
                if (3 - gpZ2.A00 == 0) {
                    GrV.A0I((GrV) gpZ2.A01);
                }
            }
        }
        GR1.A04(gr1);
        AbI.A1S(this, this.A0Q);
        A0s.A60(this.A0R);
        ((IMK) 1Lm.A05(A08, fbUserSession, 98492)).A09(this.A0T);
        0FI.A0C(1686329983, A06);
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        11T.A0F(configuration, 0);
        super.onConfigurationChanged(configuration);
        GrQ A0S = GOo.A0S(this);
        A0S.A0Z(GrQ.A00(A0S, Boolean.valueOf(GOq.A1M(4YU.A08(this))), null, null));
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        int A06 = 0FI.A06(493064023);
        FbUserSession fbUserSession = this.A0E;
        Context A08 = 4YU.A08(this);
        GOn.A0s(A08, fbUserSession).CeV(this.A0R);
        ((IMK) 1Lm.A05(A08, fbUserSession, 98492)).A0A(this.A0T);
        A03(null);
        if (this.A08 != null) {
            1Br.A0B(this.A0J);
        }
        AbI.A1X(this.A0Q);
        super.onDetachedFromWindow();
        0FI.A0C(-1370577344, A06);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        int A06 = 0FI.A06(1142179957);
        super.onSizeChanged(i, i2, i3, i4);
        GR1 gr1 = (GR1) 1Br.A0B(GOo.A0S(this).A03);
        if (gr1.A05 != i) {
            gr1.A05 = i;
            Iterator A01 = GR1.A01(gr1);
            while (A01.hasNext()) {
                A01.next();
            }
        }
        0FI.A0C(1772692553, A06);
    }
}
