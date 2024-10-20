package X;

/* loaded from: K8w.class */
public final class K8w extends 3I1 {
    public final Integer A00;
    public final java.util.Map A01;

    public /* synthetic */ K8w(Integer num, java.util.Map map) {
        this.A00 = num;
        this.A01 = map;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof 3I1)) {
                return false;
            }
            Integer num = this.A00;
            K8w k8w = (K8w) ((3I1) obj);
            Integer num2 = k8w.A00;
            if (num == null) {
                if (num2 != null) {
                    return false;
                }
            } else if (!num.equals(num2)) {
                return false;
            }
            if (!this.A01.equals(k8w.A01)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return ((AnonymousClass001.A02(this.A00) ^ 1000003) * 1000003) ^ this.A01.hashCode();
    }

    public final String toString() {
        Integer num = this.A00;
        String valueOf = String.valueOf(this.A01);
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("LocalTestingConfig{defaultSplitInstallErrorCode=");
        A0k.append(num);
        A0k.append(", splitInstallErrorCodeByModule=");
        return GOq.A12(valueOf, A0k);
    }
}
