package X;

import android.content.Intent;
import com.facebook.rsys.devicestats.gen.BatteryStatsReader;

/* loaded from: Gx7.class */
public final class Gx7 extends BatteryStatsReader {
    public final 1Br A00 = 1Bq.A00(32928);

    @Override // com.facebook.rsys.devicestats.gen.BatteryStatsReader
    public long getBatteryLevel() {
        return 0KF.A02(((C4A7) 1Br.A0B(this.A00)).A01() * 100.0f);
    }

    @Override // com.facebook.rsys.devicestats.gen.BatteryStatsReader
    public boolean isCharging() {
        int intExtra;
        Intent A00 = C4A7.A00((C4A7) 1Br.A0B(this.A00));
        boolean z = false;
        if (A00 != null && ((intExtra = A00.getIntExtra("status", 1)) == 2 || intExtra == 5)) {
            z = true;
        }
        return z;
    }
}
