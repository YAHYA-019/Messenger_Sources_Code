package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: D83.class */
public final class D83 implements Runnable {
    public static final String __redex_internal_original_name = "M4OmnipickerAddGroupMemberFragment$23";
    public final /* synthetic */ ThreadKey A00;
    public final /* synthetic */ B7E A01;

    public D83(ThreadKey threadKey, B7E b7e) {
        this.A01 = b7e;
        this.A00 = threadKey;
    }

    @Override // java.lang.Runnable
    public void run() {
        B7E b7e = this.A01;
        CaE.A03(b7e, ((C5xl) b7e.A03.get()).ASY(this.A00), this, ActionId.DATA_LOAD_START);
    }
}
