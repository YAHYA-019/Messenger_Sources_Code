package X;

import android.content.Context;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.xapp.messaging.capability.vector.Capabilities;
import java.util.HashSet;
import java.util.Set;

/* loaded from: A6g.class */
public final class A6g implements 6xM {
    public HashSet A00;
    public boolean A01;
    public final ThreadKey A02;
    public final 72W A03;
    public final C6xN A04;
    public final java.util.Map A05;

    public A6g(72W r302, java.util.Map map) {
        this.A04 = new C6xN();
        this.A05 = map;
        this.A02 = null;
        this.A03 = r302;
        this.A00 = null;
    }

    public A6g(9Na r302) {
        this.A04 = new C6xN();
        java.util.Map map = r302.A01;
        map.getClass();
        this.A05 = map;
        this.A02 = r302.A00;
        this.A03 = null;
        this.A00 = null;
    }

    public /* bridge */ /* synthetic */ Set AoU() {
        HashSet hashSet = this.A00;
        if (hashSet == null) {
            hashSet = AnonymousClass001.A0w(new Class[]{S42.class, 7Af.class, S40.class, S45.class, S3z.class, S41.class});
            this.A00 = hashSet;
        }
        return hashSet;
    }

    public String BGe() {
        return "AutoCompleteActionLoggerPlugin";
    }

    public void BLY(Capabilities capabilities, C77n c77n, 6RU r304, 6Sh r305) {
        C9kg c9kg;
        8Lq r311;
        Integer num;
        Integer num2;
        if (r305 instanceof S40) {
            C9kg c9kg2 = (C9kg) this.A04.A00;
            11T.A0H(r305, c9kg2);
            C9kg.A00(null, c9kg2, 0S2.A0N, null, "ExecutionException attempting to fetch next predicted phrase");
            return;
        }
        if (r305 instanceof S45) {
            S45 s45 = (S45) r305;
            c9kg = (C9kg) this.A04.A00;
            11T.A0H(s45, c9kg);
            Integer num3 = 0S2.A01;
            r311 = s45.A00;
            String str = null;
            C9kg.A00(r311, c9kg, num3, null, null);
            String str2 = s45.A02;
            if (str2 != null) {
                str = 0Pz.A0W(s45.A01, str2);
            }
            c9kg.A01 = str;
        } else {
            if (r305 instanceof S42) {
                S42 s42 = (S42) r305;
                C9kg c9kg3 = (C9kg) this.A04.A00;
                11T.A0H(s42, c9kg3);
                C9kg.A00(s42.A00, c9kg3, 0S2.A00, null, null);
                return;
            }
            if (r305 instanceof S3z) {
                c9kg = (C9kg) this.A04.A00;
                11T.A0H(r305, c9kg);
                num = 0S2.A0C;
                num2 = 0S2.A00;
            } else if (r305 instanceof S41) {
                c9kg = (C9kg) this.A04.A00;
                S41 s41 = (S41) r305;
                11T.A0H(c9kg, s41);
                String str3 = s41.A00;
                C9kg.A01(c9kg);
                if (!11T.A0O(c9kg.A01, str3)) {
                    return;
                }
                num = 0S2.A0C;
                num2 = 0S2.A01;
            } else {
                if (!(r305 instanceof 7Af)) {
                    return;
                }
                c9kg = (C9kg) this.A04.A00;
                11T.A0F(c9kg, 0);
                c9kg.A02 = 7zR.A0s();
                c9kg.A02 = 7zR.A0s();
                r311 = null;
                c9kg.A01 = null;
            }
            r311 = null;
            C9kg.A00(c9kg.A00, c9kg, num, num2, null);
            c9kg.A01 = null;
        }
        c9kg.A00 = r311;
    }

    public void BPN(C77n c77n, 6RU r303, boolean z) {
        if (this.A01) {
            return;
        }
        72V r306 = this.A03;
        ThreadKey threadKey = this.A02;
        java.util.Map map = this.A05;
        C6xN c6xN = this.A04;
        1BK.A1K(r303, 0, c6xN);
        Context context = r303.A00;
        if (r306 == null) {
            r306 = threadKey != null ? new 72V(threadKey) : null;
        }
        c6xN.A00 = new C9kg(context, r306, map);
        this.A01 = true;
    }
}
