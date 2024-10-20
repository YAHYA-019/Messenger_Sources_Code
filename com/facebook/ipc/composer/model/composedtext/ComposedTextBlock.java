package com.facebook.ipc.composer.model.composedtext;

import X.11T;
import X.1BL;
import X.1Du;
import X.4YV;
import X.AbI;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.CSR;
import X.DKH;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.graphql.enums.GraphQLComposedBlockType;
import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: ComposedTextBlock.class */
public final class ComposedTextBlock implements Parcelable {
    public static volatile GraphQLComposedBlockType A06;
    public static final Parcelable.Creator CREATOR = new CSR(20);
    public final int A00;
    public final ImmutableList A01;
    public final ImmutableList A02;
    public final String A03;
    public final GraphQLComposedBlockType A04;
    public final Set A05;

    public ComposedTextBlock(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        this.A04 = parcel.readInt() == 0 ? null : GraphQLComposedBlockType.values()[parcel.readInt()];
        this.A00 = parcel.readInt();
        int readInt = parcel.readInt();
        ComposedEntityRange[] composedEntityRangeArr = new ComposedEntityRange[readInt];
        int i = 0;
        int i2 = 0;
        while (i2 < readInt) {
            i2 = AbI.A01(parcel, A0e, composedEntityRangeArr, i2);
        }
        this.A01 = ImmutableList.copyOf(composedEntityRangeArr);
        int readInt2 = parcel.readInt();
        InlineStyleRange[] inlineStyleRangeArr = new InlineStyleRange[readInt2];
        int i3 = 0;
        while (i3 < readInt2) {
            i3 = AbI.A01(parcel, A0e, inlineStyleRangeArr, i3);
        }
        this.A02 = ImmutableList.copyOf(inlineStyleRangeArr);
        this.A03 = parcel.readString();
        HashSet A0v = AnonymousClass001.A0v();
        int readInt3 = parcel.readInt();
        while (i < readInt3) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A05 = Collections.unmodifiableSet(A0v);
    }

    public ComposedTextBlock(GraphQLComposedBlockType graphQLComposedBlockType, ImmutableList immutableList, ImmutableList immutableList2, String str, Set set, int i) {
        this.A04 = graphQLComposedBlockType;
        this.A00 = i;
        C1pq.A08("entityRanges", immutableList);
        this.A01 = immutableList;
        C1pq.A08("inlineStyleRanges", immutableList2);
        this.A02 = immutableList2;
        C1pq.A08("text", str);
        this.A03 = str;
        this.A05 = Collections.unmodifiableSet(set);
    }

    public GraphQLComposedBlockType A00() {
        if (this.A05.contains("blockType")) {
            return this.A04;
        }
        if (A06 == null) {
            synchronized (this) {
                if (A06 == null) {
                    A06 = GraphQLComposedBlockType.A03;
                }
            }
        }
        return A06;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ComposedTextBlock)) {
                return false;
            }
            ComposedTextBlock composedTextBlock = (ComposedTextBlock) obj;
            if (A00() != composedTextBlock.A00() || this.A00 != composedTextBlock.A00 || !11T.A0O(this.A01, composedTextBlock.A01) || !11T.A0O(this.A02, composedTextBlock.A02) || !11T.A0O(this.A03, composedTextBlock.A03)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A03, C1pq.A04(this.A02, C1pq.A04(this.A01, ((C3o5.A03(A00()) + 31) * 31) + this.A00)));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(DKH.A05(parcel, this.A04));
        parcel.writeInt(this.A00);
        1Du A0b = 1BL.A0b(parcel, this.A01);
        while (A0b.hasNext()) {
            parcel.writeParcelable((ComposedEntityRange) A0b.next(), i);
        }
        1Du A0b2 = 1BL.A0b(parcel, this.A02);
        while (A0b2.hasNext()) {
            parcel.writeParcelable((InlineStyleRange) A0b2.next(), i);
        }
        parcel.writeString(this.A03);
        Iterator A0S = C3o5.A0S(parcel, this.A05);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
