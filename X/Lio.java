package X;

import android.os.Bundle;

/* loaded from: Lio.class */
public final class Lio implements Comparable {
    public final Bundle A00;
    public final L94 A01;
    public final int A02;
    public final int A03;
    public final boolean A04;
    public final boolean A05;

    public Lio(Bundle bundle, L94 l94, int i, int i2, boolean z, boolean z2) {
        this.A01 = l94;
        this.A00 = bundle;
        this.A05 = z;
        this.A02 = i;
        this.A04 = z2;
        this.A03 = i2;
    }

    @Override // java.lang.Comparable
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public int compareTo(Lio lio) {
        int size;
        11T.A0F(lio, 0);
        boolean z = this.A05;
        if (!z || lio.A05) {
            if (z || !lio.A05) {
                int i = this.A02 - lio.A02;
                if (i <= 0) {
                    if (i >= 0) {
                        Bundle bundle = this.A00;
                        Bundle bundle2 = lio.A00;
                        if (bundle != null) {
                            if (bundle2 != null && (size = bundle.size() - bundle2.size()) <= 0) {
                                if (size < 0) {
                                    return -1;
                                }
                            }
                        } else if (bundle2 != null) {
                            return -1;
                        }
                        if (this.A04) {
                            if (!lio.A04) {
                                return 1;
                            }
                        } else if (lio.A04) {
                            return -1;
                        }
                        return this.A03 - lio.A03;
                    }
                }
            }
            return -1;
        }
        return 1;
    }
}
