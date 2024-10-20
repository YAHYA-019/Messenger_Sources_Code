package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.messaging.chatheads.plugins.core.threadmenuitem.OpenChatHeadsMenuItemImplementation;
import com.facebook.messaging.communitymessaging.plugins.bumpedthreads.bumpmenuitem.BumpMenuItemImplementation;
import com.facebook.messaging.communitymessaging.plugins.bumpedthreads.unbumpmenuitem.UnbumpMenuItemImplementation;
import com.facebook.messaging.communitymessaging.plugins.communitynavigation.menuitem.CommunityNavigationMenuItemImplementation;
import com.facebook.messaging.communitymessaging.plugins.pausechat.pausechatthreadmenuitem.PauseChatThreadMenuItemImplementation;
import com.facebook.messaging.communitymessaging.plugins.pausechat.unpausechatthreadmenuitem.UnpauseChatThreadMenuItemImplementation;
import com.facebook.messaging.inbox.units.InboxTrackableItem;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.msys.thread.plugins.platypustoggle.platypustoggleinboxmenuitem.PlatypusToggleInboxMenuItem;
import com.facebook.messaging.nativepagereply.plugins.core.integrity.pagebanmenuitem.PageBanMenuItemImplementation;
import com.facebook.messaging.notify.plugins.mute.mutemenuitem.MuteMenuItemImplementation;
import com.facebook.messaging.notify.plugins.mute.unmutemenuitem.UnmuteMenuItemImplementation;
import com.facebook.messaging.publicchats.plugins.threadlist.invites.declineinvitethreadmenuitem.DeclineInviteThreadMenuItemImplementation;
import com.facebook.messaging.publicchats.plugins.threadlist.removefrominboxthreadmenuitem.RemoveFromInboxThreadMenuItemImplementation;
import com.facebook.messaging.threadlist.threaditemmenu.plugins.core.pinmenuitem.PinMenuItemImplementation;
import com.facebook.messaging.threadlist.threaditemmenu.plugins.core.unpinmenuitem.UnpinMenuItemImplementation;
import com.facebook.orca.notify.mute.MuteNotificationsDialogFragment;
import com.facebook.user.model.User;
import com.facebook.xapp.messaging.capability.vector.Capabilities;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: Cd6.class */
public final class Cd6 implements C4YN {
    public 5dC A00;
    public C94 A01;
    public C2e A02;
    public BTs A03;
    public CbX A04;
    public CMy A05;
    public BU2 A06;
    public BU2 A07;
    public 6Su A08;
    public 4ME A09;
    public Bzc A0A;
    public CG9 A0B;
    public CG9 A0C;
    public F3F A0D;
    public C1742Arc A0E;
    public 7EN A0F;
    public 5PC A0G;
    public Boolean A0H;
    public BumpMenuItemImplementation A0J;
    public UnbumpMenuItemImplementation A0K;
    public CommunityNavigationMenuItemImplementation A0L;
    public PauseChatThreadMenuItemImplementation A0M;
    public UnpauseChatThreadMenuItemImplementation A0N;
    public PlatypusToggleInboxMenuItem A0O;
    public PageBanMenuItemImplementation A0P;
    public C1v5 A0Q;
    public DeclineInviteThreadMenuItemImplementation A0R;
    public RemoveFromInboxThreadMenuItemImplementation A0S;
    public PinMenuItemImplementation A0T;
    public UnpinMenuItemImplementation A0U;
    public Object A0V;
    public Object A0W;
    public Object A0X;
    public Object A0Y;
    public Object A0Z;
    public Object A0a;
    public Object A0b;
    public Object A0c;
    public Object A0d;
    public Object A0e;
    public Object A0f;
    public Object A0g;
    public Object A0h;
    public Object A0i;
    public Object A0j;
    public Object A0k;
    public Object A0l;
    public Object A0m;
    public Object A0n;
    public Object A0o;
    public Object A0p;
    public Object A0q;
    public Object A0r;
    public Object A0s;
    public Object A0t;
    public Object A0u;
    public Object A0v;
    public Object A0w;
    public Object A0x;
    public Object A0y;
    public Object A0z;
    public Object A10;
    public boolean A11;
    public final Context A12;
    public final 06Z A13;
    public final FbUserSession A14;
    public final CallerContext A15;
    public final InboxTrackableItem A16;
    public final ThreadSummary A17;
    public final 2SI A19;
    public final User A1A;
    public final Capabilities A1B;
    public int A0I = -1;
    public final 1YC A18 = 1YC.A03;

