package X;

import android.content.Context;
import android.os.Bundle;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.fury.context.ReqContext;
import com.facebook.graphql.enums.GraphQLStringDefUtil;
import com.facebook.graphservice.tree.TreeBuilderJNI;
import com.facebook.inject.FbInjector;
import com.facebook.messaging.analytics.reliability.AggregatedReliabilityLogger;
import com.facebook.messaging.attachments.ImageAttachmentData;
import com.facebook.messaging.attachments.VideoAttachmentData;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.messages.ParticipantInfo;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadCustomization;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.montage.forked.viewer.model.StoryBackgroundInfo;
import com.facebook.messaging.montage.model.cards.MontageEventsSticker;
import com.facebook.messaging.montage.model.cards.MontageFeedbackOverlay;
import com.facebook.messaging.montage.model.cards.MontageFeedbackPoll;
import com.facebook.messaging.montage.model.cards.MontageFeedbackPollOption;
import com.facebook.messaging.montage.model.cards.MontageLinkSticker;
import com.facebook.messaging.montage.model.cards.MontageReactionSticker;
import com.facebook.messaging.montage.model.cards.MontageReshareContentSticker;
import com.facebook.messaging.montage.model.cards.MontageSliderSticker;
import com.facebook.messaging.montage.model.cards.MontageStickerAnimationAsset;
import com.facebook.messaging.montage.model.cards.MontageStickerOverlayBounds;
import com.facebook.messaging.montage.model.montageattribution.Entity;
import com.facebook.messaging.montage.model.montageattribution.EntityAtRange;
import com.facebook.messaging.montage.model.montageattribution.MontageAttributionData;
import com.facebook.messaging.montage.model.montagemetadata.MontageMetadata;
import com.facebook.messaging.notify.type.MessagingNotification;
import com.facebook.messaging.notify.type.NewMessageNotification;
import com.facebook.messaging.push.flags.ServerMessageAlertFlags;
import com.facebook.messaging.service.model.NewMessageResult;
import com.facebook.push.constants.PushProperty;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.SingletonImmutableSet;
import com.mapbox.mapboxsdk.style.layers.Property;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: Cbh.class */
public final class Cbh implements CallerContextable {
    public static final String __redex_internal_original_name = "NewMessageHandlerHelper";
    public 1BY A00;
    public final C0dp A01;
    public final CPa A02;
    public final 4yH A03;
    public final CaM A04;
    public final CIU A05;
    public final FbUserSession A06;
    public final C00i A0A;
    public final AggregatedReliabilityLogger A0F;
    public final C03 A0G;
    public final 1Uv A0H;
    public final C4z1 A0I;
    public final C10774uk A0J;
    public final C5ad A0K;
    public final C15h A0L;
    public final C00i A0B = 1BQ.A02(49611);
    public final C00i A0C = 1BQ.A02(17066);
    public final C00i A09 = 1BQ.A02(84646);
    public final C00i A0E = AbM.A0M();
    public final C00i A07 = 1BQ.A01();
    public final C00i A0D = 1BV.A01((1BY) null, 83835);
    public final C00i A08 = 1BV.A01((1BY) null, 147690);

