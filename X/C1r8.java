package X;

import android.icu.text.AlphabeticIndex;
import com.google.common.collect.ImmutableList;
import java.util.Locale;

/* renamed from: X.1r8, reason: invalid class name */
/* loaded from: 1r8.class */
public final class C1r8 {
    public static ImmutableList A02;
    public C1u1 A00;
    public final C00i A01 = new 1BQ(16504);

    /* JADX WARN: Type inference failed for: r303v2, types: [X.1u1] */
    public String A00(String str) {
        C1u1 c1u1 = this.A00;
        C1u1 c1u12 = c1u1;
        if (c1u1 == null) {
            final Locale A05 = ((1GS) this.A01.get()).A05();
            ?? r303 = new Object(A05) { // from class: X.1u1
                public AlphabeticIndex.ImmutableIndex A00;

                {
                    this.A00 = new AlphabeticIndex(A05).addLabels(Locale.ENGLISH).buildImmutableIndex();
                }

                /* JADX WARN: Code restructure failed: missing block: B:6:0x002b, code lost:
                
                    if (r301.equals(android.icu.text.AlphabeticIndex.Bucket.LabelType.OVERFLOW) != false) goto L8;
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public static boolean A00(android.icu.text.AlphabeticIndex.Bucket.LabelType r301) {
                    /*
                        android.icu.text.AlphabeticIndex$Bucket$LabelType r0 = android.icu.text.AlphabeticIndex.Bucket.LabelType.INFLOW
                        r302 = r0
                        r0 = r301
                        r1 = r302
                        boolean r0 = r0.equals(r1)
                        r303 = r0
                        r0 = r303
                        if (r0 != 0) goto L2e
                        android.icu.text.AlphabeticIndex$Bucket$LabelType r0 = android.icu.text.AlphabeticIndex.Bucket.LabelType.UNDERFLOW
                        r302 = r0
                        r0 = r301
                        r1 = r302
                        boolean r0 = r0.equals(r1)
                        r303 = r0
                        r0 = r303
                        if (r0 != 0) goto L2e
                        android.icu.text.AlphabeticIndex$Bucket$LabelType r0 = android.icu.text.AlphabeticIndex.Bucket.LabelType.OVERFLOW
                        r302 = r0
                        r0 = r301
                        r1 = r302
                        boolean r0 = r0.equals(r1)
                        r304 = r0
                        r0 = 0
                        r303 = r0
                        r0 = 0
                        r302 = r0
                        r0 = r304
                        if (r0 == 0) goto L30
                    L2e:
                        r0 = 1
                        r303 = r0
                    L30:
                        r0 = r303
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1u1.A00(android.icu.text.AlphabeticIndex$Bucket$LabelType):boolean");
                }

                public String A01(String str2) {
                    AlphabeticIndex.ImmutableIndex immutableIndex = this.A00;
                    AlphabeticIndex.Bucket bucket = immutableIndex.getBucket(immutableIndex.getBucketIndex(str2));
                    if (A00(bucket.getLabelType())) {
                        return null;
                    }
                    return bucket.getLabel();
                }
            };
            this.A00 = r303;
            c1u12 = r303;
        }
        return c1u12.A01(str);
    }
}
