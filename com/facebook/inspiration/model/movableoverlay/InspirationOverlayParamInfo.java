package com.facebook.inspiration.model.movableoverlay;

import X.0Q8;
import X.11T;
import X.28Q;
import X.4YV;
import X.5BB;
import X.AbG;
import X.AbstractC01033pi;
import X.AbstractC11224vw;
import X.C1pq;
import X.C26c;
import X.C27T;
import X.C3o5;
import X.C42h;
import X.C4V6;
import X.FKc;
import X.N1F;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.inspiration.model.movableoverlay.music.InspirationMusicStickerInfo;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;

/* loaded from: InspirationOverlayParamInfo.class */
public final class InspirationOverlayParamInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FKc(31);
    public final AddYoursParticipationInfo A00;
    public final AddYoursTemplateParticipationInfo A01;
    public final InspirationBloksStickerInfo A02;
    public final InspirationCommentReshareOverlayInfo A03;
    public final InspirationHashtagStickerOverlayInfo A04;
    public final InspirationOverlayAvatarStickerInfo A05;
    public final InspirationOverlayChannelInfo A06;
    public final InspirationOverlayChannelMessageInfo A07;
    public final InspirationOverlayEmojiStickerInfo A08;
    public final InspirationOverlayEventInfo A09;
    public final InspirationOverlayFeedRemixStickerInfo A0A;
    public final InspirationOverlayFeelingsInfo A0B;
    public final InspirationOverlayFundraiserInfo A0C;
    public final InspirationOverlayGenericInteractiveStickerInfo A0D;
    public final InspirationOverlayGroupInfo A0E;
    public final InspirationOverlayMemoriesPolaroidInfo A0F;
    public final InspirationOverlayProductInfo A0G;
    public final InspirationOverlayStaticStickerInfo A0H;
    public final InspirationOverlaySubscribeStickerInfo A0I;
    public final InspirationPollInfo A0J;
    public final InspirationReactionInfo A0K;
    public final InspirationReshareInfo A0L;
    public final InspirationTagStickerOverlayInfo A0M;
    public final InspirationVoterRegistrationInfo A0N;
    public final InspirationMusicStickerInfo A0O;

    /* loaded from: InspirationOverlayParamInfo$Deserializer.class */
    public class Deserializer extends JsonDeserializer {
        /* JADX WARN: Type inference failed for: r0v0, types: [X.N1F, java.lang.Object] */
        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public /* bridge */ /* synthetic */ Object A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
            ?? obj = new Object();
            do {
                try {
                    if (abstractC01033pi.A1J() == C42h.A03) {
                        String A1C = AbG.A1C(abstractC01033pi);
                        switch (A1C.hashCode()) {
                            case -2086493978:
                                if (A1C.equals("inspiration_bloks_sticker_overlay_info")) {
                                    ((N1F) obj).A02 = (InspirationBloksStickerInfo) AbstractC11224vw.A02(abstractC01033pi, c27t, InspirationBloksStickerInfo.class);
                                    break;
                                }
                                break;
                            case -1958659134:
                                if (A1C.equals("inspiration_overlay_product_info")) {
                                    ((N1F) obj).A0G = (InspirationOverlayProductInfo) AbstractC11224vw.A02(abstractC01033pi, c27t, InspirationOverlayProductInfo.class);
                                    break;
                                }
                                break;
                            case -1813503001:
                                if (A1C.equals("feed_remix_sticker_info")) {
                                    ((N1F) obj).A0A = (InspirationOverlayFeedRemixStickerInfo) AbstractC11224vw.A02(abstractC01033pi, c27t, InspirationOverlayFeedRemixStickerInfo.class);
                                    break;
                                }
                                break;
                            case -1709992266:
                                if (A1C.equals("inspiration_reshare_info")) {
                                    ((N1F) obj).A0L = (InspirationReshareInfo) AbstractC11224vw.A02(abstractC01033pi, c27t, InspirationReshareInfo.class);
                                    break;
                                }
                                break;
                            case -1581235777:
                                if (A1C.equals("inspiration_music_sticker_info")) {
                                    ((N1F) obj).A0O = (InspirationMusicStickerInfo) AbstractC11224vw.A02(abstractC01033pi, c27t, InspirationMusicStickerInfo.class);
                                    break;
                                }
                                break;
                            case -1383373720:
                                if (A1C.equals("inspiration_voter_registration_info")) {
                                    ((N1F) obj).A0N = (InspirationVoterRegistrationInfo) AbstractC11224vw.A02(abstractC01033pi, c27t, InspirationVoterRegistrationInfo.class);
                                    break;
                                }
                                break;
                            case -1280505353:
                                if (A1C.equals("inspiration_overlay_event_info")) {
                                    ((N1F) obj).A09 = (InspirationOverlayEventInfo) AbstractC11224vw.A02(abstractC01033pi, c27t, InspirationOverlayEventInfo.class);
                                    break;
                                }
                                break;
                            case -1164109021:
                                if (A1C.equals("memories_polaroid_sticker_info")) {
                                    ((N1F) obj).A0F = (InspirationOverlayMemoriesPolaroidInfo) AbstractC11224vw.A02(abstractC01033pi, c27t, InspirationOverlayMemoriesPolaroidInfo.class);
                                    break;
                                }
                                break;
                            case -1156987106:
                                if (A1C.equals("inspiration_overlay_fundraiser_info")) {
                                    ((N1F) obj).A0C = (InspirationOverlayFundraiserInfo) AbstractC11224vw.A02(abstractC01033pi, c27t, InspirationOverlayFundraiserInfo.class);
                                    break;
                                }
                                break;
                            case -1017344313:
                                if (A1C.equals("inspiration_hashtag_sticker_overlay_info")) {
                                    ((N1F) obj).A04 = (InspirationHashtagStickerOverlayInfo) AbstractC11224vw.A02(abstractC01033pi, c27t, InspirationHashtagStickerOverlayInfo.class);
                                    break;
                                }
                                break;
                            case -982373070:
                                if (A1C.equals("inspiration_overlay_group_info")) {
                                    ((N1F) obj).A0E = (InspirationOverlayGroupInfo) AbstractC11224vw.A02(abstractC01033pi, c27t, InspirationOverlayGroupInfo.class);
                                    break;
                                }
                                break;
                            case -979579367:
                                if (A1C.equals("inspiration_poll_info")) {
                                    ((N1F) obj).A0J = (InspirationPollInfo) AbstractC11224vw.A02(abstractC01033pi, c27t, InspirationPollInfo.class);
                                    break;
                                }
                                break;
                            case -801429363:
                                if (A1C.equals("inspiration_overlay_emoji_sticker_info")) {
                                    ((N1F) obj).A08 = (InspirationOverlayEmojiStickerInfo) AbstractC11224vw.A02(abstractC01033pi, c27t, InspirationOverlayEmojiStickerInfo.class);
                                    break;
                                }
                                break;
                            case -494363290:
                                if (A1C.equals("inspiration_overlay_channel_message_info")) {
                                    ((N1F) obj).A07 = (InspirationOverlayChannelMessageInfo) AbstractC11224vw.A02(abstractC01033pi, c27t, InspirationOverlayChannelMessageInfo.class);
                                    break;
                                }
                                break;
                            case -447180908:
                                if (A1C.equals("add_yours_template_participation_info")) {
                                    ((N1F) obj).A01 = (AddYoursTemplateParticipationInfo) AbstractC11224vw.A02(abstractC01033pi, c27t, AddYoursTemplateParticipationInfo.class);
                                    break;
                                }
                                break;
                            case -294145230:
                                if (A1C.equals("inspiration_overlay_feelings_info")) {
                                    ((N1F) obj).A0B = (InspirationOverlayFeelingsInfo) AbstractC11224vw.A02(abstractC01033pi, c27t, InspirationOverlayFeelingsInfo.class);
                                    break;
                                }
                                break;
                            case -284356497:
                                if (A1C.equals("inspiration_reaction_info")) {
                                    ((N1F) obj).A0K = (InspirationReactionInfo) AbstractC11224vw.A02(abstractC01033pi, c27t, InspirationReactionInfo.class);
                                    break;
                                }
                                break;
                            case -141409966:
                                if (A1C.equals("inspiration_overlay_avatar_sticker_info")) {
                                    ((N1F) obj).A05 = (InspirationOverlayAvatarStickerInfo) AbstractC11224vw.A02(abstractC01033pi, c27t, InspirationOverlayAvatarStickerInfo.class);
                                    break;
                                }
                                break;
                            case 204482069:
                                if (A1C.equals("generic_interactive_sticker_info")) {
                                    ((N1F) obj).A0D = (InspirationOverlayGenericInteractiveStickerInfo) AbstractC11224vw.A02(abstractC01033pi, c27t, InspirationOverlayGenericInteractiveStickerInfo.class);
                                    break;
                                }
                                break;
                            case 258832953:
                                if (A1C.equals("inspiration_tag_sticker_overlay_info")) {
                                    ((N1F) obj).A0M = (InspirationTagStickerOverlayInfo) AbstractC11224vw.A02(abstractC01033pi, c27t, InspirationTagStickerOverlayInfo.class);
                                    break;
                                }
                                break;
                            case 459030217:
                                if (A1C.equals("add_yours_participation_info")) {
                                    ((N1F) obj).A00 = (AddYoursParticipationInfo) AbstractC11224vw.A02(abstractC01033pi, c27t, AddYoursParticipationInfo.class);
                                    break;
                                }
                                break;
                            case 626843173:
                                if (A1C.equals("inspiration_comment_reshare_overlay_info")) {
                                    ((N1F) obj).A03 = (InspirationCommentReshareOverlayInfo) AbstractC11224vw.A02(abstractC01033pi, c27t, InspirationCommentReshareOverlayInfo.class);
                                    break;
                                }
                                break;
                            case 1240627246:
                                if (A1C.equals("inspiration_overlay_channel_info")) {
                                    ((N1F) obj).A06 = (InspirationOverlayChannelInfo) AbstractC11224vw.A02(abstractC01033pi, c27t, InspirationOverlayChannelInfo.class);
                                    break;
                                }
                                break;
                            case 1702432777:
                                if (A1C.equals("inspiration_overlay_subscribe_sticker_info")) {
                                    ((N1F) obj).A0I = (InspirationOverlaySubscribeStickerInfo) AbstractC11224vw.A02(abstractC01033pi, c27t, InspirationOverlaySubscribeStickerInfo.class);
                                    break;
                                }
                                break;
                            case 2001067613:
                                if (A1C.equals("inspiration_overlay_static_sticker_info")) {
                                    ((N1F) obj).A0H = (InspirationOverlayStaticStickerInfo) AbstractC11224vw.A02(abstractC01033pi, c27t, InspirationOverlayStaticStickerInfo.class);
                                    break;
                                }
                                break;
                        }
                        abstractC01033pi.A20();
                    }
                } catch (Exception e) {
                    C4V6.A01(abstractC01033pi, InspirationOverlayParamInfo.class, e);
                    throw 0Q8.createAndThrow();
                }
            } while (5BB.A00(abstractC01033pi) != C42h.A02);
            return new InspirationOverlayParamInfo((N1F) obj);
        }
    }

    /* loaded from: InspirationOverlayParamInfo$Serializer.class */
    public class Serializer extends JsonSerializer {
        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
            InspirationOverlayParamInfo inspirationOverlayParamInfo = (InspirationOverlayParamInfo) obj;
            r302.A0b();
            AbstractC11224vw.A05(r302, c26c, inspirationOverlayParamInfo.A00, "add_yours_participation_info");
            AbstractC11224vw.A05(r302, c26c, inspirationOverlayParamInfo.A01, "add_yours_template_participation_info");
            AbstractC11224vw.A05(r302, c26c, inspirationOverlayParamInfo.A0A, "feed_remix_sticker_info");
            AbstractC11224vw.A05(r302, c26c, inspirationOverlayParamInfo.A0D, "generic_interactive_sticker_info");
            AbstractC11224vw.A05(r302, c26c, inspirationOverlayParamInfo.A02, "inspiration_bloks_sticker_overlay_info");
            AbstractC11224vw.A05(r302, c26c, inspirationOverlayParamInfo.A03, "inspiration_comment_reshare_overlay_info");
            AbstractC11224vw.A05(r302, c26c, inspirationOverlayParamInfo.A04, "inspiration_hashtag_sticker_overlay_info");
            AbstractC11224vw.A05(r302, c26c, inspirationOverlayParamInfo.A0O, "inspiration_music_sticker_info");
            AbstractC11224vw.A05(r302, c26c, inspirationOverlayParamInfo.A05, "inspiration_overlay_avatar_sticker_info");
            AbstractC11224vw.A05(r302, c26c, inspirationOverlayParamInfo.A06, "inspiration_overlay_channel_info");
            AbstractC11224vw.A05(r302, c26c, inspirationOverlayParamInfo.A07, "inspiration_overlay_channel_message_info");
            AbstractC11224vw.A05(r302, c26c, inspirationOverlayParamInfo.A08, "inspiration_overlay_emoji_sticker_info");
            AbstractC11224vw.A05(r302, c26c, inspirationOverlayParamInfo.A09, "inspiration_overlay_event_info");
            AbstractC11224vw.A05(r302, c26c, inspirationOverlayParamInfo.A0B, "inspiration_overlay_feelings_info");
            AbstractC11224vw.A05(r302, c26c, inspirationOverlayParamInfo.A0C, "inspiration_overlay_fundraiser_info");
            AbstractC11224vw.A05(r302, c26c, inspirationOverlayParamInfo.A0E, "inspiration_overlay_group_info");
            AbstractC11224vw.A05(r302, c26c, inspirationOverlayParamInfo.A0G, "inspiration_overlay_product_info");
            AbstractC11224vw.A05(r302, c26c, inspirationOverlayParamInfo.A0H, "inspiration_overlay_static_sticker_info");
            AbstractC11224vw.A05(r302, c26c, inspirationOverlayParamInfo.A0I, "inspiration_overlay_subscribe_sticker_info");
            AbstractC11224vw.A05(r302, c26c, inspirationOverlayParamInfo.A0J, "inspiration_poll_info");
            AbstractC11224vw.A05(r302, c26c, inspirationOverlayParamInfo.A0K, "inspiration_reaction_info");
            AbstractC11224vw.A05(r302, c26c, inspirationOverlayParamInfo.A0L, "inspiration_reshare_info");
            AbstractC11224vw.A05(r302, c26c, inspirationOverlayParamInfo.A0M, "inspiration_tag_sticker_overlay_info");
            AbstractC11224vw.A05(r302, c26c, inspirationOverlayParamInfo.A0N, "inspiration_voter_registration_info");
            AbstractC11224vw.A05(r302, c26c, inspirationOverlayParamInfo.A0F, "memories_polaroid_sticker_info");
            r302.A0Y();
        }
    }

    public InspirationOverlayParamInfo(N1F n1f) {
        this.A00 = n1f.A00;
        this.A01 = n1f.A01;
        this.A0A = n1f.A0A;
        this.A0D = n1f.A0D;
        this.A02 = n1f.A02;
        this.A03 = n1f.A03;
        this.A04 = n1f.A04;
        this.A0O = n1f.A0O;
        this.A05 = n1f.A05;
        this.A06 = n1f.A06;
        this.A07 = n1f.A07;
        this.A08 = n1f.A08;
        this.A09 = n1f.A09;
        this.A0B = n1f.A0B;
        this.A0C = n1f.A0C;
        this.A0E = n1f.A0E;
        this.A0G = n1f.A0G;
        this.A0H = n1f.A0H;
        this.A0I = n1f.A0I;
        this.A0J = n1f.A0J;
        this.A0K = n1f.A0K;
        this.A0L = n1f.A0L;
        this.A0M = n1f.A0M;
        this.A0N = n1f.A0N;
        this.A0F = n1f.A0F;
    }

    public InspirationOverlayParamInfo(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        InspirationOverlayMemoriesPolaroidInfo inspirationOverlayMemoriesPolaroidInfo = null;
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            this.A00 = (AddYoursParticipationInfo) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = (AddYoursTemplateParticipationInfo) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A0A = null;
        } else {
            this.A0A = (InspirationOverlayFeedRemixStickerInfo) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A0D = null;
        } else {
            this.A0D = (InspirationOverlayGenericInteractiveStickerInfo) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = (InspirationBloksStickerInfo) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = (InspirationCommentReshareOverlayInfo) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A04 = null;
        } else {
            this.A04 = (InspirationHashtagStickerOverlayInfo) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A0O = null;
        } else {
            this.A0O = (InspirationMusicStickerInfo) InspirationMusicStickerInfo.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A05 = null;
        } else {
            this.A05 = (InspirationOverlayAvatarStickerInfo) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A06 = null;
        } else {
            this.A06 = (InspirationOverlayChannelInfo) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A07 = null;
        } else {
            this.A07 = (InspirationOverlayChannelMessageInfo) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A08 = null;
        } else {
            this.A08 = (InspirationOverlayEmojiStickerInfo) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A09 = null;
        } else {
            this.A09 = (InspirationOverlayEventInfo) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A0B = null;
        } else {
            this.A0B = (InspirationOverlayFeelingsInfo) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A0C = null;
        } else {
            this.A0C = (InspirationOverlayFundraiserInfo) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A0E = null;
        } else {
            this.A0E = (InspirationOverlayGroupInfo) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A0G = null;
        } else {
            this.A0G = (InspirationOverlayProductInfo) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A0H = null;
        } else {
            this.A0H = (InspirationOverlayStaticStickerInfo) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A0I = null;
        } else {
            this.A0I = (InspirationOverlaySubscribeStickerInfo) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A0J = null;
        } else {
            this.A0J = (InspirationPollInfo) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A0K = null;
        } else {
            this.A0K = (InspirationReactionInfo) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A0L = null;
        } else {
            this.A0L = (InspirationReshareInfo) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A0M = null;
        } else {
            this.A0M = (InspirationTagStickerOverlayInfo) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A0N = null;
        } else {
            this.A0N = (InspirationVoterRegistrationInfo) parcel.readParcelable(A0e);
        }
        this.A0F = parcel.readInt() != 0 ? (InspirationOverlayMemoriesPolaroidInfo) parcel.readParcelable(A0e) : inspirationOverlayMemoriesPolaroidInfo;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof InspirationOverlayParamInfo)) {
                return false;
            }
            InspirationOverlayParamInfo inspirationOverlayParamInfo = (InspirationOverlayParamInfo) obj;
            if (!11T.A0O(this.A00, inspirationOverlayParamInfo.A00) || !11T.A0O(this.A01, inspirationOverlayParamInfo.A01) || !11T.A0O(this.A0A, inspirationOverlayParamInfo.A0A) || !11T.A0O(this.A0D, inspirationOverlayParamInfo.A0D) || !11T.A0O(this.A02, inspirationOverlayParamInfo.A02) || !11T.A0O(this.A03, inspirationOverlayParamInfo.A03) || !11T.A0O(this.A04, inspirationOverlayParamInfo.A04) || !11T.A0O(this.A0O, inspirationOverlayParamInfo.A0O) || !11T.A0O(this.A05, inspirationOverlayParamInfo.A05) || !11T.A0O(this.A06, inspirationOverlayParamInfo.A06) || !11T.A0O(this.A07, inspirationOverlayParamInfo.A07) || !11T.A0O(this.A08, inspirationOverlayParamInfo.A08) || !11T.A0O(this.A09, inspirationOverlayParamInfo.A09) || !11T.A0O(this.A0B, inspirationOverlayParamInfo.A0B) || !11T.A0O(this.A0C, inspirationOverlayParamInfo.A0C) || !11T.A0O(this.A0E, inspirationOverlayParamInfo.A0E) || !11T.A0O(this.A0G, inspirationOverlayParamInfo.A0G) || !11T.A0O(this.A0H, inspirationOverlayParamInfo.A0H) || !11T.A0O(this.A0I, inspirationOverlayParamInfo.A0I) || !11T.A0O(this.A0J, inspirationOverlayParamInfo.A0J) || !11T.A0O(this.A0K, inspirationOverlayParamInfo.A0K) || !11T.A0O(this.A0L, inspirationOverlayParamInfo.A0L) || !11T.A0O(this.A0M, inspirationOverlayParamInfo.A0M) || !11T.A0O(this.A0N, inspirationOverlayParamInfo.A0N) || !11T.A0O(this.A0F, inspirationOverlayParamInfo.A0F)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A0F, C1pq.A04(this.A0N, C1pq.A04(this.A0M, C1pq.A04(this.A0L, C1pq.A04(this.A0K, C1pq.A04(this.A0J, C1pq.A04(this.A0I, C1pq.A04(this.A0H, C1pq.A04(this.A0G, C1pq.A04(this.A0E, C1pq.A04(this.A0C, C1pq.A04(this.A0B, C1pq.A04(this.A09, C1pq.A04(this.A08, C1pq.A04(this.A07, C1pq.A04(this.A06, C1pq.A04(this.A05, C1pq.A04(this.A0O, C1pq.A04(this.A04, C1pq.A04(this.A03, C1pq.A04(this.A02, C1pq.A04(this.A0D, C1pq.A04(this.A0A, C1pq.A04(this.A01, C1pq.A03(this.A00)))))))))))))))))))))))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C3o5.A0d(parcel, this.A00, i);
        C3o5.A0d(parcel, this.A01, i);
        C3o5.A0d(parcel, this.A0A, i);
        C3o5.A0d(parcel, this.A0D, i);
        C3o5.A0d(parcel, this.A02, i);
        C3o5.A0d(parcel, this.A03, i);
        C3o5.A0d(parcel, this.A04, i);
        InspirationMusicStickerInfo inspirationMusicStickerInfo = this.A0O;
        if (inspirationMusicStickerInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            inspirationMusicStickerInfo.writeToParcel(parcel, i);
        }
        C3o5.A0d(parcel, this.A05, i);
        C3o5.A0d(parcel, this.A06, i);
        C3o5.A0d(parcel, this.A07, i);
        C3o5.A0d(parcel, this.A08, i);
        C3o5.A0d(parcel, this.A09, i);
        C3o5.A0d(parcel, this.A0B, i);
        C3o5.A0d(parcel, this.A0C, i);
        C3o5.A0d(parcel, this.A0E, i);
        C3o5.A0d(parcel, this.A0G, i);
        C3o5.A0d(parcel, this.A0H, i);
        C3o5.A0d(parcel, this.A0I, i);
        C3o5.A0d(parcel, this.A0J, i);
        C3o5.A0d(parcel, this.A0K, i);
        C3o5.A0d(parcel, this.A0L, i);
        C3o5.A0d(parcel, this.A0M, i);
        C3o5.A0d(parcel, this.A0N, i);
        C3o5.A0d(parcel, this.A0F, i);
    }
}
