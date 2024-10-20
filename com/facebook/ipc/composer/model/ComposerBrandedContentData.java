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
import X.AbI;
import X.AbJ;
import X.AbL;
import X.AbN;
import X.AbstractC01033pi;
import X.AbstractC11224vw;
import X.C1pq;
import X.C26c;
import X.C27T;
import X.C3o5;
import X.C42h;
import X.C4V6;
import X.DKE;
import X.FKa;
import X.MRl;
import android.os.Parcel;
import android.os.Parcelable;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.google.common.collect.ImmutableList;

/* loaded from: ComposerBrandedContentData.class */
public final class ComposerBrandedContentData implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKa.A00(5);
    public final ImmutableList A00;
    public final ImmutableList A01;
    public final Boolean A02;
    public final Boolean A03;
    public final Boolean A04;
    public final Integer A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;

    /* loaded from: ComposerBrandedContentData$Deserializer.class */
    public class Deserializer extends JsonDeserializer {
        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public /* bridge */ /* synthetic */ Object A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
            String str = null;
            Boolean bool = null;
            Boolean bool2 = null;
            Boolean bool3 = null;
            Integer num = null;
            ImmutableList immutableList = null;
            ImmutableList immutableList2 = null;
            String str2 = null;
            String str3 = "";
            String str4 = str3;
            String str5 = str3;
            do {
                try {
                    if (abstractC01033pi.A1J() == C42h.A03) {
                        String A1C = AbG.A1C(abstractC01033pi);
                        switch (A1C.hashCode()) {
                            case -1927528099:
                                if (A1C.equals("enable_partner_cta")) {
                                    bool3 = (Boolean) AbstractC11224vw.A02(abstractC01033pi, c27t, Boolean.class);
                                    break;
                                }
                                break;
                            case -1676885872:
                                if (A1C.equals("sponsor_name")) {
                                    str5 = AbstractC11224vw.A03(abstractC01033pi);
                                    C1pq.A08("sponsorName", str5);
                                    break;
                                }
                                break;
                            case -636869816:
                                if (A1C.equals("sponsor_subtext")) {
                                    str2 = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                            case -570621553:
                                if (A1C.equals("agency_insights_sharing_auth_token")) {
                                    str = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                            case -427335994:
                                if (A1C.equals("enable_audience_restrictions")) {
                                    bool = (Boolean) AbstractC11224vw.A02(abstractC01033pi, c27t, Boolean.class);
                                    break;
                                }
                                break;
                            case -131466334:
                                if (A1C.equals("post_restriction_countries")) {
                                    immutableList = MRl.A0G(abstractC01033pi, c27t);
                                    break;
                                }
                                break;
                            case -72975251:
                                if (A1C.equals("post_restriction_regions")) {
                                    immutableList2 = AbstractC11224vw.A00(abstractC01033pi, c27t, Integer.class);
                                    break;
                                }
                                break;
                            case 722276448:
                                if (A1C.equals("sponsor_id")) {
                                    str3 = AbstractC11224vw.A03(abstractC01033pi);
                                    C1pq.A08("sponsorId", str3);
                                    break;
                                }
                                break;
                            case 725101990:
                                if (A1C.equals("sponsor_image_url")) {
                                    str4 = AbstractC11224vw.A03(abstractC01033pi);
                                    C1pq.A08("sponsorImageUrl", str4);
                                    break;
                                }
                                break;
                            case 862626925:
                                if (A1C.equals("post_restriction_age")) {
                                    num = (Integer) AbstractC11224vw.A02(abstractC01033pi, c27t, Integer.class);
                                    break;
                                }
                                break;
                            case 2082829874:
                                if (A1C.equals("enable_partner_boosting")) {
                                    bool2 = (Boolean) AbstractC11224vw.A02(abstractC01033pi, c27t, Boolean.class);
                                    break;
                                }
                                break;
                        }
                        abstractC01033pi.A20();
                    }
                } catch (Exception e) {
                    C4V6.A01(abstractC01033pi, ComposerBrandedContentData.class, e);
                    throw 0Q8.createAndThrow();
                }
            } while (5BB.A00(abstractC01033pi) != C42h.A02);
            return new ComposerBrandedContentData(immutableList, immutableList2, bool, bool2, bool3, num, str, str3, str4, str5, str2);
        }
    }

    /* loaded from: ComposerBrandedContentData$Serializer.class */
    public class Serializer extends JsonSerializer {
        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
            ComposerBrandedContentData composerBrandedContentData = (ComposerBrandedContentData) obj;
            r302.A0b();
            AbstractC11224vw.A0D(r302, "agency_insights_sharing_auth_token", composerBrandedContentData.A06);
            AbstractC11224vw.A08(r302, composerBrandedContentData.A02, "enable_audience_restrictions");
            AbstractC11224vw.A08(r302, composerBrandedContentData.A03, "enable_partner_boosting");
            AbstractC11224vw.A08(r302, composerBrandedContentData.A04, "enable_partner_cta");
            AbstractC11224vw.A0B(r302, composerBrandedContentData.A05, "post_restriction_age");
            AbstractC11224vw.A06(r302, c26c, "post_restriction_countries", composerBrandedContentData.A00);
            AbstractC11224vw.A06(r302, c26c, "post_restriction_regions", composerBrandedContentData.A01);
            AbstractC11224vw.A0D(r302, "sponsor_id", composerBrandedContentData.A07);
            AbstractC11224vw.A0D(r302, "sponsor_image_url", composerBrandedContentData.A08);
            AbstractC11224vw.A0D(r302, "sponsor_name", composerBrandedContentData.A09);
            AbstractC11224vw.A0D(r302, "sponsor_subtext", composerBrandedContentData.A0A);
            r302.A0Y();
        }
    }

    public ComposerBrandedContentData(Parcel parcel) {
        ImmutableList immutableList = null;
        if (C3o5.A01(parcel, this) == 0) {
            this.A06 = null;
        } else {
            this.A06 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
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
            this.A05 = null;
        } else {
            this.A05 = AbI.A0z(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            int readInt = parcel.readInt();
            String[] strArr = new String[readInt];
            int i = 0;
            while (i < readInt) {
                i = AbH.A00(parcel, strArr, i);
            }
            this.A00 = ImmutableList.copyOf(strArr);
        }
        if (parcel.readInt() != 0) {
            int readInt2 = parcel.readInt();
            Integer[] numArr = new Integer[readInt2];
            for (int i2 = 0; i2 < readInt2; i2++) {
                numArr[i2] = AbI.A0z(parcel);
            }
            immutableList = ImmutableList.copyOf(numArr);
        }
        this.A01 = immutableList;
        this.A07 = parcel.readString();
        this.A08 = parcel.readString();
        this.A09 = parcel.readString();
        this.A0A = C3o5.A0O(parcel);
    }

    public ComposerBrandedContentData(ImmutableList immutableList, ImmutableList immutableList2, Boolean bool, Boolean bool2, Boolean bool3, Integer num, String str, String str2, String str3, String str4, String str5) {
        this.A06 = str;
        this.A02 = bool;
        this.A03 = bool2;
        this.A04 = bool3;
        this.A05 = num;
        this.A00 = immutableList;
        this.A01 = immutableList2;
        C1pq.A08("sponsorId", str2);
        this.A07 = str2;
        C1pq.A08("sponsorImageUrl", str3);
        this.A08 = str3;
        C1pq.A08("sponsorName", str4);
        this.A09 = str4;
        this.A0A = str5;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ComposerBrandedContentData)) {
                return false;
            }
            ComposerBrandedContentData composerBrandedContentData = (ComposerBrandedContentData) obj;
            if (!11T.A0O(this.A06, composerBrandedContentData.A06) || !11T.A0O(this.A02, composerBrandedContentData.A02) || !11T.A0O(this.A03, composerBrandedContentData.A03) || !11T.A0O(this.A04, composerBrandedContentData.A04) || !11T.A0O(this.A05, composerBrandedContentData.A05) || !11T.A0O(this.A00, composerBrandedContentData.A00) || !11T.A0O(this.A01, composerBrandedContentData.A01) || !11T.A0O(this.A07, composerBrandedContentData.A07) || !11T.A0O(this.A08, composerBrandedContentData.A08) || !11T.A0O(this.A09, composerBrandedContentData.A09) || !11T.A0O(this.A0A, composerBrandedContentData.A0A)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A0A, C1pq.A04(this.A09, C1pq.A04(this.A08, C1pq.A04(this.A07, C1pq.A04(this.A01, C1pq.A04(this.A00, C1pq.A04(this.A05, C1pq.A04(this.A04, C1pq.A04(this.A03, C1pq.A04(this.A02, C1pq.A03(this.A06)))))))))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1BL.A13(parcel, this.A06);
        AbN.A0s(parcel, this.A02);
        AbN.A0s(parcel, this.A03);
        AbN.A0s(parcel, this.A04);
        C3o5.A0f(parcel, this.A05);
        ImmutableList immutableList = this.A00;
        if (immutableList == null) {
            parcel.writeInt(0);
        } else {
            1Du A0Y = AbL.A0Y(parcel, immutableList);
            while (A0Y.hasNext()) {
                C3o5.A0h(parcel, A0Y);
            }
        }
        ImmutableList immutableList2 = this.A01;
        if (immutableList2 == null) {
            parcel.writeInt(0);
        } else {
            1Du A0Y2 = AbL.A0Y(parcel, immutableList2);
            while (A0Y2.hasNext()) {
                parcel.writeInt(DKE.A0F(A0Y2));
            }
        }
        parcel.writeString(this.A07);
        parcel.writeString(this.A08);
        parcel.writeString(this.A09);
        1BL.A13(parcel, this.A0A);
    }
}
