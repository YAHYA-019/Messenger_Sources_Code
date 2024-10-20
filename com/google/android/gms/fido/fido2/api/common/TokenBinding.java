package com.google.android.gms.fido.fido2.api.common;

import X.AbM;
import X.AbstractC00481b7;
import X.AbstractC01153q8;
import X.JQx;
import X.JQy;
import X.KQF;
import X.LGm;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: TokenBinding.class */
public final class TokenBinding extends AbstractSafeParcelable {
    public final TokenBindingStatus A00;
    public final String A01;
    public static final Parcelable.Creator CREATOR = LGm.A00(6);
    public static final TokenBinding A03 = new TokenBinding(TokenBindingStatus.SUPPORTED.toString(), null);
    public static final TokenBinding A02 = new TokenBinding(TokenBindingStatus.NOT_SUPPORTED.toString(), null);

    /* loaded from: TokenBinding$TokenBindingStatus.class */
    public enum TokenBindingStatus implements Parcelable {
        /* JADX INFO: Fake field, exist only in values array */
        PRESENT("present"),
        SUPPORTED("supported"),
        NOT_SUPPORTED("not-supported");

        public static final Parcelable.Creator CREATOR = LGm.A00(5);
        public final String zzb;

        TokenBindingStatus(String str) {
            this.zzb = str;
        }

        public static TokenBindingStatus A00(String str) {
            TokenBindingStatus[] values = values();
            int length = values.length;
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= length) {
                    throw new Exception(String.format("TokenBindingStatus %s not supported", str));
                }
                TokenBindingStatus tokenBindingStatus = values[i2];
                if (str.equals(tokenBindingStatus.zzb)) {
                    return tokenBindingStatus;
                }
                i = i2 + 1;
            }
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.zzb;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.zzb);
        }
    }

    public TokenBinding(String str, String str2) {
        AbstractC00481b7.A02(str);
        try {
            this.A00 = TokenBindingStatus.A00(str);
            this.A01 = str2;
        } catch (KQF e) {
            throw new IllegalArgumentException((Throwable) e);
        }
    }

    public boolean equals(Object obj) {
        TokenBinding tokenBinding;
        TokenBindingStatus tokenBindingStatus;
        TokenBindingStatus tokenBindingStatus2;
        String str;
        String str2;
        boolean z = false;
        if ((obj instanceof TokenBinding) && (((tokenBindingStatus = this.A00) == (tokenBindingStatus2 = (tokenBinding = (TokenBinding) obj).A00) || (tokenBindingStatus != null && tokenBindingStatus.equals(tokenBindingStatus2))) && ((str = this.A01) == (str2 = tokenBinding.A01) || (str != null && str.equals(str2))))) {
            z = true;
        }
        return z;
    }

    public int hashCode() {
        return AbM.A05(this.A00, this.A01);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int A0E = JQx.A0E(parcel);
        AbstractC01153q8.A08(parcel, this.A00.toString(), 2);
        JQy.A17(parcel, this.A01, A0E);
    }
}
