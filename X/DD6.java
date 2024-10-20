package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import kotlin.jvm.functions.Function1;

/* loaded from: DD6.class */
public final class DD6 extends C00q implements Function1 {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ FbUserSession $fbUserSession;
    public final /* synthetic */ String $pageId;
    public final /* synthetic */ ThreadKey $threadKey;
    public final /* synthetic */ String $userId;
    public final /* synthetic */ CFs this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DD6(Context context, FbUserSession fbUserSession, CFs cFs, ThreadKey threadKey, String str, String str2) {
        super(1);
        this.this$0 = cFs;
        this.$pageId = str;
        this.$userId = str2;
        this.$fbUserSession = fbUserSession;
        this.$context = context;
        this.$threadKey = threadKey;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str = this.$pageId;
        String str2 = this.$userId;
        1UG A08 = 1BK.A08(4YV.A0B(), "call_confirm_call_prompt_xma_click");
        if (A08.isSampled()) {
            try {
                4YU.A1H(A08, Long.parseLong(str));
                A08.A6H("user_id", 1BK.A0n(str2));
                A08.BZL();
            } catch (NumberFormatException e) {
                0fH.A14("BizRtcCallCTAUtil", "logCallConfirmClickEvent failed with exception! pageId:%s userId:%s Exception:%s", new Object[]{str, str2, e.getMessage()});
            }
        }
        CFs.A00(this.$context, this.$fbUserSession, this.$threadKey);
        return 04S.A00;
    }
}
