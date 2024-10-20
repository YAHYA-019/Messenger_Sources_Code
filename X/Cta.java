package X;

import com.facebook.messaging.sharing.broadcastflow.intent.model.BroadcastFlowIntentModel;
import com.facebook.messaging.sharing.broadcastflow.intent.model.GameShareIntentModel;
import com.facebook.quicksilver.common.sharing.GameAsyncShareExtras;
import com.facebook.quicksilver.common.sharing.GameEntityShareExtras;
import com.facebook.quicksilver.common.sharing.GameShareExtras;

/* loaded from: Cta.class */
public final class Cta implements DHZ {
    public Class BDh() {
        return GameShareIntentModel.class;
    }

    public /* bridge */ /* synthetic */ CDU BYN(BroadcastFlowIntentModel broadcastFlowIntentModel) {
        String str;
        String str2;
        String str3;
        GameShareExtras gameShareExtras = ((GameShareIntentModel) broadcastFlowIntentModel).A00;
        Integer A00 = gameShareExtras.A00();
        if (A00 == 0S2.A0C) {
            GameEntityShareExtras gameEntityShareExtras = (GameEntityShareExtras) gameShareExtras;
            str = gameEntityShareExtras.A01;
            str2 = ((GameShareExtras) gameEntityShareExtras).A01;
            str3 = gameEntityShareExtras.A02;
        } else {
            GameAsyncShareExtras gameAsyncShareExtras = (GameAsyncShareExtras) gameShareExtras;
            str = gameAsyncShareExtras.A03;
            str2 = gameAsyncShareExtras.A05;
            str3 = null;
        }
        return new CDU(new C9xd(A00, str, str2, str3));
    }
}
