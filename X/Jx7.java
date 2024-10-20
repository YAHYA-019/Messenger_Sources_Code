package X;

import com.facebookpay.form.cell.label.LabelCellParams;
import com.google.common.collect.ImmutableList;

/* loaded from: Jx7.class */
public final class Jx7 extends Kle {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public ImmutableList A06;
    public boolean A07;
    public final ImmutableList.Builder A08;

    public Jx7(int i) {
        super(i);
        this.A04 = 0;
        this.A00 = 0;
        this.A08 = new ImmutableList.Builder();
    }

    public LabelCellParams A00() {
        this.A06 = this.A08.build();
        return new LabelCellParams(this);
    }
}
