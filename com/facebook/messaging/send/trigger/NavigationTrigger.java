package com.facebook.messaging.send.trigger;

import X.0fH;
import X.1Du;
import X.82M;
import X.AbstractC00603o4;
import X.AbstractC3833Mrl;
import X.AnonymousClass001;
import X.AnonymousClass539;
import X.C53v;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.Objects;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.RegularImmutableMap;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* loaded from: NavigationTrigger.class */
public final class NavigationTrigger implements Parcelable {
    public static final Parcelable.Creator CREATOR = new 82M(83);
    public String A00;
    public final AnonymousClass539 A01;
    public final ImmutableList A02;
    public final ImmutableMap A03;
    public final ImmutableMap A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final boolean A09;

    public NavigationTrigger(AnonymousClass539 anonymousClass539, ImmutableList immutableList, String str, String str2, String str3, String str4, String str5, Map map, Map map2, boolean z) {
        str.getClass();
        this.A05 = str;
        this.A08 = str2;
        this.A07 = str3;
        this.A09 = z;
        this.A03 = map == null ? RegularImmutableMap.A03 : ImmutableMap.copyOf(map);
        this.A04 = map2 == null ? RegularImmutableMap.A03 : ImmutableMap.copyOf(map2);
        this.A06 = str4;
        this.A02 = immutableList == null ? ImmutableList.of() : immutableList;
        this.A00 = str5;
        this.A01 = anonymousClass539;
    }

    public NavigationTrigger(Parcel parcel) {
        this.A09 = C53v.A0S(parcel);
        this.A05 = parcel.readString();
        this.A08 = parcel.readString();
        this.A07 = parcel.readString();
        this.A06 = A07(parcel.readString());
        this.A02 = C53v.A01(parcel);
        this.A00 = parcel.readString();
        this.A03 = RegularImmutableMap.A03;
        HashMap hashMap = new HashMap();
        C53v.A0O(parcel, hashMap);
        this.A04 = ImmutableMap.copyOf((Map) hashMap);
        this.A01 = AnonymousClass539.values()[parcel.readInt()];
    }

    public static NavigationTrigger A00(AnonymousClass539 anonymousClass539, String str) {
        return new NavigationTrigger(anonymousClass539, null, str, null, null, null, null, null, null, false);
    }

    public static NavigationTrigger A01(ImmutableList immutableList, String str, String str2) {
        if (str == null) {
            return null;
        }
        return new NavigationTrigger(AnonymousClass539.A6x, immutableList, str, null, null, str2, null, null, null, true);
    }

    public static NavigationTrigger A02(ImmutableList immutableList, String str, String str2, String str3, String str4, String str5, boolean z) {
        return new NavigationTrigger(AnonymousClass539.A6x, immutableList, str, str2, str3, str4, str5, null, null, z);
    }

    public static NavigationTrigger A03(String str) {
        return new NavigationTrigger(AnonymousClass539.A6x, null, str, null, null, null, null, null, null, false);
    }

    public static NavigationTrigger A04(String str) {
        return new NavigationTrigger(AnonymousClass539.A6x, null, "", null, null, str, null, null, null, true);
    }

    public static NavigationTrigger A05(String str) {
        if (str == null) {
            return null;
        }
        return new NavigationTrigger(AnonymousClass539.A6x, null, str, null, null, null, null, null, null, true);
    }

    public static NavigationTrigger A06(String str, String str2) {
        return new NavigationTrigger(AnonymousClass539.A6x, null, str, null, str2, null, null, null, null, false);
    }

    public static String A07(String str) {
        if (str == null) {
            return null;
        }
        if (AbstractC3833Mrl.A00.contains(str)) {
            return str;
        }
        0fH.A0k("NavigationTrigger", "Unrecognized entry point value. Please use Strings defined in MessengerEntryPointTag.java instead.");
        return null;
    }

    public String A08() {
        return this.A05;
    }

    public String A09() {
        return this.A06;
    }

    public String A0A() {
        String str = this.A06;
        if (str == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder(str);
        1Du it = this.A02.iterator();
        while (it.hasNext()) {
            String A0i = AnonymousClass001.A0i(it);
            if (!A0i.startsWith(AbstractC00603o4.A00(509)) && !A0i.startsWith(AbstractC00603o4.A00(9)) && !A0i.startsWith(AbstractC00603o4.A00(17)) && !A0i.startsWith("attribution_id_v2")) {
                sb.append(":");
                sb.append(A0i);
            }
        }
        return sb.toString();
    }

    public String A0B() {
        return this.A07;
    }

    public String A0C() {
        if (this.A09) {
            return this.A05;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(2);
        sb.append(":");
        sb.append(this.A05);
        String str = this.A08;
        if (str != null) {
            sb.append(":");
            sb.append(str);
        }
        return sb.toString();
    }

    public String A0D() {
        return this.A08;
    }

    public String A0E() {
        return this.A00;
    }

    public boolean A0F() {
        return this.A09;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj instanceof NavigationTrigger) {
            NavigationTrigger navigationTrigger = (NavigationTrigger) obj;
            if (this.A09 == navigationTrigger.A09 && Objects.equal(this.A05, navigationTrigger.A05) && Objects.equal(this.A08, navigationTrigger.A08) && Objects.equal(this.A03, navigationTrigger.A03) && Objects.equal(this.A07, navigationTrigger.A07) && this.A06 == navigationTrigger.A06 && Objects.equal(this.A02, navigationTrigger.A02) && Objects.equal(this.A00, navigationTrigger.A00) && this.A01 == navigationTrigger.A01) {
                z = true;
            }
        }
        return z;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.A09), this.A05, this.A08, this.A03, this.A07, this.A06, this.A02, this.A00, this.A01});
    }

    public String toString() {
        return this.A06 != null ? A0A() : A0C();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A09 ? 1 : 0);
        parcel.writeString(this.A05);
        parcel.writeString(this.A08);
        parcel.writeString(this.A07);
        String str = this.A06;
        if (str == null) {
            str = null;
        }
        parcel.writeString(str);
        ImmutableList immutableList = this.A02;
        immutableList.getClass();
        parcel.writeStringList(immutableList);
        parcel.writeString(this.A00);
        C53v.A0Q(parcel, this.A04);
        parcel.writeInt(this.A01.ordinal());
    }
}
