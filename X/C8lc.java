package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import com.facebook.inject.FbInjector;
import com.facebook.stickers.model.Sticker;
import com.google.common.collect.ImmutableList;
import java.util.BitSet;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.8lc, reason: invalid class name */
/* loaded from: 8lc.class */
public final class C8lc extends C1rj {
    public int A00;
    public ColorStateList A01;
    public ColorStateList A02;
    public Drawable A03;
    public 1LI A04;
    public 1Im A05;
    public 7NL A06;
    public String A07;
    public String A08;

    public C8lc() {
        super("StickersContentSearchComponent");
        this.A08 = "AGE_APPROPRIATE";
    }

    public final Object[] A0k() {
        return new Object[]{this.A06, Integer.valueOf(this.A00), this.A01, this.A07, this.A08, this.A03, 8, this.A04, null, this.A02};
    }

    public /* bridge */ /* synthetic */ 1LI A0l() {
        C8lc c8lc = (C8lc) super.A0l();
        c8lc.A04 = 4YV.A0J(c8lc.A04);
        return c8lc;
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        7NL r0 = this.A06;
        String str = this.A07;
        int i = this.A00;
        8Be r307 = this.A03;
        1LI r308 = this.A04;
        String str2 = this.A08;
        ColorStateList colorStateList = this.A02;
        ColorStateList colorStateList2 = this.A01;
        String A0C = r302.A0C();
        RSM rsm = new RSM(A0C);
        8Be A0E = 7zL.A0E(r302, rsm, A0C, 0);
        if (A0E == null) {
            Context A0A = 7zL.A0A(r302);
            A0E = new 8Be(A0A, 8.0f, 7zM.A02(A0A, 2MR.A0V), 0, 1);
            r302.A0I(rsm, A0E, A0C, 0);
        }
        11T.A0F(str2, 7);
        Context context = r302.A0D;
        C1F6 c1f6 = (C1F6) 7zN.A0k(context, 84755);
        QEq qEq = new QEq(r302, new QKr());
        1LI r02 = qEq.A01;
        ((QKr) r02).A01 = 2131968247;
        BitSet bitSet = qEq.A02;
        bitSet.set(0);
        ((QKr) r02).A0G = str;
        int A01 = 7zR.A01(context);
        Context A00 = 1Bf.A00(c1f6);
        try {
            Ily ily = new Ily(c1f6, r0, str2, A01);
            1Bn.A0K();
            FbInjector.A04(A00);
            ((QKr) r02).A0F = ily;
            bitSet.set(1);
            ((QKr) r02).A0B = 1LI.A09(r302, C8lc.class, "StickersContentSearchComponent", 475144985);
            bitSet.set(2);
            ((QKr) r02).A0C = 1LI.A09(r302, C8lc.class, "StickersContentSearchComponent", 1980750267);
            ((QKr) r02).A0D = 1LI.A09(r302, C8lc.class, "StickersContentSearchComponent", -1274238432);
            ((QKr) r02).A0E = 1LI.A04(r302, C8lc.class, "StickersContentSearchComponent");
            if (r307 == null) {
                r307 = A0E;
            }
            ((QKr) r02).A07 = r307;
            qEq.A0e();
            ((QKr) r02).A02 = 7zL.A05(qEq, 2132279327);
            C2cm A002 = C2cl.A00(r302);
            1LI r316 = null;
            7zN.A1D(A002, r302, C8lc.class, "StickersContentSearchComponent", -1341831205);
            A002.A2X(i);
            A002.A1J(2131968246);
            A002.A1X(2132279305);
            A002.A2b(context.getDrawable(2132345298));
            C2cl A0J = 7zL.A0J(A002);
            if (A0J != null) {
                r316 = A0J.A0l();
            }
            ((QKr) r02).A09 = r316;
            if (r308 == null) {
                C2cm A003 = C2cl.A00(r302);
                A003.A2X(-7829368);
                A003.A2a(2132345367);
                A003.A1X(2132279379);
                r308 = 7zN.A09(A003);
            }
            ((QKr) r02).A08 = r308.A0l();
            ((QKr) r02).A06 = colorStateList;
            ((QKr) r02).A05 = colorStateList2;
            ((QKr) r02).A03 = 2131968248;
            bitSet.set(3);
            C1rs.A02(bitSet, qEq.A03);
            qEq.A0J();
            return r02;
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A00);
            throw th;
        }
    }

    @Override // X.C1rj
    public /* bridge */ /* synthetic */ 2Yv A12() {
        return (2Yv) new Object();
    }

    @Override // X.C1rj
    public C1qp A14(1Iw r302, C1qp c1qp) {
        return 4YV.A0M(c1qp);
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        1Im r305;
        7BA r315;
        switch (r302.A01) {
            case -1341831205:
                1LI A0I = 7zU.A0I(r302);
                if (A0I == null) {
                    return null;
                }
                r305 = ((C8lc) A0I).A05;
                if (r305 == null) {
                    return null;
                }
                r315 = 7Ax.A02;
                break;
            case -1274238432:
                1Iw r0 = r302.A00.A00;
                11T.A0H(r0, ((9Pu) obj).A00);
                1LI r02 = r0.A02;
                if (r02 == null) {
                    return null;
                }
                r305 = ((C8lc) r02).A05;
                if (r305 == null) {
                    return null;
                }
                final Integer num = 0S2.A00;
                r315 = new 6Sh(num) { // from class: X.7B3
                    public final Integer A00;

                    {
                        this.A00 = num;
                    }

                    public /* synthetic */ boolean B6s() {
                        return false;
                    }

                    public /* synthetic */ boolean B7e() {
                        return false;
                    }

                    public String BGe() {
                        return "ContentSearchOnRanQueryEvent";
                    }
                };
                break;
            case -1048037474:
                1LI.A0J(r302, obj);
                return null;
            case 378110312:
                1Iw r03 = r302.A00.A00;
                String str = ((C9Mz) obj).A01;
                AtomicBoolean atomicBoolean = 4YU.A0P(r03).A00;
                11T.A0G(str, 1, atomicBoolean);
                if (!atomicBoolean.get() || str.length() <= 0) {
                    if (atomicBoolean.get() || str.length() != 0) {
                        return null;
                    }
                    atomicBoolean.set(true);
                    return null;
                }
                atomicBoolean.set(false);
                1LI r04 = r03.A02;
                if (r04 == null) {
                    return null;
                }
                r305 = ((C8lc) r04).A05;
                if (r305 == null) {
                    return null;
                }
                r315 = new 7B6(0S2.A00);
                break;
                break;
            case 475144985:
                1Iw r05 = r302.A00.A00;
                AXE axe = ((RKL) obj).A01;
                11T.A0H(r05, axe);
                if (!(axe instanceof A6v)) {
                    0fH.A0o("StickersContentSearchComponent", "Stickers content search expected a MessengerExternalMediaSticker but got a different MessengerExternalMedia.");
                }
                Sticker sticker = ((A6v) axe).A00;
                1LI r06 = r05.A02;
                if (r06 == null) {
                    return null;
                }
                r305 = ((C8lc) r06).A05;
                if (r305 == null) {
                    return null;
                }
                r315 = new 7Bc(sticker);
                break;
            case 1980750267:
                9UA r07 = (9UA) obj;
                1Iw r08 = r302.A00.A00;
                boolean z = r07.A04;
                String str2 = (String) r07.A01;
                Throwable th = r07.A03;
                ImmutableList immutableList = r07.A00;
                String str3 = r07.A02;
                4YV.A1N(r08, str2);
                1LI r09 = r08.A02;
                if (r09 == null) {
                    return null;
                }
                r305 = ((C8lc) r09).A05;
                if (r305 == null) {
                    return null;
                }
                int A08 = 7zR.A08(immutableList);
                Integer num2 = 0S2.A00;
                if (str3 == null) {
                    str3 = "";
                }
                r315 = new 7BA(immutableList, num2, str2, str3, th, A08, z);
                break;
            default:
                return null;
        }
        7zR.A1E(r305, r315);
        return null;
    }

    @Override // X.C1rj
    public void A1N(1Iw r302, 2Yv r303) {
        ((QNa) r303).A00 = new AtomicBoolean(true);
    }

    @Override // X.C1rj
    public boolean A1U() {
        return true;
    }
}