    public Cd6(Context context, 06Z r303, FbUserSession fbUserSession, CallerContext callerContext, InboxTrackableItem inboxTrackableItem, ThreadSummary threadSummary, 2SI r308, User user, Capabilities capabilities) {
        this.A12 = context;
        this.A17 = threadSummary;
        this.A13 = r303;
        this.A19 = r308;
        this.A1B = capabilities;
        this.A14 = fbUserSession;
        this.A15 = callerContext;
        this.A1A = user;
        this.A16 = inboxTrackableItem;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v102, types: [int] */
    /* JADX WARN: Type inference failed for: r0v104, types: [int] */
    /* JADX WARN: Type inference failed for: r0v106, types: [int] */
    /* JADX WARN: Type inference failed for: r0v108, types: [int] */
    /* JADX WARN: Type inference failed for: r0v110, types: [int] */
    /* JADX WARN: Type inference failed for: r0v112, types: [int] */
    /* JADX WARN: Type inference failed for: r0v114, types: [int] */
    /* JADX WARN: Type inference failed for: r0v116, types: [int] */
    /* JADX WARN: Type inference failed for: r0v118, types: [int] */
    /* JADX WARN: Type inference failed for: r0v120, types: [int] */
    /* JADX WARN: Type inference failed for: r0v122, types: [int] */
    /* JADX WARN: Type inference failed for: r0v124, types: [int] */
    /* JADX WARN: Type inference failed for: r0v126, types: [int] */
    /* JADX WARN: Type inference failed for: r0v128, types: [int] */
    /* JADX WARN: Type inference failed for: r0v130, types: [int] */
    /* JADX WARN: Type inference failed for: r0v132, types: [int] */
    /* JADX WARN: Type inference failed for: r0v134, types: [int] */
    /* JADX WARN: Type inference failed for: r0v136, types: [int] */
    /* JADX WARN: Type inference failed for: r0v138, types: [int] */
    /* JADX WARN: Type inference failed for: r0v140, types: [int] */
    /* JADX WARN: Type inference failed for: r0v142, types: [int] */
    /* JADX WARN: Type inference failed for: r0v144, types: [int] */
    /* JADX WARN: Type inference failed for: r0v146, types: [int] */
    /* JADX WARN: Type inference failed for: r0v148, types: [int] */
    /* JADX WARN: Type inference failed for: r0v150, types: [int] */
    /* JADX WARN: Type inference failed for: r0v152, types: [int] */
    /* JADX WARN: Type inference failed for: r0v154, types: [int] */
    /* JADX WARN: Type inference failed for: r0v156, types: [int] */
    /* JADX WARN: Type inference failed for: r0v158, types: [int] */
    /* JADX WARN: Type inference failed for: r0v160, types: [int] */
    /* JADX WARN: Type inference failed for: r0v162, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r302v0 */
    private int A00() {
        ?? r302 = this.A0I;
        boolean z = r302;
        if (r302 == -1) {
            boolean A0P = A0P();
            boolean z2 = A0P;
            if (A0Q()) {
                z2 = (A0P ? 1 : 0) + 1;
            }
            boolean z3 = z2;
            if (A05()) {
                z3 = (z2 ? 1 : 0) + 1;
            }
            boolean z4 = z3;
            if (A04()) {
                z4 = (z3 ? 1 : 0) + 1;
            }
            boolean z5 = z4;
            if (A0L()) {
                z5 = (z4 ? 1 : 0) + 1;
            }
            boolean z6 = z5;
            if (A0R()) {
                z6 = (z5 ? 1 : 0) + 1;
            }
            boolean z7 = z6;
            if (A0U()) {
                z7 = (z6 ? 1 : 0) + 1;
            }
            boolean z8 = z7;
            if (A0B()) {
                z8 = (z7 ? 1 : 0) + 1;
            }
            boolean z9 = z8;
            if (A07()) {
                z9 = (z8 ? 1 : 0) + 1;
            }
            boolean z10 = z9;
            if (A08()) {
                z10 = (z9 ? 1 : 0) + 1;
            }
            boolean z11 = z10;
            if (A0J()) {
                z11 = (z10 ? 1 : 0) + 1;
            }
            boolean z12 = z11;
            if (A0M()) {
                z12 = (z11 ? 1 : 0) + 1;
            }
            boolean z13 = z12;
            if (A0V()) {
                z13 = (z12 ? 1 : 0) + 1;
            }
            boolean z14 = z13;
            if (A09()) {
                z14 = (z13 ? 1 : 0) + 1;
            }
            boolean z15 = z14;
            if (A0S()) {
                z15 = (z14 ? 1 : 0) + 1;
            }
            boolean z16 = z15;
            if (A0H()) {
                z16 = (z15 ? 1 : 0) + 1;
            }
            boolean z17 = z16;
            if (A0I()) {
                z17 = (z16 ? 1 : 0) + 1;
            }
            boolean z18 = z17;
            if (A0A()) {
                z18 = (z17 ? 1 : 0) + 1;
            }
            boolean z19 = z18;
            if (A03()) {
                z19 = (z18 ? 1 : 0) + 1;
            }
            boolean z20 = z19;
            if (A0N()) {
                z20 = (z19 ? 1 : 0) + 1;
            }
            boolean z21 = z20;
            if (A0O()) {
                z21 = (z20 ? 1 : 0) + 1;
            }
            boolean z22 = z21;
            if (A0G()) {
                z22 = (z21 ? 1 : 0) + 1;
            }
            boolean z23 = z22;
            if (A0X()) {
                z23 = (z22 ? 1 : 0) + 1;
            }
            boolean z24 = z23;
            if (A0W()) {
                z24 = (z23 ? 1 : 0) + 1;
            }
            boolean z25 = z24;
            if (A0T()) {
                z25 = (z24 ? 1 : 0) + 1;
            }
            boolean z26 = z25;
            if (A0F()) {
                z26 = (z25 ? 1 : 0) + 1;
            }
            boolean z27 = z26;
            if (A0D()) {
                z27 = (z26 ? 1 : 0) + 1;
            }
            boolean z28 = z27;
            if (A0E()) {
                z28 = (z27 ? 1 : 0) + 1;
            }
            boolean z29 = z28;
            if (A06()) {
                z29 = (z28 ? 1 : 0) + 1;
            }
            boolean z30 = z29;
            if (A0Y()) {
                z30 = (z29 ? 1 : 0) + 1;
            }
            boolean z31 = z30;
            if (A0K()) {
                z31 = (z30 ? 1 : 0) + 1;
            }
            boolean z32 = z31;
            if (A0C()) {
                z32 = (z31 ? 1 : 0) + 1;
            }
            this.A0I = z32 ? 1 : 0;
            z = z32;
        }
        return z;
    }

    public static AtomicInteger A01(Cd6 cd6) {
        cd6.A02();
        return C1Y6.A04;
    }

    private void A02() {
        synchronized (this) {
            if (!this.A11) {
                if (this.A12 == null) {
                    throw AnonymousClass001.A0Q("The context passed in the ThreadMenuItemInterface.newBuilder() is null.\nIf you have other questions, please post it to group Android Messenger Modularity.");
                }
                this.A0Q = C1v5.A01;
                this.A11 = true;
            }
        }
    }

    private boolean A03() {
        boolean A1Q;
        if (this.A0V == null) {
            AtomicInteger A01 = A01(this);
            int andIncrement = A01.getAndIncrement();
            1YC r0 = this.A18;
            r0.A0B("com.facebook.messaging.chatheads.plugins.core.threadmenuitem.OpenChatHeadsMenuItemImplementation", "messaging.chatheads.core.threadmenuitem.OpenChatHeadsMenuItemImplementation", "com.facebook.messaging.threadlist.plugins.interfaces.threadmenuitem.ThreadMenuItemInterfaceSpec", "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "com.facebook.messaging.chatheads.plugins.core.ChatheadsCoreKillSwitch", andIncrement);
            Exception exc = null;
            try {
                try {
                    C1v5 c1v5 = this.A0Q;
                    if (c1v5 != null) {
                        Boolean A00 = c1v5.A00("com.facebook.messaging.chatheads.plugins.core.ChatheadsCoreKillSwitch");
                        if (A00 != null) {
                            A1Q = A00.booleanValue();
                            Object obj = (A1Q || !OpenChatHeadsMenuItemImplementation.A03(this.A12, this.A17)) ? C1Y6.A03 : C1Y6.A02;
                            this.A0V = obj;
                            r0.A07("messaging.chatheads.core.threadmenuitem.OpenChatHeadsMenuItemImplementation", "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", andIncrement, 1BL.A1U(obj));
                        }
                    }
                    A1Q = AbL.A1Q(r0, A01);
                    if (A1Q) {
                    }
                    this.A0V = obj;
                    r0.A07("messaging.chatheads.core.threadmenuitem.OpenChatHeadsMenuItemImplementation", "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", andIncrement, 1BL.A1U(obj));
                } catch (Exception e) {
                    this.A0V = C1Y6.A03;
                    try {
                        throw e;
                    } catch (Throwable th) {
                        th = th;
                        exc = e;
                        r0.A03(exc, "messaging.chatheads.core.threadmenuitem.OpenChatHeadsMenuItemImplementation", "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", andIncrement, 1BL.A1U(this.A0V));
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                r0.A03(exc, "messaging.chatheads.core.threadmenuitem.OpenChatHeadsMenuItemImplementation", "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", andIncrement, 1BL.A1U(this.A0V));
                throw th;
            }
        }
        return 1BK.A1U(this.A0V);
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x015f, code lost:
    
        if (((X.1WY) r0.get()).A05() == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0179, code lost:
    
        r301.A0J = new com.facebook.messaging.communitymessaging.plugins.bumpedthreads.bumpmenuitem.BumpMenuItemImplementation(r0, r0, r301.A16, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0180, code lost:
    
        r303 = X.C1Y6.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01dc, code lost:
    
        if (X.AbF.A14(r0) != null) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01ef, code lost:
    
        if (X.4YU.A1Y(r0, com.facebook.acra.constants.ActionId.APP_DID_BECOME_ACTIVE) == false) goto L110;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0098 A[Catch: Exception -> 0x020a, all -> 0x0221, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x020a, blocks: (B:5:0x0049, B:9:0x0053, B:12:0x005d, B:15:0x0098, B:16:0x009e, B:17:0x00a4, B:18:0x00aa, B:20:0x00b7, B:22:0x00c0, B:24:0x00c7, B:25:0x00cc, B:28:0x00d8, B:30:0x00e6, B:31:0x00ed, B:34:0x00f7, B:35:0x00fe, B:36:0x0105, B:38:0x010e, B:41:0x011a, B:44:0x0124, B:47:0x0130, B:50:0x013c, B:53:0x0146, B:55:0x014e, B:56:0x0152, B:57:0x0157, B:60:0x0162, B:61:0x0168, B:63:0x0173, B:64:0x0179, B:65:0x017d, B:65:0x017d, B:68:0x0203, B:71:0x0184, B:75:0x0195, B:76:0x019b, B:77:0x01a0, B:80:0x01ab, B:83:0x01b5, B:84:0x01bb, B:86:0x01c1, B:89:0x01cc, B:92:0x01d6, B:96:0x01e6, B:100:0x01fe, B:101:0x0066, B:102:0x006b, B:105:0x0077, B:108:0x007f, B:110:0x008c), top: B:4:0x0049, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A04() {
        /*
            Method dump skipped, instructions count: 605
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Cd6.A04():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x01c8, code lost:
    
        if (r0.A02() == false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01e2, code lost:
    
        if (((X.1WY) X.1Bi.A03(66481)).A05() == false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0213, code lost:
    
        r301.A0K = new com.facebook.messaging.communitymessaging.plugins.bumpedthreads.unbumpmenuitem.UnbumpMenuItemImplementation(r0, r0, r301.A16, r0, r301.A19);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x021a, code lost:
    
        r303 = X.C1Y6.A02;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0098 A[Catch: Exception -> 0x0223, all -> 0x0231, TRY_ENTER, TRY_LEAVE, TryCatch #3 {Exception -> 0x0223, blocks: (B:5:0x0049, B:9:0x0053, B:12:0x005d, B:15:0x0098, B:16:0x009e, B:17:0x00a4, B:18:0x00aa, B:20:0x00b7, B:22:0x00c0, B:24:0x00c7, B:25:0x00cc, B:29:0x00e1, B:31:0x00ed, B:34:0x00f7, B:35:0x00fd, B:37:0x0103, B:40:0x010e, B:41:0x0115, B:42:0x011c, B:44:0x0125, B:47:0x0131, B:50:0x013b, B:53:0x0147, B:56:0x0153, B:61:0x01d5, B:62:0x01da, B:65:0x01e5, B:66:0x01eb, B:67:0x01f1, B:69:0x020d, B:70:0x0213, B:71:0x0217, B:71:0x0217, B:74:0x021c, B:79:0x0174, B:83:0x0177, B:87:0x0186, B:88:0x018d, B:89:0x0194, B:92:0x01a0, B:96:0x01b3, B:99:0x01bf, B:102:0x01ce, B:103:0x0066, B:104:0x006b, B:107:0x0077, B:110:0x007f, B:112:0x008c), top: B:4:0x0049, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A05() {
        /*
            Method dump skipped, instructions count: 630
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Cd6.A05():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0093 A[Catch: Exception -> 0x0152, all -> 0x0169, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x0152, blocks: (B:5:0x0045, B:9:0x004f, B:12:0x0059, B:15:0x0093, B:16:0x0099, B:18:0x00a3, B:19:0x00a7, B:19:0x00a7, B:21:0x00ac, B:22:0x00b2, B:25:0x00bd, B:28:0x00c7, B:29:0x00ce, B:31:0x00d4, B:34:0x00e0, B:37:0x00ea, B:38:0x00f0, B:40:0x00fb, B:43:0x0109, B:44:0x010f, B:46:0x011a, B:49:0x0128, B:50:0x012e, B:52:0x0135, B:53:0x013b, B:54:0x013f, B:54:0x013f, B:57:0x014b, B:60:0x0146, B:61:0x0062, B:62:0x0067, B:65:0x0073, B:68:0x007b, B:70:0x0087), top: B:4:0x0045, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A06() {
        /*
            Method dump skipped, instructions count: 421
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Cd6.A06():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0093 A[Catch: Exception -> 0x0152, all -> 0x0160, TRY_ENTER, TRY_LEAVE, TryCatch #3 {Exception -> 0x0152, blocks: (B:5:0x0045, B:9:0x004f, B:12:0x0059, B:15:0x0093, B:16:0x0099, B:18:0x009f, B:20:0x00a8, B:22:0x00b3, B:24:0x00bf, B:27:0x00ca, B:28:0x00d0, B:30:0x00d6, B:32:0x00dc, B:37:0x00ee, B:39:0x00f7, B:43:0x0104, B:47:0x0111, B:50:0x011c, B:51:0x0122, B:52:0x0128, B:54:0x0133, B:55:0x0138, B:56:0x013c, B:56:0x013c, B:59:0x014b, B:64:0x0145, B:66:0x0146, B:66:0x0146, B:68:0x0062, B:69:0x0067, B:72:0x0073, B:75:0x007b, B:77:0x0087), top: B:4:0x0045, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A07() {
        /*
            Method dump skipped, instructions count: 421
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Cd6.A07():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0093 A[Catch: Exception -> 0x0120, all -> 0x012c, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x0120, blocks: (B:6:0x0045, B:10:0x004f, B:13:0x0059, B:16:0x0093, B:17:0x0099, B:19:0x009f, B:21:0x00a8, B:23:0x00af, B:25:0x00b9, B:26:0x00bf, B:28:0x00c5, B:32:0x00d5, B:37:0x00f3, B:39:0x00f9, B:42:0x0104, B:44:0x010b, B:45:0x0110, B:46:0x0114, B:46:0x0114, B:49:0x0119, B:54:0x00eb, B:56:0x00ec, B:56:0x00ec, B:58:0x0062, B:59:0x0067, B:62:0x0073, B:65:0x007b, B:67:0x0087), top: B:5:0x0045, outer: #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A08() {
        /*
            Method dump skipped, instructions count: 368
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Cd6.A08():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0075 A[Catch: Exception -> 0x0097, all -> 0x00a5, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x0097, blocks: (B:5:0x0041, B:9:0x004b, B:12:0x0055, B:15:0x006e, B:17:0x0090, B:20:0x0075, B:21:0x007a, B:23:0x0080, B:26:0x008b, B:28:0x0060), top: B:4:0x0041, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A09() {
        /*
            Method dump skipped, instructions count: 229
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Cd6.A09():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0075 A[Catch: Exception -> 0x009f, all -> 0x00ad, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x009f, blocks: (B:5:0x0041, B:9:0x004b, B:12:0x0055, B:15:0x006e, B:17:0x0098, B:20:0x0075, B:21:0x007b, B:22:0x0080, B:24:0x0088, B:27:0x0093, B:29:0x0060), top: B:4:0x0041, outer: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A0A() {
        /*
            Method dump skipped, instructions count: 237
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Cd6.A0A():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0099 A[Catch: Exception -> 0x00bd, all -> 0x00c9, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x00bd, blocks: (B:5:0x0041, B:9:0x004b, B:12:0x0055, B:15:0x0092, B:17:0x00b6, B:20:0x0099, B:21:0x009f, B:23:0x00a5, B:26:0x00b1, B:27:0x005e, B:28:0x0063, B:31:0x006f, B:34:0x0077, B:36:0x0083), top: B:4:0x0041, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A0B() {
        /*
            Method dump skipped, instructions count: 267
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Cd6.A0B():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x009f A[Catch: Exception -> 0x00c3, all -> 0x00cf, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x00c3, blocks: (B:5:0x0047, B:9:0x0051, B:12:0x005b, B:15:0x0098, B:17:0x00bc, B:20:0x009f, B:21:0x00a5, B:23:0x00ac, B:26:0x00b7, B:27:0x0064, B:28:0x0069, B:31:0x0075, B:34:0x007d, B:36:0x0089), top: B:4:0x0047, outer: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A0C() {
        /*
            Method dump skipped, instructions count: 273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Cd6.A0C():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x009e A[Catch: Exception -> 0x00f4, all -> 0x0100, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x00f4, blocks: (B:5:0x0046, B:9:0x0050, B:12:0x005a, B:15:0x0097, B:17:0x00ed, B:20:0x009e, B:22:0x00a9, B:24:0x00b2, B:25:0x00b9, B:26:0x00c0, B:28:0x00c7, B:31:0x00d2, B:32:0x00d8, B:34:0x00df, B:35:0x00e4, B:36:0x00e8, B:36:0x00e8, B:38:0x0063, B:39:0x0068, B:42:0x0074, B:45:0x007c, B:47:0x0088), top: B:4:0x0046, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A0D() {
        /*
            Method dump skipped, instructions count: 322
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Cd6.A0D():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00a4 A[Catch: Exception -> 0x0120, all -> 0x012e, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x0120, blocks: (B:5:0x004c, B:9:0x0056, B:12:0x0060, B:15:0x009d, B:17:0x0119, B:20:0x00a4, B:21:0x00aa, B:23:0x00b4, B:24:0x00ba, B:26:0x00c3, B:27:0x00ca, B:28:0x00d1, B:29:0x00d8, B:31:0x00e0, B:33:0x00e8, B:36:0x00f3, B:37:0x00f9, B:39:0x0106, B:42:0x0114, B:43:0x0069, B:44:0x006e, B:47:0x007a, B:50:0x0082, B:52:0x008e), top: B:4:0x004c, outer: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A0E() {
        /*
            Method dump skipped, instructions count: 371
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Cd6.A0E():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0079 A[Catch: Exception -> 0x0125, all -> 0x0133, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x0125, blocks: (B:5:0x0045, B:9:0x004f, B:12:0x0059, B:15:0x0072, B:17:0x011e, B:20:0x0079, B:23:0x0084, B:25:0x0090, B:26:0x0097, B:28:0x009f, B:30:0x00a5, B:32:0x00ae, B:34:0x00b4, B:35:0x00b9, B:37:0x00c8, B:38:0x00ce, B:39:0x00d3, B:40:0x00d9, B:43:0x00e4, B:45:0x00eb, B:48:0x00f4, B:49:0x00fa, B:50:0x0100, B:51:0x0105, B:53:0x010f, B:54:0x0115, B:55:0x0119, B:55:0x0119, B:58:0x0064), top: B:4:0x0045, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A0F() {
        /*
            Method dump skipped, instructions count: 373
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Cd6.A0F():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00c7 A[Catch: Exception -> 0x00f5, all -> 0x0101, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x00f5, blocks: (B:5:0x0047, B:9:0x0051, B:12:0x005b, B:15:0x00c0, B:17:0x00ee, B:20:0x00c7, B:22:0x00d4, B:24:0x00da, B:25:0x00df, B:28:0x00e9, B:29:0x0064, B:30:0x0069, B:33:0x0075, B:36:0x007d, B:37:0x0086, B:40:0x008f, B:42:0x009d, B:43:0x00a3, B:45:0x00a9, B:48:0x00b1), top: B:4:0x0047, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A0G() {
        /*
            Method dump skipped, instructions count: 323
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Cd6.A0G():boolean");
    }

    private boolean A0H() {
        boolean A01;
        if (this.A0j == null) {
            AtomicInteger A012 = A01(this);
            int andIncrement = A012.getAndIncrement();
            1YC r0 = this.A18;
            r0.A0B("com.facebook.messaging.notify.plugins.mute.mutemenuitem.MuteMenuItemImplementation", "messaging.notify.mute.mutemenuitem.MuteMenuItemImplementation", "com.facebook.messaging.threadlist.plugins.interfaces.threadmenuitem.ThreadMenuItemInterfaceSpec", "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "com.facebook.messaging.notify.plugins.mute.NotifyMuteKillSwitch", andIncrement);
            Exception exc = null;
            try {
                try {
                    C1v5 c1v5 = this.A0Q;
                    if (c1v5 != null) {
                        Boolean A00 = c1v5.A00("com.facebook.messaging.notify.plugins.mute.NotifyMuteKillSwitch");
                        if (A00 != null) {
                            A01 = A00.booleanValue();
                            Object obj = (A01 || !MuteMenuItemImplementation.A02(this.A17, this.A1B)) ? C1Y6.A03 : C1Y6.A02;
                            this.A0j = obj;
                            r0.A07("messaging.notify.mute.mutemenuitem.MuteMenuItemImplementation", "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", andIncrement, 1BL.A1U(obj));
                        }
                    }
                    A01 = 2nS.A01(r0, A012);
                    if (A01) {
                    }
                    this.A0j = obj;
                    r0.A07("messaging.notify.mute.mutemenuitem.MuteMenuItemImplementation", "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", andIncrement, 1BL.A1U(obj));
                } catch (Exception e) {
                    this.A0j = C1Y6.A03;
                    try {
                        throw e;
                    } catch (Throwable th) {
                        th = th;
                        exc = e;
                        r0.A03(exc, "messaging.notify.mute.mutemenuitem.MuteMenuItemImplementation", "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", andIncrement, 1BL.A1U(this.A0j));
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                r0.A03(exc, "messaging.notify.mute.mutemenuitem.MuteMenuItemImplementation", "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", andIncrement, 1BL.A1U(this.A0j));
                throw th;
            }
        }
        return 1BK.A1U(this.A0j);
    }

    private boolean A0I() {
        boolean A01;
        if (this.A0k == null) {
            AtomicInteger A012 = A01(this);
            int andIncrement = A012.getAndIncrement();
            1YC r0 = this.A18;
            r0.A0B("com.facebook.messaging.notify.plugins.mute.unmutemenuitem.UnmuteMenuItemImplementation", "messaging.notify.mute.unmutemenuitem.UnmuteMenuItemImplementation", "com.facebook.messaging.threadlist.plugins.interfaces.threadmenuitem.ThreadMenuItemInterfaceSpec", "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "com.facebook.messaging.notify.plugins.mute.NotifyMuteKillSwitch", andIncrement);
            Exception exc = null;
            try {
                try {
                    C1v5 c1v5 = this.A0Q;
                    if (c1v5 != null) {
                        Boolean A00 = c1v5.A00("com.facebook.messaging.notify.plugins.mute.NotifyMuteKillSwitch");
                        if (A00 != null) {
                            A01 = A00.booleanValue();
                            Object obj = (A01 || !UnmuteMenuItemImplementation.A02(this.A17)) ? C1Y6.A03 : C1Y6.A02;
                            this.A0k = obj;
                            r0.A07("messaging.notify.mute.unmutemenuitem.UnmuteMenuItemImplementation", "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", andIncrement, 1BL.A1U(obj));
                        }
                    }
                    A01 = 2nS.A01(r0, A012);
                    if (A01) {
                    }
                    this.A0k = obj;
                    r0.A07("messaging.notify.mute.unmutemenuitem.UnmuteMenuItemImplementation", "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", andIncrement, 1BL.A1U(obj));
                } catch (Exception e) {
                    this.A0k = C1Y6.A03;
                    try {
                        throw e;
                    } catch (Throwable th) {
                        th = th;
                        exc = e;
                        r0.A03(exc, "messaging.notify.mute.unmutemenuitem.UnmuteMenuItemImplementation", "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", andIncrement, 1BL.A1U(this.A0k));
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                r0.A03(exc, "messaging.notify.mute.unmutemenuitem.UnmuteMenuItemImplementation", "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", andIncrement, 1BL.A1U(this.A0k));
                throw th;
            }
        }
        return 1BK.A1U(this.A0k);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x009f A[Catch: Exception -> 0x00f1, all -> 0x00fd, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x00f1, blocks: (B:5:0x0047, B:9:0x0051, B:12:0x005b, B:15:0x0098, B:17:0x00ea, B:20:0x009f, B:22:0x00ac, B:24:0x00b2, B:27:0x00bc, B:30:0x00c8, B:31:0x00cd, B:32:0x00d3, B:34:0x00db, B:35:0x00e1, B:36:0x00e5, B:36:0x00e5, B:38:0x0064, B:39:0x0069, B:42:0x0075, B:45:0x007d, B:47:0x0089), top: B:4:0x0047, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A0J() {
        /*
            Method dump skipped, instructions count: 319
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Cd6.A0J():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0099 A[Catch: Exception -> 0x011d, all -> 0x012b, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x011d, blocks: (B:5:0x004b, B:9:0x0055, B:12:0x005f, B:15:0x0099, B:17:0x00a4, B:19:0x00a9, B:22:0x00b3, B:26:0x00c5, B:29:0x00d2, B:31:0x00de, B:34:0x00ec, B:35:0x00f2, B:36:0x00f8, B:38:0x0101, B:39:0x0106, B:40:0x010a, B:40:0x010a, B:43:0x0116, B:46:0x0111, B:47:0x0068, B:48:0x006d, B:51:0x0079, B:54:0x0081, B:56:0x008d), top: B:4:0x004b, outer: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A0K() {
        /*
            Method dump skipped, instructions count: 368
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Cd6.A0K():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0099 A[Catch: Exception -> 0x0106, all -> 0x0112, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x0106, blocks: (B:5:0x0041, B:9:0x004b, B:12:0x0055, B:15:0x0092, B:17:0x00ff, B:20:0x0099, B:21:0x009f, B:22:0x00a4, B:26:0x00b7, B:27:0x00be, B:29:0x00c6, B:31:0x00cc, B:35:0x00dc, B:36:0x00e2, B:38:0x00e8, B:41:0x00ee, B:44:0x00fa, B:45:0x005e, B:46:0x0063, B:49:0x006f, B:52:0x0077, B:54:0x0083), top: B:4:0x0041, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A0L() {
        /*
            Method dump skipped, instructions count: 340
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Cd6.A0L():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0099 A[Catch: Exception -> 0x00c3, all -> 0x00cf, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x00c3, blocks: (B:5:0x0041, B:9:0x004b, B:12:0x0055, B:15:0x0092, B:17:0x00bc, B:20:0x0099, B:21:0x009e, B:22:0x00a4, B:24:0x00ab, B:27:0x00b7, B:28:0x005e, B:29:0x0063, B:32:0x006f, B:35:0x0077, B:37:0x0083), top: B:4:0x0041, outer: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A0M() {
        /*
            Method dump skipped, instructions count: 273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Cd6.A0M():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0099 A[Catch: Exception -> 0x00c3, all -> 0x00cf, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x00c3, blocks: (B:5:0x0041, B:9:0x004b, B:12:0x0055, B:15:0x0092, B:17:0x00bc, B:20:0x0099, B:21:0x009e, B:22:0x00a4, B:24:0x00ac, B:27:0x00b7, B:28:0x005e, B:29:0x0063, B:32:0x006f, B:35:0x0077, B:37:0x0083), top: B:4:0x0041, outer: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A0N() {
        /*
            Method dump skipped, instructions count: 273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Cd6.A0N():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0099 A[Catch: Exception -> 0x00c3, all -> 0x00cf, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x00c3, blocks: (B:5:0x0041, B:9:0x004b, B:12:0x0055, B:15:0x0092, B:17:0x00bc, B:20:0x0099, B:21:0x009e, B:22:0x00a4, B:24:0x00ac, B:27:0x00b7, B:28:0x005e, B:29:0x0063, B:32:0x006f, B:35:0x0077, B:37:0x0083), top: B:4:0x0041, outer: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A0O() {
        /*
            Method dump skipped, instructions count: 273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Cd6.A0O():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0099 A[Catch: Exception -> 0x00e3, all -> 0x00ef, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x00e3, blocks: (B:5:0x0041, B:9:0x004b, B:12:0x0055, B:15:0x0092, B:17:0x00dc, B:20:0x0099, B:22:0x00a6, B:24:0x00ac, B:27:0x00b6, B:30:0x00c2, B:31:0x00c8, B:33:0x00cd, B:34:0x00d3, B:35:0x00d7, B:35:0x00d7, B:37:0x005e, B:38:0x0063, B:41:0x006f, B:44:0x0077, B:46:0x0083), top: B:4:0x0041, outer: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A0P() {
        /*
            Method dump skipped, instructions count: 305
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Cd6.A0P():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x008f A[Catch: Exception -> 0x00c7, all -> 0x00d3, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x00c7, blocks: (B:5:0x0041, B:9:0x004b, B:12:0x0055, B:15:0x008f, B:16:0x0094, B:19:0x009f, B:20:0x00a5, B:22:0x00aa, B:23:0x00b0, B:24:0x00b4, B:24:0x00b4, B:27:0x00c0, B:30:0x00bb, B:31:0x005e, B:32:0x0063, B:35:0x006f, B:38:0x0077, B:40:0x0083), top: B:4:0x0041, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A0Q() {
        /*
            Method dump skipped, instructions count: 277
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Cd6.A0Q():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0099 A[Catch: Exception -> 0x00bd, all -> 0x00c9, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x00bd, blocks: (B:5:0x0041, B:9:0x004b, B:12:0x0055, B:15:0x0092, B:17:0x00b6, B:20:0x0099, B:21:0x009f, B:23:0x00a6, B:26:0x00b1, B:27:0x005e, B:28:0x0063, B:31:0x006f, B:34:0x0077, B:36:0x0083), top: B:4:0x0041, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A0R() {
        /*
            Method dump skipped, instructions count: 267
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Cd6.A0R():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0099 A[Catch: Exception -> 0x00c3, all -> 0x00cf, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x00c3, blocks: (B:5:0x0041, B:9:0x004b, B:12:0x0055, B:15:0x0092, B:17:0x00bc, B:20:0x0099, B:21:0x009e, B:22:0x00a4, B:24:0x00ac, B:27:0x00b7, B:28:0x005e, B:29:0x0063, B:32:0x006f, B:35:0x0077, B:37:0x0083), top: B:4:0x0041, outer: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A0S() {
        /*
            Method dump skipped, instructions count: 273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Cd6.A0S():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0075 A[Catch: Exception -> 0x00c3, all -> 0x00d1, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x00c3, blocks: (B:5:0x0041, B:9:0x004b, B:12:0x0055, B:15:0x006e, B:17:0x00bc, B:20:0x0075, B:21:0x007b, B:22:0x0081, B:23:0x0086, B:27:0x0097, B:28:0x009d, B:30:0x00a3, B:33:0x00ac, B:36:0x00b7, B:38:0x0060), top: B:4:0x0041, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A0T() {
        /*
            Method dump skipped, instructions count: 273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Cd6.A0T():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00dd A[Catch: Exception -> 0x016b, all -> 0x0177, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x016b, blocks: (B:6:0x0045, B:10:0x004f, B:13:0x0059, B:16:0x00d6, B:18:0x014d, B:20:0x00dd, B:21:0x00e3, B:23:0x00ec, B:25:0x00f6, B:26:0x00fc, B:29:0x0106, B:30:0x010d, B:33:0x0119, B:36:0x0125, B:37:0x012a, B:38:0x012f, B:40:0x013a, B:43:0x0148, B:44:0x0062, B:45:0x0067, B:48:0x0073, B:51:0x007b, B:52:0x0084, B:57:0x00c4, B:57:0x00c4, B:59:0x00c8, B:60:0x0093, B:62:0x00a4, B:70:0x00bf, B:73:0x0159, B:75:0x0163, B:77:0x016a), top: B:5:0x0045, outer: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A0U() {
        /*
            Method dump skipped, instructions count: 443
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Cd6.A0U():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0099 A[Catch: Exception -> 0x00bd, all -> 0x00c9, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x00bd, blocks: (B:5:0x0041, B:9:0x004b, B:12:0x0055, B:15:0x0092, B:17:0x00b6, B:20:0x0099, B:21:0x009f, B:23:0x00a5, B:26:0x00b1, B:27:0x005e, B:28:0x0063, B:31:0x006f, B:34:0x0077, B:36:0x0083), top: B:4:0x0041, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A0V() {
        /*
            Method dump skipped, instructions count: 267
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Cd6.A0V():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0099 A[Catch: Exception -> 0x00bd, all -> 0x00c9, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x00bd, blocks: (B:5:0x0041, B:9:0x004b, B:12:0x0055, B:15:0x0092, B:17:0x00b6, B:20:0x0099, B:21:0x009f, B:23:0x00a5, B:26:0x00b1, B:27:0x005e, B:28:0x0063, B:31:0x006f, B:34:0x0077, B:36:0x0083), top: B:4:0x0041, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A0W() {
        /*
            Method dump skipped, instructions count: 267
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Cd6.A0W():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0075 A[Catch: Exception -> 0x00a7, all -> 0x00b5, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x00a7, blocks: (B:5:0x0041, B:9:0x004b, B:12:0x0055, B:15:0x006e, B:17:0x00a0, B:20:0x0075, B:21:0x007b, B:22:0x0081, B:23:0x0086, B:25:0x008f, B:28:0x009b, B:30:0x0060), top: B:4:0x0041, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A0X() {
        /*
            Method dump skipped, instructions count: 245
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Cd6.A0X():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0099 A[Catch: Exception -> 0x00bd, all -> 0x00c9, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x00bd, blocks: (B:5:0x0041, B:9:0x004b, B:12:0x0055, B:15:0x0092, B:17:0x00b6, B:20:0x0099, B:21:0x009f, B:23:0x00a6, B:26:0x00b1, B:27:0x005e, B:28:0x0063, B:31:0x006f, B:34:0x0077, B:36:0x0083), top: B:4:0x0041, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A0Y() {
        /*
            Method dump skipped, instructions count: 267
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Cd6.A0Y():boolean");
    }

    @Override // X.C4YN
    public void ANc() {
        AtomicInteger atomicInteger = C1Y6.A04;
        int andIncrement = atomicInteger.getAndIncrement();
        1YC r0 = this.A18;
        r0.A08("com.facebook.messaging.threadlist.plugins.interfaces.threadmenuitem.ThreadMenuItemInterfaceSpec", "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "dismissDialogs", andIncrement);
        Exception e = null;
        try {
            A02();
            if (A0H()) {
                int andIncrement2 = atomicInteger.getAndIncrement();
                r0.A0A("com.facebook.messaging.notify.plugins.mute.mutemenuitem.MuteMenuItemImplementation", "messaging.notify.mute.mutemenuitem.MuteMenuItemImplementation", "com.facebook.messaging.threadlist.plugins.interfaces.threadmenuitem.ThreadMenuItemInterfaceSpec", andIncrement2, "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "com.facebook.messaging.notify.plugins.mute.NotifyMuteKillSwitch", "dismissDialogs");
                try {
                    try {
                        Context context = this.A12;
                        11T.A0F(context, 0);
                        MuteNotificationsDialogFragment muteNotificationsDialogFragment = ((CHQ) 1Bn.A0E(context, (1BY) null, 82629)).A00;
                        if (muteNotificationsDialogFragment != null) {
                            muteNotificationsDialogFragment.A0o();
                        }
                        r0.A09("messaging.notify.mute.mutemenuitem.MuteMenuItemImplementation", "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "dismissDialogs", andIncrement2);
                    } catch (Exception e2) {
                        e = e2;
                        throw e;
                    }
                } catch (Throwable th) {
                    r0.A04(e, "messaging.notify.mute.mutemenuitem.MuteMenuItemImplementation", "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "dismissDialogs", andIncrement2);
                    throw th;
                }
            }
            r0.A02((Exception) null, "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "dismissDialogs", andIncrement);
        } catch (Throwable th2) {
            r0.A02(e, "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "dismissDialogs", andIncrement);
            throw th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:701:0x0f07, code lost:
    
        if (r0 != false) goto L698;
     */
    @Override // X.C4YN
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.ArrayList Awf() {
        /*
            Method dump skipped, instructions count: 5010
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Cd6.Awf():java.util.ArrayList");
    }

    /* JADX WARN: Code restructure failed: missing block: B:316:0x07fc, code lost:
    
        if (r0 != 14) goto L307;
     */
    /* JADX WARN: Failed to calculate best type for var: r314v1 ??
    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:156)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:133)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:238)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
     */
    /* JADX WARN: Failed to calculate best type for var: r314v1 ??
    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:145)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:123)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:101)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
     */
    /* JADX WARN: Multi-variable type inference failed. Error: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:70)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.applyResolvedVars(TypeSearch.java:100)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:76)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.runMultiVariableSearch(FixTypesVisitor.java:116)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
     */
    /* JADX WARN: Not initialized variable reg: 314, insn: 0x1c20: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r314 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:1061:0x1c1d */
    @Override // X.C4YN
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void C6a(int r302) {
        /*
            Method dump skipped, instructions count: 7265
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Cd6.C6a(int):void");
    }
}
