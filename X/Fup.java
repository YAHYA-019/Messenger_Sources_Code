package X;

import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.facebook.proxygen.TraceFieldType;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: Fup.class */
public final class Fup implements GKt {
    public final Fuq A00;

    public Fup(Fuq fuq) {
        this.A00 = fuq;
    }

    public static DV1 A00(C07n c07n, 0D7 r302, AwakeTimeSinceBootClock awakeTimeSinceBootClock) {
        r302.A09(c07n, "product_type");
        r302.A09(EnumC11564wu.ANDROID, "platform");
        r302.A0D("actual_event_time", Long.valueOf(awakeTimeSinceBootClock.now()));
        return new 0DA();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x003f. Please report as an issue. */
    @Override // X.GKt
    public void BZT(String str, java.util.Map map) {
        0D7 A08;
        java.util.Map unmodifiableMap;
        String str2;
        11T.A0F(str, 0);
        if (map != null) {
            AwakeTimeSinceBootClock awakeTimeSinceBootClock = AwakeTimeSinceBootClock.INSTANCE;
            11T.A0A(awakeTimeSinceBootClock);
            Fuq fuq = this.A00;
            04J r0 = fuq.A00;
            String A03 = AbstractC11504wo.A03(map);
            String A02 = AbstractC11504wo.A02(map);
            String str3 = "get_encryption_key";
            switch (str.hashCode()) {
                case -1535674460:
                    if (str.equals("fbpay_auth_ticket_query_fail")) {
                        HashMap A1C = DKC.A1C(map);
                        A1C.put("flow_step", "auth_ticket_query");
                        unmodifiableMap = Collections.unmodifiableMap(A1C);
                        11T.A0A(unmodifiableMap);
                        str2 = "payflows_fail";
                        fuq.BZT(str2, unmodifiableMap);
                        return;
                    }
                    throw AnonymousClass001.A0L(0Pz.A0j("Event name ", str, AbE.A00(213)));
                case -66680387:
                    if (str.equals("fbpay_auth_ticket_query_success")) {
                        HashMap A1C2 = DKC.A1C(map);
                        A1C2.put("flow_step", "auth_ticket_query");
                        unmodifiableMap = Collections.unmodifiableMap(A1C2);
                        11T.A0A(unmodifiableMap);
                        str2 = "payflows_success";
                        fuq.BZT(str2, unmodifiableMap);
                        return;
                    }
                    throw AnonymousClass001.A0L(0Pz.A0j("Event name ", str, AbE.A00(213)));
                case 434863887:
                    if (str.equals("client_load_paysec_fail")) {
                        A08 = AbF.A08(1BK.A08(r0, "client_load_paysec_fail"), 93);
                        if (4YU.A1X(A08)) {
                            A08.A0E("session_id", A03);
                            DV1 A00 = A00(EnumC11554wt.valueOf(A02), A08, awakeTimeSinceBootClock);
                            A00.A07("sec_type", str3);
                            7zL.A1E(A08, A00);
                            A08.A0E("error_message", String.valueOf(map.get("error_message")));
                            A08.A0E(TraceFieldType.ErrorCode, String.valueOf(map.get(TraceFieldType.ErrorCode)));
                            A08.A0E("error_stacktrace", String.valueOf(map.get("error_stacktrace")));
                            A08.BZL();
                            return;
                        }
                        return;
                    }
                    throw AnonymousClass001.A0L(0Pz.A0j("Event name ", str, AbE.A00(213)));
                case 434965761:
                    String A002 = 1BJ.A00(1132);
                    if (str.equals(A002)) {
                        A08 = AbF.A08(1BK.A08(r0, A002), 94);
                        if (4YU.A1X(A08)) {
                            A08.A0E("session_id", A03);
                            DV1 A003 = A00(EnumC11554wt.valueOf(A02), A08, awakeTimeSinceBootClock);
                            A003.A07("sec_type", str3);
                            7zL.A1E(A08, A003);
                            A08.BZL();
                            return;
                        }
                        return;
                    }
                    throw AnonymousClass001.A0L(0Pz.A0j("Event name ", str, AbE.A00(213)));
                case 628213362:
                    if (str.equals("client_load_paysec_success")) {
                        A08 = AbF.A08(1BK.A08(r0, "client_load_paysec_success"), 95);
                        String str4 = null;
                        Object obj = map.get("sec_type");
                        if (obj != null && (obj instanceof String)) {
                            str4 = (String) obj;
                        }
                        HashMap A0u = AnonymousClass001.A0u();
                        if (str4 != null) {
                            Iterator A0y = AnonymousClass001.A0y(map);
                            while (A0y.hasNext()) {
                                Map.Entry A0z = AnonymousClass001.A0z(A0y);
                                if (A0z.getValue() instanceof String) {
                                    Object key = A0z.getKey();
                                    Object value = A0z.getValue();
                                    DKC.A1U(value);
                                    A0u.put(key, value);
                                }
                            }
                            str3 = str4;
                        }
                        if (4YU.A1X(A08)) {
                            EnumC11554wt enumC11554wt = EnumC11554wt.A0I;
                            try {
                                enumC11554wt = EnumC11554wt.valueOf(A02);
                            } catch (Exception unused) {
                            }
                            A08.A0E("session_id", A03);
                            DV1 A004 = A00(enumC11554wt, A08, awakeTimeSinceBootClock);
                            A004.A07("sec_type", str3);
                            7zL.A1E(A08, A004);
                            if (A0u.size() > 0) {
                                A08.A0I(A0u);
                            }
                            A08.BZL();
                            return;
                        }
                        return;
                    }
                    throw AnonymousClass001.A0L(0Pz.A0j("Event name ", str, AbE.A00(213)));
                default:
                    throw AnonymousClass001.A0L(0Pz.A0j("Event name ", str, AbE.A00(213)));
            }
        }
    }
}
