package X;

import com.facebook.messaging.model.threads.ThreadParticipant;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.rtc.tab.viewdata.calllogs.api.CallLog;
import java.util.Comparator;

/* loaded from: DAj.class */
public final class DAj implements Comparator {
    public final int A00;

    public DAj(int i) {
        this.A00 = i;
    }

    @Override // java.util.Comparator
    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        long j;
        long j2;
        switch (this.A00) {
            case 0:
            case 8:
                2JX A1Z = ((2JX) obj).A1Z();
                A1Z.getClass();
                2JX A1Z2 = ((2JX) obj2).A1Z();
                A1Z2.getClass();
                2JX A1I = A1Z.A1I();
                A1I.getClass();
                2JX A1I2 = A1Z2.A1I();
                A1I2.getClass();
                return Double.compare(A1I2.getDoubleValue(1581128895), A1I.getDoubleValue(1581128895));
            case 1:
                String A02 = C28p.A02((ThreadParticipant) obj);
                String A022 = C28p.A02((ThreadParticipant) obj2);
                if (A02 == null) {
                    return A022 == null ? 0 : -1;
                }
                if (A022 != null) {
                    return A02.compareTo(A022);
                }
                return 1;
            case 2:
                return 0DX.A00(((C1769As3) obj).A05, ((C1769As3) obj2).A05);
            case 3:
                return Float.compare(((BmG) obj2).A00, ((BmG) obj).A00);
            case 4:
                return ((ThreadSummary) obj).A0N < ((ThreadSummary) obj2).A0N ? 1 : -1;
            case 5:
                j = ((CallLog) obj).A00;
                j2 = ((CallLog) obj2).A00;
                break;
            case 6:
                j = ((ThreadSummary) obj).A0N;
                j2 = ((ThreadSummary) obj2).A0N;
                break;
            case 7:
                return 0DX.A00(Long.valueOf(((CallLog) obj2).A00), Long.valueOf(((CallLog) obj).A00));
            default:
                return 0;
        }
        if (j <= j2) {
            return j < j2 ? 1 : 0;
        }
        return -1;
    }
}
