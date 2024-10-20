package com.facebook.xapp.messaging.composer.theme.model;

import X.0S2;
import X.11T;
import X.1BJ;
import X.1BL;
import X.1Du;
import X.4YV;
import X.7zU;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.C5yg;
import X.FKb;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: ThreadThemeInfo.class */
public final class ThreadThemeInfo implements Parcelable {
    public static volatile C5yg A0K;
    public static volatile Integer A0L;
    public static final Parcelable.Creator CREATOR = new FKb(50);
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final long A06;
    public final long A07;
    public final Uri A08;
    public final Uri A09;
    public final C5yg A0A;
    public final ImmutableList A0B;
    public final ImmutableList A0C;
    public final Integer A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final Set A0H;
    public final boolean A0I;
    public final boolean A0J;

    public ThreadThemeInfo(Uri uri, Uri uri2, C5yg c5yg, ImmutableList immutableList, ImmutableList immutableList2, Integer num, String str, String str2, String str3, Set set, int i, int i2, int i3, int i4, int i5, int i6, long j, long j2, boolean z, boolean z2) {
        C1pq.A08("accessibilityLabel", str);
        this.A0E = str;
        this.A0A = c5yg;
        this.A0F = str2;
        this.A00 = i;
        this.A01 = i2;
        this.A0G = str3;
        this.A02 = i3;
        this.A0B = immutableList;
        this.A0C = immutableList2;
        this.A03 = i4;
        this.A0I = z;
        this.A0J = z2;
        this.A08 = uri;
        this.A06 = j;
        this.A09 = uri2;
        this.A04 = i5;
        this.A07 = j2;
        this.A05 = i6;
        this.A0D = num;
        this.A0H = Collections.unmodifiableSet(set);
    }

    public ThreadThemeInfo(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        this.A0E = parcel.readString();
        Integer num = null;
        if (parcel.readInt() == 0) {
            this.A0A = null;
        } else {
            this.A0A = C5yg.values()[parcel.readInt()];
        }
        if (parcel.readInt() == 0) {
            this.A0F = null;
        } else {
            this.A0F = parcel.readString();
        }
        this.A00 = parcel.readInt();
        this.A01 = parcel.readInt();
        if (parcel.readInt() == 0) {
            this.A0G = null;
        } else {
            this.A0G = parcel.readString();
        }
        this.A02 = parcel.readInt();
        int i = 0;
        if (parcel.readInt() == 0) {
            this.A0B = null;
        } else {
            int readInt = parcel.readInt();
            Integer[] numArr = new Integer[readInt];
            for (int i2 = 0; i2 < readInt; i2++) {
                7zU.A1Z(numArr, parcel.readInt(), i2);
            }
            this.A0B = ImmutableList.copyOf(numArr);
        }
        if (parcel.readInt() == 0) {
            this.A0C = null;
        } else {
            int readInt2 = parcel.readInt();
            Integer[] numArr2 = new Integer[readInt2];
            for (int i3 = 0; i3 < readInt2; i3++) {
                7zU.A1Z(numArr2, parcel.readInt(), i3);
            }
            this.A0C = ImmutableList.copyOf(numArr2);
        }
        this.A03 = parcel.readInt();
        boolean z = true;
        this.A0I = AnonymousClass001.A1Q(parcel.readInt(), 1);
        this.A0J = parcel.readInt() != 1 ? false : z;
        if (parcel.readInt() == 0) {
            this.A08 = null;
        } else {
            this.A08 = (Uri) parcel.readParcelable(A0e);
        }
        this.A06 = parcel.readLong();
        if (parcel.readInt() == 0) {
            this.A09 = null;
        } else {
            this.A09 = (Uri) parcel.readParcelable(A0e);
        }
        this.A04 = parcel.readInt();
        this.A07 = parcel.readLong();
        this.A05 = parcel.readInt();
        this.A0D = parcel.readInt() != 0 ? 7zU.A0e(parcel, 8) : num;
        HashSet A0v = AnonymousClass001.A0v();
        int readInt3 = parcel.readInt();
        while (i < readInt3) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A0H = Collections.unmodifiableSet(A0v);
    }

