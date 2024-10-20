package X;

import android.location.Location;
import com.google.common.base.Preconditions;
import java.util.concurrent.TimeUnit;

/* loaded from: Lkw.class */
public final class Lkw implements Runnable {
    public static final String __redex_internal_original_name = "MockStaticMpkFbLocationManager$schedule$1";
    public final /* synthetic */ Ju6 A00;

    public Lkw(Ju6 ju6) {
        this.A00 = ju6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Ju6 ju6 = this.A00;
        if (ju6.A04.get()) {
            Location location = new Location((String) null);
            location.setLatitude(37.484998d);
            location.setLongitude(-122.148209d);
            location.setProvider("MockStaticMpkFbLocationManager");
            location.setAccuracy(1.0f);
            long now = ju6.A02.now();
            Preconditions.checkArgument(AnonymousClass001.A1N((now > 0L ? 1 : (now == 0L ? 0 : -1))));
            location.setTime(now);
            ju6.A0I(new L5D(location));
            long j = ju6.A00;
            if (j >= 0) {
                ju6.A01 = ju6.A03.schedule(new Lkw(ju6), j, TimeUnit.MILLISECONDS);
            }
        }
    }
}
