package X;

import android.content.Context;
import android.content.Intent;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.search.data.model.MessageSearchMatchRangesModel;
import com.facebook.messaging.search.messages.plugins.threadviewopener.advancedcrypto.inchatsearch.InChatSearchThreadViewOpener;
import com.facebook.xapp.messaging.matchedmessage.MessageMatchRange;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: LX4.class */
public final class LX4 implements JFR {
    public final /* synthetic */ InChatSearchThreadViewOpener A00;

    public LX4(InChatSearchThreadViewOpener inChatSearchThreadViewOpener) {
        this.A00 = inChatSearchThreadViewOpener;
    }

    public void Bq2(long j) {
        InChatSearchThreadViewOpener inChatSearchThreadViewOpener = this.A00;
        if (inChatSearchThreadViewOpener.A05) {
            return;
        }
        Context context = inChatSearchThreadViewOpener.A00;
        ThreadKey threadKey = inChatSearchThreadViewOpener.A01;
        ImmutableList immutableList = inChatSearchThreadViewOpener.A02;
        ArrayList A0z = 1BL.A0z(immutableList);
        Iterator it = immutableList.iterator();
        while (it.hasNext()) {
            MessageSearchMatchRangesModel messageSearchMatchRangesModel = (MessageSearchMatchRangesModel) it.next();
            A0z.add(new MessageMatchRange(messageSearchMatchRangesModel.A00, messageSearchMatchRangesModel.A01));
        }
        Intent putExtra = C3Qg.A00(context, threadKey, 1BK.A17(A0z)).putExtra(AbE.A00(389), j);
        11T.A0A(putExtra);
        0LS.A0A(context, putExtra);
    }
}
