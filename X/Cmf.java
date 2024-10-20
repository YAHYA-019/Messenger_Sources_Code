package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.messaging.groups.create.logging.CreateGroupAggregatedLatencyLogger;
import com.facebook.messaging.groups.create.logging.CreateGroupAggregatedReliabilityLogger;
import com.facebook.messaging.groups.create.model.CreateCustomizableGroupParams;
import com.facebook.messaging.service.model.FetchThreadResult;
import com.google.common.base.Platform;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import java.util.Locale;

/* loaded from: Cmf.class */
public final class Cmf implements DIy {
    public final /* synthetic */ C3Sy A00;

    public Cmf(C3Sy c3Sy) {
        this.A00 = c3Sy;
    }

    public static 2Iq A00(C3Sy c3Sy) {
        return (2Iq) c3Sy.A04.get();
    }

    /* JADX WARN: Type inference failed for: r0v59, types: [X.Afu, X.2J3] */
    private void A01(Rql rql) {
        C1kw A06 = 1BK.A06(this.A00.A0B);
        if (C1387Afu.A00 == null) {
            synchronized (C1387Afu.class) {
                if (C1387Afu.A00 == null) {
                    C1387Afu.A00 = new C2J3(A06);
                }
            }
        }
        boolean z = false;
        AbstractC01593ro A07 = AbF.A07(C1387Afu.A00, "create_group_mqtt_failure", false);
        if (A07.A0B()) {
            A07.A06("errorName", rql.A01.name());
            A07.A06("error", rql.A03());
            A07.A04("errorNumber", rql.A00());
            if (rql.A02() != null) {
                A07.A06("exception", rql.A02().toString());
            }
            Integer num = rql.A03;
            Integer num2 = 0S2.A01;
            if (num == num2) {
                z = true;
            }
            Preconditions.checkState(z);
            String str = rql.A04;
            if (str != null) {
                Preconditions.checkState(AnonymousClass001.A1W(num, num2));
                A07.A06("errorMessage", str);
            }
            A07.A0A();
        }
    }

    @Override // X.DIy
    public DJ1 AyQ() {
        return (DJ1) this.A00.A06.get();
    }

    @Override // X.DIy
    public BOu Beg(Object obj, Object obj2) {
        CreateCustomizableGroupParams createCustomizableGroupParams = (CreateCustomizableGroupParams) obj;
        return createCustomizableGroupParams.A00 == 0 ? BOu.A0J : createCustomizableGroupParams.A08 != null ? BOu.A0K : !Platform.stringIsNullOrEmpty(createCustomizableGroupParams.A0C) ? BOu.A0H : BOu.A0G;
    }

    @Override // X.DIy
    public void BlH(Object obj, Object obj2) {
        0fH.A0A(C3Sy.class, "Before MQTT request attempt loop");
        C3Sy c3Sy = this.A00;
        ((3TF) c3Sy.A0A.get()).A04((CreateCustomizableGroupParams) obj, 0S2.A00, c3Sy.A01.A0M());
    }

    @Override // X.DIy
    public void BlI(Object obj, Object obj2) {
        0fH.A0A(C3Sy.class, "Before MQTT request");
        A00(this.A00).A00("create_group_mqtt_start");
    }

    @Override // X.DIy
    public Rql C1X(DEH deh, Object obj, Object obj2) {
        BOu bOu = (BOu) deh;
        0fH.A07(C3Sy.class, bOu.message, "Request incompatible with MQTT: '%s'");
        C3Sy c3Sy = this.A00;
        ((3TF) c3Sy.A0A.get()).A00.A09(AbstractC00603o4.A00(ActionId.DISPLAYED_ON_SCREEN), "skipped", C45m.A00("offline_threading_id", Long.toString(((CreateCustomizableGroupParams) obj).A00), "mqtt_reason", bOu.message, "network_connected", Boolean.toString(c3Sy.A01.A0M()), "network_channel", "mqtt"));
        return new Rql(bOu, (DI5) null, (FetchThreadResult) null, (Exception) null, 0S2.A00, (String) null, 0);
    }

    @Override // X.DIy
    public /* bridge */ /* synthetic */ Object C7p(DFL dfl, Object obj, Object obj2) {
        0fH.A0A(C3Sy.class, "Falling back to GraphQL/Graph API");
        Rql rql = (Rql) dfl;
        A00(this.A00).A00(0Pz.A0W("create_group_mqtt_", rql.A01.name().toLowerCase(Locale.US)));
        if (rql.A03 != 0S2.A01) {
            return null;
        }
        A01(rql);
        return null;
    }

    @Override // X.DIy
    public Rql C7u(DFL dfl, C08t c08t, C08t c08t2, Exception exc, Object obj, Object obj2, int i, long j, boolean z) {
        Rql A01 = RVH.A01(exc, BOu.A0D.errorCode);
        0fH.A0G(C3Sy.class, "MQTT request attempt failed with an exception", exc);
        C3Sy c3Sy = this.A00;
        A00(c3Sy).A00("create_group_mqtt_request_failed_exception");
        ((3TF) c3Sy.A0A.get()).A03((CreateCustomizableGroupParams) obj, c08t, c08t2, A01.A03(), A01.A00(), i, j, A01.BWv(), z);
        return A01;
    }

