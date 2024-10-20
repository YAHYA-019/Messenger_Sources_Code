package com.facebook.quicksilver.model;

import X.11T;
import X.1BL;
import X.FKW;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.graphql.enums.GraphQLCloudGamingSupportedFeature;

/* loaded from: CloudGamingSupportedFeature.class */
public final class CloudGamingSupportedFeature implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKW.A00(83);
    public GraphQLCloudGamingSupportedFeature A00;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof CloudGamingSupportedFeature)) {
                return false;
            }
            if (((CloudGamingSupportedFeature) obj).A00 != this.A00) {
                z = false;
            }
        }
        return z;
    }

    public int hashCode() {
        GraphQLCloudGamingSupportedFeature graphQLCloudGamingSupportedFeature = this.A00;
        11T.A0D(graphQLCloudGamingSupportedFeature);
        return graphQLCloudGamingSupportedFeature.ordinal();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        GraphQLCloudGamingSupportedFeature graphQLCloudGamingSupportedFeature = this.A00;
        11T.A0D(graphQLCloudGamingSupportedFeature);
        1BL.A12(parcel, graphQLCloudGamingSupportedFeature);
    }
}
