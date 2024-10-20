package X;

import android.os.Bundle;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.fbservice.ops.BlueServiceOperationFactory;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.xapp.messaging.emoji.service.FetchRecentEmojiResult;
import com.google.common.base.Function;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.ExecutorService;

/* renamed from: X.6z8, reason: invalid class name */
/* loaded from: 6z8.class */
public final class C6z8 implements C6wv {
    public final BlueServiceOperationFactory A00;
    public final ExecutorService A01;
    public final boolean A02;
    public final Function A03;

    public C6z8(BlueServiceOperationFactory blueServiceOperationFactory, ExecutorService executorService, boolean z) {
        11T.A0F(blueServiceOperationFactory, 1);
        11T.A0F(executorService, 2);
        this.A00 = blueServiceOperationFactory;
        this.A01 = executorService;
        this.A02 = z;
        this.A03 = new Function() { // from class: X.6z9
            @Override // com.google.common.base.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                OperationResult operationResult = (OperationResult) obj;
                if (operationResult != null) {
                    return ((FetchRecentEmojiResult) operationResult.A07()).A00;
                }
                throw 1BK.A0e();
            }
        };
    }

    /* JADX WARN: Type inference failed for: r305v3, types: [java.lang.Object, com.google.common.util.concurrent.SettableFuture] */
    @Override // X.C6ws
    public ListenableFuture AUS(Bundle bundle) {
        ListenableFuture listenableFuture;
        1Ho newInstance_DEPRECATED = this.A00.newInstance_DEPRECATED("fetch_recent_emoji", new Bundle(), 1, CallerContext.A0B("BSORecentEmojiSupplier"));
        11T.A0A(newInstance_DEPRECATED);
        if (this.A02) {
            ?? obj = new Object();
            this.A01.execute(new 7HW(newInstance_DEPRECATED, (SettableFuture) obj));
            listenableFuture = obj;
        } else {
            ListenableFuture A00 = 1Ho.A00(newInstance_DEPRECATED, true);
            11T.A0D(A00);
            listenableFuture = A00;
        }
        return 2FP.A02(this.A03, listenableFuture, this.A01);
    }

    @Override // X.C6wv
    public /* bridge */ /* synthetic */ void Cdm(Object obj) {
    }

    @Override // X.C6wv
    public /* bridge */ /* synthetic */ void add(Object obj) {
        11T.A0F(obj, 0);
        1Ho newInstance_DEPRECATED = this.A00.newInstance_DEPRECATED("update_recent_emoji", 0PK.A00(new 03Y[]{new 03Y("emoji", obj)}), 1, CallerContext.A0B("BSORecentEmojiSupplier"));
        11T.A0A(newInstance_DEPRECATED);
        if (this.A02) {
            this.A01.execute(new G1A(newInstance_DEPRECATED));
        } else {
            1Ho.A00(newInstance_DEPRECATED, true);
        }
    }
}
