package X;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.14f, reason: invalid class name */
/* loaded from: 14f.class */
public final class C14f extends 0Wp {
    public static C14f A0F;
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public long A04;
    public long A05;
    public Integer A06;
    public Integer A07;
    public Integer A08;
    public Thread A09;
    public List A0A;
    public boolean A0B;
    public boolean A0C;
    public final 0X0 A0D;
    public final short[] A0E;

    public C14f() {
        this(0);
        this.A0C = false;
        this.A0B = false;
        Integer num = 0S2.A00;
        this.A06 = num;
        this.A07 = num;
        this.A01 = 0;
        this.A0E = new short[3];
        this.A08 = num;
        this.A0D = null;
    }

    public C14f(int i) {
        this.A02 = 0;
        this.A00 = 0;
        long j = -1;
        this.A04 = j;
        this.A03 = j;
    }

    public C14f(0X0 r302) {
        this(0);
        this.A0C = false;
        this.A0B = false;
        Integer num = 0S2.A00;
        this.A06 = num;
        this.A07 = num;
        this.A01 = 0;
        this.A0E = new short[3];
        this.A08 = num;
        this.A0D = r302;
    }

    public String A06() {
        String A0e;
        if (((0Wp) this).A0A) {
            A0e = "nativePollOnce";
        } else {
            Class cls = ((0Wp) this).A07;
            if (cls != null) {
                return cls.getName();
            }
            Class cls2 = ((0Wp) this).A09;
            if (cls2 == null) {
                return "unknown";
            }
            String name = cls2.getName();
            A0e = AnonymousClass001.A0e("/", AnonymousClass001.A0n(name), ((0Wp) this).A00);
            Class cls3 = ((0Wp) this).A08;
            if (cls3 != null) {
                return 0Pz.A0j(A0e, "/", cls3.getName());
            }
        }
        return A0e;
    }

    public void A07() {
        int i = this.A01 - 1;
        this.A01 = i;
        if (i <= 0) {
            A03();
            long j = -1;
            this.A04 = j;
            this.A03 = j;
            this.A00 = 0;
            this.A02 = 0;
            this.A01 = 0;
            this.A05 = j;
            this.A09 = null;
            this.A0B = false;
            this.A0C = false;
            Integer num = 0S2.A00;
            this.A06 = num;
            this.A07 = num;
            List list = this.A0A;
            if (list != null) {
                list.clear();
            }
            this.A08 = num;
            0X0 r0 = this.A0D;
            if (r0 != null) {
                AtomicInteger atomicInteger = r0.A02;
                if (atomicInteger.get() < 0X0.A03) {
                    LinkedList linkedList = r0.A01;
                    synchronized (linkedList) {
                        linkedList.addLast(this);
                        atomicInteger.set(linkedList.size());
                    }
                }
            }
        }
    }

    public void A08(Integer num) {
        Integer num2;
        Integer num3;
        Integer num4 = 0S2.A0N;
        if (num != num4 && num != (num2 = 0S2.A0C) && num != (num3 = 0S2.A0Y)) {
            Integer num5 = this.A08;
            if (num5 == num4 || num5 == num2 || num5 == num3) {
                A07();
            }
        } else if (this.A08 == 0S2.A00) {
            this.A01++;
        }
        this.A08 = num;
    }
}
