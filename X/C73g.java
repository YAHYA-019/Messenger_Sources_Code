package X;

import com.facebook.xapp.messaging.capability.vector.Capabilities;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* renamed from: X.73g, reason: invalid class name */
/* loaded from: 73g.class */
public final class C73g extends C00q implements Function1 {
    public static final C73g A00 = new C73g();

    public C73g() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        final C73h c73h = (C73h) obj;
        return new 6xM(c73h) { // from class: X.73i
            public HashSet A00;
            public boolean A01;
            public final C6xN A02 = new C6xN();

            {
                this.A00 = c73h.A00;
            }

            public /* bridge */ /* synthetic */ Set AoU() {
                HashSet hashSet = this.A00;
                if (hashSet == null) {
                    hashSet = new HashSet(Arrays.asList(7AO.class, A61.class));
                    this.A00 = hashSet;
                }
                return hashSet;
            }

            public String BGe() {
                return "ComposerReplacementPlugin";
            }

            /* JADX WARN: Type inference failed for: r309v0, types: [X.7qO, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r309v3, types: [X.7qO, java.lang.Object] */
            public void BLY(Capabilities capabilities, C77n c77n, 6RU r304, 6Sh r305) {
                AnonymousClass690 anonymousClass690;
                C7qO c7qO;
                if (r305 instanceof 7AO) {
                    Object obj2 = ((7AO) r305).A00;
                    if (obj2 instanceof C5Sk) {
                        if (!this.A01) {
                            this.A01 = true;
                        }
                        C5Sk c5Sk = (C5Sk) obj2;
                        78J AUP = c77n.AUP(78J.class);
                        C6xN c6xN = this.A02;
                        11T.A0F(r304, 0);
                        11T.A0F(c5Sk, 2);
                        11T.A0F(AUP, 3);
                        11T.A0F(c6xN, 4);
                        c6xN.A00 = c5Sk;
                        int i = c5Sk.A00;
                        anonymousClass690 = c5Sk.A01;
                        int i2 = AUP.A00;
                        if ((i == i2 && 11T.A0O(anonymousClass690, AUP.A01)) || i == 19) {
                            return;
                        }
                        if (i2 == 0 && i != 0) {
                            7FI.A02(r304, 7Ax.A02);
                        }
                        ?? obj3 = new Object();
                        obj3.A00 = i;
                        c7qO = obj3;
                        c7qO.A01 = anonymousClass690;
                        c77n.ClL(new 78J(c7qO));
                    }
                }
                if (r305 instanceof A61) {
                    if (!this.A01) {
                        this.A01 = true;
                    }
                    C5Sk c5Sk2 = (C5Sk) this.A02.A00;
                    11T.A0H(c77n, c5Sk2);
                    ?? obj4 = new Object();
                    obj4.A00 = c5Sk2.A00;
                    anonymousClass690 = c5Sk2.A01;
                    c7qO = obj4;
                    c7qO.A01 = anonymousClass690;
                    c77n.ClL(new 78J(c7qO));
                }
            }

            public void BPN(C77n c77n, 6RU r303, boolean z) {
                if (z || this.A01) {
                    return;
                }
                this.A01 = true;
            }
        };
    }
}
