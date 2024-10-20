package X;

import com.facebook.messaging.magicwords.model.MagicWord;
import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.3O7, reason: invalid class name */
/* loaded from: 3O7.class */
public final class C3O7 {
    public final 1Br A00;
    public final ImmutableMap A01;
    public final ImmutableMap A02;
    public final ImmutableMap A03;

    public C3O7() {
        1Br A00 = 1Bq.A00(66467);
        this.A00 = A00;
        07E r0 = new 07E(1, 2yD.A00(C5yc.A00((C5yc) 1Br.A0B(A00)), 36597175812296186L));
        ArrayList A0z = 1BL.A0z(r0);
        07I it = r0.iterator();
        while (it.hasNext()) {
            int A002 = it.A00();
            String A0T = 0Pz.A0T("magic_word_", A002);
            String A0T2 = 0Pz.A0T("magic_word_", A002);
            C1pq.A08("keyword", A0T2);
            A0z.add(1BK.A1G(A0T, new MagicWord(-1, "", -1, A0T2)));
        }
        ImmutableMap copyOf = ImmutableMap.copyOf(04R.A0B(A0z));
        11T.A0A(copyOf);
        this.A01 = copyOf;
        ImmutableMap.Builder builder = new ImmutableMap.Builder(4);
        Iterator A0y = AnonymousClass001.A0y(3Hh.A00);
        while (A0y.hasNext()) {
            Map.Entry A0z2 = AnonymousClass001.A0z(A0y);
            Object key = A0z2.getKey();
            String A16 = 1BK.A16(A0z2);
            C1pq.A08("emojiString", A16);
            String A0j = AnonymousClass001.A0j(A0z2);
            C1pq.A08("keyword", A0j);
            builder.put(key, new MagicWord(1L, A16, -3, A0j));
        }
        ImmutableMap build = builder.build();
        11T.A0A(build);
        this.A02 = build;
        C5yc c5yc = (C5yc) 1Br.A0B(this.A00);
        11T.A0F(c5yc, 0);
        LinkedHashMap A1C = 1BK.A1C();
        A1C.putAll(3IQ.A00);
        if (C5yc.A00(c5yc).AZk(36315700837754206L)) {
            A1C.putAll(3IQ.A01);
        }
        if (C5yc.A00(c5yc).AZk(2342158710051054937L)) {
            A1C.putAll(3IQ.A05);
        }
        if (C5yc.A00(c5yc).AZk(2342158710051120474L)) {
            A1C.putAll(3IQ.A02);
        }
        if (C5yc.A00(c5yc).AZk(2342158710051186011L)) {
            A1C.putAll(3IQ.A04);
        }
        if (C5yc.A00(c5yc).AZk(2342158710051251548L)) {
            A1C.putAll(3IQ.A06);
        }
        if (C5yc.A00(c5yc).AZk(2342158710051317085L)) {
            A1C.putAll(3IQ.A03);
        }
        ImmutableMap copyOf2 = ImmutableMap.copyOf((java.util.Map) A1C);
        11T.A0A(copyOf2);
        this.A03 = copyOf2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        if (r303 == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final X.3Lh A00(com.facebook.messaging.model.threads.ThreadSummary r302) {
        /*
            r301 = this;
            r0 = r302
            if (r0 == 0) goto Ld
            r0 = r302
            com.google.common.collect.ImmutableMap r0 = r0.A1R
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L15
        Ld:
            com.google.common.collect.ImmutableMap r0 = com.google.common.collect.RegularImmutableMap.A03
            r303 = r0
            r0 = r303
            X.11T.A0A(r0)
        L15:
            r0 = r301
            com.google.common.collect.ImmutableMap r0 = r0.A01
            r304 = r0
            X.3Lh r0 = new X.3Lh
            r305 = r0
            r0 = r305
            r1 = r303
            r2 = r304
            r0.<init>(r1, r2)
            r0 = r305
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3O7.A00(com.facebook.messaging.model.threads.ThreadSummary):X.3Lh");
    }
}