    public C5yg A00() {
        if (this.A0H.contains(1BJ.A00(333))) {
            return this.A0A;
        }
        if (A0K == null) {
            synchronized (this) {
                if (A0K == null) {
                    A0K = C5yg.A04;
                }
            }
        }
        return A0K;
    }

    public Integer A01() {
        if (this.A0H.contains(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE)) {
            return this.A0D;
        }
        if (A0L == null) {
            synchronized (this) {
                if (A0L == null) {
                    A0L = 0S2.A01;
                }
            }
        }
        return A0L;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ThreadThemeInfo)) {
                return false;
            }
            ThreadThemeInfo threadThemeInfo = (ThreadThemeInfo) obj;
            if (!11T.A0O(this.A0E, threadThemeInfo.A0E) || A00() != threadThemeInfo.A00() || !11T.A0O(this.A0F, threadThemeInfo.A0F) || this.A00 != threadThemeInfo.A00 || this.A01 != threadThemeInfo.A01 || !11T.A0O(this.A0G, threadThemeInfo.A0G) || this.A02 != threadThemeInfo.A02 || !11T.A0O(this.A0B, threadThemeInfo.A0B) || !11T.A0O(this.A0C, threadThemeInfo.A0C) || this.A03 != threadThemeInfo.A03 || this.A0I != threadThemeInfo.A0I || this.A0J != threadThemeInfo.A0J || !11T.A0O(this.A08, threadThemeInfo.A08) || this.A06 != threadThemeInfo.A06 || !11T.A0O(this.A09, threadThemeInfo.A09) || this.A04 != threadThemeInfo.A04 || this.A07 != threadThemeInfo.A07 || this.A05 != threadThemeInfo.A05 || A01() != threadThemeInfo.A01()) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = -1;
        int A01 = (C1pq.A01((C1pq.A04(this.A09, C1pq.A01(C1pq.A04(this.A08, C1pq.A02(C1pq.A02((C1pq.A04(this.A0C, C1pq.A04(this.A0B, (C1pq.A04(this.A0G, (((C1pq.A04(this.A0F, (C1pq.A03(this.A0E) * 31) + C3o5.A03(A00())) * 31) + this.A00) * 31) + this.A01) * 31) + this.A02)) * 31) + this.A03, this.A0I), this.A0J)), this.A06)) * 31) + this.A04, this.A07) * 31) + this.A05;
        Integer A012 = A01();
        if (A012 != null) {
            i = A012.intValue();
        }
        return (A01 * 31) + i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A0E);
        C3o5.A0e(parcel, this.A0A);
        1BL.A13(parcel, this.A0F);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
        1BL.A13(parcel, this.A0G);
        parcel.writeInt(this.A02);
        ImmutableList immutableList = this.A0B;
        if (immutableList == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            1Du A0b = 1BL.A0b(parcel, immutableList);
            while (A0b.hasNext()) {
                parcel.writeInt(AnonymousClass001.A03(A0b.next()));
            }
        }
        ImmutableList immutableList2 = this.A0C;
        if (immutableList2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            1Du A0b2 = 1BL.A0b(parcel, immutableList2);
            while (A0b2.hasNext()) {
                parcel.writeInt(AnonymousClass001.A03(A0b2.next()));
            }
        }
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A0I ? 1 : 0);
        parcel.writeInt(this.A0J ? 1 : 0);
        C3o5.A0d(parcel, this.A08, i);
        parcel.writeLong(this.A06);
        C3o5.A0d(parcel, this.A09, i);
        parcel.writeInt(this.A04);
        parcel.writeLong(this.A07);
        parcel.writeInt(this.A05);
        C3o5.A0f(parcel, this.A0D);
        Iterator A0S = C3o5.A0S(parcel, this.A0H);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
