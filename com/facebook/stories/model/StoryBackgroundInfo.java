package com.facebook.stories.model;

import X.11T;
import X.1BL;
import X.1Du;
import X.C1pq;
import X.C3o5;
import X.FKe;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: StoryBackgroundInfo.class */
public final class StoryBackgroundInfo implements Parcelable {
    public static volatile String A04;
    public static final Parcelable.Creator CREATOR = new FKe(69);
    public final ImmutableList A00;
    public final String A01;
    public final String A02;
    public final Set A03;

    public StoryBackgroundInfo(Parcel parcel) {
        int A01 = C3o5.A01(parcel, this);
        String[] strArr = new String[A01];
        int i = 0;
        for (int i2 = 0; i2 < A01; i2++) {
            strArr[i2] = parcel.readString();
        }
        this.A00 = ImmutableList.copyOf(strArr);
        this.A02 = parcel.readInt() != 0 ? parcel.readString() : null;
        this.A01 = C3o5.A0O(parcel);
        HashSet hashSet = new HashSet();
        int readInt = parcel.readInt();
        while (i < readInt) {
            i = C3o5.A02(parcel, hashSet, i);
        }
        this.A03 = Collections.unmodifiableSet(hashSet);
    }

    public StoryBackgroundInfo(ImmutableList immutableList, String str, String str2, Set set) {
        C1pq.A08("colors", immutableList);
        this.A00 = immutableList;
        this.A02 = str;
        this.A01 = str2;
        this.A03 = Collections.unmodifiableSet(set);
    }

    public String A00() {
        if (this.A03.contains("direction")) {
            return this.A02;
        }
        if (A04 == null) {
            synchronized (this) {
                if (A04 == null) {
                    A04 = "TOP_BOTTOM";
                }
            }
        }
        return A04;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof StoryBackgroundInfo)) {
                return false;
            }
            StoryBackgroundInfo storyBackgroundInfo = (StoryBackgroundInfo) obj;
            if (!11T.A0O(this.A00, storyBackgroundInfo.A00) || !11T.A0O(A00(), storyBackgroundInfo.A00()) || !11T.A0O(this.A01, storyBackgroundInfo.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A01, C1pq.A04(A00(), C1pq.A03(this.A00)));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1Du A0b = 1BL.A0b(parcel, this.A00);
        while (A0b.hasNext()) {
            C3o5.A0h(parcel, A0b);
        }
        1BL.A13(parcel, this.A02);
        1BL.A13(parcel, this.A01);
        Iterator A0S = C3o5.A0S(parcel, this.A03);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
