package X;

import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.service.model.SendMessageToPendingThreadParams;
import com.facebook.messaging.service.model.SendMessageToPendingThreadResult;
import com.google.common.base.Preconditions;
import java.util.ArrayList;
import org.apache.http.message.BasicNameValuePair;

/* loaded from: Cgm.class */
public final class Cgm implements 1Ro {
    public static final String __redex_internal_original_name = "SendMessageToPendingThreadMethod";
    public final CB9 A01 = (CB9) 1Bi.A03(83100);
    public final C1g A00 = (C1g) 1Bn.A0A(84649);

    public /* bridge */ /* synthetic */ C04103zy B7F(Object obj) {
        SendMessageToPendingThreadParams sendMessageToPendingThreadParams = (SendMessageToPendingThreadParams) obj;
        sendMessageToPendingThreadParams.getClass();
        Message message = sendMessageToPendingThreadParams.A01;
        message.getClass();
        ThreadKey threadKey = message.A0V;
        threadKey.getClass();
        Preconditions.checkArgument(threadKey.A1P());
        ArrayList A0s = AnonymousClass001.A0s();
        A0s.add(new BasicNameValuePair("to", CB9.A00(sendMessageToPendingThreadParams.A02).toString()));
        A0s.add(new BasicNameValuePair(4YT.A00(194), "true"));
        this.A00.A00(message, null, null, A0s);
        C04083zw c04083zw = new C04083zw();
        AbF.A1Q(c04083zw, "sendMessageToPendingThread");
        return AbK.A0M(c04083zw, "/threads", A0s);
    }

    public /* bridge */ /* synthetic */ Object B7m(AnonymousClass439 anonymousClass439, Object obj) {
        return new SendMessageToPendingThreadResult(ThreadKey.A08(4YV.A07(anonymousClass439.A01(), "thread_fbid")));
    }
}
