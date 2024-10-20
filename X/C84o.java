package X;

import com.facebook.auth.usersession.FbUserSession;

/* renamed from: X.84o, reason: invalid class name */
/* loaded from: 84o.class */
public final class C84o implements C5uZ {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;

    public C84o(FbUserSession fbUserSession, C5j5 c5j5, 70W r304, String str, int i) {
        this.A00 = i;
        this.A02 = c5j5;
        this.A04 = str;
        if (2 - i != 0) {
            this.A01 = fbUserSession;
            this.A03 = r304;
        } else {
            this.A03 = r304;
            this.A01 = fbUserSession;
        }
    }

    public C84o(Object obj, Object obj2, Object obj3, String str, int i) {
        this.A00 = i;
        this.A02 = obj2;
        this.A04 = str;
        this.A01 = obj3;
        this.A03 = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b6, code lost:
    
        if (r312 == null) goto L13;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0006. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v206, types: [X.5PP, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v308, types: [X.5v3, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v376, types: [X.5v3, java.lang.Object] */
    @Override // X.C5uZ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ java.lang.Object get() {
        /*
            Method dump skipped, instructions count: 1854
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C84o.get():java.lang.Object");
    }
}
