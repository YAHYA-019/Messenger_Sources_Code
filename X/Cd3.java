package X;

import android.content.Context;
import android.os.Bundle;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.messaging.communitymessaging.analytics.CommunityMessagingLoggerModel;
import com.facebook.messaging.communitymessaging.plugins.inboxupsells.hidesuggestedchatsmenuitem.HideSuggestedChatsMenuItemImplementation;
import com.facebook.messaging.communitymessaging.plugins.inboxupsells.infomenuitem.CcInboxUpsellsInfoBottomSheetFragment;
import com.facebook.messaging.communitymessaging.plugins.inboxupsells.infomenuitem.InfoMenuItemImplementation;
import com.facebook.messaging.inbox.units.InboxTrackableItem;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.user.model.User;
import com.facebook.xapp.messaging.capability.vector.Capabilities;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: Cd3.class */
public final class Cd3 implements C4YN {
    public HideSuggestedChatsMenuItemImplementation A01;
    public InfoMenuItemImplementation A02;
    public Object A03;
    public Object A04;
    public final Context A05;
    public final 06Z A06;
    public final FbUserSession A07;
    public final CallerContext A08;
    public final InboxTrackableItem A09;
    public final ThreadSummary A0A;
    public final User A0C;
    public final Capabilities A0D;
    public int A00 = -1;
    public final 1YC A0B = 1YC.A03;

