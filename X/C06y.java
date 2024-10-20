package X;

/* renamed from: X.06y, reason: invalid class name */
/* loaded from: 06y.class */
public abstract class C06y extends 01K implements C06z {
    public final boolean syntheticJavaProperty;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06y(Class cls, Object obj, String str, String str2, int i) {
        super(obj, cls, str, str2, (i & 1) == 1);
        boolean z = false;
        this.syntheticJavaProperty = (i & 2) == 2 ? true : z;
    }

    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public C06z getReflected() {
        if (this.syntheticJavaProperty) {
            throw AnonymousClass001.A0q("Kotlin reflection is not yet supported for synthetic Java properties");
        }
        return (C06z) super.getReflected();
    }

    public 01L compute() {
        if (this.syntheticJavaProperty) {
            return this;
        }
        01L r0 = ((01K) this).reflected;
        if (r0 != null) {
            return r0;
        }
        ((01K) this).reflected = this;
        return this;
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof C06y)) {
                if (obj instanceof C06z) {
                    return obj.equals(compute());
                }
                return false;
            }
            01K r0 = (01K) obj;
            if (!getOwner().equals(r0.getOwner()) || !((01K) this).name.equals(r0.name) || !((01K) this).signature.equals(r0.signature) || !11T.A0O(((01K) this).receiver, r0.receiver)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (((getOwner().hashCode() * 31) + ((01K) this).name.hashCode()) * 31) + ((01K) this).signature.hashCode();
    }

    public String toString() {
        01L compute = compute();
        return compute != this ? compute.toString() : 0Pz.A0j("property ", ((01K) this).name, " (Kotlin reflection is not available)");
    }
}
