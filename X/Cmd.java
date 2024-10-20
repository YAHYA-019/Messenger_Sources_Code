package X;

import android.content.Context;
import android.os.RemoteException;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.fbtrace.FbTraceNode;
import com.facebook.messaging.groups.create.logging.CreateGroupAggregatedLatencyLogger;
import com.facebook.messaging.groups.create.model.CreateCustomizableGroupParams;
import com.facebook.messaging.mqtt.request.MqttRetriableRequestHandler;
import com.facebook.messaging.service.model.FetchThreadResult;

/* loaded from: Cmd.class */
public final class Cmd implements DJ1 {
    public 1BY A00;
    public final C00i A01 = 1BQ.A01();
    public final 2Aw A08 = (2Aw) 1Bi.A03(16921);
    public final C00i A02 = 1BV.A01((1BY) null, 84512);
    public final CHp A03 = (CHp) 1Bi.A03(84675);
    public final C00i A04 = 1BQ.A02(84666);
    public final C00i A06 = 1BQ.A02(84622);
    public final C00i A05 = 1BQ.A02(84488);
    public final Cmb A07 = (Cmb) 1Bn.A0E((Context) null, (1BY) null, 82731);

    public Cmd(1BO r302) {
        this.A00 = 7zL.A0Q(r302);
    }

    @Override // X.DJ1
    public BFj AKm(C01s c01s, R10 r10, DHB dhb, MqttRetriableRequestHandler.Deserializer deserializer, 2Ay r306, Object obj, int i, long j) {
        FbUserSession A05 = 1Fw.A05(this.A00);
        return this.A08.A01(c01s, new Rvy(A05, (CreateCustomizableGroupParams) obj, deserializer, this), r306, dhb.B7o());
    }

    @Override // X.DJ1
    public FbTraceNode Ali(R10 r10, DHB dhb, Object obj, int i, long j) {
        FbTraceNode fbTraceNode = ((CreateCustomizableGroupParams) obj).A05;
        if (fbTraceNode != null) {
            return CHp.A00(fbTraceNode);
        }
        return null;
    }

    @Override // X.DJ1
    public DHC BA5() {
        return this.A07;
    }

    @Override // X.DJ1
    public DHB BFW() {
        return Quu.A02;
    }

    @Override // X.DJ1
    public void BiU(R10 r10, DHB dhb, Object obj, int i, long j, long j2) {
        CreateGroupAggregatedLatencyLogger createGroupAggregatedLatencyLogger = (CreateGroupAggregatedLatencyLogger) this.A04.get();
        long j3 = ((CreateCustomizableGroupParams) obj).A00;
        CDK.A00(createGroupAggregatedLatencyLogger.A03, BLb.A05, j3);
        3TF r0 = (3TF) this.A06.get();
        r0.A00.A09(1BJ.A00(89), "pub_ack", C45m.A00("offline_threading_id", Long.toString(j3), "send_time_delta", Long.toString(1BL.A09(this.A05) - j2), "current_time", 3TF.A01(r0), "network_channel", "mqtt"));
    }

    @Override // X.DJ1
    public void BlG(FbTraceNode fbTraceNode, R10 r10, DHB dhb, Object obj, int i, long j) {
        if (fbTraceNode != null) {
            DKA A00 = BRr.A00(fbTraceNode);
            A00.put("op", "mqtt_group_create_attempt");
            A00.put(AnonymousClass000.A00(29), Integer.valueOf(i));
        }
    }

    @Override // X.DJ1
    public Rql C1F(R10 r10, DHB dhb, Exception exc, Object obj, int i, long j) {
        0fH.A0G(Cmd.class, "MQTT attempt failed with IOException", exc);
        return RVH.A01(exc, BOu.A0E.errorCode);
    }

    @Override // X.DJ1
    public DFL CAL(R10 r10, DHB dhb, Exception exc, Object obj, int i, long j) {
        0fH.A0G(Cmd.class, "MQTT attempt failed with generic Exception", exc);
        return RVH.A01(exc, BOu.A0D.errorCode);
    }

