package X;

import java.util.List;

/* loaded from: GW4.class */
public final class GW4 extends AbstractC02903wj {
    public final int A00;
    public final Object A01;

    public GW4(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    @Override // X.AbstractC02903wj
    public int A00(int i) {
        int i2;
        switch (this.A00) {
            case 2:
                i2 = 3;
                if (i != 0) {
                    return 1;
                }
                return i2;
            case 3:
                int itemViewType = ((2Xd) 1Br.A0B(((I8Y) this.A01).A0G)).getItemViewType(i);
                i2 = 2;
                if (itemViewType != 1) {
                    i2 = 6;
                    if (itemViewType != 2) {
                        return 1;
                    }
                }
                return i2;
            default:
                Number number = (Number) 0QD.A0J((List) this.A01, i);
                if (number == null) {
                    return 1;
                }
                i2 = number.intValue();
                return i2;
        }
    }
}
