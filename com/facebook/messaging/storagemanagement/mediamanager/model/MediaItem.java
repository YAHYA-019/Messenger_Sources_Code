package com.facebook.messaging.storagemanagement.mediamanager.model;

import X.11T;
import X.1BL;
import X.1Du;
import X.7zO;
import X.7zU;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.CSU;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;

/* loaded from: MediaItem.class */
public final class MediaItem implements Parcelable {
    public static final Parcelable.Creator CREATOR = new CSU(72);
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final long A04;
    public final Long A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final int A09;
    public final int A0A;
    public final long A0B;
    public final long A0C;
    public final ImmutableList A0D;
    public final ImmutableList A0E;
    public final ImmutableList A0F;
    public final ImmutableList A0G;
    public final String A0H;
    public final String A0I;
    public final String A0J;
    public final boolean A0K;
    public final boolean A0L;

    public MediaItem(Parcel parcel) {
        this.A06 = 7zU.A0l(parcel, this);
        this.A0B = parcel.readLong();
        this.A03 = parcel.readLong();
        this.A07 = parcel.readString();
        this.A00 = parcel.readInt();
        this.A01 = parcel.readInt();
        boolean z = true;
        this.A0K = AnonymousClass001.A1Q(parcel.readInt(), 1);
        this.A0L = parcel.readInt() != 1 ? false : z;
        this.A02 = parcel.readInt();
        this.A04 = parcel.readLong();
        this.A08 = parcel.readString();
        this.A05 = parcel.readInt() == 0 ? null : 7zO.A0j(parcel);
        this.A0H = parcel.readString();
        this.A09 = parcel.readInt();
        this.A0I = parcel.readString();
        this.A0A = parcel.readInt();
        this.A0J = parcel.readString();
        int readInt = parcel.readInt();
        Long[] lArr = new Long[readInt];
        for (int i = 0; i < readInt; i++) {
            lArr[i] = 7zO.A0j(parcel);
        }
        this.A0D = ImmutableList.copyOf(lArr);
        int readInt2 = parcel.readInt();
        Long[] lArr2 = new Long[readInt2];
        for (int i2 = 0; i2 < readInt2; i2++) {
            lArr2[i2] = 7zO.A0j(parcel);
        }
        this.A0E = ImmutableList.copyOf(lArr2);
        int readInt3 = parcel.readInt();
        String[] strArr = new String[readInt3];
        for (int i3 = 0; i3 < readInt3; i3++) {
            strArr[i3] = parcel.readString();
        }
        this.A0F = ImmutableList.copyOf(strArr);
        int readInt4 = parcel.readInt();
        String[] strArr2 = new String[readInt4];
        for (int i4 = 0; i4 < readInt4; i4++) {
            strArr2[i4] = parcel.readString();
        }
        this.A0G = ImmutableList.copyOf(strArr2);
        this.A0C = parcel.readLong();
    }

    public MediaItem(ImmutableList immutableList, ImmutableList immutableList2, ImmutableList immutableList3, ImmutableList immutableList4, Long l, String str, String str2, String str3, String str4, String str5, String str6, int i, int i2, int i3, int i4, int i5, long j, long j2, long j3, long j4, boolean z, boolean z2) {
        this.A06 = str;
        this.A0B = j;
        this.A03 = j2;
        C1pq.A08("filepath", str2);
        this.A07 = str2;
        this.A00 = i;
        this.A01 = i2;
        this.A0K = z;
        this.A0L = z2;
        this.A02 = i3;
        this.A04 = j3;
        this.A08 = str3;
        this.A05 = l;
        C1pq.A08("previewFilepath", str4);
        this.A0H = str4;
        this.A09 = i4;
        this.A0I = str5;
        this.A0A = i5;
        this.A0J = str6;
        C1pq.A08("threadParticipantFbids", immutableList);
        this.A0D = immutableList;
        C1pq.A08("threadPicUrlExpirationTimestamps", immutableList2);
        this.A0E = immutableList2;
        C1pq.A08("threadPicUrlFallbacks", immutableList3);
        this.A0F = immutableList3;
        C1pq.A08("threadPicUrls", immutableList4);
        this.A0G = immutableList4;
        this.A0C = j4;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof MediaItem)) {
                return false;
            }
            MediaItem mediaItem = (MediaItem) obj;
            if (!11T.A0O(this.A06, mediaItem.A06) || this.A0B != mediaItem.A0B || this.A03 != mediaItem.A03 || !11T.A0O(this.A07, mediaItem.A07) || this.A00 != mediaItem.A00 || this.A01 != mediaItem.A01 || this.A0K != mediaItem.A0K || this.A0L != mediaItem.A0L || this.A02 != mediaItem.A02 || this.A04 != mediaItem.A04 || !11T.A0O(this.A08, mediaItem.A08) || !11T.A0O(this.A05, mediaItem.A05) || !11T.A0O(this.A0H, mediaItem.A0H) || this.A09 != mediaItem.A09 || !11T.A0O(this.A0I, mediaItem.A0I) || this.A0A != mediaItem.A0A || !11T.A0O(this.A0J, mediaItem.A0J) || !11T.A0O(this.A0D, mediaItem.A0D) || !11T.A0O(this.A0E, mediaItem.A0E) || !11T.A0O(this.A0F, mediaItem.A0F) || !11T.A0O(this.A0G, mediaItem.A0G) || this.A0C != mediaItem.A0C) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A01(C1pq.A04(this.A0G, C1pq.A04(this.A0F, C1pq.A04(this.A0E, C1pq.A04(this.A0D, C1pq.A04(this.A0J, (C1pq.A04(this.A0I, (C1pq.A04(this.A0H, C1pq.A04(this.A05, C1pq.A04(this.A08, C1pq.A01((C1pq.A02(C1pq.A02((((C1pq.A04(this.A07, C1pq.A01(C1pq.A01(C1pq.A03(this.A06), this.A0B), this.A03)) * 31) + this.A00) * 31) + this.A01, this.A0K), this.A0L) * 31) + this.A02, this.A04)))) * 31) + this.A09) * 31) + this.A0A))))), this.A0C);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A06);
        parcel.writeLong(this.A0B);
        parcel.writeLong(this.A03);
        parcel.writeString(this.A07);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A0K ? 1 : 0);
        parcel.writeInt(this.A0L ? 1 : 0);
        parcel.writeInt(this.A02);
        parcel.writeLong(this.A04);
        parcel.writeString(this.A08);
        Long l = this.A05;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.A0H);
        parcel.writeInt(this.A09);
        parcel.writeString(this.A0I);
        parcel.writeInt(this.A0A);
        parcel.writeString(this.A0J);
        1Du A0b = 1BL.A0b(parcel, this.A0D);
        while (A0b.hasNext()) {
            parcel.writeLong(AnonymousClass001.A05(A0b.next()));
        }
        1Du A0b2 = 1BL.A0b(parcel, this.A0E);
        while (A0b2.hasNext()) {
            parcel.writeLong(AnonymousClass001.A05(A0b2.next()));
        }
        1Du A0b3 = 1BL.A0b(parcel, this.A0F);
        while (A0b3.hasNext()) {
            C3o5.A0h(parcel, A0b3);
        }
        1Du A0b4 = 1BL.A0b(parcel, this.A0G);
        while (A0b4.hasNext()) {
            C3o5.A0h(parcel, A0b4);
        }
        parcel.writeLong(this.A0C);
    }
}
