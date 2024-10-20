package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.messaging.communitymessaging.communitynotificationsettings.fragment.MuteCommunityNotificationDialogFragment;
import com.facebook.messaging.communitymessaging.plugins.communitycontainers.menuitems.mutecommunitymenuitem.MuteCommunityMenuItemImplementation;
import com.facebook.messaging.communitymessaging.plugins.communitycontainers.menuitems.unbumpcommunitycontainermenuitem.UnbumpCommunityContainerMenuItemImplementation;
import com.facebook.messaging.communitymessaging.plugins.communitycontainers.menuitems.unmutecommunitymenuitem.UnmuteCommunityMenuItemImplementation;
import com.facebook.messaging.inbox.units.InboxTrackableItem;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.user.model.User;
import com.facebook.xapp.messaging.capability.vector.Capabilities;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: Cd4.class */
public final class Cd4 implements C4YN {
    public MuteCommunityMenuItemImplementation A01;
    public UnbumpCommunityContainerMenuItemImplementation A02;
    public UnmuteCommunityMenuItemImplementation A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public final Context A07;
    public final 06Z A08;
    public final FbUserSession A09;
    public final CallerContext A0A;
    public final InboxTrackableItem A0B;
    public final ThreadSummary A0C;
    public final User A0E;
    public final Capabilities A0F;
    public int A00 = -1;
    public final 1YC A0D = 1YC.A03;

