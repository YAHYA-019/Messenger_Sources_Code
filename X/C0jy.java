package X;

import com.facebook.fury.context.ReqContext;
import java.util.concurrent.Callable;

/* renamed from: X.0jy, reason: invalid class name */
/* loaded from: 0jy.class */
public abstract class C0jy {
    public static volatile C0jx A00;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
    
        if (r301 == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static X.C0jw A00() {
        /*
            X.0jx r0 = X.C0jy.A00
            r301 = r0
            r0 = r301
            if (r0 == 0) goto L13
            r0 = r301
            X.0jw r0 = r0.BGo()
            r301 = r0
            r0 = r301
            if (r0 != 0) goto L17
        L13:
            X.0jw r0 = X.C0jw.NONE
            r301 = r0
        L17:
            r0 = r301
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0jy.A00():X.0jw");
    }

    public static Runnable A01(ReqContext reqContext, Runnable runnable) {
        if (A00() == C0jw.NONE || runnable == null || (runnable instanceof C0jv)) {
            return runnable;
        }
        C0jv c0jv = new C0jv(runnable);
        ((0GI) c0jv).A00 = reqContext;
        return c0jv;
    }

    public static Runnable A02(Runnable runnable, String str, int i) {
        if (A00() == C0jw.NONE || runnable == null || (runnable instanceof C0jv)) {
            return runnable;
        }
        C0jv c0jv = new C0jv(runnable);
        ((0GI) c0jv).A00 = AnonymousClass018.A03(str, i);
        return c0jv;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [X.0e4, X.0ju, java.util.concurrent.Callable] */
    public static Callable A03(String str, final Callable callable, int i) {
        if (A00() == C0jw.NONE || (callable instanceof C0ju)) {
            return callable;
        }
        ?? r0 = new Callable(callable) { // from class: X.0ju
            public final Callable A00;

            {
                this.A00 = callable;
            }

            @Override // java.util.concurrent.Callable
            public Object call() {
                try {
                    C0e4 c0e4 = (C0e4) this;
                    ReqContext reqContext = c0e4.A00;
                    if (reqContext != null) {
                        c0e4.A00 = AnonymousClass018.A01(reqContext, reqContext.getTag(), reqContext.getType());
                    }
                    Object call = this.A00.call();
                    ReqContext reqContext2 = c0e4.A00;
                    if (reqContext2 != null) {
                        c0e4.A00 = null;
                        reqContext2.close();
                    }
                    return call;
                } catch (Throwable th) {
                    try {
                        ReqContext reqContext3 = ((C0e4) this).A00;
                        if (reqContext3 != null) {
                            AnonymousClass018.A05(reqContext3, th);
                        }
                        throw th;
                    } catch (Throwable th2) {
                        C0e4 c0e42 = (C0e4) this;
                        ReqContext reqContext4 = c0e42.A00;
                        if (reqContext4 != null) {
                            c0e42.A00 = null;
                            reqContext4.close();
                        }
                        throw th2;
                    }
                }
            }
        };
        r0.A00 = AnonymousClass018.A03(str, i);
        return r0;
    }
}
