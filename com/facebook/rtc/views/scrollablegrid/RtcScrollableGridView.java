package com.facebook.rtc.views.scrollablegrid;

import X.08D;
import X.08K;
import X.0FI;
import X.0ND;
import X.0NN;
import X.0Q8;
import X.11T;
import X.1BK;
import X.1Bn;
import X.1Br;
import X.1Bu;
import X.1Fj;
import X.1qP;
import X.2Qa;
import X.2Qb;
import X.2Qn;
import X.2Wo;
import X.2XA;
import X.2Xd;
import X.4YU;
import X.4zI;
import X.4zJ;
import X.8Lm;
import X.8Lu;
import X.9GG;
import X.AbG;
import X.AbL;
import X.AbR;
import X.AnonymousClass001;
import X.C00i;
import X.C00j;
import X.C0Ad;
import X.C15h;
import X.C2626GjK;
import X.C2628GjQ;
import X.C2630Gjf;
import X.C2631Gjg;
import X.C2632Gji;
import X.C2hw;
import X.C2hy;
import X.C2qv;
import X.C87p;
import X.DKC;
import X.DqJ;
import X.GOn;
import X.GOo;
import X.GOq;
import X.GTe;
import X.GWW;
import X.GWs;
import X.GXZ;
import X.GgB;
import X.Gpy;
import X.Gq8;
import X.Gz8;
import X.GzI;
import X.H5G;
import X.HFV;
import X.HFe;
import X.HL3;
import X.Hbw;
import X.Hkr;
import X.HpS;
import X.Ht3;
import X.IDw;
import X.IMH;
import X.IYv;
import X.ItL;
import X.J5u;
import X.JB5;
import X.JB6;
import X.JB7;
import X.JB8;
import X.JBV;
import X.JFk;
import X.JIi;
import X.JKR;
import X.JOM;
import X.LQM;
import X.Q2V;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.PathInterpolator;
import android.widget.ImageView;
import com.facebook.inject.FbInjector;
import com.facebook.rtc.views.omnigrid.GridLayoutInput;
import com.facebook.rtc.views.omnigrid.OmniGridLayoutManager;
import com.facebook.rtc.views.omnigrid.OmniGridRecyclerView;
import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* loaded from: RtcScrollableGridView.class */
public final class RtcScrollableGridView extends OmniGridRecyclerView implements JFk {
    public static final DqJ A0X = new DqJ(180, new PathInterpolator(0.2f, 0.12f, 0.0f, 1.0f), 2);
    public 08D A00;
    public C00i A01;
    public 8Lm A02;
    public JIi A03;
    public JKR A04;
    public GWs A05;
    public OmniGridLayoutManager A06;
    public GWW A07;
    public Map A08;
    public C15h A09;
    public C15h A0A;
    public C15h A0B;
    public C15h A0C;
    public C15h A0D;
    public C15h A0E;
    public long A0F;
    public GestureDetector A0G;
    public C00i A0H;
    public 8Lm A0I;
    public C15h A0J;
    public C15h A0K;
    public final 1Br A0L;
    public final HFe A0M;
    public final Runnable A0N;
    public final Function1 A0O;
    public final Function1 A0P;
    public final HFV A0Q;
    public final 1qP A0R;
    public final Ht3 A0S;
    public final 2Qn A0T;
    public final Function1 A0U;
    public final Function1 A0V;
    public final Function1 A0W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RtcScrollableGridView(Context context) {
        super(context, null, 0);
        11T.A0F(context, 1);
        this.A0L = GOo.A0L();
        this.A02 = 9GG.A01;
        08D A00 = new 08K().A00.A00();
        11T.A0A(A00);
        this.A00 = A00;
        this.A0U = JB6.A00;
        this.A0O = JB5.A00;
        this.A0P = JB8.A00;
        this.A0V = JB7.A00;
        this.A0W = new JBV(this, 19);
        this.A0S = new Gq8(this, 17);
        this.A0T = IYv.A00(this, 41);
        this.A0Q = new GgB(this, 4);
        this.A0R = new Gpy(this, 13);
        this.A0N = new ItL(this);
        this.A0M = new Gz8(this);
        A03();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RtcScrollableGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        11T.A0F(context, 1);
        this.A0L = GOo.A0L();
        this.A02 = 9GG.A01;
        08D A00 = new 08K().A00.A00();
        11T.A0A(A00);
        this.A00 = A00;
        this.A0U = JB6.A00;
        this.A0O = JB5.A00;
        this.A0P = JB8.A00;
        this.A0V = JB7.A00;
        this.A0W = new JBV(this, 19);
        this.A0S = new Gq8(this, 17);
        this.A0T = IYv.A00(this, 41);
        this.A0Q = new GgB(this, 4);
        this.A0R = new Gpy(this, 13);
        this.A0N = new ItL(this);
        this.A0M = new Gz8(this);
        A03();
    }

