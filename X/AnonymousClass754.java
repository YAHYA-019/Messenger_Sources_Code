package X;

import com.facebook.messaging.model.threadkey.ThreadKey;

/* renamed from: X.754, reason: invalid class name */
/* loaded from: 754.class */
public final class AnonymousClass754 {
    public final 1Br A00 = 1Bq.A00(16634);

    public static final void A00(ThreadKey threadKey, AnonymousClass754 anonymousClass754, C5fv c5fv, String str, String str2, long j) {
        C5fr c5fr;
        1UG A00 = 1UD.A00((04J) anonymousClass754.A00.A00.get(), 1ZG.A01, "message_action");
        if (A00.isSampled()) {
            A00.A7R("action", str);
            A00.A7R("entry_point", str2);
            A00.A7R("message_type", "t");
            A00.A7R("mid", "NULL");
            A00.A7R("reaction", "NULL");
            A00.A7R("reaction_prior", "NULL");
            A00.A0E("threadid", String.valueOf(threadKey.A0s()));
            A00.A7R("thread_type", ThreadKey.A0Q(threadKey) ? "armadillo_one_to_one" : "armadillo_group");
            A00.A7R("recipient_id", (c5fv == null || (c5fr = ((C5fu) c5fv).A05) == null) ? null : c5fr.A06);
            A00.A6H("groupsize", Long.valueOf(j));
            A00.A6J("extra", (java.util.Map) null);
            A00.BZL();
        }
    }
}
