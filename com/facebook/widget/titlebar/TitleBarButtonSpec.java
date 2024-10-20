package com.facebook.widget.titlebar;

import X.11T;
import X.C53v;
import X.F6h;
import X.FKb;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import java.util.Arrays;

/* loaded from: TitleBarButtonSpec.class */
public final class TitleBarButtonSpec implements Parcelable {
    public static final TitleBarButtonSpec A0R;
    public static final Parcelable.Creator CREATOR;
    public int A00;
    public Drawable A01;
    public boolean A02;
    public boolean A03;
    public String A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final View A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final boolean A0M;
    public final int A0N;
    public final boolean A0O;
    public final boolean A0P;
    public final boolean A0Q;

    static {
        F6h f6h = new F6h();
        f6h.A09 = false;
        A0R = new TitleBarButtonSpec(f6h);
        CREATOR = FKb.A00(38);
    }

    public TitleBarButtonSpec(F6h f6h) {
        this.A00 = -1;
        this.A09 = f6h.A00;
        this.A01 = f6h.A04;
        this.A0P = false;
        this.A0O = false;
        this.A04 = f6h.A06;
        this.A08 = -1;
        this.A0G = f6h.A08;
        this.A0N = f6h.A01;
        this.A0E = f6h.A07;
        this.A0C = f6h.A05;
        this.A02 = f6h.A09;
        this.A03 = false;
        this.A07 = f6h.A03;
        this.A06 = f6h.A02;
        this.A0Q = false;
        this.A00 = 0;
        this.A0M = true;
        this.A0I = false;
        this.A0A = -1;
        this.A0B = 2;
        this.A0L = false;
        this.A0F = null;
        this.A0K = false;
        this.A0J = false;
        this.A05 = 0;
        this.A0D = null;
        this.A0H = null;
    }

    public TitleBarButtonSpec(Parcel parcel) {
        this.A00 = -1;
        this.A09 = parcel.readInt();
        this.A01 = null;
        this.A0C = null;
        this.A0P = C53v.A0S(parcel);
        this.A0O = C53v.A0S(parcel);
        this.A04 = parcel.readString();
        this.A08 = parcel.readInt();
        this.A0G = parcel.readString();
        this.A0N = parcel.readInt();
        this.A0E = parcel.readString();
        this.A07 = parcel.readInt();
        this.A06 = parcel.readInt();
        this.A0Q = C53v.A0S(parcel);
        this.A00 = parcel.readInt();
        this.A0M = C53v.A0S(parcel);
        this.A0I = C53v.A0S(parcel);
        this.A0A = parcel.readInt();
        this.A0B = parcel.readInt();
        this.A03 = C53v.A0S(parcel);
        this.A02 = C53v.A0S(parcel);
        this.A0L = C53v.A0S(parcel);
        this.A0F = parcel.readString();
        this.A0K = C53v.A0S(parcel);
        this.A0J = C53v.A0S(parcel);
        this.A05 = parcel.readInt();
        this.A0D = parcel.readString();
        this.A0H = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof TitleBarButtonSpec)) {
                return false;
            }
            TitleBarButtonSpec titleBarButtonSpec = (TitleBarButtonSpec) obj;
            if (this.A09 == titleBarButtonSpec.A09) {
                Drawable drawable = this.A01;
                Drawable.ConstantState constantState = drawable != null ? drawable.getConstantState() : null;
                Drawable drawable2 = titleBarButtonSpec.A01;
                if (11T.A0O(constantState, drawable2 != null ? drawable2.getConstantState() : null) && this.A0P == titleBarButtonSpec.A0P && this.A0O == titleBarButtonSpec.A0O && 11T.A0O(this.A04, titleBarButtonSpec.A04) && this.A08 == titleBarButtonSpec.A08 && 11T.A0O(this.A0G, titleBarButtonSpec.A0G) && this.A0N == titleBarButtonSpec.A0N && 11T.A0O(this.A0E, titleBarButtonSpec.A0E) && this.A07 == titleBarButtonSpec.A07 && 11T.A0O(this.A0C, titleBarButtonSpec.A0C) && this.A06 == titleBarButtonSpec.A06 && this.A0Q == titleBarButtonSpec.A0Q && this.A00 == titleBarButtonSpec.A00 && this.A0M == titleBarButtonSpec.A0M && this.A03 == titleBarButtonSpec.A03 && this.A02 == titleBarButtonSpec.A02 && this.A0I == titleBarButtonSpec.A0I && this.A0A == titleBarButtonSpec.A0A && this.A0B == titleBarButtonSpec.A0B && this.A0L == titleBarButtonSpec.A0L && 11T.A0O(this.A0F, titleBarButtonSpec.A0F) && this.A05 == titleBarButtonSpec.A05 && 11T.A0O(this.A0D, titleBarButtonSpec.A0D) && 11T.A0O(this.A0H, titleBarButtonSpec.A0H)) {
                    return true;
                }
            }
            z = false;
        }
        return z;
    }

    public int hashCode() {
        Integer valueOf = Integer.valueOf(this.A09);
        Drawable drawable = this.A01;
        return Arrays.hashCode(new Object[]{valueOf, drawable != null ? drawable.getConstantState() : null, Boolean.valueOf(this.A0P), Boolean.valueOf(this.A0O), this.A04, Integer.valueOf(this.A08), this.A0G, Integer.valueOf(this.A0N), this.A0E, Integer.valueOf(this.A07), this.A0C, Integer.valueOf(this.A06), Boolean.valueOf(this.A0Q), Integer.valueOf(this.A00), Boolean.valueOf(this.A0M), Boolean.valueOf(this.A03), Boolean.valueOf(this.A02), Boolean.valueOf(this.A0I), Integer.valueOf(this.A0A), Integer.valueOf(this.A0B), Boolean.valueOf(this.A0L), this.A0F, Integer.valueOf(this.A05), this.A0D, this.A0H});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeInt(this.A09);
        parcel.writeInt(this.A0P ? 1 : 0);
        parcel.writeInt(this.A0O ? 1 : 0);
        parcel.writeString(this.A04);
        parcel.writeInt(this.A08);
        parcel.writeString(this.A0G);
        parcel.writeInt(this.A0N);
        parcel.writeString(this.A0E);
        parcel.writeInt(this.A07);
        parcel.writeInt(this.A06);
        parcel.writeInt(this.A0Q ? 1 : 0);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A0M ? 1 : 0);
        parcel.writeInt(this.A0I ? 1 : 0);
        parcel.writeInt(this.A0A);
        parcel.writeInt(this.A0B);
        parcel.writeInt(this.A03 ? 1 : 0);
        parcel.writeInt(this.A02 ? 1 : 0);
        parcel.writeInt(this.A0L ? 1 : 0);
        parcel.writeString(this.A0F);
        parcel.writeInt(this.A0K ? 1 : 0);
        parcel.writeInt(this.A0J ? 1 : 0);
        parcel.writeInt(this.A05);
        parcel.writeString(this.A0D);
        parcel.writeString(this.A0H);
    }
}
