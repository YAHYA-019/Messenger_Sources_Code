package com.facebook.messaging.dialog;

import X.1BL;
import X.7zL;
import X.AnonymousClass001;
import X.C9g5;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.common.base.Preconditions;

/* loaded from: MenuDialogItem.class */
public final class MenuDialogItem implements Parcelable {
    public static final Parcelable.Creator CREATOR = 7zL.A0v(38);
    public final int A00;
    public final int A01;
    public final int A02;
    public final Parcelable A03;
    public final CharSequence A04;
    public final CharSequence A05;
    public final String A06;
    public final int A07;

    public MenuDialogItem(C9g5 c9g5) {
        Preconditions.checkArgument(AnonymousClass001.A1O(c9g5.A03) ^ (c9g5.A05 != null ? false : true));
        this.A01 = c9g5.A02;
        this.A02 = c9g5.A03;
        this.A00 = c9g5.A01;
        this.A07 = c9g5.A00;
        this.A05 = c9g5.A05;
        this.A04 = null;
        this.A06 = c9g5.A06;
        this.A03 = c9g5.A04;
    }

    public MenuDialogItem(Parcel parcel) {
        this.A01 = parcel.readInt();
        this.A02 = parcel.readInt();
        this.A00 = parcel.readInt();
        this.A07 = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.A05 = (CharSequence) creator.createFromParcel(parcel);
        this.A04 = (CharSequence) creator.createFromParcel(parcel);
        this.A06 = parcel.readString();
        this.A03 = 1BL.A0C(parcel, getClass());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A07);
        TextUtils.writeToParcel(this.A05, parcel, 0);
        TextUtils.writeToParcel(this.A04, parcel, 0);
        parcel.writeString(this.A06);
        parcel.writeParcelable(this.A03, 0);
    }
}
