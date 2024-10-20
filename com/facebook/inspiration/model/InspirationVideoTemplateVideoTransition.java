package com.facebook.inspiration.model;

import X.11T;
import X.1BL;
import X.1Du;
import X.4YU;
import X.4YV;
import X.AbI;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.FKf;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.graphql.enums.GraphQLFBInspirationVideoTemplateTransitionType;
import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: InspirationVideoTemplateVideoTransition.class */
public final class InspirationVideoTemplateVideoTransition implements Parcelable {
    public static volatile InspirationVideoTemplateTransitionContext A07;
    public static final Parcelable.Creator CREATOR = FKf.A01(86);
    public final int A00;
    public final int A01;
    public final InspirationVideoTemplateTransitionContext A02;
    public final ImmutableList A03;
    public final String A04;
    public final String A05;
    public final Set A06;

    public InspirationVideoTemplateVideoTransition(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        this.A00 = parcel.readInt();
        int readInt = parcel.readInt();
        InspirationVideoTemplateVideoIGLUEffect[] inspirationVideoTemplateVideoIGLUEffectArr = new InspirationVideoTemplateVideoIGLUEffect[readInt];
        int i = 0;
        int i2 = 0;
        while (i2 < readInt) {
            i2 = AbI.A01(parcel, A0e, inspirationVideoTemplateVideoIGLUEffectArr, i2);
        }
        this.A03 = ImmutableList.copyOf(inspirationVideoTemplateVideoIGLUEffectArr);
        InspirationVideoTemplateTransitionContext inspirationVideoTemplateTransitionContext = null;
        if (parcel.readInt() == 0) {
            this.A04 = null;
        } else {
            this.A04 = parcel.readString();
        }
        this.A01 = parcel.readInt();
        this.A02 = parcel.readInt() != 0 ? (InspirationVideoTemplateTransitionContext) parcel.readParcelable(A0e) : inspirationVideoTemplateTransitionContext;
        this.A05 = parcel.readString();
        HashSet A0v = AnonymousClass001.A0v();
        int readInt2 = parcel.readInt();
        while (i < readInt2) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A06 = Collections.unmodifiableSet(A0v);
    }

    public InspirationVideoTemplateVideoTransition(InspirationVideoTemplateTransitionContext inspirationVideoTemplateTransitionContext, ImmutableList immutableList, String str, String str2, Set set, int i, int i2) {
        this.A00 = i;
        C1pq.A08("igluEffects", immutableList);
        this.A03 = immutableList;
        this.A04 = str;
        this.A01 = i2;
        this.A02 = inspirationVideoTemplateTransitionContext;
        C1pq.A08("transitionId", str2);
        this.A05 = str2;
        this.A06 = Collections.unmodifiableSet(set);
    }

    public InspirationVideoTemplateTransitionContext A00() {
        if (this.A06.contains("transitionContext")) {
            return this.A02;
        }
        if (A07 == null) {
            synchronized (this) {
                if (A07 == null) {
                    HashSet A0v = AnonymousClass001.A0v();
                    Integer A0k = 4YU.A0k();
                    A07 = new InspirationVideoTemplateTransitionContext(GraphQLFBInspirationVideoTemplateTransitionType.A02, A0k, A0k, 4YV.A0z("transitionType", A0v, A0v));
                }
            }
        }
        return A07;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof InspirationVideoTemplateVideoTransition)) {
                return false;
            }
            InspirationVideoTemplateVideoTransition inspirationVideoTemplateVideoTransition = (InspirationVideoTemplateVideoTransition) obj;
            if (this.A00 != inspirationVideoTemplateVideoTransition.A00 || !11T.A0O(this.A03, inspirationVideoTemplateVideoTransition.A03) || !11T.A0O(this.A04, inspirationVideoTemplateVideoTransition.A04) || this.A01 != inspirationVideoTemplateVideoTransition.A01 || !11T.A0O(A00(), inspirationVideoTemplateVideoTransition.A00()) || !11T.A0O(this.A05, inspirationVideoTemplateVideoTransition.A05)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A05, C1pq.A04(A00(), (C1pq.A04(this.A04, C1pq.A04(this.A03, this.A00 + 31)) * 31) + this.A01));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00);
        1Du A0b = 1BL.A0b(parcel, this.A03);
        while (A0b.hasNext()) {
            parcel.writeParcelable((InspirationVideoTemplateVideoIGLUEffect) A0b.next(), i);
        }
        1BL.A13(parcel, this.A04);
        parcel.writeInt(this.A01);
        C3o5.A0d(parcel, this.A02, i);
        parcel.writeString(this.A05);
        Iterator A0S = C3o5.A0S(parcel, this.A06);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
