package com.facebook.inspiration.model;

import X.11T;
import X.1BL;
import X.1Du;
import X.4YV;
import X.AbH;
import X.AbI;
import X.AbN;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.EOp;
import X.FKf;
import X.N3T;
import X.ReV;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ipc.inspiration.config.platform.PlatformCameraShareConfiguration;
import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: InspirationEffectsModel.class */
public final class InspirationEffectsModel implements Parcelable {
    public static volatile InspirationEffectWithSource A0F;
    public static volatile InspirationEffectWithSource A0G;
    public static volatile InspirationInlineEffectsTrayState A0H;
    public static final Parcelable.Creator CREATOR = new FKf(51);
    public final EOp A00;
    public final InspirationEffectWithSource A01;
    public final InspirationEffectWithSource A02;
    public final InspirationEffectWithSource A03;
    public final InspirationInlineEffectsTrayState A04;
    public final PlatformCameraShareConfiguration A05;
    public final ImmutableList A06;
    public final ImmutableList A07;
    public final ImmutableList A08;
    public final ImmutableList A09;
    public final ImmutableList A0A;
    public final ImmutableList A0B;
    public final String A0C;
    public final Set A0D;
    public final boolean A0E;

    public InspirationEffectsModel(N3T n3t) {
        String str = n3t.A0C;
        C1pq.A08("backedUpEffectGallerySelectedCategoryTab", str);
        this.A0C = str;
        this.A01 = n3t.A01;
        this.A00 = n3t.A00;
        ImmutableList immutableList = n3t.A06;
        C1pq.A08("futureTopCategoryModelIds", immutableList);
        this.A06 = immutableList;
        this.A04 = n3t.A04;
        this.A0E = n3t.A0E;
        this.A05 = n3t.A05;
        ImmutableList immutableList2 = n3t.A07;
        C1pq.A08("preCaptureEffectIds", immutableList2);
        this.A07 = immutableList2;
        ImmutableList immutableList3 = n3t.A08;
        C1pq.A08("recentlyUsedModels", immutableList3);
        this.A08 = immutableList3;
        ImmutableList immutableList4 = n3t.A09;
        C1pq.A08("savedEffectIds", immutableList4);
        this.A09 = immutableList4;
        ImmutableList immutableList5 = n3t.A0A;
        C1pq.A08("seenNewEffectIds", immutableList5);
        this.A0A = immutableList5;
        this.A02 = n3t.A02;
        this.A03 = n3t.A03;
        ImmutableList immutableList6 = n3t.A0B;
        C1pq.A08("topCategoryModelIds", immutableList6);
        this.A0B = immutableList6;
        this.A0D = Collections.unmodifiableSet(n3t.A0D);
    }