    public Cbh(1BO r302, FbUserSession fbUserSession) {
        this.A00 = 7zL.A0Q(r302);
        C0dp A0B = AbI.A0B();
        C5ad c5ad = (C5ad) 1Lo.A04((Context) null, fbUserSession, (1BY) null, 49792);
        DBe A00 = DBe.A00(this, ActionId.APP_DID_BECOME_ACTIVE);
        C10774uk c10774uk = (C10774uk) 1Bn.A0E((Context) null, (1BY) null, 49353);
        AggregatedReliabilityLogger aggregatedReliabilityLogger = (AggregatedReliabilityLogger) 1Bi.A03(49381);
        1Uv A0M = AbJ.A0M();
        1BV A01 = 1BV.A01((1BY) null, 49996);
        this.A06 = fbUserSession;
        CIU ciu = (CIU) 1Lo.A04((Context) null, fbUserSession, (1BY) null, 84518);
        CaM A0f = AbM.A0f(fbUserSession, (1BY) null);
        4yH A0W = AbM.A0W(fbUserSession, (1BY) null);
        this.A0I = AbM.A0R(fbUserSession, (1BY) null);
        this.A02 = AbM.A0Q(fbUserSession);
        this.A03 = A0W;
        this.A01 = A0B;
        this.A0K = c5ad;
        this.A04 = A0f;
        this.A05 = ciu;
        this.A0L = A00;
        this.A0J = c10774uk;
        this.A0F = aggregatedReliabilityLogger;
        this.A0G = (C03) 1Hv.A02(FbInjector.A00(), 82161);
        this.A0H = A0M;
        this.A0A = A01;
    }

    public static final MontageStickerOverlayBounds A00(S2c s2c) {
        11T.A0F(s2c, 0);
        String str = s2c.xCoordinate;
        11T.A09(str);
        double parseDouble = Double.parseDouble(str);
        String str2 = s2c.yCoordinate;
        11T.A09(str2);
        double parseDouble2 = Double.parseDouble(str2);
        String str3 = s2c.width;
        11T.A09(str3);
        double parseDouble3 = Double.parseDouble(str3);
        String str4 = s2c.height;
        11T.A09(str4);
        double parseDouble4 = Double.parseDouble(str4);
        String str5 = s2c.rotation;
        11T.A09(str5);
        return new MontageStickerOverlayBounds(parseDouble, parseDouble2, parseDouble3, parseDouble4, Double.parseDouble(str5));
    }

    public static void A01(NewMessageNotification newMessageNotification, Cbh cbh) {
        5Zm r0 = AbK.A0a(cbh.A0D, newMessageNotification).A00;
        r0.A01(0S2.A01);
        PushProperty pushProperty = ((MessagingNotification) newMessageNotification).A02;
        if (pushProperty != null) {
            String name = pushProperty.A04.name();
            String A00 = 1BJ.A00(526);
            11T.A0F(name, 1);
            r0.A03(A00, name);
        }
    }

    private void A02(NewMessageResult newMessageResult, boolean z) {
        NewMessageNotification A02;
        Message message = newMessageResult.A00;
        if (z) {
            A02 = this.A05.A01(newMessageResult);
            if (A02 == null) {
                return;
            }
        } else {
            ThreadSummary threadSummary = newMessageResult.A02;
            A02 = this.A0K.A02(message, threadSummary != null ? threadSummary.BF2() : ThreadCustomization.A03, ServerMessageAlertFlags.A06, new PushProperty(4rH.A0D, null, null, message.A1V, null, null, null, null, null, null, null, null, newMessageResult.hashCode(), 0L, 0L, 0L, false));
        }
        A01(A02, this);
        ThreadKey threadKey = message.A0V;
        if (threadKey != null) {
            this.A04.A03(threadKey, A02);
        }
    }

