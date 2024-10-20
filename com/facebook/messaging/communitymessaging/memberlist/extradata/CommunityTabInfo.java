package com.facebook.messaging.communitymessaging.memberlist.extradata;

import X.11T;
import X.1BL;
import X.BM3;
import X.CSW;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* loaded from: CommunityTabInfo.class */
public final class CommunityTabInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSW.A00(79);
    public final List A00;
    public final int A01;

    public CommunityTabInfo(List list, int i) {
        this.A01 = i;
        this.A00 = list;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeInt(this.A01);
        List list = this.A00;
        parcel.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            1BL.A12(parcel, (BM3) it.next());
        }
    }
}
