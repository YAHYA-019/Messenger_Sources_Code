package com.facebook.messaging.montage.forked.model.viewer;

import X.0Q8;
import X.11T;
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
import X.Qwt;
import X.Qwu;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.google.common.collect.ImmutableList;

/* loaded from: StoryFeedbackDiskCacheModel.class */
public final class StoryFeedbackDiskCacheModel {
    public final ImmutableList A00;
    public final ImmutableList A01;
    public final ImmutableList A02;
    public final ImmutableList A03;

    /* loaded from: StoryFeedbackDiskCacheModel$Deserializer.class */
    public class Deserializer extends JsonDeserializer {
        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public /* bridge */ /* synthetic */ Object A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
            ImmutableList of = ImmutableList.of();
            ImmutableList of2 = ImmutableList.of();
            ImmutableList of3 = ImmutableList.of();
            ImmutableList of4 = ImmutableList.of();
            do {
                try {
                    if (abstractC01033pi.A1J() == C42h.A03) {
                        String A1C = AbG.A1C(abstractC01033pi);
                        switch (A1C.hashCode()) {
                            case 292320589:
                                if (A1C.equals("viewer_poll_vote_info_list")) {
                                    of3 = AbstractC11224vw.A00(abstractC01033pi, c27t, ViewerPollVoteInfo.class);
                                    C1pq.A08("viewerPollVoteInfoList", of3);
                                    break;
                                }
                                break;
                            case 367097538:
                                if (A1C.equals("light_weight_reaction_models")) {
                                    of = AbstractC11224vw.A00(abstractC01033pi, c27t, Qwt.class);
                                    C1pq.A08("lightWeightReactionModels", of);
                                    break;
                                }
                                break;
                            case 666252427:
                                if (A1C.equals("viewer_quiz_answer_info_list")) {
                                    of4 = AbstractC11224vw.A00(abstractC01033pi, c27t, Qwu.class);
                                    C1pq.A08("viewerQuizAnswerInfoList", of4);
                                    break;
                                }
                                break;
                            case 1389201916:
                                if (A1C.equals("poll_vote_results_list")) {
                                    of2 = AbstractC11224vw.A00(abstractC01033pi, c27t, PollVoteResults.class);
                                    C1pq.A08("pollVoteResultsList", of2);
                                    break;
                                }
                                break;
                        }
                        abstractC01033pi.A20();
                    }
                } catch (Exception e) {
                    C4V6.A01(abstractC01033pi, StoryFeedbackDiskCacheModel.class, e);
                    throw 0Q8.createAndThrow();
                }
            } while (5BB.A00(abstractC01033pi) != C42h.A02);
            return new StoryFeedbackDiskCacheModel(of, of2, of3, of4);
        }
    }

    /* loaded from: StoryFeedbackDiskCacheModel$Serializer.class */
    public class Serializer extends JsonSerializer {
        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
            StoryFeedbackDiskCacheModel storyFeedbackDiskCacheModel = (StoryFeedbackDiskCacheModel) obj;
            r302.A0b();
            AbstractC11224vw.A06(r302, c26c, "light_weight_reaction_models", storyFeedbackDiskCacheModel.A00);
            AbstractC11224vw.A06(r302, c26c, "poll_vote_results_list", storyFeedbackDiskCacheModel.A01);
            AbstractC11224vw.A06(r302, c26c, "viewer_poll_vote_info_list", storyFeedbackDiskCacheModel.A02);
            AbstractC11224vw.A06(r302, c26c, "viewer_quiz_answer_info_list", storyFeedbackDiskCacheModel.A03);
            r302.A0Y();
        }
    }

    public StoryFeedbackDiskCacheModel(ImmutableList immutableList, ImmutableList immutableList2, ImmutableList immutableList3, ImmutableList immutableList4) {
        C1pq.A08("lightWeightReactionModels", immutableList);
        this.A00 = immutableList;
        C1pq.A08("pollVoteResultsList", immutableList2);
        this.A01 = immutableList2;
        C1pq.A08("viewerPollVoteInfoList", immutableList3);
        this.A02 = immutableList3;
        C1pq.A08("viewerQuizAnswerInfoList", immutableList4);
        this.A03 = immutableList4;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof StoryFeedbackDiskCacheModel)) {
                return false;
            }
            StoryFeedbackDiskCacheModel storyFeedbackDiskCacheModel = (StoryFeedbackDiskCacheModel) obj;
            if (!11T.A0O(this.A00, storyFeedbackDiskCacheModel.A00) || !11T.A0O(this.A01, storyFeedbackDiskCacheModel.A01) || !11T.A0O(this.A02, storyFeedbackDiskCacheModel.A02) || !11T.A0O(this.A03, storyFeedbackDiskCacheModel.A03)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A03, C1pq.A04(this.A02, C1pq.A04(this.A01, C1pq.A03(this.A00))));
    }
}
