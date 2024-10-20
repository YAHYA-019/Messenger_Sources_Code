package X;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.686, reason: invalid class name */
/* loaded from: 686.class */
public final class AnonymousClass686 extends AnonymousClass687 implements Comparable {
    public static final AnonymousClass688 A0B = new AnonymousClass688(0S2.A00, "");
    public AnonymousClass689 A00;
    public AnonymousClass689 A01;
    public AnonymousClass689 A02;
    public AnonymousClass689 A03;
    public final AnonymousClass248 A04;
    public final C26G A05;
    public final C26G A06;
    public final AnonymousClass253 A07;
    public final boolean A08;
    public transient AnonymousClass688 A09;
    public transient C68N A0A;

    public AnonymousClass686(AnonymousClass248 anonymousClass248, C26G c26g, C26G c26g2, AnonymousClass253 anonymousClass253, boolean z) {
        this.A07 = anonymousClass253;
        this.A04 = anonymousClass248;
        this.A05 = c26g;
        this.A06 = c26g2;
        this.A08 = z;
    }

    public AnonymousClass686(C26G c26g, AnonymousClass686 anonymousClass686) {
        this.A07 = anonymousClass686.A07;
        this.A04 = anonymousClass686.A04;
        this.A05 = anonymousClass686.A05;
        this.A06 = c26g;
        this.A01 = anonymousClass686.A01;
        this.A00 = anonymousClass686.A00;
        this.A02 = anonymousClass686.A02;
        this.A03 = anonymousClass686.A03;
        this.A08 = anonymousClass686.A08;
    }

