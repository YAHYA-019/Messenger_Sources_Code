package X;

import com.facebook.omnistore.Collection;
import com.facebook.omnistore.module.OmnistoreComponent;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* renamed from: X.3qi, reason: invalid class name */
/* loaded from: 3qi.class */
public final class C3qi {
    public final C00i A02 = new 1BQ(84488);
    public final C01263qj A01 = (C01263qj) 1Bn.A0A(32786);
    public final C15h A04 = new C4Xh(this, 3);
    public final C01273qk A03 = (C01273qk) 1Bn.A0A(32787);
    public SettableFuture A00 = new Object();

    public Collection A00(String str) {
        1FV r0;
        synchronized (this) {
            r0 = this.A00;
        }
        C00i c00i = this.A02;
        long A09 = 1BL.A09(c00i);
        try {
            if (r0.isDone()) {
                this.A01.A00(str, 0L, "");
                return (Collection) r0.get();
            }
            this.A03.A00((OmnistoreComponent) this.A04.get(), AnonymousClass001.A0k());
            long A092 = 1BL.A09(c00i);
            if (!r0.isDone()) {
                this.A01.A00(str, 1BL.A09(c00i) - A09, "Failed to get contact collection because it's invalidated");
                throw new Exception() { // from class: X.4Rl
                };
            }
            Collection collection = (Collection) r0.get();
            this.A01.A00(str, A092 - A09, "");
            return collection;
        } catch (InterruptedException | CancellationException | ExecutionException e) {
            this.A01.A00(str, 1BL.A09(c00i) - A09, e.getMessage());
            throw new Exception("Couldn't get contacts collection.", e);
        }
    }
}
