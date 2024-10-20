package com.facebook.messaging.msys.thread.reactions.reactors.fragment;

import X.11T;
import X.1BL;
import X.4YW;
import X.7zR;
import X.7zV;
import X.C53v;
import X.CST;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.xapp.messaging.capability.vector.Capabilities;
import com.facebook.xapp.messaging.map.HeterogeneousMap;
import com.google.common.collect.ImmutableMultimap;
import java.util.Iterator;
import java.util.List;

/* loaded from: MessageReactorsParams.class */
public final class MessageReactorsParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = new CST(39);
    public final int A00;
    public final ThreadKey A01;
    public final Capabilities A02;
    public final HeterogeneousMap A03;
    public final ImmutableMultimap A04;
    public final Long A05;
    public final String A06;
    public final String A07;
    public final List A08;
    public final boolean A09;

    public MessageReactorsParams(ThreadKey threadKey, Capabilities capabilities, HeterogeneousMap heterogeneousMap, ImmutableMultimap immutableMultimap, Long l, String str, String str2, List list, int i, boolean z) {
        1BL.A1H(immutableMultimap, threadKey, str);
        7zR.A1P(str2, capabilities);
        11T.A0F(heterogeneousMap, 10);
        this.A04 = immutableMultimap;
        this.A01 = threadKey;
        this.A06 = str;
        this.A09 = z;
        this.A00 = i;
        this.A08 = list;
        this.A07 = str2;
        this.A02 = capabilities;
        this.A05 = l;
        this.A03 = heterogeneousMap;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        C53v.A0G(parcel, this.A04);
        parcel.writeParcelable(this.A01, i);
        parcel.writeString(this.A06);
        parcel.writeInt(this.A09 ? 1 : 0);
        parcel.writeInt(this.A00);
        Iterator A09 = 4YW.A09(parcel, this.A08);
        while (A09.hasNext()) {
            parcel.writeParcelable((Parcelable) A09.next(), i);
        }
        parcel.writeString(this.A07);
        parcel.writeParcelable(this.A02, i);
        7zV.A0m(parcel, this.A05);
        parcel.writeParcelable(this.A03, i);
    }
}
