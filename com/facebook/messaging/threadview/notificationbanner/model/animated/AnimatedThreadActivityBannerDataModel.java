package com.facebook.messaging.threadview.notificationbanner.model.animated;

import X.11T;
import X.1BL;
import X.1Du;
import X.AbE;
import X.C1pq;
import X.C3o5;
import X.CSU;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: AnimatedThreadActivityBannerDataModel.class */
public final class AnimatedThreadActivityBannerDataModel implements Parcelable {
    public static volatile String A06;
    public static final Parcelable.Creator CREATOR = new CSU(79);
    public final long A00;
    public final ImmutableList A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final Set A05;

    /* JADX WARN: Multi-variable type inference failed */
    public AnimatedThreadActivityBannerDataModel(Parcel parcel) {
        ClassLoader classLoader = getClass().getClassLoader();
        this.A02 = parcel.readString();
        int readInt = parcel.readInt();
        AnimatedThreadActivityBannerSingleViewModel[] animatedThreadActivityBannerSingleViewModelArr = new AnimatedThreadActivityBannerSingleViewModel[readInt];
        int i = 0;
        for (int i2 = 0; i2 < readInt; i2++) {
            animatedThreadActivityBannerSingleViewModelArr[i2] = parcel.readParcelable(classLoader);
        }
        this.A01 = ImmutableList.copyOf(animatedThreadActivityBannerSingleViewModelArr);
        this.A00 = parcel.readLong();
        this.A03 = parcel.readInt() != 0 ? parcel.readString() : null;
        this.A04 = C3o5.A0O(parcel);
        HashSet hashSet = new HashSet();
        int readInt2 = parcel.readInt();
        while (i < readInt2) {
            i = C3o5.A02(parcel, hashSet, i);
        }
        this.A05 = Collections.unmodifiableSet(hashSet);
    }

    public AnimatedThreadActivityBannerDataModel(ImmutableList immutableList, String str, String str2, String str3, Set set, long j) {
        C1pq.A08(AbE.A00(384), str);
        this.A02 = str;
        C1pq.A08("banners", immutableList);
        this.A01 = immutableList;
        this.A00 = j;
        this.A03 = str2;
        this.A04 = str3;
        this.A05 = Collections.unmodifiableSet(set);
    }

    public String A00() {
        if (this.A05.contains(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE)) {
            return this.A04;
        }
        if (A06 == null) {
            synchronized (this) {
                if (A06 == null) {
                    A06 = "UNSET_OR_UNRECOGNIZED_ENUM_VALUE";
                }
            }
        }
        return A06;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof AnimatedThreadActivityBannerDataModel)) {
                return false;
            }
            AnimatedThreadActivityBannerDataModel animatedThreadActivityBannerDataModel = (AnimatedThreadActivityBannerDataModel) obj;
            if (!11T.A0O(this.A02, animatedThreadActivityBannerDataModel.A02) || !11T.A0O(this.A01, animatedThreadActivityBannerDataModel.A01) || this.A00 != animatedThreadActivityBannerDataModel.A00 || !11T.A0O(this.A03, animatedThreadActivityBannerDataModel.A03) || !11T.A0O(A00(), animatedThreadActivityBannerDataModel.A00())) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(A00(), C1pq.A04(this.A03, C1pq.A01(C1pq.A04(this.A01, C1pq.A03(this.A02)), this.A00)));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        1Du A0b = 1BL.A0b(parcel, this.A01);
        while (A0b.hasNext()) {
            parcel.writeParcelable((AnimatedThreadActivityBannerSingleViewModel) A0b.next(), i);
        }
        parcel.writeLong(this.A00);
        1BL.A13(parcel, this.A03);
        1BL.A13(parcel, this.A04);
        Iterator A0S = C3o5.A0S(parcel, this.A05);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
