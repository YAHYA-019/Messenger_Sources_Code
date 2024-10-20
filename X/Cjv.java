package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.facebook.messaging.communitymessaging.model.CommunityExtraData;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.user.model.User;
import com.facebook.xapp.messaging.model.secondarydata.ParcelableSecondaryData;
import com.facebook.xapp.messaging.profile.logging.ContextualProfileLoggingData;
import com.google.common.collect.RegularImmutableMap;

/* loaded from: Cjv.class */
public final class Cjv implements 7Yx {
    public final int A00;
    public final Object A01;

    public Cjv(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [X.Al9, androidx.fragment.app.Fragment] */
    public final void CHY(User user) {
        switch (this.A00) {
            case 0:
                if (user != null) {
                    ?? r0 = (C1554Al9) this.A01;
                    ContextualProfileLoggingData contextualProfileLoggingData = new ContextualProfileLoggingData(null, RegularImmutableMap.A03, "community_chat_suggestions_approval_screen", "chat_suggester", false);
                    C3R9 c3r9 = new C3R9();
                    C01i c01i = r0.A09;
                    ParcelableSecondaryData A0w = AbG.A0w(new CommunityExtraData(false, null, null, null, String.valueOf(AnonymousClass001.A05(c01i.getValue())), null, AnonymousClass001.A05(r0.A07.getValue())), c3r9);
                    7XU r02 = (7XU) 7zO.A0l((Fragment) r0, 50218);
                    Context requireContext = r0.requireContext();
                    ThreadKey A07 = ThreadKey.A07(AnonymousClass001.A05(c01i.getValue()));
                    06Z r03 = r0.mFragmentManager;
                    1F9 r04 = r0.A03;
                    if (r04 == null) {
                        11T.A0L("folderName");
                        throw 0Q8.createAndThrow();
                    }
                    r02.A03(requireContext, r03, r04, A07, user, A0w, contextualProfileLoggingData);
                    return;
                }
                return;
            case 1:
                AmM amM = (AmM) this.A01;
                if (1BK.A1Y(amM.A06)) {
                    AmM.A09(amM);
                    return;
                }
                return;
            case 2:
                if (user != null) {
                    ((DF6) this.A01).CTG(user);
                    return;
                }
                return;
            case 3:
                if (user != null) {
                    CwD cwD = new CwD(this, 2);
                    Cu5 cu5 = (Cu5) this.A01;
                    ((7EN) 1Bn.A0E((Context) null, cu5.A01, 50188)).A06(cu5.A03, cu5.A08, BNT.A0c, cwD, cu5.A0C, (C1ph) null, user);
                    return;
                }
                return;
            default:
                ((0CL) this.A01).element = user;
                return;
        }
    }
}
