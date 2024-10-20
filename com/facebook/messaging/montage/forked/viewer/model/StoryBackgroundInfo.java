package com.facebook.messaging.montage.forked.viewer.model;

import X.11T;
import X.1BL;
import X.1Du;
import X.C1pq;
import X.C3o5;
import X.C48e;
import X.C4Ny;
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
    public static final Parcelable.Creator CREATOR = new C4Ny(21);
    public final ImmutableList A00;
    public final String A01;
    public final String A02;
    public final Set A03;

    public StoryBackgroundInfo(C48e c48e) {
        ImmutableList immutableList = c48e.A00;
        C1pq.A08("colors", immutableList);
        this.A00 = immutableList;
        this.A02 = c48e.A01;
        this.A01 = c48e.A02;
        this.A03 = Collections.unmodifiableSet(c48e.A03);
    }

    public StoryBackgroundInfo(Parcel parcel) {
        getClass().getClassLoader();
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        for (int i = 0; i < readInt; i++) {
            strArr[i] = parcel.readString();
        }
        this.A00 = ImmutableList.copyOf(strArr);
        String str = null;
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = parcel.readString();
        }
        this.A01 = parcel.readInt() != 0 ? parcel.readString() : str;
        HashSet hashSet = new HashSet();
        int readInt2 = parcel.readInt();
        for (int i2 = 0; i2 < readInt2; i2++) {
            hashSet.add(parcel.readString());
        }
        this.A03 = Collections.unmodifiableSet(hashSet);
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
