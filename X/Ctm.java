package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.inject.FbInjector;
import com.facebook.messaging.model.share.Share;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.rtc.meetups.speakeasy.model.SpeakeasyShareSheetModel;
import com.facebook.messaging.sharing.broadcastflow.intent.model.BroadcastFlowIntentModel;
import com.facebook.messaging.sharing.broadcastflow.intent.model.FacebookStoryIntentModel;
import com.facebook.messaging.sharing.broadcastflow.model.SendButtonStates;
import com.facebook.messaging.sharing.broadcastflow.model.SendState;
import com.facebook.messaging.sharing.broadcastflow.model.rooms.SpeakeasyRoomShareIntentModel;
import com.facebook.user.model.User;
import com.facebook.user.model.UserKey;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;

/* loaded from: Ctm.class */
public final class Ctm implements DIq {
    public 1BY A00;
    public final FbUserSession A01;
    public final C00i A03;
    public final C00i A0C;
    public final DFu A0D;
    public final DHY A0E;
    public final DJZ A0F;
    public final DIY A0G;
    public final CMa A0H;
    public final C00i A0L;
    public final Set A0I = AbI.A07();
    public final C00i A0A = 1BV.A01((1BY) null, 147752);
    public final C00i A0M = AbH.A0F();
    public final C00i A0K = 1BV.A01((1BY) null, 148143);
    public final C00i A04 = AbH.A0K();
    public final C00i A08 = 1BV.A01((1BY) null, 16979);
    public final C00i A06 = 1BV.A01((1BY) null, 83899);
    public final C00i A02 = 1BV.A01((1BY) null, 83118);
    public final C00i A09 = FbInjector.A00;
    public final C00i A0B = 1BQ.A02(82310);
    public final C00i A05 = 1BQ.A02(82689);
    public final C00i A07 = AbF.A0Q(FbInjector.A03, 83898);
    public final C00i A0J = 1BQ.A02(83793);

