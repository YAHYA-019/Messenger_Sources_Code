package X;

import android.util.SparseArray;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;

/* renamed from: X.0fp, reason: invalid class name */
/* loaded from: 0fp.class */
public final class C0fp implements C04H {
    public final SparseArray A00;
    public final 15X A01;
    public final IntBuffer A02;
    public final 15T A03;
    public final C15h A04;

    public C0fp(15T r302, 15X r303, IntBuffer intBuffer, C15h c15h) {
        11T.A0F(intBuffer, 2);
        this.A01 = r303;
        this.A02 = intBuffer;
        this.A03 = r302;
        this.A04 = c15h;
        this.A00 = new SparseArray();
    }

    private final boolean A00(Object obj, String str) {
        02R r0;
        java.util.Map map;
        15W r02;
        if (str != null && (map = this.A01.A04) != null && map.containsKey(str) && (r02 = (15W) map.get(str)) != null) {
            Class cls = r02.A02;
            if (obj == null ? cls.equals(String.class) : 11T.A0O(obj.getClass(), cls)) {
                return true;
            }
        }
        C15h c15h = this.A04;
        if (c15h == null || (r0 = (02R) c15h.get()) == null) {
            return false;
        }
        r0.Cg6(this.A01.A01, str, "annotation key not matches schema definition");
        return false;
    }

    @Override // X.C04H
    public void Cd0(int i, int i2, String str, int i3) {
        synchronized (this) {
            if (A00(Integer.valueOf(i3), str)) {
                15T r0 = this.A03;
                if (str == null) {
                    str = "";
                }
                java.util.Map map = r0.A03.A04;
                if (map != null) {
                    15W r02 = (15W) map.get(str);
                    if (r02 != null) {
                        ByteBuffer byteBuffer = r0.A05;
                        byteBuffer.putInt(0, i3);
                        byte[] array = byteBuffer.array();
                        11T.A0A(array);
                        15T.A00(r0, r02, array, i2);
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r317v0, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r317v1 */
    /* JADX WARN: Type inference failed for: r317v3 */
    @Override // X.C04H
    public void Cd1(int i, int i2, String str, String str2) {
        Object A0l;
        synchronized (this) {
            if (A00(str2, str)) {
                15T r0 = this.A03;
                if (str == null) {
                    str = "";
                }
                C15h c15h = this.A04;
                15X r02 = r0.A03;
                java.util.Map map = r02.A04;
                if (map != null) {
                    15W r03 = (15W) map.get(str);
                    if (r03 != null && (r03 instanceof 0fP)) {
                        0fP r04 = (0fP) r03;
                        String str3 = str2 == null ? "null" : str2;
                        int i3 = r04.A00;
                        if (str3.length() > i3) {
                            07E A07 = 07C.A07(0, i3);
                            str3 = str3.substring(((07F) A07).A00, ((07F) A07).A01 + 1);
                            11T.A0A(str3);
                            if (c15h != null) {
                                02R r05 = (02R) c15h.get();
                                if (r05 != null) {
                                    r05.Cg9(r02.A01, ((15W) r04).A03, str2);
                                }
                            }
                        }
                        int length = str3.length();
                        if (i3 <= length) {
                            A0l = str3.subSequence(0, length);
                        } else {
                            A0l = AnonymousClass001.A0l(i3);
                            A0l.append(str3);
                            int i4 = i3 - length;
                            int i5 = 1;
                            if (1 <= i4) {
                                while (true) {
                                    A0l.append(' ');
                                    if (i5 == i4) {
                                        break;
                                    } else {
                                        i5++;
                                    }
                                }
                            }
                        }
                        byte[] bytes = A0l.toString().getBytes(C03r.A05);
                        11T.A0A(bytes);
                        15T.A00(r0, r03, bytes, i2);
                    }
                }
            }
        }
    }

    @Override // X.C04H
    public void Cd2(int i, int i2) {
        synchronized (this) {
            Cd3(i, i2);
        }
    }

    @Override // X.C04H
    public void Cd3(int i, int i2) {
        synchronized (this) {
            this.A03.A01(i2);
            SparseArray sparseArray = this.A00;
            boolean A1T = AnonymousClass001.A1T(sparseArray.get(i2));
            sparseArray.remove(i2);
            if (A1T) {
                IntBuffer intBuffer = this.A02;
                intBuffer.put(0, intBuffer.get(0) - 1);
            }
        }
    }

    @Override // X.C04H
    public void Cd4(int i, int i2, String str) {
    }

    @Override // X.C04H
    public void Cd5(int i, int i2, boolean z) {
        synchronized (this) {
            SparseArray sparseArray = this.A00;
            if (sparseArray.get(i2) == null) {
                15T r0 = this.A03;
                int i3 = r0.A01;
                while (true) {
                    ByteBuffer byteBuffer = r0.A04;
                    if (byteBuffer.limit() <= i3) {
                        int limit = byteBuffer.limit();
                        r0.A01 = limit;
                        byteBuffer.position(limit);
                        C15h c15h = this.A04;
                        if (c15h != null) {
                            02R r02 = (02R) c15h.get();
                            if (r02 != null) {
                                15X r03 = this.A01;
                                r02.Cg8(r03.A01, 1, r03.A03, r03.A02);
                            }
                        }
                    } else if (byteBuffer.get(i3) == 1) {
                        i3 += r0.A02;
                        byteBuffer.position(i3);
                    } else {
                        r0.A01 = i3;
                        byteBuffer.position(i3);
                        int position = byteBuffer.position();
                        byteBuffer.putInt(position + 1, i2);
                        byteBuffer.put(position, (byte) 1);
                        if (r0.A00 < position) {
                            r0.A00 = position;
                        }
                    }
                }
                sparseArray.put(i2, Boolean.valueOf(z));
                int size = sparseArray.size();
                IntBuffer intBuffer = this.A02;
                intBuffer.put(0, size);
                if (intBuffer.get(1) < size) {
                    intBuffer.put(1, size);
                }
            }
        }
    }

    @Override // X.C04H
    public void Cd6() {
        synchronized (this) {
            SparseArray sparseArray = new SparseArray();
            SparseArray sparseArray2 = this.A00;
            int size = sparseArray2.size();
            for (int i = 0; i < size; i++) {
                Object valueAt = sparseArray2.valueAt(i);
                11T.A0A(valueAt);
                if (AnonymousClass001.A1V(valueAt)) {
                    sparseArray.put(sparseArray2.keyAt(i), sparseArray2.valueAt(i));
                }
            }
            int size2 = sparseArray.size();
            if (size2 == this.A01.A02) {
                15T r0 = this.A03;
                r0.A04.clear();
                r0.A00 = -1;
                r0.A01 = 0;
                sparseArray2.clear();
            } else {
                int size3 = sparseArray.size();
                for (int i2 = 0; i2 < size3; i2++) {
                    int keyAt = sparseArray.keyAt(i2);
                    this.A03.A01(keyAt);
                    sparseArray2.remove(keyAt);
                }
            }
            IntBuffer intBuffer = this.A02;
            intBuffer.put(0, intBuffer.get(0) - size2);
        }
    }

    @Override // X.C04H
    public void Cd7(int i, int i2, boolean z) {
        synchronized (this) {
            SparseArray sparseArray = this.A00;
            if (sparseArray.get(i2) != null) {
                sparseArray.put(i2, Boolean.valueOf(z));
            }
        }
    }

    @Override // X.C04H
    public void Ctc(QuickPerformanceLogger quickPerformanceLogger) {
    }
}
