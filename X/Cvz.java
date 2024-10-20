package X;

import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.presence.plugins.core.groupthreadsubtitledata.GroupThreadSubtitleData;
import com.facebook.messaging.presence.plugins.core.threadsettingssubtitledata.ThreadSettingsSubtitleData;
import com.facebook.messaging.presence.plugins.core.threadsubtitledata.ThreadSubtitleData;
import com.facebook.user.model.UserKey;
import java.util.concurrent.TimeUnit;

/* loaded from: Cvz.class */
public final class Cvz implements 6ND {
    public final int A00;
    public final Object A01;

    public Cvz(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void CN9(5Cz r302, UserKey userKey) {
        switch (this.A00) {
            case 0:
                AmX amX = (AmX) this.A01;
                if (amX.A08 != r302) {
                    amX.A08 = r302;
                    return;
                }
                return;
            case 1:
                AmL.A08((AmL) this.A01);
                return;
            case 2:
                ((GroupThreadSubtitleData) this.A01).A01.A02(r302);
                return;
            case 3:
                ((ThreadSettingsSubtitleData) this.A01).A01.A00(r302, null);
                return;
            case 4:
                ThreadSubtitleData threadSubtitleData = (ThreadSubtitleData) this.A01;
                if (11T.A0O(threadSubtitleData.A00, r302)) {
                    return;
                }
                if (r302.A07) {
                    5Cz r0 = threadSubtitleData.A00;
                    Integer num = r0.A06;
                    Integer num2 = 0S2.A00;
                    if (num != num2) {
                        ThreadKey threadKey = threadSubtitleData.A04;
                        if (!r0.A00(threadKey) && (r302.A06 == num2 || r302.A00(threadKey))) {
                            0fH.A0j("ThreadSubtitleData", "User state changed from inactive to active, going to update voip info");
                            ((C00171ab) 1Br.A0B(threadSubtitleData.A01)).A08();
                        }
                    }
                }
                threadSubtitleData.A05.A02(threadSubtitleData.A00);
                threadSubtitleData.A00 = r302;
                return;
            case 5:
                BIf bIf = (BIf) this.A01;
                1GU r02 = bIf.A02;
                if (r02 == null) {
                    11T.A0L("androidThreadUtil");
                    throw 0Q8.createAndThrow();
                }
                r02.Ciz(new D8e(bIf, r302));
                return;
            default:
                boolean A1W = 1BL.A1W(userKey, r302);
                C92 c92 = (C92) this.A01;
                ThreadKey threadKey2 = c92.A00;
                if (threadKey2 != null) {
                    if (threadKey2.A1F() == A1W || threadKey2.A1I() == A1W) {
                        java.util.Map map = c92.A04;
                        5Cz r03 = (5Cz) map.get(userKey);
                        if (r03 != null && r03.A06 == r302.A06) {
                            if (Math.abs(r302.A03 - r03.A03) <= TimeUnit.SECONDS.toMillis(C1mr.A00((C1mr) 1Br.A0B(c92.A03)).Av9(1GD.A07, 36597377675234887L))) {
                                return;
                            }
                        }
                        map.put(userKey, r302);
                        6ND r04 = c92.A01;
                        if (r04 != null) {
                            r04.CN9(r302, userKey);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
