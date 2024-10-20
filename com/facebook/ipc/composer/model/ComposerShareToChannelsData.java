package com.facebook.ipc.composer.model;

import X.11T;
import X.1BL;
import X.1Du;
import X.AbH;
import X.AbJ;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.FKa;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;

/* loaded from: ComposerShareToChannelsData.class */
public final class ComposerShareToChannelsData implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKa.A00(66);
    public final ImmutableList A00;
    public final String A01;
    public final boolean A02;
    public final boolean A03;

    public ComposerShareToChannelsData(Parcel parcel) {
        this.A02 = AnonymousClass001.A1Q(C3o5.A01(parcel, this), 1);
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        int i = 0;
        while (i < readInt) {
            i = AbH.A00(parcel, strArr, i);
        }
        this.A00 = ImmutableList.copyOf(strArr);
        this.A03 = AbJ.A1W(parcel);
        this.A01 = parcel.readString();
    }

    public ComposerShareToChannelsData(ImmutableList immutableList, String str, boolean z, boolean z2) {
        this.A02 = z;
        C1pq.A08("selectedChannelIds", immutableList);
        this.A00 = immutableList;
        this.A03 = z2;
        C1pq.A08("textMessage", str);
        this.A01 = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ComposerShareToChannelsData)) {
                return false;
            }
            ComposerShareToChannelsData composerShareToChannelsData = (ComposerShareToChannelsData) obj;
            if (this.A02 != composerShareToChannelsData.A02 || !11T.A0O(this.A00, composerShareToChannelsData.A00) || this.A03 != composerShareToChannelsData.A03 || !11T.A0O(this.A01, composerShareToChannelsData.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A01, C1pq.A02(C1pq.A04(this.A00, C1pq.A05(this.A02)), this.A03));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A02 ? 1 : 0);
        1Du A0b = 1BL.A0b(parcel, this.A00);
        while (A0b.hasNext()) {
            C3o5.A0h(parcel, A0b);
        }
        parcel.writeInt(this.A03 ? 1 : 0);
        parcel.writeString(this.A01);
    }
}
