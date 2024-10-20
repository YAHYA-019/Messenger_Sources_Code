package com.facebook.messaging.nativepagereply.faq.data.model;

import X.0Q8;
import X.11T;
import X.5BB;
import X.7zK;
import X.AbstractC01033pi;
import X.AbstractC11224vw;
import X.C1pq;
import X.C27T;
import X.C42h;
import X.C4V6;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.google.common.collect.ImmutableList;

/* loaded from: AutomatedResponseSuggestedQuestionListModel.class */
public final class AutomatedResponseSuggestedQuestionListModel {
    public final ImmutableList A00;

    /* loaded from: AutomatedResponseSuggestedQuestionListModel$Deserializer.class */
    public class Deserializer extends JsonDeserializer {
        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public /* bridge */ /* synthetic */ Object A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
            ImmutableList of = ImmutableList.of();
            do {
                try {
                    if (abstractC01033pi.A1J() == C42h.A03) {
                        String A1Y = abstractC01033pi.A1Y();
                        abstractC01033pi.A1K();
                        if (A1Y.hashCode() == -582838479 && A1Y.equals("suggested_questions")) {
                            of = AbstractC11224vw.A00(abstractC01033pi, c27t, String.class);
                            C1pq.A08(7zK.A00(433), of);
                        } else {
                            abstractC01033pi.A20();
                        }
                    }
                } catch (Exception e) {
                    C4V6.A01(abstractC01033pi, AutomatedResponseSuggestedQuestionListModel.class, e);
                    throw 0Q8.createAndThrow();
                }
            } while (5BB.A00(abstractC01033pi) != C42h.A02);
            return new AutomatedResponseSuggestedQuestionListModel(of);
        }
    }

    public AutomatedResponseSuggestedQuestionListModel(ImmutableList immutableList) {
        C1pq.A08("suggestedQuestions", immutableList);
        this.A00 = immutableList;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AutomatedResponseSuggestedQuestionListModel) && 11T.A0O(this.A00, ((AutomatedResponseSuggestedQuestionListModel) obj).A00));
    }

    public int hashCode() {
        return C1pq.A03(this.A00);
    }
}
