package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.graphql.query.GraphQlQueryParamSet;
import com.facebook.inject.FbInjector;
import com.facebook.litho.ComponentTree;
import com.facebook.litho.LithoView;
import com.facebook.messaging.communitymessaging.model.Community;
import com.facebook.messaging.communitymessaging.model.CommunityMessagingCommunityType;
import com.facebook.messaging.communitymessaging.model.CommunityNewBadgeStatus;
import com.facebook.messaging.marketplace.plugins.marketplacefolder.folderitem.MarketplaceFolderItem;
import com.facebook.messaging.navigation.home.drawer.model.AiHomeDrawerFolderKey;
import com.facebook.messaging.navigation.home.drawer.model.DiscoverCommunitiesDrawerFolderKey;
import com.facebook.messaging.navigation.home.drawer.model.DiscoverPublicChannelsDrawerFolderKey;
import com.facebook.messaging.navigation.home.drawer.model.FolderNameDrawerFolderKey;
import com.facebook.messaging.navigation.home.drawer.model.PublicChannelsInvitesDrawerFolderKey;
import com.facebook.messaging.navigation.plugins.communities.communitiesdrawerfolder.CommunitiesDrawerFolderImplementation;
import com.facebook.messaging.navigation.plugins.communities.fbcommunitiesdrawerfolder.FbCommunitiesDrawerFolderImplementation;
import com.facebook.messaging.navigation.plugins.communities.standalonecommunitiesdrawerfolder.StandaloneCommunitiesDrawerFolderImplementation;
import com.facebook.messaging.navigation.plugins.communities.zerochatsuggestioncommunitiesdrawerfolder.ZeroChatSuggestionCommunitiesDrawerFolderImplementation;
import com.facebook.messaging.navigation.plugins.drawerfoldersections.morefoldersection.MoreDrawerFolderImplementation;
import com.facebook.messaging.navigation.plugins.travel.traveldrawerfolder.TravelDrawerFolderImplementation;
import com.facebook.messaging.settings.plugins.iadrawer.drawerheader.MeSettingsDrawerHeaderImplementation;
import com.facebook.messaging.support.plugins.supportfolder.folderitem.SupportFolderItemImplementation;
import com.facebook.messaging.wellbeing.unknowncontact.messagerequests.plugins.homedrawer.folderitem.MessageRequestsFolderItem;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.user.model.User;
import com.facebook.user.model.UserKey;
import com.facebook.xapp.messaging.events.common.lifecycle.OnVisible;
import com.facebook.xapp.messaging.map.HeterogeneousMap;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.4Fm, reason: invalid class name */
/* loaded from: 4Fm.class */
public abstract class C4Fm extends 1pK implements 1pN, 2Op, C4Fn, C4Fo {
    public static final FolderNameDrawerFolderKey A0U = new FolderNameDrawerFolderKey(1F9.A0I);
    public static final String __redex_internal_original_name = "HomeDrawerFragmentBase";
    public Handler A00;
    public FbUserSession A01;
    public LithoView A02;
    public 2YJ A03;
    public C4Lh A04;
    public C4Ln A05;
    public C4Li A06;
    public C4Lm A07;
    public AY3 A08;
    public 2MX A09;
    public MigColorScheme A0A;
    public 1Va A0B;
    public Runnable A0C;
    public HashMap A0D;
    public List A0E;
    public List A0F;
    public boolean A0G;
    public boolean A0H;
    public C4Lg A0I;
    public String A0J;
    public final 1Br A0N;
    public final C01i A0P = C01g.A01(new C4O0(this, 21));
    public final C01i A0Q = C01g.A01(new C4O0(this, 22));
    public final C01i A0R = C01g.A00(C03i.A02, new C4O0(this, 23));
    public final C01i A0O = C01g.A01(new C4O0(this, 20));
    public final 1Br A0L = 1Bq.A00(66481);
    public final 2YG A0T = new 4LZ(this);
    public final 1Br A0S = 1Bq.A00(68519);
    public final 1Br A0M = 1Bq.A00(83664);
    public final 1Br A0K = 1Bq.A00(66227);

    public C4Fm() {
        C0ty c0ty = C0ty.A00;
        this.A0E = c0ty;
        this.A0F = c0ty;
        this.A0D = new HashMap();
        this.A0N = 1Bq.A00(16385);
    }

    private final void A07() {
        C4Lm A1Y = A1Y();
        ((QuickPerformanceLogger) A1Y.A02.A00.get()).markerPoint(231281612, "DRAWER_VIEW_CREATED");
        ((1SG) A1Y.A01.A00.get()).A0K("DRAWER_VIEW_CREATED");
        List list = this.A0E;
        Handler handler = this.A00;
        if (handler != null) {
            handler.post(new D7z(this, list));
        } else {
            11T.A0L("backgroundHandler");
            throw 0Q8.createAndThrow();
        }
    }

