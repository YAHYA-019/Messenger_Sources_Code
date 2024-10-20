package com.facebook.messaging.media.swipeablemediatray;

import X.06Z;
import X.0Q8;
import X.0S2;
import X.11T;
import X.1BL;
import X.1BY;
import X.1Bi;
import X.1Bn;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.1EK;
import X.1iG;
import X.2OB;
import X.3yK;
import X.4YU;
import X.5zD;
import X.7Tb;
import X.7zP;
import X.7zR;
import X.8Th;
import X.AbG;
import X.AbH;
import X.AbL;
import X.AbstractC2326GOr;
import X.AnonymousClass001;
import X.AnonymousClass018;
import X.C00i;
import X.C09s;
import X.C1F6;
import X.C1u3;
import X.C1uz;
import X.C2121Dea;
import X.C5ic;
import X.C5ye;
import X.C8nq;
import X.C9ng;
import X.DKC;
import X.DKE;
import X.DKS;
import X.DMV;
import X.GOo;
import X.GWj;
import X.H4t;
import X.HLK;
import X.HRy;
import X.HRz;
import X.HS0;
import X.HaW;
import X.HqP;
import X.Hqh;
import X.Hrv;
import X.I2P;
import X.IDF;
import X.IGS;
import X.IKE;
import X.IVO;
import X.JL5;
import X.JMn;
import X.JZj;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.fbui.widget.text.ImageWithTextView;
import com.facebook.fury.context.ReqContext;
import com.facebook.inject.FbInjector;
import com.facebook.litho.LithoView;
import com.facebook.messaging.composer.params.ComposerInitParamsSpec$ComposerLaunchSource;
import com.facebook.messaging.media.folder.Folder;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.mig.scheme.schemes.LightColorScheme;
import com.facebook.resources.ui.FbLinearLayout;
import com.facebook.widget.CustomFrameLayout;
import com.facebook.xapp.messaging.threadview.theme.custom.model.ThreadThemeInfo;
import com.mapbox.mapboxsdk.R;

/* loaded from: SwipeableMediaTrayContainerView.class */
public class SwipeableMediaTrayContainerView extends CustomFrameLayout {
    public int A00;
    public 06Z A01;
    public ComposerInitParamsSpec$ComposerLaunchSource A02;
    public 5zD A03;
    public JL5 A04;
    public HqP A05;
    public IDF A06;
    public JMn A07;
    public H4t A08;
    public GWj A09;
    public ThreadKey A0A;
    public String A0B;
    public int A0C;
    public ViewGroup A0D;
    public MigColorScheme A0E;
    public final 1Br A0F;
    public final 1Br A0G;
    public final 1Br A0H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwipeableMediaTrayContainerView(Context context) {
        super(context);
        11T.A0F(context, 1);
        this.A0G = 1Bq.A00(115999);
        this.A0H = 1Bu.A00(66207);
        this.A0F = 1Bu.A00(85056);
        this.A0E = LightColorScheme.A00();
        this.A02 = ComposerInitParamsSpec$ComposerLaunchSource.A06;
        A00();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwipeableMediaTrayContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        11T.A0F(context, 1);
        this.A0G = 1Bq.A00(115999);
        this.A0H = 1Bu.A00(66207);
        this.A0F = 1Bu.A00(85056);
        this.A0E = LightColorScheme.A00();
        this.A02 = ComposerInitParamsSpec$ComposerLaunchSource.A06;
        A00();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwipeableMediaTrayContainerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        11T.A0F(context, 1);
        this.A0G = 1Bq.A00(115999);
        this.A0H = 1Bu.A00(66207);
        this.A0F = 1Bu.A00(85056);
        this.A0E = LightColorScheme.A00();
        this.A02 = ComposerInitParamsSpec$ComposerLaunchSource.A06;
        A00();
    }

