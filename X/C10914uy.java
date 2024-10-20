package X;

import android.app.PendingIntent;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.notify.type.MessagingNotification;
import com.facebook.push.constants.PushProperty;
import java.util.HashMap;

/* renamed from: X.4uy, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4uy.class */
public final class C10914uy extends C10924uz {
    public int A00;
    public Context A01;
    public MessagingNotification A02;
    public final C00i A03;
    public final C00i A04;
    public final C00i A05;
    public final C00i A06;
    public final C15h A07;

    public C10914uy(Context context, MessagingNotification messagingNotification, int i) {
        super(context, (String) null);
        this.A03 = new 1BV(83843);
        this.A04 = new 1BV(68141);
        this.A07 = new DBP(this, 18);
        this.A06 = new 1BQ(17077);
        this.A05 = new 1BQ(49806);
        this.A01 = context;
        this.A00 = i;
        this.A02 = messagingNotification;
    }

    public static void A00(C10914uy c10914uy) {
        MessagingNotification messagingNotification = c10914uy.A02;
        if (messagingNotification != null) {
            C5e0 c5e0 = (C5e0) c10914uy.A05.get();
            HashMap A03 = messagingNotification.A03();
            if (A03 != null) {
                String A01 = C5e0.A01(A03);
                1UG A00 = 1UD.A00((04J) c5e0.A06.get(), 1ZG.A01, "messenger_business_notification_extension_impression");
                if (C5e0.A04(c5e0) && C5e0.A05(c5e0, A01) && A00.isSampled()) {
                    FbUserSession A002 = 1Fw.A00();
                    1UG.A02(A00, "business_inbox_notification");
                    0DA r0 = new 0DA();
                    r0.A07("notification_message_id", A03.containsKey("message_id") ? 4YU.A16("message_id", A03) : "");
                    r0.A07("notification_type", C5e0.A01(A03));
                    r0.A03("notification_extension", AnonymousClass001.A0K());
                    C5e0.A02(r0, A00, A002);
                }
            }
        }
    }

    public static boolean A01(C10914uy c10914uy) {
        MessagingNotification messagingNotification;
        PushProperty pushProperty;
        if (((Boolean) c10914uy.A07.get()).booleanValue()) {
            if (((C2ib) c10914uy.A06.get()).A0D()) {
                int i = c10914uy.A00;
                if (i != 10051 && ((messagingNotification = c10914uy.A02) == null || (pushProperty = messagingNotification.A02) == null || pushProperty.A04 != 4rH.A0L)) {
                    if (i == 10084) {
                        return true;
                    }
                }
            }
            if (!5Zt.A00((5Zt) c10914uy.A04.get()).AZk(36313939897949453L)) {
                return false;
            }
            int i2 = c10914uy.A00;
            if (i2 != 20023) {
                return i2 == 20002;
            }
        }
        return true;
    }

    @Override // X.C10924uz
    public /* bridge */ /* synthetic */ C10924uz A08(PendingIntent pendingIntent, CharSequence charSequence, int i) {
        if (A01(this)) {
            A00(this);
            super.A08(pendingIntent, charSequence, i);
        }
        return this;
    }

    @Override // X.C10924uz
    public /* bridge */ /* synthetic */ C10924uz A09(5YV r302) {
        if (A01(this)) {
            A00(this);
            super.A09(r302);
        }
        return this;
    }
}
