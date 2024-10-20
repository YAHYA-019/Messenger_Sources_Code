package com.facebook.messaging.media.mediapicker.mediapickerenvironment;

import X.4YV;
import X.6zX;
import X.82M;
import X.C53v;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.google.common.base.MoreObjects;

/* loaded from: MediaPickerEnvironment.class */
public final class MediaPickerEnvironment implements Parcelable {
    public static final MediaPickerEnvironment A0O = new MediaPickerEnvironment();
    public static final Parcelable.Creator CREATOR = new 82M(39);
    public final int A00;
    public final ThreadKey A01;
    public final Integer A02;
    public final Integer A03;
    public final Integer A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final boolean A0M;
    public final boolean A0N;

    public MediaPickerEnvironment() {
        this.A0K = false;
        this.A0A = false;
        this.A09 = false;
        this.A0M = true;
        this.A0N = true;
        this.A0L = true;
        this.A0G = false;
        this.A0B = false;
        this.A05 = false;
        this.A08 = false;
        this.A0D = false;
        this.A06 = false;
        this.A0I = false;
        this.A0H = false;
        this.A07 = true;
        this.A0J = false;
        this.A0C = false;
        this.A0E = false;
        this.A0F = false;
        this.A00 = 1;
        this.A04 = null;
        this.A03 = null;
        this.A01 = null;
        this.A02 = null;
    }

    public MediaPickerEnvironment(6zX r302) {
        this.A0K = r302.A0K;
        this.A0A = r302.A0A;
        this.A09 = r302.A09;
        this.A0M = r302.A0M;
        this.A0N = r302.A0N;
        this.A0L = r302.A0L;
        this.A0G = r302.A0G;
        this.A0B = r302.A0B;
        this.A05 = r302.A05;
        this.A08 = r302.A08;
        this.A0D = r302.A0D;
        this.A06 = r302.A06;
        this.A0I = r302.A0I;
        this.A0H = r302.A0H;
        this.A07 = r302.A07;
        this.A0J = r302.A0J;
        this.A0C = r302.A0C;
        this.A0E = r302.A0E;
        this.A0F = r302.A0F;
        Integer num = r302.A04;
        this.A00 = num != null ? num.intValue() : 1;
        this.A04 = r302.A03;
        this.A03 = r302.A02;
        this.A01 = r302.A00;
        this.A02 = r302.A01;
    }

    public MediaPickerEnvironment(Parcel parcel) {
        this.A0K = C53v.A0S(parcel);
        this.A0A = C53v.A0S(parcel);
        this.A09 = C53v.A0S(parcel);
        this.A0M = C53v.A0S(parcel);
        this.A0N = C53v.A0S(parcel);
        this.A0L = C53v.A0S(parcel);
        this.A0G = C53v.A0S(parcel);
        this.A0B = C53v.A0S(parcel);
        this.A05 = C53v.A0S(parcel);
        this.A08 = C53v.A0S(parcel);
        this.A0D = C53v.A0S(parcel);
        this.A06 = C53v.A0S(parcel);
        this.A0I = C53v.A0S(parcel);
        this.A0H = C53v.A0S(parcel);
        this.A07 = C53v.A0S(parcel);
        this.A0J = C53v.A0S(parcel);
        this.A0C = C53v.A0S(parcel);
        this.A0E = C53v.A0S(parcel);
        this.A0F = C53v.A0S(parcel);
        Integer A08 = C53v.A08(parcel);
        this.A00 = A08 != null ? A08.intValue() : 1;
        this.A04 = C53v.A08(parcel);
        this.A03 = C53v.A08(parcel);
        this.A01 = (ThreadKey) parcel.readParcelable(ThreadKey.class.getClassLoader());
        this.A02 = C53v.A08(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        MoreObjects.ToStringHelper stringHelper = MoreObjects.toStringHelper(this);
        stringHelper.add("singleMediaItemState", this.A0K);
        stringHelper.add("isHdToggleEnabled", this.A0A);
        stringHelper.add("isHdToggleActive", this.A09);
        stringHelper.add("supportGifs", this.A0M);
        stringHelper.add("supportVideo", this.A0N);
        stringHelper.add("supportExternalFolders", this.A0L);
        stringHelper.add("sendInstantly", this.A0G);
        stringHelper.add("shouldToggleMultiselect", this.A0B);
        stringHelper.add("is9By16ThumbnailEnabled", this.A05);
        stringHelper.add("isGradientBackgroundEnabled", this.A08);
        stringHelper.add("isNewEntryPointEnabled", this.A0D);
        stringHelper.add("isAlbumInListEnabled", this.A06);
        stringHelper.add("shouldHideFolderSelectionTitle", this.A0I);
        stringHelper.add("shouldCenterSelectedToggle", this.A0H);
        stringHelper.add("isAlwaysDarkMode", this.A07);
        stringHelper.add("shouldUseArrowIconButton", this.A0J);
        stringHelper.add("isRtcMediaPickerEnabled", this.A0C);
        stringHelper.add("themeBackgroundColorEnabled", this.A0E);
        stringHelper.add("themeTitleTextColorEnabled", this.A0F);
        stringHelper.add("thumbnailSelectionStyle", this.A00);
        stringHelper.add("permissionRequestTextId", this.A04);
        stringHelper.add("permissionRequestDeniedTextId", this.A03);
        stringHelper.add("threadKey", this.A01);
        return 4YV.A0s(stringHelper, this.A02, "maxSelectedMediaItems");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A0K ? 1 : 0);
        parcel.writeInt(this.A0A ? 1 : 0);
        parcel.writeInt(this.A09 ? 1 : 0);
        parcel.writeInt(this.A0M ? 1 : 0);
        parcel.writeInt(this.A0N ? 1 : 0);
        parcel.writeInt(this.A0L ? 1 : 0);
        parcel.writeInt(this.A0G ? 1 : 0);
        parcel.writeInt(this.A0B ? 1 : 0);
        parcel.writeInt(this.A05 ? 1 : 0);
        parcel.writeInt(this.A08 ? 1 : 0);
        parcel.writeInt(this.A0D ? 1 : 0);
        parcel.writeInt(this.A06 ? 1 : 0);
        parcel.writeInt(this.A0I ? 1 : 0);
        parcel.writeInt(this.A0H ? 1 : 0);
        parcel.writeInt(this.A07 ? 1 : 0);
        parcel.writeInt(this.A0J ? 1 : 0);
        parcel.writeInt(this.A0C ? 1 : 0);
        parcel.writeInt(this.A0E ? 1 : 0);
        parcel.writeInt(this.A0F ? 1 : 0);
        C53v.A0K(parcel, Integer.valueOf(this.A00));
        C53v.A0K(parcel, this.A04);
        C53v.A0K(parcel, this.A03);
        parcel.writeParcelable(this.A01, i);
        C53v.A0K(parcel, this.A02);
    }
}