    private final void A00() {
        Context A08 = 4YU.A08(this);
        this.A09 = (GWj) 1Bn.A0E(A08, (1BY) null, 116005);
        C1F6 A0F = AbG.A0F(652);
        A0U(2132543424);
        Context A01 = FbInjector.A01();
        AbL.A0y(A0F);
        try {
            IDF idf = new IDF(this);
            1Bn.A0K();
            FbInjector.A04(A01);
            this.A06 = idf;
            String str = "swipeableMediaTrayHeaderController";
            idf.A01 = new HRz(this);
            ((1iG) 1Bi.A03(66389)).A00();
            this.A0E = 7zR.A0c(A08);
            C1F6 c1f6 = (C1F6) 1Bn.A0E(A08, (1BY) null, 651);
            A01 = FbInjector.A01();
            AbL.A0y(c1f6);
            try {
                HqP hqP = new HqP(this, AbG.A0H(c1f6));
                1Bn.A0K();
                FbInjector.A04(A01);
                this.A05 = hqP;
                hqP.A00 = new HRy(this);
                this.A0D = (ViewGroup) C09s.A01(this, 2131367784);
                HS0 hs0 = new HS0(this);
                GWj gWj = this.A09;
                if (gWj == null) {
                    str = "swipeableMediaTrayPickerGridAdapter";
                } else {
                    IDF idf2 = this.A06;
                    if (idf2 != null) {
                        HqP hqP2 = this.A05;
                        if (hqP2 == null) {
                            str = "folderController";
                        } else {
                            this.A08 = new H4t(A08, hs0, hqP2, idf2, gWj);
                            ViewGroup viewGroup = this.A0D;
                            if (viewGroup == null) {
                                str = "swipeableMediaTrayMediaGalleryContainer";
                            } else {
                                viewGroup.addView(A0V(), 0);
                                A02(this);
                                IDF idf3 = this.A06;
                                if (idf3 != null) {
                                    String string = A08.getResources().getString(2131966646);
                                    if (string == null) {
                                        string = DKE.A0r(idf3.A0B, 2131966646);
                                    }
                                    idf3.A05 = string;
                                    idf3.A04 = 0S2.A00;
                                    IDF.A03(idf3);
                                    A04(this, this.A0E);
                                    return;
                                }
                            }
                        }
                    }
                }
                11T.A0L(str);
                throw 0Q8.createAndThrow();
            } finally {
            }
        } finally {
        }
    }