    public static int A00(C68D c68d) {
        String name = c68d.A00.getName();
        if (!name.startsWith("get") || name.length() <= 3) {
            return (!name.startsWith("is") || name.length() <= 2) ? 3 : 2;
        }
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0067, code lost:
    
        if (r0.length() <= 3) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0092, code lost:
    
        if (r0.length() <= 3) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0038, code lost:
    
        if (r0.isAssignableFrom(r0) != false) goto L8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static X.C68D A01(X.C68D r301, X.C68D r302, X.AnonymousClass686 r303) {
        /*
            r0 = r301
            java.lang.reflect.Method r0 = r0.A00
            r304 = r0
            r0 = r304
            java.lang.Class r0 = r0.getDeclaringClass()
            r305 = r0
            r0 = r302
            java.lang.reflect.Method r0 = r0.A00
            r306 = r0
            r0 = r306
            java.lang.Class r0 = r0.getDeclaringClass()
            r307 = r0
            r0 = r305
            r1 = r307
            if (r0 == r1) goto L3d
            r0 = r305
            r1 = r307
            boolean r0 = r0.isAssignableFrom(r1)
            r308 = r0
            r0 = r308
            if (r0 != 0) goto La8
            r0 = r307
            r1 = r305
            boolean r0 = r0.isAssignableFrom(r1)
            r308 = r0
            r0 = r308
            if (r0 == 0) goto L3d
        L3b:
            r0 = r301
            return r0
        L3d:
            r0 = r306
            java.lang.String r0 = r0.getName()
            r307 = r0
            java.lang.String r0 = "set"
            r306 = r0
            r0 = r307
            r1 = r306
            boolean r0 = r0.startsWith(r1)
            r308 = r0
            r0 = r308
            if (r0 == 0) goto L6a
            r0 = r307
            int r0 = r0.length()
            r309 = r0
            r0 = 3
            r308 = r0
            r0 = 1
            r310 = r0
            r0 = r309
            r1 = r308
            if (r0 > r1) goto L6d
        L6a:
            r0 = 2
            r310 = r0
        L6d:
            r0 = r304
            java.lang.String r0 = r0.getName()
            r307 = r0
            r0 = r307
            r1 = r306
            boolean r0 = r0.startsWith(r1)
            r308 = r0
            r0 = r308
            if (r0 == 0) goto L95
            r0 = r307
            int r0 = r0.length()
            r311 = r0
            r0 = 3
            r309 = r0
            r0 = 1
            r308 = r0
            r0 = r311
            r1 = r309
            if (r0 > r1) goto L98
        L95:
            r0 = 2
            r308 = r0
        L98:
            r0 = r310
            r1 = r308
            if (r0 == r1) goto Laa
            r0 = r310
            r1 = r308
            if (r0 >= r1) goto L3b
            r0 = r302
            return r0
        La8:
            r0 = r302
            return r0
        Laa:
            r0 = r303
            X.248 r0 = r0.A04
            r312 = r0
            r0 = r312
            if (r0 != 0) goto Lb7
            r0 = 0
            return r0
        Lb7:
            r0 = r312
            r1 = r301
            r2 = r302
            X.68D r0 = r0.A0I(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass686.A01(X.68D, X.68D, X.686):X.68D");
    }

    private C67v A02(AnonymousClass689 anonymousClass689) {
        C67v c67v = ((AbstractC00953pX) anonymousClass689.A02).A00;
        AnonymousClass689 anonymousClass6892 = anonymousClass689.A01;
        if (anonymousClass6892 != null) {
            c67v = C67v.A00(c67v, A02(anonymousClass6892));
        }
        return c67v;
    }

    public static C67v A03(AnonymousClass686 anonymousClass686, AnonymousClass689[] anonymousClass689Arr, int i) {
        C67v A02 = anonymousClass686.A02(anonymousClass689Arr[i]);
        do {
            i++;
            if (i >= anonymousClass689Arr.length) {
                return A02;
            }
        } while (anonymousClass689Arr[i] == null);
        return C67v.A00(A02, A03(anonymousClass686, anonymousClass689Arr, i));
    }

    public static AnonymousClass689 A04(C67v c67v, AnonymousClass689 anonymousClass689, AnonymousClass686 anonymousClass686) {
        AnonymousClass689 anonymousClass6892 = anonymousClass689;
        C24r A09 = ((AbstractC00953pX) anonymousClass689.A02).A09(c67v);
        AnonymousClass689 anonymousClass6893 = anonymousClass689.A01;
        if (anonymousClass6893 != null) {
            anonymousClass6892 = anonymousClass689.A05(A04(c67v, anonymousClass6893, anonymousClass686));
        }
        if (A09 != anonymousClass6892.A02) {
            anonymousClass6892 = new AnonymousClass689(anonymousClass6892.A00, anonymousClass6892.A01, A09, anonymousClass6892.A04, anonymousClass6892.A05, anonymousClass6892.A03);
        }
        return anonymousClass6892;
    }

    public static Set A05(AnonymousClass689 anonymousClass689, Set set) {
        while (anonymousClass689 != null) {
            if (anonymousClass689.A04 && anonymousClass689.A00 != null) {
                if (set == null) {
                    set = new HashSet();
                }
                set.add(anonymousClass689.A00);
            }
            anonymousClass689 = anonymousClass689.A01;
        }
        return set;
    }

    public static void A06(AnonymousClass689 anonymousClass689, AnonymousClass686 anonymousClass686, Collection collection, java.util.Map map) {
        AnonymousClass689 anonymousClass6892 = anonymousClass689;
        while (true) {
            AnonymousClass689 anonymousClass6893 = anonymousClass6892;
            if (anonymousClass6893 == null) {
                return;
            }
            C26G c26g = anonymousClass6893.A00;
            if (anonymousClass6893.A04 && c26g != null) {
                AnonymousClass686 anonymousClass6862 = (AnonymousClass686) map.get(c26g);
                if (anonymousClass6862 == null) {
                    anonymousClass6862 = new AnonymousClass686(anonymousClass686.A04, anonymousClass686.A05, c26g, anonymousClass686.A07, anonymousClass686.A08);
                    map.put(c26g, anonymousClass6862);
                }
                if (anonymousClass689 == anonymousClass686.A01) {
                    anonymousClass6862.A01 = anonymousClass6893.A05(anonymousClass6862.A01);
                } else if (anonymousClass689 == anonymousClass686.A02) {
                    anonymousClass6862.A02 = anonymousClass6893.A05(anonymousClass6862.A02);
                } else if (anonymousClass689 == anonymousClass686.A03) {
                    anonymousClass6862.A03 = anonymousClass6893.A05(anonymousClass6862.A03);
                } else {
                    if (anonymousClass689 != anonymousClass686.A00) {
                        throw 1BL.A0h(anonymousClass686, "Internal error: mismatched accessors, property: ", AnonymousClass001.A0k());
                    }
                    anonymousClass6862.A00 = anonymousClass6893.A05(anonymousClass6862.A00);
                }
            } else if (anonymousClass6893.A05) {
                StringBuilder A0k = AnonymousClass001.A0k();
                A0k.append("Conflicting/ambiguous property name definitions (implicit name ");
                C26G c26g2 = anonymousClass686.A06;
                Iterator it = 27C.A00;
                A0k.append(c26g2 == null ? "[null]" : 27C.A08(c26g2._simpleName));
                A0k.append("): found multiple explicit names: ");
                A0k.append(collection);
                throw 1BL.A0h(anonymousClass6893, ", but also implicit accessor: ", A0k);
            }
            anonymousClass6892 = anonymousClass6893.A01;
        }
    }

    public static boolean A07(AnonymousClass689 anonymousClass689) {
        while (anonymousClass689 != null) {
            if (anonymousClass689.A00 != null && anonymousClass689.A04) {
                return true;
            }
            anonymousClass689 = anonymousClass689.A01;
        }
        return false;
    }

    public static boolean A08(AnonymousClass689 anonymousClass689) {
        while (anonymousClass689 != null) {
            if (anonymousClass689.A00 != null && (!anonymousClass689.A00._simpleName.isEmpty())) {
                return true;
            }
            anonymousClass689 = anonymousClass689.A01;
        }
        return false;
    }

    public Set A0Y() {
        Set A05 = A05(this.A00, A05(this.A03, A05(this.A02, A05(this.A01, null))));
        if (A05 == null) {
            A05 = Collections.emptySet();
        }
        return A05;
    }

    public void A0Z(AnonymousClass686 anonymousClass686) {
        AnonymousClass689 anonymousClass689 = this.A01;
        AnonymousClass689 anonymousClass6892 = anonymousClass686.A01;
        if (anonymousClass689 != null) {
            if (anonymousClass6892 != null) {
                anonymousClass689 = anonymousClass689.A04(anonymousClass6892);
            }
            anonymousClass6892 = anonymousClass689;
        }
        this.A01 = anonymousClass6892;
        AnonymousClass689 anonymousClass6893 = this.A00;
        AnonymousClass689 anonymousClass6894 = anonymousClass686.A00;
        if (anonymousClass6893 != null) {
            if (anonymousClass6894 != null) {
                anonymousClass6893 = anonymousClass6893.A04(anonymousClass6894);
            }
            anonymousClass6894 = anonymousClass6893;
        }
        this.A00 = anonymousClass6894;
        AnonymousClass689 anonymousClass6895 = this.A02;
        AnonymousClass689 anonymousClass6896 = anonymousClass686.A02;
        if (anonymousClass6895 != null) {
            if (anonymousClass6896 != null) {
                anonymousClass6895 = anonymousClass6895.A04(anonymousClass6896);
            }
            anonymousClass6896 = anonymousClass6895;
        }
        this.A02 = anonymousClass6896;
        AnonymousClass689 anonymousClass6897 = this.A03;
        AnonymousClass689 anonymousClass6898 = anonymousClass686.A03;
        if (anonymousClass6897 != null) {
            if (anonymousClass6898 != null) {
                anonymousClass6897 = anonymousClass6897.A04(anonymousClass6898);
            }
            anonymousClass6898 = anonymousClass6897;
        }
        this.A03 = anonymousClass6898;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        AnonymousClass686 anonymousClass686 = (AnonymousClass686) obj;
        AnonymousClass689 anonymousClass689 = this.A00;
        AnonymousClass689 anonymousClass6892 = anonymousClass686.A00;
        if (anonymousClass689 != null) {
            if (anonymousClass6892 == null) {
                return -1;
            }
        } else if (anonymousClass6892 != null) {
            return 1;
        }
        return A0M().compareTo(anonymousClass686.A0M());
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("[Property '");
        A0k.append(this.A06);
        A0k.append("'; ctors: ");
        A0k.append(this.A00);
        A0k.append(", field(s): ");
        A0k.append(this.A01);
        A0k.append(", getter(s): ");
        A0k.append(this.A02);
        A0k.append(", setter(s): ");
        A0k.append(this.A03);
        return AnonymousClass001.A0d("]", A0k);
    }
}
