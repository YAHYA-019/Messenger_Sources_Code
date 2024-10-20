package com.facebook.payments.auth.model;

import X.C53v;
import X.FKY;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.MoreObjects;

/* loaded from: NuxFollowUpAction.class */
public final class NuxFollowUpAction implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final boolean A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;

    static {
        new NuxFollowUpAction(false, false, false);
        CREATOR = FKY.A00(35);
    }

    public NuxFollowUpAction(Parcel parcel) {
        this.A02 = C53v.A0S(parcel);
        this.A03 = C53v.A0S(parcel);
        this.A01 = C53v.A0S(parcel);
        this.A00 = C53v.A0S(parcel);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000c, code lost:
    
        if (r304 == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public NuxFollowUpAction(boolean r302, boolean r303, boolean r304) {
        /*
            r301 = this;
            r0 = r301
            r0.<init>()
            r0 = r303
            if (r0 == 0) goto Lf
            r0 = 0
            r305 = r0
            r0 = r304
            if (r0 != 0) goto L12
        Lf:
            r0 = 1
            r305 = r0
        L12:
            r0 = r305
            java.lang.String r1 = "showPinNux and showFingerprintNux can't both be true"
            com.google.common.base.Preconditions.checkArgument(r0, r1)
            r0 = r301
            r1 = r303
            r0.A02 = r1
            r0 = r301
            r1 = r304
            r0.A03 = r1
            r0 = r301
            r1 = 0
            r0.A01 = r1
            r0 = r301
            r1 = r302
            r0.A00 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.payments.auth.model.NuxFollowUpAction.<init>(boolean, boolean, boolean):void");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        MoreObjects.ToStringHelper stringHelper = MoreObjects.toStringHelper(this);
        stringHelper.add("mShowFingerprintNux", this.A02);
        stringHelper.add("mShowPinNux", this.A03);
        stringHelper.add("mShowCardAddedNux", this.A01);
        stringHelper.add("mIsPinPresent", this.A00);
        return stringHelper.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A02 ? 1 : 0);
        parcel.writeInt(this.A03 ? 1 : 0);
        parcel.writeInt(this.A01 ? 1 : 0);
        parcel.writeInt(this.A00 ? 1 : 0);
    }
}
