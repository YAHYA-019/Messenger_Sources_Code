package com.facebook.messaging.business.attachments.media.model;

import X.11T;
import X.1BK;
import X.1BL;
import X.AbJ;
import X.AnonymousClass001;
import X.C0ty;
import X.C53v;
import X.CSW;
import X.DKF;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.graphql.enums.GraphQLMessengerPlatformWebviewPerformanceOption;
import com.facebook.messaging.business.common.calltoaction.model.CallToAction;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/* loaded from: PlatformMediaAttachmentItem.class */
public final class PlatformMediaAttachmentItem implements Parcelable {
    public static final Parcelable.Creator CREATOR = new CSW(10);
    public final float A00;
    public final Uri A01;
    public final GraphQLMessengerPlatformWebviewPerformanceOption A02;
    public final PlatformMediaAttachmentVideoData A03;
    public final ImmutableList A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final boolean A09;
    public final boolean A0A;

    public PlatformMediaAttachmentItem(Uri uri, PlatformMediaAttachmentVideoData platformMediaAttachmentVideoData, String str, float f, boolean z) {
        if (str == null) {
            throw 1BK.A0h();
        }
        this.A06 = str;
        this.A01 = uri;
        this.A00 = f;
        this.A04 = ImmutableList.copyOf((Collection) C0ty.A00);
        this.A03 = platformMediaAttachmentVideoData;
        this.A08 = null;
        this.A05 = null;
        this.A0A = true;
        this.A09 = z;
        this.A07 = null;
        this.A02 = null;
    }

    public PlatformMediaAttachmentItem(Parcel parcel) {
        this.A06 = parcel.readString();
        this.A01 = (Uri) 1BL.A0C(parcel, Uri.class);
        this.A00 = parcel.readFloat();
        ArrayList A0s = AnonymousClass001.A0s();
        DKF.A1D(parcel, CallToAction.class, A0s);
        this.A04 = ImmutableList.copyOf((Collection) A0s);
        this.A03 = (PlatformMediaAttachmentVideoData) 1BL.A0C(parcel, PlatformMediaAttachmentVideoData.class);
        this.A08 = parcel.readString();
        this.A05 = parcel.readString();
        this.A0A = AnonymousClass001.A1Q(parcel.readInt(), 1);
        this.A09 = AbJ.A1W(parcel);
        this.A07 = parcel.readString();
        this.A02 = (GraphQLMessengerPlatformWebviewPerformanceOption) C53v.A07(parcel, GraphQLMessengerPlatformWebviewPerformanceOption.class);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !1BL.A1V(this, obj)) {
                return false;
            }
            PlatformMediaAttachmentItem platformMediaAttachmentItem = (PlatformMediaAttachmentItem) obj;
            if (!11T.A0O(this.A06, platformMediaAttachmentItem.A06) || !11T.A0O(this.A01, platformMediaAttachmentItem.A01) || this.A00 != platformMediaAttachmentItem.A00 || !11T.A0O(this.A04, platformMediaAttachmentItem.A04) || !11T.A0O(this.A03, platformMediaAttachmentItem.A03) || !11T.A0O(this.A08, platformMediaAttachmentItem.A08) || !11T.A0O(this.A05, platformMediaAttachmentItem.A05) || this.A0A != platformMediaAttachmentItem.A0A || this.A09 != platformMediaAttachmentItem.A09 || !11T.A0O(this.A07, platformMediaAttachmentItem.A07) || this.A02 != platformMediaAttachmentItem.A02) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return Arrays.deepHashCode(new Object[]{this.A06, this.A01, Float.valueOf(this.A00), this.A04, this.A03, this.A08, this.A05, Boolean.valueOf(this.A0A), Boolean.valueOf(this.A09), this.A07, this.A02});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A06);
        parcel.writeParcelable(this.A01, i);
        parcel.writeFloat(this.A00);
        parcel.writeList(this.A04);
        parcel.writeParcelable(this.A03, i);
        parcel.writeString(this.A08);
        parcel.writeString(this.A05);
        parcel.writeInt(this.A0A ? 1 : 0);
        parcel.writeInt(this.A09 ? 1 : 0);
        parcel.writeString(this.A07);
        C53v.A0J(parcel, this.A02);
    }
}
