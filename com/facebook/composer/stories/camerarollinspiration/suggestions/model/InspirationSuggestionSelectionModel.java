package com.facebook.composer.stories.camerarollinspiration.suggestions.model;

import X.0Q8;
import X.11T;
import X.1BL;
import X.1Du;
import X.28Q;
import X.4YV;
import X.5BB;
import X.AbF;
import X.AbG;
import X.AbI;
import X.AbstractC01033pi;
import X.AbstractC11224vw;
import X.AnonymousClass001;
import X.C1pq;
import X.C26c;
import X.C27T;
import X.C3o5;
import X.C42h;
import X.C4V6;
import X.F7x;
import X.FKX;
import android.os.Parcel;
import android.os.Parcelable;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: InspirationSuggestionSelectionModel.class */
public final class InspirationSuggestionSelectionModel implements Parcelable {
    public static volatile SuggestionModel A04;
    public static final Parcelable.Creator CREATOR = FKX.A00(11);
    public final InspirationRMSClip A00;
    public final SuggestionModel A01;
    public final ImmutableList A02;
    public final Set A03;

    /* loaded from: InspirationSuggestionSelectionModel$Deserializer.class */
    public class Deserializer extends JsonDeserializer {
        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public /* bridge */ /* synthetic */ Object A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
            F7x f7x = new F7x();
            do {
                try {
                    if (abstractC01033pi.A1J() == C42h.A03) {
                        String A1C = AbG.A1C(abstractC01033pi);
                        int hashCode = A1C.hashCode();
                        if (hashCode == -1624622995) {
                            if (A1C.equals("backup_inspiration_r_m_s_clip")) {
                                f7x.A00 = (InspirationRMSClip) AbstractC11224vw.A02(abstractC01033pi, c27t, InspirationRMSClip.class);
                            }
                            abstractC01033pi.A20();
                        } else if (hashCode != 399349038) {
                            if (hashCode == 1743028565 && A1C.equals("suggestion_clips_list")) {
                                f7x.A00(AbstractC11224vw.A00(abstractC01033pi, c27t, InspirationRMSClip.class));
                            }
                            abstractC01033pi.A20();
                        } else {
                            if (A1C.equals("suggestion_model")) {
                                SuggestionModel suggestionModel = (SuggestionModel) AbstractC11224vw.A02(abstractC01033pi, c27t, SuggestionModel.class);
                                f7x.A01 = suggestionModel;
                                C1pq.A08("suggestionModel", suggestionModel);
                                if (!f7x.A03.contains("suggestionModel")) {
                                    HashSet A1E = AbF.A1E(f7x.A03);
                                    f7x.A03 = A1E;
                                    A1E.add("suggestionModel");
                                }
                            }
                            abstractC01033pi.A20();
                        }
                    }
                } catch (Exception e) {
                    C4V6.A01(abstractC01033pi, InspirationSuggestionSelectionModel.class, e);
                    throw 0Q8.createAndThrow();
                }
            } while (5BB.A00(abstractC01033pi) != C42h.A02);
            return new InspirationSuggestionSelectionModel(f7x);
        }
    }

    /* loaded from: InspirationSuggestionSelectionModel$Serializer.class */
    public class Serializer extends JsonSerializer {
        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
            InspirationSuggestionSelectionModel inspirationSuggestionSelectionModel = (InspirationSuggestionSelectionModel) obj;
            r302.A0b();
            AbstractC11224vw.A05(r302, c26c, inspirationSuggestionSelectionModel.A00, "backup_inspiration_r_m_s_clip");
            AbstractC11224vw.A06(r302, c26c, "suggestion_clips_list", inspirationSuggestionSelectionModel.A02);
            AbstractC11224vw.A05(r302, c26c, inspirationSuggestionSelectionModel.A00(), "suggestion_model");
            r302.A0Y();
        }
    }

    public InspirationSuggestionSelectionModel(F7x f7x) {
        this.A00 = f7x.A00;
        ImmutableList immutableList = f7x.A02;
        C1pq.A08("suggestionClipsList", immutableList);
        this.A02 = immutableList;
        this.A01 = f7x.A01;
        this.A03 = Collections.unmodifiableSet(f7x.A03);
    }

    public InspirationSuggestionSelectionModel(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        SuggestionModel suggestionModel = null;
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            this.A00 = (InspirationRMSClip) parcel.readParcelable(A0e);
        }
        int readInt = parcel.readInt();
        InspirationRMSClip[] inspirationRMSClipArr = new InspirationRMSClip[readInt];
        int i = 0;
        int i2 = 0;
        while (i2 < readInt) {
            i2 = AbI.A01(parcel, A0e, inspirationRMSClipArr, i2);
        }
        this.A02 = ImmutableList.copyOf(inspirationRMSClipArr);
        this.A01 = parcel.readInt() != 0 ? (SuggestionModel) parcel.readParcelable(A0e) : suggestionModel;
        HashSet A0v = AnonymousClass001.A0v();
        int readInt2 = parcel.readInt();
        while (i < readInt2) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A03 = Collections.unmodifiableSet(A0v);
    }

    public InspirationSuggestionSelectionModel(SuggestionModel suggestionModel, ImmutableList immutableList, Set set) {
        this.A00 = null;
        C1pq.A08("suggestionClipsList", immutableList);
        this.A02 = immutableList;
        this.A01 = suggestionModel;
        this.A03 = Collections.unmodifiableSet(set);
    }

    public SuggestionModel A00() {
        if (this.A03.contains("suggestionModel")) {
            return this.A01;
        }
        if (A04 == null) {
            synchronized (this) {
                if (A04 == null) {
                    A04 = new SuggestionModel(null, null, null, null, null, null, ImmutableList.of(), ImmutableList.of(), null, null, null, null, null, null, "unknown", 0.0f);
                }
            }
        }
        return A04;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof InspirationSuggestionSelectionModel)) {
                return false;
            }
            InspirationSuggestionSelectionModel inspirationSuggestionSelectionModel = (InspirationSuggestionSelectionModel) obj;
            if (!11T.A0O(this.A00, inspirationSuggestionSelectionModel.A00) || !11T.A0O(this.A02, inspirationSuggestionSelectionModel.A02) || !11T.A0O(A00(), inspirationSuggestionSelectionModel.A00())) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(A00(), C1pq.A04(this.A02, C1pq.A03(this.A00)));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C3o5.A0d(parcel, this.A00, i);
        1Du A0b = 1BL.A0b(parcel, this.A02);
        while (A0b.hasNext()) {
            parcel.writeParcelable((InspirationRMSClip) A0b.next(), i);
        }
        C3o5.A0d(parcel, this.A01, i);
        Iterator A0S = C3o5.A0S(parcel, this.A03);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
