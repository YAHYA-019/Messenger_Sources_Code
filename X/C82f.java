package X;

/* renamed from: X.82f, reason: invalid class name */
/* loaded from: 82f.class */
public final class C82f extends C04v implements 5PP {
    public final int A00;
    public final int A01;
    public final String A02;

    public C82f(String str, int i, int i2) {
        this.A00 = i2;
        this.A02 = str;
        this.A01 = i;
    }

    public boolean equals(Object obj) {
        int i;
        if (this.A00 != 0) {
            if (this == obj) {
                return true;
            }
            i = 1;
        } else {
            if (this == obj) {
                return true;
            }
            i = 0;
        }
        if (!(obj instanceof C82f)) {
            return false;
        }
        C82f c82f = (C82f) obj;
        return c82f.A00 == i && 11T.A0O(this.A02, c82f.A02) && this.A01 == c82f.A01;
    }

    public int hashCode() {
        return (this.A02.hashCode() * 31) + this.A01;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.StringBuilder, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v5, types: [int, java.lang.StringBuilder] */
    public String toString() {
        String str;
        StringBuilder sb;
        if (this.A00 != 0) {
            new StringBuilder();
            str = "MultiPhotoGroupMetadata(groupId=";
            sb = "MultiPhotoGroupMetadata(groupId=";
        } else {
            new StringBuilder();
            str = "GroupedMessageSendMetadata(groupId=";
            sb = "GroupedMessageSendMetadata(groupId=";
        }
        sb.append(str);
        ?? r0 = this.A02;
        r0.append(r0);
        r0.append(", groupSize=");
        ?? r02 = this.A01;
        r02.append(r02);
        return 4YV.A0x((StringBuilder) r02);
    }
}
