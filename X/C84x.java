package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.montage.model.MontageBucketInfo;
import kotlin.jvm.functions.Function1;

/* renamed from: X.84x, reason: invalid class name */
/* loaded from: 84x.class */
public final class C84x extends C00q implements Function1 {
    public final /* synthetic */ int $action;
    public final /* synthetic */ C2k6 $this_onProfileImageVisibleHandler;
    public final /* synthetic */ C6bs this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C84x(C2k6 c2k6, C6bs c6bs, int i) {
        super(1);
        this.$action = i;
        this.this$0 = c6bs;
        this.$this_onProfileImageVisibleHandler = c2k6;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        int i = this.$action;
        C6bs c6bs = this.this$0;
        if (i == 2 && c6bs.A02 != null) {
            FbUserSession A00 = C54z.A00(this.$this_onProfileImageVisibleHandler.AeS());
            Context A0L = 7zP.A0L(this.$this_onProfileImageVisibleHandler);
            MontageBucketInfo montageBucketInfo = this.this$0.A02;
            1Bi.A03(68571);
            ((C5b2) 1Lm.A05(A0L, A00, 67630)).A00(C5ah.PREFETCH_STORIES_ONLY, 7zN.A0e(montageBucketInfo));
        }
        return 04S.A00;
    }
}
