package X;

import android.app.PendingIntent;
import android.content.Intent;
import com.facebook.acra.constants.ActionId;
import com.facebook.inject.FbInjector;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.notify.type.MessagingNotification;
import com.facebook.push.constants.PushProperty;
import java.util.ArrayList;

/* loaded from: C66.class */
public final class C66 {
    public final C00i A01 = FbInjector.A00;
    public final C00i A03 = AbH.A0b();
    public final C00i A00 = 1BV.A00(83856);
    public final C00i A08 = AbG.A0G(82173);
    public final C00i A07 = 1BQ.A02(49797);
    public final C00i A02 = 1BQ.A02(83837);
    public final C00i A04 = AbG.A0G(49844);
    public final C00i A06 = 1BV.A00(83850);
    public final C15h A05 = DBe.A00(this, ActionId.ON_VIEW_CREATED_END);

    public PendingIntent A00(ThreadKey threadKey, MessagingNotification messagingNotification, String str, String str2, String str3, ArrayList arrayList, int i, boolean z) {
        if (((C8n) this.A06.get()).A01()) {
            PushProperty pushProperty = messagingNotification.A02;
            String A00 = pushProperty != null ? pushProperty.A08 : 4YT.A00(1322);
            C82 A002 = ((C4n) this.A08.get()).A00("error");
            A002.A01("feature", "GroupCallUpdateNotification");
            A002.A01("handler", "GroupCallUpdateNotificationHandler");
            A002.A01("errortype", 4YT.A00(658));
            if (pushProperty != null) {
                String str4 = pushProperty.A08;
                if (str4 != null) {
                    A002.A01("msgId", str4);
                }
                String str5 = pushProperty.A0A;
                if (str5 != null) {
                    A002.A01("pushNotifId", str5);
                }
            }
            A002.A00();
            0fH.A18("MissedCallIntentCreator", 4YT.A00(792), new Object[]{A00});
        }
        Intent A003 = ((C6X) this.A00.get()).A00(threadKey, AbF.A0l(this.A07).A07(threadKey), str3, str2, arrayList, z);
        A003.setPackage(1BL.A0n(this.A01));
        A003.addCategory("android.intent.category.DEFAULT");
        return ((5qG) this.A04.get()).A09(A003, messagingNotification, str, z ? "MESSENGER_VIDEO_CALL" : "MESSENGER_AUDIO_CALL", i);
    }
}
