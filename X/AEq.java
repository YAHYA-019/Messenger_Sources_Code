package X;

import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: AEq.class */
public final class AEq implements Runnable {
    public static final String __redex_internal_original_name = "PeopleYouMayKnowItemActionHandler$onOpenThreadViewForUser$1$1";
    public final /* synthetic */ ThreadKey A00;
    public final /* synthetic */ 6HS A01;

    public AEq(ThreadKey threadKey, 6HS r303) {
        this.A01 = r303;
        this.A00 = threadKey;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A01.A07(this.A00, "inbox_pymk");
    }
}
