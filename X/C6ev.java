package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: X.6ev, reason: invalid class name */
/* loaded from: 6ev.class */
public final class C6ev {
    public Gson A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final ConcurrentLinkedQueue A04;

    public C6ev(FbUserSession fbUserSession) {
        11T.A0F(fbUserSession, 1);
        this.A01 = 1Bq.A00(99390);
        this.A02 = 1Bq.A00(16511);
        this.A04 = new ConcurrentLinkedQueue();
        this.A03 = 1Lm.A01(fbUserSession, 17143);
    }

    public static final void A00(C6ev c6ev) {
        if (c6ev.A00 == null) {
            c6ev.A00 = new Gson();
        }
        1Br.A0C(c6ev.A02);
        Gson gson = c6ev.A00;
        if (gson == null) {
            throw 1BK.A0h();
        }
        gson.A06(c6ev.A04);
    }

    public static final void A01(C6ev c6ev, String str) {
        ConcurrentLinkedQueue concurrentLinkedQueue = c6ev.A04;
        synchronized (concurrentLinkedQueue) {
            concurrentLinkedQueue.add(str);
            if (concurrentLinkedQueue.size() > 50) {
                concurrentLinkedQueue.remove();
            }
        }
    }

    public final void A02(ThreadKey threadKey, String str) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("event", "forceUpdateMessageListUI");
        jsonObject.addProperty("reason", str);
        jsonObject.addProperty("thread_key", threadKey != null ? threadKey.toString() : null);
        jsonObject.addProperty("timestampMS", Long.valueOf(((C0dp) this.A01.A00.get()).now()));
        String obj = jsonObject.toString();
        11T.A0A(obj);
        A01(this, obj);
    }
}
