package X;

import java.util.Arrays;
import java.util.Iterator;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: M9i.class */
public abstract class M9i extends 5cK {
    public final SerialDescriptor A00;

    public M9i(5Yu r302) {
        super(r302);
        this.A00 = new M9m(r302.getDescriptor());
    }

    public static int A00(int i) {
        int i2 = i * 2;
        if (10 < i2) {
            return i2;
        }
        return 10;
    }

    public /* bridge */ /* synthetic */ int A04(Object obj) {
        KT6 kt6 = (KT6) obj;
        11T.A0F(kt6, 0);
        return kt6.A00();
    }

    public /* bridge */ /* synthetic */ Object A05() {
        return ((5ZT) this).A02(this instanceof MAF ? new C0rn(new short[0]) : this instanceof MAE ? new C0rl(new long[0]) : this instanceof MAD ? new C0ri(new int[0]) : this instanceof MAC ? new C0rg(new byte[0]) : this instanceof MAB ? new short[0] : this instanceof MAA ? new long[0] : this instanceof MA9 ? new int[0] : this instanceof MA8 ? new float[0] : this instanceof MA7 ? new double[0] : this instanceof MA6 ? new char[0] : this instanceof MA5 ? new byte[0] : new boolean[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v102, types: [short[]] */
    /* JADX WARN: Type inference failed for: r0v52, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r0v60, types: [char[]] */
    /* JADX WARN: Type inference failed for: r0v68, types: [double[]] */
    /* JADX WARN: Type inference failed for: r0v76, types: [float[]] */
    /* JADX WARN: Type inference failed for: r0v92, types: [long[]] */
    public /* bridge */ /* synthetic */ Object A06(Object obj) {
        boolean[] copyOf;
        KT6 kt6 = (KT6) obj;
        11T.A0F(kt6, 0);
        if (kt6 instanceof MA3) {
            MA3 ma3 = (MA3) kt6;
            short[] copyOf2 = Arrays.copyOf(ma3.A01, ma3.A00);
            11T.A0A(copyOf2);
            return new C0rn(copyOf2);
        }
        if (kt6 instanceof MA2) {
            MA2 ma2 = (MA2) kt6;
            long[] copyOf3 = Arrays.copyOf(ma2.A01, ma2.A00);
            11T.A0A(copyOf3);
            return new C0rl(copyOf3);
        }
        if (kt6 instanceof MA1) {
            MA1 ma1 = (MA1) kt6;
            return new C0ri(JQz.A1a(ma1.A01, ma1.A00));
        }
        if (kt6 instanceof MA0) {
            MA0 ma0 = (MA0) kt6;
            byte[] copyOf4 = Arrays.copyOf(ma0.A01, ma0.A00);
            11T.A0A(copyOf4);
            return new C0rg(copyOf4);
        }
        if (kt6 instanceof M9z) {
            M9z m9z = (M9z) kt6;
            copyOf = Arrays.copyOf(m9z.A01, m9z.A00);
        } else if (kt6 instanceof M9y) {
            M9y m9y = (M9y) kt6;
            copyOf = Arrays.copyOf(m9y.A01, m9y.A00);
        } else {
            if (kt6 instanceof M9x) {
                M9x m9x = (M9x) kt6;
                return JQz.A1a(m9x.A01, m9x.A00);
            }
            if (kt6 instanceof M9w) {
                M9w m9w = (M9w) kt6;
                copyOf = Arrays.copyOf(m9w.A01, m9w.A00);
            } else if (kt6 instanceof M9v) {
                M9v m9v = (M9v) kt6;
                copyOf = Arrays.copyOf(m9v.A01, m9v.A00);
            } else if (kt6 instanceof M9u) {
                M9u m9u = (M9u) kt6;
                copyOf = Arrays.copyOf(m9u.A01, m9u.A00);
            } else if (kt6 instanceof M9t) {
                M9t m9t = (M9t) kt6;
                copyOf = Arrays.copyOf(m9t.A01, m9t.A00);
            } else {
                M9s m9s = (M9s) kt6;
                copyOf = Arrays.copyOf(m9s.A01, m9s.A00);
            }
        }
        11T.A0A(copyOf);
        return copyOf;
    }

    public final Iterator A07(Object obj) {
        throw AnonymousClass001.A0N("This method lead to boxing and must not be used, use writeContents instead");
    }

    public /* bridge */ /* synthetic */ void A08(Object obj, int i, Object obj2) {
        throw AnonymousClass001.A0N("This method lead to boxing and must not be used, use Builder.append instead");
    }

    public final SerialDescriptor getDescriptor() {
        return this.A00;
    }

    public final void serialize(Encoder encoder, Object obj) {
        11T.A0F(encoder, 0);
        int A01 = A01(obj);
        SerialDescriptor serialDescriptor = this.A00;
        11T.A0F(serialDescriptor, 1);
        5Ze ABo = encoder.ABo(serialDescriptor);
        if (this instanceof MAF) {
            short[] sArr = ((C0rn) obj).A00;
            for (int i = 0; i < A01; i++) {
                ABo.APp(serialDescriptor, i).APy(sArr[i]);
            }
        } else if (this instanceof MAE) {
            long[] jArr = ((C0rl) obj).A00;
            for (int i2 = 0; i2 < A01; i2++) {
                ABo.APp(serialDescriptor, i2).APs(jArr[i2]);
            }
        } else if (this instanceof MAD) {
            int[] iArr = ((C0ri) obj).A00;
            for (int i3 = 0; i3 < A01; i3++) {
                ABo.APp(serialDescriptor, i3).APq(iArr[i3]);
            }
        } else if (this instanceof MAC) {
            byte[] bArr = ((C0rg) obj).A00;
            for (int i4 = 0; i4 < A01; i4++) {
                ABo.APp(serialDescriptor, i4).APh(bArr[i4]);
            }
        } else if (this instanceof MAB) {
            short[] sArr2 = (short[]) obj;
            11T.A0H(ABo, sArr2);
            for (int i5 = 0; i5 < A01; i5++) {
                short s = sArr2[i5];
                5Ze r0 = ABo;
                r0.A01(serialDescriptor, i5);
                r0.APy(s);
            }
        } else if (this instanceof MAA) {
            long[] jArr2 = (long[]) obj;
            11T.A0H(ABo, jArr2);
            for (int i6 = 0; i6 < A01; i6++) {
                ABo.APt(serialDescriptor, i6, jArr2[i6]);
            }
        } else if (this instanceof MA9) {
            int[] iArr2 = (int[]) obj;
            11T.A0H(ABo, iArr2);
            for (int i7 = 0; i7 < A01; i7++) {
                ABo.APr(serialDescriptor, i7, iArr2[i7]);
            }
        } else if (this instanceof MA8) {
            float[] fArr = (float[]) obj;
            11T.A0H(ABo, fArr);
            for (int i8 = 0; i8 < A01; i8++) {
                ABo.APn(serialDescriptor, fArr[i8], i8);
            }
        } else if (this instanceof MA7) {
            double[] dArr = (double[]) obj;
            11T.A0H(ABo, dArr);
            for (int i9 = 0; i9 < A01; i9++) {
                ABo.APk(serialDescriptor, dArr[i9], i9);
            }
        } else if (this instanceof MA6) {
            char[] cArr = (char[]) obj;
            11T.A0H(ABo, cArr);
            for (int i10 = 0; i10 < A01; i10++) {
                char c = cArr[i10];
                5Ze r02 = ABo;
                r02.A01(serialDescriptor, i10);
                r02.APi(c);
            }
        } else if (this instanceof MA5) {
            byte[] bArr2 = (byte[]) obj;
            11T.A0H(ABo, bArr2);
            for (int i11 = 0; i11 < A01; i11++) {
                byte b = bArr2[i11];
                5Ze r03 = ABo;
                r03.A01(serialDescriptor, i11);
                r03.APh(b);
            }
        } else {
            boolean[] zArr = (boolean[]) obj;
            11T.A0H(ABo, zArr);
            for (int i12 = 0; i12 < A01; i12++) {
                ABo.APg(serialDescriptor, i12, zArr[i12]);
            }
        }
        ABo.AQH(serialDescriptor);
    }
}
