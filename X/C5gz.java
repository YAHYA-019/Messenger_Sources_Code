package X;

import android.text.TextUtils;
import com.facebook.papaya.log.LogSink;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.5gz, reason: invalid class name */
/* loaded from: 5gz.class */
public final class C5gz extends LogSink {
    public final String A02;
    public final C00i A01 = new 1BQ(16520);
    public final java.util.Map A03 = new ConcurrentHashMap();
    public boolean A00 = false;

    public C5gz(String str) {
        this.A02 = str;
    }

    public static void A00(C5gz c5gz) {
        java.util.Map map = c5gz.A03;
        for (Map.Entry entry : map.entrySet()) {
            List list = (List) entry.getValue();
            if (list.size() == 1) {
                ((QuickPerformanceLogger) c5gz.A01.get()).markerAnnotate(188224997, (String) entry.getKey(), (String) list.get(0));
            } else {
                ((QuickPerformanceLogger) c5gz.A01.get()).markerAnnotate(188224997, (String) entry.getKey(), (String[]) list.toArray(new String[0]));
            }
        }
        map.clear();
    }

    public void A01() {
        synchronized (this) {
            A00(this);
            QuickPerformanceLogger quickPerformanceLogger = (QuickPerformanceLogger) this.A01.get();
            short s = 2;
            if (this.A00) {
                s = 3;
            }
            quickPerformanceLogger.markerEnd(188224997, s);
        }
    }

    public void A02() {
        synchronized (this) {
            this.A00 = false;
            C00i c00i = this.A01;
            ((QuickPerformanceLogger) c00i.get()).markerEnd(188224997, (short) 4);
            ((QuickPerformanceLogger) c00i.get()).markerStart(188224997, false);
            A03("population", this.A02);
        }
    }

    public void A03(String str, String str2) {
        synchronized (this) {
            java.util.Map map = this.A03;
            if (!map.containsKey(str)) {
                map.put(str, new ArrayList());
            }
            List list = (List) map.get(str);
            list.getClass();
            list.add(str2);
        }
    }

    public void A04(Throwable th) {
        synchronized (this) {
            String message = (th.getCause() == null || th.getCause().getMessage() == null) ? th.getMessage() : th.getCause().getMessage();
            if (message != null) {
                1BK.A0U(this.A01).markerAnnotate(188224997, "java_failure_reason", message);
            }
            A00(this);
            QuickPerformanceLogger A0U = 1BK.A0U(this.A01);
            short s = 2;
            if (this.A00) {
                s = 3;
            }
            A0U.markerEnd(188224997, s);
        }
    }

