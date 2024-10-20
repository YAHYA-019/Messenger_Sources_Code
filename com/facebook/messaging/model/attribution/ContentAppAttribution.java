package com.facebook.messaging.model.attribution;

import X.1BL;
import X.AnonymousClass001;
import X.BNU;
import X.C4Ny;
import X.C53v;
import X.C6E;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.business.common.calltoaction.model.CallToAction;
import com.google.common.base.Objects;
import com.google.common.collect.ImmutableMap;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* loaded from: ContentAppAttribution.class */
public final class ContentAppAttribution implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C4Ny(16);
    public final CallToAction A00;
    public final AttributionVisibility A01;
    public final BNU A02;
    public final ImmutableMap A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;

    public ContentAppAttribution(C6E c6e) {
        this.A08 = c6e.A08;
        String str = c6e.A04;
        str.getClass();
        this.A04 = str;
        this.A06 = c6e.A06;
        String str2 = c6e.A05;
        this.A05 = str2 != null ? str2.trim() : null;
        this.A07 = c6e.A07;
        this.A0A = c6e.A0A;
        ImmutableMap immutableMap = c6e.A03;
        immutableMap.getClass();
        this.A03 = immutableMap;
        AttributionVisibility attributionVisibility = c6e.A01;
        attributionVisibility.getClass();
        this.A01 = attributionVisibility;
        BNU bnu = c6e.A02;
        this.A02 = bnu == null ? BNU.A04 : bnu;
        this.A09 = c6e.A09;
        this.A00 = c6e.A00;
    }

    public ContentAppAttribution(Parcel parcel) {
        this.A08 = parcel.readString();
        this.A04 = parcel.readString();
        this.A06 = parcel.readString();
        this.A05 = parcel.readString();
        this.A07 = parcel.readString();
        this.A0A = parcel.readString();
        HashMap A0u = AnonymousClass001.A0u();
        C53v.A0O(parcel, A0u);
        this.A03 = ImmutableMap.copyOf((Map) A0u);
        this.A01 = (AttributionVisibility) 1BL.A0C(parcel, AttributionVisibility.class);
        this.A02 = BNU.A00(parcel.readInt());
        this.A09 = parcel.readString();
        this.A00 = (CallToAction) 1BL.A0C(parcel, CallToAction.class);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj instanceof ContentAppAttribution) {
            ContentAppAttribution contentAppAttribution = (ContentAppAttribution) obj;
            if (Objects.equal(this.A08, contentAppAttribution.A08) && Objects.equal(this.A04, contentAppAttribution.A04) && Objects.equal(this.A06, contentAppAttribution.A06) && Objects.equal(this.A05, contentAppAttribution.A05) && Objects.equal(this.A07, contentAppAttribution.A07) && Objects.equal(this.A0A, contentAppAttribution.A0A) && Objects.equal(this.A03, contentAppAttribution.A03) && Objects.equal(this.A01, contentAppAttribution.A01) && Objects.equal(this.A02, contentAppAttribution.A02) && Objects.equal(this.A09, contentAppAttribution.A09) && Objects.equal(this.A00, contentAppAttribution.A00)) {
                z = true;
            }
        }
        return z;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A08, this.A04, this.A06, this.A05, this.A07, this.A0A, this.A03, this.A01, this.A02, this.A09, this.A00});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A08);
        parcel.writeString(this.A04);
        parcel.writeString(this.A06);
        parcel.writeString(this.A05);
        parcel.writeString(this.A07);
        parcel.writeString(this.A0A);
        C53v.A0Q(parcel, this.A03);
        parcel.writeParcelable(this.A01, i);
        parcel.writeInt(this.A02.mValue);
        parcel.writeString(this.A09);
        parcel.writeParcelable(this.A00, i);
    }
}
