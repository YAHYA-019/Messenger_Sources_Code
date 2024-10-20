package X;

import android.content.Context;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

/* renamed from: X.2n0, reason: invalid class name */
/* loaded from: 2n0.class */
public final class C2n0 {
    public Set A00;
    public final int A01;
    public final Context A02;
    public final C2630Gjf A03;
    public final C2n3 A04;
    public final C2n3 A05;
    public final C2n3 A06;
    public final C2n3 A07;
    public final C2n3 A08;
    public final C2n3 A09;
    public final C2n3 A0A;
    public final C2n3 A0B;
    public final Jsr A0C;
    public final C01i A0D;
    public final C01i A0E;
    public final C01i A0F;
    public final C01i A0G;
    public final C2n3 A0H;
    public final 2nE A0I;
    public final List A0J;
    public final List A0K;

    public C2n0(Context context, C2630Gjf c2630Gjf, Jsr jsr, int i, int i2, final int i3, int i4, int i5, int i6, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        C2n3 c2n3;
        C2n3 c2n32;
        11T.A0F(context, 1);
        this.A02 = context;
        this.A01 = i;
        this.A03 = c2630Gjf;
        this.A0C = jsr;
        Integer num = 0S2.A00;
        Pattern compile = Pattern.compile(z6 ? "(?<=[\\s_~'\"(]|^)(\\*\\*)(\\S(?:.*?\\S)??)(\\*\\*)(?=[\\s_~,.;:!?'\")]|$)" : "(?<=[\\s_~'\"(]|^)(\\*)(\\S(?:.*?\\S)??)(\\*)(?=[\\s_~,.;:!?'\")]|$)");
        11T.A0A(compile);
        C2n1 c2n1 = new C2n2() { // from class: X.2n1
            @Override // X.C2n2
            public final List AL0(Kl6 kl6) {
                List singletonList = Collections.singletonList(new StyleSpan(1));
                11T.A0A(singletonList);
                return singletonList;
            }
        };
        C2n4 c2n4 = C2n3.A06;
        this.A04 = new C2n3(c2n4, c2n1, num, compile, true, true);
        Integer num2 = 0S2.A01;
        Pattern compile2 = Pattern.compile("(^ *[*-]\\s.*$)", 8);
        11T.A0A(compile2);
        this.A05 = new C2n3(new C2z1(1), new JR7(this, 0), num2, compile2, true, false);
        Integer num3 = 0S2.A0C;
        Pattern compile3 = Pattern.compile("(^([1-9][0-9]?)\\.\\s.*$)", 8);
        11T.A0A(compile3);
        this.A0A = new C2n3(new C2z1(5), new JR7(this, 2), num3, compile3, true, false);
        if (jsr != null) {
            Integer num4 = 0S2.A0N;
            Pattern compile4 = Pattern.compile("(^ *([1-9][0-9]?)\\.\\s.*$)", 8);
            11T.A0A(compile4);
            c2n3 = new C2n3(new C2z1(4), new JR7(this, 1), num4, compile4, true, false);
        } else {
            c2n3 = null;
        }
        this.A09 = c2n3;
        Integer num5 = 0S2.A0Y;
        Pattern compile5 = Pattern.compile(z6 ? "(?<=[\\s*~'\"(]|^)(\\*)(\\S(?:.*?\\S)??)(\\*)(?=[\\s*~,.;:!?'\")]|$)" : "(?<=[\\s*~'\"(]|^)(_)(\\S(?:.*?\\S)??)(_)(?=[\\s*~,.;:!?'\")]|$)");
        11T.A0A(compile5);
        this.A06 = new C2n3(c2n4, new C2n2() { // from class: X.2n5
            @Override // X.C2n2
            public final List AL0(Kl6 kl6) {
                List singletonList = Collections.singletonList(new StyleSpan(2));
                11T.A0A(singletonList);
                return singletonList;
            }
        }, num5, compile5, true, true);
        Integer num6 = 0S2.A0j;
        Pattern compile6 = Pattern.compile(z6 ? "(?<=[\\s*_'\"(]|^)(~~)(\\S(?:.*?\\S)??)(~~)(?=[\\s*_,.;:!?'\")]|$)" : "(?<=[\\s*_'\"(]|^)(~)(\\S(?:.*?\\S)??)(~)(?=[\\s*_,.;:!?'\")]|$)");
        11T.A0A(compile6);
        this.A0B = new C2n3(c2n4, new C2n2() { // from class: X.2n6
            @Override // X.C2n2
            public final List AL0(Kl6 kl6) {
                List singletonList = Collections.singletonList(new StrikethroughSpan());
                11T.A0A(singletonList);
                return singletonList;
            }
        }, num6, compile6, true, true);
        Integer num7 = 0S2.A0u;
        Pattern compile7 = Pattern.compile("(?<=[\\s*_'\"(]|^)(```)(\\S(?:.*?\\S)??)(```)(?=[\\s*_,.;:!?'\")]|$)");
        11T.A0A(compile7);
        this.A08 = new C2n3(c2n4, new C2n2() { // from class: X.2n7
            @Override // X.C2n2
            public final List AL0(Kl6 kl6) {
                return 11T.A03(new TypefaceSpan() { // from class: X.331
                });
            }
        }, num7, compile7, true, true);
        Integer num8 = 0S2.A15;
        Pattern compile8 = Pattern.compile("");
        11T.A0A(compile8);
        this.A0H = new C2n3(c2n4, new C2n2() { // from class: X.2n8
            @Override // X.C2n2
            public final List AL0(Kl6 kl6) {
                return 11T.A03(new ForegroundColorSpan(i3));
            }
        }, num8, compile8, true, true);
        C03i c03i = C03i.A02;
        this.A0D = C01g.A00(c03i, new C2n9(i4));
        this.A0G = C01g.A00(c03i, 2nA.A00);
        this.A0E = C01g.A00(c03i, new C2xr(this, i2, i5, i6, 0));
        this.A0F = C01g.A00(c03i, new C2xr(this, i2, i5, i6, 1));
        Integer num9 = 0S2.A04;
        Pattern compile9 = Pattern.compile("\\[([^]]+?)]\\(([^)]+)\\)");
        C2n2 c2n2 = new C2n2() { // from class: X.2nB
            @Override // X.C2n2
            public final List AL0(Kl6 kl6) {
                11T.A0F(kl6, 0);
                C2n0 c2n0 = C2n0.this;
                return 0AI.A03(0AI.A08(new AV0(c2n0, 43), new C04t("\\((.*?)\\)").A04(kl6.A02.toString(), 0)));
            }
        };
        C2z1 c2z1 = new C2z1(3);
        11T.A0D(compile9);
        this.A07 = new C2n3(c2z1, c2n2, num9, compile9, true, false);
        this.A0J = C0s8.A15(this.A04, this.A06, this.A0B, z4 ? this.A08 : null, (C2n3) (z ? this.A0G.getValue() : null), (C2n3) (z ? this.A0D.getValue() : null), (C2n3) (z2 ? this.A0F.getValue() : null), (C2n3) (z2 ? this.A0E.getValue() : null), z5 ? this.A07 : null);
        C2n3 c2n33 = null;
        C2n3 c2n34 = z3 ? this.A05 : null;
        if (z3) {
            Jsr jsr2 = this.A0C;
            c2n32 = (jsr2 == null || !jsr2.A01) ? this.A0A : this.A09;
        } else {
            c2n32 = null;
        }
        C2630Gjf c2630Gjf2 = this.A03;
        if (c2630Gjf2 != null) {
            int i7 = c2630Gjf2.A01;
            int i8 = c2630Gjf2.A00;
            Integer num10 = 0S2.A05;
            Pattern compile10 = Pattern.compile("(^#\\s\\S.*$)", 8);
            11T.A0A(compile10);
            c2n33 = new C2n3(new C2z1(2), new LZ9(i7, i8), num10, compile10, false, false);
        }
        this.A0K = C0s8.A15(c2n34, c2n32, c2n33);
        this.A0I = new 2nE();
    }

