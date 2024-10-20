package X;

import com.facebook.messaging.games.pushnotification.model.GamesPushNotificationSettings;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.service.model.FetchThreadResult;

/* renamed from: X.Ami, reason: case insensitive filesystem */
/* loaded from: Ami.class */
public final class C1601Ami extends I5C {
    public final /* synthetic */ 1Br A00;
    public final /* synthetic */ 1Br A01;
    public final /* synthetic */ C4z1 A02;
    public final /* synthetic */ DGs A03;
    public final /* synthetic */ GamesPushNotificationSettings A04;
    public final /* synthetic */ ThreadKey A05;

    public C1601Ami(1Br r302, 1Br r303, C4z1 c4z1, DGs dGs, GamesPushNotificationSettings gamesPushNotificationSettings, ThreadKey threadKey) {
        this.A05 = threadKey;
        this.A04 = gamesPushNotificationSettings;
        this.A02 = c4z1;
        this.A00 = r302;
        this.A01 = r303;
        this.A03 = dGs;
    }

    public /* bridge */ /* synthetic */ Object A02(Object[] objArr) {
        ThreadKey threadKey = this.A05;
        if (threadKey == null) {
            return AbF.A1D("Failed to fetch threadsummary as threadKey is null");
        }
        FetchThreadResult A0H = ((C4yz) 1Br.A0B(this.A00)).A0H(threadKey, 0);
        ThreadSummary threadSummary = A0H.A05;
        if (threadSummary == null) {
            return AbF.A1D("Failed to fetch threadsummary");
        }
        4yH r0 = (4yH) 1Br.A0B(this.A01);
        GamesPushNotificationSettings gamesPushNotificationSettings = this.A04;
        long j = A0H.A01;
        C1zm A0g = AbF.A0g(threadSummary);
        A0g.A0e = gamesPushNotificationSettings;
        ThreadSummary A0E = AbO.A0E(r0, A0g, j);
        this.A02.A07(A0E);
        11T.A0D(A0E);
        return A0E;
    }

    public void A04(Object obj) {
        11T.A0F(obj, 0);
        DGs dGs = this.A03;
        if (obj instanceof ThreadSummary) {
            dGs.CL4((ThreadSummary) obj);
        } else if (obj instanceof Throwable) {
            dGs.BxT((Throwable) obj);
        }
    }
}
