package X;

import com.google.android.exoplayer2.Timeline;
import com.google.common.base.Preconditions;
import com.google.common.collect.CompactHashMap;
import com.google.common.collect.MultimapBuilder$ArrayListSupplier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* loaded from: K0y.class */
public final class K0y extends JTS {
    public static final 6Xx A09;
    public int A00;
    public KLp A01;
    public long[][] A02;
    public final MCl A03;
    public final 1Mu A04;
    public final ArrayList A05;
    public final java.util.Map A06;
    public final Timeline[] A07;
    public final 6ZJ[] A08;

    static {
        6Xq r0 = new 6Xq();
        r0.A07 = "MergingMediaSource";
        A09 = r0.A00();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.MCl] */
    /* JADX WARN: Type inference failed for: r0v14, types: [long[], long[][]] */
    /* JADX WARN: Type inference failed for: r0v22, types: [com.google.common.collect.AbstractMapBasedMultimap, java.lang.Object, com.google.common.collect.Multimaps$CustomListMultimap, X.1Mu] */
    public K0y(6ZJ... r302) {
        ?? obj = new Object();
        this.A08 = r302;
        this.A03 = obj;
        this.A05 = 1BK.A17(Arrays.asList(r302));
        this.A00 = -1;
        this.A07 = new Timeline[2];
        this.A02 = new long[0];
        this.A06 = AnonymousClass001.A0u();
        CompactHashMap compactHashMap = new CompactHashMap(8);
        MultimapBuilder$ArrayListSupplier multimapBuilder$ArrayListSupplier = new MultimapBuilder$ArrayListSupplier();
        ?? obj2 = new Object();
        Preconditions.checkArgument(compactHashMap.isEmpty());
        obj2.A01 = compactHashMap;
        obj2.A00 = multimapBuilder$ArrayListSupplier;
        this.A04 = obj2;
    }

    public void A0E() {
        super.A0E();
        Arrays.fill(this.A07, (Object) null);
        this.A00 = -1;
        this.A01 = null;
        ArrayList arrayList = this.A05;
        arrayList.clear();
        Collections.addAll(arrayList, this.A08);
    }

    public void A0F(5M9 r302) {
        super.A0F(r302);
        int i = 0;
        while (true) {
            int i2 = i;
            6ZJ[] r0 = this.A08;
            if (i2 >= 2) {
                return;
            }
            A0G(r0[i2], Integer.valueOf(i2));
            i = i2 + 1;
        }
    }

    public 6Zm AKZ(6YR r302, 6XD r303, long j) {
        6ZJ[] r0 = this.A08;
        6Zm[] r02 = new 6Zm[2];
        Timeline[] timelineArr = this.A07;
        int i = 0;
        int A06 = timelineArr[0].A06(((6YS) r302).A04);
        do {
            r02[i] = r0[i].AKZ(r302.A00(timelineArr[i].A0C(A06)), r303, j - this.A02[A06][i]);
            i++;
        } while (i < 2);
        return new Lb4(this.A03, this.A02[A06], r02);
    }

    public 6Xx AwB() {
        return this.A08[0].AwB();
    }

    public void Bdm() {
        KLp kLp = this.A01;
        if (kLp != null) {
            throw kLp;
        }
        super.Bdm();
    }

    public void Ccv(6Zm r302) {
        Lb4 lb4 = (Lb4) r302;
        int i = 0;
        while (true) {
            int i2 = i;
            6ZJ[] r0 = this.A08;
            if (i2 >= 2) {
                return;
            }
            6ZJ r02 = r0[i2];
            6Zm r304 = lb4.A04[i2];
            if (r304 instanceof Lb3) {
                r304 = ((Lb3) r304).A01;
            }
            r02.Ccv(r304);
            i = i2 + 1;
        }
    }
}
