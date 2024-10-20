package X;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: X.9bc, reason: invalid class name */
/* loaded from: 9bc.class */
public final class C9bc {
    public final SharedPreferences A00;
    public final 1Br A01;
    public final 1Br A02;
    public final Context A03;

    public C9bc() {
        int i;
        String str;
        Context A0A = 7zM.A0A();
        this.A03 = A0A;
        1Br A00 = 1Bu.A00(68892);
        this.A01 = A00;
        String packageName = ((9IJ) 1Br.A0B(A00)).A00.getPackageName();
        11T.A0A(packageName);
        Integer[] A002 = 0S2.A00(3);
        int length = A002.length;
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= length) {
                throw new NoSuchElementException(DKB.A00(6));
            }
            Integer num = A002[i3];
            switch (num.intValue()) {
                case 1:
                    i = 51;
                    break;
                case 2:
                    i = 254;
                    break;
                default:
                    i = 99;
                    break;
            }
            if (AnonymousClass000.A00(i).equals(packageName)) {
                int intValue = num.intValue();
                if (intValue == 0) {
                    str = "autobackupprefs";
                } else {
                    if (intValue != 2 && intValue != 1) {
                        throw 1BK.A1F();
                    }
                    str = "fbautobackupprefs";
                }
                SharedPreferences sharedPreferences = A0A.getSharedPreferences(str, 0);
                11T.A0A(sharedPreferences);
                this.A00 = sharedPreferences;
                this.A02 = 7zM.A0d();
                return;
            }
            i2 = i3 + 1;
        }
    }

    public final String A00(String str) {
        String str2;
        boolean z;
        String str3 = null;
        11T.A0F(str, 0);
        synchronized (this) {
            str2 = null;
            String string = this.A00.getString(0Pz.A0Y("encrypted_backups_recovery_code", str, '_'), null);
            if (string != null) {
                char[] cArr = new char[1];
                cArr[0] = ':';
                List A0L = 0CU.A0L(string, cArr, 0);
                if (A0L.size() == 3) {
                    str3 = 1BK.A14(A0L, 1);
                    Long.parseLong(1BK.A14(A0L, 2));
                    z = true;
                    11T.A0F(str3, 1);
                } else {
                    z = false;
                }
                if (z) {
                    str2 = str3;
                }
            }
        }
        return str2;
    }

    public final void A01(String str) {
        11T.A0F(str, 0);
        synchronized (this) {
            this.A00.edit().remove(0Pz.A0Y("encrypted_backups_recovery_code", str, '_')).apply();
        }
    }
}
