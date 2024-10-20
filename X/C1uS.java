package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1uS, reason: invalid class name */
/* loaded from: 1uS.class */
public final class C1uS {
    public static final List A01;
    public static final List A04;
    public final 1Br A00 = 1Bq.A00(16385);
    public static final List A03 = C0s8.A14("threads", "messages", "reactions", "attachments", "participants", "attachment_ctas", "attachment_items");
    public static final List A06 = C0s8.A14("client_threads", "client_reactions_v2", "client_participants", "client_messages");
    public static final List A02 = C0s8.A14(0, 0, 0, 0, 0, 3, 0);
    public static final List A05 = C0s8.A14(0, 0, 1, 1);

    static {
        int i = 0;
        ArrayList arrayList = new ArrayList(7);
        int i2 = 0;
        do {
            arrayList.add("thread_key");
            i2++;
        } while (i2 < 7);
        A01 = arrayList;
        ArrayList arrayList2 = new ArrayList(4);
        do {
            arrayList2.add("thread_pk");
            i++;
        } while (i < 4);
        A04 = arrayList2;
    }
}
