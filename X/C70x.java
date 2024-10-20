package X;

import android.content.Context;

/* renamed from: X.70x, reason: invalid class name */
/* loaded from: 70x.class */
public final class C70x implements C70y {
    public final Context A00;

    public C70x(Context context) {
        11T.A0F(context, 1);
        this.A00 = context;
    }

    @Override // X.C70y
    public String ATo(long j) {
        Context context;
        int i;
        Object[] objArr;
        Long valueOf;
        long j2 = j / 86400;
        long j3 = j / 3600;
        long j4 = 60;
        long j5 = (j % 3600) / j4;
        long j6 = j % j4;
        if (j2 > 1) {
            context = this.A00;
            i = 2131967274;
            objArr = new Object[1];
            valueOf = Long.valueOf(j2);
        } else if (j3 > 0) {
            context = this.A00;
            i = 2131967281;
            objArr = new Object[1];
            valueOf = Long.valueOf(j3);
        } else {
            context = this.A00;
            if (j5 > 0) {
                i = 2131967287;
                objArr = new Object[1];
                valueOf = Long.valueOf(j5);
            } else {
                i = 2131967293;
                objArr = new Object[1];
                valueOf = Long.valueOf(j6);
            }
        }
        objArr[0] = valueOf;
        String string = context.getString(i, objArr);
        11T.A0A(string);
        return string;
    }
}
