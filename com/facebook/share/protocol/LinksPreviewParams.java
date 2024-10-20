package com.facebook.share.protocol;

import X.AnonymousClass001;
import X.FKe;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: LinksPreviewParams.class */
public final class LinksPreviewParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FKe(18);
    public final ImmutableList A00;
    public final String A01;
    public final String A02;
    public final String A03;

    /* loaded from: LinksPreviewParams$Size.class */
    public abstract class Size {
        public final int mHeight;
        public final int mWidth;
    }

    public LinksPreviewParams(Parcel parcel) {
        this.A02 = parcel.readString();
        this.A03 = parcel.readString();
        this.A01 = parcel.readString();
        ArrayList A0s = AnonymousClass001.A0s();
        parcel.readList(A0s, List.class.getClassLoader());
        this.A00 = ImmutableList.copyOf((Collection) A0s);
    }

    public LinksPreviewParams(ImmutableList.Builder builder, String str) {
        this.A02 = null;
        this.A03 = str;
        this.A01 = null;
        this.A00 = builder.build();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeString(this.A01);
        parcel.writeList(this.A00);
    }
}
