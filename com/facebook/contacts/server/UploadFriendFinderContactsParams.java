package com.facebook.contacts.server;

import X.0S2;
import X.AbN;
import X.AnonymousClass001;
import X.C53v;
import X.DKG;
import X.FKX;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;

/* loaded from: UploadFriendFinderContactsParams.class */
public final class UploadFriendFinderContactsParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKX.A00(55);
    public final ImmutableList A00;
    public final Integer A01;
    public final String A02;
    public final String A03;
    public final boolean A04;

    public UploadFriendFinderContactsParams(Parcel parcel) {
        Integer num;
        String readString = parcel.readString();
        if (readString.equals("CONTACT_IMPORTER")) {
            num = 0S2.A00;
        } else if (readString.equals("CONTINUOUS_SYNC")) {
            num = 0S2.A01;
        } else {
            if (!readString.equals("QUICK_PROMOTION")) {
                throw AnonymousClass001.A0L(readString);
            }
            num = 0S2.A0C;
        }
        this.A01 = num;
        this.A03 = parcel.readString();
        this.A00 = AbN.A0e(parcel, UploadBulkContactChange.class);
        this.A04 = C53v.A0S(parcel);
        this.A02 = parcel.readString();
    }

    public UploadFriendFinderContactsParams(Integer num, String str, String str2, List list, boolean z) {
        num.getClass();
        DKG.A1V(str);
        this.A01 = num;
        this.A03 = str;
        this.A00 = ImmutableList.copyOf((Collection) list);
        this.A04 = z;
        this.A02 = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        String str;
        switch (this.A01.intValue()) {
            case 1:
                str = "CONTINUOUS_SYNC";
                break;
            case 2:
                str = "QUICK_PROMOTION";
                break;
            default:
                str = "CONTACT_IMPORTER";
                break;
        }
        parcel.writeString(str);
        parcel.writeString(this.A03);
        parcel.writeList(this.A00);
        parcel.writeInt(this.A04 ? 1 : 0);
        parcel.writeString(this.A02);
    }
}
