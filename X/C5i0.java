package X;

import android.graphics.drawable.Drawable;
import java.lang.ref.Reference;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.5i0, reason: invalid class name */
/* loaded from: 5i0.class */
public final class C5i0 {
    public C5hz A01;
    public boolean A03 = false;
    public boolean A02 = false;
    public long A00 = Long.MIN_VALUE;
    public final C5i1 A05 = C5i1.A02;
    public final 2XX A04 = new 2XX() { // from class: X.5i2
        public void A01(long j) {
            float interpolation;
            boolean z;
            Throwable A0Q;
            C5i0 c5i0 = C5i0.this;
            c5i0.A02 = false;
            if (c5i0.A03) {
                if (c5i0.A00 != j) {
                    C5hz c5hz = c5i0.A01;
                    synchronized (c5hz) {
                        if (c5hz.A00) {
                            ArrayList arrayList = c5hz.A02;
                            arrayList.clear();
                            Set set = c5hz.A06;
                            if (set.size() != 0) {
                                0WH r0 = new 0WH(0);
                                0QO r02 = new 0QO(0);
                                ArrayDeque arrayDeque = new ArrayDeque();
                                Iterator it = set.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        break;
                                    }
                                    ArrayList arrayList2 = ((C5i3) it.next()).A05;
                                    int size = arrayList2.size();
                                    for (int i = 0; i < size; i++) {
                                        C5i7 c5i7 = (C5i7) arrayList2.get(i);
                                        ArrayList arrayList3 = c5i7.A02;
                                        if (arrayList3 != null) {
                                            int size2 = arrayList3.size();
                                            if (size2 != 0) {
                                                r02.put(c5i7, Integer.valueOf(size2));
                                            }
                                        }
                                        if (!r0.contains(c5i7)) {
                                            arrayDeque.add(c5i7);
                                            r0.add(c5i7);
                                        }
                                    }
                                }
                                if (r02.isEmpty() || !r0.isEmpty()) {
                                    loop2: while (true) {
                                        if (!arrayDeque.isEmpty()) {
                                            C5i7 c5i72 = (C5i7) arrayDeque.pollFirst();
                                            arrayList.add(c5i72);
                                            java.util.Map map = c5i72.A03;
                                            for (Object obj : map == null ? Collections.emptySet() : map.values()) {
                                                int intValue = ((Integer) r02.get(obj)).intValue() - 1;
                                                r02.put(obj, Integer.valueOf(intValue));
                                                if (intValue != 0) {
                                                    if (intValue < 0) {
                                                        new RuntimeException("Detected cycle.");
                                                        break loop2;
                                                    }
                                                } else {
                                                    arrayDeque.addLast(obj);
                                                }
                                            }
                                        } else if (arrayList.size() == r02.size() + r0.size()) {
                                            Collections.reverse(arrayList);
                                            c5hz.A00 = false;
                                        } else {
                                            new RuntimeException("Had unreachable nodes in graph -- this likely means there was a cycle");
                                        }
                                    }
                                } else {
                                    new RuntimeException("Graph has nodes, but they represent a cycle with no leaf nodes!");
                                }
                                throw A0Q;
                            }
                        }
                        ArrayList arrayList4 = c5hz.A02;
                        int size3 = arrayList4.size();
                        int i2 = 0;
                        while (true) {
                            int i3 = i2;
                            if (i3 < size3) {
                                5iB r03 = (C5i7) arrayList4.get(i3);
                                if (r03 instanceof 5iB) {
                                    interpolation = r03.A00;
                                } else if (r03 instanceof C5i9) {
                                    C5i9 c5i9 = (C5i9) r03;
                                    if (c5i9.A01 == Long.MIN_VALUE) {
                                        c5i9.A02 = j;
                                        c5i9.A01 = j;
                                        c5i9.A00 = j + (c5i9.A03 * 1000000);
                                        interpolation = 0.0f;
                                    } else {
                                        long j2 = c5i9.A00;
                                        c5i9.A01 = j;
                                        if (j >= j2) {
                                            interpolation = 1.0f;
                                        } else {
                                            long j3 = c5i9.A02;
                                            interpolation = ((float) (j - j3)) / ((float) (j2 - j3));
                                        }
                                    }
                                } else if (r03 instanceof 5iC) {
                                    float f = ((C5i7) r03).A02("initial").A00;
                                    interpolation = f + (r03.A02("default_input").A00 * (r03.A02("end").A00 - f));
                                } else if (r03 instanceof 5iD) {
                                    5iD r04 = (5iD) r03;
                                    interpolation = r04.A00.getInterpolation(r04.A02("default_input").A00);
                                } else if (r03 instanceof C5i6) {
                                    C5i6 c5i6 = (C5i6) r03;
                                    java.util.Map map2 = c5i6.A03;
                                    if (map2 != null && map2.size() > 1) {
                                        A0Q = AnonymousClass001.A0T("Trying to check for single input of node with multiple inputs!");
                                        break;
                                    }
                                    java.util.Map map3 = c5i6.A03;
                                    boolean containsKey = map3 == null ? false : map3.containsKey("default_input");
                                    Reference reference = (Reference) c5i6.A00.A02();
                                    if (reference != null) {
                                        Object obj2 = reference.get();
                                        if (obj2 != null) {
                                            if ((obj2 instanceof Drawable) && ((Drawable) obj2).getCallback() == null) {
                                                reference.clear();
                                            } else if (containsKey) {
                                                java.util.Map map4 = c5i6.A03;
                                                if (map4 != null && map4.size() > 1) {
                                                    A0Q = AnonymousClass001.A0T("Trying to get single input of node with multiple inputs!");
                                                    break;
                                                } else {
                                                    interpolation = c5i6.A02("default_input").A00;
                                                    C5i6.A01(c5i6, interpolation);
                                                }
                                            } else {
                                                interpolation = c5i6.A01.AUE(obj2);
                                            }
                                        }
                                    }
                                    if (containsKey) {
                                        java.util.Map map5 = c5i6.A03;
                                        if (map5 != null && map5.size() > 1) {
                                            A0Q = AnonymousClass001.A0T("Trying to get single input of node with multiple inputs!");
                                            break;
                                        }
                                        interpolation = c5i6.A02("default_input").A00;
                                    } else {
                                        interpolation = ((C5i7) c5i6).A00;
                                    }
                                } else {
                                    C6c4 c6c4 = (C6c4) r03;
                                    long j4 = c6c4.A00;
                                    double d = -0.0d;
                                    if (j4 == Long.MIN_VALUE) {
                                        c6c4.A00 = j;
                                        interpolation = c6c4.A02("initial").A00;
                                        float f2 = c6c4.A02("end").A00;
                                        C6c5 c6c5 = c6c4.A01;
                                        double d2 = interpolation;
                                        C6c6 c6c6 = c6c5.A04;
                                        c6c6.A00 = d2;
                                        Iterator it2 = c6c5.A07.iterator();
                                        if (it2.hasNext()) {
                                            it2.next();
                                            A0Q = AnonymousClass001.A0Q("onSpringUpdate");
                                            break;
                                        } else {
                                            double d3 = c6c6.A00;
                                            c6c5.A00 = d3;
                                            c6c5.A06.A00 = d3;
                                            c6c6.A01 = 0.0d;
                                            c6c5.A00(f2);
                                        }
                                    } else {
                                        interpolation = c6c4.A02("end").A00;
                                        C6c5 c6c52 = c6c4.A01;
                                        c6c52.A00(interpolation);
                                        if (!c6c52.A01()) {
                                            double d4 = (j - c6c4.A00) / 1.0E9d;
                                            boolean z2 = false;
                                            double d5 = c6c52.A01 + (d4 <= 0.064d ? d4 : 0.064d);
                                            c6c52.A01 = d5;
                                            5Rk r05 = c6c52.A02;
                                            double d6 = r05.A01;
                                            double d7 = r05.A00;
                                            C6c6 c6c62 = c6c52.A04;
                                            double d8 = c6c62.A00;
                                            double d9 = c6c62.A01;
                                            C6c6 c6c63 = c6c52.A06;
                                            double d10 = c6c63.A00;
                                            double d11 = c6c63.A01;
                                            while (d5 >= 0.001d) {
                                                d5 -= 0.001d;
                                                c6c52.A01 = d5;
                                                if (d5 < 0.001d) {
                                                    C6c6 c6c64 = c6c52.A05;
                                                    c6c64.A00 = d8;
                                                    c6c64.A01 = d9;
                                                }
                                                double d12 = c6c52.A00;
                                                double d13 = ((d12 - d10) * d6) - (d7 * d9);
                                                double d14 = d9 + (d13 * 0.001d * 0.5d);
                                                double d15 = ((d12 - (((d9 * 0.001d) * 0.5d) + d8)) * d6) - (d7 * d14);
                                                double d16 = d8 + (d14 * 0.001d * 0.5d);
                                                double d17 = d9 + (d15 * 0.001d * 0.5d);
                                                double d18 = ((d12 - d16) * d6) - (d7 * d17);
                                                d10 = d8 + (d17 * 0.001d);
                                                d11 = d9 + (d18 * 0.001d);
                                                d8 += (d9 + ((d14 + d17) * 2.0d) + d11) * 0.16666666666666666d * 0.001d;
                                                d9 += (d13 + ((d15 + d18) * 2.0d) + (((d12 - d10) * d6) - (d7 * d11))) * 0.16666666666666666d * 0.001d;
                                            }
                                            c6c63.A00 = d10;
                                            c6c63.A01 = d11;
                                            c6c62.A00 = d8;
                                            c6c62.A01 = d9;
                                            if (d5 > 0.0d) {
                                                double d19 = d5 / 0.001d;
                                                double d20 = d8 * d19;
                                                C6c6 c6c65 = c6c52.A05;
                                                double d21 = c6c65.A00;
                                                double d22 = 1.0d - d19;
                                                d8 = d20 + (d21 * d22);
                                                c6c62.A00 = d8;
                                                d9 = (d9 * d19) + (c6c65.A01 * d22);
                                                c6c62.A01 = d9;
                                            }
                                            if (c6c52.A01()) {
                                                if (d6 > 0.0d) {
                                                    c6c62.A00 = c6c52.A00;
                                                } else {
                                                    c6c52.A00 = d8;
                                                }
                                                if (0.0d != d9) {
                                                    c6c62.A01 = 0.0d;
                                                }
                                                z2 = true;
                                            }
                                            if (c6c52.A03) {
                                                c6c52.A03 = false;
                                                z = true;
                                            } else {
                                                z = false;
                                            }
                                            if (z2) {
                                                c6c52.A03 = true;
                                            }
                                            Iterator it3 = c6c52.A07.iterator();
                                            if (it3.hasNext()) {
                                                it3.next();
                                                A0Q = z ? AnonymousClass001.A0Q("onSpringActivate") : AnonymousClass001.A0Q("onSpringUpdate");
                                            } else {
                                                c6c4.A00 = j;
                                                interpolation = (float) c6c62.A00;
                                            }
                                        }
                                    }
                                }
                                if (j == r03.A01) {
                                    A0Q = AnonymousClass001.A0T("Got a calculate value call multiple times in the same frame. This isn't expected.");
                                    break;
                                } else {
                                    r03.A01 = j;
                                    r03.A00 = interpolation;
                                    i2 = i3 + 1;
                                }
                            } else {
                                int size4 = arrayList4.size();
                                for (int i4 = 0; i4 < size4; i4++) {
                                    5iA r06 = (C5i7) arrayList4.get(i4);
                                    java.util.Map map6 = c5hz.A05;
                                    5iE r07 = (5iE) map6.get(r06);
                                    if (r07 != null && !r07.A01) {
                                        java.util.Map map7 = r06.A03;
                                        Iterator it4 = (map7 == null ? Collections.emptySet() : map7.values()).iterator();
                                        while (true) {
                                            if (it4.hasNext()) {
                                                if (!((5iE) map6.get(it4.next())).A01) {
                                                    break;
                                                }
                                            } else if (!(r06 instanceof 5iA) || r06.BSj()) {
                                                r07.A01 = true;
                                            }
                                        }
                                    }
                                }
                                c5hz.A01 = true;
                                for (C5i3 c5i3 : c5hz.A06) {
                                    ArrayList arrayList5 = c5i3.A05;
                                    int size5 = arrayList5.size();
                                    int i5 = 0;
                                    while (true) {
                                        if (i5 >= size5) {
                                            C5i5 c5i5 = c5i3.A00;
                                            if (c5i5 != null) {
                                                C5hx c5hx = c5i5.A00;
                                                c5hx.A03();
                                                c5hx.A08();
                                            }
                                            c5i3.A00();
                                        } else if (((5iE) c5hz.A05.get(arrayList5.get(i5))).A01) {
                                            i5++;
                                        }
                                    }
                                }
                                c5hz.A01 = false;
                                List list = c5hz.A03;
                                Iterator it5 = list.iterator();
                                while (it5.hasNext()) {
                                    c5hz.A00((C5i3) it5.next());
                                }
                                List list2 = c5hz.A04;
                                Iterator it6 = list2.iterator();
                                while (it6.hasNext()) {
                                    c5hz.A01((C5i3) it6.next());
                                }
                                list.clear();
                                list2.clear();
                            }
                        }
                        throw A0Q;
                    }
                    c5i0.A00 = j;
                }
                if (!c5i0.A03 || c5i0.A02) {
                    return;
                }
                c5i0.A05.A01(c5i0.A04);
                c5i0.A02 = true;
            }
        }
    };
}