    public Bundle A03(Message message, ThreadSummary threadSummary, DIr dIr, long j) {
        String A00 = 4YT.A00(150);
        C00j.A05("NewMessageHandler.db", -2136124735);
        try {
            String str = message.A1V;
            0fH.A0d(str, Long.valueOf(message.A04), __redex_internal_original_name, "Handling %s in DB, sentTimestampMs=%d");
            C00i c00i = this.A0C;
            2fJ r0 = (2fJ) c00i.get();
            ThreadKey threadKey = message.A0V;
            r0.A0D(threadKey, "DeltaNewMessage", "handleDeltaInDb-DeltaNewMessage", 0Pz.A0W(A00, 5Q0.A04(message)), j);
            this.A08.get();
            long j2 = -1;
            NewMessageResult A0V = this.A03.A0V(new NewMessageResult(EnumC08284mf.A06, message, null, null, this.A01.now()), C7tn.A02, j, false);
            DIt Ax7 = dIr.Ax7();
            Long Azv = Ax7.Azv();
            long longValue = Azv != null ? Azv.longValue() : -1;
            if (A0V != null && A0V.A00 == null) {
                String Ax1 = Ax7.Ax1();
                String obj = Ax7.BF8().toString();
                Long BFp = Ax7.BFp();
                if (BFp != null) {
                    j2 = BFp.longValue();
                }
                ((2fJ) c00i.get()).A0D(threadKey, "DeltaNewMessage", "handleDeltaInDb-BadNewMessageDelta", 0Pz.A0W(A00, 5Q0.A04(message)), j);
                6E7 r02 = (6E7) this.A0A.get();
                2Jy A0H = 4YU.A0H("sync_bad_new_message_delta");
                A0H.A0D("message_id", Ax1);
                A0H.A0D("thread_key", obj);
                A0H.A0C("timestamp", j2);
                A0H.A0C("offlineThreadingId", longValue);
                r02.A00.A00(A0H, BLy.A02);
            }
            C10774uk c10774uk = this.A0J;
            CallerContext A06 = CallerContext.A06(Cbh.class);
            C1pq.A08("callerContext", A06);
            Integer num = 0S2.A0j;
            boolean z = false;
            if (threadSummary != null && threadSummary.A0g == 1F9.A0M) {
                z = true;
            }
            Boolean valueOf = Boolean.valueOf(z);
            C1pq.A08("isMontageMessage", valueOf);
            C1pq.A08("callerContext", A06);
            C1pq.A08("isMontageMessage", valueOf);
            1G1 r03 = this.A06;
            C10774uk.A04(r03, A06, c10774uk, message, valueOf, false, num);
            1EK.A09(C10774uk.__redex_internal_original_name, 945182112670775L);
            try {
                ReqContext A04 = AnonymousClass018.A04(C10774uk.__redex_internal_original_name, 0);
                try {
                    ParticipantInfo participantInfo = message.A0K;
                    if (participantInfo != null) {
                        String A002 = participantInfo.A00();
                        if (A002 != null && !A002.equals(r03.A02)) {
                            Ble ble = (Ble) c10774uk.A07.get();
                            C12114ys c12114ys = ble.A01;
                            if (c12114ys.A0H(message)) {
                                1Du it = c12114ys.A0E(message).iterator();
                                while (it.hasNext()) {
                                    ImageAttachmentData imageAttachmentData = (ImageAttachmentData) it.next();
                                    1UG A08 = 1BK.A08(ble.A00, "messenger_photo_sync");
                                    if (A08.isSampled()) {
                                        A08.A7R("message_id", str != null ? str : "");
                                        A08.A7R("pigeon_reserved_keyword_module", "media_quality");
                                        A08.A7R("media_type", "photo");
                                        A08.A5H("is_preview", Boolean.valueOf(imageAttachmentData.A0G));
                                        String str2 = imageAttachmentData.A0C;
                                        long j3 = 0;
                                        A08.A6H("media_fbid", Long.valueOf(str2 != null ? Long.parseLong(str2) : 0L));
                                        A08.A6H(Property.ICON_TEXT_FIT_HEIGHT, 1BK.A0l(imageAttachmentData.A02));
                                        A08.A5H("render_as_sticker", Boolean.valueOf(imageAttachmentData.A0J));
                                        A08.A6H(Property.ICON_TEXT_FIT_WIDTH, 1BK.A0l(imageAttachmentData.A03));
                                        A08.A5H(4YT.A00(1205), Boolean.valueOf(imageAttachmentData.A0I));
                                        String str3 = message.A1g;
                                        if (str3 != null) {
                                            j3 = Long.parseLong(str3);
                                        }
                                        A08.A6H(4YT.A00(ActionId.APPLY_OPTIMISTICS), Long.valueOf(j3));
                                        A08.BZL();
                                    }
                                }
                            }
                            if (c12114ys.A0J(message)) {
                                String str4 = str;
                                VideoAttachmentData A0B = c12114ys.A0B(message);
                                if (A0B != null) {
                                    1UG A082 = 1BK.A08(ble.A00, "messenger_photo_sync");
                                    if (A082.isSampled()) {
                                        if (str == null) {
                                            str4 = "";
                                        }
                                        A082.A7R("message_id", str4);
                                        A082.A7R("pigeon_reserved_keyword_module", "media_quality");
                                        A082.A7R("media_type", "video");
                                        A082.A5H("is_preview", Boolean.valueOf(A0B.A0P));
                                        String str5 = A0B.A0K;
                                        A082.A6H("media_fbid", Long.valueOf(str5 != null ? Long.parseLong(str5) : 0L));
                                        A082.A6H(AnonymousClass000.A00(55), 1BK.A0l(A0B.A04));
                                        A082.A6H(1BJ.A00(184), 1BK.A0l(A0B.A06));
                                        A082.BZL();
                                    }
                                }
                            }
                        }
                    }
                    if (A04 != null) {
                        A04.close();
                    }
                    1EK.A03();
                    if (str != null) {
                        this.A0B.get();
                    }
                    Bundle A05 = 1BK.A05();
                    A05.putParcelable("newMessageResult", A0V);
                    if (A0V != null) {
                        ThreadSummary threadSummary2 = A0V.A02;
                        if (threadSummary2 != null) {
                            A05.putParcelable("threadSummary", threadSummary2);
                        }
                    }
                    if (participantInfo != null) {
                        String A003 = participantInfo.A00();
                        if (A003 != null && A003.equals(r03.A02) && !message.A0r.isEmpty()) {
                            this.A0H.A0H(message, __redex_internal_original_name);
                        }
                    }
                    C00j.A01(429887836);
                    return A05;
                } finally {
                }
            } catch (Throwable th) {
                1EK.A03();
                throw th;
            }
        } catch (Throwable th2) {
            C00j.A01(-2082480162);
            throw th2;
        }
    }

