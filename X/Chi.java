package X;

import com.facebook.messaging.groups.create.logging.CreateGroupAggregatedReliabilityLogger;
import java.io.IOException;
import java.io.Serializable;

/* loaded from: Chi.class */
public final class Chi implements DIx {
    public java.util.Map A00 = 1BK.A1C();
    public final /* synthetic */ CreateGroupAggregatedReliabilityLogger A01;

    public Chi(CreateGroupAggregatedReliabilityLogger createGroupAggregatedReliabilityLogger) {
        this.A01 = createGroupAggregatedReliabilityLogger;
    }

    @Override // X.DIx
    public void A6G(Serializable serializable, String str, StringBuilder sb) {
        CreateGroupAggregatedReliabilityLogger.ReliabilityInfo reliabilityInfo = (CreateGroupAggregatedReliabilityLogger.ReliabilityInfo) serializable;
        if (sb.length() > 0) {
            sb.append(',');
        }
        sb.append(str);
        sb.append('=');
        sb.append(reliabilityInfo.creationType);
        sb.append(':');
        sb.append(reliabilityInfo.mqttRequests);
        sb.append(':');
        sb.append(reliabilityInfo.graphRequests);
        sb.append(':');
        CreateGroupAggregatedReliabilityLogger.ReliabilityInfo.Outcome outcome = reliabilityInfo.outcome;
        sb.append((outcome == CreateGroupAggregatedReliabilityLogger.ReliabilityInfo.Outcome.FAILURE_RETRYABLE || outcome == CreateGroupAggregatedReliabilityLogger.ReliabilityInfo.Outcome.FAILURE_PERMANENT || outcome == CreateGroupAggregatedReliabilityLogger.ReliabilityInfo.Outcome.UNKNOWN) ? reliabilityInfo.firstAttemptTimestamp : reliabilityInfo.timeSinceFirstAttempt);
        sb.append(':');
        sb.append(outcome == null ? CreateGroupAggregatedReliabilityLogger.ReliabilityInfo.Outcome.UNKNOWN.rawValue : outcome.rawValue);
        sb.append(':');
        sb.append(reliabilityInfo.errorCode);
    }

    @Override // X.DIx
    public String Aki() {
        return "create_group_reliability";
    }

    @Override // X.DIx
    public java.util.Map Aux() {
        return this.A00;
    }

    @Override // X.DIx
    public int Avg() {
        return 50;
    }

    @Override // X.DIx
    public 1G2 B48() {
        return 1G3.A01(1NK.A24, "create_group_reliability_serialized");
    }

