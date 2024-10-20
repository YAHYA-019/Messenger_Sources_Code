package X;

import com.facebook.fury.context.ReqContext;

/* renamed from: X.0dx, reason: invalid class name */
/* loaded from: 0dx.class */
public final class C0dx extends C0jv {
    public static final String __redex_internal_original_name = "ReqContextRepeatedRunnable";
    public volatile ReqContext A00;

    @Override // X.C0jv
    public void A00() {
        this.A00.close();
    }

    @Override // X.C0jv
    public void A01() {
        ReqContext reqContext = this.A00;
        if (reqContext != null) {
            this.A00 = AnonymousClass018.A01(reqContext, reqContext.getTag(), reqContext.getType());
        }
    }

    @Override // X.C0jv
    public void A02(Throwable th) {
        ReqContext reqContext = this.A00;
        if (reqContext != null) {
            AnonymousClass018.A05(reqContext, th);
        }
    }
}
