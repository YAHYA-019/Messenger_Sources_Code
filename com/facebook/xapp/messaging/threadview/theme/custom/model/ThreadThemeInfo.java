package com.facebook.xapp.messaging.threadview.theme.custom.model;

import X.11T;
import X.1BL;
import X.1Du;
import X.2Gs;
import X.2xK;
import X.AnonymousClass001;
import X.C1pq;
import X.C2xc;
import X.JQw;
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
public final class ThreadThemeInfo implements Parcelable, 2Gs {
    public static volatile String A0n;
    public static volatile String A0o;
    public static volatile String A0p;
    public static final Parcelable.Creator CREATOR = new C2xc(70);
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final int A0C;
    public final int A0D;
    public final int A0E;
    public final int A0F;
    public final int A0G;
    public final int A0H;
    public final int A0I;
    public final int A0J;
    public final int A0K;
    public final int A0L;
    public final int A0M;
    public final int A0N;
    public final int A0O;
    public final int A0P;
    public final int A0Q;
    public final int A0R;
    public final long A0S;
    public final long A0T;
    public final Uri A0U;
    public final Uri A0V;
    public final Uri A0W;
    public final Uri A0X;
    public final Uri A0Y;
    public final ImmutableList A0Z;
    public final ImmutableList A0a;
    public final ImmutableList A0b;
    public final ImmutableList A0c;
    public final ImmutableList A0d;
    public final String A0e;
    public final String A0f;
    public final String A0g;
    public final String A0h;
    public final String A0i;
    public final String A0j;
    public final String A0k;
    public final Set A0l;
    public final boolean A0m;

