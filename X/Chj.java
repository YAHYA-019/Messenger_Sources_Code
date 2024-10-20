package X;

import com.facebook.messaging.groups.create.logging.CreateGroupAggregatedLatencyLogger;
import java.io.IOException;
import java.io.Serializable;

/* loaded from: Chj.class */
public final class Chj implements DIx {
    public java.util.Map A00;
    public final /* synthetic */ CreateGroupAggregatedLatencyLogger A01;

    public Chj(CreateGroupAggregatedLatencyLogger createGroupAggregatedLatencyLogger) {
        this.A01 = createGroupAggregatedLatencyLogger;
    }

    public static C01s A00(Chj chj) {
        return (C01s) chj.A01.A01.get();
    }

    public static Long A01(CreateGroupAggregatedLatencyLogger.LatencyInfo latencyInfo, long j) {
        long j2 = latencyInfo.startMs;
        long j3 = -1;
        return Long.valueOf((j == j3 || j2 == j3) ? -1 : j - j2);
    }

    private void A02(CreateGroupAggregatedLatencyLogger.LatencyInfo latencyInfo) {
        synchronized (this) {
            C1m1 c1m1 = this.A01.A04;
            if (!c1m1.A03() || c1m1.A00() > latencyInfo.startMqttConnectionMs) {
                latencyInfo.sameMqttConnection = false;
            }
        }
    }

    @Override // X.DIx
    public void A6G(Serializable serializable, String str, StringBuilder sb) {
        CreateGroupAggregatedLatencyLogger.LatencyInfo latencyInfo = (CreateGroupAggregatedLatencyLogger.LatencyInfo) serializable;
        if (sb.length() > 0) {
            sb.append(',');
        }
        sb.append(str);
        sb.append('=');
        sb.append(latencyInfo.creationType);
        sb.append(':');
        sb.append(latencyInfo.sameMqttConnection ? 1 : 0);
        sb.append(':');
        long j = latencyInfo.appStartMs;
        long j2 = latencyInfo.startMs;
        long j3 = -1;
        sb.append((j == j3 || j2 == j3) ? -1 : j - j2);
        sb.append(':');
        long j4 = latencyInfo.preRequestMs;
        sb.append((j4 == j3 || j2 == j3) ? -1 : j4 - j2);
        sb.append(':');
        long j5 = latencyInfo.requestPublishedMs;
        sb.append((j5 == j3 || j4 == j3) ? -1 : j5 - j4);
        sb.append(':');
        long j6 = latencyInfo.requestPubAckMs;
        sb.append((j6 == j3 || j4 == j3) ? -1 : j6 - j4);
        sb.append(':');
        long j7 = latencyInfo.requestResponseMs;
        sb.append((j7 == j3 || j4 == j3) ? -1 : j7 - j4);
        sb.append(':');
        long j8 = latencyInfo.webSuccessMs;
        sb.append((j8 == j3 || j2 == j3) ? -1 : j8 - j2);
        sb.append(':');
        long j9 = latencyInfo.appSuccessMs;
        sb.append((j9 == j3 || j2 == j3) ? -1 : j9 - j2);
        sb.append(':');
        long j10 = latencyInfo.uiSuccessMs;
        sb.append((j10 == j3 || j2 == j3) ? -1 : j10 - j2);
    }

    @Override // X.DIx
    public String Aki() {
        return "create_group_latency";
    }

    @Override // X.DIx
    public java.util.Map Aux() {
        return this.A00;
    }

    @Override // X.DIx
    public int Avg() {
        return 20;
    }

    @Override // X.DIx
    public 1G2 B48() {
        return 1G3.A01(1NK.A24, "create_group_latency_serialized");
    }

    @Override // X.DIx
    public long BFu(Serializable serializable) {
        return ((CreateGroupAggregatedLatencyLogger.LatencyInfo) serializable).startMqttConnectionMs;
    }

    @Override // X.DIx
    public boolean BSi(Serializable serializable) {
        return AnonymousClass001.A1N((((CreateGroupAggregatedLatencyLogger.LatencyInfo) serializable).appSuccessMs > (-1) ? 1 : (((CreateGroupAggregatedLatencyLogger.LatencyInfo) serializable).appSuccessMs == (-1) ? 0 : -1)));
    }

    @Override // X.DIx
    public void BsW(Exception exc) {
        A00(this).D0v("create_group_latency_data_changed_failed", "Failed to updated aggregated reliability data");
    }

    @Override // X.DIx
    public void BtC(Exception exc) {
        A00(this).softReport("create_group_latency_deserialization_failed", exc);
    }

    @Override // X.DIx
    public void CBK(Exception exc) {
        A00(this).D0v("create_group_latency_periodic_check_failed", "Failed to check for stale data");
    }

