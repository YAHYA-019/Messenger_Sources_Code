package X;

/* renamed from: X.4ij, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4ij.class */
public abstract class AbstractC06994ij {
    public final 2rC A00;
    public final 2rB A01;
    public final String A02;

    public AbstractC06994ij(AbstractC07024im abstractC07024im) {
        this.A00 = abstractC07024im.A00;
        2rB r0 = abstractC07024im.A01;
        this.A01 = r0;
        String str = abstractC07024im.A02;
        this.A02 = str;
        if (r0 == 2rB.A02) {
            if (str == null) {
                final String str2 = "Disk cache id must be set for dynamic cache choice";
                throw new RuntimeException(str2) { // from class: X.7wv
                    {
                        super(0Pz.A0W("Invalid request builder: ", str2));
                    }
                };
            }
        } else {
            if (str == null || str.length() == 0) {
                return;
            }
            final String str3 = "Ensure that if you want to use a disk cache id, you set the CacheChoice to DYNAMIC";
            throw new RuntimeException(str3) { // from class: X.7wv
                {
                    super(0Pz.A0W("Invalid request builder: ", str3));
                }
            };
        }
    }

    public int hashCode() {
        2rC r0 = this.A00;
        int i = 0;
        int hashCode = (r0 != null ? r0.hashCode() : 0) * 31;
        2rB r02 = this.A01;
        int hashCode2 = (hashCode + (r02 != null ? r02.hashCode() : 0)) * 31;
        String str = this.A02;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode2 + i;
    }
}
