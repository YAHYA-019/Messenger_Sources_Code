package com.mapbox.mapboxsdk.camera;

import X.0C9;
import X.1BL;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.JR1;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import com.mapbox.mapboxsdk.camera.CameraUpdateFactory;
import com.mapbox.mapboxsdk.geometry.LatLng;

/* loaded from: CameraPosition.class */
public final class CameraPosition implements Parcelable {
    public final double bearing;
    public final LatLng target;
    public final double tilt;
    public final double zoom;
    public static final CameraPosition DEFAULT = new CameraPosition(new LatLng(), 0.0d, 0.0d, 0.0d);
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: com.mapbox.mapboxsdk.camera.CameraPosition.1
        @Override // android.os.Parcelable.Creator
        public CameraPosition createFromParcel(Parcel parcel) {
            double readDouble = parcel.readDouble();
            return new CameraPosition((LatLng) 1BL.A0C(parcel, LatLng.class), parcel.readDouble(), parcel.readDouble(), readDouble);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            CameraPosition createFromParcel = createFromParcel(parcel);
            synchronized (0C9.A00) {
            }
            return createFromParcel;
        }

        @Override // android.os.Parcelable.Creator
        public CameraPosition[] newArray(int i) {
            return new CameraPosition[i];
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new CameraPosition[i];
        }
    };

    /* loaded from: CameraPosition$Builder.class */
    public final class Builder {
        public double bearing;
        public LatLng target;
        public double tilt;
        public double zoom;

        public Builder() {
            JR1.A1H(this);
        }

        public Builder(TypedArray typedArray) {
            JR1.A1H(this);
            if (typedArray != null) {
                this.bearing = typedArray.getFloat(2, 0.0f);
                this.target = new LatLng(typedArray.getFloat(3, 0.0f), typedArray.getFloat(4, 0.0f));
                this.tilt = typedArray.getFloat(5, 0.0f);
                this.zoom = typedArray.getFloat(6, 0.0f);
            }
        }

        public Builder(CameraPosition cameraPosition) {
            JR1.A1H(this);
            if (cameraPosition != null) {
                this.bearing = cameraPosition.bearing;
                this.target = cameraPosition.target;
                this.tilt = cameraPosition.tilt;
                this.zoom = cameraPosition.zoom;
            }
        }

        public Builder(CameraUpdateFactory.CameraPositionUpdate cameraPositionUpdate) {
            JR1.A1H(this);
            if (cameraPositionUpdate != null) {
                this.bearing = cameraPositionUpdate.bearing;
                this.target = cameraPositionUpdate.target;
                this.tilt = cameraPositionUpdate.tilt;
                this.zoom = cameraPositionUpdate.zoom;
            }
        }

        public Builder(CameraUpdateFactory.ZoomUpdate zoomUpdate) {
            JR1.A1H(this);
            if (zoomUpdate != null) {
                this.zoom = zoomUpdate.zoom;
            }
        }

        public Builder bearing(double d) {
            while (d >= 360.0d) {
                d -= 360.0d;
            }
            while (d < 0.0d) {
                d += 360.0d;
            }
            this.bearing = d;
            return this;
        }

        public CameraPosition build() {
            return new CameraPosition(this.target, this.zoom, this.tilt, this.bearing);
        }

        public Builder target(LatLng latLng) {
            this.target = latLng;
            return this;
        }

        public Builder tilt(double d) {
            this.tilt = Math.max(0.0d, Math.min(60.0d, d));
            return this;
        }

        public Builder zoom(double d) {
            this.zoom = d;
            return this;
        }
    }

    public CameraPosition(LatLng latLng, double d, double d2, double d3) {
        this.target = latLng;
        this.bearing = d3;
        this.tilt = d2;
        this.zoom = d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            CameraPosition cameraPosition = (CameraPosition) obj;
            LatLng latLng = this.target;
            if ((latLng != null && !latLng.equals(cameraPosition.target)) || this.zoom != cameraPosition.zoom || this.tilt != cameraPosition.tilt || this.bearing != cameraPosition.bearing) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A04(this.target) + 31;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("Target: ");
        A0k.append(this.target);
        A0k.append(", Zoom:");
        A0k.append(this.zoom);
        A0k.append(", Bearing:");
        A0k.append(this.bearing);
        A0k.append(", Tilt:");
        A0k.append(this.tilt);
        return A0k.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.bearing);
        parcel.writeParcelable(this.target, i);
        parcel.writeDouble(this.tilt);
        parcel.writeDouble(this.zoom);
    }
}
