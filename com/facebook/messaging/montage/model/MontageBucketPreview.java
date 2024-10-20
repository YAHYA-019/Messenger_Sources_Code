package com.facebook.messaging.montage.model;

import X.1Js;
import X.1Kh;
import X.1Kq;
import X.C2xc;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.user.model.User;
import com.facebook.user.model.UserKey;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* loaded from: MontageBucketPreview.class */
public final class MontageBucketPreview implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C2xc(39);
    public final int A00;
    public final int A01;
    public final MontageBucketKey A02;
    public final MontageBucketLooperLoggingItem A03;
    public final MontageCard A04;
    public final User A05;
    public final UserKey A06;
    public final ImmutableList A07;
    public final String A08;
    public final boolean A09;
    public final boolean A0A;

    public MontageBucketPreview(MontageBucketKey montageBucketKey, MontageBucketLooperLoggingItem montageBucketLooperLoggingItem, MontageCard montageCard, UserKey userKey, ImmutableList immutableList, String str, int i, int i2, boolean z, boolean z2) {
        userKey.getClass();
        this.A06 = userKey;
        montageBucketKey.getClass();
        this.A02 = montageBucketKey;
        montageCard.getClass();
        this.A04 = montageCard;
        this.A07 = immutableList == null ? ImmutableList.of() : immutableList;
        this.A08 = str;
        this.A09 = z;
        this.A0A = z2;
        this.A00 = i;
        this.A03 = montageBucketLooperLoggingItem;
        this.A01 = i2;
        1Kh r0 = new 1Kh();
        r0.A02(1Js.A03, userKey.id);
        r0.A1x = false;
        r0.A0t = str;
        r0.A01(1Kq.A02);
        this.A05 = new User(r0);
        if (z2) {
            Preconditions.checkArgument(!z, "Can't have unread message for myMontage item");
        }
    }

    public static MontageBucketPreview A00(MontageCard montageCard, String str, int i, boolean z, boolean z2) {
        return A01(montageCard, str, null, i, z, z2);
    }

    public static MontageBucketPreview A01(MontageCard montageCard, String str, List list, int i, boolean z, boolean z2) {
        return new MontageBucketPreview(new MontageBucketKey(montageCard.A03), null, montageCard, montageCard.A08.A01, list == null ? null : ImmutableList.copyOf((Collection) list), str, i, 0, z, z2);
    }

    public boolean A02() {
        return this.A0A && this.A04.A02 == 1;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return hashCode();
    }

    public boolean equals(Object obj) {
        boolean z;
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            MontageBucketPreview montageBucketPreview = (MontageBucketPreview) obj;
            if (this.A09 != montageBucketPreview.A09 || (z = this.A0A) != montageBucketPreview.A0A || this.A01 != montageBucketPreview.A01 || !Objects.equal(this.A06, montageBucketPreview.A06) || !Objects.equal(this.A02, montageBucketPreview.A02)) {
                return false;
            }
            MontageCard montageCard = this.A04;
            String obj2 = montageCard.toString();
            MontageCard montageCard2 = montageBucketPreview.A04;
            if (!Objects.equal(obj2, montageCard2.toString()) || !Objects.equal(this.A07, montageBucketPreview.A07) || !Objects.equal(this.A08, montageBucketPreview.A08) || !Objects.equal(this.A03, montageBucketPreview.A03)) {
                return false;
            }
            if (z && (!Objects.equal(montageCard.A04(), montageCard2.A04()) || !Objects.equal(montageCard.A07, montageCard2.A07))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A06, this.A02, this.A04, this.A07, this.A08, Boolean.valueOf(this.A09), Boolean.valueOf(this.A0A), Integer.valueOf(this.A00), this.A03, Integer.valueOf(this.A01)});
    }

    public String toString() {
        MoreObjects.ToStringHelper stringHelper = MoreObjects.toStringHelper(this);
        stringHelper.add("userKey", this.A06);
        stringHelper.add(PublicKeyCredentialControllerUtility.JSON_KEY_USER, this.A05);
        stringHelper.add("montageBucketKey", this.A02);
        stringHelper.add("previewCard", this.A04);
        stringHelper.add("seenByUsers", this.A07);
        stringHelper.add("hasUnreadMessages", this.A09);
        stringHelper.add("isForMyMontage", this.A0A);
        stringHelper.add("pageNum", this.A00);
        stringHelper.add("montageBucketLooperLoggingItem", this.A03);
        stringHelper.add("unreadStoriesCount", this.A01);
        return stringHelper.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A06, 0);
        parcel.writeParcelable(this.A02, 0);
        parcel.writeParcelable(this.A04, 0);
        parcel.writeList(this.A07);
        parcel.writeString(this.A08);
        parcel.writeInt(this.A09 ? 1 : 0);
        parcel.writeInt(this.A0A ? 1 : 0);
        parcel.writeInt(this.A00);
        parcel.writeParcelable(this.A03, 0);
        parcel.writeInt(this.A01);
    }
}
