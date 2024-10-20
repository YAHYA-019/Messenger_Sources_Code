package X;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.communitymessaging.analytics.CommunityMessagingLoggerModel;
import com.facebook.messaging.communitymessaging.plugins.channelinvite.threadviewtitlebarchannelinvitebutton.ThreadViewTitleBarChannelInviteButtonImplementation;
import com.facebook.messaging.communitymessaging.threadedreplies.plugins.titlebarbutton.options.ThreadedRepliesTitleBarOptionsButtonImpl;
import com.facebook.messaging.communitymessaging.threadedreplies.plugins.titlebarbutton.subthreadlistbutton.SubThreadListButton;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.GroupThreadData;
import com.facebook.messaging.model.threads.JoinableInfo;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.publicchats.plugins.threadview.threadviewbutton.NotificationButtonImplementation;
import com.facebook.messaging.publicchats.plugins.threadview.threadviewbutton.sharebutton.BroadcastChannelShareButtonImplementation;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.smartcapture.logging.SCEventNames;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: Cwh.class */
public final class Cwh implements AnonymousClass553 {
    public final int A00;
    public final Object A01;

    public Cwh(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000b. Please report as an issue. */
    @Override // X.AnonymousClass553
    public final void onClick(View view) {
        ThreadKey threadKey;
        GroupThreadData AoK;
        JoinableInfo joinableInfo;
        ThreadSummary threadSummary;
        int andIncrement;
        String str;
        String A0u;
        ThreadKey threadKey2;
        6Jk r306;
        String str2;
        switch (this.A00) {
            case 0:
                11T.A0F(view, 0);
                ThreadViewTitleBarChannelInviteButtonImplementation threadViewTitleBarChannelInviteButtonImplementation = (ThreadViewTitleBarChannelInviteButtonImplementation) this.A01;
                String A0s = 7zR.A0s();
                ThreadSummary threadSummary2 = threadViewTitleBarChannelInviteButtonImplementation.A02.A03;
                if (threadSummary2 == null) {
                    throw AnonymousClass001.A0N("Required value was null.");
                }
                C1296Ad8 A0W = 7zR.A0W();
                1Bn.A0A(82368);
                1pI A00 = 1vD.A00(view);
                ThreadKey threadKey3 = threadSummary2.A0n;
                String A17 = AbF.A17(threadSummary2);
                AbT.A03(A00, BME.A0G, threadKey3, A17, A0s);
                ThreadKey threadKey4 = threadSummary2.A0l;
                if (threadKey4 == null) {
                    throw AnonymousClass001.A0N("Required value was null.");
                }
                A0W.A04(new CommunityMessagingLoggerModel(null, null, 1BK.A0w(threadKey4), A17, 1BK.A0w(threadKey3), null, "invite_button", "thread_view", "render_direct_invite_sheet", null, null, 1BK.A1D("search_session_id", A0s)));
                return;
            case 1:
                ThreadedRepliesTitleBarOptionsButtonImpl threadedRepliesTitleBarOptionsButtonImpl = (ThreadedRepliesTitleBarOptionsButtonImpl) this.A01;
                if (view == null || (threadSummary = threadedRepliesTitleBarOptionsButtonImpl.A03.A03) == null) {
                    return;
                }
                1Bn.A0A(147557);
                MigColorScheme migColorScheme = threadedRepliesTitleBarOptionsButtonImpl.A05.A0F;
                11T.A0A(migColorScheme);
                C0R A002 = BTG.A00(threadedRepliesTitleBarOptionsButtonImpl.A00, threadedRepliesTitleBarOptionsButtonImpl.A01, threadedRepliesTitleBarOptionsButtonImpl.A02, threadSummary, threadedRepliesTitleBarOptionsButtonImpl.A04, threadedRepliesTitleBarOptionsButtonImpl.A06, threadedRepliesTitleBarOptionsButtonImpl.A07);
                Context context = view.getContext();
                8Ca A01 = ((C9kp) 1Bn.A0A(67678)).A01(view, migColorScheme);
                11T.A0D(context);
                for (int i : A002.A00()) {
                    COb cOb = A002.A00.A00;
                    AtomicInteger atomicInteger = C1Y6.A04;
                    int andIncrement2 = atomicInteger.getAndIncrement();
                    1YC r0 = cOb.A08;
                    r0.A08("com.facebook.messaging.communitymessaging.threadedreplies.plugins.interfaces.titlebaroptionsmenuitem.ThreadedRepliesTitleBarOptionsMenuItemInterfaceSpec", "messaging.communitymessaging.threadedreplies.titlebaroptionsmenuitem.ThreadedRepliesTitleBarOptionsMenuItemInterfaceSpec", "getLabel", andIncrement2);
                    Exception e = null;
                    if (i == 1) {
                        try {
                            if (COb.A00(cOb)) {
                                andIncrement = atomicInteger.getAndIncrement();
                                str = "messaging.communitymessaging.threadedreplies.titlebaroptionsmenu.deleteitem.ThreadedRepliesTitleBarDeleteThreadMenuItemImpl";
                                r0.A0A("com.facebook.messaging.communitymessaging.threadedreplies.plugins.titlebaroptionsmenu.deleteitem.ThreadedRepliesTitleBarDeleteThreadMenuItemImpl", str, "com.facebook.messaging.communitymessaging.threadedreplies.plugins.interfaces.titlebaroptionsmenuitem.ThreadedRepliesTitleBarOptionsMenuItemInterfaceSpec", andIncrement, "messaging.communitymessaging.threadedreplies.titlebaroptionsmenuitem.ThreadedRepliesTitleBarOptionsMenuItemInterfaceSpec", "com.facebook.messaging.communitymessaging.threadedreplies.plugins.titlebaroptionsmenu.CommunitymessagingThreadedrepliesTitlebaroptionsmenuKillSwitch", "getLabel");
                                try {
                                    try {
                                        A0u = 1BK.A0u(cOb.A01.A00, 2131955704);
                                        r0.A09(str, "messaging.communitymessaging.threadedreplies.titlebaroptionsmenuitem.ThreadedRepliesTitleBarOptionsMenuItemInterfaceSpec", "getLabel", andIncrement);
                                        r0.A02((Exception) null, "messaging.communitymessaging.threadedreplies.titlebaroptionsmenuitem.ThreadedRepliesTitleBarOptionsMenuItemInterfaceSpec", "getLabel", andIncrement2);
                                        ((7QJ) A01).A04.add(0, i, 0, A0u);
                                    } catch (Exception e2) {
                                        e = e2;
                                        throw e;
                                    }
                                } catch (Throwable th) {
                                    r0.A04(e, str, "messaging.communitymessaging.threadedreplies.titlebaroptionsmenuitem.ThreadedRepliesTitleBarOptionsMenuItemInterfaceSpec", "getLabel", andIncrement);
                                    throw th;
                                }
                            }
                            r0.A02((Exception) null, "messaging.communitymessaging.threadedreplies.titlebaroptionsmenuitem.ThreadedRepliesTitleBarOptionsMenuItemInterfaceSpec", "getLabel", andIncrement2);
                        } catch (Throwable th2) {
                            r0.A02(e, "messaging.communitymessaging.threadedreplies.titlebaroptionsmenuitem.ThreadedRepliesTitleBarOptionsMenuItemInterfaceSpec", "getLabel", andIncrement2);
                            throw th2;
                        }
                    } else if (i == 2) {
                        if (COb.A01(cOb)) {
                            andIncrement = atomicInteger.getAndIncrement();
                            str = "messaging.communitymessaging.threadedreplies.titlebaroptionsmenu.reporttoadmins.ReportToAdminsMenuImplementation";
                            r0.A0A("com.facebook.messaging.communitymessaging.threadedreplies.plugins.titlebaroptionsmenu.reporttoadmins.ReportToAdminsMenuImplementation", str, "com.facebook.messaging.communitymessaging.threadedreplies.plugins.interfaces.titlebaroptionsmenuitem.ThreadedRepliesTitleBarOptionsMenuItemInterfaceSpec", andIncrement, "messaging.communitymessaging.threadedreplies.titlebaroptionsmenuitem.ThreadedRepliesTitleBarOptionsMenuItemInterfaceSpec", "com.facebook.messaging.communitymessaging.threadedreplies.plugins.titlebaroptionsmenu.CommunitymessagingThreadedrepliesTitlebaroptionsmenuKillSwitch", "getLabel");
                            A0u = 1BK.A0u(cOb.A02.A00, 2131964387);
                            r0.A09(str, "messaging.communitymessaging.threadedreplies.titlebaroptionsmenuitem.ThreadedRepliesTitleBarOptionsMenuItemInterfaceSpec", "getLabel", andIncrement);
                            r0.A02((Exception) null, "messaging.communitymessaging.threadedreplies.titlebaroptionsmenuitem.ThreadedRepliesTitleBarOptionsMenuItemInterfaceSpec", "getLabel", andIncrement2);
                            ((7QJ) A01).A04.add(0, i, 0, A0u);
                        }
                        r0.A02((Exception) null, "messaging.communitymessaging.threadedreplies.titlebaroptionsmenuitem.ThreadedRepliesTitleBarOptionsMenuItemInterfaceSpec", "getLabel", andIncrement2);
                    } else {
                        if (i == 3 && COb.A02(cOb)) {
                            andIncrement = atomicInteger.getAndIncrement();
                            str = "messaging.communitymessaging.threadedreplies.titlebaroptionsmenu.reporttofacebook.ReportToFacebookMenuImplementation";
                            r0.A0A("com.facebook.messaging.communitymessaging.threadedreplies.plugins.titlebaroptionsmenu.reporttofacebook.ReportToFacebookMenuImplementation", str, "com.facebook.messaging.communitymessaging.threadedreplies.plugins.interfaces.titlebaroptionsmenuitem.ThreadedRepliesTitleBarOptionsMenuItemInterfaceSpec", andIncrement, "messaging.communitymessaging.threadedreplies.titlebaroptionsmenuitem.ThreadedRepliesTitleBarOptionsMenuItemInterfaceSpec", "com.facebook.messaging.communitymessaging.threadedreplies.plugins.titlebaroptionsmenu.CommunitymessagingThreadedrepliesTitlebaroptionsmenuKillSwitch", "getLabel");
                            Context context2 = cOb.A03.A00;
                            A0u = AbG.A17(context2, new Object[]{context2.getString(2131956666)}, 2131964388);
                            r0.A09(str, "messaging.communitymessaging.threadedreplies.titlebaroptionsmenuitem.ThreadedRepliesTitleBarOptionsMenuItemInterfaceSpec", "getLabel", andIncrement);
                            r0.A02((Exception) null, "messaging.communitymessaging.threadedreplies.titlebaroptionsmenuitem.ThreadedRepliesTitleBarOptionsMenuItemInterfaceSpec", "getLabel", andIncrement2);
                            ((7QJ) A01).A04.add(0, i, 0, A0u);
                        }
                        r0.A02((Exception) null, "messaging.communitymessaging.threadedreplies.titlebaroptionsmenuitem.ThreadedRepliesTitleBarOptionsMenuItemInterfaceSpec", "getLabel", andIncrement2);
                    }
                }
                ((7QJ) A01).A01 = new CZW(A002, 1);
                A01.A00();
                return;
            case 2:
                11T.A0F(view, 0);
                SubThreadListButton subThreadListButton = (SubThreadListButton) this.A01;
                5Sh r02 = subThreadListButton.A03;
                ThreadSummary threadSummary3 = r02.A03;
                if (threadSummary3 == null || (threadKey2 = threadSummary3.A0n) == null) {
                    return;
                }
                FbUserSession fbUserSession = subThreadListButton.A01;
                Context context3 = subThreadListButton.A00;
                CC4.A00(BLu.A03, (CC4) 1Lm.A05(context3, fbUserSession, 81922)).A01(1BK.A1D("entrypoint", "thread_nav_icon"), threadKey2.A04);
                ((C6s) 1Br.A0B(subThreadListButton.A02)).A01(context3, 1vD.A00(view), threadKey2, r02, subThreadListButton.A04, subThreadListButton.A06, 1022, true);
                return;
            case 3:
                11T.A0F(view, 0);
                NotificationButtonImplementation notificationButtonImplementation = (NotificationButtonImplementation) this.A01;
                ThreadSummary threadSummary4 = notificationButtonImplementation.A07.A03;
                if (threadSummary4 != null) {
                    boolean A06 = 2oI.A06(threadSummary4);
                    AbJ.A0J(notificationButtonImplementation.A05).A0v(notificationButtonImplementation.A00, new Cul(notificationButtonImplementation, 4)).D0Q(threadSummary4.A0n, 1009, true);
                    if (A06) {
                        CQo.A0H(BOn.A0Q, AbI.A0b(notificationButtonImplementation.A01), (Long) null, 04R.A0G(), 14, 62, 3);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                11T.A0F(view, 0);
                BroadcastChannelShareButtonImplementation broadcastChannelShareButtonImplementation = (BroadcastChannelShareButtonImplementation) this.A01;
                ThreadSummary threadSummary5 = broadcastChannelShareButtonImplementation.A02.A03;
                Uri uri = null;
                CQo.A0B(BOn.A0O, 7zR.A0a(), (Long) null);
                if (threadSummary5 != null && (AoK = threadSummary5.AoK()) != null && (joinableInfo = AoK.A06) != null) {
                    uri = joinableInfo.A00;
                }
                String valueOf = String.valueOf(uri);
                if (valueOf == null) {
                    throw AnonymousClass001.A0N("Required value was null.");
                }
                if (2oI.A09(threadSummary5)) {
                    CQN.A04(broadcastChannelShareButtonImplementation.A00, valueOf);
                    return;
                }
                Context context4 = broadcastChannelShareButtonImplementation.A00;
                if (threadSummary5 == null || (threadKey = threadSummary5.A0n) == null) {
                    throw AnonymousClass001.A0N("Required value was null.");
                }
                CQN.A02(context4, view, C96j.A05, threadKey, "thread_details", valueOf);
                return;
            case 5:
                r306 = (6Jk) this.A01;
                int i2 = r306.A00;
                if (i2 > 0) {
                    6Jk.A06(r306, i2 - 1);
                    6Jk.A09(r306, true);
                    str2 = "prev";
                    6Jk.A07(r306, str2);
                    return;
                }
                return;
            default:
                r306 = (6Jk) this.A01;
                int i3 = r306.A00;
                if (i3 < r306.A01 - 1) {
                    6Jk.A06(r306, i3 + 1);
                    6Jk.A09(r306, false);
                    str2 = SCEventNames.Params.STEP_CHANGE_NEXT;
                    6Jk.A07(r306, str2);
                    return;
                }
                return;
        }
    }
}
