package com.facebook.messaging.nativepagereply.faq.data.model;

import X.0Q8;
import X.11T;
import X.1BL;
import X.1Du;
import X.28Q;
import X.4YV;
import X.5BB;
import X.82M;
import X.AbstractC01033pi;
import X.AbstractC11224vw;
import X.C1pq;
import X.C26c;
import X.C27T;
import X.C42h;
import X.C4V6;
import android.os.Parcel;
import android.os.Parcelable;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.google.common.collect.ImmutableList;

/* loaded from: AutomatedResponseCustomQuestionListModel.class */
public final class AutomatedResponseCustomQuestionListModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = new 82M(71);
    public final ImmutableList A00;

    /* loaded from: AutomatedResponseCustomQuestionListModel$Deserializer.class */
    public class Deserializer extends JsonDeserializer {
        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public /* bridge */ /* synthetic */ Object A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
            ImmutableList of = ImmutableList.of();
            do {
                try {
                    if (abstractC01033pi.A1J() == C42h.A03) {
                        String A1Y = abstractC01033pi.A1Y();
                        abstractC01033pi.A1K();
                        if (A1Y.hashCode() == -1782234803 && A1Y.equals("questions")) {
                            of = AbstractC11224vw.A00(abstractC01033pi, c27t, AutomatedResponseCustomQuestionModel.class);
                            C1pq.A08("questions", of);
                        } else {
                            abstractC01033pi.A20();
                        }
                    }
                } catch (Exception e) {
                    C4V6.A01(abstractC01033pi, AutomatedResponseCustomQuestionListModel.class, e);
                    throw 0Q8.createAndThrow();
                }
            } while (5BB.A00(abstractC01033pi) != C42h.A02);
            return new AutomatedResponseCustomQuestionListModel(of);
        }
    }

    /* loaded from: AutomatedResponseCustomQuestionListModel$Serializer.class */
    public class Serializer extends JsonSerializer {
        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
            r302.A0b();
            AbstractC11224vw.A06(r302, c26c, "questions", ((AutomatedResponseCustomQuestionListModel) obj).A00);
            r302.A0Y();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AutomatedResponseCustomQuestionListModel(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        int readInt = parcel.readInt();
        AutomatedResponseCustomQuestionModel[] automatedResponseCustomQuestionModelArr = new AutomatedResponseCustomQuestionModel[readInt];
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= readInt) {
                this.A00 = ImmutableList.copyOf(automatedResponseCustomQuestionModelArr);
                return;
            } else {
                automatedResponseCustomQuestionModelArr[i2] = parcel.readParcelable(A0e);
                i = i2 + 1;
            }
        }
    }

    public AutomatedResponseCustomQuestionListModel(ImmutableList immutableList) {
        C1pq.A08("questions", immutableList);
        this.A00 = immutableList;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AutomatedResponseCustomQuestionListModel) && 11T.A0O(this.A00, ((AutomatedResponseCustomQuestionListModel) obj).A00));
    }

    public int hashCode() {
        return C1pq.A03(this.A00);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1Du A0b = 1BL.A0b(parcel, this.A00);
        while (A0b.hasNext()) {
            parcel.writeParcelable((AutomatedResponseCustomQuestionModel) A0b.next(), i);
        }
    }
}
