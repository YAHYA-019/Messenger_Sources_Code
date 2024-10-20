package com.facebook.messaging.model.threads;

import X.11T;
import X.AnonymousClass244;
import X.BJT;
import X.C2xc;
import X.C53v;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.common.util.JSONUtil;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.RegularImmutableMap;
import java.io.IOException;
import java.util.Map;

/* loaded from: NicknamesMap.class */
public final class NicknamesMap implements Parcelable {
    public static final ImmutableMap A02 = RegularImmutableMap.A03;
    public static final Parcelable.Creator CREATOR = new C2xc(31);
    public ImmutableMap A00;
    public String A01;

    public NicknamesMap() {
    }

    public NicknamesMap(Map map) {
        this.A00 = map != null ? ImmutableMap.copyOf(map) : null;
    }

    public final ImmutableMap A00(AnonymousClass244 anonymousClass244) {
        String str;
        11T.A0F(anonymousClass244, 0);
        if (this.A00 == null && (str = this.A01) != null) {
            try {
                this.A00 = (ImmutableMap) anonymousClass244.A0Q(new BJT(), str);
            } catch (IOException unused) {
            }
        }
        ImmutableMap immutableMap = this.A00;
        if (immutableMap == null) {
            immutableMap = A02;
            11T.A0B(immutableMap);
        }
        return immutableMap;
    }

    public final String A01() {
        ImmutableMap immutableMap;
        if (this.A01 == null && (immutableMap = this.A00) != null && !immutableMap.isEmpty()) {
            this.A01 = JSONUtil.A0B(this.A00).toString();
        }
        return this.A01;
    }

    public final String A02(AnonymousClass244 anonymousClass244, String str) {
        String str2;
        11T.A0F(anonymousClass244, 1);
        if (this.A00 == null && (str2 = this.A01) != null) {
            try {
                this.A00 = (ImmutableMap) anonymousClass244.A0Q(new BJT(), str2);
            } catch (IOException unused) {
            }
        }
        ImmutableMap immutableMap = this.A00;
        if (immutableMap == null) {
            return null;
        }
        return (String) immutableMap.get(str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        String str;
        boolean z = false;
        if ((obj instanceof NicknamesMap) && (((str = this.A01) != null && str.equals(((NicknamesMap) obj).A01)) || 11T.A0O(this.A00, ((NicknamesMap) obj).A00))) {
            z = true;
        }
        return z;
    }

    public int hashCode() {
        String str = this.A01;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        ImmutableMap immutableMap = this.A00;
        if (immutableMap != null) {
            i = immutableMap.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        String A01 = A01();
        if (A01 == null) {
            A01 = "{}";
        }
        return A01;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int i2 = 0;
        11T.A0F(parcel, 0);
        int i3 = 1;
        if (this.A01 != null) {
            i2 = 1;
        }
        parcel.writeInt(i2);
        String str = this.A01;
        if (str != null) {
            parcel.writeString(str);
        }
        if (this.A00 == null) {
            i3 = 0;
        }
        parcel.writeInt(i3);
        ImmutableMap immutableMap = this.A00;
        if (immutableMap != null) {
            C53v.A0Q(parcel, immutableMap);
        }
    }
}
