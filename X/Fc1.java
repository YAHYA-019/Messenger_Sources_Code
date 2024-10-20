package X;

import kotlin.jvm.functions.Function1;

/* loaded from: Fc1.class */
public final class Fc1 implements JHu {
    public final /* synthetic */ FGn A00;
    public final /* synthetic */ Function1 A01;

    public Fc1(FGn fGn, Function1 function1) {
        this.A00 = fGn;
        this.A01 = function1;
    }

    @Override // X.JHu
    public void BhD(String str, Throwable th) {
        this.A01.invoke(QnT.A00);
    }

    @Override // X.JHu
    public void BhE(String str) {
        FGn.A02(EQw.A0L, this.A00);
        this.A01.invoke(QnU.A00);
    }
}
