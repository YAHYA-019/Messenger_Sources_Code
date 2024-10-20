package com.facebook.messaging.memories.model;

import X.11T;
import X.C04v;
import X.C3o5;
import X.CSV;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.graphql.enums.GraphQLMessagingThreadType;
import com.google.common.collect.ImmutableList;

/* loaded from: MemoryHiddenThreadModel.class */
public final class MemoryHiddenThreadModel extends C04v implements Parcelable {
    public static final Parcelable.Creator CREATOR = new CSV(35);
    public final GraphQLMessagingThreadType A00;
    public final ImmutableList A01;
    public final Long A02;
    public final Long A03;
    public final String A04;
    public final String A05;
    public final String A06;

    public MemoryHiddenThreadModel(GraphQLMessagingThreadType graphQLMessagingThreadType, ImmutableList immutableList, Long l, Long l2, String str, String str2, String str3) {
        11T.A0F(immutableList, 7);
        this.A03 = l;
        this.A02 = l2;
        this.A04 = str;
        this.A06 = str2;
        this.A00 = graphQLMessagingThreadType;
        this.A05 = str3;
        this.A01 = immutableList;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        C3o5.A0g(parcel, this.A03);
        C3o5.A0g(parcel, this.A02);
        parcel.writeString(this.A04);
        parcel.writeString(this.A06);
        GraphQLMessagingThreadType graphQLMessagingThreadType = this.A00;
        if (graphQLMessagingThreadType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(graphQLMessagingThreadType.name());
        }
        parcel.writeString(this.A05);
        parcel.writeSerializable(this.A01);
    }
}
