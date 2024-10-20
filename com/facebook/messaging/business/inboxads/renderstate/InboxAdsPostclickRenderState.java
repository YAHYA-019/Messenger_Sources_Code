package com.facebook.messaging.business.inboxads.renderstate;

import X.1BM;
import X.AbJ;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.CSW;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: InboxAdsPostclickRenderState.class */
public final class InboxAdsPostclickRenderState implements Parcelable {
    public static final Parcelable.Creator CREATOR = new CSW(33);
    public final double A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;

    public InboxAdsPostclickRenderState(double d, int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.A01 = i;
        this.A02 = i2;
        this.A03 = i3;
        this.A09 = z;
        this.A04 = z2;
        this.A05 = z3;
        this.A06 = z4;
        this.A07 = z5;
        this.A08 = z6;
        this.A00 = d;
    }

    public InboxAdsPostclickRenderState(Parcel parcel) {
        this.A01 = C3o5.A01(parcel, this);
        this.A02 = parcel.readInt();
        this.A03 = parcel.readInt();
        this.A09 = AnonymousClass001.A1Q(parcel.readInt(), 1);
        this.A04 = 1BM.A07(parcel);
        this.A05 = 1BM.A07(parcel);
        this.A06 = 1BM.A07(parcel);
        this.A07 = 1BM.A07(parcel);
        this.A08 = AbJ.A1W(parcel);
        this.A00 = parcel.readDouble();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof InboxAdsPostclickRenderState)) {
                return false;
            }
            InboxAdsPostclickRenderState inboxAdsPostclickRenderState = (InboxAdsPostclickRenderState) obj;
            if (this.A01 != inboxAdsPostclickRenderState.A01 || this.A02 != inboxAdsPostclickRenderState.A02 || this.A03 != inboxAdsPostclickRenderState.A03 || this.A09 != inboxAdsPostclickRenderState.A09 || this.A04 != inboxAdsPostclickRenderState.A04 || this.A05 != inboxAdsPostclickRenderState.A05 || this.A06 != inboxAdsPostclickRenderState.A06 || this.A07 != inboxAdsPostclickRenderState.A07 || this.A08 != inboxAdsPostclickRenderState.A08 || this.A00 != inboxAdsPostclickRenderState.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A00(this.A00, C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(((((this.A01 + 31) * 31) + this.A02) * 31) + this.A03, this.A09), this.A04), this.A05), this.A06), this.A07), this.A08));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A09 ? 1 : 0);
        parcel.writeInt(this.A04 ? 1 : 0);
        parcel.writeInt(this.A05 ? 1 : 0);
        parcel.writeInt(this.A06 ? 1 : 0);
        parcel.writeInt(this.A07 ? 1 : 0);
        parcel.writeInt(this.A08 ? 1 : 0);
        parcel.writeDouble(this.A00);
    }
}
