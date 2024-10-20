package X;

import com.facebook.acra.criticaldata.CriticalAppData;
import com.facebook.acra.criticaldata.UserChangeListener;
import com.mapbox.mapboxsdk.location.LocationComponentCompassEngine;

/* renamed from: X.01x, reason: invalid class name */
/* loaded from: 01x.class */
public final class C01x implements C0iO, UserChangeListener {
    public final 0gK A00;

    public C01x(0gK r302) {
        this.A00 = r302;
    }

    @Override // X.C0iO
    public /* synthetic */ int getHealthEventSamplingRate() {
        return LocationComponentCompassEngine.SENSOR_DELAY_MICROS;
    }

    @Override // X.C0iO
    public /* synthetic */ C0l0 getLimiter() {
        return null;
    }

    @Override // X.C0iO
    public 0iP getName() {
        return 0iP.A0W;
    }

    @Override // X.C0iO
    public void start() {
        CriticalAppData.sUserChangeListener = this;
    }

    @Override // com.facebook.acra.criticaldata.UserChangeListener
    public void userHasChanged() {
        C0qh c0qh = new C0qh(null);
        0gK r0 = this.A00;
        r0.A0A(c0qh, C0gq.CRITICAL_REPORT, this);
        r0.A0A(c0qh, C0gq.LARGE_REPORT, this);
    }
}
