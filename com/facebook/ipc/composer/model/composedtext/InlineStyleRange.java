package com.facebook.ipc.composer.model.composedtext;

import X.AnonymousClass001;
import X.C3o5;
import X.CSR;
import X.DKH;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.graphql.enums.GraphQLInlineStyle;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: InlineStyleRange.class */
public final class InlineStyleRange implements Parcelable {
    public static volatile GraphQLInlineStyle A04;
    public static final Parcelable.Creator CREATOR = new CSR(21);
    public final int A00;
    public final int A01;
    public final GraphQLInlineStyle A02;
    public final Set A03;

    public InlineStyleRange(Parcel parcel) {
        this.A02 = C3o5.A01(parcel, this) == 0 ? null : GraphQLInlineStyle.values()[parcel.readInt()];
        this.A00 = parcel.readInt();
        this.A01 = parcel.readInt();
        HashSet A0v = AnonymousClass001.A0v();
        int readInt = parcel.readInt();
        int i = 0;
        while (i < readInt) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A03 = Collections.unmodifiableSet(A0v);
    }

    public InlineStyleRange(GraphQLInlineStyle graphQLInlineStyle, Set set, int i, int i2) {
        this.A02 = graphQLInlineStyle;
        this.A00 = i;
        this.A01 = i2;
        this.A03 = Collections.unmodifiableSet(set);
    }

    public GraphQLInlineStyle A00() {
        if (this.A03.contains("inlineStyle")) {
            return this.A02;
        }
        if (A04 == null) {
            synchronized (this) {
                if (A04 == null) {
                    A04 = GraphQLInlineStyle.A02;
                }
            }
        }
        return A04;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof InlineStyleRange)) {
                return false;
            }
            InlineStyleRange inlineStyleRange = (InlineStyleRange) obj;
            if (A00() != inlineStyleRange.A00() || this.A00 != inlineStyleRange.A00 || this.A01 != inlineStyleRange.A01) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((C3o5.A03(A00()) + 31) * 31) + this.A00) * 31) + this.A01;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(DKH.A05(parcel, this.A02));
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
        Iterator A0S = C3o5.A0S(parcel, this.A03);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
