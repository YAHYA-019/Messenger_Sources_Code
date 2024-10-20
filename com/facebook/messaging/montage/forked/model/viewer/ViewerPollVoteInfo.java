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

/* loaded from: ViewerPollVoteInfo.class */
public final class ViewerPollVoteInfo {
    public final int A00;
    public final int A01;
    public final long A02;
    public final String A03;

    /* loaded from: ViewerPollVoteInfo$Deserializer.class */
    public class Deserializer extends JsonDeserializer {
        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public /* bridge */ /* synthetic */ Object A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
            long j = 0;
            int i = 0;
            int i2 = 0;
            String str = "";
            do {
                try {
                    if (abstractC01033pi.A1J() == C42h.A03) {
                        String A1C = AbG.A1C(abstractC01033pi);
                        switch (A1C.hashCode()) {
                            case -397914725:
                                if (A1C.equals("poll_id")) {
                                    str = AbstractC11224vw.A03(abstractC01033pi);
                                    C1pq.A08("pollId", str);
                                    break;
                                }
                                break;
                            case -350092680:
                                if (A1C.equals("reply_attempt")) {
                                    i = abstractC01033pi.A1y();
                                    break;
                                }
                                break;
                            case 767170141:
                                if (A1C.equals("expiration_time")) {
                                    j = abstractC01033pi.A1B();
                                    break;
                                }
                                break;
                            case 2088470333:
                                if (A1C.equals("vote_index")) {
                                    i2 = abstractC01033pi.A1y();
                                    break;
                                }
                                break;
                        }
                        abstractC01033pi.A20();
                    }
                } catch (Exception e) {
                    C4V6.A01(abstractC01033pi, ViewerPollVoteInfo.class, e);
                    throw 0Q8.createAndThrow();
                }
            } while (5BB.A00(abstractC01033pi) != C42h.A02);
            return new ViewerPollVoteInfo(i, i2, str, j);
        }
    }

    /* loaded from: ViewerPollVoteInfo$Serializer.class */
    public class Serializer extends JsonSerializer {
        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
            ViewerPollVoteInfo viewerPollVoteInfo = (ViewerPollVoteInfo) obj;
            r302.A0b();
            long j = viewerPollVoteInfo.A02;
            r302.A0o("expiration_time");
            r302.A0g(j);
            AbstractC11224vw.A0D(r302, "poll_id", viewerPollVoteInfo.A03);
            int i = viewerPollVoteInfo.A00;
            r302.A0o("reply_attempt");
            r302.A0f(i);
            int i2 = viewerPollVoteInfo.A01;
            r302.A0o("vote_index");
            r302.A0f(i2);
            r302.A0Y();
        }
    }

    public ViewerPollVoteInfo(int i, int i2, String str, long j) {
        this.A02 = j;
        C1pq.A08("pollId", str);
        this.A03 = str;
        this.A00 = i;
        this.A01 = i2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ViewerPollVoteInfo)) {
                return false;
            }
            ViewerPollVoteInfo viewerPollVoteInfo = (ViewerPollVoteInfo) obj;
            if (this.A02 != viewerPollVoteInfo.A02 || !11T.A0O(this.A03, viewerPollVoteInfo.A03) || this.A00 != viewerPollVoteInfo.A00 || this.A01 != viewerPollVoteInfo.A01) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (((C1pq.A04(this.A03, 1BL.A01(this.A02) + 31) * 31) + this.A00) * 31) + this.A01;
    }
}
