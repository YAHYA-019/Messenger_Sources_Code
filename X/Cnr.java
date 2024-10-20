package X;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.notify.type.MessagingNotification;
import com.facebook.messaging.push.flags.ServerMessageAlertFlags;
import com.facebook.messaging.rtc.callstatus.notification.MissedCallNotification;
import com.mapbox.mapboxsdk.style.layers.Property;
import java.util.HashMap;

/* loaded from: Cnr.class */
public final class Cnr implements C5pz {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ MissedCallNotification A02;
    public final /* synthetic */ 4a5 A03;

    public Cnr(MissedCallNotification missedCallNotification, 4a5 r303, int i, long j) {
        this.A03 = r303;
        this.A02 = missedCallNotification;
        this.A01 = j;
        this.A00 = i;
    }

    private void A00(Bitmap bitmap) {
        PendingIntent A04;
        PendingIntent pendingIntent;
        PendingIntent pendingIntent2;
        int i;
        Context A042;
        int i2;
        4a5 r0 = this.A03;
        4aB r02 = 4a5.A1P;
        5bF A0l = AbF.A0l(r0.A0a);
        MissedCallNotification missedCallNotification = this.A02;
        ThreadKey threadKey = missedCallNotification.A02;
        ThreadSummary A07 = A0l.A07(threadKey);
        Integer num = missedCallNotification.A04;
        Integer num2 = 0S2.A00;
        String A16 = num == num2 ? missedCallNotification.A07 : AbI.A16(threadKey);
        if (A07 != null || threadKey.A0z()) {
            long j = this.A01;
            Intent A043 = ((4iH) r0.A0R.get()).A04(threadKey, 5SW.A1J);
            A043.setFlags(67108864);
            A043.putExtra("from_notification", true);
            A043.putExtra("CONTACT_ID", j);
            A043.putExtra("trigger", "voip_notification");
            if (1BL.A1a(r0.A16) && !4a5.A0A(threadKey, r0)) {
                A043.putExtra("prefer_chat_if_possible", true);
            }
            A04 = AbJ.A04(A043, r0.A0X, missedCallNotification, A16, 10010);
        } else {
            A04 = null;
        }
        String str = missedCallNotification.A0D;
        String str2 = missedCallNotification.A0C;
        Integer num3 = 0S2.A01;
        if (num == num3) {
            pendingIntent = r0.A0N(threadKey, missedCallNotification, A16, (String) null, missedCallNotification.A05, missedCallNotification.A0E, 10010, false);
            pendingIntent2 = pendingIntent;
        } else {
            pendingIntent = null;
            pendingIntent2 = A04;
        }
        C10904ux A0l2 = AbG.A0l(r0.A0T);
        C00i c00i = r0.A0G;
        C10914uy A00 = A0l2.A00(1BK.A04(c00i), null, missedCallNotification, 10010);
        A00.A0L(str);
        A00.A0K(str2);
        A00.A0B(2132347259);
        ((C10924uz) A00).A02 = this.A00;
        A00.A0D(pendingIntent2);
        ((C10924uz) A00).A03 = 2;
        boolean A1Z = AbH.A1Z(A00, missedCallNotification.A00);
        ((C10924uz) A00).A01 = 1BK.A04(c00i).getColor(2132214516);
        A00.A0N(A1Z);
        if (bitmap != null) {
            A00.A0F(bitmap);
        }
        if (missedCallNotification.A0F) {
            r0.A04.get();
            if (A04 != null) {
                AbH.A1G(A04, 1BK.A04(c00i), A00, 2131964938, 2132345168);
                if (num == num3) {
                    if (pendingIntent != null) {
                        i = 2132347258;
                        A042 = 1BK.A04(c00i);
                        i2 = 2131968043;
                        AbH.A1G(pendingIntent, A042, A00, i2, i);
                    }
                } else if (num != 0S2.A0C) {
                    long j2 = this.A01;
                    if (j2 > 0) {
                        Intent A01 = ((C6X) r0.A0E.get()).A01(threadKey, missedCallNotification.A05, j2);
                        A01.setPackage(1BL.A0n(c00i));
                        A01.addCategory("android.intent.category.DEFAULT");
                        A01.putExtra("NOTIFICATION_MODEL", missedCallNotification);
                        pendingIntent = ((5qG) r0.A0X.get()).A09(A01, missedCallNotification, A16, "MESSENGER_AUDIO_CALL", 10010);
                        i = 2132347258;
                        A042 = 1BK.A04(c00i);
                        i2 = 2131968048;
                        AbH.A1G(pendingIntent, A042, A00, i2, i);
                    } else {
                        4zI.A00("DefaultMessagingNotificationHandler", 0Pz.A0h("Invalid caller ID: ", ", not adding call back action", j2), AnonymousClass001.A1Z());
                        HashMap A0u = AnonymousClass001.A0u();
                        A0u.put("invalid_peer_id", String.valueOf(j2));
                        A0u.put(Property.SYMBOL_Z_ORDER_SOURCE, "DefaultMessagingNotificationHandler");
                        I6E.A00(HCL.A18, null, null, A0u);
                    }
                }
            }
        }
        ((5qH) r0.A0V.get()).A00(A00, threadKey, missedCallNotification.A03, (ServerMessageAlertFlags) null);
        1G2 r03 = 1NK.A06;
        1G2 A08 = AbstractC03303xn.A08(A16);
        1Ql A0V = 1BL.A0V(r0.A0L);
        A0V.CaL(A08, A16);
        A0V.commit();
        4aO.A00(A00, r0.A0j, A16, 10010);
        ((MessagingNotification) missedCallNotification).A00 = A1Z;
        I3Z i3z = (I3Z) r0.A0v.get();
        String str3 = num == num2 ? "P2P" : "GROUP";
        HxP.A00(I3Z.A00(i3z), 10010, Long.valueOf(Long.parseLong(A16)), str3, missedCallNotification.A06, missedCallNotification.A0A);
        AbstractC04164a6.A0I(missedCallNotification, r0);
    }

    @Override // X.C5pz
    public void Blg() {
        A00(null);
    }

    @Override // X.C5pz
    public void BpV(2EU r302) {
        try {
            A00(AbG.A1a(r302) ? AbH.A04(r302) : null);
        } finally {
            r302.close();
        }
    }
}
