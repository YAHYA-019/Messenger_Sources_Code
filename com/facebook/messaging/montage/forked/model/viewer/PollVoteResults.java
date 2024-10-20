package com.facebook.messaging.montage.forked.model.viewer;

import X.0Q8;
import X.11T;
import X.1BL;
import X.28Q;
import X.5BB;
import X.AbG;
import X.AbstractC01033pi;
import X.AbstractC11224vw;
import X.C1pq;
import X.C26c;
import X.C27T;
import X.C42h;
import X.C4V6;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.google.common.collect.ImmutableList;

/* loaded from: PollVoteResults.class */
public final class PollVoteResults {
    public final long A00;
    public final ImmutableList A01;
    public final String A02;

    /* loaded from: PollVoteResults$Deserializer.class */
    public class Deserializer extends JsonDeserializer {
        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public /* bridge */ /* synthetic */ Object A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
            long j = 0;
            String str = "";
            ImmutableList of = ImmutableList.of();
            do {
                try {
                    if (abstractC01033pi.A1J() == C42h.A03) {
                        String A1C = AbG.A1C(abstractC01033pi);
                        int hashCode = A1C.hashCode();
                        if (hashCode == -425767903) {
                            if (A1C.equals("poll_vote_results")) {
                                of = AbstractC11224vw.A00(abstractC01033pi, c27t, ViewerPollVoteResult.class);
                                C1pq.A08("pollVoteResults", of);
                            }
                            abstractC01033pi.A20();
                        } else if (hashCode != -397914725) {
                            if (hashCode == 767170141 && A1C.equals("expiration_time")) {
                                j = abstractC01033pi.A1B();
                            }
                            abstractC01033pi.A20();
                        } else {
                            if (A1C.equals("poll_id")) {
                                str = AbstractC11224vw.A03(abstractC01033pi);
                                C1pq.A08("pollId", str);
                            }
                            abstractC01033pi.A20();
                        }
                    }
                } catch (Exception e) {
                    C4V6.A01(abstractC01033pi, PollVoteResults.class, e);
                    throw 0Q8.createAndThrow();
                }
            } while (5BB.A00(abstractC01033pi) != C42h.A02);
            return new PollVoteResults(of, str, j);
        }
    }

    /* loaded from: PollVoteResults$Serializer.class */
    public class Serializer extends JsonSerializer {
        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
            PollVoteResults pollVoteResults = (PollVoteResults) obj;
            r302.A0b();
            long j = pollVoteResults.A00;
            r302.A0o("expiration_time");
            r302.A0g(j);
            AbstractC11224vw.A0D(r302, "poll_id", pollVoteResults.A02);
            AbstractC11224vw.A06(r302, c26c, "poll_vote_results", pollVoteResults.A01);
            r302.A0Y();
        }
    }

    public PollVoteResults(ImmutableList immutableList, String str, long j) {
        this.A00 = j;
        C1pq.A08("pollId", str);
        this.A02 = str;
        C1pq.A08("pollVoteResults", immutableList);
        this.A01 = immutableList;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof PollVoteResults)) {
                return false;
            }
            PollVoteResults pollVoteResults = (PollVoteResults) obj;
            if (this.A00 != pollVoteResults.A00 || !11T.A0O(this.A02, pollVoteResults.A02) || !11T.A0O(this.A01, pollVoteResults.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A01, C1pq.A04(this.A02, 1BL.A01(this.A00) + 31));
    }
}
