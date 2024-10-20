package X;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.interstitial.triggers.InterstitialTrigger;
import com.facebook.interstitial.triggers.InterstitialTriggerContext;
import com.facebook.messaging.communitymessaging.plugins.adminactions.mutedmemberbanner.MutedMemberBannerImplementation;
import com.facebook.messaging.communitymessaging.plugins.adminactions.promotetomoderatorinvitationbanner.PromoteToModeratorInvitationBannerImplementation;
import com.facebook.messaging.communitymessaging.plugins.channellist.channellistondemandpromotionbanner.ChannelListOnDemandPromotionBannerImplementation;
import com.facebook.messaging.communitymessaging.plugins.channellist.channellistserverqpbanner.ChannelListServerPromotionBannerImplementation;
import com.facebook.messaging.communitymessaging.plugins.communitymessagingdisabling.communitymessagingdisablingbanner.CommunityMessagingDisablingBannerImplementation;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.quickpromotion.ondemand.OnDemandControllerManager;
import com.facebook.user.model.User;
import com.facebook.xapp.messaging.model.secondarydata.ParcelableSecondaryData;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.9rf, reason: invalid class name */
/* loaded from: 9rf.class */
public final class C9rf implements 2Wz {
    public MutedMemberBannerImplementation A00;
    public PromoteToModeratorInvitationBannerImplementation A01;
    public ChannelListOnDemandPromotionBannerImplementation A02;
    public ChannelListServerPromotionBannerImplementation A03;
    public CommunityMessagingDisablingBannerImplementation A04;
    public Object A05;
    public Object A06;
    public Object A07;
    public Object A08;
    public Object A09;
    public final Context A0A;
    public final 06Z A0B;
    public final LifecycleOwner A0C;
    public final FbUserSession A0D;
    public final 2S4 A0E;
    public final 2Ws A0F;
    public final 2Wv A0G;
    public final 1YC A0H = 1YC.A03;
    public final ParcelableSecondaryData A0I;

