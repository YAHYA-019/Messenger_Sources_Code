package X;

import com.facebookpay.offsite.models.message.OffsiteInitAvailabilityRequestKt;

/* loaded from: KNu.class */
public enum KNu {
    UNKNOWN(OffsiteInitAvailabilityRequestKt.DEFAULT_PARTNER_ID),
    HERE("HERE"),
    MAPBOX("Mapbox"),
    OSM("OpenStreetMap");

    public final String provider;
    public static KNu A00 = OSM;

    KNu(String str) {
        this.provider = str;
    }
}
