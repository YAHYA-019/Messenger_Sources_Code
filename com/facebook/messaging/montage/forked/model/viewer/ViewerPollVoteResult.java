package com.facebook.messaging.montage.forked.model.viewer;

import X.0Q8;
import X.28Q;
import X.5BB;
import X.AbG;
import X.AbstractC01033pi;
import X.C26c;
import X.C27T;
import X.C42h;
import X.C4V6;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;

/* loaded from: ViewerPollVoteResult.class */
public final class ViewerPollVoteResult {
    public final int A00;
    public final int A01;

    /* loaded from: ViewerPollVoteResult$Deserializer.class */
    public class Deserializer extends JsonDeserializer {
        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public /* bridge */ /* synthetic */ Object A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
            int i = 0;
            int i2 = 0;
            do {
                try {
                    if (abstractC01033pi.A1J() == C42h.A03) {
                        String A1C = AbG.A1C(abstractC01033pi);
                        int hashCode = A1C.hashCode();
                        if (hashCode != 912705800) {
                            if (hashCode == 2082975610 && A1C.equals("vote_count")) {
                                i2 = abstractC01033pi.A1y();
                            }
                            abstractC01033pi.A20();
                        } else {
                            if (A1C.equals("poll_option_index")) {
                                i = abstractC01033pi.A1y();
                            }
                            abstractC01033pi.A20();
                        }
                    }
                } catch (Exception e) {
                    C4V6.A01(abstractC01033pi, ViewerPollVoteResult.class, e);
                    throw 0Q8.createAndThrow();
                }
            } while (5BB.A00(abstractC01033pi) != C42h.A02);
            return new ViewerPollVoteResult(i, i2);
        }
    }

    /* loaded from: ViewerPollVoteResult$Serializer.class */
    public class Serializer extends JsonSerializer {
        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
            ViewerPollVoteResult viewerPollVoteResult = (ViewerPollVoteResult) obj;
            r302.A0b();
            int i = viewerPollVoteResult.A00;
            r302.A0o("poll_option_index");
            r302.A0f(i);
            int i2 = viewerPollVoteResult.A01;
            r302.A0o("vote_count");
            r302.A0f(i2);
            r302.A0Y();
        }
    }

    public ViewerPollVoteResult(int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ViewerPollVoteResult)) {
                return false;
            }
            ViewerPollVoteResult viewerPollVoteResult = (ViewerPollVoteResult) obj;
            if (this.A00 != viewerPollVoteResult.A00 || this.A01 != viewerPollVoteResult.A01) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((this.A00 + 31) * 31) + this.A01;
    }
}
