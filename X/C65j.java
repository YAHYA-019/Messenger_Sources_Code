package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.messages.Message;
import com.facebook.xapp.messaging.threadview.model.aigenerated.AIGeneratedMetadata;
import java.util.List;

/* renamed from: X.65j, reason: invalid class name */
/* loaded from: 65j.class */
public final class C65j implements C64o {
    @Override // X.C64o
    public 1LI AKU(06Z r302, FbUserSession fbUserSession, 1Iw r304, 5zD r305, 64W r306, AnonymousClass622 anonymousClass622) {
        AIGeneratedMetadata aIGeneratedMetadata;
        List list;
        11T.A0F(anonymousClass622, 2);
        11T.A0F(r305, 3);
        Message message = anonymousClass622.A03;
        Integer A00 = 7mC.A00((message == null || (aIGeneratedMetadata = message.A0j) == null || (list = aIGeneratedMetadata.A00) == null) ? null : (String) 0QD.A0E(list));
        return A00 == null ? new 2AW() : new 8XT(5zD.A00(r305), A00.intValue(), anonymousClass622.A0Z);
    }

    @Override // X.C64o
    public void Bac(AnonymousClass622 anonymousClass622) {
    }

    @Override // X.C64o
    public boolean Cyg(AnonymousClass622 anonymousClass622) {
        11T.A0F(anonymousClass622, 0);
        return C5g1.A01(anonymousClass622.A03);
    }
}
