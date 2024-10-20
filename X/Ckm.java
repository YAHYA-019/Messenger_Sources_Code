package X;

import android.content.Context;
import android.net.Uri;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.messaging.graph.plugins.sharecontact.xmactahandler.messagectahandler.ShareContactMessageCtaHandler;
import com.facebook.user.model.User;

/* loaded from: Ckm.class */
public final class Ckm implements DF6 {
    public final /* synthetic */ ShareContactMessageCtaHandler A00;

    public Ckm(ShareContactMessageCtaHandler shareContactMessageCtaHandler) {
        this.A00 = shareContactMessageCtaHandler;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Throwable, X.6i1] */
    @Override // X.DF6
    public void CTG(User user) {
        Uri A09;
        ShareContactMessageCtaHandler shareContactMessageCtaHandler = this.A00;
        String obj = user.A0U.toString();
        C00i c00i = shareContactMessageCtaHandler.A04.A00;
        ?? r0 = (C6i1) c00i.get();
        r0.A01("user_type", obj);
        try {
            if (user.A0C()) {
                1Br.A0C(shareContactMessageCtaHandler.A02);
                A09 = 4YU.A0F(StringFormatUtil.formatStrLocaleSafe(4YT.A00(1104), user.A13));
                11T.A0D(A09);
            } else {
                A09 = ((4iH) 1Br.A0B(shareContactMessageCtaHandler.A02)).A09(user.A13);
                11T.A0D(A09);
            }
            C68t A0b = 7zP.A0b(shareContactMessageCtaHandler.A01);
            Context context = shareContactMessageCtaHandler.A00;
            if (context == null) {
                11T.A0L("context");
                throw 0Q8.createAndThrow();
            }
            A0b.A0E(context, A09);
        } catch (Exception unused) {
            ((C6i1) c00i.get()).A04(4YT.A00(1016), r0.getMessage());
            ((C6i1) c00i.get()).A02(4YT.A00(1015), null);
        }
    }
}
