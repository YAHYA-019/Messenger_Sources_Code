package com.facebook.xapp.messaging.profile.logging;

import X.11T;
import X.1Du;
import X.4YU;
import X.4YV;
import X.7zU;
import X.AbG;
import X.AbL;
import X.AnonymousClass001;
import X.C1pq;
import X.FKb;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.google.common.collect.ImmutableMap;
import java.util.HashMap;
import java.util.Map;

/* loaded from: ContextualProfileLoggingData.class */
public final class ContextualProfileLoggingData implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FKb(57);
    public final ThreadKey A00;
    public final ImmutableMap A01;
    public final String A02;
    public final String A03;
    public final boolean A04;

    public ContextualProfileLoggingData(Parcel parcel) {
        this.A02 = 7zU.A0l(parcel, this);
        this.A03 = parcel.readString();
        int i = 0;
        this.A04 = 4YV.A1U(parcel.readInt());
        HashMap A0u = AnonymousClass001.A0u();
        int readInt = parcel.readInt();
        while (i < readInt) {
            i = AbL.A01(parcel, A0u, i);
        }
        this.A01 = ImmutableMap.copyOf((Map) A0u);
        this.A00 = parcel.readInt() == 0 ? null : (ThreadKey) ThreadKey.CREATOR.createFromParcel(parcel);
    }

    public ContextualProfileLoggingData(ThreadKey threadKey, ImmutableMap immutableMap, String str, String str2, boolean z) {
        C1pq.A08("entryPoint", str);
        this.A02 = str;
        C1pq.A08("entryPointType", str2);
        this.A03 = str2;
        this.A04 = z;
        C1pq.A08("metadata", immutableMap);
        this.A01 = immutableMap;
        this.A00 = threadKey;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ContextualProfileLoggingData)) {
                return false;
            }
            ContextualProfileLoggingData contextualProfileLoggingData = (ContextualProfileLoggingData) obj;
            if (!11T.A0O(this.A02, contextualProfileLoggingData.A02) || !11T.A0O(this.A03, contextualProfileLoggingData.A03) || this.A04 != contextualProfileLoggingData.A04 || !11T.A0O(this.A01, contextualProfileLoggingData.A01) || !11T.A0O(this.A00, contextualProfileLoggingData.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A00, C1pq.A04(this.A01, C1pq.A02(C1pq.A04(this.A03, C1pq.A03(this.A02)), this.A04)));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeInt(this.A04 ? 1 : 0);
        ImmutableMap immutableMap = this.A01;
        AbG.A1G(parcel, immutableMap);
        1Du A0i = 4YU.A0i(immutableMap);
        while (A0i.hasNext()) {
            AbL.A0n(parcel, A0i);
        }
        ThreadKey threadKey = this.A00;
        if (threadKey == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            threadKey.writeToParcel(parcel, i);
        }
    }
}
