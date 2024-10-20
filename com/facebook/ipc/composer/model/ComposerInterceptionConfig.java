package com.facebook.ipc.composer.model;

import X.11T;
import X.1BL;
import X.1Du;
import X.7zN;
import X.AbH;
import X.C1pq;
import X.C3o5;
import X.FKa;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.graphql.enums.GraphQLPagesComposerAttachmentTypeEnum;
import com.google.common.collect.ImmutableList;

/* loaded from: ComposerInterceptionConfig.class */
public final class ComposerInterceptionConfig implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKa.A00(33);
    public final ImmutableList A00;
    public final ImmutableList A01;
    public final ImmutableList A02;
    public final String A03;

    public ComposerInterceptionConfig(Parcel parcel) {
        int A01 = C3o5.A01(parcel, this);
        GraphQLPagesComposerAttachmentTypeEnum[] graphQLPagesComposerAttachmentTypeEnumArr = new GraphQLPagesComposerAttachmentTypeEnum[A01];
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= A01) {
                break;
            }
            graphQLPagesComposerAttachmentTypeEnumArr[i3] = GraphQLPagesComposerAttachmentTypeEnum.values()[parcel.readInt()];
            i2 = i3 + 1;
        }
        this.A00 = ImmutableList.copyOf(graphQLPagesComposerAttachmentTypeEnumArr);
        int readInt = parcel.readInt();
        GraphQLPagesComposerAttachmentTypeEnum[] graphQLPagesComposerAttachmentTypeEnumArr2 = new GraphQLPagesComposerAttachmentTypeEnum[readInt];
        int i4 = 0;
        while (true) {
            int i5 = i4;
            if (i5 >= readInt) {
                break;
            }
            graphQLPagesComposerAttachmentTypeEnumArr2[i5] = GraphQLPagesComposerAttachmentTypeEnum.values()[parcel.readInt()];
            i4 = i5 + 1;
        }
        this.A01 = ImmutableList.copyOf(graphQLPagesComposerAttachmentTypeEnumArr2);
        this.A03 = parcel.readString();
        int readInt2 = parcel.readInt();
        String[] strArr = new String[readInt2];
        while (i < readInt2) {
            i = AbH.A00(parcel, strArr, i);
        }
        this.A02 = ImmutableList.copyOf(strArr);
    }

    public ComposerInterceptionConfig(ImmutableList immutableList, ImmutableList immutableList2, ImmutableList immutableList3, String str) {
        C1pq.A08("allowedAttachmentTypes", immutableList);
        this.A00 = immutableList;
        C1pq.A08("excludedAttachmentTypes", immutableList2);
        this.A01 = immutableList2;
        C1pq.A08("interceptionProductType", str);
        this.A03 = str;
        C1pq.A08("supportedLocales", immutableList3);
        this.A02 = immutableList3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ComposerInterceptionConfig)) {
                return false;
            }
            ComposerInterceptionConfig composerInterceptionConfig = (ComposerInterceptionConfig) obj;
            if (!11T.A0O(this.A00, composerInterceptionConfig.A00) || !11T.A0O(this.A01, composerInterceptionConfig.A01) || !11T.A0O(this.A03, composerInterceptionConfig.A03) || !11T.A0O(this.A02, composerInterceptionConfig.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A02, C1pq.A04(this.A03, C1pq.A04(this.A01, C1pq.A03(this.A00))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1Du A0b = 1BL.A0b(parcel, this.A00);
        while (A0b.hasNext()) {
            7zN.A0z(parcel, (GraphQLPagesComposerAttachmentTypeEnum) A0b.next());
        }
        1Du A0b2 = 1BL.A0b(parcel, this.A01);
        while (A0b2.hasNext()) {
            7zN.A0z(parcel, (GraphQLPagesComposerAttachmentTypeEnum) A0b2.next());
        }
        parcel.writeString(this.A03);
        1Du A0b3 = 1BL.A0b(parcel, this.A02);
        while (A0b3.hasNext()) {
            C3o5.A0h(parcel, A0b3);
        }
    }
}
