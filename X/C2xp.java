package X;

import com.facebook.mqtt.service.ipc.IMqttPublishListener;
import com.facebook.quicklog.QuickPerformanceLogger;

/* renamed from: X.2xp, reason: invalid class name */
/* loaded from: 2xp.class */
public final class C2xp extends C00q implements C00m {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2xp(Object obj, int i, int i2, int i3) {
        super(0);
        this.A00 = i3;
        this.A03 = obj;
        this.A01 = i;
        this.A02 = i2;
    }

    @Override // X.C00m
    public /* bridge */ /* synthetic */ Object invoke() {
        switch (this.A00) {
            case 0:
                C1gy c1gy = (C1gy) this.A03;
                C1gz c1gz = c1gy.A00;
                c1gz.A04 = ((C0dr) c1gy.A0B.A00.get()).now();
                int i = 0;
                Integer[] numArr = {1, 2};
                do {
                    int intValue = numArr[i].intValue();
                    if (C1gy.A05(c1gy, intValue)) {
                        C1gy.A00(c1gy).markerAnnotate(729351308, intValue, "mailbox_sync_paging_progress", this.A01);
                        C1gy.A00(c1gy).markerAnnotate(729351308, intValue, "mailbox_sync_paging_total", this.A02);
                        if (intValue == 1) {
                            C1gy.A00(c1gy).markerPoint(729351308, intValue, "other_sync_completed");
                        } else if (intValue == 2) {
                            C1gy.A00(c1gy).markerPoint(729351308, intValue, "sync_completed");
                            C1gy.A01(c1gz, c1gy, 2);
                        }
                    }
                    i++;
                } while (i < 2);
            case 1:
                1hD r0 = (1hD) this.A03;
                r0.A07 = false;
                int i2 = r0.A00;
                if (i2 <= 5) {
                    QuickPerformanceLogger quickPerformanceLogger = r0.A0D;
                    quickPerformanceLogger.markerPoint(729355407, 0Pz.A0T("chatd_disconnected_", i2));
                    quickPerformanceLogger.markerAnnotate(729355407, 0Pz.A0T("chatd_disconnected_source_", r0.A00), this.A02);
                    quickPerformanceLogger.markerAnnotate(729355407, 0Pz.A0T("chatd_disconnected_reason_", r0.A00), this.A01);
                }
                r0.A00++;
                break;
            case 2:
                1hD r02 = (1hD) this.A03;
                r02.A07 = false;
                int i3 = r02.A00;
                if (i3 <= 5) {
                    QuickPerformanceLogger quickPerformanceLogger2 = r02.A0D;
                    quickPerformanceLogger2.markerPoint(729355407, 0Pz.A0T("chatd_connecting_", i3));
                    quickPerformanceLogger2.markerAnnotate(729355407, 0Pz.A0T("chatd_connecting_source_", r02.A00), this.A02);
                    quickPerformanceLogger2.markerAnnotate(729355407, 0Pz.A0T("chatd_connecting_reason_", r02.A00), this.A01);
                    break;
                }
                break;
            default:
                IMqttPublishListener iMqttPublishListener = (IMqttPublishListener) this.A03;
                if (iMqttPublishListener != null) {
                    iMqttPublishListener.onFailure(this.A02, this.A01);
                    break;
                }
                break;
        }
        return 04S.A00;
    }
}
