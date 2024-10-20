package X;

import android.content.Context;
import android.content.DialogInterface;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;

/* renamed from: X.9yd, reason: invalid class name */
/* loaded from: 9yd.class */
public final class C9yd implements C5ww {
    public final /* synthetic */ 2SP A00;
    public final /* synthetic */ C9cs A01;

    public C9yd(2SP r302, C9cs c9cs) {
        this.A00 = r302;
        this.A01 = c9cs;
    }

    public static long A00(Object obj, java.util.Map map) {
        return LDm.A01(LDm.A06((JsonElement) 02K.A03(obj, map)));
    }

    public static final String A01(JsonObject jsonObject) {
        String valueOf = String.valueOf(A00("thread_id", jsonObject));
        if (11T.A0O(valueOf, ConstantsKt.CAMERA_ID_FRONT)) {
            return null;
        }
        return 0Pz.A0W("COMMUNITY_CHANNEL:", valueOf);
    }

    public static final void A02(Context context) {
        MigColorScheme A0c = 7zR.A0c(context);
        1Bn.A0A(67527);
        DR6 A01 = C5ic.A01(context, A0c);
        A01.A00(2131958488);
        A01.A06(2131958487);
        A01.A0C(new DialogInterface.OnClickListener() { // from class: X.9o2
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        }, 2131958486);
        7zN.A13(A01);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x0538, code lost:
    
        r0 = com.facebook.messaging.model.threadkey.ThreadKey.A0K(A01(r0), true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0541, code lost:
    
        if (r0 == null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0544, code lost:
    
        r0 = X.AlU.A0g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x054e, code lost:
    
        r0 = new X.C3R9();
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x055a, code lost:
    
        r0.A01(com.facebook.messaging.data.communitymessaging.memberlist.model.CommunityMemberListSource.A0L);
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0572, code lost:
    
        r0.A01(new com.facebook.messaging.communitymessaging.memberlist.extradata.RequestToJoinChatInfo(com.facebook.messaging.communitymessaging.memberlist.extradata.RequestToJoinVersion.A03));
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x058b, code lost:
    
        r0.A01(r0, X.1F9.A0B, r0, r0.A00());
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x05a7, code lost:
    
        if (((X.2RU) X.1Br.A0B(r0)).A00() == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x05b6, code lost:
    
        r0 = (X.C8q) X.1Bi.A03(82449);
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x05d2, code lost:
    
        r0 = (kotlinx.serialization.json.JsonElement) r0.get(X.DKB.A00(518));
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x05db, code lost:
    
        if (r0 == null) goto L200;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x05ff, code lost:
    
        r308 = java.lang.Long.valueOf(new X.5Z0(X.LDm.A06(r0).A00()).A08());
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0609, code lost:
    
        r308 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0613, code lost:
    
        r308 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x0504, code lost:
    
        if (r0.equals(r308) == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x0e25, code lost:
    
        if (r0.equals(r308) != false) goto L607;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x0e3b, code lost:
    
        if (r0.equals("msgr_e2ee_message_reminder") == false) goto L631;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x0e52, code lost:
    
        r313 = X.02K.A03(X.1BJ.A00(56), r0).toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x0e59, code lost:
    
        r317 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x0eb5, code lost:
    
        X.1Br.A0D(X.9F7.A00, X.AC8.A00(r0, 29), ((X.CNa) X.1Bn.A0E(r0, (X.1BY) null, 82461)).A03(r0, X.7zN.A0d(new X.1Kh(), r313), X.7zO.A1Y(r317)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x0ecb, code lost:
    
        r313 = X.02K.A03("target_user_id", r0).toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x0ed2, code lost:
    
        r317 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x051a, code lost:
    
        if (r0.equals("messenger_community_chat_join_request_added_batched") == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x0768, code lost:
    
        if (r0.equals("messenger_community_channel_creation") == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x0b7d, code lost:
    
        r0 = (X.CQc) X.1Bn.A0E(r0, (X.1BY) null, 83316);
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x0b90, code lost:
    
        r0 = (X.2RU) X.1Bn.A0A(66548);
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x0b9c, code lost:
    
        r0 = new android.content.Intent();
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x0bbe, code lost:
    
        r0.putExtra("thread_key", com.facebook.messaging.model.threadkey.ThreadKey.A03(A00("thread_id", r0)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x0bdd, code lost:
    
        r0.putExtra("community_id", java.lang.String.valueOf(A00("community_id", r0)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:308:0x0bfc, code lost:
    
        r0.putExtra("group_id", java.lang.String.valueOf(A00("group_id", r0)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:311:0x0c10, code lost:
    
        r0 = (kotlinx.serialization.json.JsonElement) r0.get(com.mapbox.mapboxsdk.style.layers.Property.SYMBOL_Z_ORDER_SOURCE);
     */
    /* JADX WARN: Code restructure failed: missing block: B:313:0x0c19, code lost:
    
        if (r0 == null) goto L504;
     */
    /* JADX WARN: Code restructure failed: missing block: B:315:0x0c23, code lost:
    
        r311 = X.LDm.A06(r0).A00();
     */
    /* JADX WARN: Code restructure failed: missing block: B:317:0x0c2c, code lost:
    
        if (r311 != null) goto L505;
     */
    /* JADX WARN: Code restructure failed: missing block: B:319:0x0c38, code lost:
    
        r0.putExtra(com.mapbox.mapboxsdk.style.layers.Property.SYMBOL_Z_ORDER_SOURCE, r311);
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x0c52, code lost:
    
        r0 = (kotlinx.serialization.json.JsonElement) r0.get(X.AbstractC00603o4.A00(76));
     */
    /* JADX WARN: Code restructure failed: missing block: B:326:0x0c5b, code lost:
    
        if (r0 == null) goto L580;
     */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x0c65, code lost:
    
        r0 = X.LDm.A02(X.LDm.A06(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x0c6e, code lost:
    
        if (r0 == null) goto L580;
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x0c71, code lost:
    
        r324 = r0.booleanValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:335:0x0c8d, code lost:
    
        r0.putExtra(X.AbE.A00(91), !r324);
     */
    /* JADX WARN: Code restructure failed: missing block: B:339:0x0ca3, code lost:
    
        if (r0.equals("messenger_community_channel_creation") != false) goto L531;
     */
    /* JADX WARN: Code restructure failed: missing block: B:343:0x0cb6, code lost:
    
        if (r0.equals("messenger_community_admin_direct_invite_generic") == false) goto L557;
     */
    /* JADX WARN: Code restructure failed: missing block: B:350:0x0d68, code lost:
    
        r0.A08(r0, r0, (android.view.ViewGroup) r0, r0, r0, new X.C9tg(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:354:0x0d76, code lost:
    
        if (r0.A00() == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:355:0x0d79, code lost:
    
        r311 = A01(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x0d87, code lost:
    
        r0 = X.1BK.A0o(r0, X.9F6.A00);
     */
    /* JADX WARN: Code restructure failed: missing block: B:360:0x0d90, code lost:
    
        if (r0 == null) goto L581;
     */
    /* JADX WARN: Code restructure failed: missing block: B:361:0x0d93, code lost:
    
        r317 = r0.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:364:0x0cc7, code lost:
    
        r0 = (kotlinx.serialization.json.JsonElement) r0.get("landing_behavior");
     */
    /* JADX WARN: Code restructure failed: missing block: B:366:0x0cd0, code lost:
    
        if (r0 == null) goto L577;
     */
    /* JADX WARN: Code restructure failed: missing block: B:368:0x0cda, code lost:
    
        r0 = X.LDm.A03(X.LDm.A06(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:370:0x0ce3, code lost:
    
        if (r0 == null) goto L577;
     */
    /* JADX WARN: Code restructure failed: missing block: B:371:0x0ce6, code lost:
    
        r307 = r0.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:375:0x0cfd, code lost:
    
        r0.putExtra(X.4YT.A00(com.facebook.acra.constants.ActionId.BEGIN_START_ACTIVITY), r307);
     */
    /* JADX WARN: Code restructure failed: missing block: B:378:0x0d11, code lost:
    
        r0 = (kotlinx.serialization.json.JsonElement) r0.get("thread_type");
     */
    /* JADX WARN: Code restructure failed: missing block: B:380:0x0d1a, code lost:
    
        if (r0 == null) goto L576;
     */
    /* JADX WARN: Code restructure failed: missing block: B:382:0x0d24, code lost:
    
        r0 = X.LDm.A03(X.LDm.A06(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:384:0x0d2d, code lost:
    
        if (r0 == null) goto L576;
     */
    /* JADX WARN: Code restructure failed: missing block: B:385:0x0d30, code lost:
    
        r324 = r0.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:387:0x0d3b, code lost:
    
        r0.putExtra("thread_type", r324);
     */
    /* JADX WARN: Code restructure failed: missing block: B:388:0x0d9d, code lost:
    
        r324 = 19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:390:0x0da9, code lost:
    
        r307 = X.BM8.A05.intValue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:391:0x0db3, code lost:
    
        r324 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:392:0x0c2f, code lost:
    
        r311 = "jewel_notif";
     */
    /* JADX WARN: Code restructure failed: missing block: B:398:0x0784, code lost:
    
        if (r0.equals(X.1BJ.A00(96)) == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:439:0x0848, code lost:
    
        if (r0.equals(r308) == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x030d, code lost:
    
        if (r309 == null) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:528:0x09f8, code lost:
    
        if (r0.equals(X.1BJ.A00(481)) == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:532:0x0a0e, code lost:
    
        if (r0.equals("messenger_community_level_direct_invite_v2") == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:534:0x0a57, code lost:
    
        X.1Bn.A0A(67257);
     */
    /* JADX WARN: Code restructure failed: missing block: B:537:0x0a69, code lost:
    
        r0 = (X.2RU) X.1Bn.A0A(66548);
     */
    /* JADX WARN: Code restructure failed: missing block: B:543:0x0aa1, code lost:
    
        r0 = new X.C9mb(r0, r0, X.EnumC3499Mfu.A0Y, null, null, null, X.AVD.A01(r0, 18));
     */
    /* JADX WARN: Code restructure failed: missing block: B:546:0x0ab4, code lost:
    
        r311 = java.lang.String.valueOf(A00("community_id", r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:549:0x0ac9, code lost:
    
        r0 = java.lang.String.valueOf(A00("group_id", r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:552:0x0add, code lost:
    
        r0 = (kotlinx.serialization.json.JsonElement) r0.get("thread_id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:554:0x0ae6, code lost:
    
        if (r0 == null) goto L582;
     */
    /* JADX WARN: Code restructure failed: missing block: B:556:0x0af0, code lost:
    
        r0 = X.LDm.A01(X.LDm.A06(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:558:0x0b03, code lost:
    
        if (r0 == 0) goto L582;
     */
    /* JADX WARN: Code restructure failed: missing block: B:561:0x0b1f, code lost:
    
        r0.A06(r0, r311, java.lang.String.valueOf(r0), r0, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:565:0x0b2d, code lost:
    
        if (r0.A00() == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:566:0x0b30, code lost:
    
        r0 = A01(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:570:0x0b43, code lost:
    
        r0 = X.1BK.A0o("messenger_community_admin_direct_invite_generic", X.9F6.A00);
     */
    /* JADX WARN: Code restructure failed: missing block: B:572:0x0b4c, code lost:
    
        if (r0 == null) goto L471;
     */
    /* JADX WARN: Code restructure failed: missing block: B:573:0x0b4f, code lost:
    
        r317 = r0.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:575:0x0b5a, code lost:
    
        r0.A01(r0, r317);
     */
    /* JADX WARN: Code restructure failed: missing block: B:576:0x0b62, code lost:
    
        r317 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:578:0x0dc8, code lost:
    
        r0.A05(r0, r311, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:582:0x0dd6, code lost:
    
        if (r0.A00() == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:586:0x0de5, code lost:
    
        r0 = X.1BK.A0o("messenger_community_level_direct_invite_v2", X.9F6.A00);
     */
    /* JADX WARN: Code restructure failed: missing block: B:588:0x0dee, code lost:
    
        if (r0 == null) goto L581;
     */
    /* JADX WARN: Code restructure failed: missing block: B:589:0x0df1, code lost:
    
        r317 = r0.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:600:0x0a4c, code lost:
    
        if (X.LDm.A08(X.LDm.A06((kotlinx.serialization.json.JsonElement) X.02K.A03("is_smc", r0))) != false) goto L428;
     */
    /* JADX WARN: Code restructure failed: missing block: B:604:0x0e14, code lost:
    
        if (r0.equals(r308) == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x044a, code lost:
    
        if (r0.equals("messenger_community_chat_join_request_added_single_requester") == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0528, code lost:
    
        r0 = X.1Bu.A00(66548);
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:25:0x0218. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:608:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:611:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:614:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:619:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:621:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:622:0x01dc  */
    @Override // X.C5ww
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onClick(android.view.View r302) {
        /*
            Method dump skipped, instructions count: 3812
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9yd.onClick(android.view.View):void");
    }
}
