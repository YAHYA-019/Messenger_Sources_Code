package X;

import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.messages.MessagesCollection;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.google.common.base.Objects;

/* renamed from: X.2fN, reason: invalid class name */
/* loaded from: 2fN.class */
public final class C2fN {
    public final C00i A02;
    public final 2fK A03;
    public final 2fJ A04;
    public final boolean A05;
    public final 0QO A01 = new 0QO(0);
    public final 0QO A00 = new 0QO(0);

    public C2fN(C00i c00i, 2fK r303, 2fJ r304, boolean z) {
        this.A03 = r303;
        this.A04 = r304;
        this.A02 = c00i;
        this.A05 = z;
    }

    public static String A00(MessagesCollection messagesCollection) {
        StringBuilder A0l = AnonymousClass001.A0l(1024);
        A0l.append("[");
        1Du it = messagesCollection.A01.iterator();
        int i = 0;
        while (it.hasNext()) {
            A0l.append(((Message) it.next()).A1V);
            A0l.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
            i++;
            if (i >= 10) {
                break;
            }
        }
        return AnonymousClass001.A0d("]", A0l);
    }

    public Message A01(ThreadKey threadKey, String str) {
        this.A03.A01();
        MessagesCollection messagesCollection = (MessagesCollection) this.A01.get(threadKey);
        if (messagesCollection == null) {
            return null;
        }
        1Du it = messagesCollection.A01.iterator();
        while (it.hasNext()) {
            Message message = (Message) it.next();
            if (Objects.equal(message.A1g, str)) {
                return message;
            }
        }
        return null;
    }

    public Message A02(String str) {
        this.A03.A01();
        return (Message) this.A00.get(str);
    }

    public MessagesCollection A03(ThreadKey threadKey) {
        this.A03.A01();
        return (MessagesCollection) this.A01.get(threadKey);
    }

    public MessagesCollection A04(ThreadKey threadKey) {
        this.A03.A01();
        if (threadKey != null) {
            0fH.A0g(threadKey.toString(), "MessagesCache", "Removing messages for %s");
            2fJ r0 = this.A04;
            MessagesCollection A03 = A03(threadKey);
            synchronized (r0) {
                if (2fJ.A05(r0) && 2fJ.A07(threadKey) && 2fJ.A06(r0)) {
                    2fJ.A03(2fJ.A01(A03 == null ? null : 2fJ.A00(A03.A01, true), r0, threadKey, "removeMessagesFromCache", (String) null), r0);
                }
            }
        }
        MessagesCollection messagesCollection = (MessagesCollection) this.A01.remove(threadKey);
        if (messagesCollection != null) {
            1Du it = messagesCollection.A01.iterator();
            while (it.hasNext()) {
                this.A00.remove(((Message) it.next()).A1V);
            }
        }
        return messagesCollection;
    }

    public void A05() {
        0fH.A0j("MessagesCache", "Clearing whole cache");
        this.A03.A01();
        this.A01.clear();
        this.A00.clear();
        2fJ r0 = this.A04;
        synchronized (r0) {
            if (2fJ.A05(r0) && 2fJ.A06(r0)) {
                2fJ.A03(2fJ.A01((3Kb) null, r0, (ThreadKey) null, "clearAllMessagesFromCache", (String) null), r0);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b3, code lost:
    
        if (r0 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00e5, code lost:
    
        if (r318 == r320) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0161, code lost:
    
        if (r318 <= r320) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0152, code lost:
    
        if (r318 == r320) goto L25;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A06(com.facebook.messaging.model.messages.MessagesCollection r302, com.facebook.user.model.User r303, boolean r304, boolean r305) {
        /*
            Method dump skipped, instructions count: 1131
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2fN.A06(com.facebook.messaging.model.messages.MessagesCollection, com.facebook.user.model.User, boolean, boolean):void");
    }
}
