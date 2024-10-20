package com.facebook.messaging.groups.create.model;

import X.7zL;
import X.AnonymousClass001;
import X.BKi;
import X.C53v;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.graphql.enums.GraphQLGroupVisibility;
import com.facebook.ui.media.attachments.model.MediaResource;
import com.google.common.base.Objects;
import com.google.common.collect.ImmutableList;
import java.util.Iterator;
import java.util.List;

/* loaded from: GroupCreationParams.class */
public final class GroupCreationParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = 7zL.A0v(70);
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public GraphQLGroupVisibility A04;
    public BKi A05;
    public MediaResource A06;
    public ImmutableList A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public List A0C;

    public void A00(ImmutableList immutableList) {
        if (Objects.equal(immutableList, this.A07)) {
            return;
        }
        this.A07 = immutableList;
        Iterator it = this.A0C.iterator();
        if (it.hasNext()) {
            it.next();
            throw AnonymousClass001.A0Q("onStateChanged");
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A0A);
        parcel.writeString(this.A0B);
        parcel.writeList(this.A07);
        parcel.writeInt(this.A03);
        parcel.writeParcelable(this.A06, i);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A00);
        C53v.A0J(parcel, this.A05);
        parcel.writeString(this.A08);
        parcel.writeString(this.A09);
        GraphQLGroupVisibility graphQLGroupVisibility = this.A04;
        parcel.writeString(graphQLGroupVisibility == null ? null : graphQLGroupVisibility.name());
    }
}
