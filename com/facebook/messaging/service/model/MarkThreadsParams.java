package com.facebook.messaging.service.model;

import X.0S2;
import X.1BJ;
import X.1Du;
import X.82M;
import X.C3Ov;
import X.C53v;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;

/* loaded from: MarkThreadsParams.class */
public final class MarkThreadsParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = new 82M(88);
    public final ImmutableList A00;
    public final ImmutableList A01;
    public final Integer A02;
    public final boolean A03;

    public MarkThreadsParams(Parcel parcel) {
        Integer num;
        String readString = parcel.readString();
        if (readString == null) {
            num = null;
        } else if (readString.equals("READ")) {
            num = 0S2.A00;
        } else if (readString.equals("ARCHIVED")) {
            num = 0S2.A01;
        } else if (readString.equals("SPAM")) {
            num = 0S2.A0C;
        } else if (readString.equals("OTHER")) {
            num = 0S2.A0N;
        } else if (readString.equals("INBOX")) {
            num = 0S2.A0Y;
        } else {
            if (!readString.equals(1BJ.A00(829))) {
                throw new IllegalArgumentException(readString);
            }
            num = 0S2.A0j;
        }
        this.A02 = num;
        this.A03 = C53v.A0S(parcel);
        ArrayList createTypedArrayList = parcel.createTypedArrayList(MarkThreadFields.CREATOR);
        createTypedArrayList.getClass();
        this.A00 = ImmutableList.copyOf((Collection) createTypedArrayList);
        ArrayList createTypedArrayList2 = parcel.createTypedArrayList(ThreadKey.CREATOR);
        createTypedArrayList2.getClass();
        this.A01 = ImmutableList.copyOf((Collection) createTypedArrayList2);
    }

    public MarkThreadsParams(ImmutableList.Builder builder, Integer num, boolean z) {
        this.A02 = num;
        this.A03 = z;
        this.A00 = builder.build();
        ImmutableList.Builder builder2 = ImmutableList.builder();
        1Du it = this.A00.iterator();
        while (it.hasNext()) {
            builder2.m11011add((Object) ((MarkThreadFields) it.next()).A06);
        }
        this.A01 = builder2.build();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Integer num = this.A02;
        parcel.writeString(num == null ? null : C3Ov.A01(num));
        parcel.writeInt(this.A03 ? 1 : 0);
        parcel.writeTypedList(this.A00);
        parcel.writeTypedList(this.A01);
    }
}
