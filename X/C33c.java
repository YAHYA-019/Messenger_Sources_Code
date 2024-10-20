package X;

/* renamed from: X.33c, reason: invalid class name */
/* loaded from: 33c.class */
public final class C33c extends 3OU {
    public final String A00;

    public C33c(String str, String str2) {
        super(str);
        this.A00 = str2;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj instanceof C33c) {
            C33c c33c = (C33c) obj;
            if (((3OU) this).A00.equals(((3OU) c33c).A00)) {
                String str = this.A00;
                String str2 = c33c.A00;
                if (str != null ? !(str2 == null || str.compareTo(str2) != 0) : str2 == null) {
                    z = true;
                }
            }
        }
        return z;
    }
}