    @Override // X.DJ1
    public DFL CEg(R10 r10, DHB dhb, Object obj, int i, long j) {
        0fH.A0A(Cmd.class, "MQTT request publication failed");
        BOu bOu = BOu.A05;
        return RVH.A00(bOu, (String) null, bOu.errorCode);
    }

    @Override // X.DJ1
    public Rql CEi(RemoteException remoteException, R10 r10, DHB dhb, Object obj, int i, long j) {
        0fH.A0G(Cmd.class, "MQTT request publication failed with RemoteException", remoteException);
        BOu bOu = BOu.A07;
        return RVH.A00(bOu, remoteException.getMessage(), bOu.errorCode);
    }

    @Override // X.DJ1
    public void CEl(R10 r10, DHB dhb, Object obj, int i, long j, long j2) {
        0fH.A0A(Cmd.class, "MQTT request publication succeeded");
        ((CreateGroupAggregatedLatencyLogger) this.A04.get()).A03.A03(BLb.A04, new CDK(j2, String.valueOf(((CreateCustomizableGroupParams) obj).A00), true));
    }

    @Override // X.DJ1
    public Rql CGI(R10 r10, DHB dhb, Exception exc, Object obj, int i, long j) {
        0fH.A0G(Cmd.class, "MQTT attempt failed with RemoteException", exc);
        return RVH.A01(exc, BOu.A0F.errorCode);
    }

    @Override // X.DJ1
    public Rql CHy(RNh rNh, R10 r10, DHB dhb, Object obj, int i, long j, long j2) {
        String str = rNh.A01;
        0fH.A07(Cmd.class, str, "MQTT response indicated a retriable failure: '%s'");
        return RVH.A00(BOu.A08, str, rNh.A00);
    }

    @Override // X.DJ1
    public Rql CP1(RNh rNh, R10 r10, DHB dhb, Object obj, int i, long j) {
        0fH.A0A(Cmd.class, "MQTT response indicated success");
        CreateGroupAggregatedLatencyLogger createGroupAggregatedLatencyLogger = (CreateGroupAggregatedLatencyLogger) this.A04.get();
        CDK.A00(createGroupAggregatedLatencyLogger.A03, BLb.A06, ((CreateCustomizableGroupParams) obj).A00);
        FetchThreadResult fetchThreadResult = ((QPH) rNh).A00;
        11T.A0F(fetchThreadResult, 0);
        return new Rql(BOu.A0G, (DI5) null, fetchThreadResult, (Exception) null, 0S2.A0C, (String) null, 0);
    }

    @Override // X.DJ1
    public Rql CQf(R10 r10, DHB dhb, Object obj, int i, long j, long j2) {
        0fH.A0A(Cmd.class, "Timed out after MQTT request publication");
        BOu bOu = BOu.A0A;
        return RVH.A00(bOu, (String) null, bOu.errorCode);
    }

    @Override // X.DJ1
    public Rql CQg(R10 r10, DHB dhb, Object obj, int i, long j, long j2) {
        0fH.A0A(Cmd.class, "Timed out while waiting for MQTT response");
        BOu bOu = BOu.A0B;
        return RVH.A00(bOu, (String) null, bOu.errorCode);
    }

    @Override // X.DJ1
    public Rql CSM(RNh rNh, R10 r10, DHB dhb, Object obj, int i, long j, long j2) {
        0fH.A07(Cmd.class, rNh.A01, "MQTT response indicated an unretriable failure: '%s'");
        QPH qph = (QPH) rNh;
        int i2 = ((RNh) qph).A00;
        String str = ((RNh) qph).A01;
        return new Rql(BOu.A04, new RqD(qph.A01), (FetchThreadResult) null, (Exception) null, 0S2.A01, str, i2);
    }
}
