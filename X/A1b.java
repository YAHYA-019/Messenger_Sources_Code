package X;

import com.facebook.msys.mca.MailboxCallback;
import com.google.common.util.concurrent.SettableFuture;
import kotlin.jvm.functions.Function1;

/* loaded from: A1b.class */
public final class A1b implements MailboxCallback {
    public final int A00;
    public final Object A01;

    public A1b(SettableFuture settableFuture, int i) {
        this.A00 = i;
        switch (i) {
            case 3:
            case 18:
            case 27:
            case 32:
            case 34:
            case 37:
                this.A01 = settableFuture;
                return;
            default:
                this.A01 = settableFuture;
                return;
        }
    }

    public A1b(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public A1b(Function1 function1, int i) {
        this.A00 = i;
        switch (i) {
            case 0:
            case 1:
            case 2:
                this.A01 = function1;
                return;
            default:
                this.A01 = function1;
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:207:0x05d7, code lost:
    
        if (r305 == null) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x0929, code lost:
    
        if (r310.longValue() > 0) goto L224;
     */
    /* JADX WARN: Code restructure failed: missing block: B:307:0x0ad7, code lost:
    
        if (r303 != null) goto L242;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0008. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v106, types: [java.util.LinkedHashMap] */
    @Override // com.facebook.msys.mca.MailboxCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ void onCompletion(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 3062
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A1b.onCompletion(java.lang.Object):void");
    }
}