    @Override // X.DIx
    public void CKZ(IOException iOException) {
        A00(this).softReport("create_group_latency_serialization_failed", iOException);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0010. Please report as an issue. */
    @Override // X.DIx
    public boolean CgD(Object obj, Object obj2) {
        String str;
        Class cls;
        Long valueOf;
        Long A01;
        String str2;
        C01s A00;
        String A0W;
        String str3;
        CDK cdk = (CDK) obj2;
        switch (((BLb) obj).ordinal()) {
            case 0:
                String str4 = cdk.A01;
                if (this.A00.containsKey(str4)) {
                    return false;
                }
                CreateGroupAggregatedLatencyLogger createGroupAggregatedLatencyLogger = this.A01;
                CreateGroupAggregatedLatencyLogger.LatencyInfo latencyInfo = new CreateGroupAggregatedLatencyLogger.LatencyInfo(createGroupAggregatedLatencyLogger.A00.now(), 1BL.A08(createGroupAggregatedLatencyLogger.A02));
                this.A00.put(str4, latencyInfo);
                0fH.A0X(str4, CreateGroupAggregatedLatencyLogger.class, "reportUiStart, id=%s, ts=%s", Long.valueOf(latencyInfo.startMs));
                return true;
            case 1:
                str = cdk.A01;
                boolean z = cdk.A02;
                CreateGroupAggregatedLatencyLogger.LatencyInfo latencyInfo2 = (CreateGroupAggregatedLatencyLogger.LatencyInfo) this.A00.get(str);
                if (latencyInfo2 == null) {
                    A00 = A00(this);
                    A0W = 0Pz.A0W("No log for group creation with offline threading id ", str);
                    str3 = "create_group_no_log_on_app_start";
                    A00.D0v(str3, A0W);
                    return false;
                }
                if (latencyInfo2.appStartMs != -1) {
                    return false;
                }
                long now = this.A01.A00.now();
                latencyInfo2.appStartMs = now;
                latencyInfo2.creationType = z ? K94.__redex_internal_original_name : "n";
                cls = CreateGroupAggregatedLatencyLogger.class;
                valueOf = Long.valueOf(now);
                A01 = A01(latencyInfo2, now);
                str2 = "reportAppStart, id=%s, ts=%s, diff=%s";
                0fH.A06(cls, str, valueOf, A01, str2);
                return true;
            case 2:
                str = cdk.A01;
                CreateGroupAggregatedLatencyLogger.LatencyInfo latencyInfo3 = (CreateGroupAggregatedLatencyLogger.LatencyInfo) this.A00.get(str);
                if (latencyInfo3 == null) {
                    A00 = A00(this);
                    A0W = 0Pz.A0W("No log for group creation with offline threading id ", str);
                    str3 = "create_group_no_log_on_request";
                    A00.D0v(str3, A0W);
                    return false;
                }
                if (latencyInfo3.preRequestMs != -1) {
                    return false;
                }
                latencyInfo3.preRequestMs = this.A01.A00.now();
                A02(latencyInfo3);
                cls = CreateGroupAggregatedLatencyLogger.class;
                long j = latencyInfo3.preRequestMs;
                valueOf = Long.valueOf(j);
                A01 = A01(latencyInfo3, j);
                str2 = "reportPreRequest, id=%s, ts=%s, diff=%s";
                0fH.A06(cls, str, valueOf, A01, str2);
                return true;
            case 3:
                str = cdk.A01;
                long j2 = cdk.A00;
                CreateGroupAggregatedLatencyLogger.LatencyInfo latencyInfo4 = (CreateGroupAggregatedLatencyLogger.LatencyInfo) this.A00.get(str);
                if (latencyInfo4 == null) {
                    A00 = A00(this);
                    A0W = 0Pz.A0W("No log for group creation with offline threading id ", str);
                    str3 = "create_group_no_log_on_publish";
                    A00.D0v(str3, A0W);
                    return false;
                }
                if (latencyInfo4.requestPublishedMs != -1) {
                    return false;
                }
                latencyInfo4.requestPublishedMs = j2;
                A02(latencyInfo4);
                cls = CreateGroupAggregatedLatencyLogger.class;
                long j3 = latencyInfo4.requestPublishedMs;
                valueOf = Long.valueOf(j3);
                A01 = A01(latencyInfo4, j3);
                str2 = "reportRequestPublished, id=%s, ts=%s, diff=%s";
                0fH.A06(cls, str, valueOf, A01, str2);
                return true;
            case 4:
                str = cdk.A01;
                CreateGroupAggregatedLatencyLogger.LatencyInfo latencyInfo5 = (CreateGroupAggregatedLatencyLogger.LatencyInfo) this.A00.get(str);
                if (latencyInfo5 == null) {
                    A00 = A00(this);
                    A0W = 0Pz.A0W("No log for group creation with offline threading id ", str);
                    str3 = "create_group_no_log_on_pub_ack";
                    A00.D0v(str3, A0W);
                    return false;
                }
                if (latencyInfo5.requestPubAckMs != -1) {
                    return false;
                }
                latencyInfo5.requestPubAckMs = this.A01.A00.now();
                A02(latencyInfo5);
                cls = CreateGroupAggregatedLatencyLogger.class;
                long j4 = latencyInfo5.requestPubAckMs;
                valueOf = Long.valueOf(j4);
                A01 = A01(latencyInfo5, j4);
                str2 = "reportRequestPubAck, id=%s, ts=%s, diff=%s";
                0fH.A06(cls, str, valueOf, A01, str2);
                return true;
            case 5:
                str = cdk.A01;
                CreateGroupAggregatedLatencyLogger.LatencyInfo latencyInfo6 = (CreateGroupAggregatedLatencyLogger.LatencyInfo) this.A00.get(str);
                if (latencyInfo6 == null) {
                    A00 = A00(this);
                    A0W = 0Pz.A0W("No log for group creation with offline threading id ", str);
                    str3 = "create_group_no_log_on_response";
                    A00.D0v(str3, A0W);
                    return false;
                }
                if (latencyInfo6.requestResponseMs != -1) {
                    return false;
                }
                latencyInfo6.requestResponseMs = this.A01.A00.now();
                A02(latencyInfo6);
                cls = CreateGroupAggregatedLatencyLogger.class;
                long j5 = latencyInfo6.requestResponseMs;
                valueOf = Long.valueOf(j5);
                A01 = A01(latencyInfo6, j5);
                str2 = "reportRequestResponse, id=%s, ts=%s, diff=%s";
                0fH.A06(cls, str, valueOf, A01, str2);
                return true;
            case 6:
                str = cdk.A01;
                CreateGroupAggregatedLatencyLogger.LatencyInfo latencyInfo7 = (CreateGroupAggregatedLatencyLogger.LatencyInfo) this.A00.get(str);
                if (latencyInfo7 == null) {
                    A00 = A00(this);
                    A0W = 0Pz.A0W("No log for group creation with offline threading id ", str);
                    str3 = "create_group_no_log_on_web_success";
                    A00.D0v(str3, A0W);
                    return false;
                }
                if (latencyInfo7.webSuccessMs != -1) {
                    return false;
                }
                latencyInfo7.webSuccessMs = this.A01.A00.now();
                A02(latencyInfo7);
                cls = CreateGroupAggregatedLatencyLogger.class;
                long j6 = latencyInfo7.webSuccessMs;
                valueOf = Long.valueOf(j6);
                A01 = A01(latencyInfo7, j6);
                str2 = "reportWebSuccess, id=%s, ts=%s, diff=%s";
                0fH.A06(cls, str, valueOf, A01, str2);
                return true;
            case 7:
                str = cdk.A01;
                CreateGroupAggregatedLatencyLogger.LatencyInfo latencyInfo8 = (CreateGroupAggregatedLatencyLogger.LatencyInfo) this.A00.get(str);
                if (latencyInfo8 != null) {
                    if (latencyInfo8.appSuccessMs != -1) {
                        return false;
                    }
                    latencyInfo8.appSuccessMs = this.A01.A00.now();
                    A02(latencyInfo8);
                    cls = CreateGroupAggregatedLatencyLogger.class;
                    long j7 = latencyInfo8.appSuccessMs;
                    valueOf = Long.valueOf(j7);
                    A01 = A01(latencyInfo8, j7);
                    str2 = "reportAppSuccess, id=%s, ts=%s, diff=%s";
                    0fH.A06(cls, str, valueOf, A01, str2);
                    return true;
                }
                A00 = A00(this);
                A0W = 0Pz.A0W("No log for group creation with offline threading id ", str);
                str3 = "create_group_no_log_on_app_success";
                A00.D0v(str3, A0W);
                return false;
            case 8:
                str = cdk.A01;
                CreateGroupAggregatedLatencyLogger.LatencyInfo latencyInfo9 = (CreateGroupAggregatedLatencyLogger.LatencyInfo) this.A00.get(str);
                if (latencyInfo9 != null) {
                    if (latencyInfo9.uiSuccessMs != -1) {
                        return false;
                    }
                    latencyInfo9.uiSuccessMs = this.A01.A00.now();
                    A02(latencyInfo9);
                    cls = CreateGroupAggregatedLatencyLogger.class;
                    long j8 = latencyInfo9.uiSuccessMs;
                    valueOf = Long.valueOf(j8);
                    A01 = A01(latencyInfo9, j8);
                    str2 = "reportUiSuccess, id=%s, ts=%s, diff=%s";
                    0fH.A06(cls, str, valueOf, A01, str2);
                    return true;
                }
                A00 = A00(this);
                A0W = 0Pz.A0W("No log for group creation with offline threading id ", str);
                str3 = "create_group_no_log_on_app_success";
                A00.D0v(str3, A0W);
                return false;
            default:
                return false;
        }
    }

    @Override // X.DIx
    public void Cqw(java.util.Map map) {
        this.A00 = map;
    }
}
