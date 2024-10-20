package X;

import com.facebook.wearable.datax.LocalChannel;
import com.meta.common.monad.railway.Result;
import java.util.Arrays;
import kotlin.jvm.functions.Function1;

/* loaded from: M3v.class */
public final class M3v extends C00q implements Function1 {
    public final /* synthetic */ Function1 $callback;
    public final /* synthetic */ LocalChannel $channel;
    public final /* synthetic */ int $currentAttempt;
    public final /* synthetic */ Kzi $linkMessage;
    public final /* synthetic */ int $maxAttempts;
    public final /* synthetic */ Function1 $retryBlock;
    public final /* synthetic */ LDP this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M3v(LDP ldp, LocalChannel localChannel, Kzi kzi, Function1 function1, Function1 function12, int i, int i2) {
        super(1);
        this.this$0 = ldp;
        this.$callback = function1;
        this.$currentAttempt = i;
        this.$maxAttempts = i2;
        this.$retryBlock = function12;
        this.$channel = localChannel;
        this.$linkMessage = kzi;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Throwable, com.facebook.wearable.datax.LocalChannel] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        04S A17;
        LAk lAk;
        this.this$0.A04.A05 = M8b.A00;
        ?? r0 = this.$channel;
        try {
            r0.send(this.$linkMessage);
            A17 = 04S.A00;
        } catch (Throwable unused) {
            A17 = 7zL.A17((Throwable) r0);
        }
        LDP ldp = this.this$0;
        KLm A00 = 0DU.A00(A17);
        Object[] objArr = new Object[0];
        if (A00 == null) {
            0fH.A13("LinkManagerImpl", "Successfully sent setLink message", Arrays.copyOf(objArr, 0));
            ldp.A04.A05 = null;
            lAk = LAk.A08;
        } else {
            0fH.A0z("LinkManagerImpl", "Error occurred while sending setLink message", A00, Arrays.copyOf(objArr, 0));
            LocalChannel localChannel = ldp.A01;
            if (localChannel != null) {
                try {
                    localChannel.close();
                } catch (Throwable unused2) {
                }
            }
            ldp.A01 = null;
            ldp.A04.A05 = null;
            lAk = A00 instanceof KLm ? A00.error : LAk.A07;
        }
        if (11T.A0O(lAk, LAk.A08)) {
            this.$callback.invoke(new Result(true, 04S.A00));
            return lAk;
        }
        if (!11T.A0O(lAk, LAk.A0B)) {
            if (!11T.A0O(lAk, LAk.A0C)) {
                0fH.A14("LinkManagerImpl", "Received fatal error, failing immediately", Arrays.copyOf(new Object[0], 0));
                this.$callback.invoke(new Result(false, new KLm(lAk)));
                return lAk;
            }
        }
        int i = this.$currentAttempt;
        int i2 = this.$maxAttempts;
        if (i >= i2) {
            R3t.A00("Max attempts reached, failing", new Object[0]);
            this.$callback.invoke(new Result(false, new KLm(lAk)));
            return lAk;
        }
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("Retrying linkSwitch: ");
        A0k.append(i + 1);
        A0k.append('/');
        R3t.A00(GOn.A1B(A0k, i2), new Object[0]);
        this.$retryBlock.invoke(Integer.valueOf(this.$currentAttempt + 1));
        return lAk;
    }
}
