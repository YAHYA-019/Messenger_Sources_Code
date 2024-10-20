package X;

import android.content.Context;
import android.hardware.GeomagneticField;
import android.location.Geocoder;
import android.location.Location;
import com.facebook.cameracore.mediapipeline.dataproviders.location.implementation.LocationDataProviderImpl;
import com.facebook.cameracore.mediapipeline.dataproviders.location.interfaces.LocationData;
import com.facebook.native_bridge.NativeDataPromise;

/* loaded from: L8r.class */
public abstract class L8r {
    public static final KmL A0C = new KmL(null, 0S2.A01, null, 10000L, 50.0f, 0.6666667f, 0, 5000, false, false, false, false);
    public LocationDataProviderImpl A00;
    public MFB A01;
    public MIR A02;
    public KmL A03 = A0C;
    public NativeDataPromise A04;
    public String A05;
    public boolean A06;
    public GeomagneticField A07;
    public final Context A08;
    public final Geocoder A09;
    public final C5ez A0A;
    public final LDH A0B;

    public L8r(Context context, C5ez c5ez, LDH ldh) {
        this.A0B = ldh;
        this.A0A = c5ez;
        this.A08 = context;
        this.A09 = new Geocoder(context);
    }

    public static LocationData A00(L8r l8r, L5D l5d) {
        double d;
        double d2;
        double d3 = 0.0d;
        double floatValue = l5d.A02() != null ? l5d.A02().floatValue() : 0.0d;
        double doubleValue = l5d.A01() != null ? l5d.A01().doubleValue() : 0.0d;
        double floatValue2 = l5d.A04() != null ? l5d.A04().floatValue() : 0.0d;
        Location location = l5d.A00;
        if (!location.hasBearing() || Float.valueOf(location.getBearing()) == null) {
            d = 0.0d;
        } else {
            d = (location.hasBearing() ? Float.valueOf(location.getBearing()) : null).floatValue();
        }
        if (!location.hasBearing() || Float.valueOf(location.getBearingAccuracyDegrees()) == null) {
            d2 = 0.0d;
        } else {
            d2 = (location.hasBearing() ? Float.valueOf(location.getBearingAccuracyDegrees()) : null).floatValue();
        }
        long longValue = l5d.A05() == null ? 0L : l5d.A05().longValue();
        GeomagneticField geomagneticField = l8r.A07;
        if (geomagneticField == null) {
            if (floatValue > 0.0d) {
                geomagneticField = new GeomagneticField((float) location.getLatitude(), (float) location.getLongitude(), (float) floatValue, longValue);
                l8r.A07 = geomagneticField;
            }
            return new LocationData(true, location.getLatitude(), location.getLongitude(), floatValue, doubleValue, floatValue2, d, d2, 0.0d, 0.0d + d3, 0.0d, d3, longValue / 1000.0d);
        }
        d3 = geomagneticField.getDeclination();
        return new LocationData(true, location.getLatitude(), location.getLongitude(), floatValue, doubleValue, floatValue2, d, d2, 0.0d, 0.0d + d3, 0.0d, d3, longValue / 1000.0d);
    }

    public abstract Class A01();

    public void A02() {
        if (this.A02 == null && A04()) {
            RpL rpL = new RpL(this);
            this.A02 = rpL;
            try {
                LBf.A03(rpL, this.A03, this.A0B, A01().getName(), 1824102485);
            } catch (IllegalStateException e) {
                0fH.A0H(A01(), "Failed to request location updates", e);
            }
        }
    }

    public void A03() {
        if (this.A02 != null) {
            this.A0B.A09();
            this.A02 = null;
        }
    }

    public abstract boolean A04();
}
