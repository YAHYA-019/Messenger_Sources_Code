package com.mapbox.mapboxsdk.geometry;

import X.0C9;
import X.AnonymousClass001;
import X.AnonymousClass002;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: ProjectedMeters.class */
public class ProjectedMeters implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: com.mapbox.mapboxsdk.geometry.ProjectedMeters.1
        @Override // android.os.Parcelable.Creator
        public ProjectedMeters createFromParcel(Parcel parcel) {
            return new ProjectedMeters(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            ProjectedMeters projectedMeters = new ProjectedMeters(parcel);
            synchronized (0C9.A00) {
            }
            return projectedMeters;
        }

        @Override // android.os.Parcelable.Creator
        public ProjectedMeters[] newArray(int i) {
            return new ProjectedMeters[i];
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ProjectedMeters[i];
        }
    };
    public double easting;
    public double northing;

    public ProjectedMeters(double d, double d2) {
        this.northing = d;
        this.easting = d2;
    }

    public ProjectedMeters(Parcel parcel) {
        this.northing = parcel.readDouble();
        this.easting = parcel.readDouble();
    }

    public ProjectedMeters(ProjectedMeters projectedMeters) {
        this.northing = projectedMeters.northing;
        this.easting = projectedMeters.easting;
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
            ProjectedMeters projectedMeters = (ProjectedMeters) obj;
            if (Double.compare(projectedMeters.easting, this.easting) != 0 || Double.compare(projectedMeters.northing, this.northing) != 0) {
                return false;
            }
        }
        return true;
    }

    public double getEasting() {
        return this.easting;
    }

    public double getNorthing() {
        return this.northing;
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.easting);
        return AnonymousClass002.A03(Double.doubleToLongBits(this.northing), ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("ProjectedMeters [northing=");
        A0k.append(this.northing);
        A0k.append(", easting=");
        A0k.append(this.easting);
        return AnonymousClass001.A0d("]", A0k);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.northing);
        parcel.writeDouble(this.easting);
    }
}