    public final Editable A00(CharSequence charSequence) {
        int i;
        11T.A0F(charSequence, 0);
        Editable newEditable = Editable.Factory.getInstance().newEditable(charSequence);
        2nE r0 = this.A0I;
        11T.A0D(newEditable);
        ArrayList A01 = r0.A01(newEditable, this.A0J);
        ArrayList arrayList = new ArrayList();
        Iterator it = A01.iterator();
        while (it.hasNext()) {
            Iterator it2 = ((31Q) it.next()).A03.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next());
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            Object next = it3.next();
            if (hashSet.add(Integer.valueOf(((31R) next).A01))) {
                arrayList2.add(next);
            }
        }
        ArrayList arrayList3 = new ArrayList(arrayList2);
        HashSet hashSet2 = new HashSet();
        ArrayList arrayList4 = new ArrayList();
        Iterator it4 = arrayList3.iterator();
        while (it4.hasNext()) {
            Object next2 = it4.next();
            if (hashSet2.add(Integer.valueOf(((31R) next2).A00))) {
                arrayList4.add(next2);
            }
        }
        ArrayList arrayList5 = new ArrayList(arrayList4);
        0Db r02 = 0Db.A00;
        11T.A0I(r02, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reverseOrder>{ kotlin.TypeAliasesKt.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reverseOrder> }");
        0RC.A0y(arrayList5, r02);
        Iterator it5 = arrayList5.iterator();
        while (it5.hasNext()) {
            31R r03 = (31R) it5.next();
            int i2 = r03.A01;
            if (i2 >= 0 && i2 < (i = r03.A00) && i <= newEditable.length()) {
                newEditable.delete(i2, i);
            }
        }
        return newEditable;
    }

