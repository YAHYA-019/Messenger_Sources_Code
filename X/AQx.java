package X;

import android.content.Context;
import com.facebook.messaging.model.threadkey.ThreadKey;
import kotlin.jvm.functions.Function1;

/* loaded from: AQx.class */
public final class AQx extends C00q implements Function1 {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ ThreadKey $threadKey;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AQx(Context context, ThreadKey threadKey) {
        super(1);
        this.$context = context;
        this.$threadKey = threadKey;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        6ML r0 = (6ML) 1BV.A00(66058).get();
        Context context = this.$context;
        11T.A0D(context);
        0LS.A0A(this.$context, r0.A00(context, this.$threadKey));
        return 04S.A00;
    }
}
