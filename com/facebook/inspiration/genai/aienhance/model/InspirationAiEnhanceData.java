package com.facebook.inspiration.genai.aienhance.model;

import X.0Q8;
import X.11T;
import X.28Q;
import X.5BB;
import X.AbG;
import X.AbJ;
import X.AbstractC01033pi;
import X.AbstractC11224vw;
import X.AnonymousClass001;
import X.C1pq;
import X.C26c;
import X.C27T;
import X.C3o5;
import X.C42h;
import X.C4V6;
import X.DKF;
import X.DKG;
import X.DKH;
import X.EnumC3483Mf1;
import X.EnumC3494Mfp;
import X.FKf;
import X.N2l;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ipc.media.data.MediaData;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: InspirationAiEnhanceData.class */
public final class InspirationAiEnhanceData implements Parcelable {
    public static volatile EnumC3494Mfp A07;
    public static volatile EnumC3483Mf1 A08;
    public static final Parcelable.Creator CREATOR = new FKf(35);
    public final EnumC3494Mfp A00;
    public final EnumC3483Mf1 A01;
    public final MediaData A02;
    public final MediaData A03;
    public final Set A04;
    public final boolean A05;
    public final boolean A06;

    /* loaded from: InspirationAiEnhanceData$Deserializer.class */
    public class Deserializer extends JsonDeserializer {
        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public /* bridge */ /* synthetic */ Object A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
            N2l n2l = new N2l();
            do {
                try {
                    if (abstractC01033pi.A1J() == C42h.A03) {
                        String A1C = AbG.A1C(abstractC01033pi);
                        switch (A1C.hashCode()) {
                            case -2046308589:
                                if (A1C.equals("is_auto_apply")) {
                                    n2l.A05 = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case -1603016872:
                                if (A1C.equals("cached_enhanced_composer_media_data")) {
                                    n2l.A03 = (MediaData) AbstractC11224vw.A02(abstractC01033pi, c27t, MediaData.class);
                                    break;
                                }
                                break;
                            case -1438730841:
                                if (A1C.equals("backup_composer_media_data")) {
                                    n2l.A02 = (MediaData) AbstractC11224vw.A02(abstractC01033pi, c27t, MediaData.class);
                                    break;
                                }
                                break;
                            case -630724115:
                                if (A1C.equals("enhance_data_state")) {
                                    n2l.A01((EnumC3483Mf1) AbstractC11224vw.A02(abstractC01033pi, c27t, EnumC3483Mf1.class));
                                    break;
                                }
                                break;
                            case -289500411:
                                if (A1C.equals("is_enhance_applicable")) {
                                    n2l.A06 = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case 658202158:
                                if (A1C.equals("selection_source")) {
                                    n2l.A00((EnumC3494Mfp) AbstractC11224vw.A02(abstractC01033pi, c27t, EnumC3494Mfp.class));
                                    break;
                                }
                                break;
                        }
                        abstractC01033pi.A20();
                    }
                } catch (Exception e) {
                    C4V6.A01(abstractC01033pi, InspirationAiEnhanceData.class, e);
                    throw 0Q8.createAndThrow();
                }
            } while (5BB.A00(abstractC01033pi) != C42h.A02);
            return new InspirationAiEnhanceData(n2l);
        }
    }

    /* loaded from: InspirationAiEnhanceData$Serializer.class */
    public class Serializer extends JsonSerializer {
        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
            InspirationAiEnhanceData inspirationAiEnhanceData = (InspirationAiEnhanceData) obj;
            r302.A0b();
            AbstractC11224vw.A05(r302, c26c, inspirationAiEnhanceData.A02, "backup_composer_media_data");
            AbstractC11224vw.A05(r302, c26c, inspirationAiEnhanceData.A03, "cached_enhanced_composer_media_data");
            AbstractC11224vw.A05(r302, c26c, inspirationAiEnhanceData.A02(), "enhance_data_state");
            boolean z = inspirationAiEnhanceData.A05;
            r302.A0o("is_auto_apply");
            r302.A0v(z);
            boolean z2 = inspirationAiEnhanceData.A06;
            r302.A0o("is_enhance_applicable");
            r302.A0v(z2);
            AbstractC11224vw.A05(r302, c26c, inspirationAiEnhanceData.A01(), "selection_source");
            r302.A0Y();
        }
    }

    public InspirationAiEnhanceData(N2l n2l) {
        this.A02 = n2l.A02;
        this.A03 = n2l.A03;
        this.A01 = n2l.A01;
        this.A05 = n2l.A05;
        this.A06 = n2l.A06;
        this.A00 = n2l.A00;
        this.A04 = Collections.unmodifiableSet(n2l.A04);
    }

    public InspirationAiEnhanceData(Parcel parcel) {
        EnumC3494Mfp enumC3494Mfp = null;
        if (C3o5.A01(parcel, this) == 0) {
            this.A02 = null;
        } else {
            this.A02 = DKG.A0Y(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = DKG.A0Y(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = EnumC3483Mf1.values()[parcel.readInt()];
        }
        int i = 0;
        this.A05 = AnonymousClass001.A1Q(parcel.readInt(), 1);
        this.A06 = AbJ.A1V(parcel);
        this.A00 = parcel.readInt() != 0 ? EnumC3494Mfp.values()[parcel.readInt()] : enumC3494Mfp;
        HashSet A0v = AnonymousClass001.A0v();
        int readInt = parcel.readInt();
        while (i < readInt) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A04 = Collections.unmodifiableSet(A0v);
    }

    public static N2l A00(InspirationAiEnhanceData inspirationAiEnhanceData) {
        return inspirationAiEnhanceData != null ? new N2l(inspirationAiEnhanceData) : new N2l();
    }

    public EnumC3494Mfp A01() {
        if (this.A04.contains("selectionSource")) {
            return this.A00;
        }
        if (A07 == null) {
            synchronized (this) {
                if (A07 == null) {
                    A07 = EnumC3494Mfp.UNKNOWN;
                }
            }
        }
        return A07;
    }

    public EnumC3483Mf1 A02() {
        if (this.A04.contains("enhanceDataState")) {
            return this.A01;
        }
        if (A08 == null) {
            synchronized (this) {
                if (A08 == null) {
                    A08 = EnumC3483Mf1.A04;
                }
            }
        }
        return A08;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof InspirationAiEnhanceData)) {
                return false;
            }
            InspirationAiEnhanceData inspirationAiEnhanceData = (InspirationAiEnhanceData) obj;
            if (!11T.A0O(this.A02, inspirationAiEnhanceData.A02) || !11T.A0O(this.A03, inspirationAiEnhanceData.A03) || A02() != inspirationAiEnhanceData.A02() || this.A05 != inspirationAiEnhanceData.A05 || this.A06 != inspirationAiEnhanceData.A06 || A01() != inspirationAiEnhanceData.A01()) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A04 = C1pq.A04(this.A03, C1pq.A03(this.A02));
        int A02 = C1pq.A02(C1pq.A02((A04 * 31) + C3o5.A03(A02()), this.A05), this.A06);
        return (A02 * 31) + DKF.A04(A01());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        DKH.A10(parcel, this.A02, i);
        DKH.A10(parcel, this.A03, i);
        C3o5.A0e(parcel, this.A01);
        parcel.writeInt(this.A05 ? 1 : 0);
        parcel.writeInt(this.A06 ? 1 : 0);
        C3o5.A0e(parcel, this.A00);
        Iterator A0S = C3o5.A0S(parcel, this.A04);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