    @Override // X.DIy
    public void C7v(DFL dfl, C08t c08t, C08t c08t2, Object obj, Object obj2, int i, long j, long j2, boolean z) {
        CreateCustomizableGroupParams createCustomizableGroupParams = (CreateCustomizableGroupParams) obj;
        Rql rql = (Rql) dfl;
        String str = dfl.BWv() ? "un" : "";
        0fH.A0V(str, C3Sy.class, "MQTT request attempt failed %sretriably: '%s'", rql.A03());
        C3Sy c3Sy = this.A00;
        A00(c3Sy).A00(0Pz.A0j("create_group_mqtt_request_failed_", str, 4YT.A00(435)));
        CreateGroupAggregatedReliabilityLogger createGroupAggregatedReliabilityLogger = (CreateGroupAggregatedReliabilityLogger) c3Sy.A02.get();
        long j3 = createCustomizableGroupParams.A00;
        createGroupAggregatedReliabilityLogger.A00(j3, rql.A00());
        ((CN0) c3Sy.A08.get()).A01((Exception) null, String.valueOf(j3), rql.A03(), rql.A00(), j2, true);
        ((3TF) c3Sy.A0A.get()).A03(createCustomizableGroupParams, c08t, c08t2, rql.A03(), rql.A00(), i, j, rql.BWv(), z);
    }

    @Override // X.DIy
    public void C7w(DFL dfl, C08t c08t, C08t c08t2, Object obj, Object obj2, int i, long j, boolean z) {
        0fH.A0A(C3Sy.class, "MQTT request attempt skipped");
        C3Sy c3Sy = this.A00;
        A00(c3Sy).A00("create_group_mqtt_request_skipped");
        ((3TF) c3Sy.A0A.get()).A00.A09(1BJ.A00(89), "skipped", C45m.A00("offline_threading_id", Long.toString(((CreateCustomizableGroupParams) obj).A00), "mqtt_reason", ((Rql) dfl).A03(), 1BJ.A00(1766), Integer.toString(i), 1BJ.A00(1432), c08t.toString(), "network_connected", Boolean.toString(z), "network_channel", "mqtt", "send_time_delta", Long.toString(j)));
    }

    @Override // X.DIy
    public void C7x(DFL dfl, C08t c08t, C08t c08t2, Object obj, Object obj2, int i, long j, boolean z) {
        CreateCustomizableGroupParams createCustomizableGroupParams = (CreateCustomizableGroupParams) obj;
        0fH.A0A(C3Sy.class, "MQTT request attempt succeeded");
        C3Sy c3Sy = this.A00;
        A00(c3Sy).A00("create_group_mqtt_request_success");
        CreateGroupAggregatedReliabilityLogger createGroupAggregatedReliabilityLogger = (CreateGroupAggregatedReliabilityLogger) c3Sy.A02.get();
        long j2 = createCustomizableGroupParams.A00;
        Integer num = 0S2.A00;
        createGroupAggregatedReliabilityLogger.A03(num, j2);
        ((3TF) c3Sy.A0A.get()).A02(createCustomizableGroupParams, c08t, c08t2, num, i, j, z);
    }

    @Override // X.DIy
    public /* bridge */ /* synthetic */ FetchThreadResult C7y(DFL dfl, Object obj, Object obj2) {
        Rql rql = (Rql) dfl;
        0fH.A07(C3Sy.class, rql.A01() != null ? AbF.A14(rql.A01().A05.A0n) : "", "MQTT success: %s");
        A00(this.A00).A00("create_group_mqtt_success");
        return rql.A01();
    }

    @Override // X.DIy
    public void CMr(Object obj, Object obj2, int i) {
        0fH.A07(C3Sy.class, Integer.valueOf(i), "Before MQTT request attempt %s");
        C3Sy c3Sy = this.A00;
        A00(c3Sy).A00("create_group_mqtt_request_start");
        CreateGroupAggregatedReliabilityLogger createGroupAggregatedReliabilityLogger = (CreateGroupAggregatedReliabilityLogger) c3Sy.A02.get();
        long j = ((CreateCustomizableGroupParams) obj).A00;
        createGroupAggregatedReliabilityLogger.A02(0S2.A00, j);
        CDK.A00(((CreateGroupAggregatedLatencyLogger) c3Sy.A09.get()).A03, BLb.A03, j);
    }

    @Override // X.DIy
    public Exception CSN(DFL dfl, Object obj, Object obj2) {
        Rql rql = (Rql) dfl;
        0fH.A07(C3Sy.class, rql.A03(), "Unretriable MQTT failure: '%s'");
        A00(this.A00).A00(0Pz.A0W("create_group_mqtt_", rql.A01.name().toLowerCase(Locale.US)));
        A01(rql);
        RqD rqD = rql.A02;
        if (rqD != null) {
            RqD rqD2 = rqD;
            boolean z = rqD2.A03;
            Preconditions.checkState(z);
            ImmutableList immutableList = rqD2.A02;
            if (09K.A00(immutableList)) {
                Preconditions.checkState(z);
                return new BPS(immutableList);
            }
        }
        String A03 = rql.A03();
        return new BPT((CreateCustomizableGroupParams) obj, rql.A02(), A03);
    }
}
