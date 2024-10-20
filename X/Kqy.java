package X;

import android.location.LocationListener;
import android.location.LocationManager;
import android.location.OnNmeaMessageListener;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

/* loaded from: Kqy.class */
public final class Kqy {
    public long A00;
    public long A01;
    public LocationListener A02;
    public Rj3 A03;
    public ScheduledFuture A04;
    public ScheduledFuture A05;
    public final LocationManager A07;
    public final C0dr A08;
    public final C02333uu A09;
    public final C03633ym A0B;
    public final C5ez A0C;
    public final ScheduledExecutorService A0F;
    public final C41p A0G;
    public final CopyOnWriteArrayList A0E = JQx.A14();
    public final List A0D = AnonymousClass001.A0s();
    public boolean A06 = false;
    public final Kqy A0A = this;

    public Kqy(LocationManager locationManager, C0dr c0dr, C02333uu c02333uu, C03633ym c03633ym, C41p c41p, C5ez c5ez, ScheduledExecutorService scheduledExecutorService) {
        this.A09 = c02333uu;
        this.A07 = locationManager;
        this.A08 = c0dr;
        this.A0F = scheduledExecutorService;
        this.A0C = c5ez;
        this.A0G = c41p;
        this.A0B = c03633ym;
    }

    public void A00() {
        synchronized (this) {
            if (this.A06) {
                long now = this.A08.now() - this.A00;
                0fH.A0g(Long.valueOf(now), "FbNmeaCollector", "Stopping collection of NMEA data after %d ms");
                LocationManager locationManager = this.A07;
                locationManager.removeNmeaListener((OnNmeaMessageListener) this.A03);
                0QZ.A01(this.A02, locationManager);
                this.A02 = null;
                this.A03 = null;
                this.A06 = false;
                ScheduledFuture scheduledFuture = this.A04;
                if (scheduledFuture != null && !scheduledFuture.isDone()) {
                    this.A04.cancel(true);
                }
                this.A0G.A00("FbNmeaCollector", now);
                this.A04 = null;
                this.A05 = null;
            }
        }
    }
}
