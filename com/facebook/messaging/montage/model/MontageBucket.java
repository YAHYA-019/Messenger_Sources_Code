package com.facebook.messaging.montage.model;

import X.09K;
import X.1Du;
import X.1Hz;
import X.CSV;
import X.GOn;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.user.model.UserKey;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.util.Arrays;

/* loaded from: MontageBucket.class */
public final class MontageBucket implements Parcelable {
    public static final Parcelable.Creator CREATOR = new CSV(98);
    public final int A00;
    public final MontageBucketKey A01;
    public final UserKey A02;
    public final ImmutableList A03;
    public final String A04;
    public final boolean A05;
    public final ImmutableSet A06;

    public MontageBucket(MontageBucketKey montageBucketKey, UserKey userKey, ImmutableList immutableList, String str, int i, boolean z) {
        boolean z2 = false;
        if (09K.A00(immutableList)) {
            i = i == -1 ? 0 : i;
            Preconditions.checkElementIndex(i, immutableList.size());
        } else {
            Preconditions.checkArgument(i == -1 ? true : z2);
        }
        montageBucketKey.getClass();
        this.A01 = montageBucketKey;
        this.A02 = userKey;
        this.A04 = str;
        this.A03 = immutableList;
        1Hz r0 = new 1Hz();
        if (09K.A00(immutableList)) {
            1Du it = immutableList.iterator();
            while (it.hasNext()) {
                r0.A05(((MontageCard) it.next()).A0E);
            }
        }
        this.A06 = r0.A07();
        this.A00 = i;
        this.A05 = z;
    }

    public int A00() {
        ImmutableList immutableList = this.A03;
        if (immutableList == null) {
            return 0;
        }
        return immutableList.size();
    }

    public MontageBucket A01(int i) {
        if (i == this.A00) {
            return this;
        }
        return new MontageBucket(this.A01, this.A02, this.A03, this.A04, i, this.A05);
    }

    public MontageCard A02(int i) {
        if (A00() == 0) {
            return null;
        }
        ImmutableList immutableList = this.A03;
        Preconditions.checkElementIndex(i, immutableList.size());
        return GOn.A0p(immutableList, i);
    }

    public boolean A03() {
        ImmutableList immutableList = this.A03;
        boolean z = false;
        if (immutableList != null && !immutableList.isEmpty() && GOn.A0p(immutableList, 0).A0M) {
            z = true;
        }
        return z;
    }

    public boolean A04() {
        return this.A03 != null && this.A00 == A00() - 1;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return hashCode();
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            MontageBucket montageBucket = (MontageBucket) obj;
            if (this.A05 != montageBucket.A05 || this.A00 != montageBucket.A00 || !Objects.equal(this.A01, montageBucket.A01) || !Objects.equal(this.A02, montageBucket.A02) || !Objects.equal(this.A04, montageBucket.A04) || !MontageCard.A00(this.A03, montageBucket.A03)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A01, this.A02, this.A04, this.A03, Integer.valueOf(this.A00), Boolean.valueOf(this.A05)});
    }

    public String toString() {
        MoreObjects.ToStringHelper stringHelper = MoreObjects.toStringHelper(this);
        stringHelper.add("threadKey", this.A01);
        stringHelper.add("userKey", this.A02);
        stringHelper.add(PublicKeyCredentialControllerUtility.JSON_KEY_DISPLAY_NAME, this.A04);
        stringHelper.add("cards", this.A03);
        stringHelper.add("currentCardIndex", this.A00);
        stringHelper.add("didLoadFail", this.A05);
        stringHelper.add("cardIds", this.A06);
        return stringHelper.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A01, i);
        parcel.writeParcelable(this.A02, i);
        parcel.writeString(this.A04);
        parcel.writeList(this.A03);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A05 ? 1 : 0);
    }
}
