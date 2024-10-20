package X;

/* renamed from: X.0jp, reason: invalid class name */
/* loaded from: 0jp.class */
public final class C0jp extends 0Yb {
    public static final 0dY A02 = new 0dY(C0jp.class, new Class[]{String.class, Object[].class}, 10);
    public String A00;
    public Object[] A01;

    public C0jp() {
        super(true, false);
    }

    public C0jp(boolean z, String str, Object... objArr) {
        this();
        A01(z, str, objArr);
    }

    private void A01(boolean z, String str, Object... objArr) {
        str.getClass();
        this.A00 = str;
        objArr.getClass();
        this.A01 = objArr;
        ((0Yb) this).A00 = true;
        ((0rK) this).A02 = z;
    }

    public void A03(int i, int i2, Object obj, Object obj2) {
        obj.getClass();
        String str = (String) obj;
        boolean z = false;
        Object[] objArr = obj2 != null ? (Object[]) obj2 : new Object[0];
        if (i != 0) {
            z = true;
        }
        A01(z, str, objArr);
    }

    public String A04() {
        Object obj;
        String str = this.A00;
        Object[] objArr = this.A01;
        if (str == null) {
            obj = "N";
        } else {
            if (objArr != null) {
                return String.format(str, objArr);
            }
            obj = "Y";
        }
        android.util.Log.d("LogFragment", String.format("LogFragment was not initalized correctly. format msg set: %s format args set: %s", obj, objArr != null ? "Y" : "N"));
        return "";
    }
}
