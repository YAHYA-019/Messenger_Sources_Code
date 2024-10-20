package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.contacts.picker.SingleTapActionConfig;

/* loaded from: B69.class */
public final class B69 extends C30 {
    public final FbUserSession A00;
    public final SingleTapActionConfig A01;
    public final boolean A02;
    public final /* synthetic */ C1623Ao1 A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B69(FbUserSession fbUserSession, SingleTapActionConfig singleTapActionConfig, C1623Ao1 c1623Ao1, boolean z) {
        super(C1yg.ONE_TO_ONE, c1623Ao1);
        this.A03 = c1623Ao1;
        this.A00 = fbUserSession;
        this.A02 = z;
        this.A01 = singleTapActionConfig;
    }
}
