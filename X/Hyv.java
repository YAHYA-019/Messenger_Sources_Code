package X;

import com.google.common.collect.ImmutableList;

/* loaded from: Hyv.class */
public final class Hyv {
    public final C00i A00;
    public final IBw A01;
    public final IDa A02;
    public final ImmutableList A03;

    public Hyv(IBw iBw, IDa iDa, ImmutableList immutableList) {
        1BV A00 = 1BV.A00(17009);
        this.A00 = A00;
        this.A03 = immutableList;
        this.A01 = iBw;
        this.A02 = iDa;
        ((2Pf) A00.get()).A00 = new IaO(this);
    }

    public static void A00(Hyv hyv) {
        ImmutableList immutableList = hyv.A03;
        C6x1 c6x1 = C6x1.A02;
        if (!immutableList.contains(c6x1) || c6x1.equals(hyv.A02.A04()) || hyv.A01.A03() == null) {
            return;
        }
        ((2Pf) hyv.A00.get()).A01("CLOSE_CAMERA_TIME_OUT_TAG", 3000L);
    }
}