    public Cd3(Context context, 06Z r303, FbUserSession fbUserSession, CallerContext callerContext, InboxTrackableItem inboxTrackableItem, ThreadSummary threadSummary, User user, Capabilities capabilities) {
        this.A05 = context;
        this.A0A = threadSummary;
        this.A06 = r303;
        this.A0D = capabilities;
        this.A07 = fbUserSession;
        this.A08 = callerContext;
        this.A0C = user;
        this.A09 = inboxTrackableItem;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0073 A[Catch: Exception -> 0x00b1, all -> 0x00bd, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x00b1, blocks: (B:5:0x0042, B:6:0x0047, B:9:0x0053, B:12:0x005b, B:15:0x0073, B:16:0x0079, B:17:0x007f, B:18:0x0084, B:19:0x008a, B:21:0x0095, B:22:0x009a, B:23:0x009e, B:23:0x009e, B:26:0x00aa, B:29:0x00a5, B:31:0x0067), top: B:4:0x0042, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a5 A[Catch: Exception -> 0x00b1, all -> 0x00bd, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x00b1, blocks: (B:5:0x0042, B:6:0x0047, B:9:0x0053, B:12:0x005b, B:15:0x0073, B:16:0x0079, B:17:0x007f, B:18:0x0084, B:19:0x008a, B:21:0x0095, B:22:0x009a, B:23:0x009e, B:23:0x009e, B:26:0x00aa, B:29:0x00a5, B:31:0x0067), top: B:4:0x0042, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A00() {
        /*
            Method dump skipped, instructions count: 255
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Cd3.A00():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0073 A[Catch: Exception -> 0x00b1, all -> 0x00bd, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x00b1, blocks: (B:5:0x0042, B:6:0x0047, B:9:0x0053, B:12:0x005b, B:15:0x0073, B:16:0x0079, B:17:0x007f, B:18:0x0084, B:19:0x008a, B:21:0x0095, B:22:0x009a, B:23:0x009e, B:23:0x009e, B:26:0x00aa, B:29:0x00a5, B:31:0x0067), top: B:4:0x0042, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a5 A[Catch: Exception -> 0x00b1, all -> 0x00bd, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x00b1, blocks: (B:5:0x0042, B:6:0x0047, B:9:0x0053, B:12:0x005b, B:15:0x0073, B:16:0x0079, B:17:0x007f, B:18:0x0084, B:19:0x008a, B:21:0x0095, B:22:0x009a, B:23:0x009e, B:23:0x009e, B:26:0x00aa, B:29:0x00a5, B:31:0x0067), top: B:4:0x0042, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A01() {
        /*
            Method dump skipped, instructions count: 255
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Cd3.A01():boolean");
    }

    @Override // X.C4YN
    public void ANc() {
        int A00 = 1BK.A00();
        1YC r0 = this.A0B;
        r0.A08("com.facebook.messaging.threadlist.plugins.interfaces.threadmenuitem.ThreadMenuItemInterfaceSpec", "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "dismissDialogs", A00);
        r0.A06("messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "dismissDialogs", A00);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v104, types: [int] */
    /* JADX WARN: Type inference failed for: r0v17, types: [int] */
    /* JADX WARN: Type inference failed for: r0v42, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r310v0 */
    /* JADX WARN: Type inference failed for: r322v0 */
    @Override // X.C4YN
    public ArrayList Awf() {
        int andIncrement;
        String str;
        AtomicInteger atomicInteger = C1Y6.A04;
        int andIncrement2 = atomicInteger.getAndIncrement();
        1YC r0 = this.A0B;
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
                this.A00 = z2 ? 1 : 0;
                z = z2;
            }
            ArrayList A0t = AnonymousClass001.A0t(z);
            if (A01()) {
                andIncrement = atomicInteger.getAndIncrement();
                str = "messaging.communitymessaging.inboxupsells.infomenuitem.InfoMenuItemImplementation";
                r0.A0A("com.facebook.messaging.communitymessaging.plugins.inboxupsells.infomenuitem.InfoMenuItemImplementation", str, "com.facebook.messaging.threadlist.plugins.interfaces.threadmenuitem.ThreadMenuItemInterfaceSpec", andIncrement, "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", 1BJ.A00(15), "getMenuItem");
                try {
                    try {
                        InfoMenuItemImplementation infoMenuItemImplementation = this.A02;
                        CQE cqe = new CQE();
                        cqe.A00 = 68;
                        Context context = infoMenuItemImplementation.A00;
                        CQE.A04(context, cqe, 2131957886);
                        CQE.A03(context, cqe, 2131957885);
                        cqe.A06(C1u3.A3r);
                        CQE.A05(cqe, "CC_INBOX_UPSELLS_INFO", A0t);
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
                andIncrement = atomicInteger.getAndIncrement();
                str = "messaging.communitymessaging.inboxupsells.hidesuggestedchatsmenuitem.HideSuggestedChatsMenuItemImplementation";
                r0.A0A("com.facebook.messaging.communitymessaging.plugins.inboxupsells.hidesuggestedchatsmenuitem.HideSuggestedChatsMenuItemImplementation", str, "com.facebook.messaging.threadlist.plugins.interfaces.threadmenuitem.ThreadMenuItemInterfaceSpec", andIncrement, "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", 1BJ.A00(15), "getMenuItem");
                HideSuggestedChatsMenuItemImplementation hideSuggestedChatsMenuItemImplementation = this.A01;
                CQE cqe2 = new CQE();
                cqe2.A00 = 69;
                Context context2 = hideSuggestedChatsMenuItemImplementation.A00;
                CQE.A04(context2, cqe2, 2131957629);
                CQE.A03(context2, cqe2, 2131957628);
                cqe2.A06(C1u3.A2d);
                CQE.A05(cqe2, "CC_INBOX_UPSELLS_HIDE_SUGGESTED_CHATS", A0t);
                r0.A09(str, "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "getMenuItem", andIncrement);
            }
            while (true) {
                int size = A0t.size();
                ?? r322 = this.A00;
                boolean z3 = r322;
                if (r322 == -1) {
                    boolean A012 = A01();
                    boolean z4 = A012;
                    if (A00()) {
                        z4 = (A012 ? 1 : 0) + 1;
                    }
                    this.A00 = z4 ? 1 : 0;
                    z3 = z4;
                }
                if (size >= z3) {
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
    /* JADX WARN: Not initialized variable reg: 314, insn: 0x0370: MOVE (r2 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r314 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:141:0x0360 */
    @Override // X.C4YN
    public void C6a(int i) {
        String str;
        int andIncrement;
        String str2;
        java.util.Map map;
        java.util.Map map2;
        AtomicInteger atomicInteger = C1Y6.A04;
        int andIncrement2 = atomicInteger.getAndIncrement();
        1YC r0 = this.A0B;
        r0.A08("com.facebook.messaging.threadlist.plugins.interfaces.threadmenuitem.ThreadMenuItemInterfaceSpec", "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "onMenuItemSelected", andIncrement2);
        try {
            try {
                try {
                    if (i == 68) {
                        if (A01()) {
                            andIncrement = atomicInteger.getAndIncrement();
                            str2 = "messaging.communitymessaging.inboxupsells.infomenuitem.InfoMenuItemImplementation";
                            r0.A0A("com.facebook.messaging.communitymessaging.plugins.inboxupsells.infomenuitem.InfoMenuItemImplementation", str2, "com.facebook.messaging.threadlist.plugins.interfaces.threadmenuitem.ThreadMenuItemInterfaceSpec", andIncrement, "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", 1BJ.A00(15), "onMenuItemSelected");
                            InfoMenuItemImplementation infoMenuItemImplementation = this.A02;
                            94S r02 = MigBottomSheetDialogFragment.A01;
                            Context context = infoMenuItemImplementation.A00;
                            ThreadSummary threadSummary = infoMenuItemImplementation.A03;
                            String A17 = AbG.A17(context, new Object[]{threadSummary.A1r}, 2131957884);
                            CcInboxUpsellsInfoBottomSheetFragment ccInboxUpsellsInfoBottomSheetFragment = new CcInboxUpsellsInfoBottomSheetFragment();
                            Bundle A05 = 1BK.A05();
                            A05.putString("arg_body_text", A17);
                            ccInboxUpsellsInfoBottomSheetFragment.setArguments(A05);
                            ccInboxUpsellsInfoBottomSheetFragment.A0m(infoMenuItemImplementation.A01, "CcInboxUpsellsInfoBottomSheetFragment");
                            Bd5 bd5 = (Bd5) 1Bi.A03(82638);
                            String A172 = AbK.A17(threadSummary);
                            ThreadKey threadKey = threadSummary.A0l;
                            String A0w = threadKey != null ? 1BK.A0w(threadKey) : null;
                            String A173 = AbF.A17(threadSummary);
                            InboxTrackableItem inboxTrackableItem = infoMenuItemImplementation.A02;
                            if (inboxTrackableItem != null) {
                                int i2 = inboxTrackableItem.A02;
                                if (Integer.valueOf(i2) != null) {
                                    map2 = 1BK.A1D("rank", String.valueOf(i2));
                                    AbJ.A0O(bd5.A00).A04(new CommunityMessagingLoggerModel(null, null, A173, A0w, A172, null, "info_button", "cc_inbox_upsell_bottom_sheet", "cc_inbox_upsell_info_clicked", "messenger_inbox", null, map2));
                                    r0.A09(str2, "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "onMenuItemSelected", andIncrement);
                                    r0.A02((Exception) null, "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "onMenuItemSelected", andIncrement2);
                                    return;
                                }
                            }
                            map2 = null;
                            AbJ.A0O(bd5.A00).A04(new CommunityMessagingLoggerModel(null, null, A173, A0w, A172, null, "info_button", "cc_inbox_upsell_bottom_sheet", "cc_inbox_upsell_info_clicked", "messenger_inbox", null, map2));
                            r0.A09(str2, "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "onMenuItemSelected", andIncrement);
                            r0.A02((Exception) null, "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "onMenuItemSelected", andIncrement2);
                            return;
                        }
                        r0.A02((Exception) null, "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "onMenuItemSelected", andIncrement2);
                    }
                    if (i == 69 && A00()) {
                        andIncrement = atomicInteger.getAndIncrement();
                        str2 = "messaging.communitymessaging.inboxupsells.hidesuggestedchatsmenuitem.HideSuggestedChatsMenuItemImplementation";
                        r0.A0A("com.facebook.messaging.communitymessaging.plugins.inboxupsells.hidesuggestedchatsmenuitem.HideSuggestedChatsMenuItemImplementation", str2, "com.facebook.messaging.threadlist.plugins.interfaces.threadmenuitem.ThreadMenuItemInterfaceSpec", andIncrement, "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", 1BJ.A00(15), "onMenuItemSelected");
                        HideSuggestedChatsMenuItemImplementation hideSuggestedChatsMenuItemImplementation = this.A01;
                        6JM r03 = (6JM) 1Bn.A0A(67632);
                        ThreadSummary threadSummary2 = hideSuggestedChatsMenuItemImplementation.A03;
                        Context context2 = hideSuggestedChatsMenuItemImplementation.A00;
                        MigColorScheme A01 = r03.A01(context2, threadSummary2);
                        1Bn.A0A(67527);
                        DR6 A012 = C5ic.A01(context2, A01);
                        A012.A03(context2.getString(2131957627));
                        A012.A0J(context2.getString(2131957626));
                        CSG.A02(A012, context2.getString(2131957625), hideSuggestedChatsMenuItemImplementation, 52);
                        A012.A0E(Rih.A00, context2.getString(2131957624));
                        A012.A05();
                        Bd5 bd52 = (Bd5) 1Bi.A03(82638);
                        String A174 = AbK.A17(threadSummary2);
                        ThreadKey threadKey2 = threadSummary2.A0l;
                        String A0w2 = threadKey2 != null ? 1BK.A0w(threadKey2) : null;
                        String A175 = AbF.A17(threadSummary2);
                        InboxTrackableItem inboxTrackableItem2 = hideSuggestedChatsMenuItemImplementation.A02;
                        if (inboxTrackableItem2 != null) {
                            int i3 = inboxTrackableItem2.A02;
                            if (Integer.valueOf(i3) != null) {
                                map = 1BK.A1D("rank", String.valueOf(i3));
                                AbJ.A0O(bd52.A00).A04(new CommunityMessagingLoggerModel(null, null, A175, A0w2, A174, null, "hide_button", "cc_inbox_upsell_bottom_sheet", "cc_inbox_upsell_hide_all_clicked", "messenger_inbox", null, map));
                                r0.A09(str2, "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "onMenuItemSelected", andIncrement);
                                r0.A02((Exception) null, "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "onMenuItemSelected", andIncrement2);
                                return;
                            }
                        }
                        map = null;
                        AbJ.A0O(bd52.A00).A04(new CommunityMessagingLoggerModel(null, null, A175, A0w2, A174, null, "hide_button", "cc_inbox_upsell_bottom_sheet", "cc_inbox_upsell_hide_all_clicked", "messenger_inbox", null, map));
                        r0.A09(str2, "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "onMenuItemSelected", andIncrement);
                        r0.A02((Exception) null, "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "onMenuItemSelected", andIncrement2);
                        return;
                    }
                    r0.A02((Exception) null, "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "onMenuItemSelected", andIncrement2);
                } catch (Throwable th) {
                    r0.A04((Exception) null, str, "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "onMenuItemSelected", i);
                    throw th;
                }
            } catch (Throwable th2) {
                r0.A02((Exception) null, "messaging.threadlist.threadmenuitem.ThreadMenuItemInterfaceSpec", "onMenuItemSelected", andIncrement2);
                throw th2;
            }
        } catch (Exception e) {
            throw e;
        }
    }
}
