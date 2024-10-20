package X;

import com.facebook.common.network.FbNetworkManager;
import com.facebook.pando.TreeJNI;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.HashMap;
import java.util.concurrent.ScheduledFuture;

/* renamed from: X.2y1, reason: invalid class name */
/* loaded from: 2y1.class */
public final class C2y1 extends C00q implements C00m {
    public final int A00;
    public final Object A01;
    public final String A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2y1(String str, Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    @Override // X.C00m
    public /* bridge */ /* synthetic */ Object invoke() {
        QuickPerformanceLogger A00;
        String str;
        String str2;
        QuickPerformanceLogger quickPerformanceLogger;
        int i;
        StringBuilder sb;
        int i2;
        1hD r306;
        QuickPerformanceLogger quickPerformanceLogger2;
        int i3;
        StringBuilder A0k;
        String str3;
        int i4;
        switch (this.A00) {
            case 0:
                1aX r0 = (1aX) this.A01;
                int i5 = r0.A00 + 1;
                r0.A00 = i5;
                QuickPerformanceLogger A002 = 1aX.A00(r0);
                if (i5 > 20) {
                    A002.markerAnnotate(729359070, "last_reconnect_reason", this.A02);
                    1aX.A02(r0, (short) 3);
                } else {
                    A002.markerPoint(729359070, 0Pz.A0d("connection_", "_start", r0.A00));
                    int i6 = r0.A00;
                    if (i6 == 1) {
                        A00 = 1aX.A00(r0);
                        str = this.A02;
                        str2 = "first_connect_reason";
                    } else if (i6 == 2) {
                        A00 = 1aX.A00(r0);
                        str = this.A02;
                        str2 = "first_reconnect_reason";
                    }
                    A00.markerAnnotate(729359070, str2, str);
                }
                return 04S.A00;
            case 1:
                1hA r02 = (1hA) this.A01;
                String str4 = this.A02;
                r02.A01 = str4;
                QuickPerformanceLogger quickPerformanceLogger3 = r02.A04;
                if (!quickPerformanceLogger3.isMarkerOn(729361873)) {
                    r02.A00++;
                    quickPerformanceLogger3.markerStart(729361873, false);
                    quickPerformanceLogger3.markerAnnotate(729361873, TraceFieldType.HostName, str4);
                    quickPerformanceLogger3.markerAnnotate(729361873, "request_count", r02.A00);
                    quickPerformanceLogger3.markerAnnotate(729361873, "start_network_state", ((FbNetworkManager) ((C1h9) r02).A00.A00.get()).A0M());
                }
                return 04S.A00;
            case 2:
                ((1hD) this.A01).A0D.markerAnnotate(729355407, "push_processing_error", this.A02);
                return 04S.A00;
            case 3:
                1hD r03 = (1hD) this.A01;
                int i7 = r03.A03;
                if (i7 <= 5) {
                    r03.A0D.markerPoint(729355407, 0Pz.A0M(this.A02, '_', i7));
                }
                return 04S.A00;
            case 4:
                1hD r04 = (1hD) this.A01;
                if (r04.A0B) {
                    QuickPerformanceLogger quickPerformanceLogger4 = r04.A0D;
                    quickPerformanceLogger4.markerAnnotate(729355407, "mws_send_message_counter", r04.A03);
                    quickPerformanceLogger4.markerAnnotate(729355407, "mqtt_connection_counter", r04.A01);
                    quickPerformanceLogger4.markerAnnotate(729355407, "chatd_connection_counter", r04.A00);
                    quickPerformanceLogger4.markerAnnotate(729355407, "notification_counter", r04.A04);
                    quickPerformanceLogger4.markerAnnotate(729355407, "fail_reason", this.A02);
                    quickPerformanceLogger4.markerEnd(729355407, (short) 3);
                } else {
                    r04.A0D.markerDrop(729355407);
                }
                ScheduledFuture scheduledFuture = r04.A06;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                r04.A06 = null;
                r04.A02();
                return 04S.A00;
            case 5:
                1hD r05 = (1hD) this.A01;
                int i8 = r05.A05 + 1;
                r05.A05 = i8;
                if (i8 <= 5) {
                    quickPerformanceLogger = r05.A0D;
                    i = 729355407;
                    quickPerformanceLogger.markerPoint(729355407, 0Pz.A0T("rtc_engine_init_start_", i8));
                    sb = new StringBuilder();
                    sb.append("rtc_engine_status_");
                    i2 = r05.A05;
                    sb.append(i2);
                    quickPerformanceLogger.markerAnnotate(i, sb.toString(), this.A02);
                }
                return 04S.A00;
            case 6:
                r306 = (1hD) this.A01;
                r306.A09 = false;
                int i9 = r306.A01;
                if (i9 <= 5) {
                    quickPerformanceLogger2 = r306.A0D;
                    i3 = 729355407;
                    quickPerformanceLogger2.markerPoint(729355407, 0Pz.A0T("mqtt_network_disconnected_", i9));
                    A0k = AnonymousClass001.A0k();
                    str3 = "mqtt_disconnect_reason_";
                    A0k.append(str3);
                    A0k.append(r306.A01);
                    quickPerformanceLogger2.markerAnnotate(i3, A0k.toString(), this.A02);
                }
                r306.A01++;
                return 04S.A00;
            case 7:
                r306 = (1hD) this.A01;
                r306.A09 = false;
                int i10 = r306.A01;
                if (i10 <= 5) {
                    quickPerformanceLogger2 = r306.A0D;
                    i3 = 729355407;
                    quickPerformanceLogger2.markerPoint(729355407, 0Pz.A0T("mqtt_disconnected_", i10));
                    A0k = new StringBuilder();
                    str3 = "mqtt_connect_failed_reason_";
                    A0k.append(str3);
                    A0k.append(r306.A01);
                    quickPerformanceLogger2.markerAnnotate(i3, A0k.toString(), this.A02);
                }
                r306.A01++;
                return 04S.A00;
            case 8:
                1hD r06 = (1hD) this.A01;
                r06.A09 = false;
                int i11 = r06.A01;
                if (i11 <= 5) {
                    quickPerformanceLogger = r06.A0D;
                    i = 729355407;
                    quickPerformanceLogger.markerPoint(729355407, 0Pz.A0T("mqtt_connecting_", i11));
                    sb = new StringBuilder();
                    sb.append("mqtt_connection_reason_");
                    i2 = r06.A01;
                    sb.append(i2);
                    quickPerformanceLogger.markerAnnotate(i, sb.toString(), this.A02);
                }
                return 04S.A00;
            case 9:
                String str5 = this.A02;
                if (11T.A0O(str5, HCL.A1R.eventName)) {
                    i4 = 1;
                } else {
                    i4 = 5;
                    if (11T.A0O(str5, HCL.A1M.eventName)) {
                        i4 = 0;
                    }
                }
                String A0W = 0Pz.A0W("event_", str5);
                1hD r07 = (1hD) this.A01;
                HashMap hashMap = r07.A0E;
                Number number = (Number) hashMap.get(A0W);
                if (number == null) {
                    number = 0;
                }
                int intValue = number.intValue();
                if (intValue < i4) {
                    r07.A0D.markerPoint(729355407, 0Pz.A0M(A0W, '_', intValue + 1));
                }
                hashMap.put(A0W, Integer.valueOf(intValue + 1));
                return 04S.A00;
            case 10:
                return ((2M9) this.A01).A00.A0b(this.A02);
            case 11:
                1nK r08 = ((1nT) this.A01).A0C;
                if (r08 != null) {
                    r08.updateRegionPreference(this.A02);
                }
                return 04S.A00;
            case 12:
                return ((TreeJNI) this.A01).getOptionalDoubleValue(this.A02);
            default:
                return ((TreeJNI) this.A01).getOptionalIntValue(this.A02);
        }
    }
}