    public Message A04(ThreadSummary threadSummary, DIr dIr) {
        String str;
        boolean z;
        StoryBackgroundInfo storyBackgroundInfo;
        String str2;
        C48e c48e;
        List list;
        MontageFeedbackOverlay montageFeedbackOverlay;
        if (dIr.Ax7().Azv() == null) {
            C01s A09 = 1BK.A09(this.A07);
            StringBuilder A0k = AnonymousClass001.A0k();
            A0k.append("Got null offlineThreadId from message delta, threadKey=");
            A0k.append(dIr.Ax7().BF8());
            A0k.append(", messageId=");
            A09.D0v(__redex_internal_original_name, AnonymousClass001.A0d(dIr.Ax7().Ax1(), A0k));
        }
        CQL cql = (CQL) this.A09.get();
        FbUserSession fbUserSession = this.A06;
        java.util.Map AgQ = dIr.AgQ();
        if (AgQ != null) {
            z = Boolean.parseBoolean(AnonymousClass001.A0b("is_sponsored", AgQ));
            str = AnonymousClass001.A0b("commerce_message_type", AgQ);
        } else {
            str = null;
            z = false;
        }
        DIt Ax7 = dIr.Ax7();
        String AZf = dIr.AZf();
        Long BCU = dIr.BCU();
        List AXd = dIr.AXd();
        C6mV BHI = dIr.BHI();
        Message A03 = CQL.A03(fbUserSession, threadSummary, Ax7, cql, Integer.valueOf(BHI != null ? BHI.getValue() : 0), BCU, AZf, str, dIr.AxK(), dIr.BI7(), AXd, AgQ, z);
        CQL.A05(fbUserSession, A03, cql).A01(A03, 6C0.A0B);
        Iterator it = cql.A03.A00.iterator();
        if (it.hasNext()) {
            it.next();
            throw AnonymousClass001.A0Q("onSuccess");
        }
        if (dIr instanceof Rrc) {
            5PI A0d = AbF.A0d(A03);
            Rya rya = ((Rrc) dIr).A00;
            MontageAttributionData montageAttributionData = null;
            if (!09K.A01(rya.extensibleMetadata.montageStoryOverlays)) {
                List<QUR> list2 = rya.extensibleMetadata.montageStoryOverlays;
                ImmutableList.Builder A0h = 4YU.A0h();
                for (QUR qur : list2) {
                    int i = qur.setField_;
                    if (i == 1) {
                        S1s s1s = (S1s) QUR.A00(qur, 1);
                        ArrayList A0s = AnonymousClass001.A0s();
                        String valueOf = String.valueOf(s1s.pollId);
                        String str3 = s1s.style;
                        String str4 = s1s.questionText;
                        S1k s1k = s1s.votingControlBounds;
                        11T.A0F(s1k, 0);
                        Double d = s1k.xCoordinate;
                        11T.A09(d);
                        double doubleValue = d.doubleValue();
                        Double d2 = s1k.yCoordinate;
                        11T.A09(d2);
                        double doubleValue2 = d2.doubleValue();
                        Double d3 = s1k.width;
                        11T.A09(d3);
                        double doubleValue3 = d3.doubleValue();
                        Double d4 = s1k.height;
                        11T.A09(d4);
                        double doubleValue4 = d4.doubleValue();
                        Double d5 = s1k.rotation;
                        11T.A09(d5);
                        MontageStickerOverlayBounds montageStickerOverlayBounds = new MontageStickerOverlayBounds(doubleValue, doubleValue2, doubleValue3, doubleValue4, d5.doubleValue());
                        for (int i2 = 0; i2 < s1s.pollOptions.size(); i2++) {
                            A0s.add(new MontageFeedbackPollOption(null, 1BK.A14(s1s.pollOptions, i2), i2, 0, 0));
                        }
                        montageFeedbackOverlay = new MontageFeedbackOverlay(new MontageFeedbackPoll(null, montageStickerOverlayBounds, ImmutableList.copyOf((Collection) A0s), valueOf, str3, str4, null, -1, true, false));
                    } else if (i == 2) {
                        RzE rzE = (RzE) QUR.A00(qur, 2);
                        ArrayList A0s2 = AnonymousClass001.A0s();
                        String valueOf2 = String.valueOf(rzE.reactionStickerId);
                        String valueOf3 = String.valueOf(rzE.imageAssetId);
                        String str5 = rzE.reactionStickerUri;
                        MontageStickerOverlayBounds A00 = A00(rzE.bounds);
                        for (Rz2 rz2 : rzE.assets) {
                            A0s2.add(new MontageStickerAnimationAsset(A00(rz2.initialStateBounds), rz2.assetType, String.valueOf(rz2.assetId), rz2.assetUri));
                        }
                        montageFeedbackOverlay = new MontageFeedbackOverlay(new MontageReactionSticker(A00, ImmutableList.copyOf((Collection) A0s2), null, valueOf2, valueOf3, str5));
                    } else if (i == 3) {
                        S1t s1t = (S1t) QUR.A00(qur, 3);
                        6As A002 = C2578Ghr.A00(GOm.A00(49));
                        A002.setString(GOm.A00(4), s1t.backgroundColor);
                        A002.setString("emoji", s1t.emoji);
                        TreeBuilderJNI A0N = AbF.A0N(2tS.A00(), 6As.class, GOm.A00(173), 864418276);
                        A0N.setString(PublicKeyCredentialControllerUtility.JSON_KEY_ID, AbH.A1B(s1t.sliderPollId));
                        A002.setTree("slider_poll", A0N.getResult(2JX.class, 864418276));
                        A002.setString(GOm.A00(329), s1t.questionTextColor);
                        A002.A0A(GraphQLStringDefUtil.A00().ATw(1BJ.A00(ActionId.APP_MAIN), s1t.style), GOm.A00(346));
                        S2c s2c = s1t.bounds;
                        11T.A0F(s2c, 0);
                        6As A003 = 2JX.A00();
                        String str6 = s2c.xCoordinate;
                        11T.A09(str6);
                        A003.A07("x", Double.parseDouble(str6));
                        String str7 = s2c.yCoordinate;
                        11T.A09(str7);
                        A003.A07("y", Double.parseDouble(str7));
                        String str8 = s2c.width;
                        11T.A09(str8);
                        A003.A07(Property.ICON_TEXT_FIT_WIDTH, Double.parseDouble(str8));
                        String str9 = s2c.height;
                        11T.A09(str9);
                        A003.A07(Property.ICON_TEXT_FIT_HEIGHT, Double.parseDouble(str9));
                        String str10 = s2c.rotation;
                        11T.A09(str10);
                        A003.A07("rotation", Double.parseDouble(str10));
                        2JX A02 = A003.A02();
                        11T.A0A(A02);
                        A002.setTree(GOm.A00(370), A02);
                        TreeBuilderJNI A0N2 = AbF.A0N(2tS.A00(), 6As.class, "TextWithEntities", -1672642741);
                        A0N2.setString("text", s1t.questionText);
                        A002.setTree("question_text", A0N2.getResult(2JX.class, -1672642741));
                        C2578Ghr c2578Ghr = (C2578Ghr) A002.getResult(C2578Ghr.class, 431007235);
                        S2c s2c2 = s1t.bounds;
                        MontageStickerOverlayBounds montageStickerOverlayBounds2 = new MontageStickerOverlayBounds(Double.parseDouble(s2c2.xCoordinate), Double.parseDouble(s2c2.yCoordinate), Double.parseDouble(s2c2.width), Double.parseDouble(s2c2.height), Double.parseDouble(s2c2.rotation));
                        HashSet A0v = AnonymousClass001.A0v();
                        montageFeedbackOverlay = new MontageFeedbackOverlay(new MontageSliderSticker(c2578Ghr, null, montageStickerOverlayBounds2, s1t.backgroundColor, s1t.emoji, s1t.questionText, s1t.style, s1t.questionTextColor, 4YV.A0z("stickerBounds", A0v, A0v)));
                    } else if (i == 4) {
                        S1Z s1z = (S1Z) QUR.A00(qur, 4);
                        montageFeedbackOverlay = new MontageFeedbackOverlay(new MontageEventsSticker(A00(s1z.stickerBounds), String.valueOf(s1z.eventId), s1z.eventInfoBarStyle));
                    } else if (i == 6) {
                        Rz4 rz4 = (Rz4) QUR.A00(qur, 6);
                        Hsp hsp = new Hsp();
                        hsp.A02 = A00(rz4.bounds);
                        hsp.A08 = rz4.actionTitle;
                        hsp.A06 = rz4.attachedStoryId;
                        hsp.A07 = rz4.attachedStoryUrl;
                        hsp.A01(H9K.A01);
                        montageFeedbackOverlay = new MontageFeedbackOverlay(new MontageReshareContentSticker(hsp));
                    } else if (i == 7) {
                        Rz3 rz3 = (Rz3) QUR.A00(qur, 7);
                        Hsp hsp2 = new Hsp();
                        hsp2.A02 = A00(rz3.bounds);
                        hsp2.A08 = rz3.contentTitle;
                        hsp2.A06 = rz3.contentId.toString();
                        hsp2.A07 = rz3.contentUrl;
                        hsp2.A01(H9K.A02);
                        montageFeedbackOverlay = new MontageFeedbackOverlay(new MontageReshareContentSticker(hsp2));
                    } else if (i == 5) {
                        S1a s1a = (S1a) QUR.A00(qur, 5);
                        HashSet A0v2 = AnonymousClass001.A0v();
                        MontageStickerOverlayBounds A004 = A00(s1a.linkStickerBounds);
                        HashSet A07 = C1pq.A07(A004, "montageStickerOverlayBounds", A0v2, A0v2);
                        String str11 = s1a.linkStickerStyle;
                        C1pq.A08("style", str11);
                        String str12 = s1a.linkStickerUrl;
                        C1pq.A08("url", str12);
                        montageFeedbackOverlay = new MontageFeedbackOverlay(new MontageLinkSticker(A004, s1a.integrityContextIdentifier, str11, str12, A07));
                    }
                    A0h.m11011add((Object) montageFeedbackOverlay);
                }
                ImmutableList build = A0h.build();
                if (build != null) {
                    A0d.A0w = ImmutableList.copyOf((Collection) build);
                }
            }
            Ry3 ry3 = rya.extensibleMetadata.montageAttribution;
            if (ry3 != null) {
                List<Rye> list3 = ry3.attributionEntities;
                ImmutableList.Builder A0h2 = 4YU.A0h();
                if (list3 != null) {
                    for (Rye rye : list3) {
                        if (rye != null) {
                            A0h2.m11011add((Object) new EntityAtRange(new Entity(null, rye.url), rye.length.intValue(), rye.offset.intValue()));
                        }
                    }
                }
                montageAttributionData = new MontageAttributionData(null, A0h2.build(), ry3.plainText);
            }
            A0d.A0W = montageAttributionData;
            ImmutableList of = ImmutableList.of();
            ImmutableList of2 = ImmutableList.of();
            Rzz rzz = rya.extensibleMetadata;
            Long l = rzz.textFormatPresetId;
            ImmutableList copyOf = ImmutableList.copyOf((Collection) rzz.shareAttachmentIds);
            Rzz rzz2 = rya.extensibleMetadata;
            S0n s0n = rzz2.defaultBackground;
            S09 s09 = rzz2.backgroundColorInfo;
            if (s09 != null && !s09.colorInfo.isEmpty()) {
                String A005 = RWx.A00(((Rz1) s09.colorInfo.get(0)).topColor);
                String A006 = RWx.A00(((Rz1) s09.colorInfo.get(0)).bottomColor);
                if (A005 != null && A006 != null) {
                    ImmutableList of3 = ImmutableList.of((Object) A005, (Object) A006);
                    c48e = new C48e();
                    c48e.A00(of3);
                    c48e.A01("TOP_BOTTOM");
                    String A007 = RWx.A00(((Rz1) s09.colorInfo.get(0)).captionFontColor);
                    if (A007 != null) {
                        c48e.A02 = A007;
                    }
                    storyBackgroundInfo = new StoryBackgroundInfo(c48e);
                    Rzz rzz3 = rya.extensibleMetadata;
                    A0d.A0X = new MontageMetadata(storyBackgroundInfo, null, of, of2, copyOf, l, null, null, false, false, false, rzz3.canShowStoryInThread.booleanValue(), rzz3.hasLongTextMetadata.booleanValue(), rzz3.hasMediaText.booleanValue(), false, false, false);
                    A03 = 4YU.A0U(A0d);
                }
            }
            storyBackgroundInfo = null;
            if (s0n != null && (str2 = s0n.color) != null && !str2.isEmpty()) {
                ImmutableList.Builder builder = ImmutableList.builder();
                Ry4 ry4 = s0n.gradient;
                if (ry4 == null || (list = ry4.style) == null || list.isEmpty() || ((Ry5) 1BK.A0r(s0n.gradient.style)).color.isEmpty()) {
                    c48e = new C48e();
                    c48e.A00(ImmutableList.of((Object) s0n.color));
                } else {
                    Iterator it2 = s0n.gradient.style.iterator();
                    while (it2.hasNext()) {
                        String str13 = ((Ry5) it2.next()).color;
                        if (str13 != null && !str13.isEmpty()) {
                            builder.m11011add((Object) str13);
                        }
                    }
                    c48e = new C48e();
                    c48e.A00(builder.build());
                    String str14 = s0n.gradient.direction;
                    if (str14 != null) {
                        c48e.A01(GraphQLStringDefUtil.A00().ATw(1BJ.A00(ActionId.APP_WILL_ENTER_FOREGROUND), str14));
                    }
                }
                storyBackgroundInfo = new StoryBackgroundInfo(c48e);
            }
            Rzz rzz32 = rya.extensibleMetadata;
            A0d.A0X = new MontageMetadata(storyBackgroundInfo, null, of, of2, copyOf, l, null, null, false, false, false, rzz32.canShowStoryInThread.booleanValue(), rzz32.hasLongTextMetadata.booleanValue(), rzz32.hasMediaText.booleanValue(), false, false, false);
            A03 = 4YU.A0U(A0d);
        }
        return A03;
    }

