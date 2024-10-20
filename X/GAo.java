package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import kotlin.jvm.functions.Function1;

/* loaded from: GAo.class */
public final class GAo extends C00q implements Function1 {
    public final /* synthetic */ EzN $canceledWindow;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ FbUserSession $fbUserSession;
    public final /* synthetic */ 0CL $feedbackWindow;
    public final /* synthetic */ long $targetUserId;
    public final /* synthetic */ C4T9 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GAo(Context context, FbUserSession fbUserSession, EzN ezN, C4T9 c4t9, 0CL r306, long j) {
        super(1);
        this.$feedbackWindow = r306;
        this.this$0 = c4t9;
        this.$fbUserSession = fbUserSession;
        this.$targetUserId = j;
        this.$context = context;
        this.$canceledWindow = ezN;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        EzN ezN = (EzN) this.$feedbackWindow.element;
        if (ezN != null) {
            ezN.A00();
        }
        C4T9 c4t9 = this.this$0;
        ((C9cm) 1Bu.A06(this.$context, 68473)).A01(this.$fbUserSession, null, c4t9.A00, this.$targetUserId);
        this.$canceledWindow.A01();
        return 04S.A00;
    }
}