    @Override // X.DIx
    public long BFu(Serializable serializable) {
        return ((CreateGroupAggregatedReliabilityLogger.ReliabilityInfo) serializable).firstAttemptTimestamp;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x002a, code lost:
    
        if (com.facebook.messaging.groups.create.logging.CreateGroupAggregatedReliabilityLogger.ReliabilityInfo.Outcome.A02.equals(r0) != false) goto L6;
     */
    @Override // X.DIx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean BSi(java.io.Serializable r302) {
        /*
            r301 = this;
            com.facebook.messaging.groups.create.logging.CreateGroupAggregatedReliabilityLogger$ReliabilityInfo$Outcome r0 = com.facebook.messaging.groups.create.logging.CreateGroupAggregatedReliabilityLogger.ReliabilityInfo.Outcome.UNKNOWN
            r303 = r0
            r0 = r302
            com.facebook.messaging.groups.create.logging.CreateGroupAggregatedReliabilityLogger$ReliabilityInfo r0 = (com.facebook.messaging.groups.create.logging.CreateGroupAggregatedReliabilityLogger.ReliabilityInfo) r0
            r302 = r0
            r0 = r302
            com.facebook.messaging.groups.create.logging.CreateGroupAggregatedReliabilityLogger$ReliabilityInfo$Outcome r0 = r0.outcome
            r304 = r0
            r0 = r303
            r1 = r304
            boolean r0 = r0.equals(r1)
            r305 = r0
            r0 = r305
            if (r0 != 0) goto L2d
            com.facebook.messaging.groups.create.logging.CreateGroupAggregatedReliabilityLogger$ReliabilityInfo$Outcome r0 = com.facebook.messaging.groups.create.logging.CreateGroupAggregatedReliabilityLogger.ReliabilityInfo.Outcome.FAILURE_RETRYABLE
            r303 = r0
            r0 = r303
            r1 = r304
            boolean r0 = r0.equals(r1)
            r306 = r0
            r0 = 1
            r305 = r0
            r0 = r306
            if (r0 == 0) goto L32
        L2d:
            r0 = 0
            r305 = r0
            r0 = 0
            r303 = r0
        L32:
            r0 = r305
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Chi.BSi(java.io.Serializable):boolean");
    }

    @Override // X.DIx
    public void BsW(Exception exc) {
        1BK.A09(this.A01.A01).D0v("create_group_reliability_data_changed_failed", "Failed to updated aggregated reliability data");
    }

    @Override // X.DIx
    public void BtC(Exception exc) {
        1BK.A09(this.A01.A01).softReport("create_group_reliability_deserialization_failed", exc);
    }

    @Override // X.DIx
    public void CBK(Exception exc) {
        1BK.A09(this.A01.A01).D0v("create_group_reliability_periodic_check_failed", "Failed to check for stale data");
    }

    @Override // X.DIx
    public void CKZ(IOException iOException) {
        1BK.A09(this.A01.A01).softReport("create_group_reliability_serialization_failed", iOException);
    }

    @Override // X.DIx
    public boolean CgD(Object obj, Object obj2) {
        C01s A09;
        String A0W;
        String str;
        CreateGroupAggregatedReliabilityLogger.ReliabilityInfo reliabilityInfo;
        CreateGroupAggregatedReliabilityLogger.ReliabilityInfo.Outcome outcome;
        BuT buT = (BuT) obj2;
        int ordinal = ((BLM) obj).ordinal();
        if (ordinal == 0) {
            String str2 = buT.A02;
            boolean z = buT.A04;
            if (this.A00.containsKey(str2)) {
                return false;
            }
            this.A00.put(str2, new CreateGroupAggregatedReliabilityLogger.ReliabilityInfo(1BL.A08(this.A01.A00), z ? K94.__redex_internal_original_name : "n"));
            return false;
        }
        if (ordinal == 1) {
            String str3 = buT.A02;
            Integer num = buT.A01;
            CreateGroupAggregatedReliabilityLogger.ReliabilityInfo reliabilityInfo2 = (CreateGroupAggregatedReliabilityLogger.ReliabilityInfo) this.A00.get(str3);
            if (reliabilityInfo2 != null) {
                if (num == 0S2.A00) {
                    reliabilityInfo2.mqttRequests++;
                    return true;
                }
                reliabilityInfo2.graphRequests++;
                return true;
            }
            A09 = 1BK.A09(this.A01.A01);
            A0W = 0Pz.A0W("No log for group creation with offline threading id ", str3);
            str = "create_group_no_log_on_attempt";
        } else if (ordinal == 2) {
            String str4 = buT.A02;
            Integer num2 = buT.A01;
            reliabilityInfo = (CreateGroupAggregatedReliabilityLogger.ReliabilityInfo) this.A00.get(str4);
            CreateGroupAggregatedReliabilityLogger createGroupAggregatedReliabilityLogger = this.A01;
            if (reliabilityInfo != null) {
                reliabilityInfo.timeSinceFirstAttempt = 1BL.A08(createGroupAggregatedReliabilityLogger.A00) - reliabilityInfo.firstAttemptTimestamp;
                outcome = num2 == 0S2.A00 ? CreateGroupAggregatedReliabilityLogger.ReliabilityInfo.Outcome.SUCCESS_MQTT : CreateGroupAggregatedReliabilityLogger.ReliabilityInfo.Outcome.SUCCESS_GRAPH;
                reliabilityInfo.outcome = outcome;
                return true;
            }
            A09 = 1BK.A09(createGroupAggregatedReliabilityLogger.A01);
            A0W = 0Pz.A0W("No log for group creation with offline threading id ", str4);
            str = "create_group_no_log_on_success";
        } else if (ordinal == 3) {
            String str5 = buT.A02;
            int i = buT.A00;
            CreateGroupAggregatedReliabilityLogger.ReliabilityInfo reliabilityInfo3 = (CreateGroupAggregatedReliabilityLogger.ReliabilityInfo) this.A00.get(str5);
            if (reliabilityInfo3 != null) {
                reliabilityInfo3.timeSinceFirstAttempt = 1BL.A08(this.A01.A00) - reliabilityInfo3.firstAttemptTimestamp;
                if (i == -1) {
                    return true;
                }
                reliabilityInfo3.errorCode = i;
                return true;
            }
            A09 = 1BK.A09(this.A01.A01);
            A0W = 0Pz.A0W("No log for group creation with offline threading id ", str5);
            str = "create_group_no_log_on_attempt_failure";
        } else {
            if (ordinal != 4) {
                return false;
            }
            String str6 = buT.A02;
            boolean z2 = buT.A03;
            reliabilityInfo = (CreateGroupAggregatedReliabilityLogger.ReliabilityInfo) this.A00.get(str6);
            CreateGroupAggregatedReliabilityLogger createGroupAggregatedReliabilityLogger2 = this.A01;
            if (reliabilityInfo != null) {
                reliabilityInfo.timeSinceFirstAttempt = 1BL.A08(createGroupAggregatedReliabilityLogger2.A00) - reliabilityInfo.firstAttemptTimestamp;
                outcome = z2 ? CreateGroupAggregatedReliabilityLogger.ReliabilityInfo.Outcome.FAILURE_PERMANENT : CreateGroupAggregatedReliabilityLogger.ReliabilityInfo.Outcome.FAILURE_RETRYABLE;
                reliabilityInfo.outcome = outcome;
                return true;
            }
            A09 = 1BK.A09(createGroupAggregatedReliabilityLogger2.A01);
            A0W = 0Pz.A0W("No log for group creation with offline threading id ", str6);
            str = "create_group_no_log_on_failure";
        }
        A09.D0v(str, A0W);
        return false;
    }

    @Override // X.DIx
    public void Cqw(java.util.Map map) {
        this.A00 = map;
    }
}