    public SingletonImmutableSet A05(D1U d1u) {
        return AbN.A0g(d1u.messageMetadata, AbM.A0h(this.A0E));
    }

    public void A06(ThreadSummary threadSummary, D1U d1u) {
        Message A04 = A04(threadSummary, new Rrb(d1u));
        NewMessageResult newMessageResult = new NewMessageResult(EnumC08284mf.A06, A04, null, threadSummary, this.A01.now());
        boolean equals = Boolean.TRUE.equals(d1u.messageMetadata.shouldBuzzDevice);
        String str = A04.A1V;
        if (str != null) {
            this.A0G.A00("recovered", str);
        }
        C00j.A05("DeltaNewMessageHandler.HandleZpFromDeltaCovered", 475953865);
        try {
            A02(newMessageResult, equals);
            C00j.A01(1052076067);
            if (str != null) {
                this.A0B.get();
            }
        } catch (Throwable th) {
            C00j.A01(-1496210832);
            throw th;
        }
    }

    public void A07(NewMessageResult newMessageResult) {
        NewMessageNotification A01;
        Message message = newMessageResult.A00;
        ParticipantInfo participantInfo = message.A0K;
        participantInfo.getClass();
        String A00 = participantInfo.A00();
        if (A00 == null || A00.equals(this.A0L.get()) || (A01 = this.A05.A01(newMessageResult)) == null) {
            return;
        }
        A01(A01, this);
        ThreadKey threadKey = message.A0V;
        if (threadKey != null) {
            this.A04.A03(threadKey, A01);
        }
    }

