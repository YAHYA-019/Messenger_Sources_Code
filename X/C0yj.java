package X;

import java.lang.reflect.Array;

/* renamed from: X.0yj, reason: invalid class name */
/* loaded from: 0yj.class */
public abstract class C0yj {
    public final int A00;
    public final short[] A03;
    public final short[][] A08;
    public final short[][] A09;
    public final short[][] A0B;
    public final int[] A02 = new int[4];
    public final C0ye A01 = new Object();
    public final short[][] A0A = (short[][]) Array.newInstance((Class<?>) Short.TYPE, 12, 16);
    public final short[] A04 = new short[12];
    public final short[] A05 = new short[12];
    public final short[] A06 = new short[12];
    public final short[] A07 = new short[12];

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, X.0ye] */
    /* JADX WARN: Type inference failed for: r0v69, types: [short[], short[][]] */
    public C0yj(int i) {
        Class cls = Short.TYPE;
        this.A0B = (short[][]) Array.newInstance((Class<?>) cls, 12, 16);
        this.A08 = (short[][]) Array.newInstance((Class<?>) cls, 4, 64);
        this.A09 = new short[]{new short[2], new short[2], new short[4], new short[4], new short[8], new short[8], new short[16], new short[16], new short[32], new short[32]};
        this.A03 = new short[16];
        this.A00 = (1 << i) - 1;
    }
}
