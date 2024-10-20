package com.mapbox.mapboxsdk.geometry;

import X.0C9;
import X.AnonymousClass001;
import X.JQx;
import android.os.Parcel;
import android.os.Parcelable;
import com.mapbox.mapboxsdk.exceptions.InvalidLatLngBoundsException;
import java.util.Iterator;
import java.util.List;

/* loaded from: LatLngBounds.class */
public class LatLngBounds implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: com.mapbox.mapboxsdk.geometry.LatLngBounds.1
        @Override // android.os.Parcelable.Creator
        public LatLngBounds createFromParcel(Parcel parcel) {
            return LatLngBounds.readFromParcel(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            LatLngBounds readFromParcel = LatLngBounds.readFromParcel(parcel);
            synchronized (0C9.A00) {
            }
            return readFromParcel;
        }

        @Override // android.os.Parcelable.Creator
        public LatLngBounds[] newArray(int i) {
            return new LatLngBounds[i];
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new LatLngBounds[i];
        }
    };
    public final double latitudeNorth;
    public final double latitudeSouth;
    public final double longitudeEast;
    public final double longitudeWest;

    /* loaded from: LatLngBounds$Builder.class */
    public final class Builder {
        public final List latLngList = AnonymousClass001.A0s();

        public LatLngBounds build() {
            if (this.latLngList.size() >= 2) {
                return LatLngBounds.fromLatLngs(this.latLngList);
            }
            throw new InvalidLatLngBoundsException(this.latLngList.size());
        }

        public Builder include(LatLng latLng) {
            this.latLngList.add(latLng);
            return this;
        }

        public Builder includes(List list) {
            this.latLngList.addAll(list);
            return this;
        }
    }

    public LatLngBounds(double d, double d2, double d3, double d4) {
        this.latitudeNorth = d;
        this.longitudeEast = d2;
        this.latitudeSouth = d3;
        this.longitudeWest = d4;
    }

    public static void checkParams(double d, double d2, double d3, double d4) {
        if (Double.isNaN(d) || Double.isNaN(d3)) {
            throw AnonymousClass001.A0L("latitude must not be NaN");
        }
        if (Double.isNaN(d2) || Double.isNaN(d4)) {
            throw AnonymousClass001.A0L("longitude must not be NaN");
        }
        if (Double.isInfinite(d2) || Double.isInfinite(d4)) {
            throw AnonymousClass001.A0L("longitude must not be infinite");
        }
        if (d > 90.0d || d < -90.0d || d3 > 90.0d || d3 < -90.0d) {
            throw AnonymousClass001.A0L("latitude must be between -90 and 90");
        }
        if (d < d3) {
            throw AnonymousClass001.A0L("latNorth cannot be less than latSouth");
        }
        if (d2 < d4) {
            throw AnonymousClass001.A0L("lonEast cannot be less than lonWest");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0020, code lost:
    
        if (r302 < r301.latitudeSouth) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean containsLatitude(double r302) {
        /*
            r301 = this;
            r0 = r301
            double r0 = r0.latitudeNorth
            r304 = r0
            r0 = r302
            r1 = r304
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r306 = r0
            r0 = r306
            if (r0 > 0) goto L23
            r0 = r301
            double r0 = r0.latitudeSouth
            r307 = r0
            r0 = r302
            r1 = r307
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r309 = r0
            r0 = 1
            r306 = r0
            r0 = r309
            if (r0 >= 0) goto L26
        L23:
            r0 = 0
            r306 = r0
        L26:
            r0 = r306
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mapbox.mapboxsdk.geometry.LatLngBounds.containsLatitude(double):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0020, code lost:
    
        if (r302 < r301.longitudeWest) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean containsLongitude(double r302) {
        /*
            r301 = this;
            r0 = r301
            double r0 = r0.longitudeEast
            r304 = r0
            r0 = r302
            r1 = r304
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r306 = r0
            r0 = r306
            if (r0 > 0) goto L23
            r0 = r301
            double r0 = r0.longitudeWest
            r307 = r0
            r0 = r302
            r1 = r307
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r309 = r0
            r0 = 1
            r306 = r0
            r0 = r309
            if (r0 >= 0) goto L26
        L23:
            r0 = 0
            r306 = r0
        L26:
            r0 = r306
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mapbox.mapboxsdk.geometry.LatLngBounds.containsLongitude(double):boolean");
    }

    public static LatLngBounds from(double d, double d2, double d3, double d4) {
        checkParams(d, d2, d3, d4);
        return new LatLngBounds(d, d2, d3, d4);
    }

    public static LatLngBounds from(int i, int i2, int i3) {
        return new LatLngBounds(lat_(i, i3), lon_(i, i2 + 1), lat_(i, i3 + 1), lon_(i, i2));
    }

    public static LatLngBounds fromLatLngs(List list) {
        Iterator it = list.iterator();
        double d = Double.MAX_VALUE;
        double d2 = 90.0d;
        double d3 = -90.0d;
        double d4 = -1.7976931348623157E308d;
        while (true) {
            double d5 = d4;
            if (!it.hasNext()) {
                return new LatLngBounds(d3, d5, d2, d);
            }
            LatLng latLng = (LatLng) it.next();
            double d6 = latLng.latitude;
            double d7 = latLng.longitude;
            d2 = Math.min(d2, d6);
            d = Math.min(d, d7);
            d3 = Math.max(d3, d6);
            d4 = Math.max(d5, d7);
        }
    }

    private LatLngBounds intersectNoParamCheck(double d, double d2, double d3, double d4) {
        double max = Math.max(this.longitudeWest, d4);
        double min = Math.min(this.longitudeEast, d2);
        if (min < max) {
            return null;
        }
        double max2 = Math.max(this.latitudeSouth, d3);
        double min2 = Math.min(this.latitudeNorth, d);
        if (min2 >= max2) {
            return new LatLngBounds(min2, min, max2, max);
        }
        return null;
    }

    public static double lat_(int i, int i2) {
        double pow = 3.141592653589793d - ((i2 * 6.283185307179586d) / Math.pow(2.0d, i));
        return Math.toDegrees(Math.atan((Math.exp(pow) - Math.exp(-pow)) * 0.5d));
    }

    public static double lon_(int i, int i2) {
        return ((i2 / Math.pow(2.0d, i)) * 360.0d) - 180.0d;
    }

    public static LatLngBounds readFromParcel(Parcel parcel) {
        return new LatLngBounds(parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble());
    }

    private LatLngBounds unionNoParamCheck(double d, double d2, double d3, double d4) {
        double d5 = d;
        double d6 = this.latitudeNorth;
        if (d6 >= d) {
            d5 = d6;
        }
        double d7 = this.longitudeEast;
        if (d7 < d2) {
            d7 = d2;
        }
        double d8 = this.latitudeSouth;
        if (d8 > d3) {
            d8 = d3;
        }
        double d9 = this.longitudeWest;
        if (d9 > d4) {
            d9 = d4;
        }
        return new LatLngBounds(d5, d7, d8, d9);
    }

    public static LatLngBounds world() {
        return from(90.0d, 180.0d, -90.0d, -180.0d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0022, code lost:
    
        if (containsLongitude(r302.longitude) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean contains(com.mapbox.mapboxsdk.geometry.LatLng r302) {
        /*
            r301 = this;
            r0 = r302
            double r0 = r0.latitude
            r303 = r0
            r0 = r301
            r1 = r303
            boolean r0 = r0.containsLatitude(r1)
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L25
            r0 = r302
            double r0 = r0.longitude
            r303 = r0
            r0 = r301
            r1 = r303
            boolean r0 = r0.containsLongitude(r1)
            r306 = r0
            r0 = 1
            r305 = r0
            r0 = r306
            if (r0 != 0) goto L28
        L25:
            r0 = 0
            r305 = r0
        L28:
            r0 = r305
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mapbox.mapboxsdk.geometry.LatLngBounds.contains(com.mapbox.mapboxsdk.geometry.LatLng):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001f, code lost:
    
        if (contains(r302.getSouthWest()) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean contains(com.mapbox.mapboxsdk.geometry.LatLngBounds r302) {
        /*
            r301 = this;
            r0 = r302
            com.mapbox.mapboxsdk.geometry.LatLng r0 = r0.getNorthEast()
            r303 = r0
            r0 = r301
            r1 = r303
            boolean r0 = r0.contains(r1)
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L22
            r0 = r302
            com.mapbox.mapboxsdk.geometry.LatLng r0 = r0.getSouthWest()
            r303 = r0
            r0 = r301
            r1 = r303
            boolean r0 = r0.contains(r1)
            r305 = r0
            r0 = 1
            r304 = r0
            r0 = r305
            if (r0 != 0) goto L26
        L22:
            r0 = 0
            r304 = r0
            r0 = 0
            r303 = r0
        L26:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mapbox.mapboxsdk.geometry.LatLngBounds.contains(com.mapbox.mapboxsdk.geometry.LatLngBounds):boolean");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof LatLngBounds)) {
                return false;
            }
            LatLngBounds latLngBounds = (LatLngBounds) obj;
            if (this.latitudeNorth != latLngBounds.latitudeNorth || this.latitudeSouth != latLngBounds.latitudeSouth || this.longitudeEast != latLngBounds.longitudeEast || this.longitudeWest != latLngBounds.longitudeWest) {
                return false;
            }
        }
        return true;
    }

    public LatLng getCenter() {
        return new LatLng((this.latitudeNorth + this.latitudeSouth) / 2.0d, (this.longitudeEast + this.longitudeWest) / 2.0d);
    }

    public double getLatNorth() {
        return this.latitudeNorth;
    }

    public double getLatSouth() {
        return this.latitudeSouth;
    }

    public double getLatitudeSpan() {
        return JQx.A01(this.latitudeNorth, this.latitudeSouth);
    }

    public double getLonEast() {
        return this.longitudeEast;
    }

    public double getLonWest() {
        return this.longitudeWest;
    }

    public double getLongitudeSpan() {
        return JQx.A01(this.longitudeEast, this.longitudeWest);
    }

    public LatLng getNorthEast() {
        return new LatLng(this.latitudeNorth, this.longitudeEast);
    }

    public LatLng getNorthWest() {
        return new LatLng(this.latitudeNorth, this.longitudeWest);
    }

    public LatLng getSouthEast() {
        return new LatLng(this.latitudeSouth, this.longitudeEast);
    }

    public LatLng getSouthWest() {
        return new LatLng(this.latitudeSouth, this.longitudeWest);
    }

    public LatLngSpan getSpan() {
        return new LatLngSpan(getLatitudeSpan(), getLongitudeSpan());
    }

    public int hashCode() {
        return (int) (this.latitudeNorth + 90.0d + ((this.latitudeSouth + 90.0d) * 1000.0d) + ((this.longitudeEast + 180.0d) * 1000000.0d) + ((this.longitudeWest + 180.0d) * 1.0E9d));
    }

    public LatLngBounds include(LatLng latLng) {
        Builder builder = new Builder();
        builder.include(getNorthEast());
        builder.include(getSouthWest());
        builder.include(latLng);
        return builder.build();
    }

    public LatLngBounds intersect(double d, double d2, double d3, double d4) {
        checkParams(d, d2, d3, d4);
        return intersectNoParamCheck(d, d2, d3, d4);
    }

    public LatLngBounds intersect(LatLngBounds latLngBounds) {
        return intersectNoParamCheck(latLngBounds.latitudeNorth, latLngBounds.longitudeEast, latLngBounds.latitudeSouth, latLngBounds.longitudeWest);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0022, code lost:
    
        if (getLatitudeSpan() == 0.0d) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean isEmptySpan() {
        /*
            r301 = this;
            r0 = r301
            double r0 = r0.getLongitudeSpan()
            r302 = r0
            r0 = 0
            r304 = r0
            r0 = r302
            r1 = r304
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L25
            r0 = r301
            double r0 = r0.getLatitudeSpan()
            r307 = r0
            r0 = r307
            r1 = r304
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r309 = r0
            r0 = 0
            r306 = r0
            r0 = r309
            if (r0 != 0) goto L28
        L25:
            r0 = 1
            r306 = r0
        L28:
            r0 = r306
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mapbox.mapboxsdk.geometry.LatLngBounds.isEmptySpan():boolean");
    }

    public LatLng[] toLatLngs() {
        return new LatLng[]{getNorthEast(), getSouthWest()};
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("N:");
        A0k.append(this.latitudeNorth);
        A0k.append("; E:");
        A0k.append(this.longitudeEast);
        A0k.append("; S:");
        A0k.append(this.latitudeSouth);
        A0k.append("; W:");
        A0k.append(this.longitudeWest);
        return A0k.toString();
    }

    public LatLngBounds union(double d, double d2, double d3, double d4) {
        checkParams(d, d2, d3, d4);
        return unionNoParamCheck(d, d2, d3, d4);
    }

    public LatLngBounds union(LatLngBounds latLngBounds) {
        return unionNoParamCheck(latLngBounds.latitudeNorth, latLngBounds.longitudeEast, latLngBounds.latitudeSouth, latLngBounds.longitudeWest);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.latitudeNorth);
        parcel.writeDouble(this.longitudeEast);
        parcel.writeDouble(this.latitudeSouth);
        parcel.writeDouble(this.longitudeWest);
    }
}