    public static final void A01(Folder folder, SwipeableMediaTrayContainerView swipeableMediaTrayContainerView, boolean z) {
        H4t A0V = swipeableMediaTrayContainerView.A0V();
        if (!11T.A0O(A0V.A0B, folder)) {
            A0V.A0B = folder;
            A0V.A0x.A08 = AnonymousClass001.A1T(folder);
            if (z) {
                A0V.A0V();
            }
        }
        HqP hqP = A0V.A0D;
        if (hqP != null) {
            IVO.A02(hqP.A06);
        }
        RecyclerView recyclerView = A0V.A03;
        if (recyclerView == null) {
            11T.A0L("recyclerView");
            throw 0Q8.createAndThrow();
        }
        recyclerView.A0w(0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0121, code lost:
    
        if (r0.A01(r0, r0.A0J) != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01b1, code lost:
    
        if (r301.A0V().A0O == X.0S2.A01) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A02(com.facebook.messaging.media.swipeablemediatray.SwipeableMediaTrayContainerView r301) {
        /*
            Method dump skipped, instructions count: 453
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.media.swipeablemediatray.SwipeableMediaTrayContainerView.A02(com.facebook.messaging.media.swipeablemediatray.SwipeableMediaTrayContainerView):void");
    }

    /* JADX WARN: Type inference failed for: r0v42, types: [android.widget.TextView, com.facebook.fbui.widget.text.ImageWithTextView] */
    public static final void A03(SwipeableMediaTrayContainerView swipeableMediaTrayContainerView) {
        String str;
        int i;
        if (swipeableMediaTrayContainerView.A0A != null) {
            5zD r0 = swipeableMediaTrayContainerView.A03;
            ThreadThemeInfo threadThemeInfo = null;
            if (r0 != null) {
                threadThemeInfo = r0.BEz();
            }
            int A04 = ((C5ye) 1Br.A0B(swipeableMediaTrayContainerView.A0H)).A04(swipeableMediaTrayContainerView.A0E, threadThemeInfo);
            IDF idf = swipeableMediaTrayContainerView.A06;
            if (idf == null) {
                str = "swipeableMediaTrayHeaderController";
            } else {
                idf.A0J.setColorFilter(A04);
                idf.A0I.setColorFilter(A04);
                idf.A00 = A04;
                HqP hqP = swipeableMediaTrayContainerView.A05;
                if (hqP == null) {
                    str = "folderController";
                } else {
                    hqP.A07.setColorFilter(A04);
                    H4t A0V = swipeableMediaTrayContainerView.A0V();
                    C00i c00i = A0V.A0t.A00;
                    C5ye c5ye = (C5ye) c00i.get();
                    MigColorScheme migColorScheme = A0V.A0K;
                    if (migColorScheme == null) {
                        str = "colorScheme";
                    } else {
                        int A03 = c5ye.A03(migColorScheme, threadThemeInfo);
                        ?? r02 = A0V.A07;
                        str = "noMediaView";
                        if (r02 != 0) {
                            r02.setTextColor(A03);
                            Drawable drawable = r02.A05;
                            if (drawable != null) {
                                drawable.setColorFilter(A03, PorterDuff.Mode.SRC_IN);
                            }
                            c00i.get();
                            if (threadThemeInfo != null && (i = threadThemeInfo.A0K) != 0) {
                                A03 = i;
                            }
                            A0V.A0x.A07 = Integer.valueOf(A03);
                            HaW haW = A0V.A0G;
                            if (haW != null) {
                                Hqh hqh = haW.A01;
                                hqh.A00 = A03;
                                if (A03 != 0) {
                                    hqh.A04 = new 3yK(A03, A03);
                                    return;
                                }
                                return;
                            }
                            str = "gridOverlayController";
                        }
                    }
                }
            }
            11T.A0L(str);
            throw 0Q8.createAndThrow();
        }
    }

    /* JADX WARN: Type inference failed for: r0v21, types: [android.widget.TextView, android.view.View, com.facebook.fbui.widget.text.ImageWithTextView] */
    public static final void A04(SwipeableMediaTrayContainerView swipeableMediaTrayContainerView, MigColorScheme migColorScheme) {
        11T.A0F(migColorScheme, 0);
        swipeableMediaTrayContainerView.A0E = migColorScheme;
        H4t A0V = swipeableMediaTrayContainerView.A0V();
        String str = "colorScheme";
        A0V.A0K = migColorScheme;
        A0V.A0x.A04 = migColorScheme;
        int BDl = migColorScheme.BDl();
        RecyclerView recyclerView = A0V.A03;
        if (recyclerView != null) {
            AbH.A1K(recyclerView, BDl);
            2OB r0 = A0V.A06;
            String str2 = "errorView";
            if (r0 != null) {
                AbH.A1K(r0, BDl);
                ?? r02 = A0V.A07;
                str2 = "noMediaView";
                if (r02 != 0) {
                    AbH.A1K((View) r02, BDl);
                    FbLinearLayout fbLinearLayout = A0V.A0L;
                    if (fbLinearLayout == null) {
                        str = "noRollCallMediaView";
                    } else {
                        AbH.A1K(fbLinearLayout, BDl);
                        MigColorScheme migColorScheme2 = A0V.A0K;
                        if (migColorScheme2 != null) {
                            int B4i = migColorScheme2.B4i();
                            r0.setTextColor(B4i);
                            r02.setTextColor(B4i);
                            boolean A02 = ((C1uz) 1Br.A0B(A0V.A0Y)).A02(37);
                            if (!A02) {
                                DKC.A1K(GOo.A0A(A0V), (TextView) r02, 2131966651);
                            }
                            MigColorScheme migColorScheme3 = A0V.A0K;
                            if (migColorScheme3 != null) {
                                r0.setTextColor(migColorScheme3.BKg());
                                View view = A0V.A00;
                                if (view == null) {
                                    str2 = "loadingView";
                                } else {
                                    MigColorScheme migColorScheme4 = A0V.A0K;
                                    if (migColorScheme4 != null) {
                                        AbH.A1K(view, migColorScheme4.AmV());
                                        ImageWithTextView.A03(7zP.A0S(A0V.A0g).A08(A02 ? C1u3.A1K : C1u3.A4t, B4i), r02);
                                        r02.requestLayout();
                                        r02.invalidate();
                                        HaW haW = A0V.A0G;
                                        if (haW == null) {
                                            str2 = "gridOverlayController";
                                        } else {
                                            MigColorScheme migColorScheme5 = A0V.A0K;
                                            if (migColorScheme5 != null) {
                                                haW.A01.A05 = migColorScheme5;
                                                LithoView lithoView = (LithoView) C09s.A01(A0V, 2131367009);
                                                8Th A00 = C8nq.A00(lithoView.A09);
                                                MigColorScheme migColorScheme6 = A0V.A0K;
                                                if (migColorScheme6 != null) {
                                                    A00.A2Z(migColorScheme6);
                                                    A00.A2a(GOo.A0A(A0V).getString(2131956415));
                                                    A00.A2Y(IKE.A00(A0V, 63));
                                                    lithoView.A0y(A00.A2W());
                                                    H4t.A01(A0V);
                                                    HqP hqP = swipeableMediaTrayContainerView.A05;
                                                    if (hqP == null) {
                                                        str2 = "folderController";
                                                    } else {
                                                        MigColorScheme migColorScheme7 = swipeableMediaTrayContainerView.A0E;
                                                        11T.A0F(migColorScheme7, 0);
                                                        hqP.A01 = migColorScheme7;
                                                        hqP.A06.A05 = migColorScheme7;
                                                        IDF idf = swipeableMediaTrayContainerView.A06;
                                                        if (idf != null) {
                                                            MigColorScheme migColorScheme8 = swipeableMediaTrayContainerView.A0E;
                                                            11T.A0F(migColorScheme8, 0);
                                                            idf.A02 = migColorScheme8;
                                                            AbH.A1M(idf.A0M, migColorScheme8);
                                                            AbG.A1J(idf.A0L, idf.A02);
                                                            MigColorScheme.A00(idf.A0C, idf.A02);
                                                            return;
                                                        }
                                                        str2 = "swipeableMediaTrayHeaderController";
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            11T.A0L(str2);
            throw 0Q8.createAndThrow();
        }
        str = "recyclerView";
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    public final H4t A0V() {
        H4t h4t = this.A08;
        if (h4t != null) {
            return h4t;
        }
        11T.A0L("photoGalleryView");
        throw 0Q8.createAndThrow();
    }

    public final void A0W() {
        String str;
        1EK.A09("SwipeableMediaTrayContainerView", 641320986501951L);
        try {
            ReqContext A04 = AnonymousClass018.A04("SwipeableMediaTrayContainerView", 0);
            try {
                H4t A0V = A0V();
                A0V.A0u.AEC();
                H4t.A04(A0V, false);
                GWj gWj = A0V.A0x;
                gWj.A0H();
                JZj jZj = gWj.A02;
                if (jZj != null) {
                    jZj.dismiss();
                }
                RecyclerView recyclerView = A0V.A03;
                if (recyclerView == null) {
                    str = "recyclerView";
                } else {
                    recyclerView.A0w(0);
                    DMV dmv = A0V.A05;
                    if (dmv != null) {
                        dmv.dismiss();
                    }
                    HqP hqP = A0V.A0D;
                    if (hqP != null) {
                        IVO.A02(hqP.A06);
                    }
                    A0V.A0X(0S2.A00);
                    FbLinearLayout fbLinearLayout = A0V.A0L;
                    if (fbLinearLayout != null) {
                        fbLinearLayout.setVisibility(8);
                        A02(this);
                        A01(null, this, false);
                        String str2 = this.A0B;
                        if (str2 != null) {
                            AbstractC2326GOr.A1P(1Br.A02(((Hrv) 1Br.A0B(this.A0F)).A01), "msg_media_picker_did_close", str2);
                            this.A0B = null;
                            A0V().A0Q = null;
                        }
                        if (A04 != null) {
                            A04.close();
                        }
                        return;
                    }
                    str = "noRollCallMediaView";
                }
                11T.A0L(str);
                throw 0Q8.createAndThrow();
            } finally {
            }
        } finally {
            1EK.A03();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x0122, code lost:
    
        if (((X.1qI) X.1Br.A0B(r0.A0Z)).A0N(r0.A0I) == false) goto L62;
     */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02b0 A[Catch: all -> 0x0301, TRY_ENTER, TryCatch #1 {all -> 0x0301, blocks: (B:3:0x000e, B:144:0x02b0, B:145:0x02b7, B:173:0x02f9, B:175:0x0300, B:5:0x0014, B:8:0x001f, B:10:0x0025, B:12:0x002b, B:13:0x0030, B:14:0x0037, B:15:0x003e, B:18:0x004e, B:19:0x0053, B:20:0x0059, B:22:0x0066, B:24:0x006c, B:25:0x0071, B:29:0x007e, B:30:0x02dc, B:32:0x02ef, B:34:0x02e6, B:36:0x0084, B:37:0x0089, B:39:0x0093, B:41:0x009c, B:42:0x00a3, B:44:0x00aa, B:45:0x00ae, B:47:0x00bc, B:48:0x00c3, B:49:0x00cd, B:51:0x00d4, B:52:0x00db, B:54:0x00e2, B:57:0x00ec, B:60:0x00f8, B:61:0x00ff, B:62:0x0106, B:63:0x010d, B:65:0x0116, B:69:0x012c, B:72:0x0133, B:74:0x0138, B:77:0x0142, B:78:0x0149, B:79:0x0150, B:80:0x0157, B:81:0x015e, B:82:0x0164, B:83:0x016c, B:84:0x0173, B:86:0x017a, B:87:0x0181, B:89:0x0187, B:90:0x018e, B:91:0x0195, B:93:0x019d, B:94:0x01a3, B:96:0x01aa, B:97:0x01af, B:99:0x01c1, B:102:0x01ce, B:103:0x01d5, B:104:0x01dc, B:105:0x01e3, B:109:0x01f1, B:112:0x0206, B:116:0x0217, B:118:0x021e, B:122:0x022a, B:124:0x0231, B:127:0x023b, B:129:0x0246, B:130:0x024d, B:132:0x0286, B:136:0x0290, B:139:0x029c, B:140:0x02a3, B:142:0x02a8, B:148:0x0282, B:149:0x02cf, B:150:0x02d4, B:152:0x02c3, B:153:0x02bb, B:154:0x0259, B:158:0x0267, B:160:0x026d, B:164:0x0279, B:169:0x02f4), top: B:2:0x000e, inners: #0, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0X() {
        /*
            Method dump skipped, instructions count: 777
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.media.swipeablemediatray.SwipeableMediaTrayContainerView.A0X():void");
    }

    public final void A0Y(06Z r302) {
        this.A01 = r302;
        H4t A0V = A0V();
        1Br.A0C(A0V.A0s);
        I2P i2p = new I2P(A0V.getContext(), r302);
        A0V.A0H = i2p;
        ThreadKey threadKey = A0V.A0I;
        if (threadKey != null) {
            ThreadSummary threadSummary = A0V.A0J;
            i2p.A00 = threadKey;
            i2p.A01 = threadSummary;
        }
        A0V.A01 = r302;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x024a, code lost:
    
        if (X.C61c.A00(r0).AZr(r0, 36320790371909330L) == false) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x019a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0Z(com.facebook.auth.usersession.FbUserSession r302, com.facebook.messaging.model.threadkey.ThreadKey r303, com.facebook.messaging.model.threads.ThreadSummary r304) {
        /*
            Method dump skipped, instructions count: 607
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.media.swipeablemediatray.SwipeableMediaTrayContainerView.A0Z(com.facebook.auth.usersession.FbUserSession, com.facebook.messaging.model.threadkey.ThreadKey, com.facebook.messaging.model.threads.ThreadSummary):void");
    }

    public final boolean A0a() {
        JL5 jl5 = this.A04;
        if (jl5 == null || !jl5.ADW()) {
            return false;
        }
        H4t A0V = A0V();
        if (1BL.A0a(A0V.A0x.A0M).isEmpty()) {
            A0V().A0X(0S2.A00);
            jl5.A86();
            IDF idf = this.A06;
            if (idf == null) {
                11T.A0L("swipeableMediaTrayHeaderController");
                throw 0Q8.createAndThrow();
            }
            if (!idf.A0H.A00()) {
                return true;
            }
            idf.A06 = 7Tb.A01();
            return true;
        }
        C2121Dea A03 = ((C5ic) 1Br.A0B(A0V.A0f)).A03(4YU.A08(A0V));
        A03.A06(2131966638);
        A03.A05(2131966637);
        A03.A0D(new C9ng(2), 2131966635);
        A03.A0E(IGS.A00(A0V, 9), 2131966636);
        ((DKS) A03).A01.A0I = true;
        DMV A0I = A03.A0I();
        A0V.A05 = A0I;
        HLK.A00(A0I);
        return true;
    }

    @Override // com.facebook.widget.CustomFrameLayout, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getSize(i) != this.A00) {
            this.A00 = View.MeasureSpec.getSize(i);
        }
        if (View.MeasureSpec.getSize(i2) != this.A0C) {
            this.A0C = View.MeasureSpec.getSize(i2);
        }
        H4t A0V = A0V();
        int dimensionPixelSize = this.A00 / GOo.A0A(this).getDimensionPixelSize(R.dimen.mapbox_minimum_scale_span_when_rotating);
        if (dimensionPixelSize <= 0) {
            dimensionPixelSize = 3;
        }
        GridLayoutManager gridLayoutManager = A0V.A02;
        if (gridLayoutManager == null) {
            11T.A0L("layoutManager");
            throw 0Q8.createAndThrow();
        }
        gridLayoutManager.A1x(dimensionPixelSize);
    }
}