    public ThreadThemeInfo(2xK r302) {
        String str = r302.A0e;
        C1pq.A08("accessibilityLabel", str);
        this.A0e = str;
        this.A0U = r302.A0U;
        this.A0f = r302.A0f;
        ImmutableList immutableList = r302.A0Z;
        C1pq.A08("backgroundGradientColors", immutableList);
        this.A0Z = immutableList;
        this.A00 = r302.A00;
        this.A01 = r302.A01;
        this.A02 = r302.A02;
        this.A03 = r302.A03;
        this.A04 = r302.A04;
        this.A05 = r302.A05;
        this.A06 = r302.A06;
        this.A07 = r302.A07;
        this.A0g = r302.A0g;
        this.A08 = r302.A08;
        this.A0h = r302.A0h;
        ImmutableList immutableList2 = r302.A0a;
        C1pq.A08("gradientColors", immutableList2);
        this.A0a = immutableList2;
        ImmutableList immutableList3 = r302.A0b;
        C1pq.A08("hashProviders", immutableList3);
        this.A0b = immutableList3;
        this.A09 = r302.A09;
        this.A0A = r302.A0A;
        this.A0B = r302.A0B;
        ImmutableList immutableList4 = r302.A0c;
        C1pq.A08("inboundMessageGradientColors", immutableList4);
        this.A0c = immutableList4;
        this.A0C = r302.A0C;
        this.A0D = r302.A0D;
        this.A0E = r302.A0E;
        this.A0m = r302.A0m;
        this.A0V = r302.A0V;
        this.A0W = r302.A0W;
        this.A0F = r302.A0F;
        this.A0G = r302.A0G;
        this.A0H = r302.A0H;
        this.A0I = r302.A0I;
        this.A0J = r302.A0J;
        this.A0S = r302.A0S;
        this.A0X = r302.A0X;
        this.A0K = r302.A0K;
        ImmutableList immutableList5 = r302.A0d;
        C1pq.A08("reactionAssets", immutableList5);
        this.A0d = immutableList5;
        this.A0L = r302.A0L;
        this.A0Y = r302.A0Y;
        this.A0M = r302.A0M;
        this.A0T = r302.A0T;
        this.A0i = r302.A0i;
        this.A0N = r302.A0N;
        this.A0O = r302.A0O;
        this.A0P = r302.A0P;
        this.A0Q = r302.A0Q;
        this.A0j = r302.A0j;
        this.A0k = r302.A0k;
        this.A0R = r302.A0R;
        this.A0l = Collections.unmodifiableSet(r302.A0l);
        long j = -1;
        if ((this.A0T == j) != (this.A0S == j)) {
            throw AnonymousClass001.A0N("ThemeId and NormalThemeId should be both valid or invalid. ");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ThreadThemeInfo(Parcel parcel) {
        ClassLoader classLoader = getClass().getClassLoader();
        this.A0e = parcel.readString();
        String str = null;
        if (parcel.readInt() == 0) {
            this.A0U = null;
        } else {
            this.A0U = (Uri) parcel.readParcelable(classLoader);
        }
        if (parcel.readInt() == 0) {
            this.A0f = null;
        } else {
            this.A0f = parcel.readString();
        }
        int readInt = parcel.readInt();
        Integer[] numArr = new Integer[readInt];
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= readInt) {
                break;
            }
            numArr[i2] = Integer.valueOf(parcel.readInt());
            i = i2 + 1;
        }
        this.A0Z = ImmutableList.copyOf(numArr);
        this.A00 = parcel.readInt();
        this.A01 = parcel.readInt();
        this.A02 = parcel.readInt();
        this.A03 = parcel.readInt();
        this.A04 = parcel.readInt();
        this.A05 = parcel.readInt();
        this.A06 = parcel.readInt();
        this.A07 = parcel.readInt();
        if (parcel.readInt() == 0) {
            this.A0g = null;
        } else {
            this.A0g = parcel.readString();
        }
        this.A08 = parcel.readInt();
        if (parcel.readInt() == 0) {
            this.A0h = null;
        } else {
            this.A0h = parcel.readString();
        }
        int readInt2 = parcel.readInt();
        Integer[] numArr2 = new Integer[readInt2];
        int i3 = 0;
        while (true) {
            int i4 = i3;
            if (i4 >= readInt2) {
                break;
            }
            numArr2[i4] = Integer.valueOf(parcel.readInt());
            i3 = i4 + 1;
        }
        this.A0a = ImmutableList.copyOf(numArr2);
        int readInt3 = parcel.readInt();
        Integer[] numArr3 = new Integer[readInt3];
        int i5 = 0;
        while (true) {
            int i6 = i5;
            if (i6 >= readInt3) {
                break;
            }
            numArr3[i6] = Integer.valueOf(parcel.readInt());
            i5 = i6 + 1;
        }
        this.A0b = ImmutableList.copyOf(numArr3);
        this.A09 = parcel.readInt();
        this.A0A = parcel.readInt();
        this.A0B = parcel.readInt();
        int readInt4 = parcel.readInt();
        Integer[] numArr4 = new Integer[readInt4];
        int i7 = 0;
        while (true) {
            int i8 = i7;
            if (i8 >= readInt4) {
                break;
            }
            numArr4[i8] = Integer.valueOf(parcel.readInt());
            i7 = i8 + 1;
        }
        this.A0c = ImmutableList.copyOf(numArr4);
        this.A0C = parcel.readInt();
        this.A0D = parcel.readInt();
        this.A0E = parcel.readInt();
        this.A0m = parcel.readInt() != 1 ? false : true;
        if (parcel.readInt() == 0) {
            this.A0V = null;
        } else {
            this.A0V = (Uri) parcel.readParcelable(classLoader);
        }
        if (parcel.readInt() == 0) {
            this.A0W = null;
        } else {
            this.A0W = (Uri) parcel.readParcelable(classLoader);
        }
        this.A0F = parcel.readInt();
        this.A0G = parcel.readInt();
        this.A0H = parcel.readInt();
        this.A0I = parcel.readInt();
        this.A0J = parcel.readInt();
        this.A0S = parcel.readLong();
        if (parcel.readInt() == 0) {
            this.A0X = null;
        } else {
            this.A0X = (Uri) parcel.readParcelable(classLoader);
        }
        this.A0K = parcel.readInt();
        int readInt5 = parcel.readInt();
        ThreadThemeReactionAssetInfo[] threadThemeReactionAssetInfoArr = new ThreadThemeReactionAssetInfo[readInt5];
        int i9 = 0;
        while (true) {
            int i10 = i9;
            if (i10 >= readInt5) {
                break;
            }
            threadThemeReactionAssetInfoArr[i10] = parcel.readParcelable(classLoader);
            i9 = i10 + 1;
        }
        this.A0d = ImmutableList.copyOf(threadThemeReactionAssetInfoArr);
        this.A0L = parcel.readInt();
        if (parcel.readInt() == 0) {
            this.A0Y = null;
        } else {
            this.A0Y = (Uri) parcel.readParcelable(classLoader);
        }
        this.A0M = parcel.readInt();
        this.A0T = parcel.readLong();
        if (parcel.readInt() == 0) {
            this.A0i = null;
        } else {
            this.A0i = parcel.readString();
        }
        this.A0N = parcel.readInt();
        this.A0O = parcel.readInt();
        this.A0P = parcel.readInt();
        this.A0Q = parcel.readInt();
        if (parcel.readInt() == 0) {
            this.A0j = null;
        } else {
            this.A0j = parcel.readString();
        }
        this.A0k = parcel.readInt() != 0 ? parcel.readString() : str;
        this.A0R = parcel.readInt();
        HashSet hashSet = new HashSet();
        int readInt6 = parcel.readInt();
        for (int i11 = 0; i11 < readInt6; i11++) {
            hashSet.add(parcel.readString());
        }
        this.A0l = Collections.unmodifiableSet(hashSet);
    }

