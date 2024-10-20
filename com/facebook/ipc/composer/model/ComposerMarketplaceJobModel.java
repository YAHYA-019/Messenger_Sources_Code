package com.facebook.ipc.composer.model;

import X.0Q8;
import X.11T;
import X.1BL;
import X.1Du;
import X.28Q;
import X.5BB;
import X.AbG;
import X.AbH;
import X.AbL;
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
import X.MRl;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.location.platform.api.Location;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.google.common.collect.ImmutableList;

/* loaded from: ComposerMarketplaceJobModel.class */
public final class ComposerMarketplaceJobModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKa.A00(42);
    public final ImmutableList A00;
    public final ImmutableList A01;
    public final Double A02;
    public final Double A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final String A0I;
    public final String A0J;

    /* loaded from: ComposerMarketplaceJobModel$Deserializer.class */
    public class Deserializer extends JsonDeserializer {
        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public /* bridge */ /* synthetic */ Object A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            Double d = null;
            String str6 = null;
            String str7 = null;
            Double d2 = null;
            String str8 = null;
            String str9 = null;
            ImmutableList immutableList = null;
            ImmutableList immutableList2 = null;
            String str10 = null;
            String str11 = null;
            String str12 = null;
            String str13 = null;
            String str14 = null;
            String str15 = null;
            String str16 = "";
            do {
                try {
                    if (abstractC01033pi.A1J() == C42h.A03) {
                        String A1C = AbG.A1C(abstractC01033pi);
                        switch (A1C.hashCode()) {
                            case -1853231955:
                                if (A1C.equals("surface")) {
                                    str16 = AbstractC11224vw.A03(abstractC01033pi);
                                    C1pq.A08("surface", str16);
                                    break;
                                }
                                break;
                            case -1796591228:
                                if (A1C.equals("location_type")) {
                                    str7 = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                            case -1615559507:
                                if (A1C.equals("job_city")) {
                                    str4 = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                            case -1439978388:
                                if (A1C.equals(Location.LATITUDE)) {
                                    d = (Double) AbstractC11224vw.A02(abstractC01033pi, c27t, Double.class);
                                    break;
                                }
                                break;
                            case -1368013067:
                                if (A1C.equals("min_wage")) {
                                    str9 = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                            case -1106897928:
                                if (A1C.equals("location_display_string")) {
                                    str6 = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                            case -790957754:
                                if (A1C.equals("virtual_job_category_id")) {
                                    str12 = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                            case -512355769:
                                if (A1C.equals("contract_type")) {
                                    str = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                            case -507922926:
                                if (A1C.equals("photo_i_ds")) {
                                    immutableList = MRl.A0G(abstractC01033pi, c27t);
                                    break;
                                }
                                break;
                            case 21980740:
                                if (A1C.equals("full_address")) {
                                    str3 = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                            case 110371416:
                                if (A1C.equals("title")) {
                                    str11 = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                            case 137365935:
                                if (A1C.equals("longitude")) {
                                    d2 = (Double) AbstractC11224vw.A02(abstractC01033pi, c27t, Double.class);
                                    break;
                                }
                                break;
                            case 408183587:
                                if (A1C.equals("max_wage")) {
                                    str8 = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                            case 507156368:
                                if (A1C.equals("description_text")) {
                                    str2 = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                            case 935655099:
                                if (A1C.equals("referral_u_i_component")) {
                                    str10 = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                            case 971398472:
                                if (A1C.equals("wage_currency")) {
                                    str13 = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                            case 1116614641:
                                if (A1C.equals("wage_type")) {
                                    str15 = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                            case 1252306469:
                                if (A1C.equals("wage_display_string")) {
                                    str14 = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                            case 1472348559:
                                if (A1C.equals("job_state")) {
                                    str5 = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                            case 1856290894:
                                if (A1C.equals("photo_u_r_is")) {
                                    immutableList2 = MRl.A0G(abstractC01033pi, c27t);
                                    break;
                                }
                                break;
                        }
                        abstractC01033pi.A20();
                    }
                } catch (Exception e) {
                    C4V6.A01(abstractC01033pi, ComposerMarketplaceJobModel.class, e);
                    throw 0Q8.createAndThrow();
                }
            } while (5BB.A00(abstractC01033pi) != C42h.A02);
            return new ComposerMarketplaceJobModel(immutableList, immutableList2, d, d2, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str16, str11, str12, str13, str14, str15);
        }
    }

    /* loaded from: ComposerMarketplaceJobModel$Serializer.class */
    public class Serializer extends JsonSerializer {
        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
            ComposerMarketplaceJobModel composerMarketplaceJobModel = (ComposerMarketplaceJobModel) obj;
            r302.A0b();
            AbstractC11224vw.A0D(r302, "contract_type", composerMarketplaceJobModel.A04);
            AbstractC11224vw.A0D(r302, "description_text", composerMarketplaceJobModel.A05);
            AbstractC11224vw.A0D(r302, "full_address", composerMarketplaceJobModel.A06);
            AbstractC11224vw.A0D(r302, "job_city", composerMarketplaceJobModel.A07);
            AbstractC11224vw.A0D(r302, "job_state", composerMarketplaceJobModel.A08);
            AbstractC11224vw.A09(r302, composerMarketplaceJobModel.A02, Location.LATITUDE);
            AbstractC11224vw.A0D(r302, "location_display_string", composerMarketplaceJobModel.A09);
            AbstractC11224vw.A0D(r302, "location_type", composerMarketplaceJobModel.A0A);
            AbstractC11224vw.A09(r302, composerMarketplaceJobModel.A03, "longitude");
            AbstractC11224vw.A0D(r302, "max_wage", composerMarketplaceJobModel.A0B);
            AbstractC11224vw.A0D(r302, "min_wage", composerMarketplaceJobModel.A0C);
            AbstractC11224vw.A06(r302, c26c, "photo_i_ds", composerMarketplaceJobModel.A00);
            AbstractC11224vw.A06(r302, c26c, "photo_u_r_is", composerMarketplaceJobModel.A01);
            AbstractC11224vw.A0D(r302, "referral_u_i_component", composerMarketplaceJobModel.A0D);
            AbstractC11224vw.A0D(r302, "surface", composerMarketplaceJobModel.A0E);
            AbstractC11224vw.A0D(r302, "title", composerMarketplaceJobModel.A0F);
            AbstractC11224vw.A0D(r302, "virtual_job_category_id", composerMarketplaceJobModel.A0G);
            AbstractC11224vw.A0D(r302, "wage_currency", composerMarketplaceJobModel.A0H);
            AbstractC11224vw.A0D(r302, "wage_display_string", composerMarketplaceJobModel.A0I);
            AbstractC11224vw.A0D(r302, "wage_type", composerMarketplaceJobModel.A0J);
            r302.A0Y();
        }
    }

    public ComposerMarketplaceJobModel(Parcel parcel) {
        String str = null;
        if (C3o5.A01(parcel, this) == 0) {
            this.A04 = null;
        } else {
            this.A04 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A05 = null;
        } else {
            this.A05 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A06 = null;
        } else {
            this.A06 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A07 = null;
        } else {
            this.A07 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A08 = null;
        } else {
            this.A08 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = Double.valueOf(parcel.readDouble());
        }
        if (parcel.readInt() == 0) {
            this.A09 = null;
        } else {
            this.A09 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0A = null;
        } else {
            this.A0A = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = Double.valueOf(parcel.readDouble());
        }
        if (parcel.readInt() == 0) {
            this.A0B = null;
        } else {
            this.A0B = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0C = null;
        } else {
            this.A0C = parcel.readString();
        }
        int i = 0;
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            int readInt = parcel.readInt();
            String[] strArr = new String[readInt];
            int i2 = 0;
            while (i2 < readInt) {
                i2 = AbH.A00(parcel, strArr, i2);
            }
            this.A00 = ImmutableList.copyOf(strArr);
        }
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            int readInt2 = parcel.readInt();
            String[] strArr2 = new String[readInt2];
            while (i < readInt2) {
                i = AbH.A00(parcel, strArr2, i);
            }
            this.A01 = ImmutableList.copyOf(strArr2);
        }
        if (parcel.readInt() == 0) {
            this.A0D = null;
        } else {
            this.A0D = parcel.readString();
        }
        this.A0E = parcel.readString();
        if (parcel.readInt() == 0) {
            this.A0F = null;
        } else {
            this.A0F = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0G = null;
        } else {
            this.A0G = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0H = null;
        } else {
            this.A0H = parcel.readString();
        }
        this.A0I = parcel.readInt() != 0 ? parcel.readString() : str;
        this.A0J = C3o5.A0O(parcel);
    }

    public ComposerMarketplaceJobModel(ImmutableList immutableList, ImmutableList immutableList2, Double d, Double d2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16) {
        this.A04 = str;
        this.A05 = str2;
        this.A06 = str3;
        this.A07 = str4;
        this.A08 = str5;
        this.A02 = d;
        this.A09 = str6;
        this.A0A = str7;
        this.A03 = d2;
        this.A0B = str8;
        this.A0C = str9;
        this.A00 = immutableList;
        this.A01 = immutableList2;
        this.A0D = str10;
        C1pq.A08("surface", str11);
        this.A0E = str11;
        this.A0F = str12;
        this.A0G = str13;
        this.A0H = str14;
        this.A0I = str15;
        this.A0J = str16;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ComposerMarketplaceJobModel)) {
                return false;
            }
            ComposerMarketplaceJobModel composerMarketplaceJobModel = (ComposerMarketplaceJobModel) obj;
            if (!11T.A0O(this.A04, composerMarketplaceJobModel.A04) || !11T.A0O(this.A05, composerMarketplaceJobModel.A05) || !11T.A0O(this.A06, composerMarketplaceJobModel.A06) || !11T.A0O(this.A07, composerMarketplaceJobModel.A07) || !11T.A0O(this.A08, composerMarketplaceJobModel.A08) || !11T.A0O(this.A02, composerMarketplaceJobModel.A02) || !11T.A0O(this.A09, composerMarketplaceJobModel.A09) || !11T.A0O(this.A0A, composerMarketplaceJobModel.A0A) || !11T.A0O(this.A03, composerMarketplaceJobModel.A03) || !11T.A0O(this.A0B, composerMarketplaceJobModel.A0B) || !11T.A0O(this.A0C, composerMarketplaceJobModel.A0C) || !11T.A0O(this.A00, composerMarketplaceJobModel.A00) || !11T.A0O(this.A01, composerMarketplaceJobModel.A01) || !11T.A0O(this.A0D, composerMarketplaceJobModel.A0D) || !11T.A0O(this.A0E, composerMarketplaceJobModel.A0E) || !11T.A0O(this.A0F, composerMarketplaceJobModel.A0F) || !11T.A0O(this.A0G, composerMarketplaceJobModel.A0G) || !11T.A0O(this.A0H, composerMarketplaceJobModel.A0H) || !11T.A0O(this.A0I, composerMarketplaceJobModel.A0I) || !11T.A0O(this.A0J, composerMarketplaceJobModel.A0J)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A0J, C1pq.A04(this.A0I, C1pq.A04(this.A0H, C1pq.A04(this.A0G, C1pq.A04(this.A0F, C1pq.A04(this.A0E, C1pq.A04(this.A0D, C1pq.A04(this.A01, C1pq.A04(this.A00, C1pq.A04(this.A0C, C1pq.A04(this.A0B, C1pq.A04(this.A03, C1pq.A04(this.A0A, C1pq.A04(this.A09, C1pq.A04(this.A02, C1pq.A04(this.A08, C1pq.A04(this.A07, C1pq.A04(this.A06, C1pq.A04(this.A05, C1pq.A03(this.A04))))))))))))))))))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1BL.A13(parcel, this.A04);
        1BL.A13(parcel, this.A05);
        1BL.A13(parcel, this.A06);
        1BL.A13(parcel, this.A07);
        1BL.A13(parcel, this.A08);
        DKH.A13(parcel, this.A02);
        1BL.A13(parcel, this.A09);
        1BL.A13(parcel, this.A0A);
        DKH.A13(parcel, this.A03);
        1BL.A13(parcel, this.A0B);
        1BL.A13(parcel, this.A0C);
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
                C3o5.A0h(parcel, A0Y2);
            }
        }
        1BL.A13(parcel, this.A0D);
        parcel.writeString(this.A0E);
        1BL.A13(parcel, this.A0F);
        1BL.A13(parcel, this.A0G);
        1BL.A13(parcel, this.A0H);
        1BL.A13(parcel, this.A0I);
        1BL.A13(parcel, this.A0J);
    }
}
