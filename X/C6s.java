package X;

import android.content.Context;
import com.facebook.inject.FbInjector;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.user.model.User;
import com.facebook.user.model.UserKey;
import com.facebook.wearable.common.comms.hera.shared.host.HeraHostSharedImplKt;
import java.util.Locale;

/* loaded from: C6s.class */
public final class C6s {
    public final 1Br A00 = AbG.A0M();

    public final void A00(Context context, 1pI r303, ThreadKey threadKey, 5Sh r305, 64W r306, 6FI r307) {
        11T.A0F(context, 0);
        1BL.A1H(r303, r307, r306);
        11T.A0F(r305, 5);
        1BV A00 = 1BV.A00(793);
        if (threadKey != null) {
            C9hi A0L = ((82O) A00.get()).A0L(context, threadKey);
            String A0w = 1BK.A0w(threadKey);
            1UG A08 = 1BK.A08(1BK.A07(A0L.A01), 1BJ.A00(1710));
            if (A08.isSampled()) {
                A08.A7R("thread_type", threadKey.A06.name().toLowerCase(Locale.US));
                7zL.A1F(A08, A0w);
                A08.BZL();
            }
            ((82O) A00.get()).A0L(context, threadKey).A01(threadKey);
        }
        A01(context, r303, threadKey, r305, r306, r307, 0, false);
    }

    public final void A01(Context context, final 1pI r303, ThreadKey threadKey, 5Sh r305, 64W r306, 6FI r307, int i, boolean z) {
        C01s A04;
        String A0Z;
        Cun cun;
        11T.A0F(context, 0);
        1BL.A1H(r303, r307, r306);
        11T.A0F(r305, 5);
        if (threadKey != null) {
            ThreadSummary threadSummary = r305.A03;
            User user = r305.A05;
            if (threadSummary == null || (!ThreadKey.A0f(threadKey) && !ThreadKey.A0h(threadKey) && !ThreadKey.A0a(threadKey) && !ThreadKey.A0p(threadKey) && !ThreadKey.A0T(threadKey))) {
                if (user == null) {
                    A04 = 1Br.A04(this.A00);
                    A0Z = "Trying to open thread settings with a null stored user";
                } else {
                    UserKey userKey = user.A0k;
                    UserKey A0o = (threadKey.A1K() || threadKey.A19()) ? AbJ.A0o(threadKey) : null;
                    if (!11T.A0O(userKey, A0o)) {
                        A04 = 1Br.A04(this.A00);
                        11T.A0D(userKey);
                        StringBuilder A0k = AnonymousClass001.A0k();
                        A0k.append("Stored user does not match other user in thread.");
                        A0k.append(" Thread key is ");
                        A0k.append(threadKey);
                        A0k.append(". Stored user is ");
                        A0k.append(userKey);
                        A0Z = AnonymousClass001.A0Z(A0o, ". Other user is ", A0k);
                        11T.A0A(A0Z);
                    } else if (threadSummary == null && threadKey.A19()) {
                        return;
                    }
                }
            }
            if (1XU.A00(context)) {
                AbR abR = (AbR) 1Bn.A0A(794);
                Context A01 = FbInjector.A01();
                AbL.A0y(abR);
                try {
                    new 6HY(r303) { // from class: X.9xw
                        public final 1pI A00;
                        public final C00i A01 = 1BV.A00(65566);

                        {
                            this.A00 = r303;
                        }

                        public void D0Q(ThreadKey threadKey2, int i2, boolean z2) {
                            threadKey2.getClass();
                            1pI r0 = this.A00;
                            if (r0.BVa()) {
                                r0.Czz(((AnonymousClass826) this.A01.get()).A00(threadKey2, i2), 0S2.A0u, "thread_settings_fragment");
                            }
                        }
                    };
                    1Bn.A0K();
                    FbInjector.A04(A01);
                } catch (Throwable th) {
                    1Bn.A0K();
                    FbInjector.A04(A01);
                    throw th;
                }
            } else {
                cun = ((AbR) 1Bn.A0A(HeraHostSharedImplKt.DEFAULT_RECV_VIDEO_INIT_WIDTH)).A0v(context, new Cul(r307, 5));
            }
            11T.A0D(cun);
            cun.D0Q(threadKey, i, z);
            r306.AGM();
            return;
        }
        A04 = 1Br.A04(this.A00);
        A0Z = "Trying to open thread settings with no thread key";
        A04.D0v("ThreadViewFragment_ThreadSettings_NoUser", A0Z);
    }
}
