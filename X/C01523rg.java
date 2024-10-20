package X;

import android.content.Context;
import android.content.Intent;
import com.facebook.inject.FbInjector;
import com.facebook.messaging.model.messages.Message;
import com.facebook.presence.model.PresenceList;
import com.google.common.collect.ImmutableList;

/* renamed from: X.3rg, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3rg.class */
public final class C01523rg {
    public final Context A00;
    public final 1I7 A01;
    public final 2AG A02;

    public C01523rg() {
        Context A00 = FbInjector.A00();
        this.A00 = A00;
        this.A02 = (2AG) 1Bi.A03(83853);
        11T.A0A(A00);
        this.A01 = (1I7) 1Hv.A02(A00, 65728);
    }

    public final void A00(Message message) {
        Intent intent = new Intent("com.facebook.presence.ACTION_PUSH_RECEIVED");
        intent.putExtra("extra_message", message);
        this.A01.CkS(intent);
        this.A02.A00(intent, this.A00);
    }

    public final void A01(PresenceList presenceList, String str, String str2, boolean z) {
        Intent intent = new Intent("com.facebook.presence.ACTION_PRESENCE_RECEIVED");
        intent.putExtra("extra_topic_name", str);
        intent.putExtra("extra_request_id", str2);
        ImmutableList immutableList = presenceList.A00;
        if (1000 < immutableList.size()) {
            presenceList = new PresenceList(immutableList.subList(0, 1000));
        }
        intent.putExtra("extra_presence_map", presenceList);
        intent.putExtra("extra_full_list", z);
        this.A01.CkS(intent);
        this.A02.A00(intent, this.A00);
    }
}
