package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.messaging.groups.plugins.core.creategroupwithmenuitem.CreateGroupWithMenuItemImplementation;
import com.facebook.messaging.inbox.units.InboxTrackableItem;
import com.facebook.messaging.integrity.frx.plugins.platformreport.platformreportmenuitem.PlatformReportMenuItemImplementation;
import com.facebook.messaging.marketplace.plugins.folder.hidemenuitem.HideMarketplaceFolderMenuItem;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.msys.thread.plugins.platypustoggle.platypustoggleinboxmenuitem.PlatypusToggleInboxMenuItem;
import com.facebook.messaging.nativepagereply.spam.plugins.spamfolder.menuitem.SpamMoveThreadMenuItem;
import com.facebook.messaging.notify.plugins.mute.mutemenuitem.MuteMenuItemImplementation;
import com.facebook.messaging.notify.plugins.mute.unmutemenuitem.UnmuteMenuItemImplementation;
import com.facebook.messaging.threadlist.threaditemmenu.plugins.core.archivemenuitem.ArchiveMenuItemImplementation;
import com.facebook.messaging.threadlist.threaditemmenu.plugins.core.deletemenuitem.DeleteMenuItemImplementation;
import com.facebook.messaging.threadlist.threaditemmenu.plugins.core.markreadmenuitem.MarkReadMenuItemImplementation;
import com.facebook.messaging.threadlist.threaditemmenu.plugins.core.markunreadmenuitem.MarkUnreadMenuItemImplementation;
import com.facebook.messaging.threadlist.threaditemmenu.plugins.core.pinmenuitem.PinMenuItemImplementation;
import com.facebook.messaging.threadlist.threaditemmenu.plugins.core.unpinmenuitem.UnpinMenuItemImplementation;
import com.facebook.messaging.threadlist.threaditemmenu.plugins.folders.unarchivemenuitem.unarchivemenuitemimplementation.UnarchiveMenuItemImplementation;
import com.facebook.messaging.threadlist.threaditemmenu.plugins.messenger.leavemenuitem.LeaveMenuItemImplementation;
import com.facebook.messaging.wellbeing.selfremediation.block.plugins.core.blockmessagesmenuitem.BlockMessagesMenuItemImplementation;
import com.facebook.messaging.wellbeing.selfremediation.ignore.plugins.core.ignoregroupmenuitem.IgnoreGroupMenuItemImplementation;
import com.facebook.messaging.wellbeing.selfremediation.ignore.plugins.core.ignoremenuitem.IgnoreMessagesMenuItemImplementation;
import com.facebook.messaging.wellbeing.selfremediation.restrict.plugins.threadmenuitem.RestrictThreadMenuItem;
import com.facebook.messaging.wellbeing.unknowncontact.messagerequests.plugins.inboxfolder.hidemenuitem.HideMessageRequestFolderMenuItem;
import com.facebook.orca.notify.mute.MuteNotificationsDialogFragment;
import com.facebook.user.model.User;
import com.facebook.xapp.messaging.capability.vector.Capabilities;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: Cd5.class */
public final class Cd5 implements C4YN {
    public 5dC A00;
    public C94 A01;
    public BTs A02;
    public CbX A03;
    public CMy A04;
    public BU2 A05;
    public BU2 A06;
    public 4ME A07;
    public Bzc A08;
    public CG9 A09;
    public CG9 A0A;
    public F3F A0B;
    public C1742Arc A0C;
    public 7EN A0D;
    public Boolean A0E;
    public PlatypusToggleInboxMenuItem A0G;
    public C1v5 A0H;
    public PinMenuItemImplementation A0I;
    public UnpinMenuItemImplementation A0J;
    public Object A0K;
    public Object A0L;
    public Object A0M;
    public Object A0N;
    public Object A0O;
    public Object A0P;
    public Object A0Q;
    public Object A0R;
    public Object A0S;
    public Object A0T;
    public Object A0U;
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
    public boolean A0f;
    public final Context A0g;
    public final 06Z A0h;
    public final FbUserSession A0i;
    public final CallerContext A0j;
    public final InboxTrackableItem A0k;
    public final ThreadSummary A0l;
    public final 2SI A0n;
    public final User A0o;
    public final Capabilities A0p;
    public int A0F = -1;
    public final 1YC A0m = 1YC.A03;

