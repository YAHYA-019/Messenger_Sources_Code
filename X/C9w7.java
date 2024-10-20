package X;

import kotlin.jvm.functions.Function1;

/* renamed from: X.9w7, reason: invalid class name */
/* loaded from: 9w7.class */
public final class C9w7 implements C5d8 {
    public final /* synthetic */ 9Zz A00;
    public final /* synthetic */ Function1 A01;

    public C9w7(9Zz r302, Function1 function1) {
        this.A00 = r302;
        this.A01 = function1;
    }

    @Override // X.C5d8
    public void C7S(6BY r302) {
        11T.A0F(r302, 0);
        9Zz r0 = this.A00;
        Function1 function1 = this.A01;
        11T.A0F(function1, 1);
        int A08 = 7zR.A08(r302.A00.A00);
        r0.A01 = r302;
        function1.invoke(new 8Lu(14, A08 == 0 ? C95a.A03 : C95a.A02, r302));
        ((C9cr) 1Br.A0B(r0.A05)).A02("HighlightsStoriesMontageLoader");
    }

    @Override // X.C5d8
    public void C7U(6BY r302) {
        Function1 function1 = this.A01;
        6BY r0 = this.A00.A01;
        if (r0 == null) {
            11T.A0L("currentMontageData");
            throw 0Q8.createAndThrow();
        }
        function1.invoke(new 8Lu(14, C95a.A02, r0));
    }
}
