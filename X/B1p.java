package X;

import com.google.common.collect.ImmutableList;

/* loaded from: B1p.class */
public final class B1p extends 2Yv {
    public BRZ A00;
    public ImmutableList A01;
    public boolean A02;

    public void A02(C2l4 c2l4) {
        Object A00;
        Object[] objArr = c2l4.A01;
        int i = c2l4.A00;
        if (i == 0) {
            this.A01 = (ImmutableList) objArr[0];
            this.A02 = true;
            return;
        }
        if (i == 1) {
            ImmutableList immutableList = this.A01;
            BRZ brz = this.A00;
            Object obj = objArr[0];
            BRZ brz2 = (BRZ) objArr[1];
            if (immutableList != null) {
                int indexOf = immutableList.indexOf(obj);
                int indexOf2 = brz != null ? immutableList.indexOf(brz) : -1;
                if (indexOf != indexOf2) {
                    ImmutableList.Builder builderWithExpectedSize = ImmutableList.builderWithExpectedSize(immutableList.size());
                    int i2 = 0;
                    while (true) {
                        int i3 = i2;
                        if (i3 >= immutableList.size()) {
                            break;
                        }
                        if (i3 != indexOf && i3 != indexOf2) {
                            A00 = immutableList.get(i3);
                        } else if (i3 == indexOf2) {
                            A00 = brz.A00(false);
                        } else {
                            builderWithExpectedSize.m11011add((Object) brz2);
                            i2 = i3 + 1;
                        }
                        builderWithExpectedSize.m11011add(A00);
                        i2 = i3 + 1;
                    }
                    immutableList = builderWithExpectedSize.build();
                    brz = brz2;
                }
            }
            this.A01 = immutableList;
            this.A00 = brz;
        }
    }
}
