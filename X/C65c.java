package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.attachments.ImageAttachmentData;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.List;

/* renamed from: X.65c, reason: invalid class name */
/* loaded from: 65c.class */
public final class C65c implements C64o {
    public final 1Br A00 = 1Bu.A00(68594);

    @Override // X.C64o
    public 1LI AKU(06Z r302, FbUserSession fbUserSession, 1Iw r304, 5zD r305, 64W r306, AnonymousClass622 anonymousClass622) {
        11T.A0F(r304, 0);
        1BL.A1H(fbUserSession, anonymousClass622, r305);
        11T.A0F(r302, 4);
        MigColorScheme A00 = 5zD.A00(r305);
        String A0D = r304.A0D(2131964655);
        boolean z = anonymousClass622.A0Z;
        9zP r0 = new 9zP(r302, r304, this, anonymousClass622);
        7xD r02 = 7xD.A00;
        return new C8cz(r0, C1u7.A06, A00, 2KE.A05, A0D, r02, z);
    }

    @Override // X.C64o
    public void Bac(AnonymousClass622 anonymousClass622) {
    }

    @Override // X.C64o
    public boolean Cyg(AnonymousClass622 anonymousClass622) {
        ImageAttachmentData imageAttachmentData;
        11T.A0F(anonymousClass622, 0);
        List list = anonymousClass622.A0Q;
        boolean z = false;
        if (list.size() == 1 && (imageAttachmentData = (ImageAttachmentData) 0QD.A0E(list)) != null && imageAttachmentData.A09 != null && anonymousClass622.A04.A03("roll_call_messsage_nux_eligibility")) {
            z = true;
        }
        return z;
    }
}