    public String A00() {
        if (this.A0l.contains("appColorMode")) {
            return this.A0f;
        }
        if (A0n == null) {
            synchronized (this) {
                if (A0n == null) {
                    A0n = "NORMAL";
                }
            }
        }
        return A0n;
    }

    public String A01() {
        if (this.A0l.contains("threadViewMode")) {
            return this.A0i;
        }
        if (A0o == null) {
            synchronized (this) {
                if (A0o == null) {
                    A0o = "DEFAULT";
                }
            }
        }
        return A0o;
    }

    public String A02() {
        if (this.A0l.contains(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE)) {
            return this.A0j;
        }
        if (A0p == null) {
            synchronized (this) {
                if (A0p == null) {
                    A0p = "COLOR_GRADIENT";
                }
            }
        }
        return A0p;
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
            if (!11T.A0O(this.A0e, threadThemeInfo.A0e) || !11T.A0O(this.A0U, threadThemeInfo.A0U) || !11T.A0O(A00(), threadThemeInfo.A00()) || !11T.A0O(this.A0Z, threadThemeInfo.A0Z) || this.A00 != threadThemeInfo.A00 || this.A01 != threadThemeInfo.A01 || this.A02 != threadThemeInfo.A02 || this.A03 != threadThemeInfo.A03 || this.A04 != threadThemeInfo.A04 || this.A05 != threadThemeInfo.A05 || this.A06 != threadThemeInfo.A06 || this.A07 != threadThemeInfo.A07 || !11T.A0O(this.A0g, threadThemeInfo.A0g) || this.A08 != threadThemeInfo.A08 || !11T.A0O(this.A0h, threadThemeInfo.A0h) || !11T.A0O(this.A0a, threadThemeInfo.A0a) || !11T.A0O(this.A0b, threadThemeInfo.A0b) || this.A09 != threadThemeInfo.A09 || this.A0A != threadThemeInfo.A0A || this.A0B != threadThemeInfo.A0B || !11T.A0O(this.A0c, threadThemeInfo.A0c) || this.A0C != threadThemeInfo.A0C || this.A0D != threadThemeInfo.A0D || this.A0E != threadThemeInfo.A0E || this.A0m != threadThemeInfo.A0m || !11T.A0O(this.A0V, threadThemeInfo.A0V) || !11T.A0O(this.A0W, threadThemeInfo.A0W) || this.A0F != threadThemeInfo.A0F || this.A0G != threadThemeInfo.A0G || this.A0H != threadThemeInfo.A0H || this.A0I != threadThemeInfo.A0I || this.A0J != threadThemeInfo.A0J || this.A0S != threadThemeInfo.A0S || !11T.A0O(this.A0X, threadThemeInfo.A0X) || this.A0K != threadThemeInfo.A0K || !11T.A0O(this.A0d, threadThemeInfo.A0d) || this.A0L != threadThemeInfo.A0L || !11T.A0O(this.A0Y, threadThemeInfo.A0Y) || this.A0M != threadThemeInfo.A0M || this.A0T != threadThemeInfo.A0T || !11T.A0O(A01(), threadThemeInfo.A01()) || this.A0N != threadThemeInfo.A0N || this.A0O != threadThemeInfo.A0O || this.A0P != threadThemeInfo.A0P || this.A0Q != threadThemeInfo.A0Q || !11T.A0O(A02(), threadThemeInfo.A02()) || !11T.A0O(this.A0k, threadThemeInfo.A0k) || this.A0R != threadThemeInfo.A0R) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (C1pq.A04(this.A0k, C1pq.A04(A02(), (((((((C1pq.A04(A01(), C1pq.A01((C1pq.A04(this.A0Y, (C1pq.A04(this.A0d, (C1pq.A04(this.A0X, C1pq.A01((((((((((C1pq.A04(this.A0W, C1pq.A04(this.A0V, C1pq.A02((((((C1pq.A04(this.A0c, (((((C1pq.A04(this.A0b, C1pq.A04(this.A0a, C1pq.A04(this.A0h, (C1pq.A04(this.A0g, (((((((((((((((C1pq.A04(this.A0Z, C1pq.A04(A00(), C1pq.A04(this.A0U, C1pq.A04(this.A0e, 1)))) * 31) + this.A00) * 31) + this.A01) * 31) + this.A02) * 31) + this.A03) * 31) + this.A04) * 31) + this.A05) * 31) + this.A06) * 31) + this.A07) * 31) + this.A08))) * 31) + this.A09) * 31) + this.A0A) * 31) + this.A0B) * 31) + this.A0C) * 31) + this.A0D) * 31) + this.A0E, this.A0m))) * 31) + this.A0F) * 31) + this.A0G) * 31) + this.A0H) * 31) + this.A0I) * 31) + this.A0J, this.A0S)) * 31) + this.A0K) * 31) + this.A0L) * 31) + this.A0M, this.A0T)) * 31) + this.A0N) * 31) + this.A0O) * 31) + this.A0P) * 31) + this.A0Q)) * 31) + this.A0R;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("ThreadThemeInfo{accessibilityLabel=");
        A0k.append(this.A0e);
        A0k.append(", aiGeneratedBackgroundUri=");
        A0k.append(this.A0U);
        A0k.append(", appColorMode=");
        A0k.append(A00());
        A0k.append(", backgroundGradientColors=");
        A0k.append(this.A0Z);
        A0k.append(", composerBackgroundColor=");
        A0k.append(this.A00);
        A0k.append(", composerInputBackgroundColor=");
        A0k.append(this.A01);
        A0k.append(", composerInputBorderColor=");
        A0k.append(this.A02);
        A0k.append(", composerInputBorderWidth=");
        A0k.append(this.A03);
        A0k.append(", composerInputPlaceholderColor=");
        A0k.append(this.A04);
        A0k.append(", composerTintColor=");
        A0k.append(this.A05);
        A0k.append(", composerUnselectedTintColor=");
        A0k.append(this.A06);
        A0k.append(", deliveryReceiptColor=");
        A0k.append(this.A07);
        A0k.append(JQw.A00(5));
        A0k.append(this.A0g);
        A0k.append(", fallbackColor=");
        A0k.append(this.A08);
        A0k.append(", gradientBackgroundJsonString=");
        A0k.append(this.A0h);
        A0k.append(", gradientColors=");
        A0k.append(this.A0a);
        A0k.append(", hashProviders=");
        A0k.append(this.A0b);
        A0k.append(", hotLikeColor=");
        A0k.append(this.A09);
        A0k.append(", inboundMessageBorderColor=");
        A0k.append(this.A0A);
        A0k.append(", inboundMessageBorderWidth=");
        A0k.append(this.A0B);
        A0k.append(", inboundMessageGradientColors=");
        A0k.append(this.A0c);
        A0k.append(", inboundMessageLargeCornerRadius=");
        A0k.append(this.A0C);
        A0k.append(", inboundMessageSmallCornerRadius=");
        A0k.append(this.A0D);
        A0k.append(", inboundMessageTextColor=");
        A0k.append(this.A0E);
        A0k.append(", isReverseGradientsForRadial=");
        A0k.append(this.A0m);
        A0k.append(", largeBackgroundImageUri=");
        A0k.append(this.A0V);
        A0k.append(", largeIconAssetUri=");
        A0k.append(this.A0W);
        A0k.append(", messageBorderColor=");
        A0k.append(this.A0F);
        A0k.append(", messageBorderWidth=");
        A0k.append(this.A0G);
        A0k.append(", messageLargeCornerRadius=");
        A0k.append(this.A0H);
        A0k.append(", messageSmallCornerRadius=");
        A0k.append(this.A0I);
        A0k.append(", messageTextColor=");
        A0k.append(this.A0J);
        A0k.append(", normalThemeId=");
        A0k.append(this.A0S);
        A0k.append(", previewAssetUri=");
        A0k.append(this.A0X);
        A0k.append(", primaryButtonBackgroundColor=");
        A0k.append(this.A0K);
        A0k.append(", reactionAssets=");
        A0k.append(this.A0d);
        A0k.append(", reactionPillBackgroundColor=");
        A0k.append(this.A0L);
        A0k.append(", smallIconAssetUri=");
        A0k.append(this.A0Y);
        A0k.append(", tertiaryTextColor=");
        A0k.append(this.A0M);
        A0k.append(", themeId=");
        A0k.append(this.A0T);
        A0k.append(", threadViewMode=");
        A0k.append(A01());
        A0k.append(", titleBarAttributionColor=");
        A0k.append(this.A0N);
        A0k.append(", titleBarBackgroundColor=");
        A0k.append(this.A0O);
        A0k.append(", titleBarButtonTintColor=");
        A0k.append(this.A0P);
        A0k.append(", titleBarTextColor=");
        A0k.append(this.A0Q);
        A0k.append(", type=");
        A0k.append(A02());
        A0k.append(", variantHash=");
        A0k.append(this.A0k);
        A0k.append(", voiceRecordSoundwaveColor=");
        A0k.append(this.A0R);
        return 1BL.A0v(A0k);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A0e);
        Uri uri = this.A0U;
        if (uri == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeParcelable(uri, i);
        }
        String str = this.A0f;
        if (str == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(str);
        }
        ImmutableList immutableList = this.A0Z;
        parcel.writeInt(immutableList.size());
        1Du it = immutableList.iterator();
        while (it.hasNext()) {
            parcel.writeInt(((Number) it.next()).intValue());
        }
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A04);
        parcel.writeInt(this.A05);
        parcel.writeInt(this.A06);
        parcel.writeInt(this.A07);
        String str2 = this.A0g;
        if (str2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(str2);
        }
        parcel.writeInt(this.A08);
        String str3 = this.A0h;
        if (str3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(str3);
        }
        ImmutableList immutableList2 = this.A0a;
        parcel.writeInt(immutableList2.size());
        1Du it2 = immutableList2.iterator();
        while (it2.hasNext()) {
            parcel.writeInt(((Number) it2.next()).intValue());
        }
        ImmutableList immutableList3 = this.A0b;
        parcel.writeInt(immutableList3.size());
        1Du it3 = immutableList3.iterator();
        while (it3.hasNext()) {
            parcel.writeInt(AnonymousClass001.A03(it3.next()));
        }
        parcel.writeInt(this.A09);
        parcel.writeInt(this.A0A);
        parcel.writeInt(this.A0B);
        ImmutableList immutableList4 = this.A0c;
        parcel.writeInt(immutableList4.size());
        1Du it4 = immutableList4.iterator();
        while (it4.hasNext()) {
            parcel.writeInt(((Number) it4.next()).intValue());
        }
        parcel.writeInt(this.A0C);
        parcel.writeInt(this.A0D);
        parcel.writeInt(this.A0E);
        parcel.writeInt(this.A0m ? 1 : 0);
        Uri uri2 = this.A0V;
        if (uri2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeParcelable(uri2, i);
        }
        Uri uri3 = this.A0W;
        if (uri3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeParcelable(uri3, i);
        }
        parcel.writeInt(this.A0F);
        parcel.writeInt(this.A0G);
        parcel.writeInt(this.A0H);
        parcel.writeInt(this.A0I);
        parcel.writeInt(this.A0J);
        parcel.writeLong(this.A0S);
        Uri uri4 = this.A0X;
        if (uri4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeParcelable(uri4, i);
        }
        parcel.writeInt(this.A0K);
        ImmutableList immutableList5 = this.A0d;
        parcel.writeInt(immutableList5.size());
        1Du it5 = immutableList5.iterator();
        while (it5.hasNext()) {
            parcel.writeParcelable((ThreadThemeReactionAssetInfo) it5.next(), i);
        }
        parcel.writeInt(this.A0L);
        Uri uri5 = this.A0Y;
        if (uri5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeParcelable(uri5, i);
        }
        parcel.writeInt(this.A0M);
        parcel.writeLong(this.A0T);
        String str4 = this.A0i;
        if (str4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(str4);
        }
        parcel.writeInt(this.A0N);
        parcel.writeInt(this.A0O);
        parcel.writeInt(this.A0P);
        parcel.writeInt(this.A0Q);
        String str5 = this.A0j;
        if (str5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(str5);
        }
        String str6 = this.A0k;
        if (str6 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(str6);
        }
        parcel.writeInt(this.A0R);
        Set set = this.A0l;
        parcel.writeInt(set.size());
        Iterator it6 = set.iterator();
        while (it6.hasNext()) {
            parcel.writeString((String) it6.next());
        }
    }
}
