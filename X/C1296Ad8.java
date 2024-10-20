package X;

import android.content.Context;
import android.content.Intent;
import com.facebook.messaging.communitymessaging.analytics.CommunityMessagingLoggerModel;
import com.facebook.messaging.communitymessaging.notify.analytics.CommunityMessagingNotificationsLoggerModel;
import com.mapbox.mapboxsdk.style.layers.Property;

/* renamed from: X.Ad8, reason: case insensitive filesystem */
/* loaded from: Ad8.class */
public final class C1296Ad8 {
    public final 1Br A00 = 1BK.A0D();

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x000a. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:194:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0476  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x02b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final X.BOr A00(java.lang.String r301) {
        /*
            Method dump skipped, instructions count: 1216
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1296Ad8.A00(java.lang.String):X.BOr");
    }

    public static void A01(Intent intent, 1BY r302, C1296Ad8 c1296Ad8, CommunityMessagingLoggerModel communityMessagingLoggerModel) {
        c1296Ad8.A04(communityMessagingLoggerModel);
        CommunityMessagingNotificationsLoggerModel communityMessagingNotificationsLoggerModel = (CommunityMessagingNotificationsLoggerModel) intent.getParcelableExtra("notifications_logger_model");
        if (communityMessagingNotificationsLoggerModel != null) {
            C5e2.A00((C5e2) 1Bn.A0E((Context) null, r302, 83330), communityMessagingNotificationsLoggerModel);
        }
    }

    public static final void A02(C1296Ad8 c1296Ad8, CommunityMessagingLoggerModel communityMessagingLoggerModel, String str) {
        BOr A00 = A00(communityMessagingLoggerModel.A07);
        if (A00 == null) {
            A00 = communityMessagingLoggerModel.A00;
        }
        1UG A07 = AbL.A07(c1296Ad8.A00);
        if (A07.isSampled()) {
            AbF.A1M(A07, String.valueOf(str));
            A07.A7R("group_id", communityMessagingLoggerModel.A05);
            7zL.A1F(A07, communityMessagingLoggerModel.A0B);
            A07.A7R(Property.SYMBOL_Z_ORDER_SOURCE, communityMessagingLoggerModel.A09);
            A07.A7R("surface", communityMessagingLoggerModel.A0A);
            A07.A7R("community_id", communityMessagingLoggerModel.A03);
            AbF.A1L(A07, communityMessagingLoggerModel.A04);
            A07.A6J("client_extras", communityMessagingLoggerModel.A02);
            A07.A7R("recipient_id", communityMessagingLoggerModel.A08);
            A07.A5c(A00, "parent_surface");
            A07.A5c(communityMessagingLoggerModel.A01, "entry_point");
            A07.A7R("message_id", communityMessagingLoggerModel.A06);
            AbJ.A1N(A07);
        }
    }

    public final void A03(CommunityMessagingLoggerModel communityMessagingLoggerModel) {
        A02(this, communityMessagingLoggerModel, "impression");
    }

    public final void A04(CommunityMessagingLoggerModel communityMessagingLoggerModel) {
        A02(this, communityMessagingLoggerModel, "tap");
    }
}
