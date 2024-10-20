package X;

import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;

/* loaded from: I0j.class */
public final class I0j {
    public static final void A00(JJv jJv, AYU ayu, String str, long j) {
        MailboxFeature mailboxFeature = new MailboxFeature(ayu);
        try {
            Long valueOf = Long.valueOf(j);
            GYS gys = new GYS(jJv, str, j);
            Iaq iaq = new Iaq(jJv, str, 0, j);
            1Um A0R = 1BL.A0R(mailboxFeature);
            MailboxFutureImpl A0P = 1BK.A0P(A0R);
            1Um.A02(A0R, new IbV(mailboxFeature, iaq, A0P, valueOf, gys, str, 0), A0P, false);
        } catch (Throwable th) {
            0fH.A0r("[MP] ArmadilloMediaMetaDataProvider", 0Pz.A0t("retrieveMetadataFromACT exception throws, attachmentPk: ", ", contentToken: ", str, j), th);
            jJv.Bxe(AnonymousClass001.A0Z(th, "retrieveMetadataFromACT exception throws: ", AnonymousClass001.A0k()));
        }
    }

    public final 1xH A01(AYU ayu, long j) {
        1xH r0 = new 1xH();
        if (j < 0) {
            0fH.A0k("[MP] ArmadilloMediaMetaDataProvider", 0Pz.A0h("attachmentPk ", " is invalid", j));
            r0.A02();
            return r0;
        }
        MailboxFeature mailboxFeature = new MailboxFeature(ayu);
        Ibu ibu = new Ibu(7, j, r0, this);
        1Um A0O = 1BK.A0O(mailboxFeature, 0);
        MailboxFutureImpl A0Q = 1BK.A0Q(A0O, ibu);
        1Um.A02(A0O, new Ibu(0, j, mailboxFeature, A0Q), A0Q, false);
        return r0;
    }
}