    public final void A01(Editable editable) {
        ArrayList A00 = this.A0I.A00(editable, (Integer) null, this.A0J, true);
        Iterator it = A00.iterator();
        while (it.hasNext()) {
            31R r0 = (31R) it.next();
            C2n3 c2n3 = this.A0H;
            int i = r0.A01;
            int i2 = r0.A00;
            editable.setSpan(c2n3.AL0(new Kl6(editable, null, i, i2, true)).get(0), i, i2, 33);
        }
        A00.isEmpty();
    }

    public final void A02(Editable editable) {
        if (this.A00 == null && editable.length() > 0) {
            List list = this.A0J;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("2. List Item");
            0Ju r0 = new 0Ju();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Iterator it2 = ((C2n3) it.next()).AL0(new Kl6(spannableStringBuilder, null, 0, 11, true)).iterator();
                while (it2.hasNext()) {
                    r0.add(it2.next().getClass());
                }
            }
            this.A00 = AnonymousClass041.A05(C32x.class, 02I.A03(r0));
        }
        Set set = this.A00;
        if (set != null) {
            Iterator it3 = set.iterator();
            while (it3.hasNext()) {
                Object[] spans = editable.getSpans(0, editable.length(), (Class) it3.next());
                if (spans != null) {
                    for (Object obj : spans) {
                        editable.removeSpan(obj);
                    }
                }
            }
        }
    }

    public final void A03(Editable editable, Integer num, boolean z) {
        int i;
        ArrayList A00 = this.A0I.A00(editable, num, 0QD.A0O(this.A0K, this.A0J), z);
        Comparator reverseOrder = Collections.reverseOrder();
        11T.A0A(reverseOrder);
        for (31R r0 : 0QD.A0b(A00, reverseOrder)) {
            int i2 = r0.A00;
            if (i2 <= editable.length()) {
                editable.delete(r0.A01, i2);
            }
        }
        int length = editable.length();
        int i3 = 0;
        while (i3 < length && Character.isWhitespace(editable.charAt(i3))) {
            i3++;
        }
        int i4 = length;
        while (true) {
            i = i4;
            if (i <= i3 || !Character.isWhitespace(editable.charAt(i - 1))) {
                break;
            } else {
                i4 = i - 1;
            }
        }
        if (i < length) {
            editable.delete(i, length);
        }
        if (i3 > 0) {
            editable.delete(0, i3);
        }
    }
}
