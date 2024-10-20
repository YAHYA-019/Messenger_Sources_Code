package com.facebook.messaging.service.model;

import X.1BL;
import X.AbK;
import X.AbM;
import X.AnonymousClass001;
import X.CSS;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.RegularImmutableMap;
import com.google.common.collect.RegularImmutableSet;
import java.util.Map;
import java.util.Set;

/* loaded from: DeleteMessagesResult.class */
public final class DeleteMessagesResult implements Parcelable {
    public static final DeleteMessagesResult A07;
    public static final Parcelable.Creator CREATOR;
    public final ThreadKey A00;
    public final ThreadSummary A01;
    public final ImmutableMap A02;
    public final ImmutableSet A03;
    public final ImmutableSet A04;
    public final boolean A05;
    public final boolean A06;

    static {
        RegularImmutableSet regularImmutableSet = RegularImmutableSet.A05;
        A07 = new DeleteMessagesResult(null, null, RegularImmutableMap.A03, regularImmutableSet, regularImmutableSet, false, false);
        CREATOR = CSS.A00(78);
    }

    public DeleteMessagesResult(Parcel parcel) {
        this.A01 = (ThreadSummary) 1BL.A0C(parcel, ThreadSummary.class);
        this.A00 = AbK.A0X(parcel);
        this.A03 = (ImmutableSet) parcel.readSerializable();
        this.A02 = (ImmutableMap) parcel.readSerializable();
        this.A04 = (ImmutableSet) parcel.readSerializable();
        this.A05 = AnonymousClass001.A1N(parcel.readInt());
        this.A06 = AbM.A1V(parcel);
    }

    public DeleteMessagesResult(ThreadKey threadKey, ThreadSummary threadSummary, Map map, Set set, Set set2, boolean z, boolean z2) {
        this.A01 = threadSummary;
        this.A00 = threadKey;
        this.A03 = ImmutableSet.A07(set);
        this.A02 = ImmutableMap.copyOf(map);
        this.A04 = ImmutableSet.A07(set2);
        this.A05 = z;
        this.A06 = z2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A01, i);
        parcel.writeParcelable(this.A00, i);
        parcel.writeSerializable(this.A03);
        parcel.writeSerializable(this.A02);
        parcel.writeSerializable(this.A04);
        parcel.writeInt(this.A05 ? 1 : 0);
        parcel.writeInt(this.A06 ? 1 : 0);
    }
}
