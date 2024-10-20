package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: HkX.class */
public final class HkX {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public final Hd4 A04;
    public final JPu A05;
    public final Ida A06;
    public final IcA A07;
    public final JPz A08;
    public final IO3 A09;
    public final IOV A0A;
    public final JQ1 A0B;
    public final JLq A0C;
    public final Id3 A0D;
    public final String A0E;
    public final ViewGroup A0F;
    public final JPy A0G;
    public final Hpz A0H;
    public final Hn8 A0I;
    public final Ij0 A0J;
    public final JQ3 A0K;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v127, types: [X.JQC, X.Ic7, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v354, types: [java.lang.Object, X.JG5, X.IdA] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, X.Hd4] */
    public HkX(java.util.Map map) {
        GuJ guJ;
        GuJ guJ2;
        GuJ guJ3;
        GuJ guJ4;
        GuJ A00;
        GuJ guJ5;
        IcA icA;
        ?? obj = new Object();
        obj.A02 = false;
        obj.A01 = false;
        obj.A00 = false;
        this.A04 = obj;
        Hn8 hn8 = new Hn8();
        this.A0I = hn8;
        HGf hGf = HOR.A08;
        11T.A0F(hGf, 0);
        String A1C = AbH.A1C(hGf, map);
        this.A0E = A1C;
        HGf hGf2 = HOR.A03;
        11T.A0F(hGf2, 0);
        Hpz hpz = (Hpz) map.get(hGf2);
        this.A0H = hpz;
        HGf hGf3 = HOR.A09;
        11T.A0F(hGf3, 0);
        Ij0 ij0 = (Ij0) map.get(hGf3);
        this.A0J = ij0;
        HGf hGf4 = HOR.A0B;
        11T.A0F(hGf4, 0);
        if (map.containsKey(hGf4)) {
            this.A0F = (ViewGroup) map.get(hGf4);
        } else {
            this.A0F = null;
        }
        HGf hGf5 = HOR.A00;
        11T.A0F(hGf5, 0);
        if (map.containsKey(hGf5)) {
            this.A00 = AnonymousClass001.A03(map.get(hGf5));
        }
        HGf hGf6 = HOR.A0A;
        11T.A0F(hGf6, 0);
        if (map.containsKey(hGf6)) {
            this.A01 = AnonymousClass001.A03(map.get(hGf6));
        }
        HGf hGf7 = JNt.A01;
        11T.A0F(hGf7, 0);
        if (map.containsKey(hGf7)) {
            ION ion = (JNt) map.get(hGf7);
            HGf hGf8 = HOR.A02;
            11T.A0F(hGf8, 0);
            Context context = (Context) map.get(hGf8);
            ION ion2 = ion;
            11T.A0F(context, 0);
            11T.A0F(A1C, 1);
            HashMap A18 = GOq.A18(A1C);
            List list = ion2.A03;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                it.next();
            }
            IcA icA2 = new IcA(context, new Hxy(A18));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                icA2.A02((JG5) ((JE8) it2.next()).AIm(icA2));
            }
            icA2.A02(new GuB(icA2));
            icA2.A01(new C2420Gch(icA2), JQ2.A00);
            guJ = JQ3.A00;
            icA2.A01(new Gtr(icA2), guJ);
            guJ2 = JQ1.A00;
            icA2.A01(new C2428Gcp(icA2, false), guJ2);
            guJ3 = JPz.A01;
            icA2.A01(new C2419Gcg(icA2), guJ3);
            QQT qqt = new QQT(icA2);
            qqt.CvB(30);
            guJ4 = JPw.A00;
            icA2.A01(qqt, guJ4);
            icA2.A01(new Gtj(icA2), JPg.A00);
            A00 = Gtm.A00(icA2, new Gtr(icA2), guJ);
            guJ5 = JPu.A01;
            icA2.A01(new C2414Gcb(icA2), guJ5);
            icA2.A01(new C2430Gcr(icA2), JPf.A00);
            ij0 = ion2.A02;
            JJb jJb = ion2.A00;
            Hpz hpz2 = ion2.A01;
            Hn8 hn82 = new Hn8();
            1BK.A1J(ij0, 1, hpz2);
            QQS qqs = new QQS(jJb, hpz2, hn82, icA2);
            icA2.A01(new QQQ(icA2, ij0), JPp.A00);
            icA2.A01(qqs, JPv.A00);
            icA2.A01(new C2418Gcf(icA2), JQ0.A04);
            ?? obj2 = new Object();
            ((IdA) obj2).A00 = icA2;
            icA2.A02(obj2);
            icA = icA2;
        } else {
            HGf hGf9 = HOR.A02;
            11T.A0F(hGf9, 0);
            Context context2 = (Context) map.get(hGf9);
            HGf hGf10 = HOR.A05;
            11T.A0F(hGf10, 0);
            JJb jJb2 = (JJb) map.get(hGf10);
            HGf hGf11 = HOR.A01;
            11T.A0F(hGf11, 0);
            List list2 = (List) map.get(hGf11);
            11T.A0F(context2, 0);
            11T.A0F(A1C, 1);
            7zT.A1U(ij0, jJb2, hpz);
            11T.A0F(list2, 6);
            HashMap A182 = GOq.A18(A1C);
            Iterator it3 = list2.iterator();
            while (it3.hasNext()) {
                it3.next();
            }
            IcA A002 = GuB.A00(context2, A182);
            Iterator it4 = list2.iterator();
            while (it4.hasNext()) {
                A002.A02((JG5) ((JE8) it4.next()).AIm(A002));
            }
            A002.A01(new C2420Gch(A002), JQ2.A00);
            A002.A01(new Gtj(A002), JPg.A00);
            guJ = JQ3.A00;
            A002.A01(new Gtr(A002), guJ);
            guJ2 = JQ1.A00;
            A002.A01(new C2428Gcp(A002, false), guJ2);
            guJ3 = JPz.A01;
            A002.A01(new C2419Gcg(A002), guJ3);
            QQT qqt2 = new QQT(A002);
            qqt2.CvB(30);
            guJ4 = JPw.A00;
            A00 = Gtm.A00(A002, qqt2, guJ4);
            A002.A01(new C2423Gck(A002), JPq.A00);
            A002.A01(new C2427Gco(A002), JPt.A00);
            A002.A01(new Gti(A002), JPs.A00);
            GuJ guJ6 = JPr.A00;
            ?? obj3 = new Object();
            obj3.A00 = A002;
            A002.A01(obj3, guJ6);
            guJ5 = JPu.A01;
            A002.A01(new C2414Gcb(A002), guJ5);
            QQS qqs2 = new QQS(jJb2, hpz, hn8, A002);
            A002.A01(new QQQ(A002, ij0), JPp.A00);
            A002.A01(qqs2, JPv.A00);
            A002.A01(new C2418Gcf(A002), JQ0.A04);
            icA = A002;
        }
        I4u i4u = ((C2415Gcc) ((JPy) icA.AdC(A00))).A03;
        ArrayList A0t = AnonymousClass001.A0t(1);
        A0t.add(ij0);
        i4u.A02(A0t);
        this.A07 = icA;
        Ida ida = new Ida(icA);
        this.A06 = ida;
        this.A0K = (JQ3) this.A07.AdC(guJ);
        this.A0B = (JQ1) this.A07.AdC(guJ2);
        this.A08 = (JPz) this.A07.AdC(guJ3);
        this.A05 = (JPu) this.A07.AdC(guJ5);
        this.A0G = (JPy) this.A07.AdC(A00);
        JLq B6v = ((JPw) this.A07.AdC(guJ4)).B6v();
        11T.A0A(B6v);
        this.A0C = B6v;
        HGf hGf12 = HOR.A06;
        11T.A0F(hGf12, 0);
        if (map.containsKey(hGf12)) {
            obj.A01 = AnonymousClass001.A1V(map.get(hGf12));
        }
        HGf hGf13 = HOR.A04;
        11T.A0F(hGf13, 0);
        if (map.containsKey(hGf13)) {
            obj.A00 = AnonymousClass001.A1V(map.get(hGf13));
        }
        ViewGroup viewGroup = this.A0F;
        if (viewGroup != null) {
            View B4V = this.A0B.B4V();
            11T.A0A(B4V);
            viewGroup.addView(B4V);
        } else {
            HGf hGf14 = HOR.A07;
            11T.A0F(hGf14, 0);
            if (map.containsKey(hGf14)) {
                map.get(hGf14);
                throw AnonymousClass001.A0Q("getWidth");
            }
        }
        ida.A03(this.A00);
        if (this.A01 == 0) {
            Ida.A00(ida).enable(false);
        }
        this.A0D = new Id3(this, 5);
        this.A09 = new IO3(this);
        this.A0A = new IOV(this);
    }
}
