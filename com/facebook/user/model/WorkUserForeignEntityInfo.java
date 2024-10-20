package com.facebook.user.model;

import X.11T;
import X.1uO;
import X.C1pq;
import X.C2xc;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.graphql.enums.GraphQLWorkForeignEntityType;
import com.fasterxml.jackson.databind.JsonSerializer;

/* loaded from: WorkUserForeignEntityInfo.class */
public final class WorkUserForeignEntityInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C2xc(59);
    public final GraphQLWorkForeignEntityType A00;
    public final String A01;

    /* loaded from: WorkUserForeignEntityInfo$Serializer.class */
    public class Serializer extends JsonSerializer {
    }

    public WorkUserForeignEntityInfo(1uO r302) {
        this.A01 = r302.A01;
        this.A00 = r302.A00;
    }

    public WorkUserForeignEntityInfo(Parcel parcel) {
        getClass().getClassLoader();
        GraphQLWorkForeignEntityType graphQLWorkForeignEntityType = null;
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = parcel.readString();
        }
        this.A00 = parcel.readInt() != 0 ? GraphQLWorkForeignEntityType.values()[parcel.readInt()] : graphQLWorkForeignEntityType;
    }

    public WorkUserForeignEntityInfo(GraphQLWorkForeignEntityType graphQLWorkForeignEntityType, String str) {
        this.A01 = str;
        this.A00 = graphQLWorkForeignEntityType;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof WorkUserForeignEntityInfo)) {
                return false;
            }
            WorkUserForeignEntityInfo workUserForeignEntityInfo = (WorkUserForeignEntityInfo) obj;
            if (!11T.A0O(this.A01, workUserForeignEntityInfo.A01) || this.A00 != workUserForeignEntityInfo.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A03 = C1pq.A03(this.A01);
        GraphQLWorkForeignEntityType graphQLWorkForeignEntityType = this.A00;
        return (A03 * 31) + (graphQLWorkForeignEntityType == null ? -1 : graphQLWorkForeignEntityType.ordinal());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        String str = this.A01;
        if (str == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(str);
        }
        GraphQLWorkForeignEntityType graphQLWorkForeignEntityType = this.A00;
        if (graphQLWorkForeignEntityType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(graphQLWorkForeignEntityType.ordinal());
        }
    }
}
