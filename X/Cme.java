package X;

import android.os.RemoteException;
import com.facebook.fbtrace.FbTraceNode;
import com.facebook.messaging.mqtt.request.MqttRetriableRequestHandler;
import com.facebook.messaging.service.model.AddMembersParams;
import com.facebook.messaging.service.model.FetchThreadResult;

/* loaded from: Cme.class */
public final class Cme implements DJ1 {
    public final C00i A00;
    public final C00i A01;

    public Cme() {
        this.A00 = 1BV.A00(84653);
        this.A01 = 1BQ.A02(16921);
    }

    public Cme(int i) {
    }

    @Override // X.DJ1
    public BFj AKm(C01s c01s, R10 r10, DHB dhb, MqttRetriableRequestHandler.Deserializer deserializer, 2Ay r306, Object obj, int i, long j) {
        return ((2Aw) this.A01.get()).A01(c01s, new Rvx(deserializer, this, (AddMembersParams) obj), r306, dhb.B7o());
    }

    @Override // X.DJ1
    public FbTraceNode Ali(R10 r10, DHB dhb, Object obj, int i, long j) {
        return null;
    }

    @Override // X.DJ1
    public DHC BA5() {
        return (DHC) this.A00.get();
    }

    @Override // X.DJ1
    public DHB BFW() {
        return Qut.A02;
    }

    @Override // X.DJ1
    public void BiU(R10 r10, DHB dhb, Object obj, int i, long j, long j2) {
    }

    @Override // X.DJ1
    public void BlG(FbTraceNode fbTraceNode, R10 r10, DHB dhb, Object obj, int i, long j) {
    }

    @Override // X.DJ1
    public Rql C1F(R10 r10, DHB dhb, Exception exc, Object obj, int i, long j) {
        BOu bOu = BOu.A05;
        return RVH.A00(bOu, (String) null, bOu.errorCode);
    }

    @Override // X.DJ1
    public DFL CAL(R10 r10, DHB dhb, Exception exc, Object obj, int i, long j) {
        return null;
    }

    @Override // X.DJ1
    public DFL CEg(R10 r10, DHB dhb, Object obj, int i, long j) {
        return null;
    }

    @Override // X.DJ1
    public Rql CEi(RemoteException remoteException, R10 r10, DHB dhb, Object obj, int i, long j) {
        BOu bOu = BOu.A07;
        return RVH.A00(bOu, remoteException.getMessage(), bOu.errorCode);
    }

    @Override // X.DJ1
    public void CEl(R10 r10, DHB dhb, Object obj, int i, long j, long j2) {
    }

    @Override // X.DJ1
    public Rql CGI(R10 r10, DHB dhb, Exception exc, Object obj, int i, long j) {
        return RVH.A01(exc, BOu.A0F.errorCode);
    }

    @Override // X.DJ1
    public Rql CHy(RNh rNh, R10 r10, DHB dhb, Object obj, int i, long j, long j2) {
        return RVH.A00(BOu.A08, rNh.A01, rNh.A00);
    }

    @Override // X.DJ1
    public Rql CP1(RNh rNh, R10 r10, DHB dhb, Object obj, int i, long j) {
        QPG qpg = (QPG) rNh;
        FetchThreadResult fetchThreadResult = qpg.A00;
        RqC rqC = new RqC(qpg.A01);
        11T.A0F(fetchThreadResult, 0);
        return new Rql(BOu.A0G, rqC, fetchThreadResult, (Exception) null, 0S2.A0C, (String) null, 0);
    }

    @Override // X.DJ1
    public Rql CQf(R10 r10, DHB dhb, Object obj, int i, long j, long j2) {
        BOu bOu = BOu.A0A;
        return RVH.A00(bOu, (String) null, bOu.errorCode);
    }

    @Override // X.DJ1
    public Rql CQg(R10 r10, DHB dhb, Object obj, int i, long j, long j2) {
        BOu bOu = BOu.A0B;
        return RVH.A00(bOu, (String) null, bOu.errorCode);
    }

    @Override // X.DJ1
    public Rql CSM(RNh rNh, R10 r10, DHB dhb, Object obj, int i, long j, long j2) {
        int i2 = rNh.A00;
        String str = rNh.A01;
        return new Rql(BOu.A04, (DI5) null, (FetchThreadResult) null, (Exception) null, 0S2.A01, str, i2);
    }
}
