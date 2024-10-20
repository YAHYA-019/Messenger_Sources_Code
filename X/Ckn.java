package X;

import android.content.Context;
import com.facebook.messaging.graph.plugins.sharecontact.xmactahandler.viewprofilectahandler.ShareContactViewProfileCtaHandler;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.user.model.User;
import com.facebook.xapp.messaging.profile.logging.ContextualProfileLoggingData;
import com.google.common.collect.RegularImmutableMap;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutorService;

/* loaded from: Ckn.class */
public final class Ckn implements DF6 {
    public final /* synthetic */ ShareContactViewProfileCtaHandler A00;

    public Ckn(ShareContactViewProfileCtaHandler shareContactViewProfileCtaHandler) {
        this.A00 = shareContactViewProfileCtaHandler;
    }

    @Override // X.DF6
    public void CTG(User user) {
        try {
            ShareContactViewProfileCtaHandler shareContactViewProfileCtaHandler = this.A00;
            Context context = shareContactViewProfileCtaHandler.A00;
            if (context != null) {
                String obj = user.A0U.toString();
                1Br r0 = shareContactViewProfileCtaHandler.A03;
                ((C6i1) r0.get()).A01("user_type", obj);
                if (user.A0E()) {
                    ListenableFuture A03 = ((7XP) 1Br.A0B(shareContactViewProfileCtaHandler.A04)).A03(4YV.A0E(context), AbF.A1A(user));
                    if (shareContactViewProfileCtaHandler.A00 != null) {
                        1Kd.A0F(D4p.A00(shareContactViewProfileCtaHandler, user, 25), A03, (ExecutorService) 1Bi.A03(16456));
                        return;
                    }
                    return;
                }
                if (((7XU) 1Br.A0B(shareContactViewProfileCtaHandler.A01)).A05(context, (ThreadKey) null, user, new ContextualProfileLoggingData(null, RegularImmutableMap.A03, 4YT.A00(1483), "button", true))) {
                    return;
                }
                Context context2 = shareContactViewProfileCtaHandler.A00;
                if (context2 != null) {
                    ((C6i1) r0.get()).A01("can_view_profile", ((C1z) 1Bi.A03(82659)).A00(context2, null, user) ? "True" : "False");
                }
                ((C6i1) r0.get()).A04("contact_share_view_profile", "Contextual Profile Launch Failed");
                ShareContactViewProfileCtaHandler.A00(shareContactViewProfileCtaHandler, user);
            }
        } catch (Exception e) {
            ((C6i1) this.A00.A03.get()).A04("contact_share_view_profile", e.getMessage());
        }
    }
}
