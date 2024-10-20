package X;

import android.content.Context;
import android.util.SparseArray;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.acra.util.StatFsUtil;
import com.facebook.common.dextricks.Constants;
import com.facebook.common.dextricks.OdexSchemeArtXdex;
import com.facebook.proxygen.utils.RequestDefragmentingOutputStream;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1tt, reason: invalid class name */
/* loaded from: 1tt.class */
public abstract class C1tt {
    public static final SparseArray A00(List list, boolean z) {
        SparseArray sparseArray;
        SparseArray sparseArray2 = new SparseArray();
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C1ti c1ti = ((1tT) it.next()).A00;
            if (c1ti != null && (sparseArray = c1ti.A05) != null) {
                int size = sparseArray.size();
                for (int i = 0; i < size; i++) {
                    int keyAt = sparseArray.keyAt(i);
                    Object obj = sparseArray.get(keyAt);
                    if (obj != null) {
                        sparseArray2.append(keyAt, obj);
                    }
                }
            }
        }
        if (sparseArray2.size() == 0 && !z) {
            sparseArray2 = null;
        }
        return sparseArray2;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final X.25F A01(android.graphics.drawable.Drawable r301, X.23S r302, X.C1sr r303, int r304, int r305, int r306) {
        /*
            Method dump skipped, instructions count: 460
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1tt.A01(android.graphics.drawable.Drawable, X.23S, X.1sr, int, int, int):X.25F");
    }

    /* JADX WARN: Type inference failed for: r0v49, types: [X.29I, java.lang.Object] */
    public static final 25F A02(final SparseArray sparseArray, final 1LI r302, final 1Iw r303, C1sr c1sr, C28s c28s, final String str, java.util.Map map, final int i, int i2, long j, boolean z, boolean z2, boolean z3, boolean z4) {
        int i3;
        29K r321;
        25F r329;
        11T.A0F(r303, 3);
        29K r0 = c1sr.A0N;
        boolean z5 = true;
        if (z4) {
            r321 = r0;
            i3 = 0;
        } else {
            i3 = 2;
            if (r0 == null || r0.A0B != 2) {
                i3 = 0;
            }
            r321 = null;
        }
        if (z) {
            i3 |= 1;
        }
        if (z2) {
            i3 |= 16;
        }
        if (z3) {
            i3 |= 4;
        }
        if (c1sr.A05().A03.A01.A0R) {
            i3 |= 8;
        }
        if (r0 != null && (r0.A0I != null || r0.A0M != null || r0.A0X != null || r0.A0L != null)) {
            i3 |= 32;
        }
        C29l c29l = c1sr.A0S;
        if (c29l == null || r302.A0m() != 0S2.A0N) {
            r329 = new 29F(sparseArray, r302, r303, r321, str, i3, i, i2, j);
            if (map != null) {
                Iterator A1A = 1BK.A1A(map);
                while (A1A.hasNext()) {
                    r329.A0E((29L) A1A.next());
                }
            }
            C02A c02a = c1sr.A05().A03.A01;
            if (c28s != null) {
                boolean z6 = c02a.A0B;
                if (j != 0) {
                    z5 = false;
                }
                29L r02 = new 29L(C29R.A00, new C29P(c28s, r329, z5, z6, c02a.A0V));
                11T.A0I(r02, "null cannot be cast to non-null type com.facebook.rendercore.RenderUnit.DelegateBinder<kotlin.Any?, kotlin.Any, kotlin.Any>");
                r329.A0E(r02);
            }
            if (c02a.A0O && (r302 instanceof C28u)) {
                29L r03 = new 29L((29I) new Object(), (Object) null);
                11T.A0I(r03, "null cannot be cast to non-null type com.facebook.rendercore.RenderUnit.DelegateBinder<kotlin.Any?, kotlin.Any, kotlin.Any>");
                r329.A0E(r03);
                return r329;
            }
        } else {
            final C2lm c2lm = c29l.A01.A02;
            11T.A0I(c2lm, "null cannot be cast to non-null type com.facebook.rendercore.primitives.PrimitiveRenderUnit<kotlin.Any>");
            11T.A0F(c2lm, 6);
            final 29K r4 = r321;
            final int i4 = i3;
            r329 = new 25F(sparseArray, r302, r303, r4, c2lm, str, i4, i) { // from class: X.2m3
                public final C2lm A00;
                public final String A01;
                public final C1rk A02;

                {
                    C2ll c2ll = c2lm.A01;
                    long j2 = c2ll.A00;
                    Integer num = ((25G) c2lm).A04;
                    this.A00 = c2lm;
                    this.A02 = c2ll.A01;
                    this.A01 = c2lm.A07();
                }

                public 29I A05(Class cls) {
                    return this.A00.A05(C29i.class);
                }

                public void A08(Context context, 2JH r3032, 1sW r304, 25G r305, 1JX r306, Object obj, Object obj2, Object obj3, boolean z7) {
                    C29e c29e;
                    C29e c29e2;
                    11T.A0F(r305, 2);
                    11T.A0F(r3032, 6);
                    C2lm c2lm2 = this.A00;
                    C2lm c2lm3 = ((C2m3) r305).A00;
                    Object obj4 = null;
                    Object obj5 = (!(obj2 instanceof C29e) || (c29e2 = (C29e) obj2) == null) ? null : c29e2.A06;
                    if ((obj3 instanceof C29e) && (c29e = (C29e) obj3) != null) {
                        obj4 = c29e.A06;
                    }
                    c2lm2.A08(context, r3032, r304, c2lm3, r306, obj, obj5, obj4, z7);
                }

                public void A09(Context context, 2JH r3032, 1JX r304, Object obj, Object obj2) {
                    C29e c29e;
                    11T.A0F(r3032, 3);
                    C2lm c2lm2 = this.A00;
                    Object obj3 = null;
                    if ((obj2 instanceof C29e) && (c29e = (C29e) obj2) != null) {
                        obj3 = c29e.A06;
                    }
                    c2lm2.A09(context, r3032, r304, obj, obj3);
                }

                public void A0A(Context context, 2JH r3032, 1JX r304, Object obj, Object obj2) {
                    C29e c29e;
                    11T.A0F(r3032, 3);
                    C2lm c2lm2 = this.A00;
                    Object obj3 = null;
                    if ((obj2 instanceof C29e) && (c29e = (C29e) obj2) != null) {
                        obj3 = c29e.A06;
                    }
                    c2lm2.A0A(context, r3032, r304, obj, obj3);
                }

                public void A0B(Context context, 2JH r3032, 1JX r304, Object obj, Object obj2) {
                    C29e c29e;
                    11T.A0F(obj, 1);
                    11T.A0F(r3032, 3);
                    C2lm c2lm2 = this.A00;
                    Object obj3 = null;
                    if ((obj2 instanceof C29e) && (c29e = (C29e) obj2) != null) {
                        obj3 = c29e.A06;
                    }
                    c2lm2.A0B(context, r3032, r304, obj, obj3);
                }

                public void A0C(Context context, 2JH r3032, 1JX r304, Object obj, Object obj2) {
                    C29e c29e;
                    11T.A0F(r3032, 3);
                    C2lm c2lm2 = this.A00;
                    Object obj3 = null;
                    if ((obj2 instanceof C29e) && (c29e = (C29e) obj2) != null) {
                        obj3 = c29e.A06;
                    }
                    c2lm2.A0C(context, r3032, r304, obj, obj3);
                }

                public void A0E(29L r3022) {
                    11T.A0F(r3022, 0);
                    this.A00.A0E(r3022);
                }

                public boolean A0F() {
                    return this.A00.A00;
                }

                public C1rk A0J() {
                    return this.A02;
                }
            };
        }
        return r329;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0031, code lost:
    
        if (r304.length() == 0) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v20, types: [X.1tu] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final X.C1tu A03(X.C1sr r301) {
        /*
            r0 = r301
            if (r0 != 0) goto La
            r0 = 0
            r302 = r0
            r0 = 0
            r303 = r0
        L8:
            r0 = 0
            return r0
        La:
            r0 = r301
            java.lang.String r0 = r0.A0Z
            r304 = r0
            r0 = r301
            X.5Rn r0 = r0.A0O
            r305 = r0
            r0 = r301
            java.lang.String r0 = r0.A0a
            r306 = r0
            r0 = r301
            java.lang.String r0 = r0.A0A()
            r307 = r0
            r0 = 1
            r308 = r0
            r0 = r304
            if (r0 == 0) goto L34
            r0 = r304
            int r0 = r0.length()
            r302 = r0
            r0 = 0
            r309 = r0
            r0 = r302
            if (r0 != 0) goto L37
        L34:
            r0 = 1
            r309 = r0
        L37:
            r0 = 0
            r302 = r0
            r0 = 0
            r303 = r0
            r0 = r309
            if (r0 != 0) goto L6f
            r0 = r305
            if (r0 == 0) goto L7b
            r0 = r305
            int r0 = r0.ordinal()
            r309 = r0
            r0 = r309
            r1 = 0
            if (r0 == r1) goto L75
            r0 = r309
            r1 = r308
            if (r0 != r1) goto L7b
            r0 = 2
            r308 = r0
        L5c:
            r0 = r304
            if (r0 == 0) goto L8
            X.1tu r0 = new X.1tu
            r303 = r0
            r0 = r303
            r1 = r308
            r2 = r304
            r3 = r306
            r0.<init>(r1, r2, r3)
            r0 = r303
            return r0
        L6f:
            r0 = 3
            r308 = r0
            r0 = r307
            r304 = r0
        L75:
            r0 = 0
            r306 = r0
            goto L5c
        L7b:
            java.lang.StringBuilder r0 = X.AnonymousClass001.A0k()
            r303 = r0
            r0 = r305
            java.lang.String r1 = "Unhandled transition key type "
            r2 = r303
            java.lang.IllegalArgumentException r0 = X.AnonymousClass002.A0C(r0, r1, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1tt.A03(X.1sr):X.1tu");
    }

    public static final C28s A04(1LI r301, 1Iw r302, C1sr c1sr, int i) {
        11T.A0F(r302, 0);
        29K r0 = c1sr.A0N;
        boolean z = r302.A03.A01.A0R;
        C28s c28s = new C28s();
        c28s.A0c = r301 instanceof C28u;
        String A0a = r301.A0a();
        11T.A0A(A0a);
        c28s.A0S = A0a;
        c28s.A08 = i;
        c28s.A0Y = z;
        if (r0 != null) {
            long j = r0.A0F;
            if ((j & 8) != 0) {
                c28s.A0K = r0.A0I;
            }
            if ((j & 16) != 0) {
                c28s.A0N = r0.A0M;
            }
            if ((j & 131072) != 0) {
                c28s.A0L = r0.A0K;
            }
            if ((j & 32) != 0) {
                c28s.A0O = r0.A0X;
            }
            if ((j & 262144) != 0) {
                c28s.A0M = r0.A0L;
            }
            if ((j & 1) != 0) {
                c28s.A0Q = r0.A0a;
            }
            if ((j & 8589934592L) != 0) {
                c28s.A0T = r0.A0d;
            }
            if ((j & OdexSchemeArtXdex.STATE_DO_PERIODIC_PGO_COMP_NEEDED) != 0) {
                c28s.A05 = r0.A05;
                c28s.A07 |= RequestDefragmentingOutputStream.BODY_BUFFER_SIZE;
            }
            if ((j & 134217728) != 0) {
                c28s.A06 = r0.A06;
                c28s.A07 |= 8192;
            }
            if ((j & 268435456) != 0) {
                c28s.A0B = r0.A07;
                c28s.A07 |= Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET;
            }
            if ((j & OdexSchemeArtXdex.STATE_DO_PERIODIC_PGO_COMP_ATTEMPTED) != 0) {
                c28s.A0J = r0.A0H;
            }
            if ((j & OdexSchemeArtXdex.STATE_DO_PERIODIC_PGO_COMP_FINISHED) != 0) {
                c28s.A0X = r0.A0g;
                c28s.A07 |= 128;
            }
            if ((j & 8388608) != 0) {
                c28s.A0W = r0.A0f;
                c28s.A07 |= 64;
            }
            if ((j & 1073741824) != 0) {
                c28s.A0D = r0.A08;
                c28s.A07 |= 65536;
            }
            Object obj = r0.A0b;
            if (obj != null) {
                c28s.A0R = obj;
                c28s.A07 |= Constants.LOAD_RESULT_PGO;
            }
            SparseArray sparseArray = r0.A0G;
            if (sparseArray != null) {
                SparseArray sparseArray2 = c28s.A0I;
                if (sparseArray2 != null) {
                    sparseArray = AnonymousClass675.A00(sparseArray2, sparseArray);
                }
                c28s.A0I = sparseArray;
            }
            String str = r0.A0e;
            if (str != null) {
                c28s.A0U = str;
            }
            int i2 = r0.A0C;
            boolean z2 = false;
            if (i2 != 0) {
                boolean z3 = false;
                if (i2 == 1) {
                    z3 = true;
                }
                c28s.A0b = z3;
                c28s.A07 |= 256;
            }
            int i3 = r0.A0A;
            if (i3 != 0) {
                boolean z4 = false;
                if (i3 == 1) {
                    z4 = true;
                }
                c28s.A0Z = z4;
                c28s.A07 |= 512;
            }
            int i4 = r0.A0B;
            if (i4 != 0) {
                boolean z5 = false;
                if (i4 == 1) {
                    z5 = true;
                }
                c28s.A0a = z5;
                c28s.A07 |= 1024;
            }
            int i5 = r0.A0E;
            if (i5 != 0) {
                boolean z6 = false;
                if (i5 == 1) {
                    z6 = true;
                }
                c28s.A0e = z6;
                c28s.A07 |= EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH;
            }
            int i6 = r0.A0D;
            if (i6 != 0) {
                if (i6 == 1) {
                    z2 = true;
                }
                c28s.A0d = z2;
                c28s.A07 |= Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP;
            }
            long j2 = r0.A0F;
            if ((j2 & 524288) != 0) {
                float f = r0.A04;
                c28s.A04 = f;
                int i7 = c28s.A07;
                int i8 = i7 | 2;
                if (f == 1.0f) {
                    i8 = i7 & (-3);
                }
                c28s.A07 = i8;
            }
            if ((j2 & StatFsUtil.IN_MEGA_BYTE) != 0) {
                float f2 = r0.A00;
                c28s.A00 = f2;
                int i9 = c28s.A07;
                int i10 = i9 | 4;
                if (f2 == 1.0f) {
                    i10 = i9 & (-5);
                }
                c28s.A07 = i10;
            }
            if ((j2 & 2097152) != 0) {
                float f3 = r0.A01;
                c28s.A01 = f3;
                int i11 = c28s.A07;
                int i12 = i11 | 8;
                if (f3 == 0.0f) {
                    i12 = i11 & (-9);
                }
                c28s.A07 = i12;
            }
            if ((j2 & 33554432) != 0) {
                c28s.A02 = r0.A02;
                c28s.A07 |= 16;
            }
            if ((j2 & 67108864) != 0) {
                c28s.A03 = r0.A03;
                c28s.A07 |= 32;
            }
            if ((j2 & 17179869184L) != 0) {
                c28s.A0P = r0.A0Y;
            }
        }
        if (z || !c28s.A0c) {
            c28s.A0G = c1sr.A0B;
            c28s.A0H = c1sr.A0C;
        }
        c28s.A0A = c1sr.A02();
        c28s.A09 = c1sr.A04;
        c28s.A0F = c1sr.A08;
        if ((c1sr.A06 & 1073741824) != 0) {
            c28s.A0C = c1sr.A05;
        } else {
            c28s.A0E = c1sr.A07;
        }
        c28s.A0V = c1sr.A0c;
        return c28s;
    }
}
