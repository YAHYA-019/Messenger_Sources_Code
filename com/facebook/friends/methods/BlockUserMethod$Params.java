package com.facebook.friends.methods;

import X.AnonymousClass001;
import X.FKX;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.graphql.enums.EnumHelper;
import com.facebook.graphql.enums.GraphQLBlockSource;
import java.util.ArrayList;
import java.util.List;

/* loaded from: BlockUserMethod$Params.class */
public final class BlockUserMethod$Params implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FKX(80);
    public final long A00;
    public final long A01;
    public final GraphQLBlockSource A02;
    public final List A03;
    public final boolean A04;

    public BlockUserMethod$Params(Parcel parcel) {
        this.A01 = parcel.readLong();
        this.A02 = EnumHelper.A00(GraphQLBlockSource.A01, parcel.readString());
        boolean[] zArr = new boolean[1];
        parcel.readBooleanArray(zArr);
        boolean z = zArr[0];
        this.A04 = z;
        if (!z) {
            this.A00 = parcel.readLong();
            return;
        }
        this.A00 = -1;
        ArrayList A0s = AnonymousClass001.A0s();
        this.A03 = A0s;
        parcel.readStringList(A0s);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.A01);
        parcel.writeString(this.A02.name().toLowerCase());
        boolean z = this.A04;
        parcel.writeBooleanArray(new boolean[]{z});
        if (z) {
            parcel.writeStringList(this.A03);
        } else {
            parcel.writeLong(this.A00);
        }
    }
}
