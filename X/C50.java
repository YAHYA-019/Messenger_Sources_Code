package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.messaging.model.attribution.ContentAppAttribution;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.messages.ParticipantInfo;
import com.facebook.messaging.model.send.PendingSendQueueKey;
import com.facebook.messaging.model.send.SendError;
import com.facebook.messaging.model.share.SentShareAttachment;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.share.model.ComposerAppAttribution;
import com.facebook.ui.media.attachments.model.MediaResource;
import com.google.common.base.Objects;
import com.google.common.collect.ImmutableList;
import com.mapbox.mapboxsdk.style.layers.Property;
import org.json.JSONObject;

/* loaded from: C50.class */
public final class C50 {
    public 1BY A00;
    public final C00653oY A03 = (C00653oY) 1Bi.A03(32769);
    public final C1q7 A04 = (C1q7) 1Bi.A03(16822);
    public final C15h A01 = DBe.A00(this, 56);
    public final 4yR A02 = (4yR) 1Bn.A0B(49397);

    public C50(1BO r302) {
        this.A00 = 7zL.A0Q(r302);
    }

    public JSONObject A00(Message message) {
        ParticipantInfo participantInfo;
        String str;
        int i;
        if (message == null || (participantInfo = message.A0K) == null) {
            return null;
        }
        JSONObject A12 = AnonymousClass001.A12();
        ThreadKey threadKey = message.A0V;
        JSONObject put = A12.put("thread_type", threadKey.A06.name());
        SendError A08 = message.A08();
        5PN r0 = A08.A02;
        JSONObject put2 = put.put("sendError.type", r0.serializedString);
        if (!ThreadKey.A0q(threadKey)) {
            JSONObject put3 = put2.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, message.A1V).put("timeStampMs", message.A05).put("thread_key", threadKey).put("msgType", message.A04().dbKeyValue).put("msgLogType", this.A03.A01(message));
            long j = message.A04;
            JSONObject put4 = put3.put(4YT.A00(1480), j > 0 ? Long.toString(j) : "").put("senderInfo", participantInfo);
            String A0x = 4YU.A0x(message);
            JSONObject put5 = put4.put("text length", A0x == null ? -1 : A0x.length());
            ImmutableList immutableList = message.A0r;
            JSONObject put6 = put5.put("attachments.count", immutableList == null ? -1 : immutableList.size());
            ImmutableList immutableList2 = message.A10;
            JSONObject put7 = put6.put("shares.count", immutableList2 == null ? -1 : immutableList2.size()).put("offlineThreadingId", message.A1g).put(4YT.A00(1176), message.A21).put(Property.SYMBOL_Z_ORDER_SOURCE, message.A1l).put(AbstractC00603o4.A00(434), message.A02().name()).put("sendChannel", message.A03().name()).put("sentByUser", Objects.equal(this.A01.get(), participantInfo.A0F.id)).put("sentByDevice", AnonymousClass001.A1N((j > 0L ? 1 : (j == 0L ? 0 : -1)))).put("sendError.type.shouldNotBeRetried", r0.shouldNotBeRetried).put("sendError.errorMessage", A08.A06);
            String str2 = A08.A03;
            str = "";
            if (str2 == null) {
                str2 = str;
            }
            JSONObject put8 = put7.put("sendError.detail", str2);
            String str3 = A08.A07;
            if (str3 == null) {
                str3 = str;
            }
            JSONObject put9 = put8.put("sendError.originalException", str3).put("sendError.errorNumber", A08.A00);
            long j2 = A08.A01;
            JSONObject put10 = put9.put("sendError.timeStamp", j2 > 0 ? Long.toString(j2) : str).put("mediaAttachments.type", !C1q7.A0A(message) ? "none" : ((MediaResource) 1BK.A0r(message.A0z)).A0Q.toString());
            if (C1q7.A0A(message)) {
                ImmutableList immutableList3 = message.A0z;
                int size = immutableList3.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    i = (int) (i + 4YU.A0a(immutableList3, i2).A07);
                }
            } else {
                i = -1;
            }
            JSONObject put11 = put10.put("mediaAttachments.totalSize", i);
            ImmutableList immutableList4 = message.A0z;
            JSONObject put12 = put11.put("mediaAttachments.count", immutableList4 == null ? -1 : immutableList4.size()).put("hasUnavailableAttachment", message.A1v).put("publicity", message.A06().A00).put("clientTags", 4yR.A00(message.A13));
            PendingSendQueueKey pendingSendQueueKey = message.A0P;
            JSONObject put13 = put12.put("sendQueueType", pendingSendQueueKey == null ? str : pendingSendQueueKey.A00.serializedValue);
            SentShareAttachment sentShareAttachment = message.A0R;
            JSONObject put14 = put13.put("sentShareAttachments.type", sentShareAttachment == null ? str : sentShareAttachment.A01.DBSerialValue);
            ComposerAppAttribution composerAppAttribution = message.A0g;
            JSONObject put15 = put14.put("composerAppAttribution.appId", composerAppAttribution == null ? str : composerAppAttribution.A01);
            ContentAppAttribution contentAppAttribution = message.A09;
            put15.put("contentAppAttribution.appId", contentAppAttribution == null ? str : contentAppAttribution.A04).put("montage_reply_message_id", message.A1Z).put("montage_reply_action", message.A1C != null ? "MESSAGE_REACTION" : "");
        }
        return put2;
    }
}