    public C9rf(Context context, 06Z r303, LifecycleOwner lifecycleOwner, FbUserSession fbUserSession, 2S4 r306, 2Ws r307, 2Wv r308, ParcelableSecondaryData parcelableSecondaryData) {
        this.A0A = context;
        this.A0F = r307;
        this.A0C = lifecycleOwner;
        this.A0B = r303;
        this.A0E = r306;
        this.A0G = r308;
        this.A0D = fbUserSession;
        this.A0I = parcelableSecondaryData;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x007c A[Catch: Exception -> 0x00cf, all -> 0x00db, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x00cf, blocks: (B:5:0x0041, B:6:0x0046, B:9:0x0052, B:12:0x005a, B:15:0x0075, B:17:0x00c8, B:20:0x007c, B:22:0x0089, B:24:0x008f, B:25:0x0094, B:28:0x009e, B:29:0x00a4, B:30:0x00a9, B:31:0x00af, B:33:0x00b9, B:34:0x00bf, B:35:0x00c3, B:35:0x00c3, B:38:0x0066), top: B:4:0x0041, outer: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A00() {
        /*
            Method dump skipped, instructions count: 285
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9rf.A00():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x007b A[Catch: Exception -> 0x0109, all -> 0x0117, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x0109, blocks: (B:5:0x0049, B:6:0x004e, B:9:0x005a, B:12:0x0062, B:15:0x007b, B:16:0x0081, B:18:0x0089, B:20:0x0090, B:21:0x0097, B:26:0x00b3, B:27:0x00b8, B:29:0x00c5, B:32:0x00d3, B:33:0x00d9, B:34:0x00de, B:35:0x00e4, B:37:0x00f2, B:38:0x00f8, B:39:0x00fd, B:39:0x00fd, B:42:0x0102, B:47:0x00ab, B:49:0x00ac, B:49:0x00ac, B:52:0x006f), top: B:4:0x0049, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A01() {
        /*
            Method dump skipped, instructions count: 348
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9rf.A01():boolean");
    }

    private boolean A02() {
        Object obj;
        if (this.A07 == null) {
            AtomicInteger atomicInteger = C1Y6.A04;
            int andIncrement = atomicInteger.getAndIncrement();
            1YC r0 = this.A0H;
            r0.A0B("com.facebook.messaging.communitymessaging.plugins.channellist.channellistondemandpromotionbanner.ChannelListOnDemandPromotionBannerImplementation", "messaging.communitymessaging.channellist.channellistondemandpromotionbanner.ChannelListOnDemandPromotionBannerImplementation", 1BJ.A00(5), "messaging.inbox.promotionbanner.PromotionBannerInterfaceSpec", 1BJ.A00(1), andIncrement);
            Exception exc = null;
            try {
                try {
                    if (C2pj.A01(r0, atomicInteger)) {
                        2Wv r02 = this.A0G;
                        11T.A0F(r02, 0);
                        if (r02.A00 == 1F9.A0B) {
                            this.A02 = new ChannelListOnDemandPromotionBannerImplementation(this.A0A, this.A0D, this.A0F, r02, this.A0I);
                            obj = C1Y6.A02;
                            this.A07 = obj;
                            r0.A07("messaging.communitymessaging.channellist.channellistondemandpromotionbanner.ChannelListOnDemandPromotionBannerImplementation", "messaging.inbox.promotionbanner.PromotionBannerInterfaceSpec", andIncrement, 1BL.A1U(obj));
                        }
                    }
                    obj = C1Y6.A03;
                    this.A07 = obj;
                    r0.A07("messaging.communitymessaging.channellist.channellistondemandpromotionbanner.ChannelListOnDemandPromotionBannerImplementation", "messaging.inbox.promotionbanner.PromotionBannerInterfaceSpec", andIncrement, 1BL.A1U(obj));
                } catch (Exception e) {
                    this.A07 = C1Y6.A03;
                    try {
                        throw e;
                    } catch (Throwable th) {
                        th = th;
                        exc = e;
                        r0.A03(exc, "messaging.communitymessaging.channellist.channellistondemandpromotionbanner.ChannelListOnDemandPromotionBannerImplementation", "messaging.inbox.promotionbanner.PromotionBannerInterfaceSpec", andIncrement, 1BL.A1U(this.A07));
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                r0.A03(exc, "messaging.communitymessaging.channellist.channellistondemandpromotionbanner.ChannelListOnDemandPromotionBannerImplementation", "messaging.inbox.promotionbanner.PromotionBannerInterfaceSpec", andIncrement, 1BL.A1U(this.A07));
                throw th;
            }
        }
        return 1BK.A1U(this.A07);
    }

    private boolean A03() {
        Object obj;
        if (this.A08 == null) {
            AtomicInteger atomicInteger = C1Y6.A04;
            int andIncrement = atomicInteger.getAndIncrement();
            1YC r0 = this.A0H;
            r0.A0B("com.facebook.messaging.communitymessaging.plugins.channellist.channellistserverqpbanner.ChannelListServerPromotionBannerImplementation", "messaging.communitymessaging.channellist.channellistserverqpbanner.ChannelListServerPromotionBannerImplementation", 1BJ.A00(5), "messaging.inbox.promotionbanner.PromotionBannerInterfaceSpec", 1BJ.A00(1), andIncrement);
            Exception exc = null;
            try {
                try {
                    if (C2pj.A01(r0, atomicInteger)) {
                        2Wv r02 = this.A0G;
                        11T.A0F(r02, 0);
                        if (r02.A00 == 1F9.A0B) {
                            this.A03 = new ChannelListServerPromotionBannerImplementation(this.A0A, this.A0D, this.A0E, this.A0F, r02, this.A0I);
                            obj = C1Y6.A02;
                            this.A08 = obj;
                            r0.A07("messaging.communitymessaging.channellist.channellistserverqpbanner.ChannelListServerPromotionBannerImplementation", "messaging.inbox.promotionbanner.PromotionBannerInterfaceSpec", andIncrement, 1BL.A1U(obj));
                        }
                    }
                    obj = C1Y6.A03;
                    this.A08 = obj;
                    r0.A07("messaging.communitymessaging.channellist.channellistserverqpbanner.ChannelListServerPromotionBannerImplementation", "messaging.inbox.promotionbanner.PromotionBannerInterfaceSpec", andIncrement, 1BL.A1U(obj));
                } catch (Exception e) {
                    this.A08 = C1Y6.A03;
                    try {
                        throw e;
                    } catch (Throwable th) {
                        th = th;
                        exc = e;
                        r0.A03(exc, "messaging.communitymessaging.channellist.channellistserverqpbanner.ChannelListServerPromotionBannerImplementation", "messaging.inbox.promotionbanner.PromotionBannerInterfaceSpec", andIncrement, 1BL.A1U(this.A08));
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                r0.A03(exc, "messaging.communitymessaging.channellist.channellistserverqpbanner.ChannelListServerPromotionBannerImplementation", "messaging.inbox.promotionbanner.PromotionBannerInterfaceSpec", andIncrement, 1BL.A1U(this.A08));
                throw th;
            }
        }
        return 1BK.A1U(this.A08);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00c8 A[Catch: Exception -> 0x0144, all -> 0x0152, TRY_ENTER, TRY_LEAVE, TryCatch #4 {Exception -> 0x0144, blocks: (B:5:0x0041, B:6:0x0046, B:9:0x0052, B:12:0x005a, B:15:0x00c1, B:17:0x0126, B:19:0x00c8, B:21:0x00d5, B:23:0x00db, B:24:0x00e0, B:27:0x00ea, B:30:0x00f4, B:31:0x00fa, B:32:0x0100, B:33:0x0106, B:34:0x010b, B:36:0x0117, B:37:0x011d, B:38:0x0121, B:38:0x0121, B:40:0x0063, B:45:0x00af, B:45:0x00af, B:47:0x00b3, B:48:0x0072, B:50:0x0082, B:60:0x00aa, B:63:0x0132, B:65:0x013c, B:67:0x0143), top: B:4:0x0041, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A04() {
        /*
            Method dump skipped, instructions count: 402
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9rf.A04():boolean");
    }

    /*  JADX ERROR: Types fix failed
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:183)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:242)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
        */
    /* JADX WARN: Failed to calculate best type for var: r318v0 ??
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
    /* JADX WARN: Failed to calculate best type for var: r318v0 ??
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
    /* JADX WARN: Not initialized variable reg: 318, insn: 0x0966: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r318 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:458:0x095a */
    public X.1LI AYr(X.1Iw r302, com.facebook.mig.scheme.interfaces.MigColorScheme r303, java.lang.String r304) {
        /*
            Method dump skipped, instructions count: 2472
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9rf.AYr(X.1Iw, com.facebook.mig.scheme.interfaces.MigColorScheme, java.lang.String):X.1LI");
    }

    public boolean BQr(String str) {
        int andIncrement;
        String str2;
        String str3;
        String A00;
        AtomicInteger atomicInteger = C1Y6.A04;
        int andIncrement2 = atomicInteger.getAndIncrement();
        1YC r0 = this.A0H;
        String A002 = 1BJ.A00(5);
        r0.A08(A002, "messaging.inbox.promotionbanner.PromotionBannerInterfaceSpec", "isBannerSticky", andIncrement2);
        try {
            if (str.equals("cm_group_disabling_banner") && A04()) {
                andIncrement = atomicInteger.getAndIncrement();
                str3 = "messaging.communitymessaging.communitymessagingdisabling.communitymessagingdisablingbanner.CommunityMessagingDisablingBannerImplementation";
                r0.A0A("com.facebook.messaging.communitymessaging.plugins.communitymessagingdisabling.communitymessagingdisablingbanner.CommunityMessagingDisablingBannerImplementation", str3, A002, andIncrement, "messaging.inbox.promotionbanner.PromotionBannerInterfaceSpec", "com.facebook.messaging.communitymessaging.plugins.communitymessagingdisabling.CommunitymessagingCommunitymessagingdisablingKillSwitch", "isBannerSticky");
            } else if (str.equals(AbE.A00(ActionId.APP_WILL_ENTER_FOREGROUND)) && A01()) {
                andIncrement = atomicInteger.getAndIncrement();
                str3 = "messaging.communitymessaging.adminactions.promotetomoderatorinvitationbanner.PromoteToModeratorInvitationBannerImplementation";
                r0.A0A("com.facebook.messaging.communitymessaging.plugins.adminactions.promotetomoderatorinvitationbanner.PromoteToModeratorInvitationBannerImplementation", str3, A002, andIncrement, "messaging.inbox.promotionbanner.PromotionBannerInterfaceSpec", "com.facebook.messaging.communitymessaging.plugins.adminactions.CommunitymessagingAdminactionsKillSwitch", "isBannerSticky");
            } else if (str.equals("cm_channel_list_muted_member_banner") && A00()) {
                andIncrement = atomicInteger.getAndIncrement();
                str3 = "messaging.communitymessaging.adminactions.mutedmemberbanner.MutedMemberBannerImplementation";
                r0.A0A("com.facebook.messaging.communitymessaging.plugins.adminactions.mutedmemberbanner.MutedMemberBannerImplementation", str3, A002, andIncrement, "messaging.inbox.promotionbanner.PromotionBannerInterfaceSpec", "com.facebook.messaging.communitymessaging.plugins.adminactions.CommunitymessagingAdminactionsKillSwitch", "isBannerSticky");
            } else {
                if (str.equals("cm_channel_list_server_banner") && A03()) {
                    andIncrement = atomicInteger.getAndIncrement();
                    str2 = "com.facebook.messaging.communitymessaging.plugins.channellist.channellistserverqpbanner.ChannelListServerPromotionBannerImplementation";
                    str3 = "messaging.communitymessaging.channellist.channellistserverqpbanner.ChannelListServerPromotionBannerImplementation";
                    A00 = 1BJ.A00(1);
                } else {
                    if (!str.equals("cm_channel_list_on_demand_banner") || !A02()) {
                        r0.A02((Exception) null, "messaging.inbox.promotionbanner.PromotionBannerInterfaceSpec", "isBannerSticky", andIncrement2);
                        return false;
                    }
                    andIncrement = atomicInteger.getAndIncrement();
                    str2 = "com.facebook.messaging.communitymessaging.plugins.channellist.channellistondemandpromotionbanner.ChannelListOnDemandPromotionBannerImplementation";
                    str3 = "messaging.communitymessaging.channellist.channellistondemandpromotionbanner.ChannelListOnDemandPromotionBannerImplementation";
                    A00 = 1BJ.A00(1);
                }
                r0.A0A(str2, str3, A002, andIncrement, "messaging.inbox.promotionbanner.PromotionBannerInterfaceSpec", A00, "isBannerSticky");
            }
            r0.A09(str3, "messaging.inbox.promotionbanner.PromotionBannerInterfaceSpec", "isBannerSticky", andIncrement);
            return true;
        } finally {
            r0.A02((Exception) null, "messaging.inbox.promotionbanner.PromotionBannerInterfaceSpec", "isBannerSticky", andIncrement2);
        }
    }

    public void BsS(2Sg r302) {
        int andIncrement = C1Y6.A04.getAndIncrement();
        1YC r0 = this.A0H;
        r0.A08(1BJ.A00(5), "messaging.inbox.promotionbanner.PromotionBannerInterfaceSpec", "onDataChanged", andIncrement);
        r0.A06("messaging.inbox.promotionbanner.PromotionBannerInterfaceSpec", "onDataChanged", andIncrement);
    }

    public void D3I() {
        int andIncrement;
        String str;
        AtomicInteger atomicInteger = C1Y6.A04;
        int andIncrement2 = atomicInteger.getAndIncrement();
        1YC r0 = this.A0H;
        String A00 = 1BJ.A00(5);
        r0.A08(A00, "messaging.inbox.promotionbanner.PromotionBannerInterfaceSpec", "subscribe", andIncrement2);
        Exception e = null;
        try {
            if (A04()) {
                andIncrement = atomicInteger.getAndIncrement();
                str = "messaging.communitymessaging.communitymessagingdisabling.communitymessagingdisablingbanner.CommunityMessagingDisablingBannerImplementation";
                r0.A0A("com.facebook.messaging.communitymessaging.plugins.communitymessagingdisabling.communitymessagingdisablingbanner.CommunityMessagingDisablingBannerImplementation", str, A00, andIncrement, "messaging.inbox.promotionbanner.PromotionBannerInterfaceSpec", "com.facebook.messaging.communitymessaging.plugins.communitymessagingdisabling.CommunitymessagingCommunitymessagingdisablingKillSwitch", "subscribe");
                try {
                    try {
                        CommunityMessagingDisablingBannerImplementation communityMessagingDisablingBannerImplementation = this.A04;
                        ThreadKey threadKey = communityMessagingDisablingBannerImplementation.A0B.A01;
                        if (threadKey != null) {
                            LiveData A01 = ((C1284Aco) 1Lm.A05(communityMessagingDisablingBannerImplementation.A03, communityMessagingDisablingBannerImplementation.A06, 82370)).A01(threadKey);
                            communityMessagingDisablingBannerImplementation.A00 = A01;
                            if (A01 != null) {
                                A01.observeForever(communityMessagingDisablingBannerImplementation.A05);
                            }
                        }
                        r0.A09(str, "messaging.inbox.promotionbanner.PromotionBannerInterfaceSpec", "subscribe", andIncrement);
                    } catch (Exception e2) {
                        e = e2;
                        throw e;
                    }
                } catch (Throwable th) {
                    r0.A04(e, str, "messaging.inbox.promotionbanner.PromotionBannerInterfaceSpec", "subscribe", andIncrement);
                    throw th;
                }
            }
            if (A01()) {
                int andIncrement3 = atomicInteger.getAndIncrement();
                r0.A0A("com.facebook.messaging.communitymessaging.plugins.adminactions.promotetomoderatorinvitationbanner.PromoteToModeratorInvitationBannerImplementation", "messaging.communitymessaging.adminactions.promotetomoderatorinvitationbanner.PromoteToModeratorInvitationBannerImplementation", A00, andIncrement3, "messaging.inbox.promotionbanner.PromotionBannerInterfaceSpec", "com.facebook.messaging.communitymessaging.plugins.adminactions.CommunitymessagingAdminactionsKillSwitch", "subscribe");
                PromoteToModeratorInvitationBannerImplementation promoteToModeratorInvitationBannerImplementation = this.A01;
                ThreadKey threadKey2 = promoteToModeratorInvitationBannerImplementation.A09.A01;
                if (threadKey2 != null) {
                    LiveData A012 = ((C1284Aco) 1Br.A0B(((AdC) 1Br.A0B(promoteToModeratorInvitationBannerImplementation.A07)).A04)).A01(threadKey2);
                    promoteToModeratorInvitationBannerImplementation.A00 = A012;
                    if (A012 != null) {
                        A012.observeForever(promoteToModeratorInvitationBannerImplementation.A06);
                    }
                }
                r0.A09("messaging.communitymessaging.adminactions.promotetomoderatorinvitationbanner.PromoteToModeratorInvitationBannerImplementation", "messaging.inbox.promotionbanner.PromotionBannerInterfaceSpec", "subscribe", andIncrement3);
            }
            if (A00()) {
                int andIncrement4 = atomicInteger.getAndIncrement();
                r0.A0A("com.facebook.messaging.communitymessaging.plugins.adminactions.mutedmemberbanner.MutedMemberBannerImplementation", "messaging.communitymessaging.adminactions.mutedmemberbanner.MutedMemberBannerImplementation", A00, andIncrement4, "messaging.inbox.promotionbanner.PromotionBannerInterfaceSpec", "com.facebook.messaging.communitymessaging.plugins.adminactions.CommunitymessagingAdminactionsKillSwitch", "subscribe");
                MutedMemberBannerImplementation mutedMemberBannerImplementation = this.A00;
                ThreadKey threadKey3 = mutedMemberBannerImplementation.A06.A01;
                if (threadKey3 != null) {
                    LiveData A013 = ((C1284Aco) 1Br.A0B(((AdC) 1Br.A0B(mutedMemberBannerImplementation.A04)).A04)).A01(threadKey3);
                    mutedMemberBannerImplementation.A00 = A013;
                    if (A013 != null) {
                        A013.observeForever(mutedMemberBannerImplementation.A03);
                    }
                }
                r0.A09("messaging.communitymessaging.adminactions.mutedmemberbanner.MutedMemberBannerImplementation", "messaging.inbox.promotionbanner.PromotionBannerInterfaceSpec", "subscribe", andIncrement4);
            }
            if (A03()) {
                int andIncrement5 = atomicInteger.getAndIncrement();
                r0.A0A("com.facebook.messaging.communitymessaging.plugins.channellist.channellistserverqpbanner.ChannelListServerPromotionBannerImplementation", "messaging.communitymessaging.channellist.channellistserverqpbanner.ChannelListServerPromotionBannerImplementation", A00, andIncrement5, "messaging.inbox.promotionbanner.PromotionBannerInterfaceSpec", 1BJ.A00(1), "subscribe");
                ChannelListServerPromotionBannerImplementation channelListServerPromotionBannerImplementation = this.A03;
                InterstitialTrigger interstitialTrigger = 2bG.A00;
                11T.A0B(interstitialTrigger);
                ChannelListServerPromotionBannerImplementation.A00(channelListServerPromotionBannerImplementation.A05, interstitialTrigger, channelListServerPromotionBannerImplementation);
                ((C2bk) channelListServerPromotionBannerImplementation.A06.A00(66648)).A00 = new 9xF(channelListServerPromotionBannerImplementation);
                r0.A09("messaging.communitymessaging.channellist.channellistserverqpbanner.ChannelListServerPromotionBannerImplementation", "messaging.inbox.promotionbanner.PromotionBannerInterfaceSpec", "subscribe", andIncrement5);
            }
            if (A02()) {
                andIncrement = atomicInteger.getAndIncrement();
                str = "messaging.communitymessaging.channellist.channellistondemandpromotionbanner.ChannelListOnDemandPromotionBannerImplementation";
                r0.A0A("com.facebook.messaging.communitymessaging.plugins.channellist.channellistondemandpromotionbanner.ChannelListOnDemandPromotionBannerImplementation", str, A00, andIncrement, "messaging.inbox.promotionbanner.PromotionBannerInterfaceSpec", 1BJ.A00(1), "subscribe");
                ChannelListOnDemandPromotionBannerImplementation channelListOnDemandPromotionBannerImplementation = this.A02;
                OnDemandControllerManager onDemandControllerManager = (OnDemandControllerManager) 1Lm.A05(channelListOnDemandPromotionBannerImplementation.A00, channelListOnDemandPromotionBannerImplementation.A01, 99753);
                ParcelableSecondaryData parcelableSecondaryData = channelListOnDemandPromotionBannerImplementation.A04;
                String A002 = 3Gd.A00(parcelableSecondaryData);
                if (A002 == null || Long.parseLong(A002) <= 0) {
                    A002 = null;
                }
                ThreadKey threadKey4 = channelListOnDemandPromotionBannerImplementation.A03.A01;
                A29 a29 = new A29(threadKey4 != null ? 1BK.A0w(threadKey4) : null, A002, null);
                InterstitialTrigger interstitialTrigger2 = 2bG.A00;
                11T.A0B(interstitialTrigger2);
                HashMap A0u = AnonymousClass001.A0u();
                if (threadKey4 != null) {
                    String A0w = 1BK.A0w(threadKey4);
                    A0u.put("community_id", A0w);
                    A0u.put(4YT.A00(933), A0w);
                    String A003 = 3Gd.A00(parcelableSecondaryData);
                    if (A003 != null && Long.parseLong(A003) > 0) {
                        A0u.put("fb_group_id", A003);
                    }
                }
                User A0v = 7zQ.A0v();
                if (A0v != null) {
                    String str2 = A0v.A13;
                    if (str2 != null) {
                        A0u.put("user_id", str2);
                    }
                }
                InterstitialTrigger interstitialTrigger3 = new InterstitialTrigger(interstitialTrigger2, new InterstitialTriggerContext(A0u));
                ChannelListOnDemandPromotionBannerImplementation.A05 = interstitialTrigger3;
                onDemandControllerManager.A01(interstitialTrigger3, a29, new A2A(channelListOnDemandPromotionBannerImplementation, A002), EN5.A06);
                r0.A09(str, "messaging.inbox.promotionbanner.PromotionBannerInterfaceSpec", "subscribe", andIncrement);
            }
            r0.A02((Exception) null, "messaging.inbox.promotionbanner.PromotionBannerInterfaceSpec", "subscribe", andIncrement2);
        } catch (Throwable th2) {
            r0.A02(e, "messaging.inbox.promotionbanner.PromotionBannerInterfaceSpec", "subscribe", andIncrement2);
            throw th2;
        }
    }

    public void D6F() {
        int andIncrement;
        String str;
        AtomicInteger atomicInteger = C1Y6.A04;
        int andIncrement2 = atomicInteger.getAndIncrement();
        1YC r0 = this.A0H;
        String A00 = 1BJ.A00(5);
        r0.A08(A00, "messaging.inbox.promotionbanner.PromotionBannerInterfaceSpec", "unsubscribe", andIncrement2);
        Exception e = null;
        try {
            if (A04()) {
                andIncrement = atomicInteger.getAndIncrement();
                str = "messaging.communitymessaging.communitymessagingdisabling.communitymessagingdisablingbanner.CommunityMessagingDisablingBannerImplementation";
                r0.A0A("com.facebook.messaging.communitymessaging.plugins.communitymessagingdisabling.communitymessagingdisablingbanner.CommunityMessagingDisablingBannerImplementation", str, A00, andIncrement, "messaging.inbox.promotionbanner.PromotionBannerInterfaceSpec", "com.facebook.messaging.communitymessaging.plugins.communitymessagingdisabling.CommunitymessagingCommunitymessagingdisablingKillSwitch", "unsubscribe");
                try {
                    try {
                        CommunityMessagingDisablingBannerImplementation communityMessagingDisablingBannerImplementation = this.A04;
                        LiveData liveData = communityMessagingDisablingBannerImplementation.A00;
                        if (liveData != null) {
                            liveData.removeObserver(communityMessagingDisablingBannerImplementation.A05);
                        }
                        r0.A09(str, "messaging.inbox.promotionbanner.PromotionBannerInterfaceSpec", "unsubscribe", andIncrement);
                    } catch (Throwable th) {
                        r0.A04(e, str, "messaging.inbox.promotionbanner.PromotionBannerInterfaceSpec", "unsubscribe", andIncrement);
                        throw th;
                    }
                } catch (Exception e2) {
                    e = e2;
                    throw e;
                }
            }
            if (A01()) {
                int andIncrement3 = atomicInteger.getAndIncrement();
                r0.A0A("com.facebook.messaging.communitymessaging.plugins.adminactions.promotetomoderatorinvitationbanner.PromoteToModeratorInvitationBannerImplementation", "messaging.communitymessaging.adminactions.promotetomoderatorinvitationbanner.PromoteToModeratorInvitationBannerImplementation", A00, andIncrement3, "messaging.inbox.promotionbanner.PromotionBannerInterfaceSpec", "com.facebook.messaging.communitymessaging.plugins.adminactions.CommunitymessagingAdminactionsKillSwitch", "unsubscribe");
                PromoteToModeratorInvitationBannerImplementation promoteToModeratorInvitationBannerImplementation = this.A01;
                LiveData liveData2 = promoteToModeratorInvitationBannerImplementation.A00;
                if (liveData2 != null) {
                    liveData2.removeObserver(promoteToModeratorInvitationBannerImplementation.A06);
                }
                r0.A09("messaging.communitymessaging.adminactions.promotetomoderatorinvitationbanner.PromoteToModeratorInvitationBannerImplementation", "messaging.inbox.promotionbanner.PromotionBannerInterfaceSpec", "unsubscribe", andIncrement3);
            }
            if (A00()) {
                int andIncrement4 = atomicInteger.getAndIncrement();
                r0.A0A("com.facebook.messaging.communitymessaging.plugins.adminactions.mutedmemberbanner.MutedMemberBannerImplementation", "messaging.communitymessaging.adminactions.mutedmemberbanner.MutedMemberBannerImplementation", A00, andIncrement4, "messaging.inbox.promotionbanner.PromotionBannerInterfaceSpec", "com.facebook.messaging.communitymessaging.plugins.adminactions.CommunitymessagingAdminactionsKillSwitch", "unsubscribe");
                MutedMemberBannerImplementation mutedMemberBannerImplementation = this.A00;
                LiveData liveData3 = mutedMemberBannerImplementation.A00;
                if (liveData3 != null) {
                    liveData3.removeObserver(mutedMemberBannerImplementation.A03);
                }
                r0.A09("messaging.communitymessaging.adminactions.mutedmemberbanner.MutedMemberBannerImplementation", "messaging.inbox.promotionbanner.PromotionBannerInterfaceSpec", "unsubscribe", andIncrement4);
            }
            if (A03()) {
                andIncrement = atomicInteger.getAndIncrement();
                str = "messaging.communitymessaging.channellist.channellistserverqpbanner.ChannelListServerPromotionBannerImplementation";
                r0.A0A("com.facebook.messaging.communitymessaging.plugins.channellist.channellistserverqpbanner.ChannelListServerPromotionBannerImplementation", str, A00, andIncrement, "messaging.inbox.promotionbanner.PromotionBannerInterfaceSpec", 1BJ.A00(1), "unsubscribe");
                ((C2bk) this.A03.A06.A00(66648)).A00 = null;
                r0.A09(str, "messaging.inbox.promotionbanner.PromotionBannerInterfaceSpec", "unsubscribe", andIncrement);
            }
            r0.A02((Exception) null, "messaging.inbox.promotionbanner.PromotionBannerInterfaceSpec", "unsubscribe", andIncrement2);
        } catch (Throwable th2) {
            r0.A02(e, "messaging.inbox.promotionbanner.PromotionBannerInterfaceSpec", "unsubscribe", andIncrement2);
            throw th2;
        }
    }
}
