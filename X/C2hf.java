package X;

import java.util.BitSet;
import java.util.List;

/* renamed from: X.2hf, reason: invalid class name */
/* loaded from: 2hf.class */
public final class C2hf extends 2hQ {
    public C1qb A00;
    public C2he A01;
    public final BitSet A02;
    public final String[] A03;

    public C2hf(C1qb c1qb, C2he c2he) {
        super(c2he, c1qb);
        this.A03 = new String[]{"data"};
        BitSet bitSet = new BitSet(1);
        this.A02 = bitSet;
        this.A01 = c2he;
        this.A00 = c1qb;
        bitSet.clear();
    }

    /* renamed from: A02, reason: merged with bridge method [inline-methods] */
    public C2he A01() {
        2hQ.A00(this.A02, this.A03, 1);
        return this.A01;
    }

    public void A03(1Im r302) {
        this.A01.A00 = r302;
    }

    public void A04(1Im r302) {
        this.A01.A01 = r302;
    }

    public void A05(1Im r302) {
        this.A01.A02 = r302;
    }

    public void A06(List list) {
        this.A01.A05 = list;
        this.A02.set(0);
    }
}
