package com.facebook.ipc.composer.model;

import X.0Q8;
import X.11T;
import X.1BL;
import X.1BM;
import X.1Du;
import X.28Q;
import X.5BB;
import X.AbG;
import X.AbH;
import X.AbJ;
import X.AbL;
import X.AbN;
import X.AbstractC01033pi;
import X.AbstractC11224vw;
import X.AnonymousClass001;
import X.C1pq;
import X.C24b;
import X.C26c;
import X.C27T;
import X.C3o5;
import X.C42h;
import X.C4E6;
import X.C4V6;
import X.DKH;
import X.FKa;
import android.os.Parcel;
import android.os.Parcelable;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.HashMap;
import java.util.Map;

/* loaded from: ComposerDubbingData.class */
public final class ComposerDubbingData implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKa.A00(13);
    public final ImmutableList A00;
    public final ImmutableMap A01;
    public final Boolean A02;
    public final Boolean A03;
    public final Boolean A04;
    public final String A05;

    /* loaded from: ComposerDubbingData$Deserializer.class */
    public class Deserializer extends JsonDeserializer {
        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public /* bridge */ /* synthetic */ Object A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
            Boolean bool = null;
            Boolean bool2 = null;
            Boolean bool3 = null;
            ImmutableMap immutableMap = null;
            ImmutableList immutableList = null;
            String str = null;
            do {
                try {
                    if (abstractC01033pi.A1J() == C42h.A03) {
                        String A1C = AbG.A1C(abstractC01033pi);
                        switch (A1C.hashCode()) {
                            case -897533522:
                                if (A1C.equals("enable_require_review")) {
                                    bool3 = (Boolean) AbstractC11224vw.A02(abstractC01033pi, c27t, Boolean.class);
                                    break;
                                }
                                break;
                            case -95481018:
                                if (A1C.equals("selected_voice_option")) {
                                    str = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                            case 244808463:
                                if (A1C.equals("enable_for_future_reels")) {
                                    bool = (Boolean) AbstractC11224vw.A02(abstractC01033pi, c27t, Boolean.class);
                                    break;
                                }
                                break;
                            case 747380345:
                                if (A1C.equals("extra_data")) {
                                    immutableMap = (ImmutableMap) AbstractC11224vw.A01(abstractC01033pi, c27t, C4E6.A00(C24b.A01(String.class), C24b.A01(String.class)));
                                    break;
                                }
                                break;
                            case 1398498307:
                                if (A1C.equals("enable_lip_sync")) {
                                    bool2 = (Boolean) AbstractC11224vw.A02(abstractC01033pi, c27t, Boolean.class);
                                    break;
                                }
                                break;
                            case 1576566647:
                                if (A1C.equals("selected_languages")) {
                                    immutableList = AbstractC11224vw.A00(abstractC01033pi, c27t, String.class);
                                    break;
                                }
                                break;
                        }
                        abstractC01033pi.A20();
                    }
                } catch (Exception e) {
                    C4V6.A01(abstractC01033pi, ComposerDubbingData.class, e);
                    throw 0Q8.createAndThrow();
                }
            } while (5BB.A00(abstractC01033pi) != C42h.A02);
            return new ComposerDubbingData(immutableList, immutableMap, bool, bool2, bool3, str);
        }
    }

    /* loaded from: ComposerDubbingData$Serializer.class */
    public class Serializer extends JsonSerializer {
        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
            ComposerDubbingData composerDubbingData = (ComposerDubbingData) obj;
            r302.A0b();
            AbstractC11224vw.A08(r302, composerDubbingData.A02, "enable_for_future_reels");
            AbstractC11224vw.A08(r302, composerDubbingData.A03, "enable_lip_sync");
            AbstractC11224vw.A08(r302, composerDubbingData.A04, "enable_require_review");
            AbstractC11224vw.A05(r302, c26c, composerDubbingData.A01, "extra_data");
            AbstractC11224vw.A06(r302, c26c, "selected_languages", composerDubbingData.A00);
            AbstractC11224vw.A0D(r302, "selected_voice_option", composerDubbingData.A05);
            r302.A0Y();
        }
    }

    public ComposerDubbingData(Parcel parcel) {
        int i = 0;
        ImmutableList immutableList = null;
        if (C3o5.A01(parcel, this) == 0) {
            this.A02 = null;
        } else {
            this.A02 = Boolean.valueOf(1BM.A07(parcel));
        }
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = Boolean.valueOf(1BM.A07(parcel));
        }
        if (parcel.readInt() == 0) {
            this.A04 = null;
        } else {
            this.A04 = Boolean.valueOf(AbJ.A1V(parcel));
        }
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            HashMap A0u = AnonymousClass001.A0u();
            int readInt = parcel.readInt();
            int i2 = 0;
            while (i2 < readInt) {
                i2 = AbL.A01(parcel, A0u, i2);
            }
            this.A01 = ImmutableMap.copyOf((Map) A0u);
        }
        if (parcel.readInt() != 0) {
            int readInt2 = parcel.readInt();
            String[] strArr = new String[readInt2];
            while (i < readInt2) {
                i = AbH.A00(parcel, strArr, i);
            }
            immutableList = ImmutableList.copyOf(strArr);
        }
        this.A00 = immutableList;
        this.A05 = C3o5.A0O(parcel);
    }

    public ComposerDubbingData(ImmutableList immutableList, ImmutableMap immutableMap, Boolean bool, Boolean bool2, Boolean bool3, String str) {
        this.A02 = bool;
        this.A03 = bool2;
        this.A04 = bool3;
        this.A01 = immutableMap;
        this.A00 = immutableList;
        this.A05 = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ComposerDubbingData)) {
                return false;
            }
            ComposerDubbingData composerDubbingData = (ComposerDubbingData) obj;
            if (!11T.A0O(this.A02, composerDubbingData.A02) || !11T.A0O(this.A03, composerDubbingData.A03) || !11T.A0O(this.A04, composerDubbingData.A04) || !11T.A0O(this.A01, composerDubbingData.A01) || !11T.A0O(this.A00, composerDubbingData.A00) || !11T.A0O(this.A05, composerDubbingData.A05)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A05, C1pq.A04(this.A00, C1pq.A04(this.A01, C1pq.A04(this.A04, C1pq.A04(this.A03, C1pq.A03(this.A02))))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        AbN.A0s(parcel, this.A02);
        AbN.A0s(parcel, this.A03);
        AbN.A0s(parcel, this.A04);
        ImmutableMap immutableMap = this.A01;
        if (immutableMap == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            1Du A0g = DKH.A0g(parcel, immutableMap);
            while (A0g.hasNext()) {
                AbL.A0n(parcel, A0g);
            }
        }
        ImmutableList immutableList = this.A00;
        if (immutableList == null) {
            parcel.writeInt(0);
        } else {
            1Du A0Y = AbL.A0Y(parcel, immutableList);
            while (A0Y.hasNext()) {
                C3o5.A0h(parcel, A0Y);
            }
        }
        1BL.A13(parcel, this.A05);
    }
}
