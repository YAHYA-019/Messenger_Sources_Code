package X;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.Jlq, reason: case insensitive filesystem */
/* loaded from: Jlq.class */
public final class C3185Jlq extends LTc implements MNn {
    public static final MNn A08 = LTZ.A00;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public MNn A04;
    public ByteBuffer A05;
    public ByteBuffer A06;
    public final L35 A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3185Jlq(L35 l35, String str) {
        super(str);
        MNn mNn = A08;
        this.A00 = 15880;
        ByteBuffer allocate = ByteBuffer.allocate(0);
        this.A05 = allocate;
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        allocate.order(byteOrder);
        this.A04 = mNn;
        this.A01 = 0;
        ByteBuffer allocate2 = ByteBuffer.allocate(0);
        this.A06 = allocate2;
        allocate2.order(byteOrder);
        this.A07 = l35;
        this.A03 = 497;
        this.A02 = 0;
    }

    private int A00() {
        return Math.min(Math.max(((int) ((this.A05.capacity() * 1.0d) / 4.0d)) - 1, 0), JR1.A0O(this.A06));
    }

    private void A01() {
        int capacity = this.A05.capacity();
        long j = this.A00;
        long j2 = capacity;
        if (j < j2) {
            j = j2;
        }
        long j3 = 2;
        int A00 = (int) KVc.A00(j * j3);
        ByteBuffer allocate = ByteBuffer.allocate(A00);
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        allocate.order(byteOrder);
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= capacity) {
                break;
            }
            allocate.put(i2, this.A05.get(i2));
            i = i2 + 1;
        }
        this.A05 = allocate;
        this.A00 = A00;
        int capacity2 = this.A06.capacity();
        long j4 = this.A03;
        long j5 = capacity2;
        if (j4 < j5) {
            j4 = j5;
        }
        long A002 = KVc.A00(j4 * j3);
        if (A002 < 1 || A002 > LTc.A01) {
            throw new Exception("Realloc failed!");
        }
        int i3 = (int) A002;
        ByteBuffer allocate2 = ByteBuffer.allocate(i3);
        allocate2.order(byteOrder);
        int i4 = 0;
        while (true) {
            int i5 = i4;
            if (i5 >= capacity2) {
                this.A06 = allocate2;
                this.A03 = i3;
                return;
            } else {
                allocate2.put(i5, this.A06.get(i5));
                i4 = i5 + 1;
            }
        }
    }

    public int A02(int i) {
        while (i >= A00()) {
            A01();
        }
        int i2 = this.A02;
        while (i2 <= i) {
            int i3 = this.A05.getInt(i2 * 4);
            i2++;
            this.A05.putInt(i2 * 4, i3);
        }
        L5w.A02(i, this.A06);
        int i4 = i + 1;
        this.A02 = i4;
        return this.A05.getInt(i4 * 4);
    }

    @Override // X.MQx
    public boolean A7z() {
        try {
            clear();
            ByteBuffer allocate = ByteBuffer.allocate(r0);
            this.A06 = allocate;
            ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
            allocate.order(byteOrder);
            this.A03 = r0;
            ByteBuffer allocate2 = ByteBuffer.allocate(r0);
            this.A05 = allocate2;
            allocate2.order(byteOrder);
            this.A00 = r0;
            boolean A7z = this.A04.A7z();
            if (!A7z) {
                clear();
            }
            return A7z;
        } finally {
            clear();
        }
    }

    @Override // X.MNn
    public List AcX() {
        ArrayList A0s = AnonymousClass001.A0s();
        A0s.add(this.A04);
        return A0s;
    }

    @Override // X.MQx
    public Ku1 AmJ() {
        return new Ku1(this.A07, ((LTc) this).A00, Collections.singletonList(this.A04.AmJ()));
    }

    @Override // X.MNn
    public List AmK() {
        ByteBuffer byteBuffer;
        ArrayList A0t = AnonymousClass001.A0t(2);
        int i = 0;
        this.A06.position(0);
        this.A05.position(0);
        int i2 = this.A01;
        ByteBuffer byteBuffer2 = this.A06;
        if (i2 == 0) {
            byteBuffer2.position(0);
            byteBuffer = this.A05;
        } else {
            byteBuffer2.position((i2 + 7) >> 3);
            byteBuffer = this.A05;
            i = (this.A01 + 1) * 4;
        }
        byteBuffer.position(i);
        A0t.add(this.A06);
        A0t.add(this.A05);
        return A0t;
    }

    @Override // X.MQx
    public int Azc() {
        return L5w.A00(this.A06, this.A01);
    }

    @Override // X.MQx
    public int BIp() {
        return this.A01;
    }

    @Override // X.MNn
    public void BPM(List list) {
        if (list.size() != 1) {
            throw AnonymousClass002.A0C(list, "Lists have only one child. Found: ", AnonymousClass001.A0k());
        }
        Ku1 ku1 = (Ku1) 1BK.A0r(list);
        L35 l35 = ku1.A00;
        KT1 kt1 = l35.A00;
        new KVb();
        MNn A00 = kt1.A00().A00(l35, "$data$");
        this.A04 = A00;
        A00.BPM(ku1.A02);
    }

    @Override // X.MQx
    public void Cph(int i) {
        this.A03 = (i + 7) >> 3;
        this.A00 = (i + 1) * 4;
        MNn mNn = this.A04;
        if ((mNn instanceof LTa) || (mNn instanceof LTb)) {
            i *= 5;
        }
        mNn.Cph(i);
    }

    @Override // X.MQx
    public void Cw1(int i) {
        int i2;
        this.A01 = i;
        if (i > 0) {
            while (i > A00()) {
                A01();
            }
            int i3 = this.A02;
            while (i3 < i) {
                int i4 = this.A05.getInt(i3 * 4);
                i3++;
                this.A05.putInt(i3 * 4, i4);
            }
        } else if (i == 0) {
            i2 = 0;
            this.A04.Cw1(i2);
        }
        i2 = this.A05.getInt(this.A02 * 4);
        this.A04.Cw1(i2);
    }
}
