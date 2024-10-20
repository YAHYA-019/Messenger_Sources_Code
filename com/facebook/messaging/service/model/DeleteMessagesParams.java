package com.facebook.messaging.service.model;

import X.0S2;
import X.0fH;
import X.AbK;
import X.AnonymousClass001;
import X.CSS;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.RegularImmutableSet;
import java.util.ArrayList;

/* loaded from: DeleteMessagesParams.class */
public final class DeleteMessagesParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSS.A00(77);
    public final ThreadKey A00;
    public final ImmutableSet A01;
    public final ImmutableSet A02;
    public final Integer A03;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v28, types: [com.google.common.collect.ImmutableSet] */
    public DeleteMessagesParams(Parcel parcel) {
        Integer num;
        this.A01 = ImmutableSet.A07(parcel.createStringArrayList());
        String readString = parcel.readString();
        if (readString.equals("MUST_UPDATE_SERVER")) {
            num = 0S2.A00;
        } else {
            if (!readString.equals("CLIENT_ONLY")) {
                throw AnonymousClass001.A0L(readString);
            }
            num = 0S2.A01;
        }
        this.A03 = num;
        this.A00 = AbK.A0X(parcel);
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        this.A02 = createStringArrayList != null ? ImmutableSet.A07(createStringArrayList) : RegularImmutableSet.A05;
    }

    public DeleteMessagesParams(ThreadKey threadKey, ImmutableSet immutableSet, ImmutableSet immutableSet2, Integer num) {
        this.A01 = immutableSet;
        this.A02 = immutableSet2;
        this.A03 = num;
        this.A00 = threadKey;
        if (threadKey == null) {
            0fH.A0o("DeleteMessagesParams", "Thread key is null");
        }
    }

    public DeleteMessagesParams(ThreadKey threadKey, ImmutableSet immutableSet, Integer num) {
        this(threadKey, immutableSet, RegularImmutableSet.A05, num);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.A01.asList());
        parcel.writeString(1 - this.A03.intValue() != 0 ? "MUST_UPDATE_SERVER" : "CLIENT_ONLY");
        parcel.writeParcelable(this.A00, i);
        parcel.writeStringList(this.A02.asList());
    }
}
