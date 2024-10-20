package com.google.android.gms.wearable.internal;

import X.0Pz;
import X.AbstractC00481b7;
import X.AbstractC01153q8;
import X.AbstractC09524qc;
import X.AnonymousClass001;
import X.JQx;
import X.LGm;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wearable.Channel;

/* loaded from: zzbu.class */
public final class zzbu extends AbstractSafeParcelable implements Parcelable, Channel {
    public static final Parcelable.Creator CREATOR = LGm.A00(65);
    public final String A00;
    public final String A01;
    public final String A02;

    public zzbu(String str, String str2, String str3) {
        AbstractC00481b7.A02(str);
        this.A00 = str;
        AbstractC00481b7.A02(str2);
        this.A01 = str2;
        AbstractC00481b7.A02(str3);
        this.A02 = str3;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof zzbu)) {
                return false;
            }
            zzbu zzbuVar = (zzbu) obj;
            if (!this.A00.equals(zzbuVar.A00) || !AbstractC09524qc.A00(zzbuVar.A01, this.A01) || !AbstractC09524qc.A00(zzbuVar.A02, this.A02)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v40, types: [int] */
    public final String toString() {
        String str = this.A00;
        char c = 0;
        for (char c2 : str.toCharArray()) {
            c += c2;
        }
        String trim = str.trim();
        int length = trim.length();
        if (length > 25) {
            String substring = trim.substring(0, 10);
            String substring2 = trim.substring(length - 10, length);
            StringBuilder A0n = AnonymousClass001.A0n(substring);
            A0n.append("...");
            A0n.append(substring2);
            trim = AnonymousClass001.A0e("::", A0n, c);
        }
        return 0Pz.A12("Channel{token=", trim, ", nodeId=", this.A01, ", path=", this.A02, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A0E = JQx.A0E(parcel);
        AbstractC01153q8.A08(parcel, this.A00, 2);
        AbstractC01153q8.A08(parcel, this.A01, 3);
        AbstractC01153q8.A08(parcel, this.A02, 4);
        AbstractC01153q8.A03(parcel, A0E);
    }
}