    private final void A08() {
        Object obj;
        Iterator it = this.A0F.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            Integer num = ((C4N3) obj).A02;
            if (num == 0S2.A00 || num == 0S2.A0C) {
                break;
            }
        }
        C4N3 c4n3 = (C4N3) obj;
        if (c4n3 == null || c4n3.A01 == 0S2.A01) {
            C4Lm A1Y = A1Y();
            ((QuickPerformanceLogger) A1Y.A02.A00.get()).markerPoint(231281612, "REFRESH_CONTENT_WITH_ALL_SECTIONS_LOADED");
            ((1SG) A1Y.A01.A00.get()).A0K("REFRESH_CONTENT_WITH_ALL_SECTIONS_LOADED");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v52, types: [X.4Li] */
    public void A1S(Bundle bundle) {
        C00j.A05("HomeDrawerFragmentBase.onFragmentCreate", 1001761629);
        try {
            this.A01 = ((1Fv) 1Bi.A03(66351)).A07(this, (1EZ) 1Bn.A0D(requireContext(), 16428));
            this.A0I = (C4Lg) 1Bn.A0D(requireContext(), 67885);
            C4Lh c4Lh = (C4Lh) 1Bi.A03(83667);
            11T.A0F(c4Lh, 0);
            this.A04 = c4Lh;
            C4Nz c4Nz = (C4Nz) 1Bn.A0A(33263);
            requireContext();
            Context A01 = FbInjector.A01();
            FbInjector.A04(c4Nz.B92().Aqm());
            1Bn.A0M(c4Nz);
            try {
                ?? r0 = new Object() { // from class: X.4Li
                    public final 1Br A00 = 1Bu.A00(83118);
                };
                1Bn.A0K();
                FbInjector.A04(A01);
                this.A06 = r0;
                Handler handler = (Handler) 1Bn.A0A(16453);
                11T.A0F(handler, 0);
                this.A00 = handler;
                1Bn.A0A(67371);
                final 2YG r02 = this.A0T;
                this.A03 = new 2YJ(new 2YG(r02) { // from class: X.4Lj
                    public final WeakReference A00;

                    {
                        11T.A0F(r02, 1);
                        this.A00 = new WeakReference(r02);
                    }

                    public void Bbt(List list) {
                        C00j.A05("HomeDrawerImpressionTracker.logViewImpression", 2109458445);
                        try {
                            2YG r03 = (2YG) this.A00.get();
                            if (r03 != null) {
                                r03.Bbt(list);
                            }
                            C00j.A01(1988047228);
                        } catch (Throwable th) {
                            C00j.A01(-14016562);
                            throw th;
                        }
                    }

                    public void Bfy(C2k8 c2k8) {
                        C00j.A05("HomeDrawerImpressionTracker.notifyItemInViewport", -127071772);
                        try {
                            2YG r03 = (2YG) this.A00.get();
                            if (r03 != null) {
                                r03.Bfy(c2k8);
                            }
                            C00j.A01(-117283265);
                        } catch (Throwable th) {
                            C00j.A01(-1789707583);
                            throw th;
                        }
                    }

                    public void Bfz(C2k8 c2k8) {
                        C00j.A05("HomeDrawerImpressionTracker.notifyItemNotInViewport", -1917293422);
                        try {
                            2YG r03 = (2YG) this.A00.get();
                            if (r03 != null) {
                                r03.Bfz(c2k8);
                            }
                            C00j.A01(-2090005817);
                        } catch (Throwable th) {
                            C00j.A01(1788629034);
                            throw th;
                        }
                    }

                    public void CqK(boolean z) {
                        C00j.A05("HomeDrawerImpressionTracker.setIsVisibleToUser", -345028076);
                        try {
                            2YG r03 = (2YG) this.A00.get();
                            if (r03 != null) {
                                r03.CqK(z);
                            }
                            C00j.A01(90073899);
                        } catch (Throwable th) {
                            C00j.A01(-520533903);
                            throw th;
                        }
                    }

                    public void D79(C00p c00p, boolean z) {
                        11T.A0F(c00p, 0);
                        C00j.A05("HomeDrawerImpressionTracker.updateItemsForPageVisibility", 981866144);
                        try {
                            2YG r03 = (2YG) this.A00.get();
                            if (r03 != null) {
                                r03.D79(c00p, z);
                            }
                            C00j.A01(1259867909);
                        } catch (Throwable th) {
                            C00j.A01(1918117787);
                            throw th;
                        }
                    }
                }, (C4Lk) this.A0M.A00.get());
                C4Lm c4Lm = (C4Lm) 1Bn.A0A(83665);
                11T.A0F(c4Lm, 0);
                this.A07 = c4Lm;
                C4Ln c4Ln = (C4Ln) 1Bi.A03(83164);
                11T.A0F(c4Ln, 0);
                this.A05 = c4Ln;
                1G1 r03 = this.A01;
                if (r03 == null) {
                    11T.A0L("fbUserSession");
                    th = 0Q8.createAndThrow();
                } else {
                    this.A0J = r03.A02;
                    this.A0C = new Runnable() { // from class: X.4Lo
                        public static final String __redex_internal_original_name = "HomeDrawerFragmentBase$onFragmentCreate$1";

                        @Override // java.lang.Runnable
                        public final void run() {
                            C4Fm c4Fm = C4Fm.this;
                            if (((2yD) c4Fm.A0N.A00.get()).AZk(36325922856588351L)) {
                                c4Fm.A1c();
                            } else {
                                c4Fm.A1d();
                            }
                        }
                    };
                    this.A0G = bundle != null ? bundle.getBoolean("BUNDLE_IS_DRAWER_OPENED") : this.A0G;
                    Context requireContext = requireContext();
                    C4Fo c4Fo = new C4Fo() { // from class: X.4Lp
                        @Override // X.C4Fo
                        public final 2MX BdL() {
                            return C4Fm.this.A09;
                        }
                    };
                    C4Lq c4Lq = new C4Lq();
                    1VY r04 = new 1VY(new C4Lr(requireContext, c4Fo, c4Lq));
                    c4Lq.A00 = r04;
                    this.A0B = r04;
                    C00j.A05("HomeDrawerFragmentBase.setVisibilityLifecycle", -1917383565);
                    try {
                        C1t6.A00(this, new C1t5() { // from class: X.4Ly
                            @Override // X.C1t5
                            public void BzZ() {
                                C4Fm.this.A1b();
                            }

                            @Override // X.C1t5
                            public void Bzd() {
                                C4Fm c4Fm = C4Fm.this;
                                if (c4Fm.A0G) {
                                    1Va r05 = c4Fm.A0B;
                                    if (r05 != null) {
                                        r05.CZm(OnVisible.A00);
                                    } else {
                                        11T.A0L("publisher");
                                        throw 0Q8.createAndThrow();
                                    }
                                }
                            }
                        });
                        C00j.A01(-1214681306);
                        C00j.A01(-1442057177);
                        return;
                    } catch (Throwable th) {
                        th = th;
                        C00j.A01(973899991);
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                1Bn.A0K();
                FbInjector.A04(A01);
            }
            throw th;
        } catch (Throwable th3) {
            C00j.A01(1518646672);
            throw th3;
        }
    }

    public final LithoView A1X() {
        LithoView lithoView = this.A02;
        if (lithoView != null) {
            return lithoView;
        }
        11T.A0L("lithoView");
        throw 0Q8.createAndThrow();
    }

    public final C4Lm A1Y() {
        C4Lm c4Lm = this.A07;
        if (c4Lm != null) {
            return c4Lm;
        }
        11T.A0L("homeDrawerPerfLogger");
        throw 0Q8.createAndThrow();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001a, code lost:
    
        if (r305 == null) goto L6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v76, types: [com.facebook.messaging.navigation.home.drawer.model.DrawerFolderKey] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.4NE A1Z(X.1Iw r302) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4Fm.A1Z(X.1Iw):X.4NE");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A1a() {
        int i;
        C00j.A05("HomeDrawerFragmentBase.invalidateDrawerContents", -511395467);
        try {
            if (getContext() == null) {
                i = -1071408556;
            } else {
                final 1GU r0 = (1GU) 1Bi.A03(16458);
                r0.Ciz(new Runnable() { // from class: X.4X5
                    public static final String __redex_internal_original_name = "HomeDrawerFragmentBase$invalidateDrawerContents$1";

                    /* JADX WARN: Type inference failed for: r0v1, types: [X.4Fm, androidx.fragment.app.Fragment] */
                    @Override // java.lang.Runnable
                    public final void run() {
                        ?? r02 = this;
                        if (!r02.A0H || r02.getContext() == null || !r02.isAdded() || r02.mRemoving) {
                            return;
                        }
                        1GU r03 = r0;
                        Runnable runnable = r02.A0C;
                        if (runnable != null) {
                            r03.CeL(runnable);
                            Runnable runnable2 = r02.A0C;
                            if (runnable2 != null) {
                                r03.CY3(runnable2);
                                return;
                            }
                        }
                        11T.A0L("refreshFoldersUpdateContentRunnable");
                        throw 0Q8.createAndThrow();
                    }
                });
                i = -2140915709;
            }
            C00j.A01(i);
        } catch (Throwable th) {
            C00j.A01(2017950771);
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:154:0x02a6, code lost:
    
        if (r316 != false) goto L125;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A1b() {
        /*
            Method dump skipped, instructions count: 709
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4Fm.A1b():void");
    }

    public final void A1c() {
        C00j.A05("HomeDrawerFragmentBase.refreshFoldersUpdateContentAsync", -725778077);
        try {
            A1f();
            C00j.A05("HomeDrawerFragmentBase.updateContentAsync", 1324348385);
            try {
                1Iw r0 = A1X().A09;
                11T.A0A(r0);
                A1X().A0y(A1Z(r0));
                A07();
                C00j.A01(-1267312112);
                A08();
                C00j.A01(1628602918);
            } catch (Throwable th) {
                C00j.A01(1210711229);
                throw th;
            }
        } catch (Throwable th2) {
            C00j.A01(2072148382);
            throw th2;
        }
    }

    public final void A1d() {
        C00j.A05("HomeDrawerFragmentBase.refreshFoldersUpdateContentSync", 1865894488);
        try {
            A1f();
            A1e();
            A08();
            C00j.A01(-314517289);
        } catch (Throwable th) {
            C00j.A01(-678560745);
            throw th;
        }
    }

    public final void A1e() {
        C00j.A05("HomeDrawerFragmentBase.updateContentSync", -283615527);
        try {
            1Iw r0 = A1X().A09;
            11T.A0A(r0);
            A1X().A0x(A1Z(r0));
            A07();
            C00j.A01(327644218);
        } catch (Throwable th) {
            C00j.A01(162309946);
            throw th;
        }
    }

    public final void A1f() {
        int andIncrement;
        String str;
        String str2;
        String str3;
        CZA cza;
        C4Mh A03;
        int i;
        int andIncrement2;
        String str4;
        Object obj;
        C00j.A05("HomeDrawerFragmentBase.refreshDrawerItems", 1338905373);
        try {
            Object value = this.A0P.getValue();
            11T.A0A(value);
            C4M1 c4m1 = (C4M1) value;
            0Da r0 = 2mH.A01;
            C4M0 c4m0 = c4m1.A00.A00;
            AtomicInteger atomicInteger = C1Y6.A04;
            int andIncrement3 = atomicInteger.getAndIncrement();
            1YC r02 = c4m0.A0I;
            r02.A08("com.facebook.messaging.navigation.plugins.interfaces.drawer.folder.folderitem.HomeDrawerFolderItemInterfaceSpec", "messaging.navigation.drawer.folder.folderitem.HomeDrawerFolderItemInterfaceSpec", "getFolder", andIncrement3);
            Exception e = null;
            try {
                C4M0.A00(c4m0);
                int i2 = c4m0.A00;
                if (i2 == -1) {
                    i2 = C4M0.A04(c4m0) ? 1 : 0;
                    if (C4M0.A02(c4m0)) {
                        i2++;
                    }
                    if (C4M0.A05(c4m0)) {
                        i2++;
                    }
                    if (C4M0.A06(c4m0)) {
                        i2++;
                    }
                    if (C4M0.A01(c4m0)) {
                        i2++;
                    }
                    if (C4M0.A03(c4m0)) {
                        i2++;
                    }
                    c4m0.A00 = i2;
                }
                ArrayList arrayList = new ArrayList(i2);
                if (C4M0.A04(c4m0)) {
                    andIncrement2 = atomicInteger.getAndIncrement();
                    str4 = "messaging.navigation.inboxfolder.folderitem.InboxFolderItem";
                    r02.A0A("com.facebook.messaging.navigation.plugins.inboxfolder.folderitem.InboxFolderItem", str4, "com.facebook.messaging.navigation.plugins.interfaces.drawer.folder.folderitem.HomeDrawerFolderItemInterfaceSpec", andIncrement2, "messaging.navigation.drawer.folder.folderitem.HomeDrawerFolderItemInterfaceSpec", "com.facebook.messaging.navigation.plugins.inboxfolder.NavigationInboxfolderKillSwitch", "getFolder");
                    try {
                        try {
                            C4Mh A00 = C4MF.A00(c4m0.A05.A00);
                            if (r0.test(A00)) {
                                arrayList.add(A00);
                            }
                            r02.A04((Exception) null, str4, "messaging.navigation.drawer.folder.folderitem.HomeDrawerFolderItemInterfaceSpec", "getFolder", andIncrement2);
                        } catch (Throwable th) {
                            th = th;
                            r02.A04(e, str4, "messaging.navigation.drawer.folder.folderitem.HomeDrawerFolderItemInterfaceSpec", "getFolder", andIncrement2);
                            throw th;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        throw e;
                    }
                }
                if (C4M0.A02(c4m0)) {
                    int andIncrement4 = atomicInteger.getAndIncrement();
                    r02.A0A("com.facebook.messaging.marketplace.plugins.marketplacefolder.folderitem.MarketplaceFolderItem", "messaging.marketplace.marketplacefolder.folderitem.MarketplaceFolderItem", "com.facebook.messaging.navigation.plugins.interfaces.drawer.folder.folderitem.HomeDrawerFolderItemInterfaceSpec", andIncrement4, "messaging.navigation.drawer.folder.folderitem.HomeDrawerFolderItemInterfaceSpec", "com.facebook.messaging.marketplace.plugins.marketplacefolder.MarketplaceDrawerFolderKillSwitch", "getFolder");
                    MarketplaceFolderItem marketplaceFolderItem = c4m0.A02;
                    C4Mh A002 = C4Mi.A00(marketplaceFolderItem.A02, marketplaceFolderItem.A01);
                    if (r0.test(A002)) {
                        arrayList.add(A002);
                    }
                    r02.A04((Exception) null, "messaging.marketplace.marketplacefolder.folderitem.MarketplaceFolderItem", "messaging.navigation.drawer.folder.folderitem.HomeDrawerFolderItemInterfaceSpec", "getFolder", andIncrement4);
                }
                if (C4M0.A05(c4m0)) {
                    int andIncrement5 = atomicInteger.getAndIncrement();
                    r02.A0A("com.facebook.messaging.support.plugins.supportfolder.folderitem.SupportFolderItemImplementation", "messaging.support.supportfolder.folderitem.SupportFolderItemImplementation", "com.facebook.messaging.navigation.plugins.interfaces.drawer.folder.folderitem.HomeDrawerFolderItemInterfaceSpec", andIncrement5, "messaging.navigation.drawer.folder.folderitem.HomeDrawerFolderItemInterfaceSpec", "com.facebook.messaging.support.plugins.supportfolder.SupportFolderKillSwitch", "getFolder");
                    SupportFolderItemImplementation supportFolderItemImplementation = c4m0.A07;
                    if (supportFolderItemImplementation.A03.get()) {
                        Context context = supportFolderItemImplementation.A00;
                        2QB r03 = (2QB) 1Bi.A03(67269);
                        4MG r04 = 4MG.A03;
                        C1p8 c1p8 = r04.iconColor;
                        C1p8 c1p82 = r04.backgroundColor;
                        FolderNameDrawerFolderKey folderNameDrawerFolderKey = new FolderNameDrawerFolderKey(1F9.A0X);
                        4MH r05 = new 4MH(2MQ.A2f, c1p8, c1p82);
                        String A0u = 1BK.A0u(context, 2131966600);
                        int i3 = r03.A00.A01;
                        2Sh r06 = 2Sh.A01;
                        11T.A0B(r06);
                        new C4Mh(C4Mg.A08, r05, folderNameDrawerFolderKey, C4MJ.A00(context, r06, i3), null, A0u, null);
                    } else {
                        obj = null;
                    }
                    if (r0.test(obj)) {
                        arrayList.add(obj);
                    }
                    r02.A04((Exception) null, "messaging.support.supportfolder.folderitem.SupportFolderItemImplementation", "messaging.navigation.drawer.folder.folderitem.HomeDrawerFolderItemInterfaceSpec", "getFolder", andIncrement5);
                }
                if (C4M0.A06(c4m0)) {
                    int andIncrement6 = atomicInteger.getAndIncrement();
                    r02.A0A("com.facebook.messaging.wellbeing.unknowncontact.messagerequests.plugins.homedrawer.folderitem.MessageRequestsFolderItem", "messaging.wellbeing.unknowncontact.messagerequests.homedrawer.folderitem.MessageRequestsFolderItem", "com.facebook.messaging.navigation.plugins.interfaces.drawer.folder.folderitem.HomeDrawerFolderItemInterfaceSpec", andIncrement6, "messaging.navigation.drawer.folder.folderitem.HomeDrawerFolderItemInterfaceSpec", "com.facebook.messaging.wellbeing.unknowncontact.messagerequests.plugins.homedrawer.WellbeingUnknowncontactMessagerequestsHomedrawerKillSwitch", "getFolder");
                    MessageRequestsFolderItem messageRequestsFolderItem = c4m0.A08;
                    C4Mh A003 = C4Ml.A00(messageRequestsFolderItem.A00, messageRequestsFolderItem.A01);
                    if (r0.test(A003)) {
                        arrayList.add(A003);
                    }
                    r02.A04((Exception) null, "messaging.wellbeing.unknowncontact.messagerequests.homedrawer.folderitem.MessageRequestsFolderItem", "messaging.navigation.drawer.folder.folderitem.HomeDrawerFolderItemInterfaceSpec", "getFolder", andIncrement6);
                }
                if (C4M0.A01(c4m0)) {
                    andIncrement2 = atomicInteger.getAndIncrement();
                    str4 = "messaging.archivedchats.archive.folderitem.ArchiveFolderItem";
                    r02.A0A("com.facebook.messaging.archivedchats.plugins.archive.folderitem.ArchiveFolderItem", str4, "com.facebook.messaging.navigation.plugins.interfaces.drawer.folder.folderitem.HomeDrawerFolderItemInterfaceSpec", andIncrement2, "messaging.navigation.drawer.folder.folderitem.HomeDrawerFolderItemInterfaceSpec", "com.facebook.messaging.archivedchats.plugins.archive.ArchiveKillSwitch", "getFolder");
                    Context context2 = c4m0.A01.A00;
                    2QB r07 = (2QB) 1Bi.A03(67398);
                    4MG r08 = 4MG.A03;
                    C1p8 c1p83 = r08.iconColor;
                    C1p8 c1p84 = r08.backgroundColor;
                    FolderNameDrawerFolderKey folderNameDrawerFolderKey2 = new FolderNameDrawerFolderKey(1F9.A06);
                    4MH r09 = new 4MH(2MQ.A0Y, c1p83, c1p84);
                    String string = context2.getString(2131952886);
                    11T.A0A(string);
                    int i4 = r07.A00.A01;
                    2Sh r010 = 2Sh.A01;
                    11T.A0B(r010);
                    C4Mh c4Mh = new C4Mh(C4Mg.A08, r09, folderNameDrawerFolderKey2, C4MJ.A00(context2, r010, i4), null, string, null);
                    if (r0.test(c4Mh)) {
                        arrayList.add(c4Mh);
                    }
                    r02.A04((Exception) null, str4, "messaging.navigation.drawer.folder.folderitem.HomeDrawerFolderItemInterfaceSpec", "getFolder", andIncrement2);
                }
                if (C4M0.A03(c4m0)) {
                    int andIncrement7 = atomicInteger.getAndIncrement();
                    r02.A0A("com.facebook.messaging.nativepagereply.spam.plugins.spamfolder.folderitem.SpamFolderItemImplementation", "messaging.nativepagereply.spam.spamfolder.folderitem.SpamFolderItemImplementation", "com.facebook.messaging.navigation.plugins.interfaces.drawer.folder.folderitem.HomeDrawerFolderItemInterfaceSpec", andIncrement7, "messaging.navigation.drawer.folder.folderitem.HomeDrawerFolderItemInterfaceSpec", "com.facebook.messaging.nativepagereply.spam.plugins.spamfolder.SpamFolderKillSwitch", "getFolder");
                    try {
                        try {
                            Context context3 = c4m0.A04.A00;
                            4MG r011 = 4MG.A03;
                            C1p8 c1p85 = r011.iconColor;
                            C1p8 c1p86 = r011.backgroundColor;
                            FolderNameDrawerFolderKey folderNameDrawerFolderKey3 = new FolderNameDrawerFolderKey(1F9.A0O);
                            4MH r012 = new 4MH(2MQ.A30, c1p85, c1p86);
                            String A0u2 = 1BK.A0u(context3, 2131966126);
                            Parcelable.Creator creator = HeterogeneousMap.CREATOR;
                            C4Mh c4Mh2 = new C4Mh(C4Mg.A08, r012, folderNameDrawerFolderKey3, C1zz.A02(), null, A0u2, null);
                            if (r0.test(c4Mh2)) {
                                arrayList.add(c4Mh2);
                            }
                            r02.A09("messaging.nativepagereply.spam.spamfolder.folderitem.SpamFolderItemImplementation", "messaging.navigation.drawer.folder.folderitem.HomeDrawerFolderItemInterfaceSpec", "getFolder", andIncrement7);
                        } catch (Throwable th2) {
                            th = th2;
                            r02.A04(e, "messaging.nativepagereply.spam.spamfolder.folderitem.SpamFolderItemImplementation", "messaging.navigation.drawer.folder.folderitem.HomeDrawerFolderItemInterfaceSpec", "getFolder", andIncrement7);
                            throw th;
                        }
                    } catch (Exception e3) {
                        e = e3;
                        throw e;
                    }
                }
                if (r0.test((Object) null)) {
                    arrayList.add(null);
                }
                r02.A02((Exception) null, "messaging.navigation.drawer.folder.folderitem.HomeDrawerFolderItemInterfaceSpec", "getFolder", andIncrement3);
                this.A0E = arrayList;
                Object value2 = this.A0Q.getValue();
                11T.A0A(value2);
                C4Mq c4Mq = ((C4Mr) value2).A00.A00;
                int andIncrement8 = atomicInteger.getAndIncrement();
                1YC r013 = c4Mq.A0D;
                r013.A08("com.facebook.messaging.navigation.plugins.interfaces.drawer.folder.foldersection.HomeDrawerFolderSectionInterfaceSpec", "messaging.navigation.drawer.folder.foldersection.HomeDrawerFolderSectionInterfaceSpec", "getFolderSection", andIncrement8);
                Exception e4 = null;
                try {
                    ArrayList arrayList2 = new ArrayList(C4Mq.A00(c4Mq));
                    if (C4Mq.A05(c4Mq)) {
                        andIncrement = atomicInteger.getAndIncrement();
                        str = "messaging.navigation.drawerfoldersections.morefoldersection.MoreDrawerFolderImplementation";
                        r013.A0A("com.facebook.messaging.navigation.plugins.drawerfoldersections.morefoldersection.MoreDrawerFolderImplementation", str, "com.facebook.messaging.navigation.plugins.interfaces.drawer.folder.foldersection.HomeDrawerFolderSectionInterfaceSpec", andIncrement, "messaging.navigation.drawer.folder.foldersection.HomeDrawerFolderSectionInterfaceSpec", "com.facebook.messaging.navigation.plugins.drawerfoldersections.NavigationDrawerfoldersectionsKillSwitch", "getFolderSection");
                        try {
                            try {
                                MoreDrawerFolderImplementation moreDrawerFolderImplementation = c4Mq.A04;
                                Context context4 = moreDrawerFolderImplementation.A01;
                                FbUserSession A04 = 1Fw.A04((1EZ) 1Bu.A06(context4, 16428));
                                Integer num = 0S2.A0j;
                                String string2 = context4.getString(2131960474);
                                11T.A0A(string2);
                                ArrayList arrayList3 = new ArrayList();
                                if (((2VJ) 1Bi.A03(82490)).A04()) {
                                    C4Nl c4Nl = (C4Nl) 1Lm.A05(context4, A04, 33212);
                                    c4Nl.A00();
                                    FolderNameDrawerFolderKey folderNameDrawerFolderKey4 = new FolderNameDrawerFolderKey(1F9.A0F);
                                    4MH r014 = new 4MH(2MQ.A1S, C1u7.A08, C1p7.A07);
                                    String string3 = context4.getString(2131963179);
                                    11T.A0A(string3);
                                    C4Px c4Px = c4Nl.A00;
                                    if (c4Px != null) {
                                        Integer num2 = c4Px.A02;
                                        if (num2 != null) {
                                            i = num2.intValue();
                                            arrayList3.add(new C4Mh(C4Mg.A08, r014, folderNameDrawerFolderKey4, C4MJ.A00(context4, new C2g5().A00(), i), null, string3, null));
                                        }
                                    }
                                    i = 0;
                                    arrayList3.add(new C4Mh(C4Mg.A08, r014, folderNameDrawerFolderKey4, C4MJ.A00(context4, new C2g5().A00(), i), null, string3, null));
                                }
                                if (1Wi.A00((1Wi) 1Bi.A03(68470)).AZk(36320279276698894L)) {
                                    DiscoverPublicChannelsDrawerFolderKey discoverPublicChannelsDrawerFolderKey = new DiscoverPublicChannelsDrawerFolderKey(1BJ.A00(231));
                                    4MH r015 = new 4MH(2MQ.A0a, C1u7.A08, C1p7.A07);
                                    String A0u3 = 1BK.A0u(context4, 2131966539);
                                    Parcelable.Creator creator2 = HeterogeneousMap.CREATOR;
                                    arrayList3.add(new C4Mh(C4Mg.A08, r015, discoverPublicChannelsDrawerFolderKey, C1zz.A02(), null, A0u3, null));
                                }
                                if (((1Wi) 1Bi.A03(68470)).A03() && moreDrawerFolderImplementation.A00) {
                                    PublicChannelsInvitesDrawerFolderKey publicChannelsInvitesDrawerFolderKey = new PublicChannelsInvitesDrawerFolderKey("public_channel_invites");
                                    4MH r016 = new 4MH(2MQ.A0a, C1u7.A08, C1p7.A07);
                                    String string4 = context4.getString(2131963973);
                                    11T.A0A(string4);
                                    arrayList3.add(new C4Mh(C4Mg.A08, r016, publicChannelsInvitesDrawerFolderKey, C4MJ.A00(context4, new C2g5().A00(), ((2QB) ((6BU) moreDrawerFolderImplementation.A03.A00.get())).A00.A01), null, string4, null));
                                }
                                if (1pQ.A00((1pQ) 1Bn.A0A(68662)).AZk(36324595711692599L)) {
                                    FolderNameDrawerFolderKey folderNameDrawerFolderKey5 = new FolderNameDrawerFolderKey(1F9.A0L);
                                    2MQ r017 = 2MQ.A37;
                                    4MG r018 = 4MG.A03;
                                    4MH r019 = new 4MH(r017, r018.iconColor, r018.backgroundColor);
                                    String A0u4 = 1BK.A0u(context4, 2131959418);
                                    Parcelable.Creator creator3 = HeterogeneousMap.CREATOR;
                                    arrayList3.add(new C4Mh(C4Mg.A08, r019, folderNameDrawerFolderKey5, C1zz.A02(), null, A0u4, null));
                                }
                                if (((1qI) 1Bi.A03(66409)).A0J(A04) && MoreDrawerFolderImplementation.A00() != 0) {
                                    AiHomeDrawerFolderKey aiHomeDrawerFolderKey = new AiHomeDrawerFolderKey(1F9.A05);
                                    4MH r020 = new 4MH(2MQ.A08, C1u7.A08, C1p7.A07);
                                    String string5 = context4.getString(MoreDrawerFolderImplementation.A00());
                                    11T.A0A(string5);
                                    Parcelable.Creator creator4 = HeterogeneousMap.CREATOR;
                                    arrayList3.add(new C4Mh(C4Mg.A08, r020, aiHomeDrawerFolderKey, C1zz.A02(), null, string5, null));
                                }
                                arrayList2.add(new C4N3(null, num, 0S2.A01, string2, null, null, arrayList3));
                                r013.A04((Exception) null, str, "messaging.navigation.drawer.folder.foldersection.HomeDrawerFolderSectionInterfaceSpec", "getFolderSection", andIncrement);
                            } catch (Throwable th3) {
                                r013.A04(e4, str, "messaging.navigation.drawer.folder.foldersection.HomeDrawerFolderSectionInterfaceSpec", "getFolderSection", andIncrement);
                                throw th3;
                            }
                        } catch (Exception e5) {
                            e4 = e5;
                            throw e4;
                        }
                    }
                    if (C4Mq.A01(c4Mq)) {
                        int andIncrement9 = atomicInteger.getAndIncrement();
                        r013.A0A("com.facebook.messaging.navigation.plugins.communities.communitiesdrawerfolder.CommunitiesDrawerFolderImplementation", "messaging.navigation.communities.communitiesdrawerfolder.CommunitiesDrawerFolderImplementation", "com.facebook.messaging.navigation.plugins.interfaces.drawer.folder.foldersection.HomeDrawerFolderSectionInterfaceSpec", andIncrement9, "messaging.navigation.drawer.folder.foldersection.HomeDrawerFolderSectionInterfaceSpec", "com.facebook.messaging.navigation.plugins.communities.NavigationCommunitiesKillSwitch", "getFolderSection");
                        CommunitiesDrawerFolderImplementation communitiesDrawerFolderImplementation = c4Mq.A00;
                        Context context5 = communitiesDrawerFolderImplementation.A02;
                        String string6 = context5.getString(2131954435);
                        11T.A0A(string6);
                        List<Community> list = communitiesDrawerFolderImplementation.A01;
                        ArrayList arrayList4 = new ArrayList();
                        for (Object obj2 : list) {
                            if (((Community) obj2).A05 != 1) {
                                arrayList4.add(obj2);
                            }
                        }
                        if ((!arrayList4.isEmpty()) && 1WY.A01((1WY) communitiesDrawerFolderImplementation.A07.A00.get()).AZk(36318380893942276L)) {
                            str2 = context5.getString(2131954434);
                            str3 = context5.getString(2131954433);
                            cza = CZA.A00;
                        } else {
                            str2 = null;
                            str3 = null;
                            cza = null;
                        }
                        Integer num3 = communitiesDrawerFolderImplementation.A0D.get() ? 0S2.A01 : 0S2.A00;
                        Integer num4 = 0S2.A00;
                        ArrayList arrayList5 = new ArrayList();
                        if (!list.isEmpty()) {
                            boolean AZk = 1WY.A01((1WY) communitiesDrawerFolderImplementation.A07.A00.get()).AZk(36318380893942276L);
                            for (Community community : list) {
                                if (!AZk || !community.A0a) {
                                    if (community.A0M == C20M.A03 && ((2Zl) 1Br.A0B(communitiesDrawerFolderImplementation.A09)).A01()) {
                                        A03 = C4N1.A00(context5, community);
                                    } else {
                                        C4Lg c4Lg = (C4Lg) communitiesDrawerFolderImplementation.A08.A00.get();
                                        String str5 = community.A0U;
                                        11T.A0A(str5);
                                        String str6 = communitiesDrawerFolderImplementation.A0C;
                                        CommunityNewBadgeStatus A02 = community.A02();
                                        11T.A0A(A02);
                                        boolean A004 = C4Lg.A00(c4Lg, A02, str5, str6);
                                        C4N1 c4n1 = C4Se.A00;
                                        FbUserSession fbUserSession = communitiesDrawerFolderImplementation.A04;
                                        if (A004) {
                                            context5.getString(2131962078);
                                            A03 = c4n1.A03(context5, fbUserSession, community, C4Mg.A06);
                                        } else {
                                            A03 = c4n1.A03(context5, fbUserSession, community, C4Mg.A06);
                                        }
                                    }
                                    arrayList5.add(A03);
                                }
                            }
                            if (AZk && !list.isEmpty() && !(!arrayList5.isEmpty())) {
                                String string7 = context5.getString(2131963377);
                                11T.A0A(string7);
                                arrayList5.add(C4N1.A02(string7));
                            }
                        }
                        C00i c00i = communitiesDrawerFolderImplementation.A07.A00;
                        if (1WY.A01((1WY) c00i.get()).AZk(36319682269034744L)) {
                            String A0u5 = 1BK.A0u(context5, 2131955822);
                            DiscoverCommunitiesDrawerFolderKey discoverCommunitiesDrawerFolderKey = new DiscoverCommunitiesDrawerFolderKey(4YT.A00(1042));
                            B5z b5z = new B5z(C1u3.A1p);
                            Parcelable.Creator creator5 = HeterogeneousMap.CREATOR;
                            arrayList5.add(new C4Mh(C4Mg.A08, b5z, discoverCommunitiesDrawerFolderKey, C1zz.A02(), null, A0u5, null));
                        }
                        if (1WY.A01((1WY) c00i.get()).AZk(36321834048308047L)) {
                            String string8 = context5.getString(2131955219);
                            11T.A0A(string8);
                            arrayList5.add(C4N1.A01(string8));
                        }
                        arrayList2.add(new C4N3(cza, num4, num3, string6, str2, str3, arrayList5));
                        r013.A04((Exception) null, "messaging.navigation.communities.communitiesdrawerfolder.CommunitiesDrawerFolderImplementation", "messaging.navigation.drawer.folder.foldersection.HomeDrawerFolderSectionInterfaceSpec", "getFolderSection", andIncrement9);
                    }
                    if (C4Mq.A03(c4Mq)) {
                        int andIncrement10 = atomicInteger.getAndIncrement();
                        r013.A0A("com.facebook.messaging.navigation.plugins.communities.standalonecommunitiesdrawerfolder.StandaloneCommunitiesDrawerFolderImplementation", "messaging.navigation.communities.standalonecommunitiesdrawerfolder.StandaloneCommunitiesDrawerFolderImplementation", "com.facebook.messaging.navigation.plugins.interfaces.drawer.folder.foldersection.HomeDrawerFolderSectionInterfaceSpec", andIncrement10, "messaging.navigation.drawer.folder.foldersection.HomeDrawerFolderSectionInterfaceSpec", "com.facebook.messaging.navigation.plugins.communities.NavigationCommunitiesKillSwitch", "getFolderSection");
                        StandaloneCommunitiesDrawerFolderImplementation standaloneCommunitiesDrawerFolderImplementation = c4Mq.A02;
                        arrayList2.add(((4UM) standaloneCommunitiesDrawerFolderImplementation.A01.A00.get()).A00(standaloneCommunitiesDrawerFolderImplementation.A00, CommunityMessagingCommunityType.A03));
                        r013.A04((Exception) null, "messaging.navigation.communities.standalonecommunitiesdrawerfolder.StandaloneCommunitiesDrawerFolderImplementation", "messaging.navigation.drawer.folder.foldersection.HomeDrawerFolderSectionInterfaceSpec", "getFolderSection", andIncrement10);
                    }
                    if (C4Mq.A02(c4Mq)) {
                        int andIncrement11 = atomicInteger.getAndIncrement();
                        r013.A0A("com.facebook.messaging.navigation.plugins.communities.fbcommunitiesdrawerfolder.FbCommunitiesDrawerFolderImplementation", "messaging.navigation.communities.fbcommunitiesdrawerfolder.FbCommunitiesDrawerFolderImplementation", "com.facebook.messaging.navigation.plugins.interfaces.drawer.folder.foldersection.HomeDrawerFolderSectionInterfaceSpec", andIncrement11, "messaging.navigation.drawer.folder.foldersection.HomeDrawerFolderSectionInterfaceSpec", "com.facebook.messaging.navigation.plugins.communities.NavigationCommunitiesKillSwitch", "getFolderSection");
                        FbCommunitiesDrawerFolderImplementation fbCommunitiesDrawerFolderImplementation = c4Mq.A01;
                        arrayList2.add(((4UM) fbCommunitiesDrawerFolderImplementation.A01.A00.get()).A00(fbCommunitiesDrawerFolderImplementation.A00, CommunityMessagingCommunityType.A02));
                        r013.A04((Exception) null, "messaging.navigation.communities.fbcommunitiesdrawerfolder.FbCommunitiesDrawerFolderImplementation", "messaging.navigation.drawer.folder.foldersection.HomeDrawerFolderSectionInterfaceSpec", "getFolderSection", andIncrement11);
                    }
                    if (C4Mq.A04(c4Mq)) {
                        int andIncrement12 = atomicInteger.getAndIncrement();
                        r013.A0A("com.facebook.messaging.navigation.plugins.communities.zerochatsuggestioncommunitiesdrawerfolder.ZeroChatSuggestionCommunitiesDrawerFolderImplementation", "messaging.navigation.communities.zerochatsuggestioncommunitiesdrawerfolder.ZeroChatSuggestionCommunitiesDrawerFolderImplementation", "com.facebook.messaging.navigation.plugins.interfaces.drawer.folder.foldersection.HomeDrawerFolderSectionInterfaceSpec", andIncrement12, "messaging.navigation.drawer.folder.foldersection.HomeDrawerFolderSectionInterfaceSpec", "com.facebook.messaging.navigation.plugins.communities.NavigationCommunitiesKillSwitch", "getFolderSection");
                        ZeroChatSuggestionCommunitiesDrawerFolderImplementation zeroChatSuggestionCommunitiesDrawerFolderImplementation = c4Mq.A03;
                        Integer num5 = 0S2.A01;
                        String string9 = zeroChatSuggestionCommunitiesDrawerFolderImplementation.A03.getString(2131968260);
                        11T.A0A(string9);
                        List list2 = zeroChatSuggestionCommunitiesDrawerFolderImplementation.A02;
                        Integer num6 = zeroChatSuggestionCommunitiesDrawerFolderImplementation.A01;
                        if (num6 == null) {
                            num6 = 0S2.A00;
                        }
                        arrayList2.add(new C4N3(null, num5, num6, string9, null, null, list2));
                        r013.A04((Exception) null, "messaging.navigation.communities.zerochatsuggestioncommunitiesdrawerfolder.ZeroChatSuggestionCommunitiesDrawerFolderImplementation", "messaging.navigation.drawer.folder.foldersection.HomeDrawerFolderSectionInterfaceSpec", "getFolderSection", andIncrement12);
                    }
                    if (C4Mq.A06(c4Mq)) {
                        andIncrement = atomicInteger.getAndIncrement();
                        str = "messaging.navigation.travel.traveldrawerfolder.TravelDrawerFolderImplementation";
                        r013.A0A("com.facebook.messaging.navigation.plugins.travel.traveldrawerfolder.TravelDrawerFolderImplementation", str, "com.facebook.messaging.navigation.plugins.interfaces.drawer.folder.foldersection.HomeDrawerFolderSectionInterfaceSpec", andIncrement, "messaging.navigation.drawer.folder.foldersection.HomeDrawerFolderSectionInterfaceSpec", "com.facebook.messaging.navigation.plugins.travel.NavigationTravelKillSwitch", "getFolderSection");
                        TravelDrawerFolderImplementation travelDrawerFolderImplementation = c4Mq.A05;
                        if (travelDrawerFolderImplementation.A00 == null) {
                            FbUserSession A06 = 1Fw.A06(1Bu.A06(travelDrawerFolderImplementation.A02, 16428));
                            GraphQlQueryParamSet graphQlQueryParamSet = new GraphQlQueryParamSet();
                            graphQlQueryParamSet.A05("device_serial", "");
                            2Jf r021 = new 2Jf(2JX.class, (Class) null, "ActiveOculusEntitlementsQuery", (String) null, "fbandroid", 1665310375, 0, 2229003449L, 2229003449L, false, true);
                            r021.A00 = graphQlQueryParamSet;
                            2aK.A03((Integer) null, (0DE) null, new AJf(travelDrawerFolderImplementation, C3sa.A00(r021), A06, null, 5), 2Zy.A01(2Zo.A00()), 3);
                        }
                        Integer num7 = 0S2.A0Y;
                        List list3 = travelDrawerFolderImplementation.A01;
                        Integer num8 = travelDrawerFolderImplementation.A00;
                        if (num8 == null) {
                            num8 = 0S2.A00;
                        }
                        arrayList2.add(new C4N3(null, num7, num8, "Play", null, null, list3));
                        r013.A09(str, "messaging.navigation.drawer.folder.foldersection.HomeDrawerFolderSectionInterfaceSpec", "getFolderSection", andIncrement);
                    }
                    while (arrayList2.size() < C4Mq.A00(c4Mq)) {
                        arrayList2.add(null);
                    }
                    r013.A02((Exception) null, "messaging.navigation.drawer.folder.foldersection.HomeDrawerFolderSectionInterfaceSpec", "getFolderSection", andIncrement8);
                    this.A0F = arrayList2;
                    Object value3 = this.A0R.getValue();
                    11T.A0A(value3);
                    C4N5 c4n5 = ((C4N6) value3).A00.A00;
                    int andIncrement13 = atomicInteger.getAndIncrement();
                    1YC r022 = c4n5.A02;
                    r022.A08("com.facebook.messaging.navigation.plugins.interfaces.drawer.header.HomeDrawerHeaderInterfaceSpec", "messaging.navigation.drawer.header.HomeDrawerHeaderInterfaceSpec", "getDrawerHeader", andIncrement13);
                    4ND r306 = null;
                    try {
                        if (C4N5.A00(c4n5)) {
                            int andIncrement14 = atomicInteger.getAndIncrement();
                            try {
                                r022.A0A("com.facebook.messaging.settings.plugins.iadrawer.drawerheader.MeSettingsDrawerHeaderImplementation", "messaging.settings.iadrawer.drawerheader.MeSettingsDrawerHeaderImplementation", "com.facebook.messaging.navigation.plugins.interfaces.drawer.header.HomeDrawerHeaderInterfaceSpec", andIncrement14, "messaging.navigation.drawer.header.HomeDrawerHeaderInterfaceSpec", "com.facebook.messaging.settings.plugins.iadrawer.SettingsIadrawerKillSwitch", "getDrawerHeader");
                                try {
                                    MeSettingsDrawerHeaderImplementation meSettingsDrawerHeaderImplementation = c4n5.A00;
                                    if (((AbS) meSettingsDrawerHeaderImplementation.A04.A00.get()).A00()) {
                                        new 8NF(MeSettingsDrawerHeaderImplementation.A00(meSettingsDrawerHeaderImplementation));
                                    } else {
                                        r306 = MeSettingsDrawerHeaderImplementation.A00(meSettingsDrawerHeaderImplementation);
                                    }
                                    r022.A04((Exception) null, "messaging.settings.iadrawer.drawerheader.MeSettingsDrawerHeaderImplementation", "messaging.navigation.drawer.header.HomeDrawerHeaderInterfaceSpec", "getDrawerHeader", andIncrement14);
                                } catch (Exception e6) {
                                    throw e6;
                                }
                            } catch (Throwable th4) {
                                r022.A04((Exception) null, "messaging.settings.iadrawer.drawerheader.MeSettingsDrawerHeaderImplementation", "messaging.navigation.drawer.header.HomeDrawerHeaderInterfaceSpec", "getDrawerHeader", andIncrement14);
                                throw th4;
                            }
                        }
                        r022.A02((Exception) null, "messaging.navigation.drawer.header.HomeDrawerHeaderInterfaceSpec", "getDrawerHeader", andIncrement13);
                        this.A08 = r306;
                        C00j.A01(1896033457);
                    } catch (Throwable th5) {
                        th = th5;
                        r022.A02((Exception) null, "messaging.navigation.drawer.header.HomeDrawerHeaderInterfaceSpec", "getDrawerHeader", andIncrement13);
                        throw th;
                    }
                } catch (Throwable th6) {
                    r013.A02(e4, "messaging.navigation.drawer.folder.foldersection.HomeDrawerFolderSectionInterfaceSpec", "getFolderSection", andIncrement8);
                    throw th6;
                }
            } catch (Throwable th7) {
                th = th7;
                r02.A02(e, "messaging.navigation.drawer.folder.folderitem.HomeDrawerFolderItemInterfaceSpec", "getFolder", andIncrement3);
                throw th;
            }
        } catch (Throwable th8) {
            C00j.A01(700574549);
            throw th8;
        }
    }

    public final void A1g() {
        C4Mq c4Mq;
        int andIncrement;
        1YC r0;
        int i;
        int i2;
        int andIncrement2;
        String str;
        C00j.A05("HomeDrawerFragmentBase.subscribe", 525099425);
        try {
            if (this.A0H) {
                i2 = -449447182;
            } else {
                this.A0H = true;
                C4Lm A1Y = A1Y();
                ((QuickPerformanceLogger) A1Y.A02.A00.get()).markerPoint(231281612, "ON_SUBSCRIBE_TO_DATA");
                ((5Ty) A1Y.A01.A00.get()).A0K("ON_SUBSCRIBE_TO_DATA");
                Object value = this.A0R.getValue();
                11T.A0A(value);
                C4N5 c4n5 = ((C4N6) value).A00.A00;
                AtomicInteger atomicInteger = C1Y6.A04;
                int andIncrement3 = atomicInteger.getAndIncrement();
                1YC r02 = c4n5.A02;
                r02.A08("com.facebook.messaging.navigation.plugins.interfaces.drawer.header.HomeDrawerHeaderInterfaceSpec", "messaging.navigation.drawer.header.HomeDrawerHeaderInterfaceSpec", "subscribe", andIncrement3);
                try {
                    if (C4N5.A00(c4n5)) {
                        int andIncrement4 = atomicInteger.getAndIncrement();
                        try {
                            r02.A0A("com.facebook.messaging.settings.plugins.iadrawer.drawerheader.MeSettingsDrawerHeaderImplementation", "messaging.settings.iadrawer.drawerheader.MeSettingsDrawerHeaderImplementation", "com.facebook.messaging.navigation.plugins.interfaces.drawer.header.HomeDrawerHeaderInterfaceSpec", andIncrement4, "messaging.navigation.drawer.header.HomeDrawerHeaderInterfaceSpec", "com.facebook.messaging.settings.plugins.iadrawer.SettingsIadrawerKillSwitch", "subscribe");
                            try {
                                MeSettingsDrawerHeaderImplementation meSettingsDrawerHeaderImplementation = c4n5.A00;
                                ((4IC) meSettingsDrawerHeaderImplementation.A02.A00.get()).A03(meSettingsDrawerHeaderImplementation.A05);
                                meSettingsDrawerHeaderImplementation.A06.A03("settings");
                                r02.A04((Exception) null, "messaging.settings.iadrawer.drawerheader.MeSettingsDrawerHeaderImplementation", "messaging.navigation.drawer.header.HomeDrawerHeaderInterfaceSpec", "subscribe", andIncrement4);
                                r02.A02((Exception) null, "messaging.navigation.drawer.header.HomeDrawerHeaderInterfaceSpec", "subscribe", andIncrement3);
                            } catch (Exception e) {
                                throw e;
                            }
                        } catch (Throwable th) {
                            r02.A04((Exception) null, "messaging.settings.iadrawer.drawerheader.MeSettingsDrawerHeaderImplementation", "messaging.navigation.drawer.header.HomeDrawerHeaderInterfaceSpec", "subscribe", andIncrement4);
                            throw th;
                        }
                    } else {
                        r02.A02((Exception) null, "messaging.navigation.drawer.header.HomeDrawerHeaderInterfaceSpec", "subscribe", andIncrement3);
                    }
                    Object value2 = this.A0P.getValue();
                    11T.A0A(value2);
                    C4M0 c4m0 = ((C4M1) value2).A00.A00;
                    int andIncrement5 = atomicInteger.getAndIncrement();
                    1YC r03 = c4m0.A0I;
                    r03.A08("com.facebook.messaging.navigation.plugins.interfaces.drawer.folder.folderitem.HomeDrawerFolderItemInterfaceSpec", "messaging.navigation.drawer.folder.folderitem.HomeDrawerFolderItemInterfaceSpec", "subscribe", andIncrement5);
                    Exception e2 = null;
                    try {
                        C4M0.A00(c4m0);
                        if (C4M0.A02(c4m0)) {
                            andIncrement2 = atomicInteger.getAndIncrement();
                            str = "messaging.marketplace.marketplacefolder.folderitem.MarketplaceFolderItem";
                            r03.A0A("com.facebook.messaging.marketplace.plugins.marketplacefolder.folderitem.MarketplaceFolderItem", str, "com.facebook.messaging.navigation.plugins.interfaces.drawer.folder.folderitem.HomeDrawerFolderItemInterfaceSpec", andIncrement2, "messaging.navigation.drawer.folder.folderitem.HomeDrawerFolderItemInterfaceSpec", "com.facebook.messaging.marketplace.plugins.marketplacefolder.MarketplaceDrawerFolderKillSwitch", "subscribe");
                            try {
                                try {
                                    MarketplaceFolderItem marketplaceFolderItem = c4m0.A02;
                                    1BV r04 = new 1BV(83430);
                                    User user = (User) r04.get();
                                    if (user != null && user.A13 != null) {
                                        2FR A03 = 2FR.A03(((AnonymousClass472) 1Bu.A06(marketplaceFolderItem.A02, 67579)).A00(new UserKey(1Js.A03, ((User) r04.get()).A13)).A00());
                                        11T.A0A(A03);
                                        1Kd.A0F(new 4WX(marketplaceFolderItem, 3), A03, (ExecutorService) marketplaceFolderItem.A03.A00.get());
                                        marketplaceFolderItem.A00 = A03;
                                    }
                                    r03.A04((Exception) null, str, "messaging.navigation.drawer.folder.folderitem.HomeDrawerFolderItemInterfaceSpec", "subscribe", andIncrement2);
                                } catch (Throwable th2) {
                                    r03.A04(e2, str, "messaging.navigation.drawer.folder.folderitem.HomeDrawerFolderItemInterfaceSpec", "subscribe", andIncrement2);
                                    throw th2;
                                }
                            } catch (Exception e3) {
                                e2 = e3;
                                throw e2;
                            }
                        }
                        if (C4M0.A05(c4m0)) {
                            int andIncrement6 = atomicInteger.getAndIncrement();
                            r03.A0A("com.facebook.messaging.support.plugins.supportfolder.folderitem.SupportFolderItemImplementation", "messaging.support.supportfolder.folderitem.SupportFolderItemImplementation", "com.facebook.messaging.navigation.plugins.interfaces.drawer.folder.folderitem.HomeDrawerFolderItemInterfaceSpec", andIncrement6, "messaging.navigation.drawer.folder.folderitem.HomeDrawerFolderItemInterfaceSpec", "com.facebook.messaging.support.plugins.supportfolder.SupportFolderKillSwitch", "subscribe");
                            SupportFolderItemImplementation supportFolderItemImplementation = c4m0.A07;
                            FbUserSession A04 = 1Fw.A04((1EZ) 1Bu.A06(supportFolderItemImplementation.A00, 16428));
                            4TR r05 = (4TR) supportFolderItemImplementation.A01.A00.get();
                            4WX r06 = new 4WX(supportFolderItemImplementation, 5);
                            11T.A0F(A04, 0);
                            GraphQlQueryParamSet graphQlQueryParamSet = new GraphQlQueryParamSet();
                            i = 0;
                            2Jf r07 = new 2Jf(2JX.class, (Class) null, "SupportFolderVisibilityQuery", (String) null, "fbandroid", 1071000519, 0, 1410623790L, 1410623790L, false, true);
                            r07.A00 = graphQlQueryParamSet;
                            C3sa A00 = C3sa.A00(r07);
                            Context context = (Context) r05.A00.A00.get();
                            C00s.A00();
                            1FV A09 = 1VX.A0D(context).A09(A00);
                            11T.A0D(A09);
                            1Kd.A0F(new C4Wa(r06, r06, 0), A09, (ExecutorService) r05.A01.A00.get());
                            supportFolderItemImplementation.A04.set(A09);
                            r03.A04((Exception) null, "messaging.support.supportfolder.folderitem.SupportFolderItemImplementation", "messaging.navigation.drawer.folder.folderitem.HomeDrawerFolderItemInterfaceSpec", "subscribe", andIncrement6);
                        }
                        if (C4M0.A06(c4m0)) {
                            andIncrement2 = atomicInteger.getAndIncrement();
                            str = "messaging.wellbeing.unknowncontact.messagerequests.homedrawer.folderitem.MessageRequestsFolderItem";
                            r03.A0A("com.facebook.messaging.wellbeing.unknowncontact.messagerequests.plugins.homedrawer.folderitem.MessageRequestsFolderItem", str, "com.facebook.messaging.navigation.plugins.interfaces.drawer.folder.folderitem.HomeDrawerFolderItemInterfaceSpec", andIncrement2, "messaging.navigation.drawer.folder.folderitem.HomeDrawerFolderItemInterfaceSpec", "com.facebook.messaging.wellbeing.unknowncontact.messagerequests.plugins.homedrawer.WellbeingUnknowncontactMessagerequestsHomedrawerKillSwitch", "subscribe");
                            MessageRequestsFolderItem messageRequestsFolderItem = c4m0.A08;
                            ((C4Mm) messageRequestsFolderItem.A02.A00.get()).A03(messageRequestsFolderItem.A03);
                            r03.A04((Exception) null, str, "messaging.navigation.drawer.folder.folderitem.HomeDrawerFolderItemInterfaceSpec", "subscribe", andIncrement2);
                        }
                        r03.A02((Exception) null, "messaging.navigation.drawer.folder.folderitem.HomeDrawerFolderItemInterfaceSpec", "subscribe", andIncrement5);
                        Object value3 = this.A0Q.getValue();
                        11T.A0A(value3);
                        c4Mq = ((C4Mr) value3).A00.A00;
                        andIncrement = atomicInteger.getAndIncrement();
                        r0 = c4Mq.A0D;
                        r0.A08("com.facebook.messaging.navigation.plugins.interfaces.drawer.folder.foldersection.HomeDrawerFolderSectionInterfaceSpec", "messaging.navigation.drawer.folder.foldersection.HomeDrawerFolderSectionInterfaceSpec", "subscribe", andIncrement);
                    } catch (Throwable th3) {
                        th = th3;
                        r03.A02(e2, "messaging.navigation.drawer.folder.folderitem.HomeDrawerFolderItemInterfaceSpec", "subscribe", andIncrement5);
                    }
                } catch (Throwable th4) {
                    th = th4;
                    r02.A02((Exception) null, "messaging.navigation.drawer.header.HomeDrawerHeaderInterfaceSpec", "subscribe", andIncrement3);
                }
                try {
                    try {
                        if (C4Mq.A05(c4Mq)) {
                            i = atomicInteger.getAndIncrement();
                            r0.A0A("com.facebook.messaging.navigation.plugins.drawerfoldersections.morefoldersection.MoreDrawerFolderImplementation", "messaging.navigation.drawerfoldersections.morefoldersection.MoreDrawerFolderImplementation", "com.facebook.messaging.navigation.plugins.interfaces.drawer.folder.foldersection.HomeDrawerFolderSectionInterfaceSpec", i, "messaging.navigation.drawer.folder.foldersection.HomeDrawerFolderSectionInterfaceSpec", "com.facebook.messaging.navigation.plugins.drawerfoldersections.NavigationDrawerfoldersectionsKillSwitch", "subscribe");
                            try {
                                MoreDrawerFolderImplementation moreDrawerFolderImplementation = c4Mq.A04;
                                if (((1Wi) 1Bi.A03(68470)).A03()) {
                                    C00i c00i = moreDrawerFolderImplementation.A02.A00;
                                    C4Tf c4Tf = (C4Tf) c00i.get();
                                    c4Tf.A00 = (22I) 1Lm.A05(moreDrawerFolderImplementation.A01, c4Tf.A01, 33183);
                                    C4Tf c4Tf2 = (C4Tf) c00i.get();
                                    C4Nh c4Nh = moreDrawerFolderImplementation.A04;
                                    11T.A0F(c4Nh, 0);
                                    c4Tf2.A03.add(c4Nh);
                                    22I r08 = c4Tf2.A00;
                                    if (r08 == null) {
                                        11T.A0L("mailboxCommunity");
                                        th = 0Q8.createAndThrow();
                                        throw th;
                                    }
                                    1Um AQV = r08.mMailboxApiHandleMetaProvider.AQV(0);
                                    MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(AQV);
                                    if (!AQV.Cj2(new C4W0(r08, mailboxFutureImpl, 0))) {
                                        mailboxFutureImpl.cancel(false);
                                    }
                                    mailboxFutureImpl.addResultCallback((ScheduledExecutorService) c4Tf2.A02.A00.get(), new C4Vw(c4Tf2, 2));
                                }
                                r0.A04((Exception) null, "messaging.navigation.drawerfoldersections.morefoldersection.MoreDrawerFolderImplementation", "messaging.navigation.drawer.folder.foldersection.HomeDrawerFolderSectionInterfaceSpec", "subscribe", i);
                            } catch (Exception e4) {
                                throw e4;
                            }
                        }
                        if (C4Mq.A01(c4Mq)) {
                            int andIncrement7 = atomicInteger.getAndIncrement();
                            r0.A0A("com.facebook.messaging.navigation.plugins.communities.communitiesdrawerfolder.CommunitiesDrawerFolderImplementation", "messaging.navigation.communities.communitiesdrawerfolder.CommunitiesDrawerFolderImplementation", "com.facebook.messaging.navigation.plugins.interfaces.drawer.folder.foldersection.HomeDrawerFolderSectionInterfaceSpec", andIncrement7, "messaging.navigation.drawer.folder.foldersection.HomeDrawerFolderSectionInterfaceSpec", "com.facebook.messaging.navigation.plugins.communities.NavigationCommunitiesKillSwitch", "subscribe");
                            CommunitiesDrawerFolderImplementation communitiesDrawerFolderImplementation = c4Mq.A00;
                            LiveData liveData = communitiesDrawerFolderImplementation.A00;
                            if (liveData != null) {
                                liveData.observeForever(communitiesDrawerFolderImplementation.A03);
                            }
                            FbUserSession fbUserSession = communitiesDrawerFolderImplementation.A04;
                            if (1WY.A01((1WY) communitiesDrawerFolderImplementation.A07.A00.get()).AZk(36315340065415963L)) {
                                22I r09 = (22I) 1Lm.A05(communitiesDrawerFolderImplementation.A02, fbUserSession, 33183);
                                if (r09 != null) {
                                    r09.A0C(new MailboxCallback() { // from class: X.4Vz
                                        @Override // com.facebook.msys.mca.MailboxCallback
                                        public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
                                        }
                                    }, ((AnonymousClass224) communitiesDrawerFolderImplementation.A0A.A00.get()).A00("612618412962237"));
                                }
                            }
                            r0.A04((Exception) null, "messaging.navigation.communities.communitiesdrawerfolder.CommunitiesDrawerFolderImplementation", "messaging.navigation.drawer.folder.foldersection.HomeDrawerFolderSectionInterfaceSpec", "subscribe", andIncrement7);
                        }
                        if (C4Mq.A03(c4Mq)) {
                            int andIncrement8 = atomicInteger.getAndIncrement();
                            r0.A0A("com.facebook.messaging.navigation.plugins.communities.standalonecommunitiesdrawerfolder.StandaloneCommunitiesDrawerFolderImplementation", "messaging.navigation.communities.standalonecommunitiesdrawerfolder.StandaloneCommunitiesDrawerFolderImplementation", "com.facebook.messaging.navigation.plugins.interfaces.drawer.folder.foldersection.HomeDrawerFolderSectionInterfaceSpec", andIncrement8, "messaging.navigation.drawer.folder.foldersection.HomeDrawerFolderSectionInterfaceSpec", "com.facebook.messaging.navigation.plugins.communities.NavigationCommunitiesKillSwitch", "subscribe");
                            StandaloneCommunitiesDrawerFolderImplementation standaloneCommunitiesDrawerFolderImplementation = c4Mq.A02;
                            ((4UM) standaloneCommunitiesDrawerFolderImplementation.A01.A00.get()).A01(standaloneCommunitiesDrawerFolderImplementation.A00, CommunityMessagingCommunityType.A03, standaloneCommunitiesDrawerFolderImplementation.A02);
                            r0.A04((Exception) null, "messaging.navigation.communities.standalonecommunitiesdrawerfolder.StandaloneCommunitiesDrawerFolderImplementation", "messaging.navigation.drawer.folder.foldersection.HomeDrawerFolderSectionInterfaceSpec", "subscribe", andIncrement8);
                        }
                        if (C4Mq.A02(c4Mq)) {
                            int andIncrement9 = atomicInteger.getAndIncrement();
                            r0.A0A("com.facebook.messaging.navigation.plugins.communities.fbcommunitiesdrawerfolder.FbCommunitiesDrawerFolderImplementation", "messaging.navigation.communities.fbcommunitiesdrawerfolder.FbCommunitiesDrawerFolderImplementation", "com.facebook.messaging.navigation.plugins.interfaces.drawer.folder.foldersection.HomeDrawerFolderSectionInterfaceSpec", andIncrement9, "messaging.navigation.drawer.folder.foldersection.HomeDrawerFolderSectionInterfaceSpec", "com.facebook.messaging.navigation.plugins.communities.NavigationCommunitiesKillSwitch", "subscribe");
                            FbCommunitiesDrawerFolderImplementation fbCommunitiesDrawerFolderImplementation = c4Mq.A01;
                            ((4UM) fbCommunitiesDrawerFolderImplementation.A01.A00.get()).A01(fbCommunitiesDrawerFolderImplementation.A00, CommunityMessagingCommunityType.A02, fbCommunitiesDrawerFolderImplementation.A02);
                            r0.A04((Exception) null, "messaging.navigation.communities.fbcommunitiesdrawerfolder.FbCommunitiesDrawerFolderImplementation", "messaging.navigation.drawer.folder.foldersection.HomeDrawerFolderSectionInterfaceSpec", "subscribe", andIncrement9);
                        }
                        if (C4Mq.A04(c4Mq)) {
                            int andIncrement10 = atomicInteger.getAndIncrement();
                            r0.A0A("com.facebook.messaging.navigation.plugins.communities.zerochatsuggestioncommunitiesdrawerfolder.ZeroChatSuggestionCommunitiesDrawerFolderImplementation", "messaging.navigation.communities.zerochatsuggestioncommunitiesdrawerfolder.ZeroChatSuggestionCommunitiesDrawerFolderImplementation", "com.facebook.messaging.navigation.plugins.interfaces.drawer.folder.foldersection.HomeDrawerFolderSectionInterfaceSpec", andIncrement10, "messaging.navigation.drawer.folder.foldersection.HomeDrawerFolderSectionInterfaceSpec", "com.facebook.messaging.navigation.plugins.communities.NavigationCommunitiesKillSwitch", "subscribe");
                            ZeroChatSuggestionCommunitiesDrawerFolderImplementation zeroChatSuggestionCommunitiesDrawerFolderImplementation = c4Mq.A03;
                            GraphQlQueryParamSet graphQlQueryParamSet2 = new GraphQlQueryParamSet();
                            2Jf r010 = new 2Jf(2JX.class, (Class) null, "CommunitiesWithZeroChatQuery", (String) null, "fbandroid", 890010040, 0, 893092087L, 893092087L, false, true);
                            r010.A00 = graphQlQueryParamSet2;
                            C3sa A002 = C3sa.A00(r010);
                            A002.A09(300L);
                            A002.A0A(3600L);
                            Context context2 = zeroChatSuggestionCommunitiesDrawerFolderImplementation.A03;
                            1Fw.A04((1EZ) 1Bu.A06(context2, 16428));
                            C00s.A00();
                            1FV A092 = 1VX.A0D(context2).A09(A002);
                            zeroChatSuggestionCommunitiesDrawerFolderImplementation.A00 = A092;
                            try {
                                1Kd.A0F(new 4WX(zeroChatSuggestionCommunitiesDrawerFolderImplementation, 4), A092, (ExecutorService) 1Bi.A03(16477));
                                r0.A04((Exception) null, "messaging.navigation.communities.zerochatsuggestioncommunitiesdrawerfolder.ZeroChatSuggestionCommunitiesDrawerFolderImplementation", "messaging.navigation.drawer.folder.foldersection.HomeDrawerFolderSectionInterfaceSpec", "subscribe", andIncrement10);
                            } catch (Throwable th5) {
                                th = th5;
                            }
                        }
                        r0.A02((Exception) null, "messaging.navigation.drawer.folder.foldersection.HomeDrawerFolderSectionInterfaceSpec", "subscribe", andIncrement);
                        i2 = -1635432883;
                    } catch (Throwable th6) {
                        r0.A04((Exception) null, "messaging.navigation.drawerfoldersections.morefoldersection.MoreDrawerFolderImplementation", "messaging.navigation.drawer.folder.foldersection.HomeDrawerFolderSectionInterfaceSpec", "subscribe", i);
                        throw th6;
                    }
                } catch (Throwable th7) {
                    th = th7;
                    r0.A02((Exception) null, "messaging.navigation.drawer.folder.foldersection.HomeDrawerFolderSectionInterfaceSpec", "subscribe", andIncrement);
                    throw th;
                }
            }
            C00j.A01(i2);
        } catch (Throwable th8) {
            C00j.A01(1404695862);
            throw th8;
        }
    }

    public final void A1h() {
        int i;
        C4M0 c4m0;
        int andIncrement;
        1YC r0;
        Exception e;
        int andIncrement2;
        String str;
        int andIncrement3;
        String str2;
        C00j.A05("HomeDrawerFragmentBase.unsubscribe", -2079338123);
        try {
            if (this.A0H) {
                this.A0H = false;
                Object value = this.A0R.getValue();
                11T.A0A(value);
                C4N5 c4n5 = ((C4N6) value).A00.A00;
                AtomicInteger atomicInteger = C1Y6.A04;
                int andIncrement4 = atomicInteger.getAndIncrement();
                1YC r02 = c4n5.A02;
                r02.A08("com.facebook.messaging.navigation.plugins.interfaces.drawer.header.HomeDrawerHeaderInterfaceSpec", "messaging.navigation.drawer.header.HomeDrawerHeaderInterfaceSpec", "unsubscribe", andIncrement4);
                Exception e2 = null;
                try {
                    if (C4N5.A00(c4n5)) {
                        int andIncrement5 = atomicInteger.getAndIncrement();
                        r02.A0A("com.facebook.messaging.settings.plugins.iadrawer.drawerheader.MeSettingsDrawerHeaderImplementation", "messaging.settings.iadrawer.drawerheader.MeSettingsDrawerHeaderImplementation", "com.facebook.messaging.navigation.plugins.interfaces.drawer.header.HomeDrawerHeaderInterfaceSpec", andIncrement5, "messaging.navigation.drawer.header.HomeDrawerHeaderInterfaceSpec", "com.facebook.messaging.settings.plugins.iadrawer.SettingsIadrawerKillSwitch", "unsubscribe");
                        try {
                            try {
                                MeSettingsDrawerHeaderImplementation meSettingsDrawerHeaderImplementation = c4n5.A00;
                                ((4IC) meSettingsDrawerHeaderImplementation.A02.A00.get()).A02(meSettingsDrawerHeaderImplementation.A05);
                                meSettingsDrawerHeaderImplementation.A06.A04("settings");
                                r02.A04((Exception) null, "messaging.settings.iadrawer.drawerheader.MeSettingsDrawerHeaderImplementation", "messaging.navigation.drawer.header.HomeDrawerHeaderInterfaceSpec", "unsubscribe", andIncrement5);
                                r02.A02((Exception) null, "messaging.navigation.drawer.header.HomeDrawerHeaderInterfaceSpec", "unsubscribe", andIncrement4);
                            } catch (Exception e3) {
                                e2 = e3;
                                throw e2;
                            }
                        } catch (Throwable th) {
                            r02.A04(e2, "messaging.settings.iadrawer.drawerheader.MeSettingsDrawerHeaderImplementation", "messaging.navigation.drawer.header.HomeDrawerHeaderInterfaceSpec", "unsubscribe", andIncrement5);
                            throw th;
                        }
                    } else {
                        r02.A02((Exception) null, "messaging.navigation.drawer.header.HomeDrawerHeaderInterfaceSpec", "unsubscribe", andIncrement4);
                    }
                    Object value2 = this.A0P.getValue();
                    11T.A0A(value2);
                    c4m0 = ((C4M1) value2).A00.A00;
                    andIncrement = atomicInteger.getAndIncrement();
                    r0 = c4m0.A0I;
                    r0.A08("com.facebook.messaging.navigation.plugins.interfaces.drawer.folder.folderitem.HomeDrawerFolderItemInterfaceSpec", "messaging.navigation.drawer.folder.folderitem.HomeDrawerFolderItemInterfaceSpec", "unsubscribe", andIncrement);
                    e = null;
                } catch (Throwable th2) {
                    th = th2;
                    r02.A02(e2, "messaging.navigation.drawer.header.HomeDrawerHeaderInterfaceSpec", "unsubscribe", andIncrement4);
                }
                try {
                    C4M0.A00(c4m0);
                    if (C4M0.A02(c4m0)) {
                        andIncrement3 = atomicInteger.getAndIncrement();
                        str2 = "messaging.marketplace.marketplacefolder.folderitem.MarketplaceFolderItem";
                        r0.A0A("com.facebook.messaging.marketplace.plugins.marketplacefolder.folderitem.MarketplaceFolderItem", str2, "com.facebook.messaging.navigation.plugins.interfaces.drawer.folder.folderitem.HomeDrawerFolderItemInterfaceSpec", andIncrement3, "messaging.navigation.drawer.folder.folderitem.HomeDrawerFolderItemInterfaceSpec", "com.facebook.messaging.marketplace.plugins.marketplacefolder.MarketplaceDrawerFolderKillSwitch", "unsubscribe");
                        try {
                            try {
                                MarketplaceFolderItem marketplaceFolderItem = c4m0.A02;
                                2FR r03 = marketplaceFolderItem.A00;
                                if (r03 != null) {
                                    r03.cancel(false);
                                }
                                marketplaceFolderItem.A00 = null;
                                r0.A04((Exception) null, str2, "messaging.navigation.drawer.folder.folderitem.HomeDrawerFolderItemInterfaceSpec", "unsubscribe", andIncrement3);
                            } catch (Throwable th3) {
                                r0.A04(e, str2, "messaging.navigation.drawer.folder.folderitem.HomeDrawerFolderItemInterfaceSpec", "unsubscribe", andIncrement3);
                                throw th3;
                            }
                        } catch (Exception e4) {
                            e = e4;
                            throw e;
                        }
                    }
                    if (C4M0.A05(c4m0)) {
                        int andIncrement6 = atomicInteger.getAndIncrement();
                        r0.A0A("com.facebook.messaging.support.plugins.supportfolder.folderitem.SupportFolderItemImplementation", "messaging.support.supportfolder.folderitem.SupportFolderItemImplementation", "com.facebook.messaging.navigation.plugins.interfaces.drawer.folder.folderitem.HomeDrawerFolderItemInterfaceSpec", andIncrement6, "messaging.navigation.drawer.folder.folderitem.HomeDrawerFolderItemInterfaceSpec", "com.facebook.messaging.support.plugins.supportfolder.SupportFolderKillSwitch", "unsubscribe");
                        Future future = (Future) c4m0.A07.A04.getAndSet(null);
                        if (future != null) {
                            future.cancel(true);
                        }
                        r0.A04((Exception) null, "messaging.support.supportfolder.folderitem.SupportFolderItemImplementation", "messaging.navigation.drawer.folder.folderitem.HomeDrawerFolderItemInterfaceSpec", "unsubscribe", andIncrement6);
                    }
                    if (C4M0.A06(c4m0)) {
                        andIncrement3 = atomicInteger.getAndIncrement();
                        str2 = "messaging.wellbeing.unknowncontact.messagerequests.homedrawer.folderitem.MessageRequestsFolderItem";
                        r0.A0A("com.facebook.messaging.wellbeing.unknowncontact.messagerequests.plugins.homedrawer.folderitem.MessageRequestsFolderItem", str2, "com.facebook.messaging.navigation.plugins.interfaces.drawer.folder.folderitem.HomeDrawerFolderItemInterfaceSpec", andIncrement3, "messaging.navigation.drawer.folder.folderitem.HomeDrawerFolderItemInterfaceSpec", "com.facebook.messaging.wellbeing.unknowncontact.messagerequests.plugins.homedrawer.WellbeingUnknowncontactMessagerequestsHomedrawerKillSwitch", "unsubscribe");
                        MessageRequestsFolderItem messageRequestsFolderItem = c4m0.A08;
                        ((C4Mm) messageRequestsFolderItem.A02.A00.get()).A02(messageRequestsFolderItem.A03);
                        r0.A04((Exception) null, str2, "messaging.navigation.drawer.folder.folderitem.HomeDrawerFolderItemInterfaceSpec", "unsubscribe", andIncrement3);
                    }
                    r0.A02((Exception) null, "messaging.navigation.drawer.folder.folderitem.HomeDrawerFolderItemInterfaceSpec", "unsubscribe", andIncrement);
                    Object value3 = this.A0Q.getValue();
                    11T.A0A(value3);
                    C4Mq c4Mq = ((C4Mr) value3).A00.A00;
                    int andIncrement7 = atomicInteger.getAndIncrement();
                    1YC r04 = c4Mq.A0D;
                    r04.A08("com.facebook.messaging.navigation.plugins.interfaces.drawer.folder.foldersection.HomeDrawerFolderSectionInterfaceSpec", "messaging.navigation.drawer.folder.foldersection.HomeDrawerFolderSectionInterfaceSpec", "unsubscribe", andIncrement7);
                    Exception e5 = null;
                    try {
                        if (C4Mq.A05(c4Mq)) {
                            andIncrement2 = atomicInteger.getAndIncrement();
                            str = "messaging.navigation.drawerfoldersections.morefoldersection.MoreDrawerFolderImplementation";
                            r04.A0A("com.facebook.messaging.navigation.plugins.drawerfoldersections.morefoldersection.MoreDrawerFolderImplementation", str, "com.facebook.messaging.navigation.plugins.interfaces.drawer.folder.foldersection.HomeDrawerFolderSectionInterfaceSpec", andIncrement2, "messaging.navigation.drawer.folder.foldersection.HomeDrawerFolderSectionInterfaceSpec", "com.facebook.messaging.navigation.plugins.drawerfoldersections.NavigationDrawerfoldersectionsKillSwitch", "unsubscribe");
                            try {
                                try {
                                    MoreDrawerFolderImplementation moreDrawerFolderImplementation = c4Mq.A04;
                                    if (((1Wi) 1Bi.A03(68470)).A03()) {
                                        C4Tf c4Tf = (C4Tf) moreDrawerFolderImplementation.A02.A00.get();
                                        C4Nh c4Nh = moreDrawerFolderImplementation.A04;
                                        11T.A0F(c4Nh, 0);
                                        c4Tf.A03.remove(c4Nh);
                                    }
                                    r04.A04((Exception) null, str, "messaging.navigation.drawer.folder.foldersection.HomeDrawerFolderSectionInterfaceSpec", "unsubscribe", andIncrement2);
                                } catch (Throwable th4) {
                                    r04.A04(e5, str, "messaging.navigation.drawer.folder.foldersection.HomeDrawerFolderSectionInterfaceSpec", "unsubscribe", andIncrement2);
                                    throw th4;
                                }
                            } catch (Exception e6) {
                                e5 = e6;
                                throw e5;
                            }
                        }
                        if (C4Mq.A01(c4Mq)) {
                            int andIncrement8 = atomicInteger.getAndIncrement();
                            r04.A0A("com.facebook.messaging.navigation.plugins.communities.communitiesdrawerfolder.CommunitiesDrawerFolderImplementation", "messaging.navigation.communities.communitiesdrawerfolder.CommunitiesDrawerFolderImplementation", "com.facebook.messaging.navigation.plugins.interfaces.drawer.folder.foldersection.HomeDrawerFolderSectionInterfaceSpec", andIncrement8, "messaging.navigation.drawer.folder.foldersection.HomeDrawerFolderSectionInterfaceSpec", "com.facebook.messaging.navigation.plugins.communities.NavigationCommunitiesKillSwitch", "unsubscribe");
                            CommunitiesDrawerFolderImplementation communitiesDrawerFolderImplementation = c4Mq.A00;
                            LiveData liveData = communitiesDrawerFolderImplementation.A00;
                            if (liveData != null) {
                                liveData.removeObserver(communitiesDrawerFolderImplementation.A03);
                            }
                            r04.A04((Exception) null, "messaging.navigation.communities.communitiesdrawerfolder.CommunitiesDrawerFolderImplementation", "messaging.navigation.drawer.folder.foldersection.HomeDrawerFolderSectionInterfaceSpec", "unsubscribe", andIncrement8);
                        }
                        if (C4Mq.A03(c4Mq)) {
                            int andIncrement9 = atomicInteger.getAndIncrement();
                            r04.A0A("com.facebook.messaging.navigation.plugins.communities.standalonecommunitiesdrawerfolder.StandaloneCommunitiesDrawerFolderImplementation", "messaging.navigation.communities.standalonecommunitiesdrawerfolder.StandaloneCommunitiesDrawerFolderImplementation", "com.facebook.messaging.navigation.plugins.interfaces.drawer.folder.foldersection.HomeDrawerFolderSectionInterfaceSpec", andIncrement9, "messaging.navigation.drawer.folder.foldersection.HomeDrawerFolderSectionInterfaceSpec", "com.facebook.messaging.navigation.plugins.communities.NavigationCommunitiesKillSwitch", "unsubscribe");
                            4UM r05 = (4UM) c4Mq.A02.A01.A00.get();
                            CommunityMessagingCommunityType communityMessagingCommunityType = CommunityMessagingCommunityType.A03;
                            java.util.Map map = r05.A06;
                            Observer observer = (Observer) map.get(communityMessagingCommunityType);
                            if (observer != null) {
                                LiveData liveData2 = (LiveData) r05.A07.get(communityMessagingCommunityType);
                                if (liveData2 != null) {
                                    liveData2.removeObserver(observer);
                                }
                            }
                            map.remove(communityMessagingCommunityType);
                            r04.A04((Exception) null, "messaging.navigation.communities.standalonecommunitiesdrawerfolder.StandaloneCommunitiesDrawerFolderImplementation", "messaging.navigation.drawer.folder.foldersection.HomeDrawerFolderSectionInterfaceSpec", "unsubscribe", andIncrement9);
                        }
                        if (C4Mq.A02(c4Mq)) {
                            int andIncrement10 = atomicInteger.getAndIncrement();
                            r04.A0A("com.facebook.messaging.navigation.plugins.communities.fbcommunitiesdrawerfolder.FbCommunitiesDrawerFolderImplementation", "messaging.navigation.communities.fbcommunitiesdrawerfolder.FbCommunitiesDrawerFolderImplementation", "com.facebook.messaging.navigation.plugins.interfaces.drawer.folder.foldersection.HomeDrawerFolderSectionInterfaceSpec", andIncrement10, "messaging.navigation.drawer.folder.foldersection.HomeDrawerFolderSectionInterfaceSpec", "com.facebook.messaging.navigation.plugins.communities.NavigationCommunitiesKillSwitch", "unsubscribe");
                            4UM r06 = (4UM) c4Mq.A01.A01.A00.get();
                            CommunityMessagingCommunityType communityMessagingCommunityType2 = CommunityMessagingCommunityType.A02;
                            java.util.Map map2 = r06.A06;
                            Observer observer2 = (Observer) map2.get(communityMessagingCommunityType2);
                            if (observer2 != null) {
                                LiveData liveData3 = (LiveData) r06.A07.get(communityMessagingCommunityType2);
                                if (liveData3 != null) {
                                    liveData3.removeObserver(observer2);
                                }
                            }
                            map2.remove(communityMessagingCommunityType2);
                            r04.A04((Exception) null, "messaging.navigation.communities.fbcommunitiesdrawerfolder.FbCommunitiesDrawerFolderImplementation", "messaging.navigation.drawer.folder.foldersection.HomeDrawerFolderSectionInterfaceSpec", "unsubscribe", andIncrement10);
                        }
                        if (C4Mq.A04(c4Mq)) {
                            andIncrement2 = atomicInteger.getAndIncrement();
                            str = "messaging.navigation.communities.zerochatsuggestioncommunitiesdrawerfolder.ZeroChatSuggestionCommunitiesDrawerFolderImplementation";
                            r04.A0A("com.facebook.messaging.navigation.plugins.communities.zerochatsuggestioncommunitiesdrawerfolder.ZeroChatSuggestionCommunitiesDrawerFolderImplementation", str, "com.facebook.messaging.navigation.plugins.interfaces.drawer.folder.foldersection.HomeDrawerFolderSectionInterfaceSpec", andIncrement2, "messaging.navigation.drawer.folder.foldersection.HomeDrawerFolderSectionInterfaceSpec", "com.facebook.messaging.navigation.plugins.communities.NavigationCommunitiesKillSwitch", "unsubscribe");
                            ZeroChatSuggestionCommunitiesDrawerFolderImplementation zeroChatSuggestionCommunitiesDrawerFolderImplementation = c4Mq.A03;
                            ListenableFuture listenableFuture = zeroChatSuggestionCommunitiesDrawerFolderImplementation.A00;
                            if (listenableFuture != null) {
                                listenableFuture.cancel(true);
                            }
                            zeroChatSuggestionCommunitiesDrawerFolderImplementation.A00 = null;
                            r04.A04((Exception) null, str, "messaging.navigation.drawer.folder.foldersection.HomeDrawerFolderSectionInterfaceSpec", "unsubscribe", andIncrement2);
                        }
                        r04.A02((Exception) null, "messaging.navigation.drawer.folder.foldersection.HomeDrawerFolderSectionInterfaceSpec", "unsubscribe", andIncrement7);
                        i = 2003185590;
                    } catch (Throwable th5) {
                        th = th5;
                        r04.A02(e5, "messaging.navigation.drawer.folder.foldersection.HomeDrawerFolderSectionInterfaceSpec", "unsubscribe", andIncrement7);
                        throw th;
                    }
                } catch (Throwable th6) {
                    r0.A02(e, "messaging.navigation.drawer.folder.folderitem.HomeDrawerFolderItemInterfaceSpec", "unsubscribe", andIncrement);
                    throw th6;
                }
            } else {
                i = -146228485;
            }
            C00j.A01(i);
        } catch (Throwable th7) {
            C00j.A01(-1505619285);
            throw th7;
        }
    }

    public boolean A1i() {
        C4Fl c4Fl = (C4Fl) this;
        ComponentTree componentTree = c4Fl.A1X().A00;
        boolean z = false;
        if ((componentTree != null ? componentTree.A0V : null) != null) {
            C4La c4La = c4Fl.A09;
            if (c4La.A01.BW7()) {
                C4La.A01(c4La, new 4NY(0.0f), c4La.A06);
                z = true;
            }
        }
        return z;
    }

    @Override // X.C4Fo
    public 2MX BdL() {
        return this.A09;
    }

    public boolean Bkd() {
        C00j.A05("HomeDrawerFragmentBase.onBackPressed", 611980307);
        try {
            boolean A1i = A1i();
            C00j.A01(-400521025);
            return A1i;
        } catch (Throwable th) {
            C00j.A01(-1401050427);
            throw th;
        }
    }

    @Override // X.C4Fn
    public void C54() {
        C00j.A05("HomeDrawerFragmentBase.onLogoutStart", 367999754);
        C00j.A01(102393531);
    }

    public void CpV(2MX r302) {
        11T.A0F(r302, 0);
        this.A09 = r302;
    }

    public void onSaveInstanceState(Bundle bundle) {
        11T.A0F(bundle, 0);
        C00j.A05("HomeDrawerFragmentBase.onSaveInstanceState", -1829652017);
        try {
            super.onSaveInstanceState(bundle);
            bundle.putBoolean("BUNDLE_IS_DRAWER_OPENED", this.A0G);
            C00j.A01(-570047927);
        } catch (Throwable th) {
            C00j.A01(1614439262);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onStart() {
        int A02 = 0FI.A02(-1813997781);
        C00j.A05("HomeDrawerFragmentBase.onStart", 1340234034);
        try {
            super/*androidx.fragment.app.Fragment*/.onStart();
            if (this.A0G) {
                A1g();
            }
            C00j.A01(-810371119);
            0FI.A08(2140784411, A02);
        } catch (Throwable th) {
            C00j.A01(-1504294690);
            0FI.A08(719673249, A02);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onStop() {
        int A02 = 0FI.A02(1197640872);
        C00j.A05("HomeDrawerFragmentBase.onStop", 812117883);
        try {
            super/*androidx.fragment.app.Fragment*/.onStop();
            A1h();
            C4Lm.A00(A1Y(), "on_stop", (short) 4, false);
            C00j.A01(-1657189660);
            0FI.A08(584362163, A02);
        } catch (Throwable th) {
            C00j.A01(-2118725690);
            0FI.A08(198398777, A02);
            throw th;
        }
    }
}
