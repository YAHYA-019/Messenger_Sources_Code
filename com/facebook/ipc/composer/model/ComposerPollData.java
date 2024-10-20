package com.facebook.ipc.composer.model;

import X.0Q8;
import X.11T;
import X.1BL;
import X.1BM;
import X.1Du;
import X.28Q;
import X.4YV;
import X.5BB;
import X.AbG;
import X.AbI;
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
import X.DKG;
import X.EQ0;
import X.FKa;
import android.os.Parcel;
import android.os.Parcelable;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.google.common.collect.ImmutableList;

/* loaded from: ComposerPollData.class */
public final class ComposerPollData implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKa.A00(54);
    public final EQ0 A00;
    public final ImmutableList A01;
    public final String A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;

    /* loaded from: ComposerPollData$Deserializer.class */
    public class Deserializer extends JsonDeserializer {
        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public /* bridge */ /* synthetic */ Object A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
            boolean z = false;
            boolean z2 = false;
            EQ0 eq0 = null;
            String str = null;
            boolean z3 = false;
            boolean z4 = false;
            ImmutableList of = ImmutableList.of();
            do {
                try {
                    if (abstractC01033pi.A1J() == C42h.A03) {
                        String A1C = AbG.A1C(abstractC01033pi);
                        switch (A1C.hashCode()) {
                            case -1458830246:
                                if (A1C.equals("can_viewer_choose_multiple")) {
                                    z2 = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case -1249474914:
                                if (A1C.equals("options")) {
                                    of = AbstractC11224vw.A00(abstractC01033pi, c27t, ComposerPollOptionData.class);
                                    C1pq.A08("options", of);
                                    break;
                                }
                                break;
                            case -1030340122:
                                if (A1C.equals("question_text")) {
                                    str = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                            case -799136893:
                                if (A1C.equals("entry_point")) {
                                    eq0 = (EQ0) AbstractC11224vw.A02(abstractC01033pi, c27t, EQ0.class);
                                    break;
                                }
                                break;
                            case -147696445:
                                if (A1C.equals("can_viewer_add")) {
                                    z = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case 1342431204:
                                if (A1C.equals("should_make_results_visible")) {
                                    z4 = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case 1991782322:
                                if (A1C.equals("should_close_poll")) {
                                    z3 = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                        }
                        abstractC01033pi.A20();
                    }
                } catch (Exception e) {
                    C4V6.A01(abstractC01033pi, ComposerPollData.class, e);
                    throw 0Q8.createAndThrow();
                }
            } while (5BB.A00(abstractC01033pi) != C42h.A02);
            return new ComposerPollData(eq0, of, str, z, z2, z3, z4);
        }
    }

    /* loaded from: ComposerPollData$Serializer.class */
    public class Serializer extends JsonSerializer {
        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
            ComposerPollData composerPollData = (ComposerPollData) obj;
            r302.A0b();
            boolean z = composerPollData.A03;
            r302.A0o("can_viewer_add");
            r302.A0v(z);
            boolean z2 = composerPollData.A04;
            r302.A0o("can_viewer_choose_multiple");
            r302.A0v(z2);
            AbstractC11224vw.A05(r302, c26c, composerPollData.A00, "entry_point");
            AbstractC11224vw.A06(r302, c26c, "options", composerPollData.A01);
            AbstractC11224vw.A0D(r302, "question_text", composerPollData.A02);
            boolean z3 = composerPollData.A05;
            r302.A0o("should_close_poll");
            r302.A0v(z3);
            DKG.A1T(r302, "should_make_results_visible", composerPollData.A06);
        }
    }

    public ComposerPollData(EQ0 eq0, ImmutableList immutableList, String str, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A03 = z;
        this.A04 = z2;
        this.A00 = eq0;
        C1pq.A08("options", immutableList);
        this.A01 = immutableList;
        this.A02 = str;
        this.A05 = z3;
        this.A06 = z4;
    }

    public ComposerPollData(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        this.A03 = AnonymousClass001.A1Q(parcel.readInt(), 1);
        this.A04 = 1BM.A07(parcel);
        this.A00 = parcel.readInt() != 0 ? EQ0.values()[parcel.readInt()] : null;
        int readInt = parcel.readInt();
        ComposerPollOptionData[] composerPollOptionDataArr = new ComposerPollOptionData[readInt];
        int i = 0;
        while (i < readInt) {
            i = AbI.A01(parcel, A0e, composerPollOptionDataArr, i);
        }
        this.A01 = ImmutableList.copyOf(composerPollOptionDataArr);
        this.A02 = C3o5.A0O(parcel);
        this.A05 = 1BM.A07(parcel);
        this.A06 = AbJ.A1W(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ComposerPollData)) {
                return false;
            }
            ComposerPollData composerPollData = (ComposerPollData) obj;
            if (this.A03 != composerPollData.A03 || this.A04 != composerPollData.A04 || this.A00 != composerPollData.A00 || !11T.A0O(this.A01, composerPollData.A01) || !11T.A0O(this.A02, composerPollData.A02) || this.A05 != composerPollData.A05 || this.A06 != composerPollData.A06) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A02 = C1pq.A02(C1pq.A05(this.A03), this.A04);
        return C1pq.A02(C1pq.A02(C1pq.A04(this.A02, C1pq.A04(this.A01, (A02 * 31) + C3o5.A03(this.A00))), this.A05), this.A06);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A03 ? 1 : 0);
        parcel.writeInt(this.A04 ? 1 : 0);
        C3o5.A0e(parcel, this.A00);
        1Du A0b = 1BL.A0b(parcel, this.A01);
        while (A0b.hasNext()) {
            parcel.writeParcelable((ComposerPollOptionData) A0b.next(), i);
        }
        1BL.A13(parcel, this.A02);
        parcel.writeInt(this.A05 ? 1 : 0);
        parcel.writeInt(this.A06 ? 1 : 0);
    }
}