    public Ctm(FbUserSession fbUserSession, 1BO r303, DFu dFu, DHY dhy, DJZ djz, DIY diy) {
        this.A00 = 7zL.A0Q(r303);
        Context A03 = AbI.A03((1BY) null);
        C1F6 c1f6 = (C1F6) 1Bn.A0E((Context) null, (1BY) null, 914);
        this.A0C = AbF.A0Q(A03, 50024);
        this.A03 = 1BV.A01((1BY) null, 67527);
        this.A0L = AbF.A0B(fbUserSession, (1BY) null, 84148);
        Bn5 bn5 = new Bn5(fbUserSession, this);
        Context A01 = FbInjector.A01();
        AbL.A0y(c1f6);
        try {
            CMa cMa = new CMa(c1f6, bn5);
            1Bn.A0K();
            FbInjector.A04(A01);
            this.A0H = cMa;
            this.A0D = dFu;
            this.A0F = djz;
            this.A0E = dhy;
            this.A0G = diy;
            this.A01 = fbUserSession;
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A01);
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0115, code lost:
    
        if (r303 != com.facebook.messaging.sharing.broadcastflow.model.SendState.OPEN) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0133, code lost:
    
        if (r303 != com.facebook.messaging.sharing.broadcastflow.model.SendState.SEND) goto L39;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0035. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A00(com.facebook.messaging.model.threadkey.ThreadKey r302, com.facebook.messaging.sharing.broadcastflow.model.SendState r303) {
        /*
            Method dump skipped, instructions count: 1355
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ctm.A00(com.facebook.messaging.model.threadkey.ThreadKey, com.facebook.messaging.sharing.broadcastflow.model.SendState):boolean");
    }

    @Override // X.DIq
    public void A7J(Bhv bhv) {
        AbI.A1N(this.A04);
        this.A0I.add(bhv);
    }

    @Override // X.DIq
    public void AEJ(ThreadKey threadKey) {
        BroadcastFlowIntentModel A00 = BWB.A00(this.A0E.Arf(), "undoMessageSend");
        if (A00 instanceof SpeakeasyRoomShareIntentModel) {
            CPV cpv = (CPV) this.A0L.get();
            SpeakeasyRoomShareIntentModel speakeasyRoomShareIntentModel = (SpeakeasyRoomShareIntentModel) A00;
            Bxd bxd = new Bxd();
            bxd.A06 = "undo";
            SpeakeasyShareSheetModel speakeasyShareSheetModel = speakeasyRoomShareIntentModel.A00;
            bxd.A03 = speakeasyShareSheetModel.A0D;
            bxd.A02 = speakeasyShareSheetModel.A00;
            bxd.A01 = BOd.A06;
            cpv.A05(new RUQ(bxd));
        }
        CMa cMa = this.A0H;
        FbUserSession fbUserSession = this.A01;
        Bn5 bn5 = cMa.A09;
        if (bn5.A01.A00(threadKey, SendState.CALL)) {
            ((IFc) 1Lo.A04((Context) null, fbUserSession, cMa.A00, 67965)).A0G(1BK.A0w(threadKey), "incall_invitation_broadcast_flow");
            C3e8 c3e8 = (C3e8) cMa.A04.get(threadKey);
            if (c3e8 != null) {
                c3e8.cancel(true);
            }
        }
    }

    @Override // X.DIq
    public void CWP(ThreadKey threadKey, User user) {
        if (!threadKey.A12() && !threadKey.A1F() && !threadKey.A1A()) {
            if (user == null) {
                UserKey A0L = ThreadKey.A0L(threadKey);
                A0L.getClass();
                ((AnonymousClass472) 7zL.A0R(1BK.A04(this.A09), 67579).get()).A00(A0L).A01(new Cjs(this, threadKey, 2));
                return;
            } else {
                try {
                    ((6HS) this.A0C.get()).A07((ThreadKey) ((CNa) 1Bn.A0E(1BK.A04(this.A09), (1BY) null, 82461)).A03(this.A01, user, false).get(), "broadcast_flow");
                    return;
                } catch (InterruptedException | ExecutionException e) {
                    0fH.A0w("SendButtonStateEnvironment", "Getting thread key failed", e);
                }
            }
        }
        ((6HS) this.A0C.get()).A07(threadKey, "broadcast_flow");
    }

    @Override // X.DIq
    public void Cf9(Bhv bhv) {
        AbI.A1N(this.A04);
        this.A0I.remove(bhv);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0668, code lost:
    
        if ((r0 instanceof com.facebook.messaging.sharing.broadcastflow.intent.model.MediaShareIntentModel) == false) goto L105;
     */
    @Override // X.DIq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void Cjk(android.view.View r302, X.1Kq r303, com.facebook.messaging.model.threadkey.ThreadKey r304, com.facebook.messaging.model.threads.ThreadSummary r305, com.facebook.messaging.sharing.broadcastflow.logging.BroadcastFlowMnetItem r306, com.facebook.messaging.sharing.broadcastflow.model.SendState r307, com.facebook.user.model.User r308, java.lang.String r309, boolean r310, boolean r311) {
        /*
            Method dump skipped, instructions count: 1986
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ctm.Cjk(android.view.View, X.1Kq, com.facebook.messaging.model.threadkey.ThreadKey, com.facebook.messaging.model.threads.ThreadSummary, com.facebook.messaging.sharing.broadcastflow.logging.BroadcastFlowMnetItem, com.facebook.messaging.sharing.broadcastflow.model.SendState, com.facebook.user.model.User, java.lang.String, boolean, boolean):void");
    }

    @Override // X.DIq
    public void D5d(ThreadKey threadKey) {
        C3e8 c3e8;
        BroadcastFlowIntentModel A00 = BWB.A00(this.A0E.Arf(), "undoMessageSend");
        if (A00 instanceof SpeakeasyRoomShareIntentModel) {
            CPV cpv = (CPV) this.A0L.get();
            SpeakeasyRoomShareIntentModel speakeasyRoomShareIntentModel = (SpeakeasyRoomShareIntentModel) A00;
            Bxd bxd = new Bxd();
            bxd.A06 = "undo";
            SpeakeasyShareSheetModel speakeasyShareSheetModel = speakeasyRoomShareIntentModel.A00;
            bxd.A03 = speakeasyShareSheetModel.A0D;
            bxd.A02 = speakeasyShareSheetModel.A00;
            bxd.A01 = BOd.A06;
            cpv.A05(new RUQ(bxd));
        }
        CCR ccr = (CCR) this.A06.get();
        FbUserSession fbUserSession = this.A01;
        Context context = this.A0D.getContext();
        context.getClass();
        11T.A0F(fbUserSession, 0);
        if (CO4.A01(A00)) {
            if (A00 == null) {
                throw AnonymousClass001.A0N("Required value was null.");
            }
            C8X A002 = CO4.A00(BOa.A02, A00, (Boolean) null);
            Share share = ((FacebookStoryIntentModel) A00).A00;
            CDz A003 = CDz.A00(context, ccr, A002);
            String str = share.A0E;
            if (str == null) {
                throw AnonymousClass001.A0N("Required value was null.");
            }
            1UG A08 = 1BK.A08(1Br.A02(A003.A01), "fb_sharing_event");
            if (A08.isSampled()) {
                ImmutableList.Builder builder = ImmutableList.builder();
                ImmutableList.builder();
                C8X c8x = A003.A02;
                Context context2 = A003.A00;
                EwV ewV = (EwV) 1Lm.A05(context2, fbUserSession, 98568);
                builder.m11011add((Object) c8x.A07);
                String str2 = c8x.A04;
                if (str2 == null) {
                    str2 = "";
                }
                1Lm.A05(context2, fbUserSession, 115360);
                A08.A7R("event_type", "tap");
                A08.A7R("navigation_chain", str);
                A08.A7R("sharing_session_id", c8x.A05);
                A08.A5c(c8x.A01, "sharing_component_name");
                A08.A5c(c8x.A00, "shareable_entity_audience");
                A08.A7h("sharing_component_names_displayed", 1Fj.A01(4YU.A0h()));
                A08.A7h("feed_tracking", builder.build());
                A08.A5H("is_link_sharing_url_used", (Boolean) null);
                A08.A7R("shareable_entity_fbid", str2);
                A08.A7R("receiver_account_fbid", (String) null);
                A08.A6H("receiver_absolute_index", (Long) null);
                A08.A7R("entry_point", "");
                A08.A5c((C07n) null, "sharing_component_variant");
                A08.A5c((C07n) null, "product_type");
                A08.A6H("receiver_count", (Long) null);
                A08.A7h("receiver_types", (List) null);
                A08.A5c((C07n) null, "sharing_component_variant_id");
                A08.A7R("offplatform_package_name", (String) null);
                A08.A5H("is_deselect", (Boolean) null);
                A08.A6H("off_platform_bounceback_start", (Long) null);
                A08.A6H("off_platform_bounceback_end", (Long) null);
                A08.A7R("downstream_share_session_id", (String) null);
                A08.A7R("downstream_share_session_origin_uri", (String) null);
                A08.A6H("downstream_share_session_start_time", (Long) null);
                A08.A6J("downstream_share_navigation_events_count", ewV.A01());
                A08.A5H("is_share_of_original_user_content", (Boolean) null);
                A08.A7R("creation_session_id", (String) null);
                A08.A7R("creation_entry_point", (String) null);
                A08.BZL();
            }
        }
        CMa cMa = this.A0H;
        if (!cMa.A09.A01.A00(threadKey, SendState.SEND) || (c3e8 = (C3e8) cMa.A04.get(threadKey)) == null) {
            return;
        }
        c3e8.cancel(true);
    }

    @Override // X.DIq
    public void D7Q(ThreadKey threadKey, SendState sendState, String str) {
        DJZ djz = this.A0F;
        SendButtonStates sendButtonStates = djz.Ay1().A0I;
        Bz9 Ay4 = djz.Ay4();
        Ay4.A0I = SendButtonStates.A00(threadKey, sendButtonStates, sendState);
        HashMap A0u = AnonymousClass001.A0u();
        if (djz.Ay1().A0Q != null) {
            A0u.putAll(djz.Ay1().A0Q);
        }
        ImmutableMap.Builder A0c = 1BK.A0c();
        if (A0u.containsKey(threadKey) && sendState != SendState.CHECKED) {
            A0u.remove(threadKey);
        } else if (sendState == SendState.CHECKED) {
            A0u.put(threadKey, str);
        }
        A0c.putAll(A0u);
        Ay4.A0Q = A0c.build();
        DJZ.A00(Ay4, djz);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.DIq
    public void D7t(Csv csv, Csw csw) {
        if (csv == null && csw == 0) {
            return;
        }
        DJZ djz = this.A0F;
        ImmutableList immutableList = djz.Ay1().A0M;
        ImmutableList.Builder builder = ImmutableList.builder();
        if (immutableList != null) {
            builder.addAll(immutableList);
        }
        if (csv == null) {
            csv = csw;
        }
        csv.getClass();
        builder.m11011add((Object) csv);
        Bz9 Ay4 = djz.Ay4();
        Ay4.A0M = builder.build();
        DJZ.A00(Ay4, djz);
    }
}