    @Override // com.facebook.papaya.log.LogSink
    public void event(long j, long j2, long j3, int i, java.util.Map map, String str) {
        int i2;
        String str2;
        synchronized (this) {
            for (Integer num : 0S2.A00(30)) {
                switch (num.intValue()) {
                    case 1:
                        i2 = 1;
                        break;
                    case 2:
                        i2 = 2;
                        break;
                    case 3:
                        i2 = 3;
                        break;
                    case 4:
                        i2 = 4;
                        break;
                    case 5:
                        i2 = 5;
                        break;
                    case 6:
                        i2 = 6;
                        break;
                    case 7:
                        i2 = 7;
                        break;
                    case 8:
                        i2 = 8;
                        break;
                    case 9:
                        i2 = 9;
                        break;
                    case 10:
                        i2 = 10;
                        break;
                    case 11:
                        i2 = 11;
                        break;
                    case 12:
                        i2 = 12;
                        break;
                    case 13:
                        i2 = 13;
                        break;
                    case 14:
                        i2 = 14;
                        break;
                    case 15:
                        i2 = 15;
                        break;
                    case 16:
                        i2 = 16;
                        break;
                    case 17:
                        i2 = 17;
                        break;
                    case 18:
                        i2 = 18;
                        break;
                    case 19:
                        i2 = 19;
                        break;
                    case 20:
                        i2 = 20;
                        break;
                    case 21:
                        i2 = 21;
                        break;
                    case 22:
                        i2 = 22;
                        break;
                    case 23:
                        i2 = 23;
                        break;
                    case 24:
                        i2 = 24;
                        break;
                    case 25:
                        i2 = 25;
                        break;
                    case 26:
                        i2 = 26;
                        break;
                    case 27:
                        i2 = 27;
                        break;
                    case 28:
                        i2 = 28;
                        break;
                    case 29:
                        i2 = 29;
                        break;
                    default:
                        i2 = 0;
                        break;
                }
                if (i2 == i) {
                    C00i c00i = this.A01;
                    QuickPerformanceLogger quickPerformanceLogger = (QuickPerformanceLogger) c00i.get();
                    switch (num.intValue()) {
                        case 1:
                            str2 = "SUBMIT";
                            break;
                        case 2:
                            str2 = "SUBMIT_FINISH";
                            break;
                        case 3:
                            str2 = "LAUNCH";
                            break;
                        case 4:
                            str2 = "START";
                            break;
                        case 5:
                            str2 = "MATCH";
                            break;
                        case 6:
                            str2 = "MATCH_REJECTED";
                            break;
                        case 7:
                            str2 = "CHECKIN";
                            break;
                        case 8:
                            str2 = "CHECKIN_ACCEPTED";
                            break;
                        case 9:
                            str2 = "CHECKIN_REJECTED";
                            break;
                        case 10:
                            str2 = "DOWNLOAD_DATASET";
                            break;
                        case 11:
                            str2 = "DOWNLOAD_TASK";
                            break;
                        case 12:
                            str2 = "EXECUTE";
                            break;
                        case 13:
                            str2 = "EXECUTE_FINISH";
                            break;
                        case 14:
                            str2 = "REPORT";
                            break;
                        case 15:
                            str2 = "UPLOAD";
                            break;
                        case 16:
                            str2 = "FINISH";
                            break;
                        case 17:
                            str2 = "CANCEL";
                            break;
                        case 18:
                            str2 = "TERMINATE";
                            break;
                        case 19:
                            str2 = "KILL_PROCESS";
                            break;
                        case 20:
                            str2 = "EARLY_TERMINATE";
                            break;
                        case 21:
                            str2 = "PUBLISH";
                            break;
                        case 22:
                            str2 = "BATCH_PROCESSING_START";
                            break;
                        case 23:
                            str2 = "BATCH_PROCESSING_FINISH";
                            break;
                        case 24:
                            str2 = "BATCH_CHECKIN";
                            break;
                        case 25:
                            str2 = "BATCH_FILTER";
                            break;
                        case 26:
                            str2 = "BATCH_SHARD";
                            break;
                        case 27:
                            str2 = "BATCH_EXECUTE";
                            break;
                        case 28:
                            str2 = "BATCH_SECURE_AGGREGATION_FETCH";
                            break;
                        case 29:
                            str2 = "BATCH_REPORT";
                            break;
                        default:
                            str2 = "ERROR";
                            break;
                    }
                    quickPerformanceLogger.markerPoint(188224997, str2);
                    if (map != null && !map.isEmpty()) {
                        for (Map.Entry entry : map.entrySet()) {
                            if (!C7mi.A00.contains(entry.getKey())) {
                                A03((String) entry.getKey(), (String) entry.getValue());
                            }
                        }
                    }
                    if (num == 0S2.A00) {
                        if (!TextUtils.isEmpty(str)) {
                            A03(TraceFieldType.FailureReason, str);
                        }
                        this.A00 = true;
                    } else if (num == 0S2.A09 && !TextUtils.isEmpty(str)) {
                        A03("cancel_reason", str);
                    } else if (num == 0S2.A0u && !TextUtils.isEmpty(str)) {
                        A03("rejection_reason", str);
                    } else if (num == 0S2.A0B) {
                        1BK.A0U(c00i).markerEnd(188224997, (short) 105);
                    }
                }
            }
            throw AnonymousClass001.A0L("Unsupported event!");
        }
    }

    @Override // com.facebook.papaya.log.LogSink
    public void log(long j, long j2, long j3, int i, String str, int i2, String str2) {
    }
}