    public void A08(NewMessageResult newMessageResult, D1U d1u, long j) {
        if (newMessageResult != null) {
            0fH.A0g(newMessageResult.A00.A1V, __redex_internal_original_name, "Handling %s in cache");
        }
        boolean equals = d1u.messageMetadata.actorFbId.toString().equals(this.A0L.get());
        if (!equals) {
            this.A0G.A00("cache", d1u.messageMetadata.messageId);
        }
        C00j.A05("DeltaNewMessageHandler.HandleZpFromCache", 1217126650);
        try {
            A09(newMessageResult, d1u, j);
            C00j.A01(-1442258461);
            if (equals) {
                this.A0F.A08(null, 0S2.A01, d1u.messageMetadata.offlineThreadingId.toString());
            }
            this.A0B.get();
            if (newMessageResult != null) {
                this.A04.A02(newMessageResult.A00, j);
            }
        } catch (Throwable th) {
            C00j.A01(1537812271);
            throw th;
        }
    }

    public void A09(NewMessageResult newMessageResult, D1U d1u, long j) {
        if (newMessageResult != null) {
            boolean equals = d1u != null ? Boolean.TRUE.equals(d1u.messageMetadata.shouldBuzzDevice) : false;
            this.A0I.A0C(newMessageResult, j);
            Message message = newMessageResult.A00;
            0fH.A0a(message != null ? message.A1V : null, Long.valueOf(j), Boolean.valueOf(equals), __redex_internal_original_name, "notif_create for message: %s, seqId: %d, zp: %B");
            A02(newMessageResult, equals);
        }
    }
}