    private final float A00(int i) {
        OmniGridLayoutManager omniGridLayoutManager = this.A06;
        if (omniGridLayoutManager != null) {
            List list = omniGridLayoutManager.A07.A09;
            if (i < 0 || i >= list.size()) {
                return 0.0f;
            }
            C2628GjQ c2628GjQ = (C2628GjQ) list.get(i);
            if (c2628GjQ.A05) {
                return 1.0f;
            }
            C2626GjK c2626GjK = c2628GjQ.A02;
            OmniGridLayoutManager omniGridLayoutManager2 = this.A06;
            if (omniGridLayoutManager2 != null) {
                return c2626GjK.A00(omniGridLayoutManager2.A1g());
            }
        }
        11T.A0L("omniGridLayoutManager");
        throw 0Q8.createAndThrow();
    }

    /* JADX WARN: Code restructure failed: missing block: B:243:0x0204, code lost:
    
        if (r0 != false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x0030, code lost:
    
        if (X.GOq.A1a(r0) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x018e, code lost:
    
        if (X.1Br.A06(((X.Hbw) r0.get()).A00).AZk(36314524015140878L) == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0344, code lost:
    
        if (r314 == r301.A0P) goto L142;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v339, types: [X.GjP] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final X.8Lu A01(boolean r302) {
        /*
            Method dump skipped, instructions count: 1564
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.rtc.views.scrollablegrid.RtcScrollableGridView.A01(boolean):X.8Lu");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0056, code lost:
    
        if (r310 == null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final com.facebook.rtc.views.omnigrid.GridLayoutInputItem A02(com.facebook.rtc.views.scrollablegrid.RtcScrollableGridView r301, int r302) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.rtc.views.scrollablegrid.RtcScrollableGridView.A02(com.facebook.rtc.views.scrollablegrid.RtcScrollableGridView, int):com.facebook.rtc.views.omnigrid.GridLayoutInputItem");
    }

    private final void A03() {
        OmniGridLayoutManager omniGridLayoutManager;
        C00j.A05("RtcScrollableGridView.init", 1908950651);
        try {
            this.A0H = 1Bu.A00(1036);
            this.A0D = J5u.A03(this, 85);
            this.A01 = 1Bu.A00(115704);
            this.A0K = J5u.A03(this, 86);
            this.A0J = J5u.A03(this, 87);
            this.A0A = J5u.A03(this, 88);
            this.A09 = J5u.A03(this, 89);
            this.A0B = J5u.A03(this, 90);
            this.A0C = J5u.A03(this, 91);
            this.A0E = J5u.A03(this, 92);
            setImportantForAccessibility(1);
            C15h c15h = this.A0A;
            if (c15h == null) {
                throw AnonymousClass001.A0N("Required value was null.");
            }
            String A00 = ((HpS) c15h.get()).A00();
            this.A0F = Long.parseLong(A00);
            C00i c00i = this.A01;
            if (c00i == null) {
                11T.A0L("participantViewCreator");
            } else {
                Hkr hkr = (Hkr) c00i.get();
                Context A08 = 4YU.A08(this);
                this.A03 = hkr.A00(A08, IDw.A01(this, "RtcScrollableGridView"), 1);
                C00i c00i2 = this.A0H;
                GWs gWs = null;
                if (c00i2 == null) {
                    11T.A0L("adapterProvider");
                } else {
                    AbR A0V = DKC.A0V(c00i2);
                    JIi jIi = this.A03;
                    if (jIi == null) {
                        11T.A0L("selfParticipantView");
                    } else {
                        Context A01 = FbInjector.A01();
                        AbL.A0y(A0V);
                        try {
                            GWW gww = new GWW(jIi, A00);
                            1Bn.A0K();
                            FbInjector.A04(A01);
                            this.A07 = gww;
                            11T.A0A(A08);
                            OmniGridLayoutManager omniGridLayoutManager2 = new OmniGridLayoutManager(A08, new JBV(this, 20));
                            this.A06 = omniGridLayoutManager2;
                            HFe hFe = this.A0M;
                            11T.A0F(hFe, 0);
                            omniGridLayoutManager2.A0F.add(hFe);
                            A0E(this, false, false);
                            omniGridLayoutManager = this.A06;
                        } catch (Throwable th) {
                            th = th;
                            1Bn.A0K();
                            FbInjector.A04(A01);
                        }
                        if (omniGridLayoutManager != null) {
                            A1D(omniGridLayoutManager);
                            C15h c15h2 = this.A0D;
                            if (c15h2 == null) {
                                th = 1BK.A0h();
                                throw th;
                            }
                            if (AbG.A1b(1Br.A06(((Hbw) c15h2.get()).A00), 36315387301864275L)) {
                                OmniGridLayoutManager omniGridLayoutManager3 = this.A06;
                                if (omniGridLayoutManager3 == null) {
                                    11T.A0L("omniGridLayoutManager");
                                } else {
                                    new GWs(omniGridLayoutManager3);
                                }
                            }
                            this.A05 = gWs;
                            C15h c15h3 = this.A0C;
                            if (c15h3 == null) {
                                throw 1BK.A0h();
                            }
                            A1A(GOq.A1a(c15h3) ? null : this.A05);
                            super.A0T = true;
                            this.A0G = new GestureDetector(A08, (GestureDetector.OnGestureListener) new GTe(this));
                            0ND.A00(this, new LQM(this, 0));
                            C00j.A01(572830605);
                            return;
                        }
                        11T.A0L("omniGridLayoutManager");
                    }
                }
            }
            th = 0Q8.createAndThrow();
            throw th;
        } catch (Throwable th2) {
            C00j.A01(-1178509797);
            throw th2;
        }
    }

    private final void A04() {
        8Lm r0;
        if (super.A01 > 0 || (r0 = this.A0I) == null) {
            return;
        }
        this.A0I = null;
        if (11T.A0O(this.A02, r0)) {
            return;
        }
        8Lm r02 = this.A02;
        this.A02 = r0;
        List list = (List) r0.A04;
        boolean z = false;
        if (list.isEmpty()) {
            4zI.A03.A05("RtcScrollableGridView", "New list of participants from ScrollableGridViewModel is empty. Clearing grid", new Object[0]);
        }
        2Xd r03 = this.A07;
        if (r03 == null) {
            11T.A0L("adapter");
            throw 0Q8.createAndThrow();
        }
        C00j.A05("RtcScrollableGridParticipantsAdapter.setParticipants", -814024574);
        try {
            if (!list.equals(((GWW) r03).A00)) {
                if (((GWW) r03).A00.isEmpty() || list.isEmpty()) {
                    ((GWW) r03).A00 = list;
                    r03.A07();
                } else {
                    C2hy A00 = C2hw.A00(new Q2V(((GWW) r03).A00, list), true);
                    ((GWW) r03).A00 = list;
                    A00.A02(r03);
                }
            }
            C00j.A01(-265861972);
            if (!C2qv.A01(r02.A05, r0.A05) || !C2qv.A01(r02.A06, r0.A06) || !C2qv.A01(r02.A01, r0.A01)) {
                z = true;
            }
            A0E(this, true, z);
        } catch (Throwable th) {
            C00j.A01(-1652737534);
            throw th;
        }
    }

    private final void A0B() {
        int A03;
        0Q8 A0h;
        C00j.A05("RtcScrollableGridView.maybeUpdateTileTransparency", -1306060068);
        try {
            OmniGridLayoutManager omniGridLayoutManager = this.A06;
            if (omniGridLayoutManager == null) {
                11T.A0L("omniGridLayoutManager");
            } else {
                ImmutableList immutableList = omniGridLayoutManager.A09;
                if (immutableList.isEmpty()) {
                    A03 = -1;
                } else {
                    Object A0r = 1BK.A0r(immutableList);
                    11T.A0A(A0r);
                    A03 = AnonymousClass001.A03(A0r);
                }
                OmniGridLayoutManager omniGridLayoutManager2 = this.A06;
                if (omniGridLayoutManager2 != null) {
                    ImmutableList immutableList2 = omniGridLayoutManager2.A09;
                    int A032 = immutableList2.isEmpty() ? -1 : AnonymousClass001.A03(4YU.A0q(immutableList2, DKC.A06(immutableList2)));
                    boolean A0G = A0G();
                    if (A03 <= A032) {
                        while (true) {
                            GXZ A0j = A0j(A03, false);
                            if (A0j != null) {
                                View view = A0j.A0I;
                                11T.A09(view);
                                if (view.getVisibility() == 0 && view.getParent() != null && !(A0j instanceof GzI)) {
                                    float f = 1.0f;
                                    if (A0G) {
                                        int i = A0j.A05;
                                        float f2 = 0.0f / 0.0f;
                                        if (i == -1) {
                                            i = A0j.A04;
                                        }
                                        float A00 = A00(i);
                                        if (A00 < 0.5d) {
                                            float f3 = (A00 * 1.4f) + 0.3f;
                                            if (f3 < 0.3f) {
                                                f = 0.3f;
                                            } else if (f3 <= 1.0f) {
                                                f = f3;
                                            }
                                        }
                                    }
                                    H5G h5g = (H5G) A0j.A00;
                                    if (f < 0.0f) {
                                        f = 0.0f;
                                    } else if (f > 1.0f) {
                                        f = 1.0f;
                                    }
                                    2Wo r0 = h5g.A09;
                                    if (r0 == null) {
                                        A0h = 1BK.A0h();
                                        break;
                                    }
                                    int i2 = 0;
                                    if (f != 1.0f || r0.A00 != null) {
                                        ImageView imageView = (ImageView) r0.A01();
                                        if (f == 1.0f) {
                                            i2 = 4;
                                        } else {
                                            imageView.setAlpha(1.0f - f);
                                        }
                                        imageView.setVisibility(i2);
                                    }
                                }
                            }
                            if (A03 == A032) {
                                break;
                            } else {
                                A03++;
                            }
                        }
                    }
                    C00j.A01(-416695771);
                    return;
                }
                11T.A0L("omniGridLayoutManager");
            }
            A0h = 0Q8.createAndThrow();
            throw A0h;
        } catch (Throwable th) {
            C00j.A01(266179482);
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x012b, code lost:
    
        if (X.GOq.A1a(r0) == false) goto L67;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void A0C(int r302) {
        /*
            Method dump skipped, instructions count: 391
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.rtc.views.scrollablegrid.RtcScrollableGridView.A0C(int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x00c6, code lost:
    
        if (r301.A0G() == false) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A0D(com.facebook.rtc.views.scrollablegrid.RtcScrollableGridView r301) {
        /*
            Method dump skipped, instructions count: 370
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.rtc.views.scrollablegrid.RtcScrollableGridView.A0D(com.facebook.rtc.views.scrollablegrid.RtcScrollableGridView):void");
    }

    public static final void A0E(RtcScrollableGridView rtcScrollableGridView, boolean z, boolean z2) {
        C00j.A05("RtcScrollableGridView.updateLayoutStrategy", -253133354);
        try {
            OmniGridLayoutManager omniGridLayoutManager = rtcScrollableGridView.A06;
            if (omniGridLayoutManager == null) {
                11T.A0L("omniGridLayoutManager");
                throw 0Q8.createAndThrow();
            }
            8Lu A01 = rtcScrollableGridView.A01(((C87p) rtcScrollableGridView.A02.A03).A00);
            if (z2 || !A01.equals(omniGridLayoutManager.A06)) {
                omniGridLayoutManager.A06 = A01;
                omniGridLayoutManager.A0e();
                if (z) {
                    ((2XA) omniGridLayoutManager).A0F = true;
                }
            }
            C00j.A01(-1831306472);
        } catch (Throwable th) {
            C00j.A01(1876453609);
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0054, code lost:
    
        if (X.GOp.A0c(r0).A02 == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x019d, code lost:
    
        if (r0 == X.0S2.A0C) goto L74;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void A0F(boolean r302) {
        /*
            Method dump skipped, instructions count: 974
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.rtc.views.scrollablegrid.RtcScrollableGridView.A0F(boolean):void");
    }

    private final boolean A0G() {
        int width = getWidth();
        int height = getHeight();
        boolean z = false;
        if (width != 0 && height != 0) {
            OmniGridLayoutManager omniGridLayoutManager = this.A06;
            if (omniGridLayoutManager == null) {
                11T.A0L("omniGridLayoutManager");
                throw 0Q8.createAndThrow();
            }
            C2632Gji c2632Gji = omniGridLayoutManager.A07;
            if (c2632Gji.A03 > width || c2632Gji.A02 > height) {
                z = true;
            }
        }
        return z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void A0t(int i) {
        JKR jkr;
        if (i != 0 || (jkr = this.A04) == null) {
            return;
        }
        jkr.CAs();
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void A10(int i, int i2) {
        if (!A0G() || i2 == 0) {
            return;
        }
        A0F(true);
        A0B();
    }

    public final void A1N(8Lm r302) {
        C00j.A05("RtcScrollableGridView.maybeUpdateScrollableGridViewModel", 1382628477);
        try {
            this.A0I = r302;
            A04();
            C00j.A01(1426337899);
        } catch (Throwable th) {
            C00j.A01(-2135768035);
            throw th;
        }
    }

    @Override // X.JFk
    public C2630Gjf ADL() {
        if (this.A02 == null) {
            return null;
        }
        GWW gww = this.A07;
        if (gww != null) {
            if (gww.A00.size() == 0) {
                return null;
            }
            OmniGridLayoutManager omniGridLayoutManager = this.A06;
            if (omniGridLayoutManager == null) {
                11T.A0L("omniGridLayoutManager");
                throw 0Q8.createAndThrow();
            }
            C2632Gji c2632Gji = omniGridLayoutManager.A07;
            Object obj = omniGridLayoutManager.A06.A01;
            Function1 function1 = this.A0P;
            if (obj != function1 || c2632Gji.A03 == 0 || c2632Gji.A02 == 0) {
                8Lu A01 = A01(true);
                ImmutableList.Builder A0h = 4YU.A0h();
                GWW gww2 = this.A07;
                if (gww2 != null) {
                    int size = gww2.A00.size();
                    for (int i = 0; i < size; i++) {
                        A0h.m11011add((Object) A02(this, i));
                    }
                    GridLayoutInput gridLayoutInput = new GridLayoutInput(1Fj.A01(A0h), ((C2631Gjg) A01.A00).A01(4YU.A08(this)), 1000, 1000);
                    c2632Gji = (C2632Gji) function1.invoke(gridLayoutInput);
                    4zJ r0 = 4zI.A03;
                    StringBuilder A0k = AnonymousClass001.A0k();
                    A0k.append("Computed grid layout for pip aspect ratio calculation, input: ");
                    A0k.append(gridLayoutInput);
                    r0.A05("RtcScrollableGridView", AnonymousClass001.A0Z(c2632Gji, " output: ", A0k), new Object[0]);
                }
            }
            Rect A0C = DKC.A0C();
            HL3.A00(A0C, c2632Gji);
            return new C2630Gjf(A0C.width(), A0C.height(), 6);
        }
        11T.A0L("adapter");
        throw 0Q8.createAndThrow();
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        IllegalStateException A0N;
        int i;
        int A06 = 0FI.A06(-945548694);
        super.onAttachedToWindow();
        C15h c15h = this.A0B;
        if (c15h != null) {
            ((JOM) c15h.get()).A62(this.A0S);
            C15h c15h2 = this.A0C;
            if (c15h2 != null) {
                ((2Qa) c15h2.get()).A02(this.A0T);
                C15h c15h3 = this.A0C;
                if (c15h3 != null) {
                    ((2Qa) c15h3.get()).A01 = this;
                    C15h c15h4 = this.A0K;
                    if (c15h4 != null) {
                        ((IMH) c15h4.get()).A02(this.A0Q);
                        C15h c15h5 = this.A0E;
                        if (c15h5 != null) {
                            GOn.A1V((2Qb) c15h5.get(), this.A0R);
                            08D A00 = 0NN.A00(this);
                            if (A00 == null) {
                                A00 = new 08K().A00.A00();
                            }
                            C0Ad.A04(this, A00);
                            A0E(this, false, false);
                            0FI.A0C(-2119435848, A06);
                            return;
                        }
                        A0N = AnonymousClass001.A0N("Required value was null.");
                        i = -1355261385;
                    } else {
                        A0N = AnonymousClass001.A0N("Required value was null.");
                        i = -106624182;
                    }
                } else {
                    A0N = AnonymousClass001.A0N("Required value was null.");
                    i = -2038678368;
                }
            } else {
                A0N = AnonymousClass001.A0N("Required value was null.");
                i = -601373150;
            }
        } else {
            A0N = AnonymousClass001.A0N("Required value was null.");
            i = 402028350;
        }
        0FI.A0C(i, A06);
        throw A0N;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        11T.A0F(configuration, 0);
        super.onConfigurationChanged(configuration);
        OmniGridLayoutManager omniGridLayoutManager = this.A06;
        if (omniGridLayoutManager == null) {
            11T.A0L("omniGridLayoutManager");
            throw 0Q8.createAndThrow();
        }
        omniGridLayoutManager.A1h();
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IllegalStateException A0N;
        int i;
        int A06 = 0FI.A06(1749606425);
        C15h c15h = this.A0B;
        if (c15h != null) {
            ((JOM) c15h.get()).CeX(this.A0S);
            C15h c15h2 = this.A0C;
            if (c15h2 != null) {
                ((2Qa) c15h2.get()).A03(this.A0T);
                C15h c15h3 = this.A0C;
                if (c15h3 != null) {
                    ((2Qa) c15h3.get()).A01 = null;
                    C15h c15h4 = this.A0K;
                    if (c15h4 != null) {
                        ((IMH) c15h4.get()).A03(this.A0Q);
                        C15h c15h5 = this.A0E;
                        if (c15h5 != null) {
                            ((2Qb) c15h5.get()).A0V.remove(this.A0R);
                            super.onDetachedFromWindow();
                            0FI.A0C(-602621303, A06);
                            return;
                        }
                        A0N = AnonymousClass001.A0N("Required value was null.");
                        i = -459786213;
                    } else {
                        A0N = AnonymousClass001.A0N("Required value was null.");
                        i = -918917356;
                    }
                } else {
                    A0N = AnonymousClass001.A0N("Required value was null.");
                    i = -1294177215;
                }
            } else {
                A0N = AnonymousClass001.A0N("Required value was null.");
                i = 1953390024;
            }
        } else {
            A0N = AnonymousClass001.A0N("Required value was null.");
            i = 810151825;
        }
        0FI.A0C(i, A06);
        throw A0N;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        A04();
        removeCallbacks(this.A0N);
        A0D(this);
    }

    @Override // com.facebook.rtc.views.omnigrid.OmniGridRecyclerView, androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int A05 = 0FI.A05(-294037817);
        11T.A0F(motionEvent, 0);
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (!A0G()) {
            0FI.A0B(-615927265, A05);
            return false;
        }
        GestureDetector gestureDetector = this.A0G;
        if (gestureDetector == null) {
            11T.A0L("singleTapGestureDetector");
            throw 0Q8.createAndThrow();
        }
        gestureDetector.onTouchEvent(motionEvent);
        0FI.A0B(1561583267, A05);
        return onTouchEvent;
    }
}
