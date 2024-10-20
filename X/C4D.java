package X;

import android.content.Context;
import android.text.Spannable;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.share.SentShareAttachment;
import com.facebook.messaging.model.share.Share;
import com.facebook.messaging.sharing.broadcastflow.intent.model.BroadcastFlowIntentModel;
import com.facebook.messaging.sharing.broadcastflow.intent.model.ContactShareIntentModel;
import com.facebook.messaging.sharing.broadcastflow.intent.model.FacebookStoryIntentModel;
import com.facebook.messaging.sharing.broadcastflow.intent.model.ForwardIntentModel;
import com.facebook.messaging.sharing.broadcastflow.intent.model.LinkShareIntentModel;
import com.facebook.messaging.sharing.broadcastflow.intent.model.MediaShareIntentModel;
import com.facebook.messaging.sharing.broadcastflow.intent.model.TextShareIntentModel;
import com.facebook.ui.media.attachments.model.MediaResource;
import com.facebookpay.offsite.models.message.OffsiteInitAvailabilityRequestKt;
import com.google.common.collect.ImmutableList;

/* loaded from: C4D.class */
public final class C4D {
    public final 1Br A00;
    public final 1De A01;
    public final Bqf A02;

    public C4D(1De r302) {
        this.A01 = r302;
        1BY r0 = r302.A00;
        this.A02 = (Bqf) 1Bn.A0E((Context) null, r0, 83895);
        this.A00 = 1Bu.A03(r0, 83982);
    }

    public final String A00(BroadcastFlowIntentModel broadcastFlowIntentModel) {
        String obj;
        String A0x;
        6Ay BCm;
        7ZM A0w;
        6BJ A0z;
        String BHd;
        String str;
        if (broadcastFlowIntentModel == null) {
            return OffsiteInitAvailabilityRequestKt.DEFAULT_PARTNER_ID;
        }
        if (!(broadcastFlowIntentModel instanceof ForwardIntentModel)) {
            if (!(broadcastFlowIntentModel instanceof MediaShareIntentModel)) {
                if (broadcastFlowIntentModel instanceof FacebookStoryIntentModel) {
                    return ((FacebookStoryIntentModel) broadcastFlowIntentModel).A00.A08;
                }
                if (!(broadcastFlowIntentModel instanceof LinkShareIntentModel)) {
                    return broadcastFlowIntentModel instanceof TextShareIntentModel ? ((TextShareIntentModel) broadcastFlowIntentModel).A00.isExternalShareSource ? "EXTERNAL_TEXT_SHARE" : "TEXT_SHARE" : ((broadcastFlowIntentModel instanceof ContactShareIntentModel) && ((ContactShareIntentModel) broadcastFlowIntentModel).A00.A07) ? "AI_AGENT" : broadcastFlowIntentModel.AWi();
                }
                LinkShareIntentModel linkShareIntentModel = (LinkShareIntentModel) broadcastFlowIntentModel;
                return linkShareIntentModel.A00.isExternalShareSource ? "EXTERNAL_LINK_SHARE" : linkShareIntentModel.A02;
            }
            MediaShareIntentModel mediaShareIntentModel = (MediaShareIntentModel) broadcastFlowIntentModel;
            ImmutableList immutableList = mediaShareIntentModel.A02;
            if (immutableList.isEmpty()) {
                return "MEDIA_SHARE_EMPTY";
            }
            StringBuilder A0k = AnonymousClass001.A0k();
            if (mediaShareIntentModel.A01.isExternalShareSource) {
                A0k.append("EXTERNAL_");
            }
            5HP r0 = ((MediaResource) 1BK.A0r(immutableList)).A0Q;
            1Du it = immutableList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    A0k.append("MEDIA_SHARE_");
                    obj = r0.toString();
                    break;
                }
                if (r0 != 4YU.A0Z(it).A0Q) {
                    obj = "MEDIA_SHARE_MIXED";
                    break;
                }
            }
            A0k.append(obj);
            return 11T.A02(A0k);
        }
        CJ3 cj3 = (CJ3) 1De.A00(this.A01, 83912);
        if (cj3.A02(broadcastFlowIntentModel)) {
            return "FORWARD_TEXT";
        }
        ForwardIntentModel forwardIntentModel = (ForwardIntentModel) broadcastFlowIntentModel;
        if (cj3.A04(forwardIntentModel)) {
            return "FORWARD_CONTACT_SHARE";
        }
        1Br.A0C(this.A00);
        if (11T.A0O(broadcastFlowIntentModel.Ayo().A05, 4YT.A00(93))) {
            return "BROADCAST_CHANNEL";
        }
        Bqf bqf = this.A02;
        Message message = forwardIntentModel.A00;
        String str2 = OffsiteInitAvailabilityRequestKt.DEFAULT_PARTNER_ID;
        if (message != null) {
            int ordinal = C00653oY.A00(bqf.A01, message).ordinal();
            if (ordinal == 5) {
                str2 = "STICKER";
            } else if (ordinal == 7) {
                str2 = "AUDIO";
            } else if (ordinal != 8) {
                SentShareAttachment sentShareAttachment = message.A0R;
                Share share = sentShareAttachment != null ? sentShareAttachment.A02 : null;
                ImmutableList immutableList2 = message.A10;
                Share share2 = (immutableList2 == null || immutableList2.isEmpty()) ? null : (Share) immutableList2.get(0);
                C12114ys c12114ys = bqf.A00;
                if (c12114ys.A0H(message)) {
                    str2 = "PHOTO";
                } else if (c12114ys.A0I(message) || ((A0x = 4YU.A0x(message)) != null && 53W.A00(Spannable.Factory.getInstance().newSpannable(A0x), (C5um) null, (C5un) null, (C5n1) null, 15))) {
                    str2 = "LINK_OR_XMA_SHARE";
                } else if (share != null) {
                    str2 = "FACEBOOK_SHARE";
                } else if (C1q7.A0D(message)) {
                    str2 = "TEXT";
                } else {
                    String str3 = message.A1l;
                    if (str3 != null) {
                        String A1A = AbJ.A1A(str3);
                        String A00 = 4YT.A00(744);
                        if (A1A.equals(A00)) {
                            str2 = A00;
                        }
                    }
                    if (share2 == null || (str = share2.A0C) == null || str.length() == 0) {
                        5Pm r02 = message.A08;
                        if (r02 != null && (BCm = r02.BCm()) != null && (A0w = BCm.A0w()) != null && (A0z = A0w.A0z()) != null && (BHd = A0z.BHd()) != null && BHd.length() != 0) {
                            str2 = AbJ.A1A(BHd);
                        }
                    } else {
                        str2 = 0CU.A0T(1BK.A13(str), "instagram.com", false) ? "INSTAGRAM" : "OTHER_XMA";
                    }
                }
            } else {
                str2 = "VIDEO";
            }
        }
        return 0Pz.A0W("FORWARD_", str2);
    }
}
