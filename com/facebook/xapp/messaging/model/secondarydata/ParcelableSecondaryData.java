package com.facebook.xapp.messaging.model.secondarydata;

import X.C2xc;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.Objects;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.RegularImmutableMap;
import java.util.Arrays;

/* loaded from: ParcelableSecondaryData.class */
public final class ParcelableSecondaryData implements Parcelable {
    public static final ParcelableSecondaryData A01 = new ParcelableSecondaryData(RegularImmutableMap.A03);
    public static final Parcelable.Creator CREATOR = new C2xc(65);
    public final ImmutableMap A00;

    public ParcelableSecondaryData(ImmutableMap immutableMap) {
        this.A00 = immutableMap;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000f, code lost:
    
        if (r303 != null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.os.Parcelable A00(com.facebook.xapp.messaging.model.secondarydata.ParcelableSecondaryData r301, java.lang.Class r302, java.lang.String r303) {
        /*
            r0 = r301
            com.google.common.collect.ImmutableMap r0 = r0.A00
            r301 = r0
            r0 = r302
            if (r0 != 0) goto L12
            r0 = 0
            r304 = r0
            r0 = 0
            r305 = r0
            r0 = r303
            if (r0 == 0) goto L14
        L12:
            r0 = 1
            r304 = r0
        L14:
            r0 = r304
            com.google.common.base.Preconditions.checkArgument(r0)
            r0 = r303
            if (r0 != 0) goto L4d
            r0 = r302
            java.lang.Class r0 = r0.getClass()
            r0 = r302
            java.lang.String r0 = r0.getCanonicalName()
            r303 = r0
            java.lang.String r0 = "Unable to determine name of class. Use a dedicated string-key or make your class a top-level class."
            r305 = r0
            r0 = r303
            r1 = r305
            java.lang.Object r0 = com.google.common.base.Preconditions.checkNotNull(r0, r1)
            r0 = r303
            if (r0 != 0) goto L4d
            r0 = 0
            r304 = r0
            r0 = 0
            r305 = r0
        L3a:
            r0 = r304
            r1 = 31
            int r0 = r0 + r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r305 = r0
            r0 = r301
            r1 = r305
            java.lang.Object r0 = r0.get(r1)
            android.os.Parcelable r0 = (android.os.Parcelable) r0
            return r0
        L4d:
            r0 = r303
            int r0 = r0.hashCode()
            r304 = r0
            goto L3a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.xapp.messaging.model.secondarydata.ParcelableSecondaryData.A00(com.facebook.xapp.messaging.model.secondarydata.ParcelableSecondaryData, java.lang.Class, java.lang.String):android.os.Parcelable");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Objects.equal(this.A00, ((ParcelableSecondaryData) obj).A00);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A00});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeMap(this.A00);
    }
}
