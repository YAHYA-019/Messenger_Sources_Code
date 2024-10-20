package X;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.Transformations;
import com.facebook.auth.usersession.FbUserSession;
import com.google.common.collect.MapMakerInternalMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: C4z.class */
public final class C4z {
    public final 1Br A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1De A03;
    public final ConcurrentMap A04;

    public C4z(FbUserSession fbUserSession, 1De r303) {
        11T.A0F(fbUserSession, 2);
        this.A03 = r303;
        1BY r0 = r303.A00;
        this.A01 = 1Lm.A03(fbUserSession, r0, 33124);
        this.A02 = 1Lm.A03(fbUserSession, r0, 82820);
        1pU r02 = new 1pU();
        r02.A03(MapMakerInternalMap.Strength.A01);
        this.A04 = r02.A00();
        this.A00 = 1Bu.A03(r0, 82821);
    }

    public LiveData A00(long j) {
        ConcurrentMap concurrentMap = this.A04;
        Long valueOf = Long.valueOf(j);
        Object obj = concurrentMap.get(valueOf);
        if (obj == null) {
            C00i c00i = this.A01.A00;
            c00i.get();
            C00i A0R = AbF.A0R(this.A02);
            1Br.A0C(this.A00);
            C21N c21n = (C21N) c00i.get();
            AdA adA = (AdA) A0R.get();
            1BL.A1F(c21n, adA);
            LiveData distinctUntilChanged = Transformations.distinctUntilChanged(new C1331Ae9(adA, c21n, j));
            obj = concurrentMap.putIfAbsent(valueOf, distinctUntilChanged);
            if (obj == null) {
                obj = distinctUntilChanged;
            }
        }
        return (LiveData) obj;
    }
}
