package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.Observer;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.data.repository.threadsummary.interfaces.ThreadSummaryDataModel;
import com.facebook.messaging.integrity.frx.model.FRXParams;
import com.facebook.messaging.integrity.frx.model.ProactiveWarningParams;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.user.model.UserKey;
import com.google.common.collect.ImmutableList;
import java.util.concurrent.Executor;

/* loaded from: Ca7.class */
public final class Ca7 implements Observer {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final String A07;

    public Ca7(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, String str, int i) {
        this.A00 = i;
        this.A01 = obj5;
        this.A03 = obj2;
        this.A07 = str;
        this.A04 = obj4;
        this.A02 = obj;
        this.A05 = obj6;
        this.A06 = obj3;
    }

    @Override // androidx.lifecycle.Observer
    public /* bridge */ /* synthetic */ void onChanged(Object obj) {
        Executor executor;
        G3H g5t;
        switch (this.A00) {
            case 0:
                ThreadSummaryDataModel A0N = 7zU.A0N(obj);
                AbM.A1E(this, this.A05);
                ThreadSummary threadSummary = A0N.A00;
                if (threadSummary != null) {
                    6Im r0 = (6Im) this.A06;
                    ImmutableList immutableList = threadSummary.A1L;
                    11T.A0A(immutableList);
                    UserKey A05 = 6Im.A05(r0, immutableList);
                    if (A05 != null) {
                        FbUserSession A0I = 4YU.A0I(r0);
                        C5yq A00 = ((C5ym) 7zO.A0p(this.A03)).A00(A0I, threadSummary, 0S2.A0C);
                        if (A00 == null) {
                            A00 = C5yq.A09;
                        }
                        ThreadKey threadKey = (ThreadKey) this.A04;
                        String A0w = 1BK.A0w(threadKey);
                        C8i A0P = 4YV.A0P(r0);
                        C5yl c5yl = (C5yl) this.A01;
                        A0P.A08 = c5yl;
                        C1pq.A08("fRXEntryPoint", c5yl);
                        A0P.A00 = A00;
                        A0P.A0B = A0w;
                        C1pq.A08("objectId", A0w);
                        A0P.A05 = threadSummary;
                        A0P.A04 = threadKey;
                        A0P.A07 = A05;
                        String str = this.A07;
                        C1pq.A08("preSelectedTag", str);
                        A0P.A02 = new ProactiveWarningParams(null, str, "");
                        r0.A05.A00(7zN.A08((Fragment) this.A02), A0I, new FRXParams(A0P));
                        return;
                    }
                    return;
                }
                return;
            case 1:
                FJC fjc = (FJC) obj;
                Throwable th = fjc.A02;
                if (th instanceof G8J) {
                    int i = ((G8J) th).code;
                    if (i == 7 || i == 9 || i == 13) {
                        AbM.A1E(this, this.A03);
                        Rh9 rh9 = (Rh9) this.A01;
                        rh9.A03.A01();
                        String str2 = this.A07;
                        Ek0 ek0 = (Ek0) this.A04;
                        Rh9.A01((0Jt) this.A02, (MediatorLiveData) this.A06, ek0, rh9, this.A05, str2);
                        return;
                    }
                    if (i == 104) {
                        return;
                    }
                }
                ((LiveData) this.A06).postValue(fjc);
                return;
            default:
                FJC fjc2 = (FJC) obj;
                if (FJC.A0C(fjc2)) {
                    AbM.A1E(this, this.A04);
                    executor = ((F6O) this.A01).A03;
                    g5t = new G3H(this, fjc2);
                } else {
                    if (!FJC.A0A(fjc2)) {
                        return;
                    }
                    AbM.A1E(this, this.A04);
                    F6O f6o = (F6O) this.A01;
                    Throwable th2 = fjc2.A02;
                    RHj rHj = (RHj) this.A05;
                    executor = (Executor) this.A03;
                    g5t = new G5t(f6o, rHj, null, null, th2);
                }
                executor.execute(g5t);
                return;
        }
    }
}
