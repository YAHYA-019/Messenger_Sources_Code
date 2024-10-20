package com.facebook.inspiration.model;

import X.11T;
import X.1BL;
import X.1Du;
import X.4YV;
import X.AbI;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.FKf;
import X.QoY;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: InspirationVideoTemplateVideoIGLUEffect.class */
public final class InspirationVideoTemplateVideoIGLUEffect implements Parcelable {
    public static volatile QoY A0A;
    public static final Parcelable.Creator CREATOR = FKf.A01(82);
    public final int A00;
    public final int A01;
    public final InspirationVideoTemplateTransitionContext A02;
    public final QoY A03;
    public final ImmutableList A04;
    public final Integer A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final Set A09;

    public InspirationVideoTemplateVideoIGLUEffect(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        InspirationVideoTemplateTransitionContext inspirationVideoTemplateTransitionContext = null;
        if (parcel.readInt() == 0) {
            this.A05 = null;
        } else {
            this.A05 = AbI.A0z(parcel);
        }
        this.A06 = parcel.readString();
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = QoY.values()[parcel.readInt()];
        }
        this.A00 = parcel.readInt();
        if (parcel.readInt() == 0) {
            this.A07 = null;
        } else {
            this.A07 = parcel.readString();
        }
        int readInt = parcel.readInt();
        InspirationVideoTemplateVideoIGLUEffectProperty[] inspirationVideoTemplateVideoIGLUEffectPropertyArr = new InspirationVideoTemplateVideoIGLUEffectProperty[readInt];
        int i = 0;
        int i2 = 0;
        while (i2 < readInt) {
            i2 = AbI.A01(parcel, A0e, inspirationVideoTemplateVideoIGLUEffectPropertyArr, i2);
        }
        this.A04 = ImmutableList.copyOf(inspirationVideoTemplateVideoIGLUEffectPropertyArr);
        if (parcel.readInt() == 0) {
            this.A08 = null;
        } else {
            this.A08 = parcel.readString();
        }
        this.A01 = parcel.readInt();
        this.A02 = parcel.readInt() != 0 ? (InspirationVideoTemplateTransitionContext) parcel.readParcelable(A0e) : inspirationVideoTemplateTransitionContext;
        HashSet A0v = AnonymousClass001.A0v();
        int readInt2 = parcel.readInt();
        while (i < readInt2) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A09 = Collections.unmodifiableSet(A0v);
    }

    public InspirationVideoTemplateVideoIGLUEffect(InspirationVideoTemplateTransitionContext inspirationVideoTemplateTransitionContext, QoY qoY, ImmutableList immutableList, Integer num, String str, String str2, String str3, Set set, int i, int i2) {
        this.A05 = num;
        C1pq.A08("effectID", str);
        this.A06 = str;
        this.A03 = qoY;
        this.A00 = i;
        this.A07 = str2;
        C1pq.A08("properties", immutableList);
        this.A04 = immutableList;
        this.A08 = str3;
        this.A01 = i2;
        this.A02 = inspirationVideoTemplateTransitionContext;
        this.A09 = Collections.unmodifiableSet(set);
    }

    public QoY A00() {
        if (this.A09.contains("effectType")) {
            return this.A03;
        }
        if (A0A == null) {
            synchronized (this) {
                if (A0A == null) {
                    A0A = QoY.A02;
                }
            }
        }
        return A0A;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof InspirationVideoTemplateVideoIGLUEffect)) {
                return false;
            }
            InspirationVideoTemplateVideoIGLUEffect inspirationVideoTemplateVideoIGLUEffect = (InspirationVideoTemplateVideoIGLUEffect) obj;
            if (!11T.A0O(this.A05, inspirationVideoTemplateVideoIGLUEffect.A05) || !11T.A0O(this.A06, inspirationVideoTemplateVideoIGLUEffect.A06) || A00() != inspirationVideoTemplateVideoIGLUEffect.A00() || this.A00 != inspirationVideoTemplateVideoIGLUEffect.A00 || !11T.A0O(this.A07, inspirationVideoTemplateVideoIGLUEffect.A07) || !11T.A0O(this.A04, inspirationVideoTemplateVideoIGLUEffect.A04) || !11T.A0O(this.A08, inspirationVideoTemplateVideoIGLUEffect.A08) || this.A01 != inspirationVideoTemplateVideoIGLUEffect.A01 || !11T.A0O(this.A02, inspirationVideoTemplateVideoIGLUEffect.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A04 = C1pq.A04(this.A06, C1pq.A03(this.A05));
        return C1pq.A04(this.A02, (C1pq.A04(this.A08, C1pq.A04(this.A04, C1pq.A04(this.A07, (((A04 * 31) + C3o5.A03(A00())) * 31) + this.A00))) * 31) + this.A01);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C3o5.A0f(parcel, this.A05);
        parcel.writeString(this.A06);
        C3o5.A0e(parcel, this.A03);
        parcel.writeInt(this.A00);
        1BL.A13(parcel, this.A07);
        1Du A0b = 1BL.A0b(parcel, this.A04);
        while (A0b.hasNext()) {
            parcel.writeParcelable((InspirationVideoTemplateVideoIGLUEffectProperty) A0b.next(), i);
        }
        1BL.A13(parcel, this.A08);
        parcel.writeInt(this.A01);
        C3o5.A0d(parcel, this.A02, i);
        Iterator A0S = C3o5.A0S(parcel, this.A09);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
