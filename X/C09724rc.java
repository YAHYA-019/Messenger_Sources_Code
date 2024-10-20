package X;

import com.facebook.common.util.TriState;
import com.facebook.user.model.User;
import com.google.common.collect.ImmutableList;

/* renamed from: X.4rc, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4rc.class */
public final class C09724rc implements 4qU {
    public final /* synthetic */ 4rZ A00;

    public C09724rc(4rZ r302) {
        this.A00 = r302;
    }

    public Iterable B0L() {
        return ImmutableList.of((Object) new C4r6(TriState.UNSET, this.A00.A01, null, null, "fetchFacebookEmployeeStatus"));
    }

    public void CA9(java.util.Map map) {
        1Ew r0;
        User Auc;
        Boolean bool = (Boolean) map.get("fetchFacebookEmployeeStatus");
        if (bool == null || (Auc = (r0 = this.A00.A00).Auc()) == null) {
            return;
        }
        1Kh r02 = new 1Kh();
        r02.A03(Auc);
        r02.A1Z = bool.booleanValue();
        r0.CjX(new User(r02));
    }
}
