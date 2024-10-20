package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Future;
import kotlin.jvm.functions.Function1;

/* renamed from: X.833, reason: invalid class name */
/* loaded from: 833.class */
public final class AnonymousClass833 extends C00q implements Function1 {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass833(Object obj, int i) {
        super(1);
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000c. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v330, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v337, types: [X.70l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v77, types: [X.6zD, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v53, types: [X.6zD] */
    /* JADX WARN: Type inference failed for: r308v22, types: [X.70o] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass706 anonymousClass706;
        C6ze c6ze;
        List Agr;
        C6zb c6zb;
        C5fw c5fw;
        Object obj2;
        int i;
        AKL akn;
        Object[] objArr;
        C6zG BK9;
        List list;
        AnonymousClass706 anonymousClass7062;
        C6ze c6ze2;
        List A12;
        List AzG;
        C6zb c6zb2;
        C5fw c5fw2;
        C6ze c6ze3;
        Object obj3;
        Object obj4;
        int i2;
        C6qu c6qu;
        C6zG[] c6zGArr;
        C6zb c6zb3;
        C5fw c5fw3;
        7Mt r307;
        C6zb c6zb4;
        C5fw c5fw4;
        Object obj5;
        int i3;
        Object obj6;
        int i4;
        boolean z;
        C76p c76p;
        ViewGroup viewGroup;
        switch (this.A00) {
            case 0:
                anonymousClass706 = (AnonymousClass706) obj;
                11T.A0F(anonymousClass706, 0);
                c6ze = C6ze.A0A;
                Agr = ((6zQ) ((C6qt) this.A01).A02()).Agr();
                anonymousClass706.A01(c6ze, Agr);
                return 04S.A00;
            case 1:
                c6zb = (C6zb) obj;
                11T.A0F(c6zb, 0);
                c5fw = C5fw.A08;
                obj2 = this.A01;
                i = 28;
                akn = new AKN(obj2, i);
                c6zb.A04(c5fw, akn);
                return 04S.A00;
            case 2:
                c6zb = (C6zb) obj;
                11T.A0F(c6zb, 0);
                c5fw = C5fw.A0A;
                obj2 = this.A01;
                i = 30;
                akn = new AKN(obj2, i);
                c6zb.A04(c5fw, akn);
                return 04S.A00;
            case 3:
                anonymousClass706 = (AnonymousClass706) obj;
                11T.A0F(anonymousClass706, 0);
                c6ze = C6ze.A0E;
                objArr = new C6zG[2];
                C6qt c6qt = (C6qt) this.A01;
                objArr[0] = ((6zQ) c6qt.A02()).Awl();
                BK9 = ((6zQ) c6qt.A02()).BK9();
                z = true;
                objArr[z ? 1 : 0] = BK9;
                Agr = C0s8.A14(objArr);
                anonymousClass706.A01(c6ze, Agr);
                return 04S.A00;
            case 4:
                list = (List) obj;
                11T.A0F(list, 0);
                C6qu c6qu2 = (C6qu) this.A01;
                c76p = new C76p(c6qu2.AWp(), c6qu2.BJ2(), c6qu2.Ad4());
                list.add(c76p);
                return 04S.A00;
            case 5:
                anonymousClass7062 = (AnonymousClass706) obj;
                11T.A0F(anonymousClass7062, 0);
                c6ze2 = C6ze.A0G;
                C6z2 c6z2 = C6z2.A0B;
                ?? obj7 = new Object();
                C6qt c6qt2 = (C6qt) this.A01;
                A12 = C0s8.A12(C6qt.A00(c6z2, obj7, new AKL(c6qt2, 8)));
                AzG = ((6zQ) c6qt2.A02()).AzG();
                anonymousClass7062.A00(c6ze2, 0QD.A0O(AzG, A12));
                return 04S.A00;
            case 6:
                c6zb2 = (C6zb) obj;
                11T.A0F(c6zb2, 0);
                c5fw2 = C5fw.A0E;
                c6ze3 = C6ze.A0e;
                obj3 = new Object();
                obj4 = this.A01;
                i2 = 9;
                c6zb2.A01(c5fw2, 71C.A00(c6ze3, obj3, new AKL(obj4, i2)), new AnonymousClass703[0]);
                return 04S.A00;
            case 7:
                anonymousClass7062 = (AnonymousClass706) obj;
                11T.A0F(anonymousClass7062, 0);
                1Bn.A0A(67164);
                c6qu = (C6qu) this.A01;
                AQf aQf = new AQf(c6qu, new C78n(c6qu.AWp(), c6qu.Alj()), 27);
                c6ze2 = C6ze.A0e;
                74E r0 = (74E) aQf.invoke();
                6rM r02 = (6rM) c6qu.A06;
                c6zGArr = new C6zG[]{new 74F(r0, (C75c) r02.A0E.getValue(), false, false, false), new 78C(r02.Ao5(), c6qu.Ad4(), C6vQ.A01, 255)};
                11T.A0F(c6zGArr, 0);
                A12 = 02L.A08(c6zGArr);
                AzG = ((6zQ) c6qu.A02()).Agr();
                anonymousClass7062.A00(c6ze2, 0QD.A0O(AzG, A12));
                return 04S.A00;
            case 8:
                c6zb3 = (C6zb) obj;
                11T.A0F(c6zb3, 0);
                7ML r03 = (7ML) ((C6qt) this.A01).A06;
                if (r03.A08.A05(1BJ.A00(198))) {
                    c5fw3 = C5fw.A0E;
                    r307 = new 7Mt(r03.A06, (Integer) r03.A09.getValue());
                    c6zb3.A02(c5fw3, r307, new AnonymousClass703[0]);
                }
                return 04S.A00;
            case 9:
                c6zb4 = (C6zb) obj;
                11T.A0F(c6zb4, 0);
                c5fw4 = C5fw.A0G;
                obj5 = this.A01;
                i3 = 14;
                c6zb4.A03(c5fw4, new AKL(obj5, i3));
                return 04S.A00;
            case 10:
                c6zb4 = (C6zb) obj;
                11T.A0F(c6zb4, 0);
                c5fw4 = C5fw.A0S;
                obj5 = this.A01;
                i3 = 27;
                c6zb4.A03(c5fw4, new AKL(obj5, i3));
                return 04S.A00;
            case 11:
                c6zb = (C6zb) obj;
                11T.A0F(c6zb, 0);
                C5fw c5fw5 = C5fw.A0K;
                obj6 = this.A01;
                c6zb.A04(c5fw5, new AKL(obj6, 29));
                c5fw = C5fw.A0J;
                i4 = 31;
                akn = new AKL(obj6, i4);
                c6zb.A04(c5fw, akn);
                return 04S.A00;
            case 12:
                anonymousClass706 = (AnonymousClass706) obj;
                11T.A0F(anonymousClass706, 0);
                C6ze c6ze4 = C6ze.A0U;
                C6qt c6qt3 = (C6qt) this.A01;
                List singletonList = Collections.singletonList(((7Mh) c6qt3.A02()).A00.getValue());
                11T.A0A(singletonList);
                anonymousClass706.A01(c6ze4, singletonList);
                c6ze = C6ze.A0S;
                Agr = Collections.singletonList(((7Mh) c6qt3.A02()).A00.getValue());
                11T.A0A(Agr);
                anonymousClass706.A01(c6ze, Agr);
                return 04S.A00;
            case 13:
                c6zb3 = (C6zb) obj;
                11T.A0F(c6zb3, 0);
                c5fw3 = C5fw.A0N;
                Object obj8 = this.A01;
                C6ze c6ze5 = C6ze.A0X;
                AKL akl = new AKL(obj8, 34);
                6zM r04 = 6zM.A00;
                11T.A0F(r04, 1);
                r307 = 71C.A00(c6ze5, r04, akl);
                c6zb3.A02(c5fw3, r307, new AnonymousClass703[0]);
                return 04S.A00;
            case 14:
                c6zb = (C6zb) obj;
                11T.A0F(c6zb, 0);
                c5fw = C5fw.A0P;
                obj6 = this.A01;
                i4 = 36;
                akn = new AKL(obj6, i4);
                c6zb.A04(c5fw, akn);
                return 04S.A00;
            case 15:
                anonymousClass706 = (AnonymousClass706) obj;
                11T.A0F(anonymousClass706, 0);
                c6ze = C6ze.A0Z;
                objArr = new C6zG[6];
                C6qt c6qt4 = (C6qt) this.A01;
                objArr[0] = ((6zQ) c6qt4.A02()).Awr();
                objArr[1] = ((6zQ) c6qt4.A02()).Aa4();
                objArr[2] = ((6zQ) c6qt4.A02()).Aeh();
                objArr[3] = ((6zQ) c6qt4.A02()).Awl();
                objArr[4] = ((6zQ) c6qt4.A02()).BFv();
                BK9 = AnonymousClass707.A02;
                z = 5;
                objArr[z ? 1 : 0] = BK9;
                Agr = C0s8.A14(objArr);
                anonymousClass706.A01(c6ze, Agr);
                return 04S.A00;
            case 16:
                c6zb = (C6zb) obj;
                11T.A0F(c6zb, 0);
                c5fw = C5fw.A0P;
                obj6 = this.A01;
                i4 = 38;
                akn = new AKL(obj6, i4);
                c6zb.A04(c5fw, akn);
                return 04S.A00;
            case 17:
                anonymousClass706 = (AnonymousClass706) obj;
                11T.A0F(anonymousClass706, 0);
                c6ze = C6ze.A0a;
                objArr = new C6zG[2];
                C6qt c6qt5 = (C6qt) this.A01;
                objArr[0] = ((7Mh) c6qt5.A02()).A05.getValue();
                BK9 = ((7Mh) c6qt5.A02()).A01.getValue();
                z = true;
                objArr[z ? 1 : 0] = BK9;
                Agr = C0s8.A14(objArr);
                anonymousClass706.A01(c6ze, Agr);
                return 04S.A00;
            case 18:
                list = (List) obj;
                11T.A0F(list, 0);
                c76p = new C70o(new Object(), C01g.A01(new AKL(this.A01, 39)));
                list.add(c76p);
                return 04S.A00;
            case 19:
                c6zb2 = (C6zb) obj;
                11T.A0F(c6zb2, 0);
                c5fw2 = C5fw.A0R;
                c6ze3 = C6ze.A0f;
                obj3 = new Object();
                obj4 = this.A01;
                i2 = 42;
                c6zb2.A01(c5fw2, 71C.A00(c6ze3, obj3, new AKL(obj4, i2)), new AnonymousClass703[0]);
                return 04S.A00;
            case 20:
                anonymousClass7062 = (AnonymousClass706) obj;
                11T.A0F(anonymousClass7062, 0);
                1Bn.A0A(67164);
                c6qu = (C6qu) this.A01;
                Context AWp = c6qu.AWp();
                FbUserSession Alj = c6qu.Alj();
                C78n c78n = new C78n(AWp, Alj);
                6rM r05 = (6rM) c6qu.A06;
                A8D a8d = r05.Axw().AZr(1GD.A07, 36325252842672645L) ? (74E) r05.A0H.getValue() : new A8D(AWp, Alj, c6qu.BF7(), c6qu.BJ2(), c78n, c6qu.Aoc());
                c6ze2 = C6ze.A0f;
                c6zGArr = new C6zG[]{new 74F(a8d, (C75c) r05.A0E.getValue(), false, false, false), new 78C(r05.Ao5(), c6qu.Ad4(), C6vQ.A01, 255)};
                11T.A0F(c6zGArr, 0);
                A12 = 02L.A08(c6zGArr);
                AzG = ((6zQ) c6qu.A02()).Agr();
                anonymousClass7062.A00(c6ze2, 0QD.A0O(AzG, A12));
                return 04S.A00;
            case 21:
                String str = (String) obj;
                11T.A0F(str, 0);
                C6qu c6qu3 = (C6qu) this.A01;
                2Of AbO = c6qu3.AbO();
                if (AbO != null && ((6rM) c6qu3.A06).Axw().AZk(36318393785791042L)) {
                    7GN.A01(AbO, str, "video", (String) null, false);
                }
                return 04S.A00;
            case 22:
                c6zb4 = (C6zb) obj;
                11T.A0F(c6zb4, 0);
                c5fw4 = C5fw.A0R;
                obj5 = this.A01;
                i3 = 44;
                c6zb4.A03(c5fw4, new AKL(obj5, i3));
                return 04S.A00;
            case 23:
                View view = (View) obj;
                11T.A0F(view, 0);
                6NV r06 = (6NV) this.A01;
                if (r06.A00 == view) {
                    r06.A00 = null;
                }
                ViewParent parent = view.getParent();
                if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                    viewGroup.removeView(view);
                }
                return 04S.A00;
            case 24:
                7HH r07 = ((7Hf) this.A01).A01;
                if (r07 != null) {
                    r07.A01.BaS("quick_reaction_pill", "quick_reaction_pill_impression", null, null);
                }
                return 04S.A00;
            case 25:
                C5pu c5pu = (C5pu) obj;
                11T.A0F(c5pu, 0);
                return ((C5wP) this.A01).A00.AfE(c5pu, 0);
            case 26:
                C5pu c5pu2 = (C5pu) obj;
                11T.A0F(c5pu2, 0);
                return ((C5wP) this.A01).A00.AfG(c5pu2, 0);
            case 27:
                C5pu c5pu3 = (C5pu) obj;
                11T.A0F(c5pu3, 0);
                return ((C5wP) this.A01).A00.AfF(c5pu3, 0);
            case 28:
                C5pu c5pu4 = (C5pu) obj;
                11T.A0F(c5pu4, 0);
                return ((C5wP) this.A01).A00.AfM(c5pu4, 0);
            case 29:
                C5pu c5pu5 = (C5pu) obj;
                11T.A0F(c5pu5, 0);
                return ((C5wP) this.A01).A00.AfN(c5pu5, 0);
            case 30:
                1qX r08 = (C5pu) obj;
                11T.A0F(r08, 0);
                return r08.mResultSet.getNullableInteger(0, 62);
            case 31:
                C5pu c5pu6 = (C5pu) obj;
                11T.A0F(c5pu6, 0);
                return ((C5wP) this.A01).A00.AfJ(c5pu6, 0);
            case 32:
                C5pu c5pu7 = (C5pu) obj;
                11T.A0F(c5pu7, 0);
                return ((C5wP) this.A01).A00.AfL(c5pu7, 0);
            case 33:
                C5pu c5pu8 = (C5pu) obj;
                11T.A0F(c5pu8, 0);
                return ((C5wP) this.A01).A00.AfK(c5pu8, 0);
            case 34:
                C5pu c5pu9 = (C5pu) obj;
                11T.A0F(c5pu9, 0);
                return ((C5wP) this.A01).A00.AfC(c5pu9, 0);
            case 35:
                C5pu c5pu10 = (C5pu) obj;
                11T.A0F(c5pu10, 0);
                return ((C5wP) this.A01).A00.AfD(c5pu10, 0);
            case 36:
                1qX r09 = (C5pu) obj;
                11T.A0F(r09, 0);
                return r09.mResultSet.getNullableInteger(0, 42);
            case 37:
                C5pu c5pu11 = (C5pu) obj;
                11T.A0F(c5pu11, 0);
                return ((C5wP) this.A01).A00.Af9(c5pu11, 0);
            case 38:
                C5pu c5pu12 = (C5pu) obj;
                11T.A0F(c5pu12, 0);
                return ((C5wP) this.A01).A00.AfB(c5pu12, 0);
            case 39:
                C5pu c5pu13 = (C5pu) obj;
                11T.A0F(c5pu13, 0);
                return ((C5wP) this.A01).A00.AfA(c5pu13, 0);
            case 40:
                C5pu c5pu14 = (C5pu) obj;
                11T.A0F(c5pu14, 0);
                return ((C5wP) this.A01).A00.AfH(c5pu14, 0);
            case 41:
                C5pu c5pu15 = (C5pu) obj;
                11T.A0F(c5pu15, 0);
                return ((C5wP) this.A01).A00.AfI(c5pu15, 0);
            case 42:
                1qX r010 = (C5pu) obj;
                11T.A0F(r010, 0);
                return r010.mResultSet.getNullableInteger(0, 52);
            case 43:
                ((7MG) this.A01).A01.C6w();
                return 04S.A00;
            case ActionId.ON_FRAGMENT_CREATE_END /* 44 */:
                ((7MG) this.A01).A01.C6v();
                return 04S.A00;
            case ActionId.ON_CREATE_VIEW_END /* 45 */:
                ((Future) this.A01).cancel(false);
                return 04S.A00;
            default:
                ((4dC) this.A01).release();
                return 04S.A00;
        }
    }
}
