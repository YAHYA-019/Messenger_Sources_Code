package com.facebook.stickers.model;

import X.11T;
import X.1BL;
import X.AnonymousClass001;
import X.FKe;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* loaded from: StickerPack.class */
public final class StickerPack implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKe.A00(35);
    public final int A00;
    public final long A01;
    public final Uri A02;
    public final Uri A03;
    public final Uri A04;
    public final Uri A05;
    public final StickerCapabilities A06;
    public final ImmutableList A07;
    public final ImmutableList A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;

    public StickerPack(Uri uri, Uri uri2, Uri uri3, Uri uri4, StickerCapabilities stickerCapabilities, String str, String str2, String str3, String str4, List list, List list2, int i, long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        if (str3 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        this.A0B = str3;
        this.A0C = str4;
        this.A09 = str;
        this.A0A = str2;
        this.A05 = uri4;
        this.A04 = uri3;
        this.A02 = uri;
        this.A03 = uri2;
        this.A00 = i;
        this.A01 = j;
        this.A0E = z2;
        this.A0F = z3;
        this.A0G = z4;
        this.A0H = z5;
        this.A0J = z7;
        this.A0D = z;
        this.A0K = z8;
        this.A0I = z6;
        this.A07 = 1BL.A0a(list);
        this.A08 = 1BL.A0a(list2);
        if (stickerCapabilities == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        this.A06 = stickerCapabilities;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x004c, code lost:
    
        if (r0.length() == 0) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public StickerPack(android.os.Parcel r302) {
        /*
            Method dump skipped, instructions count: 410
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.stickers.model.StickerPack.<init>(android.os.Parcel):void");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A0C);
        parcel.writeString(this.A09);
        parcel.writeString(this.A0A);
        Uri uri = this.A05;
        String str = null;
        parcel.writeString(uri != null ? uri.toString() : null);
        Uri uri2 = this.A04;
        parcel.writeString(uri2 != null ? uri2.toString() : null);
        Uri uri3 = this.A02;
        parcel.writeString(uri3 != null ? uri3.toString() : null);
        Uri uri4 = this.A03;
        if (uri4 != null) {
            str = uri4.toString();
        }
        parcel.writeString(str);
        parcel.writeInt(this.A00);
        parcel.writeLong(this.A01);
        parcel.writeInt(this.A0E ? 1 : 0);
        parcel.writeInt(this.A0F ? 1 : 0);
        parcel.writeInt(this.A0G ? 1 : 0);
        parcel.writeInt(this.A0H ? 1 : 0);
        parcel.writeInt(this.A0J ? 1 : 0);
        parcel.writeInt(this.A0D ? 1 : 0);
        parcel.writeInt(this.A0K ? 1 : 0);
        parcel.writeInt(this.A0I ? 1 : 0);
        parcel.writeStringList(this.A07);
        parcel.writeStringList(this.A08);
        parcel.writeParcelable(this.A06, i);
    }
}
