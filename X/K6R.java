package X;

import java.util.Arrays;

/* loaded from: K6R.class */
public final class K6R extends Lip {
    public final Lj7 A00;

    public K6R(Lj7 lj7) {
        this.A00 = lj7;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        Lip lip = (Lip) obj;
        int A02 = lip.A02();
        int i = 2;
        if (2 == A02) {
            K6R k6r = (K6R) lip;
            Lj7 lj7 = this.A00;
            i = lj7.A03();
            Lj7 lj72 = k6r.A00;
            A02 = lj72.A03();
            if (i == A02) {
                return Kxe.A00.compare(lj7.A04(), lj72.A04());
            }
        }
        return i - A02;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.A00.equals(((K6R) obj).A00);
    }

    public final int hashCode() {
        return AbM.A05(2, this.A00);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        L4f l4f;
        int i;
        byte b;
        K6M k6m = KoQ.A00;
        K6M k6m2 = k6m.A02;
        if (k6m2 == null) {
            L4f l4f2 = k6m.A00;
            int i2 = 0;
            while (true) {
                char[] cArr = l4f2.A07;
                int length = cArr.length;
                if (i2 >= length) {
                    l4f = l4f2;
                    break;
                }
                char c = cArr[i2];
                if (c < 'a' || c > 'z') {
                    i2++;
                } else {
                    int i3 = 0;
                    while (true) {
                        i = 65;
                        if (i3 >= length) {
                            b = false;
                            break;
                        }
                        char c2 = cArr[i3];
                        if (c2 >= 'A' && c2 <= 'Z') {
                            b = true;
                            break;
                        }
                        i3++;
                    }
                    if ((b ^ true) != true) {
                        throw AnonymousClass001.A0N("Cannot call upperCase() on a mixed-case alphabet");
                    }
                    char[] cArr2 = new char[length];
                    for (int i4 = 0; i4 < length; i4++) {
                        int i5 = cArr[i4];
                        if (i5 >= 97 && i5 <= 122) {
                            i5 = (i5 ^ 32) == true ? 1 : 0;
                        }
                        cArr2[i4] = (char) i5;
                    }
                    l4f = new L4f(l4f2.A04.concat(".upperCase()"), cArr2);
                    if (l4f2.A05 && !l4f.A05) {
                        byte[] bArr = l4f.A06;
                        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                        do {
                            int i6 = i | 32;
                            byte b2 = bArr[i];
                            byte b3 = bArr[i6];
                            if (b2 == -1) {
                                copyOf[i] = b3;
                            } else {
                                char c3 = (char) i;
                                char c4 = (char) i6;
                                if (b3 != -1) {
                                    throw AnonymousClass001.A0N(KYC.A00(1BJ.A00(663), new Object[]{Character.valueOf(c3), Character.valueOf(c4)}));
                                }
                                copyOf[i6] = b2;
                            }
                            i++;
                        } while (i <= 90);
                        l4f = new L4f(l4f.A04.concat(1BJ.A00(621)), copyOf, l4f.A07, true);
                    }
                }
            }
            if (l4f == l4f2) {
                k6m2 = k6m;
            } else {
                Character ch = k6m.A01;
                if (k6m instanceof K6K) {
                    k6m2 = new K6M(l4f, ch);
                    if (l4f.A07.length != 64) {
                        throw JQx.A0n();
                    }
                } else {
                    k6m2 = k6m instanceof K6L ? new K6L(l4f) : new K6M(l4f, ch);
                }
            }
            k6m.A02 = k6m2;
        }
        return 0Pz.A0j("h'", JR0.A0r(k6m2, this.A00), "'");
    }
}
