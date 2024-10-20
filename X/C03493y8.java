package X;

import com.facebook.fury.context.ReqContextTypeResolver;

/* renamed from: X.3y8, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3y8.class */
public final class C03493y8 extends AbstractC03503y9 implements 1cU {
    public final 1cU A00;

    public C03493y8(1cU r302) {
        super(ReqContextTypeResolver.resolveName("litho"));
        this.A00 = r302;
    }

    public boolean BWo() {
        boolean z = false;
        if (C0jy.A00() == C0jw.FINE) {
            z = true;
        }
        return z;
    }

    public void CXs(Runnable runnable, String str) {
        this.A00.CXs(A00(runnable, str), str);
    }

    public void CXu(Runnable runnable, String str) {
        this.A00.CXu(A00(runnable, str), str);
    }

    public void Cdn(Runnable runnable) {
        Runnable runnable2 = (Runnable) super.A00.remove(runnable);
        if (runnable2 != null) {
            runnable = runnable2;
        }
        this.A00.Cdn(runnable);
    }
}
