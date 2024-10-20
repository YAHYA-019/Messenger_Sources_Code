package com.facebook.xapp.messaging.emoji.service;

import X.11T;
import X.1BL;
import X.4YV;
import X.82N;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ui.emoji.model.Emoji;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: FetchRecentEmojiResult.class */
public final class FetchRecentEmojiResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = new 82N(22);
    public final ImmutableList A00;

    public FetchRecentEmojiResult(Parcel parcel) {
        ArrayList A0y = 4YV.A0y(parcel, Emoji.class);
        11T.A0I(A0y, "null cannot be cast to non-null type kotlin.collections.List<com.facebook.ui.emoji.model.Emoji>");
        this.A00 = 1BL.A0a(A0y);
    }

    public FetchRecentEmojiResult(List list) {
        11T.A0F(list, 1);
        ImmutableList copyOf = ImmutableList.copyOf((Collection) list);
        11T.A0A(copyOf);
        this.A00 = copyOf;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeList(this.A00);
    }
}
