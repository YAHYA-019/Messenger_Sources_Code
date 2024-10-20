package X;

import java.lang.reflect.Field;

/* loaded from: Hqm.class */
public final class Hqm {
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public long A08;
    public long A09;
    public long A0A;
    public long A0B;
    public long A0C;
    public long A0D;
    public String A0G;
    public String A0H;
    public String A0I;
    public boolean A0N = false;
    public boolean A0Q = false;
    public boolean A0J = false;
    public boolean A0K = false;
    public boolean A0L = false;
    public boolean A0M = false;
    public boolean A0O = false;
    public boolean A0P = false;
    public String A0F = null;
    public int A00 = 0;
    public boolean A0R = false;
    public long A0E = 0;

    public Hqm() {
        long j = -1;
        this.A0C = j;
        this.A02 = j;
        this.A01 = j;
        this.A0D = j;
        this.A04 = j;
        this.A07 = j;
        this.A03 = j;
        this.A05 = j;
        this.A0B = j;
        this.A09 = j;
        this.A08 = j;
        this.A06 = j;
        this.A0A = j;
    }

    public String toString() {
        Field[] declaredFields = getClass().getDeclaredFields();
        StringBuilder A0k = AnonymousClass001.A0k();
        int length = declaredFields.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                return A0k.toString();
            }
            Field field = declaredFields[i2];
            A0k.append(field.getName());
            A0k.append(":");
            try {
                A0k.append(field.get(this));
            } catch (IllegalAccessException e) {
                A0k.append("IllegalAccess");
                e.printStackTrace();
            }
            A0k.append(System.getProperty(1BJ.A00(95)));
            i = i2 + 1;
        }
    }
}
