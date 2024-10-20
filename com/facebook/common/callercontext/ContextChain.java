package com.facebook.common.callercontext;

import X.0Pz;
import X.1BL;
import X.2Go;
import X.C2xc;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: ContextChain.class */
public final class ContextChain implements Parcelable {
    public static boolean A06;
    public static final Parcelable.Creator CREATOR = new C2xc(4);
    public String A00;
    public Map A01;
    public String A02;
    public final ContextChain A03;
    public final String A04;
    public final String A05;

    public ContextChain(Parcel parcel) {
        this.A05 = parcel.readString();
        this.A04 = parcel.readString();
        this.A00 = parcel.readString();
        this.A03 = (ContextChain) 1BL.A0C(parcel, ContextChain.class);
    }

    public ContextChain(ContextChain contextChain, String str, String str2) {
        Map map;
        this.A05 = str;
        this.A04 = str2;
        this.A00 = 0Pz.A0j(str, ":", str2);
        this.A03 = contextChain;
        if (contextChain == null || (map = contextChain.A01) == null) {
            return;
        }
        this.A01 = A06 ? new ConcurrentHashMap(map) : new HashMap(map);
    }

    public ContextChain(ContextChain contextChain, String str, Map map) {
        this.A05 = "serialized_tag";
        this.A04 = "serialized_name";
        this.A00 = str;
        this.A03 = contextChain;
        Map map2 = contextChain.A01;
        if (map2 != null) {
            this.A01 = A06 ? new ConcurrentHashMap(map2) : new HashMap(map2);
        }
        if (map != null) {
            Map map3 = this.A01;
            if (map3 == null) {
                map3 = A06 ? new ConcurrentHashMap() : new HashMap();
                this.A01 = map3;
            }
            map3.putAll(map);
        }
    }

    public ContextChain A00() {
        ContextChain contextChain = this.A03;
        return contextChain == null ? this : contextChain.A00();
    }

    public void A01(String str, Object obj) {
        boolean z = A06;
        if (z && (str == null || obj == null)) {
            return;
        }
        Map map = this.A01;
        if (map == null) {
            map = z ? new ConcurrentHashMap() : new HashMap();
            this.A01 = map;
        }
        map.put(str, obj);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            ContextChain contextChain = (ContextChain) obj;
            if (!2Go.A00(this.A00, contextChain.A00) || !2Go.A00(this.A03, contextChain.A03)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A03, this.A00});
    }

    public String toString() {
        String str = this.A02;
        if (str == null) {
            str = this.A00;
            this.A02 = str;
            ContextChain contextChain = this.A03;
            if (contextChain != null) {
                str = 0Pz.A0Y(contextChain.toString(), this.A02, '/');
                this.A02 = str;
            }
        }
        return str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A05);
        parcel.writeString(this.A04);
        parcel.writeString(this.A00);
        parcel.writeParcelable(this.A03, i);
    }
}
