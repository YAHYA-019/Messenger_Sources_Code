package X;

import android.content.Intent;
import com.facebook.acra.constants.ActionId;
import com.facebook.common.util.JSONUtil;
import com.facebook.messaging.model.messages.Message;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;

/* loaded from: Cgl.class */
public final class Cgl implements 1Ro {
    public static final String __redex_internal_original_name = "SendMessageToMontageMethod";
    public final C1g A00 = (C1g) 1Bn.A0A(84649);
    public final 53J A01 = (53J) 1Bi.A03(49476);

    public /* bridge */ /* synthetic */ C04103zy B7F(Object obj) {
        ArrayList A0s = AnonymousClass001.A0s();
        this.A00.A00((Message) obj, null, null, A0s);
        C04083zw c04083zw = new C04083zw();
        AbF.A1Q(c04083zw, "sendMessage");
        return AbK.A0M(c04083zw, "me/montage_thread_messages", A0s);
    }

    public /* bridge */ /* synthetic */ Object B7m(AnonymousClass439 anonymousClass439, Object obj) {
        Message message = (Message) obj;
        long parseLong = Long.parseLong(JSONUtil.A0H(anonymousClass439.A01().A0D("thread_fbid"), null));
        ImmutableList A0C = JSONUtil.A0C(anonymousClass439.A01(), "mentioned_message_recipients_ids");
        if (A0C != null && !A0C.isEmpty()) {
            1Uv r0 = (1Uv) 1Bi.A03(16688);
            String A0P = C3o5.A0P(anonymousClass439.A01(), "story_card_fbid", null);
            ImmutableList immutableList = message.A0z;
            String A0P2 = (immutableList.isEmpty() || 4YU.A0a(immutableList, 0).A0s == null || !4YU.A0a(immutableList, 0).A0s.equals("video/mp4") || 4YU.A0a(immutableList, 0).A0D == null) ? C3o5.A0P(anonymousClass439.A01(), "thumbnail_image_uri", null) != null ? C3o5.A0P(anonymousClass439.A01(), "thumbnail_image_uri", null) : "null" : 4YU.A0a(immutableList, 0).A0D.toString();
            24X A01 = anonymousClass439.A01();
            String A00 = 4YT.A00(1506);
            String A0P3 = C3o5.A0P(A01, A00, null);
            if (A0P != null && !A0P2.equals("null") && A0P3 != null) {
                Intent A0A = 4YU.A0A("MONTAGE_MESSAGE_SENT_RESPONSE_GET");
                A0A.putExtra(GOm.A00(75), message);
                A0A.putExtra(4YT.A00(395), A0P);
                A0A.putStringArrayListExtra(4YT.A00(ActionId.PRIVACY_VIOLATION), 1BK.A17(A0C));
                A0A.putExtra(7zK.A00(ActionId.VIDEO_PLAYING), A0P2);
                A0A.putExtra(A00, A0P3);
                1Uv.A02(A0A, r0);
            }
        }
        return 53J.A00(parseLong);
    }
}
