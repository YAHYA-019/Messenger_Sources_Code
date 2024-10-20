package X;

import com.facebook.common.callercontext.CallerContext;
import com.facebook.messaging.threadlist.plugins.core.clickhandler.DefaultThreadListClickHandler;

/* renamed from: X.83M, reason: invalid class name */
/* loaded from: 83M.class */
public final class C83M extends C00q implements C00m {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C83M(Object obj, Object obj2, Object obj3, String str, int i) {
        super(0);
        this.A00 = i;
        this.A03 = obj;
        this.A01 = obj2;
        this.A04 = str;
        this.A02 = obj3;
    }

    @Override // X.C00m
    public /* bridge */ /* synthetic */ Object invoke() {
        if (this.A00 != 0) {
            return new 7Sa(((C6qu) this.A02).BF7(), (C71q) this.A03, this.A04, (C01i) this.A01);
        }
        DefaultThreadListClickHandler defaultThreadListClickHandler = (DefaultThreadListClickHandler) this.A03;
        return ((C4Nz) defaultThreadListClickHandler.A06.A00.get()).A01(defaultThreadListClickHandler.A00, (06Z) this.A02, defaultThreadListClickHandler.A01, (CallerContext) this.A01, this.A04);
    }
}
