package com.facebook.xapp.messaging.threadview.model.groupedmessages;

import X.11T;
import X.4YV;
import X.4YW;
import X.5PP;
import X.82N;
import X.AnonymousClass001;
import X.C04v;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* loaded from: GroupedMessageForwardMetadata.class */
public final class GroupedMessageForwardMetadata extends C04v implements Parcelable, 5PP {
    public static final Parcelable.Creator CREATOR = new 82N(32);
    public final String A00;
    public final List A01;
    public final List A02;

    public GroupedMessageForwardMetadata(String str, List list, List list2) {
        11T.A0F(list, 1);
        11T.A0F(list2, 2);
        this.A01 = list;
        this.A02 = list2;
        this.A00 = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof GroupedMessageForwardMetadata)) {
                return false;
            }
            GroupedMessageForwardMetadata groupedMessageForwardMetadata = (GroupedMessageForwardMetadata) obj;
            if (!11T.A0O(this.A01, groupedMessageForwardMetadata.A01) || !11T.A0O(this.A02, groupedMessageForwardMetadata.A02) || !11T.A0O(this.A00, groupedMessageForwardMetadata.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int hashCode = ((this.A01.hashCode() * 31) + this.A02.hashCode()) * 31;
        String str = this.A00;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("GroupedMessageForwardMetadata(messageIds=");
        A0k.append(this.A01);
        A0k.append(", messageTimeStamps=");
        A0k.append(this.A02);
        A0k.append(", groupId=");
        A0k.append(this.A00);
        return 4YV.A0x(A0k);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeStringList(this.A01);
        Iterator A09 = 4YW.A09(parcel, this.A02);
        while (A09.hasNext()) {
            parcel.writeLong(AnonymousClass001.A05(A09.next()));
        }
        parcel.writeString(this.A00);
    }
}
