package X;

import android.content.Context;
import android.view.ViewGroup;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.business.attachments.generic.model.LogoImage;
import com.facebook.messaging.business.attachments.generic.model.PlatformGenericAttachment;
import com.facebook.messaging.business.attachments.generic.model.PlatformGenericAttachmentItem;
import com.facebook.messaging.business.attachments.generic.views.PlatformGenericAttachmentItemView;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;

/* loaded from: E2M.class */
public final class E2M extends C6eO {
    public final Context A00 = 7zP.A0J();

    @Override // X.C6eO
    public /* bridge */ /* synthetic */ EeO A02(ViewGroup viewGroup) {
        return new EeO(new EBg(this.A00));
    }

    @Override // X.C6eO
    public /* bridge */ /* synthetic */ void A03(FbUserSession fbUserSession, 5zD r303, 5Pm r304, EeO eeO, 7Wh r306) {
        r304.getClass();
        6Ay BCm = r304.BCm();
        BCm.getClass();
        ArE BEO = BCm.BEO();
        BEO.getClass();
        PlatformGenericAttachmentItem platformGenericAttachmentItem = null;
        String A0k = BEO.A0k();
        String A0j = BEO.A0j();
        LogoImage A00 = Reu.A00(1BL.A0L(BEO, 161701570, 2132723742));
        ArrayList A0s = AnonymousClass001.A0s();
        ImmutableList Aaw = BEO.Aaw();
        11T.A0A(Aaw);
        1Du it = Aaw.iterator();
        while (it.hasNext()) {
            DKH.A1U(A0s, it);
        }
        2JX A0L = 1BL.A0L(BEO, 341967140, -1717597979);
        if (A0L != null) {
            ImmutableList A2F = A0L.A2F();
            11T.A0A(A2F);
            if (!A2F.isEmpty()) {
                platformGenericAttachmentItem = EWG.A00((GME) A2F.get(0));
            }
        }
        PlatformGenericAttachment platformGenericAttachment = new PlatformGenericAttachment(A00, platformGenericAttachmentItem, null, A0k, A0j, A0s);
        EBg eBg = eeO.A00;
        eBg.A0D(platformGenericAttachment);
        2Wo r0 = eBg.A04;
        if (r0.A05()) {
            ((PlatformGenericAttachmentItemView) r0.A01()).A0D.setVisibility(8);
        }
    }
}
