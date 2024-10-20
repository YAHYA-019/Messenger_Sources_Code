package X;

import android.os.SystemClock;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.1f3, reason: invalid class name */
/* loaded from: 1f3.class */
public final class C1f3 {
    public long A01;
    public long A02;
    public final int A04;
    public final int A05;
    public final long A06;
    public final long A07;
    public final boolean A09;
    public boolean A03 = false;
    public int A00 = 2;
    public final C1f4 A08 = new C1f4();

    public C1f3(Integer num, int i, boolean z) {
        this.A04 = i;
        this.A05 = num == null ? System.identityHashCode(this) : num.intValue();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.A01 = elapsedRealtime;
        this.A06 = elapsedRealtime;
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        this.A02 = elapsedRealtimeNanos;
        this.A07 = elapsedRealtimeNanos;
        this.A09 = z;
    }

    public void A00(int i) {
        if (this.A03) {
            throw AnonymousClass001.A0T(0Pz.A0o("Event with action: ", " and id: ", " already ended", i, this.A04));
        }
        if (i > 32767 || i < -32768) {
            throw AnonymousClass001.A0L("Action value must be between -32768 and 32767");
        }
        this.A00 = i;
        this.A03 = true;
        this.A01 = SystemClock.elapsedRealtime();
        this.A02 = SystemClock.elapsedRealtimeNanos();
    }

    public void A01(String str, long j) {
        this.A08.A01.put(str, Long.valueOf(j));
    }

    public void A02(String str, String str2) {
        this.A08.A02.put(str, str2);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Event--->");
        sb.append("\n\tStartTime: ");
        long j = this.A06;
        sb.append(j);
        sb.append("\n\tEndTime: ");
        long j2 = this.A01;
        sb.append(j2);
        sb.append("\n\tDuration(Millis): ");
        sb.append(j2 - j);
        sb.append("\n\tDuration(Micros): ");
        sb.append((this.A02 - this.A07) / 1000);
        sb.append("\n\tId: ");
        sb.append(this.A04);
        sb.append("\n\tUniqueKey: ");
        sb.append(this.A05);
        sb.append("\n\tAction: ");
        sb.append(this.A00);
        sb.append("\n\t- StringParams:");
        C1f4 c1f4 = this.A08;
        for (Map.Entry entry : c1f4.A02.entrySet()) {
            sb.append("\n\t\t");
            sb.append((String) entry.getKey());
            sb.append(": ");
            sb.append((String) entry.getValue());
        }
        sb.append("\n\t- DoubleParams:");
        Iterator it = c1f4.A00.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry A0z = AnonymousClass001.A0z(it);
            sb.append("\n\t\t");
            sb.append(AnonymousClass001.A0j(A0z));
            sb.append(": ");
            sb.append(A0z.getValue());
        }
        sb.append("\n\t- LongParams:");
        for (Map.Entry entry2 : c1f4.A01.entrySet()) {
            sb.append("\n\t\t");
            sb.append((String) entry2.getKey());
            sb.append(": ");
            sb.append(entry2.getValue());
        }
        return sb.toString();
    }
}
