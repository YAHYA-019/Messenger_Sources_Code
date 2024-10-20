package com.facebook.messaging.location.model;

import X.4YV;
import X.C53v;
import X.CSV;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.Objects;
import java.util.Arrays;

/* loaded from: NearbyPlace.class */
public class NearbyPlace implements Parcelable {
    public static final NearbyPlace A00 = new NearbyPlace(null, null, null, null, null, null, null, "nearby_place_title", null, false, false, true);
    public static final NearbyPlace A01 = new NearbyPlace(null, null, null, null, null, null, null, "recent_searche_title", null, false, false, true);
    public static final Parcelable.Creator CREATOR = new CSV(7);
    public final String categoryIconNameString;
    public final String distance;
    public final Double distanceInMeters;
    public final String fullAddress;
    public final String id;
    public final boolean isFreeForm;
    public final boolean isPage;
    public boolean isRecent;
    public final boolean isSectionHeader;
    public final Double latitude;
    public final Double longitude;
    public final String name;
    public final String profilePicUriString;

    public NearbyPlace() {
        this(null, null, null, null, null, null, null, null, null, false, false, false);
    }

    public NearbyPlace(Parcel parcel) {
        this.id = parcel.readString();
        this.name = parcel.readString();
        this.profilePicUriString = parcel.readString();
        this.latitude = (Double) parcel.readValue(null);
        this.longitude = (Double) parcel.readValue(null);
        this.distance = parcel.readString();
        this.fullAddress = parcel.readString();
        this.categoryIconNameString = parcel.readString();
        this.isPage = C53v.A0S(parcel);
        this.isFreeForm = C53v.A0S(parcel);
        this.isRecent = C53v.A0S(parcel);
        this.isSectionHeader = C53v.A0S(parcel);
        this.distanceInMeters = (Double) parcel.readValue(null);
    }

    public NearbyPlace(Double d, Double d2, Double d3, String str, String str2, String str3, String str4, String str5, String str6, boolean z, boolean z2, boolean z3) {
        this.id = str4;
        this.name = str5;
        this.profilePicUriString = str6;
        this.latitude = d2;
        this.longitude = d3;
        this.distance = str2;
        this.fullAddress = str3;
        this.categoryIconNameString = str;
        this.isPage = z2;
        this.isFreeForm = z;
        this.isRecent = false;
        this.isSectionHeader = z3;
        this.distanceInMeters = d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj != null && (obj instanceof NearbyPlace)) {
            NearbyPlace nearbyPlace = (NearbyPlace) obj;
            if (Objects.equal(this.id, nearbyPlace.id) && Objects.equal(this.name, nearbyPlace.name) && Objects.equal(this.profilePicUriString, nearbyPlace.profilePicUriString) && Objects.equal(this.distance, nearbyPlace.distance) && Objects.equal(this.fullAddress, nearbyPlace.fullAddress) && Objects.equal(this.categoryIconNameString, nearbyPlace.categoryIconNameString) && this.isPage == nearbyPlace.isPage && this.isFreeForm == nearbyPlace.isFreeForm && this.isRecent == nearbyPlace.isRecent && this.isSectionHeader == nearbyPlace.isSectionHeader && Objects.equal(this.latitude, nearbyPlace.latitude) && Objects.equal(this.longitude, nearbyPlace.longitude)) {
                z = 4YV.A1Z(this.distanceInMeters, nearbyPlace.distanceInMeters);
            }
        }
        return z;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.id, this.name, this.profilePicUriString, this.distance, this.fullAddress, this.categoryIconNameString, Boolean.valueOf(this.isPage), Boolean.valueOf(this.isFreeForm), Boolean.valueOf(this.isRecent), Boolean.valueOf(this.isSectionHeader), this.latitude, this.longitude, this.distanceInMeters});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeString(this.name);
        parcel.writeString(this.profilePicUriString);
        parcel.writeValue(this.latitude);
        parcel.writeValue(this.longitude);
        parcel.writeString(this.distance);
        parcel.writeString(this.fullAddress);
        parcel.writeString(this.categoryIconNameString);
        parcel.writeInt(this.isPage ? 1 : 0);
        parcel.writeInt(this.isFreeForm ? 1 : 0);
        parcel.writeInt(this.isRecent ? 1 : 0);
        parcel.writeInt(this.isSectionHeader ? 1 : 0);
        parcel.writeValue(this.distanceInMeters);
    }
}