    public InspirationEffectsModel(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        this.A0C = parcel.readString();
        InspirationEffectWithSource inspirationEffectWithSource = null;
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = (InspirationEffectWithSource) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            this.A00 = EOp.values()[parcel.readInt()];
        }
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        int i = 0;
        int i2 = 0;
        while (i2 < readInt) {
            i2 = AbH.A00(parcel, strArr, i2);
        }
        this.A06 = ImmutableList.copyOf(strArr);
        if (parcel.readInt() == 0) {
            this.A04 = null;
        } else {
            this.A04 = (InspirationInlineEffectsTrayState) parcel.readParcelable(A0e);
        }
        this.A0E = AbN.A1U(parcel);
        if (parcel.readInt() == 0) {
            this.A05 = null;
        } else {
            this.A05 = (PlatformCameraShareConfiguration) PlatformCameraShareConfiguration.CREATOR.createFromParcel(parcel);
        }
        int readInt2 = parcel.readInt();
        String[] strArr2 = new String[readInt2];
        int i3 = 0;
        while (i3 < readInt2) {
            i3 = AbH.A00(parcel, strArr2, i3);
        }
        this.A07 = ImmutableList.copyOf(strArr2);
        int readInt3 = parcel.readInt();
        InspirationEffect[] inspirationEffectArr = new InspirationEffect[readInt3];
        int i4 = 0;
        while (i4 < readInt3) {
            i4 = AbI.A01(parcel, A0e, inspirationEffectArr, i4);
        }
        this.A08 = ImmutableList.copyOf(inspirationEffectArr);
        int readInt4 = parcel.readInt();
        String[] strArr3 = new String[readInt4];
        int i5 = 0;
        while (i5 < readInt4) {
            i5 = AbH.A00(parcel, strArr3, i5);
        }
        this.A09 = ImmutableList.copyOf(strArr3);
        int readInt5 = parcel.readInt();
        String[] strArr4 = new String[readInt5];
        int i6 = 0;
        while (i6 < readInt5) {
            i6 = AbH.A00(parcel, strArr4, i6);
        }
        this.A0A = ImmutableList.copyOf(strArr4);
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = (InspirationEffectWithSource) parcel.readParcelable(A0e);
        }
        this.A03 = parcel.readInt() != 0 ? (InspirationEffectWithSource) parcel.readParcelable(A0e) : inspirationEffectWithSource;
        int readInt6 = parcel.readInt();
        String[] strArr5 = new String[readInt6];
        int i7 = 0;
        while (i7 < readInt6) {
            i7 = AbH.A00(parcel, strArr5, i7);
        }
        this.A0B = ImmutableList.copyOf(strArr5);
        HashSet A0v = AnonymousClass001.A0v();
        int readInt7 = parcel.readInt();
        while (i < readInt7) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A0D = Collections.unmodifiableSet(A0v);
    }

    public InspirationEffectWithSource A00() {
        if (this.A0D.contains("selectedEffectWithSource")) {
            return this.A02;
        }
        if (A0F == null) {
            synchronized (this) {
                if (A0F == null) {
                    A0F = ReV.A00;
                }
            }
        }
        return A0F;
    }

    public InspirationEffectWithSource A01() {
        if (this.A0D.contains("selectedPreCaptureEffect")) {
            return this.A03;
        }
        if (A0G == null) {
            synchronized (this) {
                if (A0G == null) {
                    A0G = ReV.A00;
                }
            }
        }
        return A0G;
    }

    public InspirationInlineEffectsTrayState A02() {
        if (this.A0D.contains("inlineEffectsTrayState")) {
            return this.A04;
        }
        if (A0H == null) {
            synchronized (this) {
                if (A0H == null) {
                    A0H = new InspirationInlineEffectsTrayState(null, ImmutableList.of(), 0, true);
                }
            }
        }
        return A0H;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof InspirationEffectsModel)) {
                return false;
            }
            InspirationEffectsModel inspirationEffectsModel = (InspirationEffectsModel) obj;
            if (!11T.A0O(this.A0C, inspirationEffectsModel.A0C) || !11T.A0O(this.A01, inspirationEffectsModel.A01) || this.A00 != inspirationEffectsModel.A00 || !11T.A0O(this.A06, inspirationEffectsModel.A06) || !11T.A0O(A02(), inspirationEffectsModel.A02()) || this.A0E != inspirationEffectsModel.A0E || !11T.A0O(this.A05, inspirationEffectsModel.A05) || !11T.A0O(this.A07, inspirationEffectsModel.A07) || !11T.A0O(this.A08, inspirationEffectsModel.A08) || !11T.A0O(this.A09, inspirationEffectsModel.A09) || !11T.A0O(this.A0A, inspirationEffectsModel.A0A) || !11T.A0O(A00(), inspirationEffectsModel.A00()) || !11T.A0O(A01(), inspirationEffectsModel.A01()) || !11T.A0O(this.A0B, inspirationEffectsModel.A0B)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A04 = C1pq.A04(this.A01, C1pq.A03(this.A0C));
        return C1pq.A04(this.A0B, C1pq.A04(A01(), C1pq.A04(A00(), C1pq.A04(this.A0A, C1pq.A04(this.A09, C1pq.A04(this.A08, C1pq.A04(this.A07, C1pq.A04(this.A05, C1pq.A02(C1pq.A04(A02(), C1pq.A04(this.A06, (A04 * 31) + C3o5.A03(this.A00))), this.A0E)))))))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A0C);
        C3o5.A0d(parcel, this.A01, i);
        C3o5.A0e(parcel, this.A00);
        1Du A0b = 1BL.A0b(parcel, this.A06);
        while (A0b.hasNext()) {
            C3o5.A0h(parcel, A0b);
        }
        C3o5.A0d(parcel, this.A04, i);
        parcel.writeInt(this.A0E ? 1 : 0);
        PlatformCameraShareConfiguration platformCameraShareConfiguration = this.A05;
        if (platformCameraShareConfiguration == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            platformCameraShareConfiguration.writeToParcel(parcel, i);
        }
        1Du A0b2 = 1BL.A0b(parcel, this.A07);
        while (A0b2.hasNext()) {
            C3o5.A0h(parcel, A0b2);
        }
        1Du A0b3 = 1BL.A0b(parcel, this.A08);
        while (A0b3.hasNext()) {
            parcel.writeParcelable((InspirationEffect) A0b3.next(), i);
        }
        1Du A0b4 = 1BL.A0b(parcel, this.A09);
        while (A0b4.hasNext()) {
            C3o5.A0h(parcel, A0b4);
        }
        1Du A0b5 = 1BL.A0b(parcel, this.A0A);
        while (A0b5.hasNext()) {
            C3o5.A0h(parcel, A0b5);
        }
        C3o5.A0d(parcel, this.A02, i);
        C3o5.A0d(parcel, this.A03, i);
        1Du A0b6 = 1BL.A0b(parcel, this.A0B);
        while (A0b6.hasNext()) {
            C3o5.A0h(parcel, A0b6);
        }
        Iterator A0S = C3o5.A0S(parcel, this.A0D);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
