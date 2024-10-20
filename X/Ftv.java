package X;

import android.os.Bundle;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.zero.sdk.fb4a.statusupdate.notifyserver.NotifyServerUserAckedParams;

/* loaded from: Ftv.class */
public final class Ftv implements GGj {
    public final EmW A00;

    public Ftv(EmW emW) {
        this.A00 = emW;
    }

    @Override // X.GGj
    public /* bridge */ /* synthetic */ void BhS(3oI r302, Object obj) {
        EDj eDj = (AbstractC10314t5) obj;
        if (eDj instanceof EDj) {
            EDj eDj2 = eDj;
            EmW emW = this.A00;
            F98 f98 = eDj2.A00;
            Ejx ejx = new Ejx(r302, this);
            FcD fcD = (FcD) emW.A02.get();
            String str = f98.A02;
            NotifyServerUserAckedParams notifyServerUserAckedParams = new NotifyServerUserAckedParams(str);
            Bundle A05 = 1BK.A05();
            A05.putParcelable("notifyServerUserAckedParams", notifyServerUserAckedParams);
            String A00 = 1BJ.A00(502);
            1IB A0M = 4YU.A0M(A05, CallerContext.A06(FcD.class), 4YU.A0L(fcD.A00), A00, true);
            1Kd.A0D(emW.A01, new FwG(emW, ejx, str, 7), A0M);
        }
    }
}
