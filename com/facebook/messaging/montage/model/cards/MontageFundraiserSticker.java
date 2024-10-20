package com.facebook.messaging.montage.model.cards;

import X.0Q8;
import X.11T;
import X.1BL;
import X.28Q;
import X.4YV;
import X.5BB;
import X.AbF;
import X.AbG;
import X.AbstractC01033pi;
import X.AbstractC11224vw;
import X.AnonymousClass001;
import X.C1pq;
import X.C26c;
import X.C27T;
import X.C3o5;
import X.C42h;
import X.C4V6;
import X.CST;
import X.GOp;
import X.HqX;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: MontageFundraiserSticker.class */
public final class MontageFundraiserSticker implements Parcelable {
    public static volatile MontageStickerOverlayBounds A0C;
    public static final Parcelable.Creator CREATOR = CST.A00(14);
    public final double A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final MontageStickerOverlayBounds A0A;
    public final Set A0B;

    /* loaded from: MontageFundraiserSticker$Deserializer.class */
    public class Deserializer extends JsonDeserializer {
        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public /* bridge */ /* synthetic */ Object A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
            HqX hqX = new HqX();
            do {
                try {
                    if (abstractC01033pi.A1J() == C42h.A03) {
                        String A1C = AbG.A1C(abstractC01033pi);
                        switch (A1C.hashCode()) {
                            case -2077350418:
                                if (A1C.equals("fundraiser_type")) {
                                    hqX.A07 = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                            case -1304921495:
                                if (A1C.equals("campaign_title")) {
                                    hqX.A04 = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                            case -832833298:
                                if (A1C.equals("montage_sticker_overlay_bounds")) {
                                    hqX.A00((MontageStickerOverlayBounds) AbstractC11224vw.A02(abstractC01033pi, c27t, MontageStickerOverlayBounds.class));
                                    break;
                                }
                                break;
                            case -60537909:
                                if (A1C.equals("fundraiser_progress_text")) {
                                    hqX.A05 = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                            case 3355:
                                if (A1C.equals(PublicKeyCredentialControllerUtility.JSON_KEY_ID)) {
                                    String A03 = AbstractC11224vw.A03(abstractC01033pi);
                                    hqX.A08 = A03;
                                    C1pq.A08(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A03);
                                    break;
                                }
                                break;
                            case 109780401:
                                if (A1C.equals("style")) {
                                    hqX.A0A = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                            case 506959956:
                                if (A1C.equals("beneficiary_type")) {
                                    hqX.A03 = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                            case 557119639:
                                if (A1C.equals("owner_name")) {
                                    hqX.A09 = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                            case 874230974:
                                if (A1C.equals("beneficiary_profile_picture_url")) {
                                    hqX.A02 = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                            case 1022072288:
                                if (A1C.equals("percent_goal_reached")) {
                                    hqX.A00 = abstractC01033pi.A11();
                                    break;
                                }
                                break;
                            case 1074807569:
                                if (A1C.equals("fundraiser_sticker_id")) {
                                    hqX.A06 = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                        }
                        abstractC01033pi.A20();
                    }
                } catch (Exception e) {
                    C4V6.A01(abstractC01033pi, MontageFundraiserSticker.class, e);
                    throw 0Q8.createAndThrow();
                }
            } while (5BB.A00(abstractC01033pi) != C42h.A02);
            return new MontageFundraiserSticker(hqX);
        }
    }

    /* loaded from: MontageFundraiserSticker$Serializer.class */
    public class Serializer extends JsonSerializer {
        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
            MontageFundraiserSticker montageFundraiserSticker = (MontageFundraiserSticker) obj;
            r302.A0b();
            AbstractC11224vw.A0D(r302, "beneficiary_profile_picture_url", montageFundraiserSticker.A01);
            AbstractC11224vw.A0D(r302, "beneficiary_type", montageFundraiserSticker.A02);
            AbstractC11224vw.A0D(r302, "campaign_title", montageFundraiserSticker.A03);
            AbstractC11224vw.A0D(r302, "fundraiser_progress_text", montageFundraiserSticker.A04);
            AbstractC11224vw.A0D(r302, "fundraiser_sticker_id", montageFundraiserSticker.A05);
            AbstractC11224vw.A0D(r302, "fundraiser_type", montageFundraiserSticker.A06);
            AbstractC11224vw.A0D(r302, PublicKeyCredentialControllerUtility.JSON_KEY_ID, montageFundraiserSticker.A07);
            AbstractC11224vw.A05(r302, c26c, montageFundraiserSticker.A00(), "montage_sticker_overlay_bounds");
            AbstractC11224vw.A0D(r302, "owner_name", montageFundraiserSticker.A08);
            double d = montageFundraiserSticker.A00;
            r302.A0o("percent_goal_reached");
            r302.A0d(d);
            AbstractC11224vw.A0D(r302, "style", montageFundraiserSticker.A09);
            r302.A0Y();
        }
    }

    public MontageFundraiserSticker(HqX hqX) {
        this.A01 = hqX.A02;
        this.A02 = hqX.A03;
        this.A03 = hqX.A04;
        this.A04 = hqX.A05;
        this.A05 = hqX.A06;
        this.A06 = hqX.A07;
        String str = hqX.A08;
        AbF.A1T(str);
        this.A07 = str;
        this.A0A = hqX.A01;
        this.A08 = hqX.A09;
        this.A00 = hqX.A00;
        this.A09 = hqX.A0A;
        this.A0B = Collections.unmodifiableSet(hqX.A0B);
    }

    public MontageFundraiserSticker(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        String str = null;
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
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
        this.A07 = parcel.readString();
        if (parcel.readInt() == 0) {
            this.A0A = null;
        } else {
            this.A0A = (MontageStickerOverlayBounds) parcel.readParcelable(A0e);
        }
        this.A08 = parcel.readInt() != 0 ? parcel.readString() : str;
        this.A00 = parcel.readDouble();
        this.A09 = C3o5.A0O(parcel);
        HashSet A0v = AnonymousClass001.A0v();
        int readInt = parcel.readInt();
        int i = 0;
        while (i < readInt) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A0B = Collections.unmodifiableSet(A0v);
    }

    public MontageStickerOverlayBounds A00() {
        if (this.A0B.contains("montageStickerOverlayBounds")) {
            return this.A0A;
        }
        if (A0C == null) {
            synchronized (this) {
                if (A0C == null) {
                    A0C = GOp.A0M();
                }
            }
        }
        return A0C;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof MontageFundraiserSticker)) {
                return false;
            }
            MontageFundraiserSticker montageFundraiserSticker = (MontageFundraiserSticker) obj;
            if (!11T.A0O(this.A01, montageFundraiserSticker.A01) || !11T.A0O(this.A02, montageFundraiserSticker.A02) || !11T.A0O(this.A03, montageFundraiserSticker.A03) || !11T.A0O(this.A04, montageFundraiserSticker.A04) || !11T.A0O(this.A05, montageFundraiserSticker.A05) || !11T.A0O(this.A06, montageFundraiserSticker.A06) || !11T.A0O(this.A07, montageFundraiserSticker.A07) || !11T.A0O(A00(), montageFundraiserSticker.A00()) || !11T.A0O(this.A08, montageFundraiserSticker.A08) || this.A00 != montageFundraiserSticker.A00 || !11T.A0O(this.A09, montageFundraiserSticker.A09)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A09, C1pq.A00(this.A00, C1pq.A04(this.A08, C1pq.A04(A00(), C1pq.A04(this.A07, C1pq.A04(this.A06, C1pq.A04(this.A05, C1pq.A04(this.A04, C1pq.A04(this.A03, C1pq.A04(this.A02, C1pq.A03(this.A01)))))))))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1BL.A13(parcel, this.A01);
        1BL.A13(parcel, this.A02);
        1BL.A13(parcel, this.A03);
        1BL.A13(parcel, this.A04);
        1BL.A13(parcel, this.A05);
        1BL.A13(parcel, this.A06);
        parcel.writeString(this.A07);
        C3o5.A0d(parcel, this.A0A, i);
        1BL.A13(parcel, this.A08);
        parcel.writeDouble(this.A00);
        1BL.A13(parcel, this.A09);
        Iterator A0S = C3o5.A0S(parcel, this.A0B);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
