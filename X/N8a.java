package X;

import com.google.common.collect.ImmutableList;

/* loaded from: N8a.class */
public final class N8a implements 1K9 {
    public final int A00;
    public final Object A01;

    public N8a(N4B n4b, int i) {
        this.A00 = i;
        this.A01 = n4b;
    }

    public void onFailure(Throwable th) {
        NAL nal;
        11T.A0F(th, 0);
        N4B n4b = (N4B) this.A01;
        if (!n4b.A05 || (nal = n4b.A02) == null) {
            return;
        }
        nal.C49(th);
    }

    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        ImmutableList immutableList;
        NAL nal;
        8Kl r304;
        if (this.A00 != 0) {
            Number number = (Number) obj;
            N4B n4b = (N4B) this.A01;
            if (!n4b.A05) {
                return;
            }
            int intValue = number != null ? number.intValue() : 0;
            n4b.A01 = intValue;
            nal = n4b.A02;
            if (nal == null) {
                return;
            } else {
                r304 = new 8Kl(n4b.A04, intValue);
            }
        } else {
            ImmutableList immutableList2 = (ImmutableList) obj;
            N4B n4b2 = (N4B) this.A01;
            if (!n4b2.A05) {
                return;
            }
            if (immutableList2 == null) {
                immutableList = ImmutableList.of();
                11T.A0A(immutableList);
            } else {
                immutableList = immutableList2;
            }
            n4b2.A04 = immutableList;
            n4b2.A03 = (immutableList2 == null || immutableList2.size() == 0) ? C95p.A03 : C95p.A02;
            nal = n4b2.A02;
            if (nal == null) {
                return;
            } else {
                r304 = new 8Kl(n4b2.A04, n4b2.A01);
            }
        }
        nal.C98(r304);
    }
}
