package X;

import android.content.Context;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.share.Share;
import com.facebook.messaging.montage.model.MontageCard;
import com.facebook.messaging.montage.model.MontageUser;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.Collections;
import java.util.List;

/* loaded from: HvS.class */
public abstract class HvS {
    public static final void A00(Context context, 5PI r302, Message message, MontageCard montageCard, String str, String str2, String str3, String str4, java.util.Map map, boolean z) {
        1Br A01 = 1Bu.A01(context, 82653);
        C5sv c5sv = (C5sv) 1Bn.A0A(83790);
        String str5 = null;
        List emptyList = Collections.emptyList();
        11T.A0A(emptyList);
        List emptyList2 = Collections.emptyList();
        11T.A0A(emptyList2);
        Share share = new Share(null, null, null, null, null, null, null, null, null, null, null, null, null, str, null, null, null, null, emptyList, emptyList2);
        String str6 = montageCard.A0E;
        r302.A1Z = str6;
        r302.A0R = c5sv.A00() ? BUL.A00(share, ((C7c) 1Br.A0B(A01)).A00(montageCard, str2, str3, str4, z)) : null;
        r302.A1Y = montageCard.A0G;
        MontageUser montageUser = montageCard.A08;
        if (montageUser != null) {
            str5 = montageUser.A01.id;
        }
        r302.A1b = str5;
        ImmutableMap.Builder A0c = 1BK.A0c();
        A0c.putAll(message.A14);
        String str7 = montageCard.A0H;
        2DM A0g = 4YU.A0g(C26T.A00);
        A0g.A0o("message_id", str6);
        if (str7 != null) {
            A0g.A0o("story_type", str7);
        }
        r302.A0L(AbG.A10(A0c, "montage_reply_data", 11T.A02(A0g)));
        if (map != null) {
            r302.A0K(map);
        }
    }

    public static final void A01(java.util.Map map) {
        ImmutableList.Builder builder = ImmutableList.builder();
        if (builder.build().isEmpty()) {
            return;
        }
        ImmutableList A01 = 1Fj.A01(builder);
        C03353xs c03353xs = new C03353xs(C26T.A00);
        1Du it = A01.iterator();
        while (it.hasNext()) {
            c03353xs.A0d(new 2Jz(AnonymousClass001.A0i(it)));
        }
        map.put("montage_supported_features", 11T.A02(c03353xs));
    }
}
