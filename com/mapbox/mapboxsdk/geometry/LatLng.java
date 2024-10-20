package com.mapbox.mapboxsdk.geometry;

import X.0C9;
import X.1BK;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.JQy;
import X.KbL;
import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import com.mapbox.geojson.Point;

/* loaded from: LatLng.class */
public class LatLng implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: com.mapbox.mapboxsdk.geometry.LatLng.1
        @Override // android.os.Parcelable.Creator
        public LatLng createFromParcel(Parcel parcel) {
            return new LatLng(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            LatLng latLng = new LatLng(parcel);
            synchronized (0C9.A00) {
            }
            return latLng;
        }

        @Override // android.os.Parcelable.Creator
        public LatLng[] newArray(int i) {
            return new LatLng[i];
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new LatLng[i];
        }
    };
    public double altitude;
    public double latitude;
    public double longitude;

    public LatLng() {
        this.altitude = 0.0d;
        this.latitude = 0.0d;
        this.longitude = 0.0d;
    }

    public LatLng(double d, double d2) {
        this.altitude = 0.0d;
        setLatitude(d);
        setLongitude(d2);
    }

    public LatLng(double d, double d2, double d3) {
        this.altitude = 0.0d;
        setLatitude(d);
        setLongitude(d2);
        this.altitude = d3;
    }

    public LatLng(Location location) {
        this(location.getLatitude(), location.getLongitude(), location.getAltitude());
    }

    public LatLng(Parcel parcel) {
        this.altitude = 0.0d;
        setLatitude(parcel.readDouble());
        setLongitude(parcel.readDouble());
        this.altitude = parcel.readDouble();
    }

    public LatLng(LatLng latLng) {
        this.altitude = 0.0d;
        this.latitude = latLng.latitude;
        this.longitude = latLng.longitude;
        this.altitude = latLng.altitude;
    }

    public static double A00(Point point, Point point2) {
        double pow = Math.pow(Math.sin(JQy.A00((point2.latitude() - point.latitude()) % 360.0d) / 2.0d), 2.0d) + (Math.pow(Math.sin(JQy.A00((point2.longitude() - point.longitude()) % 360.0d) / 2.0d), 2.0d) * Math.cos(JQy.A00(point.latitude() % 360.0d)) * Math.cos(JQy.A00(point2.latitude() % 360.0d)));
        return Math.atan2(Math.sqrt(pow), Math.sqrt(1.0d - pow)) * 2.0d * 1BK.A0o("metres", KbL.A00).doubleValue();
    }

    public static double wrap(double d, double d2, double d3) {
        double d4 = d3 - d2;
        double d5 = (((d - d2) % d4) + d4) % d4;
        return (d < d3 || d5 != 0.0d) ? d5 + d2 : d3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public double distanceTo(LatLng latLng) {
        return A00(Point.fromLngLat(this.longitude, this.latitude), Point.fromLngLat(latLng.longitude, latLng.latitude));
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            LatLng latLng = (LatLng) obj;
            if (Double.compare(latLng.altitude, this.altitude) != 0 || Double.compare(latLng.latitude, this.latitude) != 0 || Double.compare(latLng.longitude, this.longitude) != 0) {
                return false;
            }
        }
        return true;
    }

    public double getAltitude() {
        return this.altitude;
    }

    public double getLatitude() {
        return this.latitude;
    }

    public double getLongitude() {
        return this.longitude;
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.latitude);
        return AnonymousClass002.A03(Double.doubleToLongBits(this.altitude), AnonymousClass002.A03(Double.doubleToLongBits(this.longitude), ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) * 31);
    }

    public void setAltitude(double d) {
        this.altitude = d;
    }

    public void setLatitude(double d) {
        if (Double.isNaN(d)) {
            throw AnonymousClass001.A0L("latitude must not be NaN");
        }
        if (Math.abs(d) > 90.0d) {
            throw AnonymousClass001.A0L("latitude must be between -90 and 90");
        }
        this.latitude = d;
    }

    public void setLongitude(double d) {
        if (Double.isNaN(d)) {
            throw AnonymousClass001.A0L("longitude must not be NaN");
        }
        if (Double.isInfinite(d)) {
            throw AnonymousClass001.A0L("longitude must not be infinite");
        }
        this.longitude = d;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("LatLng [latitude=");
        A0k.append(this.latitude);
        A0k.append(", longitude=");
        A0k.append(this.longitude);
        A0k.append(", altitude=");
        A0k.append(this.altitude);
        return AnonymousClass001.A0d("]", A0k);
    }

    public LatLng wrap() {
        return new LatLng(this.latitude, wrap(this.longitude, -180.0d, 180.0d));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.latitude);
        parcel.writeDouble(this.longitude);
        parcel.writeDouble(this.altitude);
    }
}
