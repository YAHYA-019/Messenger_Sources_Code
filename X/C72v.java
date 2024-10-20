package X;

import com.facebook.xapp.messaging.capability.vector.Capabilities;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* renamed from: X.72v, reason: invalid class name */
/* loaded from: 72v.class */
public final class C72v extends C00q implements Function1 {
    public static final C72v A00 = new C72v();

    public C72v() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        final C72w c72w = (C72w) obj;
        return new 6xM(c72w) { // from class: X.72x
            public HashSet A00;
            public boolean A01;
            public final C6xN A02;
            public final C6xN A03;

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, X.6xN] */
            {
                ?? obj2 = new Object();
                obj2.A00 = false;
                this.A02 = obj2;
                this.A03 = new C6xN();
                this.A00 = c72w.A00;
            }

            private void A00() {
                if (this.A01) {
                    return;
                }
                C6xN c6xN = this.A02;
                C6xN c6xN2 = this.A03;
                11T.A0F(c6xN, 0);
                11T.A0F(c6xN2, 1);
                c6xN.A00 = false;
                c6xN2.A00 = new WeakReference(null);
                this.A01 = true;
            }

            public /* bridge */ /* synthetic */ Set AoU() {
                HashSet hashSet = this.A00;
                if (hashSet == null) {
                    hashSet = new HashSet(Arrays.asList(7Af.class, 7CC.class, 7CD.class, 7CE.class));
                    this.A00 = hashSet;
                }
                return hashSet;
            }

            public String BGe() {
                return "DraftListenerPlugin";
            }

            public void BLY(Capabilities capabilities, C77n c77n, 6RU r304, 6Sh r305) {
                Reference reference;
                C6xN c6xN;
                boolean z;
                if (r305 instanceof 7CE) {
                    A00();
                    reference = (Reference) this.A03.A00;
                    c6xN = this.A02;
                    11T.A0F(reference, 0);
                    z = true;
                    11T.A0F(c6xN, 1);
                } else {
                    if (!(r305 instanceof 7Af) && !(r305 instanceof 7CC)) {
                        if (r305 instanceof 7CD) {
                            A00();
                            7CD r0 = (7CD) r305;
                            C6xN c6xN2 = this.A03;
                            11T.A0H(r0, c6xN2);
                            c6xN2.A00 = new WeakReference(r0.A00);
                            return;
                        }
                        return;
                    }
                    A00();
                    reference = (Reference) this.A03.A00;
                    c6xN = this.A02;
                    z = false;
                    11T.A0F(reference, 0);
                    11T.A0F(c6xN, 1);
                }
                Boolean bool = (Boolean) c6xN.A00;
                boolean booleanValue = bool != null ? bool.booleanValue() : false;
                7Si r02 = (7Si) reference.get();
                if (booleanValue != z) {
                    c6xN.A00 = Boolean.valueOf(z);
                    if (r02 != null) {
                        r02.A00.A00 = z;
                    }
                }
            }

            public void BPN(C77n c77n, 6RU r303, boolean z) {
                if (z) {
                    return;
                }
                A00();
            }
        };
    }
}
