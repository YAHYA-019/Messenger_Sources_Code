package X;

import android.view.KeyEvent;
import android.view.MotionEvent;
import com.facebook.ui.emoji.model.EmojiSet;
import com.google.common.collect.ImmutableList;
import java.util.BitSet;
import java.util.EnumSet;
import java.util.Iterator;

/* renamed from: X.8l5, reason: invalid class name */
/* loaded from: 8l5.class */
public final class C8l5 extends C1rj {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public 1Im A04;
    public 1Im A05;
    public ImmutableList A06;
    public Integer A07;
    public String A08;
    public EnumSet A09;
    public boolean A0A;

    public C8l5() {
        super("EmojiToolbarComponent");
        this.A00 = -3355444;
        this.A01 = 0;
        this.A02 = -16776961;
    }

    public final Object[] A0k() {
        return new Object[]{this.A08, Integer.valueOf(this.A00), this.A06, this.A09, this.A07, Integer.valueOf(this.A01), Integer.valueOf(this.A02), Integer.valueOf(this.A03), Boolean.valueOf(this.A0A)};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        boolean z = this.A0A;
        EnumSet enumSet = this.A09;
        int i = this.A03;
        ImmutableList immutableList = this.A06;
        int i2 = this.A02;
        int i3 = this.A01;
        int i4 = this.A00;
        String str = this.A08;
        Integer num = this.A07;
        int A05 = 7zP.A05(r302, enumSet, 0);
        11T.A0F(immutableList, 4);
        int i5 = 0;
        C1rq A0m = 7zM.A0m(r302);
        C1ro c1ro = C1ro.CENTER;
        A0m.A2h(c1ro);
        C1rp c1rp = C1rp.CENTER;
        A0m.A2i(c1rp);
        A0m.A1M(2132279328);
        A0m.A0e();
        Iterator it = immutableList.iterator();
        while (true) {
            boolean z2 = true;
            if (!it.hasNext()) {
                8RW r0 = new 8RW(r302, new C8kj());
                7zN.A1D(r0, r302, C8l5.class, "EmojiToolbarComponent", 1278281154);
                if (str == null) {
                    str = r302.A0D(2131953179);
                }
                C8kj c8kj = r0.A01;
                c8kj.A04 = str;
                BitSet bitSet = r0.A02;
                bitSet.set(0);
                c8kj.A00 = 2132345196;
                bitSet.set(1);
                c8kj.A01 = i3;
                bitSet.set(A05);
                c8kj.A05 = false;
                bitSet.set(3);
                r0.A2J("backspace");
                c8kj.A02 = i2;
                bitSet.set(4);
                c8kj.A03 = num;
                c8kj.A06 = true;
                bitSet.set(5);
                c8kj.A07 = z;
                bitSet.set(6);
                r0.A1s(1LI.A09(r302, C8l5.class, "EmojiToolbarComponent", 1719579098));
                7zP.A16(r0, bitSet, r0.A03);
                C1rh A0d = 7zL.A0d(c8kj, A0m);
                2cM A01 = 2cK.A01(r302, (String) null, 0);
                A01.A2g(c1ro);
                A01.A2h(c1rp);
                C83f A00 = C2hd.A00(r302);
                A00.A2Z(0);
                A00.A2Y(i4);
                A00.A2X(2.0f);
                A00.A0e();
                A00.A2E(z ? C26z.TOP : C26z.BOTTOM, 0);
                A00.A0c();
                A01.A2e(A00.A2V());
                return 7zL.A0V(A01, A0d);
            }
            Object next = it.next();
            int i6 = i5 + 1;
            if (i5 < 0) {
                C0s8.A18();
                throw 0Q8.createAndThrow();
            }
            EmojiSet emojiSet = (EmojiSet) next;
            if (i5 != i) {
                z2 = false;
            }
            8RW r02 = new 8RW(r302, new C8kj());
            r02.A2T(!z2 ? 1LI.A0C(r302, C8l5.class, "EmojiToolbarComponent", AnonymousClass001.A1a(i5), -1447315088) : null);
            String A0D = r302.A0D(emojiSet.A00);
            C8kj c8kj2 = r02.A01;
            c8kj2.A04 = A0D;
            BitSet bitSet2 = r02.A02;
            bitSet2.set(0);
            c8kj2.A00 = emojiSet.A01;
            bitSet2.set(1);
            c8kj2.A01 = i3;
            bitSet2.set(A05);
            c8kj2.A05 = z2;
            bitSet2.set(3);
            r02.A2J(emojiSet.toString());
            c8kj2.A02 = i2;
            bitSet2.set(4);
            c8kj2.A03 = num;
            c8kj2.A06 = enumSet.contains(emojiSet.A03.A00);
            bitSet2.set(5);
            c8kj2.A07 = z;
            bitSet2.set(6);
            7zP.A16(r02, bitSet2, r02.A03);
            A0m.A2f(c8kj2);
            i5 = i6;
        }
    }

    @Override // X.C1rj
    public C1qp A14(1Iw r302, C1qp c1qp) {
        return 4YV.A0M(c1qp);
    }

    /* JADX WARN: Type inference failed for: r307v11, types: [X.7GA, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r307v5, types: [X.9MV, java.lang.Object] */
    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        7BQ r305;
        1Im r0;
        1Im r308;
        Object obj2;
        1LI r02;
        switch (r302.A01) {
            case -1447315088:
                1Iw r03 = r302.A00.A00;
                int A08 = 7zO.A08(r302.A03, 0);
                11T.A0F(r03, 0);
                1LI r04 = r03.A02;
                if (r04 == null) {
                    return null;
                }
                r308 = ((C8l5) r04).A05;
                if (r308 == null) {
                    return null;
                }
                ?? obj3 = new Object();
                ((9MV) obj3).A00 = A08;
                obj2 = obj3;
                break;
            case -1048037474:
                1LI.A0J(r302, obj);
                return null;
            case 1278281154:
                1Iw r05 = r302.A00.A00;
                11T.A0F(r05, 0);
                if (!AnonymousClass524.A00(r05.A0D) || (r02 = r05.A02) == null) {
                    return null;
                }
                r308 = ((C8l5) r02).A04;
                if (r308 == null) {
                    return null;
                }
                7Aj r06 = new 7Aj(new KeyEvent(0, 67));
                ?? obj4 = new Object();
                ((7GA) obj4).A00 = r06;
                obj2 = obj4;
                break;
                break;
            case 1719579098:
                1Iw r07 = r302.A00.A00;
                MotionEvent motionEvent = ((3xE) obj).A00;
                boolean A1X = 1BL.A1X(r07, motionEvent);
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked != 0) {
                    if (actionMasked == A1X || actionMasked == 3) {
                        r305 = 7BQ.A02;
                    }
                    return false;
                }
                r305 = 7BR.A02;
                1LI r08 = r07.A02;
                if (r08 != null && (r0 = ((C8l5) r08).A04) != null) {
                    7zR.A1E(r0, r305);
                }
                return false;
            default:
                return null;
        }
        r308.A00(obj2);
        return null;
    }
}
