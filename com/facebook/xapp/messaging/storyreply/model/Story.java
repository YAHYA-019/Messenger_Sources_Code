package com.facebook.xapp.messaging.storyreply.model;

import X.11T;
import X.1BL;
import X.4YV;
import X.7zN;
import X.7zV;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C04v;
import X.FKb;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.xapp.messaging.threadview.model.photo.Photo;

/* loaded from: Story.class */
public final class Story extends C04v implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FKb(63);
    public final Photo A00;
    public final Long A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final boolean A05;
    public final String A06;

    public Story(Photo photo, Long l, String str, String str2, String str3, String str4, boolean z) {
        1BL.A1F(str, str2);
        this.A03 = str;
        this.A04 = str2;
        this.A05 = z;
        this.A06 = str3;
        this.A00 = photo;
        this.A01 = l;
        this.A02 = str4;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Story)) {
                return false;
            }
            Story story = (Story) obj;
            if (!11T.A0O(this.A03, story.A03) || !11T.A0O(this.A04, story.A04) || this.A05 != story.A05 || !11T.A0O(this.A06, story.A06) || !11T.A0O(this.A00, story.A00) || !11T.A0O(this.A01, story.A01) || !11T.A0O(this.A02, story.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((((((AnonymousClass002.A07(this.A04, 4YV.A02(this.A03)) + AnonymousClass002.A00(this.A05 ? 1 : 0)) * 31) + 1BL.A05(this.A06)) * 31) + AnonymousClass001.A02(this.A00)) * 31) + AnonymousClass001.A02(this.A01)) * 31) + 7zN.A05(this.A02);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeInt(this.A05 ? 1 : 0);
        parcel.writeString(this.A06);
        parcel.writeParcelable(this.A00, i);
        7zV.A0m(parcel, this.A01);
        parcel.writeString(this.A02);
    }
}