    public Cd5(Context context, 06Z r303, FbUserSession fbUserSession, CallerContext callerContext, InboxTrackableItem inboxTrackableItem, ThreadSummary threadSummary, 2SI r308, User user, Capabilities capabilities) {
        this.A0g = context;
        this.A0l = threadSummary;
        this.A0h = r303;
        this.A0n = r308;
        this.A0p = capabilities;
        this.A0i = fbUserSession;
        this.A0j = callerContext;
        this.A0o = user;
        this.A0k = inboxTrackableItem;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v101, types: [int] */
    /* JADX WARN: Type inference failed for: r0v103, types: [int] */
    /* JADX WARN: Type inference failed for: r0v105, types: [int] */
    /* JADX WARN: Type inference failed for: r0v107, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v69, types: [int] */
    /* JADX WARN: Type inference failed for: r0v71, types: [int] */
    /* JADX WARN: Type inference failed for: r0v73, types: [int] */
    /* JADX WARN: Type inference failed for: r0v75, types: [int] */
    /* JADX WARN: Type inference failed for: r0v77, types: [int] */
    /* JADX WARN: Type inference failed for: r0v79, types: [int] */
    /* JADX WARN: Type inference failed for: r0v81, types: [int] */
    /* JADX WARN: Type inference failed for: r0v83, types: [int] */
    /* JADX WARN: Type inference failed for: r0v85, types: [int] */
    /* JADX WARN: Type inference failed for: r0v87, types: [int] */
    /* JADX WARN: Type inference failed for: r0v89, types: [int] */
    /* JADX WARN: Type inference failed for: r0v91, types: [int] */
    /* JADX WARN: Type inference failed for: r0v93, types: [int] */
    /* JADX WARN: Type inference failed for: r0v95, types: [int] */
    /* JADX WARN: Type inference failed for: r0v97, types: [int] */
    /* JADX WARN: Type inference failed for: r0v99, types: [int] */
    /* JADX WARN: Type inference failed for: r302v0 */
    private int A00() {
        ?? r302 = this.A0F;
        boolean z = r302;
        if (r302 == -1) {
            boolean A0E = A0E();
            boolean z2 = A0E;
            if (A0F()) {
                z2 = (A0E ? 1 : 0) + 1;
            }
            boolean z3 = z2;
            if (A0A()) {
                z3 = (z2 ? 1 : 0) + 1;
            }
            boolean z4 = z3;
            if (A0G()) {
                z4 = (z3 ? 1 : 0) + 1;
            }
            boolean z5 = z4;
            if (A04()) {
                z5 = (z4 ? 1 : 0) + 1;
            }
            boolean z6 = z5;
            if (A0B()) {
                z6 = (z5 ? 1 : 0) + 1;
            }
            boolean z7 = z6;
            if (A0J()) {
                z7 = (z6 ? 1 : 0) + 1;
            }
            boolean z8 = z7;
            if (A02()) {
                z8 = (z7 ? 1 : 0) + 1;
            }
            boolean z9 = z8;
            if (A0H()) {
                z9 = (z8 ? 1 : 0) + 1;
            }
            boolean z10 = z9;
            if (A08()) {
                z10 = (z9 ? 1 : 0) + 1;
            }
            boolean z11 = z10;
            if (A09()) {
                z11 = (z10 ? 1 : 0) + 1;
            }
            boolean z12 = z11;
            if (A03()) {
                z12 = (z11 ? 1 : 0) + 1;
            }
            boolean z13 = z12;
            if (A0C()) {
                z13 = (z12 ? 1 : 0) + 1;
            }
            boolean z14 = z13;
            if (A0D()) {
                z14 = (z13 ? 1 : 0) + 1;
            }
            boolean z15 = z14;
            if (A07()) {
                z15 = (z14 ? 1 : 0) + 1;
            }
            boolean z16 = z15;
            if (A0L()) {
                z16 = (z15 ? 1 : 0) + 1;
            }
            boolean z17 = z16;
            if (A0K()) {
                z17 = (z16 ? 1 : 0) + 1;
            }
            boolean z18 = z17;
            if (A0I()) {
                z18 = (z17 ? 1 : 0) + 1;
            }
            boolean z19 = z18;
            if (A06()) {
                z19 = (z18 ? 1 : 0) + 1;
            }
            boolean z20 = z19;
            if (A0M()) {
                z20 = (z19 ? 1 : 0) + 1;
            }
            boolean z21 = z20;
            if (A05()) {
                z21 = (z20 ? 1 : 0) + 1;
            }
            this.A0F = z21 ? 1 : 0;
            z = z21;
        }
        return z;
    }

    private void A01() {
        synchronized (this) {
            if (!this.A0f) {
                if (this.A0g == null) {
                    throw AnonymousClass001.A0Q("The context passed in the ThreadMenuItemInterface.newBuilder() is null.\nIf you have other questions, please post it to group Android Messenger Modularity.");
                }
                this.A0H = C1v5.A01;
                this.A0f = true;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0073 A[Catch: Exception -> 0x0095, all -> 0x00a3, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x0095, blocks: (B:5:0x003f, B:9:0x0049, B:12:0x0053, B:15:0x006c, B:17:0x008e, B:20:0x0073, B:21:0x0078, B:23:0x007e, B:26:0x0089, B:28:0x005e), top: B:4:0x003f, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A02() {
        /*
            Method dump skipped, instructions count: 227
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Cd5.A02():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0073 A[Catch: Exception -> 0x009d, all -> 0x00ab, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x009d, blocks: (B:5:0x003f, B:9:0x0049, B:12:0x0053, B:15:0x006c, B:17:0x0096, B:20:0x0073, B:21:0x0079, B:22:0x007e, B:24:0x0086, B:27:0x0091, B:29:0x005e), top: B:4:0x003f, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A03() {
        /*
            Method dump skipped, instructions count: 235
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Cd5.A03():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x009a A[Catch: Exception -> 0x00be, all -> 0x00ca, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x00be, blocks: (B:5:0x0042, B:9:0x004c, B:12:0x0056, B:15:0x0093, B:17:0x00b7, B:20:0x009a, B:21:0x00a0, B:23:0x00a6, B:26:0x00b2, B:27:0x005f, B:28:0x0064, B:31:0x0070, B:34:0x0078, B:36:0x0084), top: B:4:0x0042, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A04() {
        /*
            Method dump skipped, instructions count: 268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Cd5.A04():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00a0 A[Catch: Exception -> 0x00c4, all -> 0x00d0, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x00c4, blocks: (B:5:0x0048, B:9:0x0052, B:12:0x005c, B:15:0x0099, B:17:0x00bd, B:20:0x00a0, B:21:0x00a6, B:23:0x00ad, B:26:0x00b8, B:27:0x0065, B:28:0x006a, B:31:0x0076, B:34:0x007e, B:36:0x008a), top: B:4:0x0048, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A05() {
        /*
            Method dump skipped, instructions count: 274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Cd5.A05():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x009f A[Catch: Exception -> 0x00f5, all -> 0x0101, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x00f5, blocks: (B:5:0x0047, B:9:0x0051, B:12:0x005b, B:15:0x0098, B:17:0x00ee, B:20:0x009f, B:22:0x00aa, B:24:0x00b3, B:25:0x00ba, B:26:0x00c1, B:28:0x00c8, B:31:0x00d3, B:32:0x00d9, B:34:0x00e0, B:35:0x00e5, B:36:0x00e9, B:36:0x00e9, B:38:0x0064, B:39:0x0069, B:42:0x0075, B:45:0x007d, B:47:0x0089), top: B:4:0x0047, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A06() {
        /*
            Method dump skipped, instructions count: 323
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Cd5.A06():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00c8 A[Catch: Exception -> 0x00f6, all -> 0x0102, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x00f6, blocks: (B:5:0x0048, B:9:0x0052, B:12:0x005c, B:15:0x00c1, B:17:0x00ef, B:20:0x00c8, B:22:0x00d5, B:24:0x00db, B:25:0x00e0, B:28:0x00ea, B:29:0x0065, B:30:0x006a, B:33:0x0076, B:36:0x007e, B:37:0x0087, B:40:0x0090, B:42:0x009e, B:43:0x00a4, B:45:0x00aa, B:48:0x00b2), top: B:4:0x0048, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A07() {
        /*
            Method dump skipped, instructions count: 324
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Cd5.A07():boolean");
    }

    private boolean A08() {
        boolean A01;
        if (this.A0Q == null) {
            A01();
            AtomicInteger atomicInteger = C1Y6.A04;
            int andIncrement = atomicInteger.getAndIncrement();
            1YC r0 = this.A0m;
            r0.A0B("com.facebook.messaging.notify.plugins.mute.mutemenuitem.MuteMenuItemImplementation", "messaging.notify.mute.mutemenuitem.MuteMenuItemImplementation", "com.facebook.messaging.threadlist.plugins.interfaces.threadmenuitem.ThreadMenuItemInterfaceSpec", "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "com.facebook.messaging.notify.plugins.mute.NotifyMuteKillSwitch", andIncrement);
            Exception exc = null;
            try {
                try {
                    C1v5 c1v5 = this.A0H;
                    if (c1v5 != null) {
                        Boolean A00 = c1v5.A00("com.facebook.messaging.notify.plugins.mute.NotifyMuteKillSwitch");
                        if (A00 != null) {
                            A01 = A00.booleanValue();
                            Object obj = (A01 || !MuteMenuItemImplementation.A02(this.A0l, this.A0p)) ? C1Y6.A03 : C1Y6.A02;
                            this.A0Q = obj;
                            r0.A07("messaging.notify.mute.mutemenuitem.MuteMenuItemImplementation", "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", andIncrement, 1BL.A1U(obj));
                        }
                    }
                    A01 = 2nS.A01(r0, atomicInteger);
                    if (A01) {
                    }
                    this.A0Q = obj;
                    r0.A07("messaging.notify.mute.mutemenuitem.MuteMenuItemImplementation", "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", andIncrement, 1BL.A1U(obj));
                } catch (Exception e) {
                    this.A0Q = C1Y6.A03;
                    try {
                        throw e;
                    } catch (Throwable th) {
                        th = th;
                        exc = e;
                        r0.A03(exc, "messaging.notify.mute.mutemenuitem.MuteMenuItemImplementation", "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", andIncrement, 1BL.A1U(this.A0Q));
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                r0.A03(exc, "messaging.notify.mute.mutemenuitem.MuteMenuItemImplementation", "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", andIncrement, 1BL.A1U(this.A0Q));
                throw th;
            }
        }
        return 1BK.A1U(this.A0Q);
    }

    private boolean A09() {
        boolean A01;
        if (this.A0R == null) {
            A01();
            AtomicInteger atomicInteger = C1Y6.A04;
            int andIncrement = atomicInteger.getAndIncrement();
            1YC r0 = this.A0m;
            r0.A0B("com.facebook.messaging.notify.plugins.mute.unmutemenuitem.UnmuteMenuItemImplementation", "messaging.notify.mute.unmutemenuitem.UnmuteMenuItemImplementation", "com.facebook.messaging.threadlist.plugins.interfaces.threadmenuitem.ThreadMenuItemInterfaceSpec", "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "com.facebook.messaging.notify.plugins.mute.NotifyMuteKillSwitch", andIncrement);
            Exception exc = null;
            try {
                try {
                    C1v5 c1v5 = this.A0H;
                    if (c1v5 != null) {
                        Boolean A00 = c1v5.A00("com.facebook.messaging.notify.plugins.mute.NotifyMuteKillSwitch");
                        if (A00 != null) {
                            A01 = A00.booleanValue();
                            Object obj = (A01 || !UnmuteMenuItemImplementation.A02(this.A0l)) ? C1Y6.A03 : C1Y6.A02;
                            this.A0R = obj;
                            r0.A07("messaging.notify.mute.unmutemenuitem.UnmuteMenuItemImplementation", "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", andIncrement, 1BL.A1U(obj));
                        }
                    }
                    A01 = 2nS.A01(r0, atomicInteger);
                    if (A01) {
                    }
                    this.A0R = obj;
                    r0.A07("messaging.notify.mute.unmutemenuitem.UnmuteMenuItemImplementation", "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", andIncrement, 1BL.A1U(obj));
                } catch (Exception e) {
                    this.A0R = C1Y6.A03;
                    try {
                        throw e;
                    } catch (Throwable th) {
                        th = th;
                        exc = e;
                        r0.A03(exc, "messaging.notify.mute.unmutemenuitem.UnmuteMenuItemImplementation", "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", andIncrement, 1BL.A1U(this.A0R));
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                r0.A03(exc, "messaging.notify.mute.unmutemenuitem.UnmuteMenuItemImplementation", "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", andIncrement, 1BL.A1U(this.A0R));
                throw th;
            }
        }
        return 1BK.A1U(this.A0R);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x009a A[Catch: Exception -> 0x0107, all -> 0x0113, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x0107, blocks: (B:5:0x0042, B:9:0x004c, B:12:0x0056, B:15:0x0093, B:17:0x0100, B:20:0x009a, B:21:0x00a0, B:22:0x00a5, B:26:0x00b8, B:27:0x00bf, B:29:0x00c7, B:31:0x00cd, B:35:0x00dd, B:36:0x00e3, B:38:0x00e9, B:41:0x00ef, B:44:0x00fb, B:45:0x005f, B:46:0x0064, B:49:0x0070, B:52:0x0078, B:54:0x0084), top: B:4:0x0042, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A0A() {
        /*
            Method dump skipped, instructions count: 341
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Cd5.A0A():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x009a A[Catch: Exception -> 0x00c4, all -> 0x00d0, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x00c4, blocks: (B:5:0x0042, B:9:0x004c, B:12:0x0056, B:15:0x0093, B:17:0x00bd, B:20:0x009a, B:21:0x009f, B:22:0x00a5, B:24:0x00ac, B:27:0x00b8, B:28:0x005f, B:29:0x0064, B:32:0x0070, B:35:0x0078, B:37:0x0084), top: B:4:0x0042, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A0B() {
        /*
            Method dump skipped, instructions count: 274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Cd5.A0B():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x009a A[Catch: Exception -> 0x00c4, all -> 0x00d0, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x00c4, blocks: (B:5:0x0042, B:9:0x004c, B:12:0x0056, B:15:0x0093, B:17:0x00bd, B:20:0x009a, B:21:0x009f, B:22:0x00a5, B:24:0x00ad, B:27:0x00b8, B:28:0x005f, B:29:0x0064, B:32:0x0070, B:35:0x0078, B:37:0x0084), top: B:4:0x0042, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A0C() {
        /*
            Method dump skipped, instructions count: 274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Cd5.A0C():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x009a A[Catch: Exception -> 0x00c4, all -> 0x00d0, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x00c4, blocks: (B:5:0x0042, B:9:0x004c, B:12:0x0056, B:15:0x0093, B:17:0x00bd, B:20:0x009a, B:21:0x009f, B:22:0x00a5, B:24:0x00ad, B:27:0x00b8, B:28:0x005f, B:29:0x0064, B:32:0x0070, B:35:0x0078, B:37:0x0084), top: B:4:0x0042, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A0D() {
        /*
            Method dump skipped, instructions count: 274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Cd5.A0D():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x009a A[Catch: Exception -> 0x00e4, all -> 0x00f0, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x00e4, blocks: (B:5:0x0042, B:9:0x004c, B:12:0x0056, B:15:0x0093, B:17:0x00dd, B:20:0x009a, B:22:0x00a7, B:24:0x00ad, B:27:0x00b7, B:30:0x00c3, B:31:0x00c9, B:33:0x00ce, B:34:0x00d4, B:35:0x00d8, B:35:0x00d8, B:37:0x005f, B:38:0x0064, B:41:0x0070, B:44:0x0078, B:46:0x0084), top: B:4:0x0042, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A0E() {
        /*
            Method dump skipped, instructions count: 306
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Cd5.A0E():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0090 A[Catch: Exception -> 0x00c8, all -> 0x00d4, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x00c8, blocks: (B:5:0x0042, B:9:0x004c, B:12:0x0056, B:15:0x0090, B:16:0x0095, B:19:0x00a0, B:20:0x00a6, B:22:0x00ab, B:23:0x00b1, B:24:0x00b5, B:24:0x00b5, B:27:0x00c1, B:30:0x00bc, B:31:0x005f, B:32:0x0064, B:35:0x0070, B:38:0x0078, B:40:0x0084), top: B:4:0x0042, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A0F() {
        /*
            Method dump skipped, instructions count: 278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Cd5.A0F():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x009a A[Catch: Exception -> 0x00be, all -> 0x00ca, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x00be, blocks: (B:5:0x0042, B:9:0x004c, B:12:0x0056, B:15:0x0093, B:17:0x00b7, B:20:0x009a, B:21:0x00a0, B:23:0x00a7, B:26:0x00b2, B:27:0x005f, B:28:0x0064, B:31:0x0070, B:34:0x0078, B:36:0x0084), top: B:4:0x0042, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A0G() {
        /*
            Method dump skipped, instructions count: 268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Cd5.A0G():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x009a A[Catch: Exception -> 0x00c4, all -> 0x00d0, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x00c4, blocks: (B:5:0x0042, B:9:0x004c, B:12:0x0056, B:15:0x0093, B:17:0x00bd, B:20:0x009a, B:21:0x009f, B:22:0x00a5, B:24:0x00ad, B:27:0x00b8, B:28:0x005f, B:29:0x0064, B:32:0x0070, B:35:0x0078, B:37:0x0084), top: B:4:0x0042, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A0H() {
        /*
            Method dump skipped, instructions count: 274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Cd5.A0H():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0076 A[Catch: Exception -> 0x00c4, all -> 0x00d2, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x00c4, blocks: (B:5:0x0042, B:9:0x004c, B:12:0x0056, B:15:0x006f, B:17:0x00bd, B:20:0x0076, B:21:0x007c, B:22:0x0082, B:23:0x0087, B:27:0x0098, B:28:0x009e, B:30:0x00a4, B:33:0x00ad, B:36:0x00b8, B:38:0x0061), top: B:4:0x0042, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A0I() {
        /*
            Method dump skipped, instructions count: 274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Cd5.A0I():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x009a A[Catch: Exception -> 0x00be, all -> 0x00ca, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x00be, blocks: (B:5:0x0042, B:9:0x004c, B:12:0x0056, B:15:0x0093, B:17:0x00b7, B:20:0x009a, B:21:0x00a0, B:23:0x00a6, B:26:0x00b2, B:27:0x005f, B:28:0x0064, B:31:0x0070, B:34:0x0078, B:36:0x0084), top: B:4:0x0042, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A0J() {
        /*
            Method dump skipped, instructions count: 268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Cd5.A0J():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x009a A[Catch: Exception -> 0x00be, all -> 0x00ca, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x00be, blocks: (B:5:0x0042, B:9:0x004c, B:12:0x0056, B:15:0x0093, B:17:0x00b7, B:20:0x009a, B:21:0x00a0, B:23:0x00a6, B:26:0x00b2, B:27:0x005f, B:28:0x0064, B:31:0x0070, B:34:0x0078, B:36:0x0084), top: B:4:0x0042, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A0K() {
        /*
            Method dump skipped, instructions count: 268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Cd5.A0K():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0076 A[Catch: Exception -> 0x00a8, all -> 0x00b6, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x00a8, blocks: (B:5:0x0042, B:9:0x004c, B:12:0x0056, B:15:0x006f, B:17:0x00a1, B:20:0x0076, B:21:0x007c, B:22:0x0082, B:23:0x0087, B:25:0x0090, B:28:0x009c, B:30:0x0061), top: B:4:0x0042, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A0L() {
        /*
            Method dump skipped, instructions count: 246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Cd5.A0L():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x009a A[Catch: Exception -> 0x00be, all -> 0x00ca, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x00be, blocks: (B:5:0x0042, B:9:0x004c, B:12:0x0056, B:15:0x0093, B:17:0x00b7, B:20:0x009a, B:21:0x00a0, B:23:0x00a7, B:26:0x00b2, B:27:0x005f, B:28:0x0064, B:31:0x0070, B:34:0x0078, B:36:0x0084), top: B:4:0x0042, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A0M() {
        /*
            Method dump skipped, instructions count: 268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Cd5.A0M():boolean");
    }

    @Override // X.C4YN
    public void ANc() {
        AtomicInteger atomicInteger = C1Y6.A04;
        int andIncrement = atomicInteger.getAndIncrement();
        1YC r0 = this.A0m;
        r0.A08("com.facebook.messaging.threadlist.plugins.interfaces.threadmenuitem.ThreadMenuItemInterfaceSpec", "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "dismissDialogs", andIncrement);
        try {
            A01();
            if (A08()) {
                int andIncrement2 = atomicInteger.getAndIncrement();
                try {
                    r0.A0A("com.facebook.messaging.notify.plugins.mute.mutemenuitem.MuteMenuItemImplementation", "messaging.notify.mute.mutemenuitem.MuteMenuItemImplementation", "com.facebook.messaging.threadlist.plugins.interfaces.threadmenuitem.ThreadMenuItemInterfaceSpec", andIncrement2, "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "com.facebook.messaging.notify.plugins.mute.NotifyMuteKillSwitch", "dismissDialogs");
                    try {
                        Context context = this.A0g;
                        11T.A0F(context, 0);
                        MuteNotificationsDialogFragment muteNotificationsDialogFragment = ((CHQ) 1Bn.A0E(context, (1BY) null, 82629)).A00;
                        if (muteNotificationsDialogFragment != null) {
                            muteNotificationsDialogFragment.A0o();
                        }
                        r0.A09("messaging.notify.mute.mutemenuitem.MuteMenuItemImplementation", "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "dismissDialogs", andIncrement2);
                    } catch (Exception e) {
                        throw e;
                    }
                } catch (Throwable th) {
                    r0.A04((Exception) null, "messaging.notify.mute.mutemenuitem.MuteMenuItemImplementation", "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "dismissDialogs", andIncrement2);
                    throw th;
                }
            }
            r0.A02((Exception) null, "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "dismissDialogs", andIncrement);
        } catch (Throwable th2) {
            r0.A02((Exception) null, "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "dismissDialogs", andIncrement);
            throw th2;
        }
    }

    @Override // X.C4YN
    public ArrayList Awf() {
        String str;
        int i;
        AtomicInteger atomicInteger = C1Y6.A04;
        int andIncrement = atomicInteger.getAndIncrement();
        1YC r0 = this.A0m;
        r0.A08("com.facebook.messaging.threadlist.plugins.interfaces.threadmenuitem.ThreadMenuItemInterfaceSpec", "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "getMenuItem", andIncrement);
        try {
            A01();
            ArrayList A0t = AnonymousClass001.A0t(A00());
            try {
                if (A0E()) {
                    i = atomicInteger.getAndIncrement();
                    str = "messaging.threadlist.threaditemmenu.core.pinmenuitem.PinMenuItemImplementation";
                    r0.A0A("com.facebook.messaging.threadlist.threaditemmenu.plugins.core.pinmenuitem.PinMenuItemImplementation", str, "com.facebook.messaging.threadlist.plugins.interfaces.threadmenuitem.ThreadMenuItemInterfaceSpec", i, "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "com.facebook.messaging.threadlist.threaditemmenu.plugins.core.ThreadlistThreaditemmenuCoreKillSwitch", "getMenuItem");
                    try {
                        PinMenuItemImplementation pinMenuItemImplementation = this.A0I;
                        CQE cqe = new CQE();
                        cqe.A00 = 40;
                        cqe.A06(C1u3.A5E);
                        Context context = pinMenuItemImplementation.A00;
                        CQE.A04(context, cqe, 2131966887);
                        CQE.A03(context, cqe, 2131966888);
                        A0t.add(CQE.A01(cqe, "msgr pin"));
                        r0.A09(str, "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "getMenuItem", i);
                    } catch (Exception e) {
                        throw e;
                    }
                }
                if (A0F()) {
                    int andIncrement2 = atomicInteger.getAndIncrement();
                    r0.A0A("com.facebook.messaging.threadlist.threaditemmenu.plugins.core.unpinmenuitem.UnpinMenuItemImplementation", "messaging.threadlist.threaditemmenu.core.unpinmenuitem.UnpinMenuItemImplementation", "com.facebook.messaging.threadlist.plugins.interfaces.threadmenuitem.ThreadMenuItemInterfaceSpec", andIncrement2, "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "com.facebook.messaging.threadlist.threaditemmenu.plugins.core.ThreadlistThreaditemmenuCoreKillSwitch", "getMenuItem");
                    UnpinMenuItemImplementation unpinMenuItemImplementation = this.A0J;
                    CQE cqe2 = new CQE();
                    cqe2.A00 = 41;
                    cqe2.A06(C1u3.A5F);
                    Context context2 = unpinMenuItemImplementation.A00;
                    CQE.A04(context2, cqe2, 2131966889);
                    CQE.A03(context2, cqe2, 2131966890);
                    A0t.add(CQE.A01(cqe2, "msgr unpin"));
                    r0.A09("messaging.threadlist.threaditemmenu.core.unpinmenuitem.UnpinMenuItemImplementation", "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "getMenuItem", andIncrement2);
                }
                if (A0A()) {
                    int andIncrement3 = atomicInteger.getAndIncrement();
                    r0.A0A("com.facebook.messaging.threadlist.threaditemmenu.plugins.core.archivemenuitem.ArchiveMenuItemImplementation", "messaging.threadlist.threaditemmenu.core.archivemenuitem.ArchiveMenuItemImplementation", "com.facebook.messaging.threadlist.plugins.interfaces.threadmenuitem.ThreadMenuItemInterfaceSpec", andIncrement3, "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "com.facebook.messaging.threadlist.threaditemmenu.plugins.core.ThreadlistThreaditemmenuCoreKillSwitch", "getMenuItem");
                    A0t.add(ArchiveMenuItemImplementation.A00(this.A0g));
                    r0.A09("messaging.threadlist.threaditemmenu.core.archivemenuitem.ArchiveMenuItemImplementation", "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "getMenuItem", andIncrement3);
                }
                if (A0G()) {
                    int andIncrement4 = atomicInteger.getAndIncrement();
                    r0.A0A("com.facebook.messaging.threadlist.threaditemmenu.plugins.folders.unarchivemenuitem.unarchivemenuitemimplementation.UnarchiveMenuItemImplementation", "messaging.threadlist.threaditemmenu.folders.unarchivemenuitem.unarchivemenuitemimplementation.UnarchiveMenuItemImplementation", "com.facebook.messaging.threadlist.plugins.interfaces.threadmenuitem.ThreadMenuItemInterfaceSpec", andIncrement4, "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "com.facebook.messaging.threadlist.threaditemmenu.plugins.folders.unarchivemenuitem.ThreadlistThreaditemmenuFoldersUnarchivemenuitemKillSwitch", "getMenuItem");
                    Context context3 = this.A0g;
                    CQE A00 = CQE.A00(context3);
                    A00.A00 = 35;
                    A00.A06(C1u3.A0z);
                    CQE.A04(context3, A00, 2131966920);
                    CQE.A03(context3, A00, 2131966921);
                    A0t.add(CQE.A01(A00, "unarchive"));
                    r0.A09("messaging.threadlist.threaditemmenu.folders.unarchivemenuitem.unarchivemenuitemimplementation.UnarchiveMenuItemImplementation", "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "getMenuItem", andIncrement4);
                }
                if (A04()) {
                    int andIncrement5 = atomicInteger.getAndIncrement();
                    r0.A0A("com.facebook.messaging.integrity.frx.plugins.platformreport.platformreportmenuitem.PlatformReportMenuItemImplementation", "messaging.integrity.frx.platformreport.platformreportmenuitem.PlatformReportMenuItemImplementation", "com.facebook.messaging.threadlist.plugins.interfaces.threadmenuitem.ThreadMenuItemInterfaceSpec", andIncrement5, "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "com.facebook.messaging.integrity.frx.plugins.platformreport.IntegrityFrxPlatformreportKillSwitch", "getMenuItem");
                    Context context4 = this.A0g;
                    CQE cqe3 = new CQE();
                    cqe3.A00 = 15;
                    cqe3.A06(C1u3.A1N);
                    CQE.A04(context4, cqe3, 2131966916);
                    CQE.A03(context4, cqe3, 2131966915);
                    A0t.add(CQE.A01(cqe3, "platform report"));
                    r0.A09("messaging.integrity.frx.platformreport.platformreportmenuitem.PlatformReportMenuItemImplementation", "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "getMenuItem", andIncrement5);
                }
                if (A0B()) {
                    int andIncrement6 = atomicInteger.getAndIncrement();
                    r0.A0A("com.facebook.messaging.threadlist.threaditemmenu.plugins.core.deletemenuitem.DeleteMenuItemImplementation", "messaging.threadlist.threaditemmenu.core.deletemenuitem.DeleteMenuItemImplementation", "com.facebook.messaging.threadlist.plugins.interfaces.threadmenuitem.ThreadMenuItemInterfaceSpec", andIncrement6, "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "com.facebook.messaging.threadlist.threaditemmenu.plugins.core.ThreadlistThreaditemmenuCoreKillSwitch", "getMenuItem");
                    A0t.add(DeleteMenuItemImplementation.A00(this.A0g));
                    r0.A09("messaging.threadlist.threaditemmenu.core.deletemenuitem.DeleteMenuItemImplementation", "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "getMenuItem", andIncrement6);
                }
                if (A0J()) {
                    int andIncrement7 = atomicInteger.getAndIncrement();
                    r0.A0A("com.facebook.messaging.wellbeing.selfremediation.ignore.plugins.core.ignoregroupmenuitem.IgnoreGroupMenuItemImplementation", "messaging.wellbeing.selfremediation.ignore.core.ignoregroupmenuitem.IgnoreGroupMenuItemImplementation", "com.facebook.messaging.threadlist.plugins.interfaces.threadmenuitem.ThreadMenuItemInterfaceSpec", andIncrement7, "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "com.facebook.messaging.wellbeing.selfremediation.ignore.plugins.core.WellbeingSelfremediationIgnoreCoreKillSwitch", "getMenuItem");
                    A0t.add(IgnoreGroupMenuItemImplementation.A00(this.A0g));
                    r0.A09("messaging.wellbeing.selfremediation.ignore.core.ignoregroupmenuitem.IgnoreGroupMenuItemImplementation", "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "getMenuItem", andIncrement7);
                }
                if (A02()) {
                    int andIncrement8 = atomicInteger.getAndIncrement();
                    r0.A0A("com.facebook.messaging.groups.plugins.core.addmembersmenuitem.AddMembersMenuItemImplementation", "messaging.groups.core.addmembersmenuitem.AddMembersMenuItemImplementation", "com.facebook.messaging.threadlist.plugins.interfaces.threadmenuitem.ThreadMenuItemInterfaceSpec", andIncrement8, "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "com.facebook.messaging.groups.plugins.core.GroupsCoreKillSwitch", "getMenuItem");
                    Context context5 = this.A0g;
                    BTs bTs = this.A02;
                    if (bTs == null) {
                        bTs = (BTs) 1Bn.A0E(context5, (1BY) null, 82632);
                        this.A02 = bTs;
                    }
                    11T.A0H(context5, bTs);
                    CQE cqe4 = new CQE();
                    cqe4.A00 = 36;
                    cqe4.A06(C1u3.A3J);
                    CQE.A02(context5, cqe4, 2131952342);
                    A0t.add(CQE.A01(cqe4, "add_members"));
                    r0.A09("messaging.groups.core.addmembersmenuitem.AddMembersMenuItemImplementation", "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "getMenuItem", andIncrement8);
                }
                if (A0H()) {
                    int andIncrement9 = atomicInteger.getAndIncrement();
                    r0.A0A("com.facebook.messaging.threadlist.threaditemmenu.plugins.messenger.leavemenuitem.LeaveMenuItemImplementation", "messaging.threadlist.threaditemmenu.messenger.leavemenuitem.LeaveMenuItemImplementation", "com.facebook.messaging.threadlist.plugins.interfaces.threadmenuitem.ThreadMenuItemInterfaceSpec", andIncrement9, "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "com.facebook.messaging.threadlist.threaditemmenu.plugins.messenger.ThreadlistThreaditemmenuMessengerKillSwitch", "getMenuItem");
                    A0t.add(LeaveMenuItemImplementation.A00(this.A0g, this.A0l));
                    r0.A09("messaging.threadlist.threaditemmenu.messenger.leavemenuitem.LeaveMenuItemImplementation", "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "getMenuItem", andIncrement9);
                }
                if (A08()) {
                    int andIncrement10 = atomicInteger.getAndIncrement();
                    r0.A0A("com.facebook.messaging.notify.plugins.mute.mutemenuitem.MuteMenuItemImplementation", "messaging.notify.mute.mutemenuitem.MuteMenuItemImplementation", "com.facebook.messaging.threadlist.plugins.interfaces.threadmenuitem.ThreadMenuItemInterfaceSpec", andIncrement10, "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "com.facebook.messaging.notify.plugins.mute.NotifyMuteKillSwitch", "getMenuItem");
                    A0t.add(MuteMenuItemImplementation.A00(this.A0g));
                    r0.A09("messaging.notify.mute.mutemenuitem.MuteMenuItemImplementation", "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "getMenuItem", andIncrement10);
                }
                if (A09()) {
                    int andIncrement11 = atomicInteger.getAndIncrement();
                    r0.A0A("com.facebook.messaging.notify.plugins.mute.unmutemenuitem.UnmuteMenuItemImplementation", "messaging.notify.mute.unmutemenuitem.UnmuteMenuItemImplementation", "com.facebook.messaging.threadlist.plugins.interfaces.threadmenuitem.ThreadMenuItemInterfaceSpec", andIncrement11, "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "com.facebook.messaging.notify.plugins.mute.NotifyMuteKillSwitch", "getMenuItem");
                    A0t.add(UnmuteMenuItemImplementation.A00(this.A0g));
                    r0.A09("messaging.notify.mute.unmutemenuitem.UnmuteMenuItemImplementation", "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "getMenuItem", andIncrement11);
                }
                if (A03()) {
                    int andIncrement12 = atomicInteger.getAndIncrement();
                    r0.A0A("com.facebook.messaging.groups.plugins.core.creategroupwithmenuitem.CreateGroupWithMenuItemImplementation", "messaging.groups.core.creategroupwithmenuitem.CreateGroupWithMenuItemImplementation", "com.facebook.messaging.threadlist.plugins.interfaces.threadmenuitem.ThreadMenuItemInterfaceSpec", andIncrement12, "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "com.facebook.messaging.groups.plugins.core.GroupsCoreKillSwitch", "getMenuItem");
                    Context context6 = this.A0g;
                    User user = this.A0o;
                    ThreadSummary threadSummary = this.A0l;
                    FbUserSession fbUserSession = this.A0i;
                    CG9 cg9 = this.A09;
                    if (cg9 == null) {
                        cg9 = (CG9) 1Bn.A0E(context6, (1BY) null, 68698);
                        this.A09 = cg9;
                    }
                    A0t.add(CreateGroupWithMenuItemImplementation.A00(context6, fbUserSession, threadSummary, cg9, user));
                    r0.A09("messaging.groups.core.creategroupwithmenuitem.CreateGroupWithMenuItemImplementation", "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "getMenuItem", andIncrement12);
                }
                if (A0C()) {
                    int andIncrement13 = atomicInteger.getAndIncrement();
                    r0.A0A("com.facebook.messaging.threadlist.threaditemmenu.plugins.core.markreadmenuitem.MarkReadMenuItemImplementation", "messaging.threadlist.threaditemmenu.core.markreadmenuitem.MarkReadMenuItemImplementation", "com.facebook.messaging.threadlist.plugins.interfaces.threadmenuitem.ThreadMenuItemInterfaceSpec", andIncrement13, "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "com.facebook.messaging.threadlist.threaditemmenu.plugins.core.ThreadlistThreaditemmenuCoreKillSwitch", "getMenuItem");
                    Context context7 = this.A0g;
                    CQE A002 = CQE.A00(context7);
                    A002.A00 = 8;
                    A002.A06(C1u3.A2X);
                    CQE.A04(context7, A002, 2131966910);
                    CQE.A03(context7, A002, 2131966912);
                    A0t.add(CQE.A01(A002, "mark read"));
                    r0.A09("messaging.threadlist.threaditemmenu.core.markreadmenuitem.MarkReadMenuItemImplementation", "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "getMenuItem", andIncrement13);
                }
                if (A0D()) {
                    int andIncrement14 = atomicInteger.getAndIncrement();
                    r0.A0A("com.facebook.messaging.threadlist.threaditemmenu.plugins.core.markunreadmenuitem.MarkUnreadMenuItemImplementation", "messaging.threadlist.threaditemmenu.core.markunreadmenuitem.MarkUnreadMenuItemImplementation", "com.facebook.messaging.threadlist.plugins.interfaces.threadmenuitem.ThreadMenuItemInterfaceSpec", andIncrement14, "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "com.facebook.messaging.threadlist.threaditemmenu.plugins.core.ThreadlistThreaditemmenuCoreKillSwitch", "getMenuItem");
                    Context context8 = this.A0g;
                    CQE A003 = CQE.A00(context8);
                    A003.A00 = 9;
                    A003.A06(C1u3.A2W);
                    CQE.A04(context8, A003, 2131966913);
                    CQE.A03(context8, A003, 2131966914);
                    A0t.add(CQE.A01(A003, "mark unread"));
                    r0.A09("messaging.threadlist.threaditemmenu.core.markunreadmenuitem.MarkUnreadMenuItemImplementation", "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "getMenuItem", andIncrement14);
                }
                if (A07()) {
                    int andIncrement15 = atomicInteger.getAndIncrement();
                    r0.A0A("com.facebook.messaging.nativepagereply.spam.plugins.spamfolder.menuitem.SpamMoveThreadMenuItem", "messaging.nativepagereply.spam.spamfolder.menuitem.SpamMoveThreadMenuItem", "com.facebook.messaging.threadlist.plugins.interfaces.threadmenuitem.ThreadMenuItemInterfaceSpec", andIncrement15, "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", AbstractC00603o4.A00(8), "getMenuItem");
                    A0t.add(SpamMoveThreadMenuItem.A00(this.A0g));
                    r0.A09("messaging.nativepagereply.spam.spamfolder.menuitem.SpamMoveThreadMenuItem", "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "getMenuItem", andIncrement15);
                }
                if (A0L()) {
                    int andIncrement16 = atomicInteger.getAndIncrement();
                    r0.A0A("com.facebook.messaging.wellbeing.selfremediation.restrict.plugins.threadmenuitem.RestrictThreadMenuItem", "messaging.wellbeing.selfremediation.restrict.threadmenuitem.RestrictThreadMenuItem", "com.facebook.messaging.threadlist.plugins.interfaces.threadmenuitem.ThreadMenuItemInterfaceSpec", andIncrement16, "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "com.facebook.messaging.wellbeing.selfremediation.restrict.plugins.WellbeingSelfremediationRestrictKillSwitch", "getMenuItem");
                    A0t.add(RestrictThreadMenuItem.A00(this.A0g, this.A0o));
                    r0.A09("messaging.wellbeing.selfremediation.restrict.threadmenuitem.RestrictThreadMenuItem", "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "getMenuItem", andIncrement16);
                }
                if (A0K()) {
                    int andIncrement17 = atomicInteger.getAndIncrement();
                    r0.A0A("com.facebook.messaging.wellbeing.selfremediation.ignore.plugins.core.ignoremenuitem.IgnoreMessagesMenuItemImplementation", "messaging.wellbeing.selfremediation.ignore.core.ignoremenuitem.IgnoreMessagesMenuItemImplementation", "com.facebook.messaging.threadlist.plugins.interfaces.threadmenuitem.ThreadMenuItemInterfaceSpec", andIncrement17, "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "com.facebook.messaging.wellbeing.selfremediation.ignore.plugins.core.WellbeingSelfremediationIgnoreCoreKillSwitch", "getMenuItem");
                    ThreadSummary threadSummary2 = this.A0l;
                    A0t.add(IgnoreMessagesMenuItemImplementation.A00(this.A0g, this.A0i, threadSummary2));
                    r0.A09("messaging.wellbeing.selfremediation.ignore.core.ignoremenuitem.IgnoreMessagesMenuItemImplementation", "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "getMenuItem", andIncrement17);
                }
                if (A0I()) {
                    int andIncrement18 = atomicInteger.getAndIncrement();
                    r0.A0A("com.facebook.messaging.wellbeing.selfremediation.block.plugins.core.blockmessagesmenuitem.BlockMessagesMenuItemImplementation", "messaging.wellbeing.selfremediation.block.core.blockmessagesmenuitem.BlockMessagesMenuItemImplementation", "com.facebook.messaging.threadlist.plugins.interfaces.threadmenuitem.ThreadMenuItemInterfaceSpec", andIncrement18, "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "com.facebook.messaging.wellbeing.selfremediation.block.plugins.core.WellbeingSelfremediationBlockCoreKillSwitch", "getMenuItem");
                    ThreadSummary threadSummary3 = this.A0l;
                    User user2 = this.A0o;
                    A0t.add(BlockMessagesMenuItemImplementation.A00(this.A0g, this.A0i, threadSummary3, user2));
                    r0.A09("messaging.wellbeing.selfremediation.block.core.blockmessagesmenuitem.BlockMessagesMenuItemImplementation", "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "getMenuItem", andIncrement18);
                }
                if (A06()) {
                    int andIncrement19 = atomicInteger.getAndIncrement();
                    r0.A0A("com.facebook.messaging.msys.thread.plugins.platypustoggle.platypustoggleinboxmenuitem.PlatypusToggleInboxMenuItem", "messaging.msys.thread.platypustoggle.platypustoggleinboxmenuitem.PlatypusToggleInboxMenuItem", "com.facebook.messaging.threadlist.plugins.interfaces.threadmenuitem.ThreadMenuItemInterfaceSpec", andIncrement19, "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", 4YT.A00(4), "getMenuItem");
                    A0t.add(this.A0G.A00());
                    r0.A09("messaging.msys.thread.platypustoggle.platypustoggleinboxmenuitem.PlatypusToggleInboxMenuItem", "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "getMenuItem", andIncrement19);
                }
                if (A0M()) {
                    int andIncrement20 = atomicInteger.getAndIncrement();
                    r0.A0A("com.facebook.messaging.wellbeing.unknowncontact.messagerequests.plugins.inboxfolder.hidemenuitem.HideMessageRequestFolderMenuItem", "messaging.wellbeing.unknowncontact.messagerequests.inboxfolder.hidemenuitem.HideMessageRequestFolderMenuItem", "com.facebook.messaging.threadlist.plugins.interfaces.threadmenuitem.ThreadMenuItemInterfaceSpec", andIncrement20, "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "com.facebook.messaging.wellbeing.unknowncontact.messagerequests.plugins.inboxfolder.WellbeingUnknowncontactMessagerequestsInboxfolderKillSwitch", "getMenuItem");
                    Context context9 = this.A0g;
                    CQE A004 = CQE.A00(context9);
                    A004.A00 = 63;
                    A004.A06(C1u3.A2d);
                    CQE.A04(context9, A004, 2131966883);
                    CQE.A03(context9, A004, 2131966884);
                    A0t.add(CQE.A01(A004, "hide_message_request"));
                    r0.A09("messaging.wellbeing.unknowncontact.messagerequests.inboxfolder.hidemenuitem.HideMessageRequestFolderMenuItem", "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "getMenuItem", andIncrement20);
                }
                if (A05()) {
                    i = atomicInteger.getAndIncrement();
                    str = "messaging.marketplace.folder.hidemenuitem.HideMarketplaceFolderMenuItem";
                    r0.A0A("com.facebook.messaging.marketplace.plugins.folder.hidemenuitem.HideMarketplaceFolderMenuItem", str, "com.facebook.messaging.threadlist.plugins.interfaces.threadmenuitem.ThreadMenuItemInterfaceSpec", i, "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", 1BJ.A00(12), "getMenuItem");
                    Context context10 = this.A0g;
                    CQE A005 = CQE.A00(context10);
                    A005.A00 = 79;
                    A005.A06(C1u3.A2d);
                    CQE.A04(context10, A005, 2131966886);
                    CQE.A03(context10, A005, 2131966885);
                    A0t.add(CQE.A01(A005, "hide_marketplace_folder"));
                    r0.A09(str, "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "getMenuItem", i);
                }
                while (A0t.size() < A00()) {
                    A0t.add(null);
                }
                r0.A02((Exception) null, "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "getMenuItem", andIncrement);
                return A0t;
            } catch (Throwable th) {
                r0.A04((Exception) null, str, "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "getMenuItem", i);
                throw th;
            }
        } catch (Throwable th2) {
            r0.A02((Exception) null, "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "getMenuItem", andIncrement);
            throw th2;
        }
    }

    /* JADX WARN: Failed to calculate best type for var: r314v0 ??
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
    /* JADX WARN: Failed to calculate best type for var: r314v0 ??
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
    /* JADX WARN: Not initialized variable reg: 314, insn: 0x09cd: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r314 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:420:0x09c5 */
    @Override // X.C4YN
    public void C6a(int i) {
        String str;
        int andIncrement;
        String str2;
        AtomicInteger atomicInteger = C1Y6.A04;
        int andIncrement2 = atomicInteger.getAndIncrement();
        1YC r0 = this.A0m;
        r0.A08("com.facebook.messaging.threadlist.plugins.interfaces.threadmenuitem.ThreadMenuItemInterfaceSpec", "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "onMenuItemSelected", andIncrement2);
        try {
            A01();
            try {
                try {
                    if (i == 40) {
                        if (A0E()) {
                            andIncrement = atomicInteger.getAndIncrement();
                            str2 = "messaging.threadlist.threaditemmenu.core.pinmenuitem.PinMenuItemImplementation";
                            r0.A0A("com.facebook.messaging.threadlist.threaditemmenu.plugins.core.pinmenuitem.PinMenuItemImplementation", str2, "com.facebook.messaging.threadlist.plugins.interfaces.threadmenuitem.ThreadMenuItemInterfaceSpec", andIncrement, "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "com.facebook.messaging.threadlist.threaditemmenu.plugins.core.ThreadlistThreaditemmenuCoreKillSwitch", "onMenuItemSelected");
                            this.A0I.A00(this.A0i, this.A0k, this.A0l);
                            r0.A09(str2, "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "onMenuItemSelected", andIncrement);
                        }
                        r0.A02((Exception) null, "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "onMenuItemSelected", andIncrement2);
                    }
                    if (i == 41) {
                        if (A0F()) {
                            andIncrement = atomicInteger.getAndIncrement();
                            str2 = "messaging.threadlist.threaditemmenu.core.unpinmenuitem.UnpinMenuItemImplementation";
                            r0.A0A("com.facebook.messaging.threadlist.threaditemmenu.plugins.core.unpinmenuitem.UnpinMenuItemImplementation", str2, "com.facebook.messaging.threadlist.plugins.interfaces.threadmenuitem.ThreadMenuItemInterfaceSpec", andIncrement, "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "com.facebook.messaging.threadlist.threaditemmenu.plugins.core.ThreadlistThreaditemmenuCoreKillSwitch", "onMenuItemSelected");
                            this.A0J.A00(this.A0i, this.A0k, this.A0l);
                            r0.A09(str2, "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "onMenuItemSelected", andIncrement);
                        }
                        r0.A02((Exception) null, "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "onMenuItemSelected", andIncrement2);
                    }
                    if (i == 1) {
                        if (A0A()) {
                            andIncrement = atomicInteger.getAndIncrement();
                            str2 = "messaging.threadlist.threaditemmenu.core.archivemenuitem.ArchiveMenuItemImplementation";
                            r0.A0A("com.facebook.messaging.threadlist.threaditemmenu.plugins.core.archivemenuitem.ArchiveMenuItemImplementation", str2, "com.facebook.messaging.threadlist.plugins.interfaces.threadmenuitem.ThreadMenuItemInterfaceSpec", andIncrement, "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "com.facebook.messaging.threadlist.threaditemmenu.plugins.core.ThreadlistThreaditemmenuCoreKillSwitch", "onMenuItemSelected");
                            ThreadSummary threadSummary = this.A0l;
                            ArchiveMenuItemImplementation.A01(this.A0g, this.A0h, this.A0i, threadSummary);
                            r0.A09(str2, "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "onMenuItemSelected", andIncrement);
                        }
                        r0.A02((Exception) null, "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "onMenuItemSelected", andIncrement2);
                    }
                    if (i == 35) {
                        if (A0G()) {
                            andIncrement = atomicInteger.getAndIncrement();
                            str2 = "messaging.threadlist.threaditemmenu.folders.unarchivemenuitem.unarchivemenuitemimplementation.UnarchiveMenuItemImplementation";
                            r0.A0A("com.facebook.messaging.threadlist.threaditemmenu.plugins.folders.unarchivemenuitem.unarchivemenuitemimplementation.UnarchiveMenuItemImplementation", str2, "com.facebook.messaging.threadlist.plugins.interfaces.threadmenuitem.ThreadMenuItemInterfaceSpec", andIncrement, "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "com.facebook.messaging.threadlist.threaditemmenu.plugins.folders.unarchivemenuitem.ThreadlistThreaditemmenuFoldersUnarchivemenuitemKillSwitch", "onMenuItemSelected");
                            ThreadSummary threadSummary2 = this.A0l;
                            UnarchiveMenuItemImplementation.A00(this.A0g, this.A0h, this.A0i, threadSummary2);
                            r0.A09(str2, "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "onMenuItemSelected", andIncrement);
                        }
                        r0.A02((Exception) null, "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "onMenuItemSelected", andIncrement2);
                    }
                    if (i == 15) {
                        if (A04()) {
                            andIncrement = atomicInteger.getAndIncrement();
                            str2 = "messaging.integrity.frx.platformreport.platformreportmenuitem.PlatformReportMenuItemImplementation";
                            r0.A0A("com.facebook.messaging.integrity.frx.plugins.platformreport.platformreportmenuitem.PlatformReportMenuItemImplementation", str2, "com.facebook.messaging.threadlist.plugins.interfaces.threadmenuitem.ThreadMenuItemInterfaceSpec", andIncrement, "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "com.facebook.messaging.integrity.frx.plugins.platformreport.IntegrityFrxPlatformreportKillSwitch", "onMenuItemSelected");
                            ThreadSummary threadSummary3 = this.A0l;
                            User user = this.A0o;
                            PlatformReportMenuItemImplementation.A00(this.A0g, this.A0h, threadSummary3, user);
                            r0.A09(str2, "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "onMenuItemSelected", andIncrement);
                        }
                        r0.A02((Exception) null, "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "onMenuItemSelected", andIncrement2);
                    }
                    if (i == 33) {
                        if (A0B()) {
                            andIncrement = atomicInteger.getAndIncrement();
                            str2 = "messaging.threadlist.threaditemmenu.core.deletemenuitem.DeleteMenuItemImplementation";
                            r0.A0A("com.facebook.messaging.threadlist.threaditemmenu.plugins.core.deletemenuitem.DeleteMenuItemImplementation", str2, "com.facebook.messaging.threadlist.plugins.interfaces.threadmenuitem.ThreadMenuItemInterfaceSpec", andIncrement, "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "com.facebook.messaging.threadlist.threaditemmenu.plugins.core.ThreadlistThreaditemmenuCoreKillSwitch", "onMenuItemSelected");
                            Context context = this.A0g;
                            ThreadSummary threadSummary4 = this.A0l;
                            06Z r02 = this.A0h;
                            CallerContext callerContext = this.A0j;
                            2SI r03 = this.A0n;
                            FbUserSession fbUserSession = this.A0i;
                            C1742Arc c1742Arc = this.A0C;
                            if (c1742Arc == null) {
                                c1742Arc = (C1742Arc) 1Bn.A0E(context, (1BY) null, 82570);
                                this.A0C = c1742Arc;
                            }
                            DeleteMenuItemImplementation.A01(context, r02, fbUserSession, callerContext, threadSummary4, c1742Arc, r03);
                            r0.A09(str2, "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "onMenuItemSelected", andIncrement);
                        }
                        r0.A02((Exception) null, "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "onMenuItemSelected", andIncrement2);
                    }
                    if (i == 22) {
                        if (A0J()) {
                            andIncrement = atomicInteger.getAndIncrement();
                            str2 = "messaging.wellbeing.selfremediation.ignore.core.ignoregroupmenuitem.IgnoreGroupMenuItemImplementation";
                            r0.A0A("com.facebook.messaging.wellbeing.selfremediation.ignore.plugins.core.ignoregroupmenuitem.IgnoreGroupMenuItemImplementation", str2, "com.facebook.messaging.threadlist.plugins.interfaces.threadmenuitem.ThreadMenuItemInterfaceSpec", andIncrement, "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "com.facebook.messaging.wellbeing.selfremediation.ignore.plugins.core.WellbeingSelfremediationIgnoreCoreKillSwitch", "onMenuItemSelected");
                            ThreadSummary threadSummary5 = this.A0l;
                            06Z r04 = this.A0h;
                            BU2 bu2 = this.A05;
                            if (bu2 == null) {
                                bu2 = (BU2) 1Bn.A0E(this.A0g, (1BY) null, 82604);
                                this.A05 = bu2;
                            }
                            IgnoreGroupMenuItemImplementation.A01(r04, bu2, threadSummary5);
                            r0.A09(str2, "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "onMenuItemSelected", andIncrement);
                        }
                        r0.A02((Exception) null, "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "onMenuItemSelected", andIncrement2);
                    }
                    if (i == 36) {
                        if (A02()) {
                            andIncrement = atomicInteger.getAndIncrement();
                            str2 = "messaging.groups.core.addmembersmenuitem.AddMembersMenuItemImplementation";
                            r0.A0A("com.facebook.messaging.groups.plugins.core.addmembersmenuitem.AddMembersMenuItemImplementation", str2, "com.facebook.messaging.threadlist.plugins.interfaces.threadmenuitem.ThreadMenuItemInterfaceSpec", andIncrement, "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "com.facebook.messaging.groups.plugins.core.GroupsCoreKillSwitch", "onMenuItemSelected");
                            ThreadSummary threadSummary6 = this.A0l;
                            Context context2 = this.A0g;
                            CMy cMy = this.A04;
                            if (cMy == null) {
                                cMy = (CMy) 1Bn.A0E(context2, (1BY) null, 83027);
                                this.A04 = cMy;
                            }
                            7zT.A1S(threadSummary6, context2, cMy);
                            cMy.A01(context2, threadSummary6.A0n, BLj.A0G);
                            r0.A09(str2, "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "onMenuItemSelected", andIncrement);
                        }
                        r0.A02((Exception) null, "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "onMenuItemSelected", andIncrement2);
                    }
                    if (i == 4) {
                        if (A0H()) {
                            andIncrement = atomicInteger.getAndIncrement();
                            str2 = "messaging.threadlist.threaditemmenu.messenger.leavemenuitem.LeaveMenuItemImplementation";
                            r0.A0A("com.facebook.messaging.threadlist.threaditemmenu.plugins.messenger.leavemenuitem.LeaveMenuItemImplementation", str2, "com.facebook.messaging.threadlist.plugins.interfaces.threadmenuitem.ThreadMenuItemInterfaceSpec", andIncrement, "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "com.facebook.messaging.threadlist.threaditemmenu.plugins.messenger.ThreadlistThreaditemmenuMessengerKillSwitch", "onMenuItemSelected");
                            Context context3 = this.A0g;
                            ThreadSummary threadSummary7 = this.A0l;
                            06Z r05 = this.A0h;
                            FbUserSession fbUserSession2 = this.A0i;
                            CbX cbX = this.A03;
                            if (cbX == null) {
                                cbX = (CbX) 1Bn.A0E(context3, (1BY) null, 82535);
                                this.A03 = cbX;
                            }
                            LeaveMenuItemImplementation.A01(context3, r05, fbUserSession2, cbX, threadSummary7);
                            r0.A09(str2, "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "onMenuItemSelected", andIncrement);
                        }
                        r0.A02((Exception) null, "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "onMenuItemSelected", andIncrement2);
                    }
                    if (i == 3) {
                        if (A08()) {
                            andIncrement = atomicInteger.getAndIncrement();
                            str2 = "messaging.notify.mute.mutemenuitem.MuteMenuItemImplementation";
                            r0.A0A("com.facebook.messaging.notify.plugins.mute.mutemenuitem.MuteMenuItemImplementation", str2, "com.facebook.messaging.threadlist.plugins.interfaces.threadmenuitem.ThreadMenuItemInterfaceSpec", andIncrement, "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "com.facebook.messaging.notify.plugins.mute.NotifyMuteKillSwitch", "onMenuItemSelected");
                            06Z r06 = this.A0h;
                            ThreadSummary threadSummary8 = this.A0l;
                            MuteMenuItemImplementation.A01(this.A0g, r06, this.A0k, threadSummary8);
                            r0.A09(str2, "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "onMenuItemSelected", andIncrement);
                        }
                        r0.A02((Exception) null, "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "onMenuItemSelected", andIncrement2);
                    }
                    if (i == 7) {
                        if (A09()) {
                            andIncrement = atomicInteger.getAndIncrement();
                            str2 = "messaging.notify.mute.unmutemenuitem.UnmuteMenuItemImplementation";
                            r0.A0A("com.facebook.messaging.notify.plugins.mute.unmutemenuitem.UnmuteMenuItemImplementation", str2, "com.facebook.messaging.threadlist.plugins.interfaces.threadmenuitem.ThreadMenuItemInterfaceSpec", andIncrement, "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "com.facebook.messaging.notify.plugins.mute.NotifyMuteKillSwitch", "onMenuItemSelected");
                            ThreadSummary threadSummary9 = this.A0l;
                            UnmuteMenuItemImplementation.A01(this.A0g, this.A0k, threadSummary9);
                            r0.A09(str2, "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "onMenuItemSelected", andIncrement);
                        }
                        r0.A02((Exception) null, "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "onMenuItemSelected", andIncrement2);
                    }
                    if (i == 38) {
                        if (A03()) {
                            andIncrement = atomicInteger.getAndIncrement();
                            str2 = "messaging.groups.core.creategroupwithmenuitem.CreateGroupWithMenuItemImplementation";
                            r0.A0A("com.facebook.messaging.groups.plugins.core.creategroupwithmenuitem.CreateGroupWithMenuItemImplementation", str2, "com.facebook.messaging.threadlist.plugins.interfaces.threadmenuitem.ThreadMenuItemInterfaceSpec", andIncrement, "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "com.facebook.messaging.groups.plugins.core.GroupsCoreKillSwitch", "onMenuItemSelected");
                            Context context4 = this.A0g;
                            User user2 = this.A0o;
                            ThreadSummary threadSummary10 = this.A0l;
                            FbUserSession fbUserSession3 = this.A0i;
                            Bzc bzc = this.A08;
                            if (bzc == null) {
                                bzc = (Bzc) 1Bn.A0E(context4, (1BY) null, 68697);
                                this.A08 = bzc;
                            }
                            CG9 cg9 = this.A0A;
                            if (cg9 == null) {
                                cg9 = (CG9) 1Bn.A0E(context4, (1BY) null, 68698);
                                this.A0A = cg9;
                            }
                            Bzc bzc2 = bzc;
                            CreateGroupWithMenuItemImplementation.A01(context4, fbUserSession3, threadSummary10, bzc, cg9, user2);
                            r0.A09(str2, "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "onMenuItemSelected", andIncrement);
                        }
                        r0.A02((Exception) null, "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "onMenuItemSelected", andIncrement2);
                    }
                    if (i == 8) {
                        if (A0C()) {
                            andIncrement = atomicInteger.getAndIncrement();
                            str2 = "messaging.threadlist.threaditemmenu.core.markreadmenuitem.MarkReadMenuItemImplementation";
                            r0.A0A("com.facebook.messaging.threadlist.threaditemmenu.plugins.core.markreadmenuitem.MarkReadMenuItemImplementation", str2, "com.facebook.messaging.threadlist.plugins.interfaces.threadmenuitem.ThreadMenuItemInterfaceSpec", andIncrement, "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "com.facebook.messaging.threadlist.threaditemmenu.plugins.core.ThreadlistThreaditemmenuCoreKillSwitch", "onMenuItemSelected");
                            MarkReadMenuItemImplementation.A00(this.A0g, this.A0h, this.A0i, this.A0l);
                            r0.A09(str2, "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "onMenuItemSelected", andIncrement);
                        }
                        r0.A02((Exception) null, "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "onMenuItemSelected", andIncrement2);
                    }
                    if (i == 9) {
                        if (A0D()) {
                            andIncrement = atomicInteger.getAndIncrement();
                            str2 = "messaging.threadlist.threaditemmenu.core.markunreadmenuitem.MarkUnreadMenuItemImplementation";
                            r0.A0A("com.facebook.messaging.threadlist.threaditemmenu.plugins.core.markunreadmenuitem.MarkUnreadMenuItemImplementation", str2, "com.facebook.messaging.threadlist.plugins.interfaces.threadmenuitem.ThreadMenuItemInterfaceSpec", andIncrement, "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "com.facebook.messaging.threadlist.threaditemmenu.plugins.core.ThreadlistThreaditemmenuCoreKillSwitch", "onMenuItemSelected");
                            ThreadSummary threadSummary11 = this.A0l;
                            FbUserSession fbUserSession4 = this.A0i;
                            F3F f3f = this.A0B;
                            if (f3f == null) {
                                f3f = (F3F) 1Bn.A0E(this.A0g, (1BY) null, 98762);
                                this.A0B = f3f;
                            }
                            MarkUnreadMenuItemImplementation.A00(this.A0g, fbUserSession4, threadSummary11, f3f);
                            r0.A09(str2, "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "onMenuItemSelected", andIncrement);
                        }
                        r0.A02((Exception) null, "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "onMenuItemSelected", andIncrement2);
                    }
                    if (i == 75) {
                        if (A07()) {
                            andIncrement = atomicInteger.getAndIncrement();
                            str2 = "messaging.nativepagereply.spam.spamfolder.menuitem.SpamMoveThreadMenuItem";
                            r0.A0A("com.facebook.messaging.nativepagereply.spam.plugins.spamfolder.menuitem.SpamMoveThreadMenuItem", str2, "com.facebook.messaging.threadlist.plugins.interfaces.threadmenuitem.ThreadMenuItemInterfaceSpec", andIncrement, "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", AbstractC00603o4.A00(8), "onMenuItemSelected");
                            SpamMoveThreadMenuItem.A01(this.A0g, this.A0h, this.A0i, this.A0l);
                            r0.A09(str2, "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "onMenuItemSelected", andIncrement);
                        }
                        r0.A02((Exception) null, "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "onMenuItemSelected", andIncrement2);
                    }
                    if (i == 39) {
                        if (A0L()) {
                            andIncrement = atomicInteger.getAndIncrement();
                            str2 = "messaging.wellbeing.selfremediation.restrict.threadmenuitem.RestrictThreadMenuItem";
                            r0.A0A("com.facebook.messaging.wellbeing.selfremediation.restrict.plugins.threadmenuitem.RestrictThreadMenuItem", str2, "com.facebook.messaging.threadlist.plugins.interfaces.threadmenuitem.ThreadMenuItemInterfaceSpec", andIncrement, "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "com.facebook.messaging.wellbeing.selfremediation.restrict.plugins.WellbeingSelfremediationRestrictKillSwitch", "onMenuItemSelected");
                            RestrictThreadMenuItem.A01(this.A0g, this.A0h, this.A0i, this.A0l, this.A0o);
                            r0.A09(str2, "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "onMenuItemSelected", andIncrement);
                        }
                        r0.A02((Exception) null, "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "onMenuItemSelected", andIncrement2);
                    }
                    if (i == 20) {
                        if (A0K()) {
                            andIncrement = atomicInteger.getAndIncrement();
                            str2 = "messaging.wellbeing.selfremediation.ignore.core.ignoremenuitem.IgnoreMessagesMenuItemImplementation";
                            r0.A0A("com.facebook.messaging.wellbeing.selfremediation.ignore.plugins.core.ignoremenuitem.IgnoreMessagesMenuItemImplementation", str2, "com.facebook.messaging.threadlist.plugins.interfaces.threadmenuitem.ThreadMenuItemInterfaceSpec", andIncrement, "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "com.facebook.messaging.wellbeing.selfremediation.ignore.plugins.core.WellbeingSelfremediationIgnoreCoreKillSwitch", "onMenuItemSelected");
                            ThreadSummary threadSummary12 = this.A0l;
                            06Z r07 = this.A0h;
                            BU2 bu22 = this.A06;
                            if (bu22 == null) {
                                bu22 = (BU2) 1Bn.A0E(this.A0g, (1BY) null, 82604);
                                this.A06 = bu22;
                            }
                            IgnoreMessagesMenuItemImplementation.A01(r07, bu22, threadSummary12);
                            r0.A09(str2, "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "onMenuItemSelected", andIncrement);
                        }
                        r0.A02((Exception) null, "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "onMenuItemSelected", andIncrement2);
                    }
                    if (i == 10) {
                        if (A0I()) {
                            andIncrement = atomicInteger.getAndIncrement();
                            str2 = "messaging.wellbeing.selfremediation.block.core.blockmessagesmenuitem.BlockMessagesMenuItemImplementation";
                            r0.A0A("com.facebook.messaging.wellbeing.selfremediation.block.plugins.core.blockmessagesmenuitem.BlockMessagesMenuItemImplementation", str2, "com.facebook.messaging.threadlist.plugins.interfaces.threadmenuitem.ThreadMenuItemInterfaceSpec", andIncrement, "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "com.facebook.messaging.wellbeing.selfremediation.block.plugins.core.WellbeingSelfremediationBlockCoreKillSwitch", "onMenuItemSelected");
                            ThreadSummary threadSummary13 = this.A0l;
                            User user3 = this.A0o;
                            06Z r08 = this.A0h;
                            7EN r307 = this.A0D;
                            if (r307 == null) {
                                r307 = (7EN) 1Bn.A0E(this.A0g, (1BY) null, 50188);
                                this.A0D = r307;
                            }
                            BlockMessagesMenuItemImplementation.A01(r08, threadSummary13, r307, user3);
                            r0.A09(str2, "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "onMenuItemSelected", andIncrement);
                        }
                        r0.A02((Exception) null, "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "onMenuItemSelected", andIncrement2);
                    }
                    if (i == 47) {
                        if (A06()) {
                            andIncrement = atomicInteger.getAndIncrement();
                            str2 = "messaging.msys.thread.platypustoggle.platypustoggleinboxmenuitem.PlatypusToggleInboxMenuItem";
                            r0.A0A("com.facebook.messaging.msys.thread.plugins.platypustoggle.platypustoggleinboxmenuitem.PlatypusToggleInboxMenuItem", str2, "com.facebook.messaging.threadlist.plugins.interfaces.threadmenuitem.ThreadMenuItemInterfaceSpec", andIncrement, "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", 4YT.A00(4), "onMenuItemSelected");
                            PlatypusToggleInboxMenuItem platypusToggleInboxMenuItem = this.A0G;
                            ((C77) 1Br.A0B(platypusToggleInboxMenuItem.A01)).A00(platypusToggleInboxMenuItem.A00, AbF.A0f(platypusToggleInboxMenuItem.A02), false);
                            r0.A09(str2, "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "onMenuItemSelected", andIncrement);
                        }
                        r0.A02((Exception) null, "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "onMenuItemSelected", andIncrement2);
                    }
                    if (i != 63) {
                        if (i == 79 && A05()) {
                            andIncrement = atomicInteger.getAndIncrement();
                            str2 = "messaging.marketplace.folder.hidemenuitem.HideMarketplaceFolderMenuItem";
                            r0.A0A("com.facebook.messaging.marketplace.plugins.folder.hidemenuitem.HideMarketplaceFolderMenuItem", str2, "com.facebook.messaging.threadlist.plugins.interfaces.threadmenuitem.ThreadMenuItemInterfaceSpec", andIncrement, "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", 1BJ.A00(12), "onMenuItemSelected");
                            HideMarketplaceFolderMenuItem.A00(this.A0g, this.A0i);
                            r0.A09(str2, "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "onMenuItemSelected", andIncrement);
                        }
                        r0.A02((Exception) null, "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "onMenuItemSelected", andIncrement2);
                    }
                    if (A0M()) {
                        andIncrement = atomicInteger.getAndIncrement();
                        str2 = "messaging.wellbeing.unknowncontact.messagerequests.inboxfolder.hidemenuitem.HideMessageRequestFolderMenuItem";
                        r0.A0A("com.facebook.messaging.wellbeing.unknowncontact.messagerequests.plugins.inboxfolder.hidemenuitem.HideMessageRequestFolderMenuItem", str2, "com.facebook.messaging.threadlist.plugins.interfaces.threadmenuitem.ThreadMenuItemInterfaceSpec", andIncrement, "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "com.facebook.messaging.wellbeing.unknowncontact.messagerequests.plugins.inboxfolder.WellbeingUnknowncontactMessagerequestsInboxfolderKillSwitch", "onMenuItemSelected");
                        HideMessageRequestFolderMenuItem.A00(this.A0g, this.A0i, this.A0l);
                        r0.A09(str2, "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "onMenuItemSelected", andIncrement);
                    }
                    r0.A02((Exception) null, "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "onMenuItemSelected", andIncrement2);
                } catch (Exception e) {
                    throw e;
                }
            } catch (Throwable th) {
                r0.A04((Exception) null, str, "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "onMenuItemSelected", 40);
                throw th;
            }
        } catch (Throwable th2) {
            r0.A02((Exception) null, "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "onMenuItemSelected", andIncrement2);
            throw th2;
        }
    }
}
