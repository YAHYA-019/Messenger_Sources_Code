package com.google.android.exoplayer2.drm;

import X.1BL;
import X.6Za;
import X.AnonymousClass002;
import X.LGn;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.util.Util;
import java.util.Arrays;
import java.util.Comparator;
import java.util.UUID;

/* loaded from: DrmInitData.class */
public final class DrmInitData implements Comparator, Parcelable {
    public static final Parcelable.Creator CREATOR = LGn.A00(30);
    public int A00;
    public final int A01;
    public final String A02;
    public final SchemeData[] A03;

    /* loaded from: DrmInitData$SchemeData.class */
    public final class SchemeData implements Parcelable {
        public static final Parcelable.Creator CREATOR = LGn.A00(31);
        public int A00;
        public final String A01;
        public final String A02;
        public final UUID A03;
        public final byte[] A04;

        public SchemeData(Parcel parcel) {
            this.A03 = new UUID(parcel.readLong(), parcel.readLong());
            this.A01 = parcel.readString();
            this.A02 = parcel.readString();
            this.A04 = parcel.createByteArray();
        }

        public SchemeData(String str, String str2, UUID uuid, byte[] bArr) {
            this.A03 = uuid;
            this.A01 = str;
            str2.getClass();
            this.A02 = str2;
            this.A04 = bArr;
        }

        /* JADX WARN: Code restructure failed: missing block: B:4:0x0023, code lost:
        
            if (r302.equals(r0) != false) goto L6;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean A00(java.util.UUID r302) {
            /*
                r301 = this;
                java.util.UUID r0 = X.6Za.A03
                r303 = r0
                r0 = r301
                java.util.UUID r0 = r0.A03
                r304 = r0
                r0 = r303
                r1 = r304
                boolean r0 = r0.equals(r1)
                r305 = r0
                r0 = r305
                if (r0 != 0) goto L26
                r0 = r302
                r1 = r304
                boolean r0 = r0.equals(r1)
                r306 = r0
                r0 = 0
                r305 = r0
                r0 = 0
                r303 = r0
                r0 = r306
                if (r0 == 0) goto L29
            L26:
                r0 = 1
                r305 = r0
            L29:
                r0 = r305
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.drm.DrmInitData.SchemeData.A00(java.util.UUID):boolean");
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            boolean z = false;
            if (obj instanceof SchemeData) {
                if (obj == this) {
                    return true;
                }
                SchemeData schemeData = (SchemeData) obj;
                if (Util.A0P(this.A01, schemeData.A01) && Util.A0P(this.A02, schemeData.A02) && Util.A0P(this.A03, schemeData.A03) && Arrays.equals(this.A04, schemeData.A04)) {
                    z = true;
                }
            }
            return z;
        }

        public int hashCode() {
            int i = this.A00;
            if (i == 0) {
                i = AnonymousClass002.A07(this.A02, (1BL.A03(this.A03) + 1BL.A05(this.A01)) * 31) + Arrays.hashCode(this.A04);
                this.A00 = i;
            }
            return i;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            UUID uuid = this.A03;
            parcel.writeLong(uuid.getMostSignificantBits());
            parcel.writeLong(uuid.getLeastSignificantBits());
            parcel.writeString(this.A01);
            parcel.writeString(this.A02);
            parcel.writeByteArray(this.A04);
        }
    }

    public DrmInitData(Parcel parcel) {
        this.A02 = parcel.readString();
        SchemeData[] schemeDataArr = (SchemeData[]) parcel.createTypedArray(SchemeData.CREATOR);
        this.A03 = schemeDataArr;
        this.A01 = schemeDataArr.length;
    }

    public DrmInitData(String str, SchemeData[] schemeDataArr, boolean z) {
        this.A02 = str;
        schemeDataArr = z ? (SchemeData[]) schemeDataArr.clone() : schemeDataArr;
        this.A03 = schemeDataArr;
        this.A01 = schemeDataArr.length;
        Arrays.sort(schemeDataArr, this);
    }

    public DrmInitData A00(String str) {
        return Util.A0P(this.A02, str) ? this : new DrmInitData(str, this.A03, false);
    }

    @Override // java.util.Comparator
    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        UUID uuid = 6Za.A03;
        UUID uuid2 = ((SchemeData) obj).A03;
        boolean equals = uuid.equals(uuid2);
        UUID uuid3 = ((SchemeData) obj2).A03;
        if (!equals) {
            return uuid2.compareTo(uuid3);
        }
        int i = 1;
        if (uuid.equals(uuid3)) {
            i = 0;
        }
        return i;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            DrmInitData drmInitData = (DrmInitData) obj;
            if (!Util.A0P(this.A02, drmInitData.A02) || !Arrays.equals(this.A03, drmInitData.A03)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = this.A00;
        if (i == 0) {
            i = (1BL.A05(this.A02) * 31) + Arrays.hashCode(this.A03);
            this.A00 = i;
        }
        return i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeTypedArray(this.A03, 0);
    }
}
