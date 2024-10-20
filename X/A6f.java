package X;

import com.facebook.xapp.messaging.capability.vector.Capabilities;
import java.util.HashSet;
import java.util.Set;

/* loaded from: A6f.class */
public final class A6f implements 6xM {
    public HashSet A00;
    public boolean A01;
    public final AZP A02;
    public final C6xN A03;
    public final 6wV A04;

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, X.6xN] */
    public A6f(AZP azp, 6wV r303) {
        Integer A0k = 4YU.A0k();
        ?? obj = new Object();
        obj.A00 = A0k;
        this.A03 = obj;
        this.A02 = azp;
        r303.getClass();
        this.A04 = r303;
        this.A00 = null;
    }

    private void A00() {
        if (this.A01) {
            return;
        }
        C6xN c6xN = this.A03;
        11T.A0F(c6xN, 1);
        c6xN.A00 = 4YU.A0k();
        this.A01 = true;
    }

    public /* bridge */ /* synthetic */ Set AoU() {
        HashSet hashSet = this.A00;
        if (hashSet == null) {
            hashSet = AnonymousClass001.A0w(new Class[]{7Ae.class, 7Ax.class});
            this.A00 = hashSet;
        }
        return hashSet;
    }

    public String BGe() {
        return "MontageViewerTextPlugin";
    }

    public void BLY(Capabilities capabilities, C77n c77n, 6RU r304, 6Sh r305) {
        if (r305 instanceof 7Ax) {
            A00();
            AZP azp = this.A02;
            6wV r0 = this.A04;
            azp.D7l(r0.getText().toString());
            r0.CvI("");
            return;
        }
        if (r305 instanceof 7Ae) {
            A00();
            AZP azp2 = this.A02;
            6wV r02 = this.A04;
            C6xN c6xN = this.A03;
            11T.A0F(c6xN, 2);
            int Atq = r02.Atq();
            Number number = (Number) c6xN.A00;
            if (number == null || number.intValue() != Atq) {
                c6xN.A00 = Integer.valueOf(Atq);
                azp2.D6j(Atq);
            }
        }
    }

    public void BPN(C77n c77n, 6RU r303, boolean z) {
        if (z) {
            return;
        }
        A00();
    }
}
