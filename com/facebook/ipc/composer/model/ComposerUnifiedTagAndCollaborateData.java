package com.facebook.ipc.composer.model;

import X.0Q8;
import X.11T;
import X.1BL;
import X.1Du;
import X.28Q;
import X.4YW;
import X.5BB;
import X.AbG;
import X.AbH;
import X.AbN;
import X.AbstractC01033pi;
import X.AbstractC11224vw;
import X.C1pq;
import X.C26c;
import X.C27T;
import X.C3o5;
import X.C42h;
import X.C4V6;
import X.DKH;
import X.FKa;
import android.os.Parcel;
import android.os.Parcelable;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.google.common.collect.ImmutableList;

/* loaded from: ComposerUnifiedTagAndCollaborateData.class */
public final class ComposerUnifiedTagAndCollaborateData implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKa.A00(74);
    public final ImmutableList A00;
    public final ImmutableList A01;
    public final String A02;
    public final boolean A03;

    /* loaded from: ComposerUnifiedTagAndCollaborateData$Deserializer.class */
    public class Deserializer extends JsonDeserializer {
        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public /* bridge */ /* synthetic */ Object A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
            boolean z = false;
            String str = null;
            ImmutableList of = ImmutableList.of();
            ImmutableList of2 = ImmutableList.of();
            do {
                try {
                    if (abstractC01033pi.A1J() == C42h.A03) {
                        String A1C = AbG.A1C(abstractC01033pi);
                        switch (A1C.hashCode()) {
                            case -1841510295:
                                if (A1C.equals("collaborator_profile_ids")) {
                                    of = AbstractC11224vw.A00(abstractC01033pi, c27t, String.class);
                                    C1pq.A08("collaboratorProfileIds", of);
                                    break;
                                }
                                break;
                            case -1551154155:
                                if (A1C.equals("is_unified_tag_and_collaborate_enabled")) {
                                    z = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case -1196990257:
                                if (A1C.equals("tagged_profile_ids")) {
                                    of2 = AbstractC11224vw.A00(abstractC01033pi, c27t, String.class);
                                    C1pq.A08("taggedProfileIds", of2);
                                    break;
                                }
                                break;
                            case 347691159:
                                if (A1C.equals("sharesheet_subtitle")) {
                                    str = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                        }
                        abstractC01033pi.A20();
                    }
                } catch (Exception e) {
                    C4V6.A01(abstractC01033pi, ComposerUnifiedTagAndCollaborateData.class, e);
                    throw 0Q8.createAndThrow();
                }
            } while (5BB.A00(abstractC01033pi) != C42h.A02);
            return new ComposerUnifiedTagAndCollaborateData(of, of2, str, z);
        }
    }

    /* loaded from: ComposerUnifiedTagAndCollaborateData$Serializer.class */
    public class Serializer extends JsonSerializer {
        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
            ComposerUnifiedTagAndCollaborateData composerUnifiedTagAndCollaborateData = (ComposerUnifiedTagAndCollaborateData) obj;
            r302.A0b();
            AbstractC11224vw.A06(r302, c26c, "collaborator_profile_ids", composerUnifiedTagAndCollaborateData.A00);
            boolean z = composerUnifiedTagAndCollaborateData.A03;
            r302.A0o("is_unified_tag_and_collaborate_enabled");
            r302.A0v(z);
            AbstractC11224vw.A0D(r302, "sharesheet_subtitle", composerUnifiedTagAndCollaborateData.A02);
            AbstractC11224vw.A06(r302, c26c, "tagged_profile_ids", composerUnifiedTagAndCollaborateData.A01);
            r302.A0Y();
        }
    }

    public ComposerUnifiedTagAndCollaborateData(Parcel parcel) {
        int A01 = C3o5.A01(parcel, this);
        String[] strArr = new String[A01];
        int i = 0;
        int i2 = 0;
        while (i2 < A01) {
            i2 = AbH.A00(parcel, strArr, i2);
        }
        this.A00 = ImmutableList.copyOf(strArr);
        this.A03 = AbN.A1U(parcel);
        this.A02 = DKH.A0l(parcel);
        int readInt = parcel.readInt();
        String[] strArr2 = new String[readInt];
        while (i < readInt) {
            i = AbH.A00(parcel, strArr2, i);
        }
        this.A01 = ImmutableList.copyOf(strArr2);
    }

    public ComposerUnifiedTagAndCollaborateData(ImmutableList immutableList, ImmutableList immutableList2, String str, boolean z) {
        C1pq.A08("collaboratorProfileIds", immutableList);
        this.A00 = immutableList;
        this.A03 = z;
        this.A02 = str;
        C1pq.A08("taggedProfileIds", immutableList2);
        this.A01 = immutableList2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ComposerUnifiedTagAndCollaborateData)) {
                return false;
            }
            ComposerUnifiedTagAndCollaborateData composerUnifiedTagAndCollaborateData = (ComposerUnifiedTagAndCollaborateData) obj;
            if (!11T.A0O(this.A00, composerUnifiedTagAndCollaborateData.A00) || this.A03 != composerUnifiedTagAndCollaborateData.A03 || !11T.A0O(this.A02, composerUnifiedTagAndCollaborateData.A02) || !11T.A0O(this.A01, composerUnifiedTagAndCollaborateData.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A01, C1pq.A04(this.A02, C1pq.A02(C1pq.A03(this.A00), this.A03)));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1Du A0b = 1BL.A0b(parcel, this.A00);
        while (A0b.hasNext()) {
            C3o5.A0h(parcel, A0b);
        }
        parcel.writeInt(this.A03 ? 1 : 0);
        4YW.A0E(parcel, this.A02);
        1Du A0b2 = 1BL.A0b(parcel, this.A01);
        while (A0b2.hasNext()) {
            C3o5.A0h(parcel, A0b2);
        }
    }
}
