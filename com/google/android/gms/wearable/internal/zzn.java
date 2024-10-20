package com.google.android.gms.wearable.internal;

import X.1BJ;
import X.1BL;
import X.AbstractC01153q8;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.JQx;
import X.LGm;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: zzn.class */
public final class zzn extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = LGm.A00(74);
    public final byte A00;
    public final byte A01;
    public final byte A02;
    public final byte A03;
    public final int A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;

    public zzn(String str, String str2, String str3, String str4, String str5, String str6, String str7, byte b, byte b2, byte b3, byte b4, int i) {
        this.A04 = i;
        this.A05 = str;
        this.A06 = str2;
        this.A07 = str3;
        this.A08 = str4;
        this.A09 = str5;
        this.A0A = str6;
        this.A00 = b;
        this.A01 = b2;
        this.A02 = b3;
        this.A03 = b4;
        this.A0B = str7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00ba, code lost:
    
        if (r0.equals(r0) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0127, code lost:
    
        if (r0.equals(r0) != false) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.wearable.internal.zzn.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i = 0;
        int A07 = (((((((((AnonymousClass002.A07(this.A09, AnonymousClass002.A07(this.A08, AnonymousClass002.A07(this.A07, (((((this.A04 + 31) * 31) + this.A05.hashCode()) * 31) + 1BL.A06(this.A06)) * 31))) + 1BL.A06(this.A0A)) * 31) + this.A00) * 31) + this.A01) * 31) + this.A02) * 31) + this.A03) * 31;
        String str = this.A0B;
        if (str != null) {
            i = str.hashCode();
        }
        return A07 + i;
    }

    public final String toString() {
        int i = this.A04;
        String str = this.A05;
        String str2 = this.A06;
        byte b = this.A00;
        byte b2 = this.A01;
        byte b3 = this.A02;
        byte b4 = this.A03;
        String str3 = this.A0B;
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("AncsNotificationParcelable{, id=");
        A0k.append(i);
        A0k.append(", appId='");
        A0k.append(str);
        A0k.append("', dateTime='");
        A0k.append(str2);
        A0k.append("', eventId=");
        A0k.append((int) b);
        A0k.append(", eventFlags=");
        A0k.append((int) b2);
        A0k.append(1BJ.A00(603));
        A0k.append((int) b3);
        A0k.append(", categoryCount=");
        A0k.append((int) b4);
        A0k.append(", packageName='");
        A0k.append(str3);
        return AnonymousClass001.A0d("'}", A0k);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A0E = JQx.A0E(parcel);
        AbstractC01153q8.A04(parcel, 2, this.A04);
        String str = this.A05;
        AbstractC01153q8.A08(parcel, str, 3);
        AbstractC01153q8.A08(parcel, this.A06, 4);
        AbstractC01153q8.A08(parcel, this.A07, 5);
        AbstractC01153q8.A08(parcel, this.A08, 6);
        AbstractC01153q8.A08(parcel, this.A09, 7);
        String str2 = this.A0A;
        if (str2 == null) {
            str2 = str;
        }
        AbstractC01153q8.A08(parcel, str2, 8);
        byte b = this.A00;
        parcel.writeInt(262153);
        parcel.writeInt(b);
        byte b2 = this.A01;
        parcel.writeInt(262154);
        parcel.writeInt(b2);
        byte b3 = this.A02;
        parcel.writeInt(262155);
        parcel.writeInt(b3);
        byte b4 = this.A03;
        parcel.writeInt(262156);
        parcel.writeInt(b4);
        AbstractC01153q8.A08(parcel, this.A0B, 13);
        AbstractC01153q8.A03(parcel, A0E);
    }
}
