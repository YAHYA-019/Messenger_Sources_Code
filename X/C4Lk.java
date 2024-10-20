package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.inject.FbInjector;
import com.facebook.messaging.navigation.home.drawer.model.CommunityDrawerFolderKey;
import com.facebook.messaging.navigation.home.drawer.model.DiscoverPublicChannelsDrawerFolderKey;
import com.facebook.messaging.navigation.home.drawer.model.DrawerFolderKey;
import com.facebook.messaging.navigation.home.drawer.model.DrawerSnippetInfo;
import com.facebook.messaging.navigation.home.drawer.model.FolderNameDrawerFolderKey;
import com.facebook.messaging.navigation.home.drawer.model.PublicChannelsInvitesDrawerFolderKey;
import com.facebook.messaging.navigation.home.drawer.model.SpecialDrawerFolderKey;
import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;
import com.facebook.xapp.messaging.map.HeterogeneousMap;
import com.mapbox.mapboxsdk.style.layers.Property;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.4Lk, reason: invalid class name */
/* loaded from: 4Lk.class */
public final class C4Lk implements 2YE {
    public final java.util.Map A05 = 04R.A0G();
    public final 1Br A01 = 1Bq.A00(16634);
    public final 1Br A00 = 1Bq.A00(66481);
    public final 1Br A03 = 1Bq.A00(68133);
    public final 1Br A02 = 1Bq.A00(82490);
    public final C4Ll A04 = new C4Ll();

    public static final String A00(DrawerFolderKey drawerFolderKey) {
        if (drawerFolderKey instanceof FolderNameDrawerFolderKey) {
            1F9 r0 = ((FolderNameDrawerFolderKey) drawerFolderKey).A00;
            BUm bUm = BUm.$redex_init_class;
            int ordinal = r0.ordinal();
            return ordinal != 1 ? ordinal != 4 ? ordinal == 2 ? "message_requests" : "inbox_ia_screen" : DKB.A00(78) : "chats";
        }
        if (drawerFolderKey instanceof CommunityDrawerFolderKey) {
            return "community";
        }
        if (drawerFolderKey instanceof DiscoverPublicChannelsDrawerFolderKey) {
            return 1BJ.A00(231);
        }
        if (drawerFolderKey instanceof PublicChannelsInvitesDrawerFolderKey) {
            return "public_channel_invites";
        }
        if (!(drawerFolderKey instanceof SpecialDrawerFolderKey)) {
            return "inbox_ia_screen";
        }
        BUm bUm2 = BUm.$redex_init_class;
        return "marketplace";
    }

    public static final LinkedHashMap A01(FbUserSession fbUserSession, C4Mh c4Mh) {
        String str;
        LinkedHashMap A0A = 04R.A0A(new 03Y[]{new 03Y("left_nav", "2")});
        1Br A01 = 1Lm.A01(fbUserSession, 33174);
        DrawerFolderKey drawerFolderKey = c4Mh.A02;
        boolean z = drawerFolderKey instanceof CommunityDrawerFolderKey;
        if (z) {
            11T.A0I(drawerFolderKey, "null cannot be cast to non-null type com.facebook.messaging.navigation.home.drawer.model.CommunityDrawerFolderKey");
            CommunityDrawerFolderKey communityDrawerFolderKey = (CommunityDrawerFolderKey) drawerFolderKey;
            long j = communityDrawerFolderKey.A00;
            A0A.put("community_id", String.valueOf(j));
            String str2 = communityDrawerFolderKey.A01;
            A0A.put("group_id", str2);
            boolean A03 = 6EX.A03(str2);
            Object obj = ConstantsKt.CAMERA_ID_FRONT;
            if (A03) {
                obj = ConstantsKt.CAMERA_ID_BACK;
            }
            A0A.put("is_smc", obj);
            C00i c00i = A01.A00;
            A0A.put("user_type", (((22F) c00i.get()).A00(9, j) && ((22F) c00i.get()).A00(12, j)) ? "admod" : AnonymousClass000.A00(ActionId.TIMEOUT));
        }
        if (z) {
            HeterogeneousMap heterogeneousMap = c4Mh.A03;
            AnonymousClass207 anonymousClass207 = C4Me.A01;
            C4Me c4Me = (C4Me) heterogeneousMap.A00(anonymousClass207);
            if (c4Me == null || c4Me.A00 == null) {
                A0A.put("has_new_badge", ConstantsKt.CAMERA_ID_FRONT);
            } else {
                C4Me c4Me2 = (C4Me) heterogeneousMap.A00(anonymousClass207);
                boolean A0O = 11T.A0O(c4Me2 != null ? c4Me2.A00 : null, FbInjector.A03.getString(2131962078));
                Object obj2 = ConstantsKt.CAMERA_ID_FRONT;
                if (A0O) {
                    obj2 = ConstantsKt.CAMERA_ID_BACK;
                }
                A0A.put("has_new_badge", obj2);
                Integer num = c4Mh.A04;
                if (num != null) {
                    int intValue = num.intValue();
                    if (intValue != 0) {
                        str = intValue > 0 ? "member_new_badge" : "new_community_badge";
                    }
                    A0A.put(str, ConstantsKt.CAMERA_ID_BACK);
                }
            }
        }
        Integer num2 = c4Mh.A04;
        if (num2 == null || num2.intValue() != 0) {
            A0A.put("has_chats", ConstantsKt.CAMERA_ID_BACK);
        } else {
            A0A.put("has_chats", ConstantsKt.CAMERA_ID_FRONT);
        }
        List list = c4Mh.A06;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj3 : list) {
                DrawerSnippetInfo drawerSnippetInfo = (DrawerSnippetInfo) obj3;
                if (drawerSnippetInfo.A02 && drawerSnippetInfo.A00 == 0S2.A0Y) {
                    arrayList.add(obj3);
                }
            }
            if (!arrayList.isEmpty()) {
                A0A.put("pending_member_requests", ConstantsKt.CAMERA_ID_BACK);
            }
        }
        return A0A;
    }

    public static final void A02(C4Lk c4Lk, String str, String str2, String str3, String str4, java.util.Map map, long j) {
        1UG A00 = 1UD.A00((04J) c4Lk.A01.A00.get(), 1ZG.A01, "messengerinboxfolderaction");
        if (A00.isSampled()) {
            A00.A7R("action", str);
            A00.A7R("event", str3);
            A00.A6J("extra", map);
            A00.A6H("business_account_user", 0L);
            A00.A6H("multiple_account_user", 0L);
            A00.A6H("marketplace_user", 0L);
            A00.A6H("badge_count", Long.valueOf(j));
            A00.A7R(Property.SYMBOL_Z_ORDER_SOURCE, str2);
            A00.A7R("surface", "messenger");
            A00.A7R("folder", str4);
            A00.BZL();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x03cf, code lost:
    
        if (r0.intValue() == 0) goto L80;
     */
    /* JADX WARN: Removed duplicated region for block: B:90:0x032e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void Bbs(java.util.Collection r302) {
        /*
            Method dump skipped, instructions count: 2007
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4Lk.Bbs(java.util.Collection):void");
    }
}
