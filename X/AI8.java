package X;

import kotlin.jvm.functions.Function1;

/* loaded from: AI8.class */
public final class AI8 implements 5Vs {
    public Function1 A00;
    public final 01N A01;
    public final 01N A02;
    public final 01N A03;

    public AI8(0Je r302, 0CL r303, 0CL r304, 0CL r305, 0CL r306) {
        this.A01 = new AK1(r302, r303);
        this.A00 = new AK9(r302, r303, r304, r305, r306);
        this.A03 = new AK8(r302, r305, r306);
        this.A02 = new AKA(r302, r304, r303, r305, r306);
    }

    public Function1 Ahy() {
        return this.A00;
    }

    public /* bridge */ /* synthetic */ C00m Anq() {
        return this.A01;
    }

    public /* bridge */ /* synthetic */ Function1 B7D() {
        return this.A02;
    }

    public /* bridge */ /* synthetic */ Function1 BDL() {
        return this.A03;
    }

    public void CoB(Function1 function1) {
        11T.A0F(function1, 0);
        this.A00 = function1;
    }

    public Object getState() {
        return 7zM.A1A(this.A01);
    }
}
