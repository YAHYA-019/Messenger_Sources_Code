package X;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.data.repository.threadsummary.interfaces.ThreadSummaryDataModel;
import com.facebook.messaging.integrity.frx.model.FRXParams;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;

/* loaded from: Ca5.class */
public final class Ca5 implements Observer {
    public final /* synthetic */ 06Z A00;
    public final /* synthetic */ LiveData A01;
    public final /* synthetic */ FbUserSession A02;
    public final /* synthetic */ C5yq A03;
    public final /* synthetic */ 6Im A04;
    public final /* synthetic */ ThreadKey A05;
    public final /* synthetic */ String A06;

    public Ca5(06Z r302, LiveData liveData, FbUserSession fbUserSession, C5yq c5yq, 6Im r306, ThreadKey threadKey, String str) {
        this.A01 = liveData;
        this.A04 = r306;
        this.A03 = c5yq;
        this.A06 = str;
        this.A05 = threadKey;
        this.A02 = fbUserSession;
        this.A00 = r302;
    }

    @Override // androidx.lifecycle.Observer
    public /* bridge */ /* synthetic */ void onChanged(Object obj) {
        ThreadSummaryDataModel A0N = 7zU.A0N(obj);
        this.A01.removeObserver(this);
        ThreadSummary threadSummary = A0N.A00;
        C8i c8i = new C8i();
        6Im r0 = this.A04;
        c8i.A00(6Im.A04(r0));
        C5yl c5yl = C5yl.A0L;
        c8i.A08 = c5yl;
        C5yq c5yq = this.A03;
        c8i.A00 = c5yq;
        C1pq.A08("location", c5yq);
        String str = this.A06;
        c8i.A0B = str;
        C1pq.A08("objectId", str);
        ThreadKey threadKey = this.A05;
        c8i.A04 = threadKey;
        c8i.A05 = threadSummary;
        c8i.A0F = true;
        c8i.A01(0S2.A00);
        FRXParams fRXParams = new FRXParams(c8i);
        6Io r02 = r0.A04;
        FbUserSession fbUserSession = this.A02;
        r02.A06(fbUserSession, c5yq, threadKey, c5yl, (String) null);
        r0.A05.A00(this.A00, fbUserSession, fRXParams);
    }
}
