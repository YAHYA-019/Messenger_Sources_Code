package X;

import com.facebook.xapp.messaging.threadview.model.aigenerated.AIGeneratedMetadata;
import com.facebook.xapp.messaging.threadview.model.botresponse.BotResponseMetadata;
import java.util.List;

/* loaded from: A40.class */
public final class A40 implements AYf {
    public final 2Of A00;

    public A40(2Of r302) {
        this.A00 = r302;
    }

    @Override // X.AYf
    public void C6e(1Iw r302, C5j5 c5j5, C9c2 c9c2, 5vW r305) {
        AIGeneratedMetadata aIGeneratedMetadata;
        List list;
        String str;
        BotResponseMetadata botResponseMetadata;
        11T.A0F(r305, 2);
        2Of r0 = this.A00;
        C5fv c5fv = ((5vV) r305).A00;
        MrA.A00(MfU.A08, r0, c5fv);
        if (C5v6.A02(c5fv)) {
            if (c5fv == null || (botResponseMetadata = (BotResponseMetadata) c5fv.AxW(5mF.A00)) == null) {
                return;
            } else {
                str = botResponseMetadata.A0C;
            }
        } else if (c5fv == null || (aIGeneratedMetadata = (AIGeneratedMetadata) c5fv.AxW(C5g2.A00)) == null || (list = aIGeneratedMetadata.A03) == null) {
            return;
        } else {
            str = (String) 0QD.A0E(list);
        }
        if (str != null) {
            C87v.A00(r0, str);
        }
    }
}
