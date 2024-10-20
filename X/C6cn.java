package X;

import java.util.Arrays;

/* renamed from: X.6cn, reason: invalid class name */
/* loaded from: 6cn.class */
public final class C6cn extends 6U5 {
    public final HBL A00;
    public final HCA A01;
    public final String A02;
    public final String A03;

    public C6cn(HBL hbl, HCA hca, String str, String str2) {
        11T.A0F(str, 1);
        11T.A0F(hbl, 2);
        this.A02 = str;
        this.A00 = hbl;
        this.A03 = str2;
        this.A01 = hca;
    }

    public String toString() {
        String format = String.format("%s: errorStage - %s, errorCode - %s", Arrays.copyOf(new Object[]{super.toString(), this.A02, this.A00}, 3));
        11T.A0A(format);
        return format;
    }
}
