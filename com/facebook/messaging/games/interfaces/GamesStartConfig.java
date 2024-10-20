package com.facebook.messaging.games.interfaces;

import X.4YV;
import X.5TK;
import X.7zL;
import X.AbK;
import X.AnonymousClass001;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.google.common.base.Objects;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* loaded from: GamesStartConfig.class */
public final class GamesStartConfig implements Parcelable {
    public static final Parcelable.Creator CREATOR = 7zL.A0v(64);
    public final 5TK A00;
    public final ThreadKey A01;
    public final ImmutableList A02;
    public final ImmutableMap A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final String A0I;
    public final String A0J;
    public final String A0K;
    public final boolean A0L;
    public final boolean A0M;

    public GamesStartConfig(5TK r302, ThreadKey threadKey, ImmutableList immutableList, ImmutableMap immutableMap, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, boolean z) {
        this.A0D = str9;
        this.A01 = threadKey;
        this.A0G = str13;
        this.A0F = str11;
        this.A0A = str6;
        this.A0M = false;
        this.A0L = z;
        this.A00 = r302;
        this.A0J = null;
        this.A0I = null;
        this.A03 = immutableMap;
        this.A02 = immutableList;
        this.A0E = str10;
        this.A04 = str12;
        this.A0K = str14;
        this.A07 = str3;
        this.A08 = str4;
        this.A09 = str5;
        this.A06 = str2;
        this.A05 = str;
        this.A0B = str7;
        this.A0C = str8;
        this.A0H = str15;
    }

    public GamesStartConfig(Parcel parcel) {
        this.A0D = parcel.readString();
        this.A01 = AbK.A0X(parcel);
        this.A0G = parcel.readString();
        this.A0F = parcel.readString();
        this.A0A = parcel.readString();
        boolean z = false;
        this.A0M = AnonymousClass001.A1Q(parcel.readByte(), 1);
        this.A0L = parcel.readByte() == 1 ? true : z;
        this.A0J = parcel.readString();
        this.A0I = parcel.readString();
        HashMap A0u = AnonymousClass001.A0u();
        parcel.readMap(A0u, HashMap.class.getClassLoader());
        this.A03 = ImmutableMap.copyOf((Map) A0u);
        this.A02 = (ImmutableList) 4YV.A0l(parcel, ImmutableList.class);
        this.A00 = null;
        this.A0E = parcel.readString();
        this.A04 = parcel.readString();
        this.A0K = parcel.readString();
        this.A07 = parcel.readString();
        this.A08 = parcel.readString();
        this.A09 = parcel.readString();
        this.A06 = parcel.readString();
        this.A05 = parcel.readString();
        this.A0B = parcel.readString();
        this.A0C = parcel.readString();
        this.A0H = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof GamesStartConfig)) {
                return false;
            }
            GamesStartConfig gamesStartConfig = (GamesStartConfig) obj;
            if (this.A0M == gamesStartConfig.A0M && this.A0L == gamesStartConfig.A0L && Objects.equal(this.A0D, gamesStartConfig.A0D) && Objects.equal(this.A0E, gamesStartConfig.A0E) && Objects.equal(this.A01, gamesStartConfig.A01) && Objects.equal(this.A0G, gamesStartConfig.A0G) && Objects.equal(this.A0F, gamesStartConfig.A0F) && Objects.equal(this.A0A, gamesStartConfig.A0A) && Objects.equal(this.A0J, gamesStartConfig.A0J) && Objects.equal(this.A0I, gamesStartConfig.A0I) && Objects.equal(this.A03, gamesStartConfig.A03) && Objects.equal(this.A02, gamesStartConfig.A02) && Objects.equal(this.A04, gamesStartConfig.A04) && Objects.equal(this.A0K, gamesStartConfig.A0K) && Objects.equal(this.A07, gamesStartConfig.A07) && Objects.equal(this.A08, gamesStartConfig.A08) && Objects.equal(this.A09, gamesStartConfig.A09) && Objects.equal(this.A06, gamesStartConfig.A06) && Objects.equal(this.A05, gamesStartConfig.A05) && Objects.equal(this.A0B, gamesStartConfig.A0B) && Objects.equal(this.A0C, gamesStartConfig.A0C) && Objects.equal(this.A0H, gamesStartConfig.A0H)) {
                return true;
            }
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A0D, this.A0E, this.A01, this.A0G, this.A0F, this.A0A, Boolean.valueOf(this.A0M), Boolean.valueOf(this.A0L), this.A0J, this.A0I, this.A03, this.A02, this.A04, this.A0K, this.A07, this.A08, this.A09, this.A06, this.A05, this.A0B, this.A0C, this.A0H});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A0D);
        parcel.writeParcelable(this.A01, i);
        parcel.writeString(this.A0G);
        parcel.writeString(this.A0F);
        parcel.writeString(this.A0A);
        parcel.writeByte(this.A0M ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A0L ? (byte) 1 : (byte) 0);
        parcel.writeString(this.A0J);
        parcel.writeString(this.A0I);
        parcel.writeMap(this.A03);
        parcel.writeList(this.A02);
        parcel.writeString(this.A0E);
        parcel.writeString(this.A04);
        parcel.writeString(this.A0K);
        parcel.writeString(this.A07);
        parcel.writeString(this.A08);
        parcel.writeString(this.A09);
        parcel.writeString(this.A06);
        parcel.writeString(this.A05);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A0C);
        parcel.writeString(this.A0H);
    }
}
