package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.fbservice.ops.BlueServiceOperationFactory;
import com.facebook.inject.FbInjector;
import com.facebook.litho.LithoView;
import com.facebook.messaging.expandablecomponent.ExpandableBottomSheetContainer;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.mig.scheme.schemes.LightColorScheme;
import com.facebook.resources.ui.FbFrameLayout;
import com.facebook.resources.ui.FbImageButton;
import com.facebook.stickers.keyboardls.avatartab.plugins.core.tabs.AvatarTabImplementation;
import com.facebook.stickers.keyboardls.favoritesttab.plugins.plugins.core.tabs.FavoritesTabImplementation;
import com.facebook.stickers.keyboardls.generatedtab.plugins.core.tabs.GeneratedTabImplementation;
import com.facebook.stickers.keyboardls.recenttab.plugins.core.tabs.RecentTabImplementation;
import com.facebook.stickers.keyboardls.stickerpacktab.plugins.core.tabs.StickerPackTabsImplementation;
import com.facebook.widget.CustomViewPager;
import com.facebook.xapp.messaging.capability.vector.Capabilities;
import com.google.common.base.Objects;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.Gml, reason: case insensitive filesystem */
/* loaded from: Gml.class */
public final class C2736Gml extends H4B implements LifecycleObserver {
    public int A00;
    public 06Z A01;
    public LifecycleOwner A02;
    public LithoView A03;
    public ThreadKey A04;
    public MigColorScheme A05;
    public FbFrameLayout A06;
    public FbImageButton A07;
    public 53U A08;
    public JJ1 A09;
    public IaD A0A;
    public Hmt A0B;
    public CustomViewPager A0C;
    public Capabilities A0D;
    public ImmutableList A0E;
    public String A0F;
    public List A0G;
    public List A0H;
    public boolean A0I;
    public 1PA A0J;
    public 1PA A0K;
    public 1I7 A0L;
    public final 0PY A0M;
    public final C00i A0N;
    public final C00i A0O;
    public final C00i A0P;
    public final C00i A0Q;
    public final C00i A0R;
    public final C00i A0S;
    public final C00i A0T;
    public final C00i A0U;
    public final C2iw A0V;
    public final LithoView A0W;
    public final JGa A0X;
    public final JMq A0Y;
    public final java.util.Map A0Z;
    public final C00i A0a;
    public final C00i A0b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v113, types: [com.facebook.widget.CustomViewPager, androidx.viewpager.widget.ViewPager] */
    /* JADX WARN: Type inference failed for: r0v13, types: [X.2iw, java.lang.Object] */
    public C2736Gml(Context context, JGa jGa) {
        super(context, null, 0);
        69H r329;
        Context A01;
        boolean A1T;
        this.A0b = 1BQ.A00();
        this.A0Z = AnonymousClass001.A0u();
        Context context2 = getContext();
        this.A0W = new LithoView(context2, (AttributeSet) null);
        this.A0V = new Object();
        this.A0H = ImmutableList.of();
        this.A0E = ImmutableList.of();
        this.A0G = ImmutableList.of();
        this.A00 = 0;
        this.A05 = LightColorScheme.A00();
        this.A0M = new FZM(this, 3);
        this.A0Y = new Igi(this);
        this.A0X = jGa;
        this.A0N = 1BQ.A02(116048);
        this.A0U = 1BV.A00(116077);
        this.A0Q = 7zL.A0R(context2, 116047);
        this.A0T = 1BV.A00(49988);
        this.A0P = AbH.A0Q();
        this.A0R = 1BV.A00(83393);
        this.A0S = 1BV.A00(147816);
        this.A0a = 1BQ.A02(68416);
        this.A0O = 7zL.A0R(context2, 83914);
        this.A0L = DKD.A0H(context2);
        this.A0J = 1P9.A01(new 1P9(this.A0L), new 3cK(this, 4YV.A0C(context2), 4), "com.facebook.orca.ACTION_STICKER_SENT_FROM_STAR_TAB");
        this.A0K = 1P9.A01(new 1P9(this.A0L), new IgR(this, 20), 4YT.A00(995));
        A0U(2132543390);
        FbFrameLayout fbFrameLayout = (FbFrameLayout) C09s.A01(this, 2131367614);
        this.A06 = fbFrameLayout;
        ViewParent parent = fbFrameLayout.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.A06);
        }
        A03();
        A0c(this.A06, this.A0W);
        IUx iUx = new IUx(this, 2);
        ExpandableBottomSheetContainer expandableBottomSheetContainer = super.A03;
        if (expandableBottomSheetContainer != null) {
            expandableBottomSheetContainer.A02 = iUx;
        }
        ?? r0 = (CustomViewPager) C09s.A01(this, 2131367617);
        this.A0C = r0;
        C00i c00i = this.A0U;
        r0.A0R((0NL) c00i.get());
        this.A0C.A0S(this.A0M);
        this.A0A = new IaD(context2);
        GY7 gy7 = (GY7) c00i.get();
        gy7.A00 = this.A0A;
        gy7.A09();
        this.A03 = (LithoView) C09s.A01(this, 2131367615);
        FbImageButton fbImageButton = (FbImageButton) C09s.A01(this, 2131367632);
        this.A07 = fbImageButton;
        GOn.A1P(fbImageButton, C1u3.A4G, (C1u2) 4YU.A0p(this.A0P));
        int i = 129;
        this.A07.setOnClickListener(new FXq(this, ActionId.MESSENGER_QUEUE_CREATION));
        A04();
        Hmt hmt = new Hmt((HPh) C1Y6.A00(context2, "com_facebook_stickers_keyboardls_plugins_interfaces_tabs_StickerTabsInterfaceSpec", "StickerLSKeyboard", new Object[]{this.A0Y}));
        this.A0B = hmt;
        String str = hmt.A00;
        IFB ifb = ((HPh) str).A00;
        AtomicInteger atomicInteger = C1Y6.A04;
        int andIncrement = atomicInteger.getAndIncrement();
        1YC r02 = ifb.A0F;
        r02.A08("com.facebook.stickers.keyboardls.plugins.interfaces.tabs.StickerTabsInterfaceSpec", "stickers.keyboardls.tabs.StickerTabsInterfaceSpec", "getStickerTabSectionInfo", andIncrement);
        try {
            IFB.A01(ifb);
            ArrayList A0t = AnonymousClass001.A0t(IFB.A00(ifb));
            try {
                if (IFB.A06(ifb)) {
                    i = atomicInteger.getAndIncrement();
                    str = "stickers.keyboardls.searchtab.core.tabs.SearchTabImplementation";
                    r02.A0A("com.facebook.stickers.keyboardls.searchtab.plugins.core.tabs.SearchTabImplementation", str, "com.facebook.stickers.keyboardls.plugins.interfaces.tabs.StickerTabsInterfaceSpec", i, "stickers.keyboardls.tabs.StickerTabsInterfaceSpec", "com.facebook.stickers.keyboardls.searchtab.plugins.core.SearchTabKillSwitch", "getStickerTabSectionInfo");
                    try {
                        JMq jMq = ifb.A0G;
                        Context context3 = ifb.A0E;
                        11T.A0F(jMq, 0);
                        11T.A0F(context3, 1);
                        H0H h0h = new H0H(jMq, 1BK.A0u(context3, 2131965565));
                        Ho1 ho1 = new Ho1();
                        ho1.A00(ImmutableList.of((Object) h0h));
                        ho1.A00 = 2;
                        A0t.add(new Hrk(ho1));
                        r02.A09(str, "stickers.keyboardls.tabs.StickerTabsInterfaceSpec", "getStickerTabSectionInfo", i);
                    } catch (Exception e) {
                        throw e;
                    }
                }
                if (IFB.A05(ifb)) {
                    int andIncrement2 = atomicInteger.getAndIncrement();
                    r02.A0A("com.facebook.stickers.keyboardls.recenttab.plugins.core.tabs.RecentTabImplementation", "stickers.keyboardls.recenttab.core.tabs.RecentTabImplementation", "com.facebook.stickers.keyboardls.plugins.interfaces.tabs.StickerTabsInterfaceSpec", andIncrement2, "stickers.keyboardls.tabs.StickerTabsInterfaceSpec", "com.facebook.stickers.keyboardls.recenttab.plugins.core.KeyboardlsRecenttabCoreKillSwitch", "getStickerTabSectionInfo");
                    RecentTabImplementation recentTabImplementation = ifb.A03;
                    JMq jMq2 = ifb.A0G;
                    Context context4 = ifb.A0E;
                    FbUserSession A0C = 4YV.A0C(context4);
                    r329 = (69H) 1Lo.A04((Context) null, A0C, recentTabImplementation.A00, 49969);
                    synchronized (r329) {
                        try {
                            A1T = AnonymousClass001.A1T(r329.A03);
                        } catch (Throwable th) {
                            th = th;
                            69H r03 = r329;
                            throw th;
                        }
                    }
                    if (!A1T) {
                        C00i c00i2 = recentTabImplementation.A02;
                        ((IQV) c00i2.get()).A01 = new IQN(jMq2, recentTabImplementation, 0);
                        IQV iqv = (IQV) c00i2.get();
                        Object obj = new Object();
                        try {
                            1IB A0M = 4YU.A0M(1BK.A05(), IQV.A05, (BlueServiceOperationFactory) iqv.A03.get(), 1BJ.A00(181), true);
                            1BY r04 = iqv.A02;
                            C2081Db6 c2081Db6 = new C2081Db6(17, obj, (69H) 1Lo.A04((Context) null, 1Fw.A05(r04), r04, 49969), iqv);
                            2TV r05 = iqv.A01;
                            if (r05 != null) {
                                r05.C4n(A0M, obj);
                            }
                            1Kd.A0D(iqv.A04, c2081Db6, A0M);
                            iqv.A00 = new 2eS(c2081Db6, A0M);
                        } catch (Exception e2) {
                            2TV r06 = iqv.A01;
                            if (r06 != null) {
                                r06.C47(obj, e2);
                            }
                        }
                    }
                    A0t.add(RecentTabImplementation.A00(context4, A0C, jMq2, recentTabImplementation));
                    r02.A09("stickers.keyboardls.recenttab.core.tabs.RecentTabImplementation", "stickers.keyboardls.tabs.StickerTabsInterfaceSpec", "getStickerTabSectionInfo", andIncrement2);
                }
                if (IFB.A04(ifb)) {
                    int andIncrement3 = atomicInteger.getAndIncrement();
                    r02.A0A("com.facebook.stickers.keyboardls.generatedtab.plugins.core.tabs.GeneratedTabImplementation", "stickers.keyboardls.generatedtab.core.tabs.GeneratedTabImplementation", "com.facebook.stickers.keyboardls.plugins.interfaces.tabs.StickerTabsInterfaceSpec", andIncrement3, "stickers.keyboardls.tabs.StickerTabsInterfaceSpec", "com.facebook.stickers.keyboardls.generatedtab.plugins.core.KeyboardlsGeneratedtabCoreKillSwitch", "getStickerTabSectionInfo");
                    GeneratedTabImplementation generatedTabImplementation = ifb.A02;
                    Context context5 = generatedTabImplementation.A00;
                    1Fw.A04((1EZ) 1Bu.A06(context5, 16428));
                    JMq jMq3 = generatedTabImplementation.A02;
                    C1F6 A0I = GOp.A0I(generatedTabImplementation.A01);
                    String string = context5.getString(2131957273);
                    A01 = FbInjector.A01();
                    AbL.A0y(A0I);
                    try {
                        H0J h0j = new H0J(context5, jMq3, string);
                        1Bn.A0K();
                        FbInjector.A04(A01);
                        Ho1 ho12 = new Ho1();
                        ho12.A00(ImmutableList.of((Object) h0j));
                        ho12.A00 = 7;
                        A0t.add(new Hrk(ho12));
                        r02.A09("stickers.keyboardls.generatedtab.core.tabs.GeneratedTabImplementation", "stickers.keyboardls.tabs.StickerTabsInterfaceSpec", "getStickerTabSectionInfo", andIncrement3);
                    } catch (Throwable th2) {
                        th = th2;
                        1Bn.A0K();
                        FbInjector.A04(A01);
                        throw th;
                    }
                }
                if (IFB.A03(ifb)) {
                    int andIncrement4 = atomicInteger.getAndIncrement();
                    r02.A0A("com.facebook.stickers.keyboardls.favoritesttab.plugins.plugins.core.tabs.FavoritesTabImplementation", "stickers.keyboardls.favoritesttab.plugins.core.tabs.FavoritesTabImplementation", "com.facebook.stickers.keyboardls.plugins.interfaces.tabs.StickerTabsInterfaceSpec", andIncrement4, "stickers.keyboardls.tabs.StickerTabsInterfaceSpec", "com.facebook.stickers.keyboardls.favoritesttab.plugins.plugins.core.KeyboardlsFavoritesttabCoreKillSwitch", "getStickerTabSectionInfo");
                    FavoritesTabImplementation favoritesTabImplementation = ifb.A01;
                    Context context6 = favoritesTabImplementation.A00;
                    1Fw.A04((1EZ) 1Bu.A06(context6, 16428));
                    JMq jMq4 = favoritesTabImplementation.A02;
                    C1F6 A0I2 = GOp.A0I(favoritesTabImplementation.A01);
                    String string2 = context6.getString(2131964223);
                    A01 = FbInjector.A01();
                    AbL.A0y(A0I2);
                    H0G h0g = new H0G(context6, jMq4, string2);
                    1Bn.A0K();
                    FbInjector.A04(A01);
                    Ho1 ho13 = new Ho1();
                    ho13.A00(ImmutableList.of((Object) h0g));
                    ho13.A00 = 6;
                    A0t.add(new Hrk(ho13));
                    r02.A09("stickers.keyboardls.favoritesttab.plugins.core.tabs.FavoritesTabImplementation", "stickers.keyboardls.tabs.StickerTabsInterfaceSpec", "getStickerTabSectionInfo", andIncrement4);
                }
                if (IFB.A02(ifb)) {
                    int andIncrement5 = atomicInteger.getAndIncrement();
                    r02.A0A("com.facebook.stickers.keyboardls.avatartab.plugins.core.tabs.AvatarTabImplementation", "stickers.keyboardls.avatartab.core.tabs.AvatarTabImplementation", "com.facebook.stickers.keyboardls.plugins.interfaces.tabs.StickerTabsInterfaceSpec", andIncrement5, "stickers.keyboardls.tabs.StickerTabsInterfaceSpec", "com.facebook.stickers.keyboardls.avatartab.plugins.core.KeyboardlsAvatartabCoreKillSwitch", "getStickerTabSectionInfo");
                    AvatarTabImplementation avatarTabImplementation = ifb.A00;
                    Ho1 ho14 = new Ho1();
                    1Br.A0C(avatarTabImplementation.A01);
                    Context context7 = avatarTabImplementation.A00;
                    ho14.A00(ImmutableList.of((Object) new C91d(context7, avatarTabImplementation.A02, context7.getString(2131953141))));
                    ho14.A00 = 5;
                    A0t.add(new Hrk(ho14));
                    r02.A09("stickers.keyboardls.avatartab.core.tabs.AvatarTabImplementation", "stickers.keyboardls.tabs.StickerTabsInterfaceSpec", "getStickerTabSectionInfo", andIncrement5);
                }
                if (IFB.A07(ifb)) {
                    int andIncrement6 = atomicInteger.getAndIncrement();
                    r02.A0A("com.facebook.stickers.keyboardls.stickerpacktab.plugins.core.tabs.StickerPackTabsImplementation", "stickers.keyboardls.stickerpacktab.core.tabs.StickerPackTabsImplementation", "com.facebook.stickers.keyboardls.plugins.interfaces.tabs.StickerTabsInterfaceSpec", andIncrement6, "stickers.keyboardls.tabs.StickerTabsInterfaceSpec", "com.facebook.stickers.keyboardls.stickerpacktab.plugins.core.KeyboardlsStickerpacktabCoreKillSwitch", "getStickerTabSectionInfo");
                    StickerPackTabsImplementation stickerPackTabsImplementation = ifb.A04;
                    JMq jMq5 = ifb.A0G;
                    Context context8 = ifb.A0E;
                    FbUserSession A0C2 = 4YV.A0C(context8);
                    r329 = (69H) 1Lo.A04((Context) null, A0C2, stickerPackTabsImplementation.A00, 49969);
                    5Qx r07 = 5Qx.A03;
                    C6xd c6xd = C6xd.A06;
                    synchronized (r329) {
                        r329.A04(c6xd, r07).isEmpty();
                    }
                    StickerPackTabsImplementation.A01(jMq5, stickerPackTabsImplementation);
                    A0t.add(StickerPackTabsImplementation.A00(context8, A0C2, jMq5, stickerPackTabsImplementation));
                    r02.A09("stickers.keyboardls.stickerpacktab.core.tabs.StickerPackTabsImplementation", "stickers.keyboardls.tabs.StickerTabsInterfaceSpec", "getStickerTabSectionInfo", andIncrement6);
                }
                while (A0t.size() < IFB.A00(ifb)) {
                    A0t.add(null);
                }
                r02.A02((Exception) null, "stickers.keyboardls.tabs.StickerTabsInterfaceSpec", "getStickerTabSectionInfo", andIncrement);
                this.A0H = A0t;
                A09(this);
            } catch (Throwable th3) {
                r02.A04((Exception) null, str, "stickers.keyboardls.tabs.StickerTabsInterfaceSpec", "getStickerTabSectionInfo", i);
                throw th3;
            }
        } catch (Throwable th4) {
            r02.A02((Exception) null, "stickers.keyboardls.tabs.StickerTabsInterfaceSpec", "getStickerTabSectionInfo", andIncrement);
            throw th4;
        }
    }

    public static HGH A00(C2736Gml c2736Gml, int i) {
        ImmutableList immutableList = c2736Gml.A0E;
        if (immutableList == null || i >= immutableList.size() || i < 0) {
            return null;
        }
        return (HGH) c2736Gml.A0E.get(i);
    }

    public static Integer A01(String str) {
        return "avatar_tab_id".equals(str) ? 0S2.A02 : "recent_tab_id".equals(str) ? 0S2.A0u : "search_tab_id".equals(str) ? 0S2.A15 : "selfie_tab_id".equals(str) ? 0S2.A1G : 0S2.A1J;
    }

    public static String A02(C2736Gml c2736Gml) {
        int A03;
        H4x h4x;
        java.util.Map map = c2736Gml.A0Z;
        if (!map.containsKey("search_tab_id") || (A03 = AnonymousClass001.A03(map.get("search_tab_id"))) < 0 || A03 >= c2736Gml.A0E.size()) {
            return null;
        }
        HGH hgh = (HGH) c2736Gml.A0E.get(A03);
        if (!(hgh instanceof H0H) || (h4x = ((H0H) hgh).A04) == null) {
            return null;
        }
        return h4x.A0A;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void A03() {
        LithoView lithoView = this.A0W;
        C5yw A00 = C5yv.A00(lithoView.A09);
        A00.A2j(false);
        A00.A2b(this.A05);
        A00.A2f(GOo.A0A(this).getString(2131966386));
        A00.A2X();
        A00.A2d(new CxE(this, 108));
        lithoView.A0x(A00.A2V());
    }

    private void A04() {
        FbImageButton fbImageButton = this.A07;
        GOo.A1E(fbImageButton, C1u3.A4G, (C1u2) 4YU.A0p(this.A0P), this.A05.B4h());
        AbG.A1H(fbImageButton, this.A05);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0083, code lost:
    
        if (((X.AnonymousClass842) r302.A0a.get()).A08(r302.A04, r302.A0D) != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0034, code lost:
    
        if (X.4YU.A1Y(r0, com.facebook.acra.constants.ActionId.PRIVACY_VIOLATION) == false) goto L8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A06(com.facebook.auth.usersession.FbUserSession r301, X.C2736Gml r302) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2736Gml.A06(com.facebook.auth.usersession.FbUserSession, X.Gml):void");
    }

    public static void A07(C2736Gml c2736Gml) {
        if (c2736Gml.A0G.isEmpty()) {
            return;
        }
        LithoView lithoView = c2736Gml.A03;
        8TK A00 = 3wK.A00(lithoView.A09);
        A00.A2Z(c2736Gml.A0G);
        int i = c2736Gml.A00;
        3wK r0 = A00.A01;
        r0.A00 = i;
        A00.A2X(c2736Gml.A05);
        A00.A0T();
        r0.A03 = AnonymousClass955.EVEN_WIDTH;
        A00.A2Y(new Iaa(c2736Gml, 1));
        A00.A1w(c2736Gml.A0V);
        lithoView.A0x(A00.A2W());
    }

    public static void A08(C2736Gml c2736Gml) {
        if (A0D(c2736Gml)) {
            return;
        }
        1PA r0 = c2736Gml.A0J;
        if (r0 != null && !r0.A03()) {
            r0.A00();
        }
        1PA r02 = c2736Gml.A0K;
        if (r02 == null || r02.A03()) {
            return;
        }
        r02.A00();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0098 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0030 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A09(X.C2736Gml r301) {
        /*
            Method dump skipped, instructions count: 818
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2736Gml.A09(X.Gml):void");
    }

    public static void A0A(C2736Gml c2736Gml, int i) {
        int andIncrement;
        String str;
        Hrk A00;
        int i2 = 0;
        while (true) {
            int i3 = i2;
            List list = c2736Gml.A0H;
            if (i3 >= list.size()) {
                A09(c2736Gml);
                return;
            }
            if (((Hrk) list.get(i3)).A00 == i) {
                IFB ifb = c2736Gml.A0B.A00.A00;
                AtomicInteger atomicInteger = C1Y6.A04;
                int andIncrement2 = atomicInteger.getAndIncrement();
                1YC r0 = ifb.A0F;
                r0.A08("com.facebook.stickers.keyboardls.plugins.interfaces.tabs.StickerTabsInterfaceSpec", "stickers.keyboardls.tabs.StickerTabsInterfaceSpec", "updateStickerTabSectionInfo", andIncrement2);
                Exception e = null;
                try {
                    IFB.A01(ifb);
                    if (i == 3) {
                        if (IFB.A05(ifb)) {
                            andIncrement = atomicInteger.getAndIncrement();
                            str = "stickers.keyboardls.recenttab.core.tabs.RecentTabImplementation";
                            r0.A0A("com.facebook.stickers.keyboardls.recenttab.plugins.core.tabs.RecentTabImplementation", str, "com.facebook.stickers.keyboardls.plugins.interfaces.tabs.StickerTabsInterfaceSpec", andIncrement, "stickers.keyboardls.tabs.StickerTabsInterfaceSpec", "com.facebook.stickers.keyboardls.recenttab.plugins.core.KeyboardlsRecenttabCoreKillSwitch", "updateStickerTabSectionInfo");
                            try {
                                try {
                                    RecentTabImplementation recentTabImplementation = ifb.A03;
                                    JMq jMq = ifb.A0G;
                                    Context context = ifb.A0E;
                                    A00 = RecentTabImplementation.A00(context, 4YV.A0D(context), jMq, recentTabImplementation);
                                    r0.A09(str, "stickers.keyboardls.tabs.StickerTabsInterfaceSpec", "updateStickerTabSectionInfo", andIncrement);
                                    r0.A02((Exception) null, "stickers.keyboardls.tabs.StickerTabsInterfaceSpec", "updateStickerTabSectionInfo", andIncrement2);
                                    list.set(i3, A00);
                                } catch (Exception e2) {
                                    e = e2;
                                    throw e;
                                }
                            } finally {
                            }
                        }
                        r0.A02((Exception) null, "stickers.keyboardls.tabs.StickerTabsInterfaceSpec", "updateStickerTabSectionInfo", andIncrement2);
                    } else {
                        if (i == 1 && IFB.A07(ifb)) {
                            andIncrement = atomicInteger.getAndIncrement();
                            str = "stickers.keyboardls.stickerpacktab.core.tabs.StickerPackTabsImplementation";
                            r0.A0A("com.facebook.stickers.keyboardls.stickerpacktab.plugins.core.tabs.StickerPackTabsImplementation", str, "com.facebook.stickers.keyboardls.plugins.interfaces.tabs.StickerTabsInterfaceSpec", andIncrement, "stickers.keyboardls.tabs.StickerTabsInterfaceSpec", "com.facebook.stickers.keyboardls.stickerpacktab.plugins.core.KeyboardlsStickerpacktabCoreKillSwitch", "updateStickerTabSectionInfo");
                            StickerPackTabsImplementation stickerPackTabsImplementation = ifb.A04;
                            JMq jMq2 = ifb.A0G;
                            Context context2 = ifb.A0E;
                            A00 = StickerPackTabsImplementation.A00(context2, 4YV.A0D(context2), jMq2, stickerPackTabsImplementation);
                            r0.A09(str, "stickers.keyboardls.tabs.StickerTabsInterfaceSpec", "updateStickerTabSectionInfo", andIncrement);
                            r0.A02((Exception) null, "stickers.keyboardls.tabs.StickerTabsInterfaceSpec", "updateStickerTabSectionInfo", andIncrement2);
                            list.set(i3, A00);
                        }
                        r0.A02((Exception) null, "stickers.keyboardls.tabs.StickerTabsInterfaceSpec", "updateStickerTabSectionInfo", andIncrement2);
                    }
                } catch (Throwable th) {
                    r0.A02(e, "stickers.keyboardls.tabs.StickerTabsInterfaceSpec", "updateStickerTabSectionInfo", andIncrement2);
                    throw th;
                }
            }
            i2 = i3 + 1;
        }
    }

    public static void A0B(C2736Gml c2736Gml, int i, boolean z, boolean z2) {
        HGH A00;
        if ((z2 || i != c2736Gml.A00) && (A00 = A00(c2736Gml, i)) != null) {
            HGH A002 = A00(c2736Gml, c2736Gml.A00);
            if (A002 != null) {
                A002.A05();
            }
            Hrr hrr = (Hrr) c2736Gml.A0N.get();
            Integer A01 = A01(A00.A03());
            11T.A0F(A01, 0);
            Integer num = hrr.A00;
            if (num != A01) {
                hrr.A01 = num;
                hrr.A00 = A01;
            }
            c2736Gml.A00 = i;
            c2736Gml.A0C.A0Q(i, false);
            A00.A0B(c2736Gml.A0I);
            if (!z || c2736Gml.A03.A00 == null) {
                return;
            }
            3wK.A01(c2736Gml.A0V, i);
        }
    }

    public static void A0C(C2736Gml c2736Gml, String str) {
        java.util.Map map = c2736Gml.A0Z;
        A0B(c2736Gml, map.containsKey(str) ? AnonymousClass001.A03(map.get(str)) : 0, true, false);
    }

    public static boolean A0D(C2736Gml c2736Gml) {
        if (1BK.A0N(c2736Gml.A0b).AZk(36318479679763111L)) {
            return c2736Gml.A0X.ByZ("avatar_tab_id");
        }
        return false;
    }

    @Override // X.H4B
    public void A0f(MigColorScheme migColorScheme) {
        super.A0f(migColorScheme);
        if (Objects.equal(this.A05, migColorScheme)) {
            return;
        }
        if (migColorScheme == null) {
            migColorScheme = LightColorScheme.A00();
        }
        this.A05 = migColorScheme;
        A07(this);
        1Du it = this.A0E.iterator();
        while (it.hasNext()) {
            ((HGH) it.next()).A09(this.A05);
        }
        A04();
        A03();
    }

    @Override // X.H4B
    public void A0i(boolean z) {
        super.A0i(z);
        this.A0I = z;
        A00(this, this.A00);
    }

    public void onDestory() {
        LifecycleOwner lifecycleOwner = this.A02;
        if (lifecycleOwner != null) {
            lifecycleOwner.getLifecycle().removeObserver(this);
        }
    }

    public void onStart() {
        A08(this);
    }

    public void onStop() {
        1PA r0 = this.A0J;
        if (r0 != null && r0.A03()) {
            r0.A01();
        }
        1PA r02 = this.A0K;
        if (r02 == null || !r02.A03()) {
            return;
        }
        r02.A01();
    }
}
