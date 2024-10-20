package X;

import java.util.regex.Pattern;

/* renamed from: X.2xr, reason: invalid class name */
/* loaded from: 2xr.class */
public final class C2xr extends C00q implements C00m {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final Object A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2xr(C2n0 c2n0, int i, int i2, int i3, int i4) {
        super(0);
        this.A00 = i4;
        this.A04 = c2n0;
        this.A03 = i;
        this.A02 = i2;
        this.A01 = i3;
    }

    @Override // X.C00m
    public /* bridge */ /* synthetic */ Object invoke() {
        if (this.A00 != 0) {
            Integer num = 0S2.A03;
            Pattern compile = Pattern.compile("(^>>> ?)((.|(\\r\\n)|\\r|\\n)*?\\S(.|(\\r\\n)|\\r|\\n)*?)(^<<<)\\s*?", 8);
            11T.A0A(compile);
            return new C2n3(C2n3.A06, new 63O(((C2n0) this.A04).A02, this.A03, this.A02, this.A01), num, compile, true, true);
        }
        Integer num2 = 0S2.A02;
        Pattern compile2 = Pattern.compile("((^> )(.*\\S.*)((\\r\\n)|\\r|\\n)?)(^> ?(.*)((\\r\\n)|\\r|\\n)?)*", 8);
        11T.A0A(compile2);
        return new C2n3(new 63P(), new 63O(((C2n0) this.A04).A02, this.A03, this.A02, this.A01), num2, compile2, true, false);
    }
}
