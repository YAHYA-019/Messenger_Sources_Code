package X;

import android.content.Context;
import android.view.ViewGroup;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.business.attachments.generic.model.PlatformGenericAttachment;
import com.facebook.messaging.business.attachments.generic.model.PlatformGenericAttachmentItem;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;

/* loaded from: E2S.class */
public final class E2S extends C6eO {
    public final Context A00;
    public final 1Br A01 = 7zM.A0V();
    public final 1De A02;

    public E2S(1De r302) {
        this.A02 = r302;
        this.A00 = AbK.A0A(r302);
    }

    @Override // X.C6eO
    public /* bridge */ /* synthetic */ EeO A02(ViewGroup viewGroup) {
        return new EeO(new EBg(this.A00));
    }

    @Override // X.C6eO
    public /* bridge */ /* synthetic */ void A03(FbUserSession fbUserSession, 5zD r303, 5Pm r304, EeO eeO, 7Wh r306) {
        1BL.A1F(eeO, r304);
        6Ay BCm = r304.BCm();
        if (BCm == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        ArE BEO = BCm.BEO();
        if (BEO == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        String A02 = ((1H2) 1Br.A0B(this.A01)).A02();
        PlatformGenericAttachmentItem platformGenericAttachmentItem = null;
        String A0k = BEO.A0k();
        ArrayList A0s = AnonymousClass001.A0s();
        ImmutableList Aaw = BEO.Aaw();
        11T.A0A(Aaw);
        1Du it = Aaw.iterator();
        while (it.hasNext()) {
            DKH.A1U(A0s, it);
        }
        2JX A0L = 1BL.A0L(BEO, -1952433535, -149289062);
        if (A0L != null) {
            ImmutableList A2F = A0L.A2F();
            11T.A0A(A2F);
            if (1BK.A1Y(A2F)) {
                platformGenericAttachmentItem = EWG.A00((GME) 1BK.A0r(A2F));
            }
        }
        PlatformGenericAttachment platformGenericAttachment = new PlatformGenericAttachment(null, platformGenericAttachmentItem, A02, A0k, null, A0s);
        EBg eBg = eeO.A00;
        11T.A0I(eBg, "null cannot be cast to non-null type com.facebook.messaging.business.attachments.generic.views.PlatformGenericAttachmentView");
        eBg.A0D(platformGenericAttachment);
    }
}
