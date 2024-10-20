package X;

/* renamed from: X.0pv, reason: invalid class name */
/* loaded from: 0pv.class */
public abstract class C0pv implements C15h {
    public Object A00;

    public abstract Object A00();

    @Override // X.C15h
    public Object get() {
        Object obj;
        synchronized (this) {
            obj = this.A00;
            if (obj == null) {
                obj = A00();
                this.A00 = obj;
            }
        }
        return obj;
    }
}