    public Cd4(Context context, 06Z r303, FbUserSession fbUserSession, CallerContext callerContext, InboxTrackableItem inboxTrackableItem, ThreadSummary threadSummary, User user, Capabilities capabilities) {
        this.A07 = context;
        this.A0C = threadSummary;
        this.A08 = r303;
        this.A0F = capabilities;
        this.A09 = fbUserSession;
        this.A0A = callerContext;
        this.A0E = user;
        this.A0B = inboxTrackableItem;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b6, code lost:
    
        if (r0.A00 != 0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00dc, code lost:
    
        if (r0.A00 != 1) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0075 A[Catch: Exception -> 0x0161, all -> 0x016f, TRY_ENTER, TRY_LEAVE, TryCatch #3 {Exception -> 0x0161, blocks: (B:5:0x0043, B:6:0x0048, B:9:0x0054, B:12:0x005c, B:15:0x0075, B:17:0x0082, B:19:0x0088, B:20:0x008d, B:22:0x0093, B:23:0x0098, B:26:0x00a1, B:29:0x00bc, B:31:0x00c2, B:32:0x00c7, B:35:0x00d0, B:44:0x0107, B:45:0x010e, B:48:0x011a, B:50:0x0128, B:53:0x0136, B:54:0x013c, B:55:0x0142, B:57:0x014b, B:58:0x0151, B:59:0x0155, B:59:0x0155, B:62:0x015a, B:67:0x00ff, B:71:0x0100, B:71:0x0100, B:74:0x0069), top: B:4:0x0043, outer: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A00() {
        /*
            Method dump skipped, instructions count: 436
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Cd4.A00():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x006c A[Catch: Exception -> 0x0118, all -> 0x0124, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x0118, blocks: (B:5:0x003b, B:6:0x0040, B:9:0x004c, B:12:0x0054, B:15:0x006c, B:17:0x0079, B:19:0x0081, B:22:0x008b, B:23:0x0091, B:25:0x0097, B:30:0x00c2, B:31:0x00c9, B:34:0x00d5, B:36:0x00e1, B:39:0x00ef, B:40:0x00f4, B:41:0x00fa, B:43:0x0102, B:44:0x0108, B:45:0x010c, B:45:0x010c, B:48:0x0111, B:53:0x00ba, B:56:0x00bb, B:56:0x00bb, B:59:0x0060), top: B:4:0x003b, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A01() {
        /*
            Method dump skipped, instructions count: 358
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Cd4.A01():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b6, code lost:
    
        if (r0.A00 != 0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00e4, code lost:
    
        if (r0.A00 != 1) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0075 A[Catch: Exception -> 0x0161, all -> 0x016f, TRY_ENTER, TRY_LEAVE, TryCatch #3 {Exception -> 0x0161, blocks: (B:5:0x0043, B:6:0x0048, B:9:0x0054, B:12:0x005c, B:15:0x0075, B:17:0x0082, B:19:0x0088, B:20:0x008d, B:22:0x0093, B:23:0x0098, B:26:0x00a1, B:30:0x00c4, B:32:0x00ca, B:33:0x00cf, B:36:0x00d8, B:45:0x010f, B:46:0x0116, B:49:0x0122, B:51:0x0130, B:54:0x013e, B:55:0x0144, B:57:0x014b, B:58:0x0151, B:59:0x0155, B:59:0x0155, B:62:0x015a, B:67:0x0107, B:71:0x0108, B:71:0x0108, B:74:0x0069), top: B:4:0x0043, outer: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A02() {
        /*
            Method dump skipped, instructions count: 436
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Cd4.A02():boolean");
    }

    @Override // X.C4YN
    public void ANc() {
        int A00 = 1BK.A00();
        1YC r0 = this.A0D;
        r0.A08("com.facebook.messaging.threadlist.plugins.interfaces.threadmenuitem.ThreadMenuItemInterfaceSpec", "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "dismissDialogs", A00);
        r0.A06("messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "dismissDialogs", A00);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v142, types: [int] */
    /* JADX WARN: Type inference failed for: r0v144, types: [int] */
    /* JADX WARN: Type inference failed for: r0v17, types: [int] */
    /* JADX WARN: Type inference failed for: r0v48, types: [int] */
    /* JADX WARN: Type inference failed for: r0v50, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r310v0 */
    /* JADX WARN: Type inference failed for: r320v0 */
    @Override // X.C4YN
    public ArrayList Awf() {
        int andIncrement;
        String str;
        AtomicInteger atomicInteger = C1Y6.A04;
        int andIncrement2 = atomicInteger.getAndIncrement();
        1YC r0 = this.A0D;
        r0.A08("com.facebook.messaging.threadlist.plugins.interfaces.threadmenuitem.ThreadMenuItemInterfaceSpec", "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "getMenuItem", andIncrement2);
        Exception e = null;
        try {
            ?? r310 = this.A00;
            boolean z = r310;
            if (r310 == -1) {
                boolean A01 = A01();
                boolean z2 = A01;
                if (A00()) {
                    z2 = (A01 ? 1 : 0) + 1;
                }
                boolean z3 = z2;
                if (A02()) {
                    z3 = (z2 ? 1 : 0) + 1;
                }
                this.A00 = z3 ? 1 : 0;
                z = z3;
            }
            ArrayList A0t = AnonymousClass001.A0t(z);
            if (A01()) {
                andIncrement = atomicInteger.getAndIncrement();
                str = "messaging.communitymessaging.communitycontainers.menuitems.unbumpcommunitycontainermenuitem.UnbumpCommunityContainerMenuItemImplementation";
                r0.A0A("com.facebook.messaging.communitymessaging.plugins.communitycontainers.menuitems.unbumpcommunitycontainermenuitem.UnbumpCommunityContainerMenuItemImplementation", str, "com.facebook.messaging.threadlist.plugins.interfaces.threadmenuitem.ThreadMenuItemInterfaceSpec", andIncrement, "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "com.facebook.messaging.communitymessaging.plugins.communitycontainers.menuitems.CommunitymessagingCommunitycontainersMenuitemsKillSwitch", "getMenuItem");
                try {
                    try {
                        UnbumpCommunityContainerMenuItemImplementation unbumpCommunityContainerMenuItemImplementation = this.A02;
                        Context context = unbumpCommunityContainerMenuItemImplementation.A00;
                        int i = 2131954461;
                        if (AbJ.A0Q(unbumpCommunityContainerMenuItemImplementation.A02).A04()) {
                            i = 2131967220;
                        }
                        String A0u = 1BK.A0u(context, i);
                        CQE cqe = new CQE();
                        cqe.A00 = 70;
                        cqe.A06(C1u3.A2d);
                        cqe.A07(A0u);
                        cqe.A08(A0u);
                        CQE.A05(cqe, "cc_long_press_unbump", A0t);
                        r0.A09(str, "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "getMenuItem", andIncrement);
                    } catch (Exception e2) {
                        e = e2;
                        throw e;
                    }
                } catch (Throwable th) {
                    r0.A04(e, str, "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "getMenuItem", andIncrement);
                    throw th;
                }
            }
            if (A00()) {
                int andIncrement3 = atomicInteger.getAndIncrement();
                r0.A0A("com.facebook.messaging.communitymessaging.plugins.communitycontainers.menuitems.mutecommunitymenuitem.MuteCommunityMenuItemImplementation", "messaging.communitymessaging.communitycontainers.menuitems.mutecommunitymenuitem.MuteCommunityMenuItemImplementation", "com.facebook.messaging.threadlist.plugins.interfaces.threadmenuitem.ThreadMenuItemInterfaceSpec", andIncrement3, "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "com.facebook.messaging.communitymessaging.plugins.communitycontainers.menuitems.CommunitymessagingCommunitycontainersMenuitemsKillSwitch", "getMenuItem");
                MuteCommunityMenuItemImplementation muteCommunityMenuItemImplementation = this.A01;
                CQE cqe2 = new CQE();
                cqe2.A00 = 64;
                cqe2.A06(C1u3.A0p);
                CQE.A02(muteCommunityMenuItemImplementation.A00, cqe2, 2131954498);
                CQE.A05(cqe2, "cc_long_press_mute", A0t);
                r0.A09("messaging.communitymessaging.communitycontainers.menuitems.mutecommunitymenuitem.MuteCommunityMenuItemImplementation", "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "getMenuItem", andIncrement3);
            }
            if (A02()) {
                andIncrement = atomicInteger.getAndIncrement();
                str = "messaging.communitymessaging.communitycontainers.menuitems.unmutecommunitymenuitem.UnmuteCommunityMenuItemImplementation";
                r0.A0A("com.facebook.messaging.communitymessaging.plugins.communitycontainers.menuitems.unmutecommunitymenuitem.UnmuteCommunityMenuItemImplementation", str, "com.facebook.messaging.threadlist.plugins.interfaces.threadmenuitem.ThreadMenuItemInterfaceSpec", andIncrement, "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "com.facebook.messaging.communitymessaging.plugins.communitycontainers.menuitems.CommunitymessagingCommunitycontainersMenuitemsKillSwitch", "getMenuItem");
                UnmuteCommunityMenuItemImplementation unmuteCommunityMenuItemImplementation = this.A03;
                CQE cqe3 = new CQE();
                cqe3.A00 = 65;
                cqe3.A06(C1u3.A0o);
                CQE.A02(unmuteCommunityMenuItemImplementation.A00, cqe3, 2131954499);
                CQE.A05(cqe3, "cc_long_press_unmute", A0t);
                r0.A09(str, "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "getMenuItem", andIncrement);
            }
            while (true) {
                int size = A0t.size();
                ?? r320 = this.A00;
                boolean z4 = r320;
                if (r320 == -1) {
                    boolean A012 = A01();
                    boolean z5 = A012;
                    if (A00()) {
                        z5 = (A012 ? 1 : 0) + 1;
                    }
                    boolean z6 = z5;
                    if (A02()) {
                        z6 = (z5 ? 1 : 0) + 1;
                    }
                    this.A00 = z6 ? 1 : 0;
                    z4 = z6;
                }
                if (size >= z4) {
                    r0.A02((Exception) null, "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "getMenuItem", andIncrement2);
                    return A0t;
                }
                A0t.add(null);
            }
        } catch (Throwable th2) {
            r0.A02(e, "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "getMenuItem", andIncrement2);
            throw th2;
        }
    }

    @Override // X.C4YN
    public void C6a(int i) {
        int andIncrement;
        String str;
        AtomicInteger atomicInteger = C1Y6.A04;
        int andIncrement2 = atomicInteger.getAndIncrement();
        1YC r0 = this.A0D;
        r0.A08("com.facebook.messaging.threadlist.plugins.interfaces.threadmenuitem.ThreadMenuItemInterfaceSpec", "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "onMenuItemSelected", andIncrement2);
        try {
            try {
                try {
                    if (i == 70) {
                        if (A01()) {
                            andIncrement = atomicInteger.getAndIncrement();
                            str = "messaging.communitymessaging.communitycontainers.menuitems.unbumpcommunitycontainermenuitem.UnbumpCommunityContainerMenuItemImplementation";
                            r0.A0A("com.facebook.messaging.communitymessaging.plugins.communitycontainers.menuitems.unbumpcommunitycontainermenuitem.UnbumpCommunityContainerMenuItemImplementation", str, "com.facebook.messaging.threadlist.plugins.interfaces.threadmenuitem.ThreadMenuItemInterfaceSpec", andIncrement, "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "com.facebook.messaging.communitymessaging.plugins.communitycontainers.menuitems.CommunitymessagingCommunitycontainersMenuitemsKillSwitch", "onMenuItemSelected");
                            UnbumpCommunityContainerMenuItemImplementation unbumpCommunityContainerMenuItemImplementation = this.A02;
                            32S r02 = (32S) 1Bi.A03(82637);
                            22I A0E = AbF.A0E(unbumpCommunityContainerMenuItemImplementation.A00, unbumpCommunityContainerMenuItemImplementation.A01);
                            long A0r = unbumpCommunityContainerMenuItemImplementation.A03.A0n.A0r();
                            A0E.A07(A0r);
                            r02.A01(BOo.A0F, A0r);
                            r0.A09(str, "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "onMenuItemSelected", andIncrement);
                            r0.A02((Exception) null, "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "onMenuItemSelected", andIncrement2);
                            return;
                        }
                        r0.A02((Exception) null, "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "onMenuItemSelected", andIncrement2);
                    }
                    if (i != 64) {
                        if (i == 65 && A02()) {
                            andIncrement = atomicInteger.getAndIncrement();
                            str = "messaging.communitymessaging.communitycontainers.menuitems.unmutecommunitymenuitem.UnmuteCommunityMenuItemImplementation";
                            r0.A0A("com.facebook.messaging.communitymessaging.plugins.communitycontainers.menuitems.unmutecommunitymenuitem.UnmuteCommunityMenuItemImplementation", str, "com.facebook.messaging.threadlist.plugins.interfaces.threadmenuitem.ThreadMenuItemInterfaceSpec", andIncrement, "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "com.facebook.messaging.communitymessaging.plugins.communitycontainers.menuitems.CommunitymessagingCommunitycontainersMenuitemsKillSwitch", "onMenuItemSelected");
                            UnmuteCommunityMenuItemImplementation unmuteCommunityMenuItemImplementation = this.A03;
                            long A0r2 = unmuteCommunityMenuItemImplementation.A02.A0n.A0r();
                            1Br.A0C(unmuteCommunityMenuItemImplementation.A01);
                            new C8T(unmuteCommunityMenuItemImplementation.A00, A0r2).A00(new C1758Ars(null, false), A0r2);
                            r0.A09(str, "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "onMenuItemSelected", andIncrement);
                            r0.A02((Exception) null, "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "onMenuItemSelected", andIncrement2);
                            return;
                        }
                        r0.A02((Exception) null, "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "onMenuItemSelected", andIncrement2);
                    }
                    if (A00()) {
                        andIncrement = atomicInteger.getAndIncrement();
                        str = "messaging.communitymessaging.communitycontainers.menuitems.mutecommunitymenuitem.MuteCommunityMenuItemImplementation";
                        r0.A0A("com.facebook.messaging.communitymessaging.plugins.communitycontainers.menuitems.mutecommunitymenuitem.MuteCommunityMenuItemImplementation", str, "com.facebook.messaging.threadlist.plugins.interfaces.threadmenuitem.ThreadMenuItemInterfaceSpec", andIncrement, "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "com.facebook.messaging.communitymessaging.plugins.communitycontainers.menuitems.CommunitymessagingCommunitycontainersMenuitemsKillSwitch", "onMenuItemSelected");
                        MuteCommunityMenuItemImplementation muteCommunityMenuItemImplementation = this.A01;
                        32S r03 = (32S) 1Bi.A03(82637);
                        ThreadSummary threadSummary = muteCommunityMenuItemImplementation.A02;
                        long j = threadSummary.A06;
                        ThreadKey threadKey = threadSummary.A0n;
                        long A0r3 = threadKey.A0r();
                        MuteCommunityNotificationDialogFragment.A0B.A00(muteCommunityMenuItemImplementation.A01, threadKey, String.valueOf(j), A0r3);
                        r03.A01(BOo.A0N, A0r3);
                        r0.A09(str, "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "onMenuItemSelected", andIncrement);
                        r0.A02((Exception) null, "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "onMenuItemSelected", andIncrement2);
                        return;
                    }
                    r0.A02((Exception) null, "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "onMenuItemSelected", andIncrement2);
                } catch (Throwable th) {
                    r0.A02((Exception) null, "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "onMenuItemSelected", andIncrement2);
                    throw th;
                }
            } catch (Exception e) {
                throw e;
            }
        } catch (Throwable th2) {
            r0.A04((Exception) null, str, "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "onMenuItemSelected", andIncrement);
            throw th2;
        }
    }
}
