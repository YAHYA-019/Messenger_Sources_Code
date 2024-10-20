package X;

import com.facebook.fury.context.ReqContextTypeResolver;

/* renamed from: X.359, reason: invalid class name */
/* loaded from: 359.class */
public final class AnonymousClass359 extends AbstractC03503y9 implements 1cP {
    public final 1cP A00;

    public AnonymousClass359(1cP r302) {
        super(ReqContextTypeResolver.sProvider == null ? 0 : 2);
        this.A00 = r302;
    }

    public boolean BUa() {
        return this.A00.BUa();
    }

    public boolean CXv(Runnable runnable, String str) {
        return this.A00.CXv(A00(runnable, str), str);
    }

    public void Cdn(Runnable runnable) {
        Runnable runnable2 = (Runnable) super.A00.remove(runnable);
        if (runnable2 != null) {
            runnable = runnable2;
        }
        this.A00.Cdn(runnable);
    }
}
