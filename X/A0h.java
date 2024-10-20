package X;

import android.content.Context;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.msys.mca.MailboxCallback;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: A0h.class */
public final class A0h implements MailboxCallback {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ ThreadKey A01;
    public final /* synthetic */ 5Uu A02;
    public final /* synthetic */ ImmutableList A03;
    public final /* synthetic */ ListenableFuture A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;

    public A0h(Context context, ThreadKey threadKey, 5Uu r304, ImmutableList immutableList, ListenableFuture listenableFuture, boolean z, boolean z2) {
        this.A02 = r304;
        this.A06 = z;
        this.A05 = z2;
        this.A01 = threadKey;
        this.A04 = listenableFuture;
        this.A03 = immutableList;
        this.A00 = context;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        1qX A0t = 7zL.A0t(obj);
        String string = A0t != null ? A0t.mResultSet.getString(0, 1) : null;
        5Uu r0 = this.A02;
        boolean z = this.A06;
        boolean z2 = this.A05;
        ThreadKey threadKey = this.A01;
        String A02 = r0.A02(threadKey, string, z, z2);
        1Br.A0D(r0.A0A, new AC0(this.A00, threadKey, r0, this.A03, string, A02, z), this.A04);
    }
}
