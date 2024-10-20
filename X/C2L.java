package X;

import android.content.res.Resources;

/* loaded from: C2L.class */
public final class C2L {
    public final 1Br A00 = AbG.A0V();

    public final String A00(int i, boolean z) {
        long j;
        C16y c16y;
        String string;
        Resources A09;
        int i2;
        if (z) {
            if (i >= 1) {
                long j2 = Ba1.A02.A01;
                j = i;
                if (1 > j || j > j2) {
                    long j3 = 60;
                    long j4 = Ba1.A01.A01;
                    if (j3 > j || j > j4) {
                        c16y = Ba1.A03;
                        long j5 = c16y.A01;
                        if (3600 <= j || j > j5) {
                            i /= 86400;
                            A09 = 4YV.A09(this.A00);
                            i2 = 2131820659;
                        } else {
                            i /= 3600;
                            A09 = 4YV.A09(this.A00);
                            i2 = 2131820660;
                        }
                        string = 4YV.A0o(A09, i, i2);
                    }
                    i /= 60;
                    A09 = 4YV.A09(this.A00);
                    i2 = 2131820661;
                    string = 4YV.A0o(A09, i, i2);
                }
                A09 = 4YV.A09(this.A00);
                i2 = 2131820662;
                string = 4YV.A0o(A09, i, i2);
            }
            string = 4YV.A09(this.A00).getString(2131960497);
        } else {
            if (i >= 1) {
                long j6 = Ba1.A02.A01;
                j = i;
                if (1 > j || j > j6) {
                    long j7 = 60;
                    long j8 = Ba1.A01.A01;
                    if (j7 > j || j > j8) {
                        c16y = Ba1.A00;
                        long j52 = c16y.A01;
                        if (3600 <= j) {
                        }
                        i /= 86400;
                        A09 = 4YV.A09(this.A00);
                        i2 = 2131820659;
                        string = 4YV.A0o(A09, i, i2);
                    }
                    i /= 60;
                    A09 = 4YV.A09(this.A00);
                    i2 = 2131820661;
                    string = 4YV.A0o(A09, i, i2);
                }
                A09 = 4YV.A09(this.A00);
                i2 = 2131820662;
                string = 4YV.A0o(A09, i, i2);
            }
            string = 4YV.A09(this.A00).getString(2131960497);
        }
        11T.A0D(string);
        return string;
    }
}
