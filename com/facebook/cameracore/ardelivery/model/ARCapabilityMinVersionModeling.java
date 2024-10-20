package com.facebook.cameracore.ardelivery.model;

import X.7zN;
import X.AbM;
import X.AnonymousClass001;
import X.DKG;
import X.DKf;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.Objects;
import java.io.Serializable;

/* loaded from: ARCapabilityMinVersionModeling.class */
public class ARCapabilityMinVersionModeling implements Parcelable, Serializable {
    public static final Parcelable.Creator CREATOR = DKf.A00(73);
    public static final long serialVersionUID = 0;
    public VersionedCapability mCapability;
    public int mMinVersion;

    public ARCapabilityMinVersionModeling() {
    }

    public ARCapabilityMinVersionModeling(int i, int i2) {
        VersionedCapability fromXplatValue = VersionedCapability.fromXplatValue(i);
        fromXplatValue.getClass();
        this.mCapability = fromXplatValue;
        this.mMinVersion = i2;
    }

    public ARCapabilityMinVersionModeling(Parcel parcel) {
        this.mCapability = VersionedCapability.values()[parcel.readInt()];
        this.mMinVersion = parcel.readInt();
    }

    public /* synthetic */ ARCapabilityMinVersionModeling(Parcel parcel, DKf dKf) {
        this(parcel);
    }

    public ARCapabilityMinVersionModeling(VersionedCapability versionedCapability, int i) {
        this.mCapability = versionedCapability;
        this.mMinVersion = i;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || obj.getClass() != getClass()) {
                return false;
            }
            ARCapabilityMinVersionModeling aRCapabilityMinVersionModeling = (ARCapabilityMinVersionModeling) obj;
            if (!Objects.equal(this.mCapability, aRCapabilityMinVersionModeling.mCapability)) {
                return false;
            }
            if (!DKG.A1Z(aRCapabilityMinVersionModeling.mMinVersion, Integer.valueOf(this.mMinVersion))) {
                return false;
            }
        }
        return true;
    }

    public VersionedCapability getCapability() {
        return this.mCapability;
    }

    public int getCapabilityXplatValue() {
        return this.mCapability.getXplatValue();
    }

    public int getMinVersion() {
        return this.mMinVersion;
    }

    public int hashCode() {
        return AbM.A05(this.mCapability, Integer.valueOf(this.mMinVersion));
    }

    public boolean isCapabilityBodyTracking() {
        return Objects.equal(this.mCapability, VersionedCapability.BodyTracking);
    }

    public boolean isCapabilityFacetracker() {
        return Objects.equal(this.mCapability, VersionedCapability.Facetracker);
    }

    public boolean isCapabilityGazeCorrection() {
        return Objects.equal(this.mCapability, VersionedCapability.GazeCorrection);
    }

    public boolean isCapabilityHairSegmentation() {
        return Objects.equal(this.mCapability, VersionedCapability.HairSegmentation);
    }

    public boolean isCapabilitySegmentation() {
        return Objects.equal(this.mCapability, VersionedCapability.Segmentation);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("capability: ");
        A0k.append(this.mCapability);
        A0k.append(", minVersion:");
        A0k.append(this.mMinVersion);
        return A0k.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        7zN.A0z(parcel, this.mCapability);
        parcel.writeInt(this.mMinVersion);
    }
}
