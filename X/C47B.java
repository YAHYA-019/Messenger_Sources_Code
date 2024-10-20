package X;

import com.facebook.user.model.UserKey;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.ListenableFuture;
import kotlin.jvm.functions.Function1;

/* renamed from: X.47B, reason: invalid class name */
/* loaded from: 47B.class */
public final class C47B implements C2sd {
    public final /* synthetic */ C2sd A00;
    public final /* synthetic */ Function1 A01;

    public C47B(C2sd c2sd, Function1 function1) {
        this.A01 = function1;
        this.A00 = c2sd;
    }

    @Override // X.C2sd
    public ListenableFuture ARv(ImmutableList immutableList) {
        11T.A0F(immutableList, 0);
        if (immutableList.isEmpty()) {
            return 1Kd.A0A(ImmutableList.of());
        }
        ImmutableList.Builder builder = new ImmutableList.Builder();
        1Du it = immutableList.iterator();
        while (it.hasNext()) {
            UserKey userKey = (UserKey) it.next();
            if (userKey.type == 1Js.A03) {
                try {
                    String str = userKey.id;
                    11T.A0A(str);
                    builder.m11011add((Object) Long.valueOf(Long.parseLong(str)));
                } catch (NumberFormatException unused) {
                    0fH.A0o("FetchStrategyMsysNetwork", "Malformed ID detected, cannot be converted to long");
                }
            } else {
                0fH.A0o("FetchStrategyMsysNetwork", "FetchStrategyMsysDb doesn't (yet) support non-facebook user keys");
            }
        }
        Function1 function1 = this.A01;
        ImmutableList build = builder.build();
        11T.A0A(build);
        ListenableFuture listenableFuture = (ListenableFuture) function1.invoke(build);
        C2sd c2sd = this.A00;
        return 11T.A0O(c2sd, C47A.A00) ? listenableFuture : 2FP.A00(new C1263Ac5(c2sd, immutableList), listenableFuture, 2eQ.A01);
    }
}
