package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;

/* renamed from: X.Axl, reason: case insensitive filesystem */
/* loaded from: Axl.class */
public final class C1956Axl extends 1LH {
    public final 1Br A00;
    public final C5ww A01;
    public final ImmutableList A02;
    public final Integer A03;
    public final Function1 A04;
    public final boolean A05;
    public final boolean A06;
    public final MigColorScheme A07;

    public C1956Axl(C5ww c5ww, MigColorScheme migColorScheme, ImmutableList immutableList, Integer num, Function1 function1, boolean z, boolean z2) {
        7zT.A1U(immutableList, function1, c5ww);
        this.A07 = migColorScheme;
        this.A02 = immutableList;
        this.A04 = function1;
        this.A01 = c5ww;
        this.A05 = z;
        this.A06 = z2;
        this.A03 = num;
        this.A00 = 1Bu.A00(83250);
    }

    /* JADX WARN: Type inference failed for: r0v93, types: [X.BRP, java.lang.Object] */
    public 1LI A0s(C2k5 c2k5) {
        11T.A0F(c2k5, 0);
        1BV A0R = 7zL.A0R(3vP.A00(c2k5), 116339);
        CQY A00 = ((C1i) 1Br.A0B(this.A00)).A00(c2k5.A05, this.A07);
        boolean z = this.A06;
        if (z && this.A03 != null) {
            A0R.get();
            String A09 = 3yH.A09(c2k5, 0);
            A0R.get();
            A00.A0I(Cvj.A00, A09, "");
        }
        11T.A0D(A00);
        A0R.get();
        String A092 = 3yH.A09(c2k5, 2131959948);
        C5ww c5ww = this.A01;
        c5ww.getClass();
        boolean z2 = this.A05;
        CQY.A02(A00, c5ww, (55E) null, "", A092, 0L, !z, z2);
        A00.A0N(AbK.A13(7zL.A09(), AbK.A12(7zL.A09()), 2131959939));
        if (z2 && !z) {
            A0R.get();
            A00.A0C(2131959944);
            ArrayList A0s = AnonymousClass001.A0s();
            CsN csN = new CsN(this, 2);
            Integer num = this.A03;
            Iterator it = this.A02.iterator();
            while (it.hasNext()) {
                03Y r0 = (03Y) it.next();
                String str = (String) r0.first;
                Integer valueOf = Integer.valueOf(AnonymousClass001.A03(r0.second));
                ?? obj = new Object();
                ((BRP) obj).A04 = true;
                ((BRP) obj).A01 = str;
                ((BRP) obj).A00 = "";
                ((BRP) obj).A03 = false;
                ((BRP) obj).A02 = valueOf;
                Preconditions.checkNotNull(valueOf, "Tag for radio button group option cannot be null");
                A0s.add(obj);
            }
            Iterator it2 = A0s.iterator();
            while (it2.hasNext()) {
                BRP brp = (BRP) it2.next();
                brp.A03 = Objects.equal(num, brp.A02);
            }
            CQY.A01(csN, A00, ImmutableList.copyOf((Collection) A0s));
        }
        return CQY.A00(A00);
    }
}
