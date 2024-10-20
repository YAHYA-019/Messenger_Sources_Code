package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.business.businesschatdisclosure.ui.BusinessChatDisclosureFragment;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.msys.advancedcrypto.threadsettings.AdvancedCryptoThreadOpener;
import com.facebook.user.model.User;
import com.facebook.user.model.UserKey;
import com.facebook.xapp.messaging.events.common.threadview.OnThreadOpened;

/* renamed from: X.6hp, reason: invalid class name */
/* loaded from: 6hp.class */
public final class C6hp implements 1Vf {
    public final FbUserSession A00;
    public final 1Br A01;
    public final 6G0 A02;
    public final 6Fz A03;

    public C6hp(FbUserSession fbUserSession, 6G0 r303, 6Fz r304) {
        11T.A0F(r303, 1);
        11T.A0F(r304, 3);
        this.A02 = r303;
        this.A00 = fbUserSession;
        this.A03 = r304;
        this.A01 = 1Lm.A01(fbUserSession, 82567);
    }

    public void BQC(1Q5 r302, 1Vp r303, String str) {
        final View findViewById;
        11T.A0F(r302, 0);
        11T.A0F(str, 1);
        if (!str.equals("com.facebook.xapp.messaging.events.common.threadview.OnThreadOpened")) {
            throw 4YV.A0f(str);
        }
        OnThreadOpened onThreadOpened = (OnThreadOpened) r302;
        11T.A0F(onThreadOpened, 0);
        6G0 r0 = this.A02;
        Activity AVb = r0.AVb();
        if (AVb == null || (findViewById = AVb.findViewById(2131365417)) == null) {
            return;
        }
        ThreadKey threadKey = onThreadOpened.A00;
        if (threadKey.A1K()) {
            1Bi.A03(66646);
            if (2pJ.A00(String.valueOf(threadKey.A0r()))) {
                return;
            }
            Context context = r0.getContext();
            11T.A0A(context);
            AnonymousClass474 A00 = ((AnonymousClass472) 1Bn.A0E(context, (1BY) null, 67579)).A00(UserKey.A00(Long.valueOf(threadKey.A02)));
            final int i = 1;
            A00.A02(new 7Yx(findViewById, this, i) { // from class: X.88O
                public final int A00;
                public final Object A01;
                public final Object A02;

                {
                    this.A00 = i;
                    this.A02 = this;
                    this.A01 = findViewById;
                }

                public final void CHY(User user) {
                    switch (this.A00) {
                        case 0:
                            6oF r02 = (6oF) this.A02;
                            r02.A00 = user;
                            if (user == null || !user.A0E()) {
                                return;
                            }
                            ((6PZ) 1Br.A0B(r02.A01)).A01(1BK.A0w(((OnThreadOpened) this.A01).A00), AS0.A00);
                            return;
                        case 1:
                            if (user != null) {
                                C6hp c6hp = (C6hp) this.A02;
                                if (user.A0E()) {
                                    String str2 = c6hp.A00.A05;
                                    String str3 = user.A13;
                                    11T.A0A(str3);
                                    if (1BL.A0Q().AZk(36324715971039191L)) {
                                        C04614bh c04614bh = (C04614bh) 1Br.A0B(c6hp.A01);
                                        if (!c04614bh.A05 || 1BK.A1T(1Br.A09(c04614bh.A01), ((1M0) 1Br.A0B(c04614bh.A03)).A00("business_chat_disclosure/has_user_seen_disclosure"))) {
                                            return;
                                        }
                                        06Z BDe = c6hp.A03.BDe();
                                        C06c A0G = 7zL.A0G(BDe);
                                        Fragment A0b = BDe.A0b("BusinessChatDisclosureFragment");
                                        if (A0b != null) {
                                            A0G.A0I(A0b);
                                        }
                                        A0G.A0V(null);
                                        1pN businessChatDisclosureFragment = new BusinessChatDisclosureFragment();
                                        Bundle A05 = 1BK.A05();
                                        A05.putString("user_id", str2);
                                        A05.putString("page_id", str3);
                                        businessChatDisclosureFragment.setArguments(A05);
                                        businessChatDisclosureFragment.A0m(BDe, "BusinessChatDisclosureFragment");
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            return;
                        default:
                            if (user == null) {
                                0fH.A0j("GoToE2eeThreadHandler", "Could not fetch user for this chat.");
                                return;
                            }
                            FbUserSession fbUserSession = (FbUserSession) this.A02;
                            Context context2 = ((6RU) this.A01).A00;
                            ((AdvancedCryptoThreadOpener) 1Lm.A05(context2, fbUserSession, 83489)).A04(context2, 5SW.A0d, user);
                            return;
                    }
                }
            });
        }
    }
}
