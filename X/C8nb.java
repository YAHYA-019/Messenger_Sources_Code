package X;

import android.text.InputFilter;
import android.view.inputmethod.InputConnection;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.8nb, reason: invalid class name */
/* loaded from: 8nb.class */
public final class C8nb extends C1rj {
    public static final List A0B = C0s8.A10(new Object(), new InputFilter.AllCaps());
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public C2ko A04;
    public C2ko A05;
    public MigColorScheme A06;
    public String A07;
    public String A08;
    public List A09;
    public boolean A0A;

    public C8nb() {
        super("EbSetupRecoveryCodeTextInputComponent");
        this.A0A = true;
        this.A09 = A0B;
        this.A00 = 4097;
        this.A01 = 5;
        this.A02 = 4;
        this.A03 = 2;
    }

    public final Object[] A0k() {
        return new Object[]{this.A06, Boolean.valueOf(this.A0A), 4YU.A0k(), this.A07, this.A09, Integer.valueOf(this.A00), Integer.valueOf(this.A01), Integer.valueOf(this.A02), Integer.valueOf(this.A03), this.A08};
    }

    public /* bridge */ /* synthetic */ 1LI A0l() {
        return super.A0l();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x01ad, code lost:
    
        if (r332 != (r0 - 1)) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x01fa, code lost:
    
        if (r335 != (r0 - 1)) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v50, types: [X.9ae] */
    @Override // X.C1rj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.1LI A0y(final X.1Iw r302) {
        /*
            Method dump skipped, instructions count: 1140
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8nb.A0y(X.1Iw):X.1LI");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2Yv, java.lang.Object] */
    @Override // X.C1rj
    public /* bridge */ /* synthetic */ 2Yv A12() {
        return new Object();
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        int i;
        boolean z;
        CharSequence A00;
        int i2 = r302.A01;
        if (i2 != -1755229903) {
            if (i2 == -1048037474) {
                1LI.A0J(r302, obj);
                return null;
            }
            if (i2 != 744738225) {
                return null;
            }
            1Iw r0 = r302.A00.A00;
            int A08 = 7zO.A08(r302.A03, 0);
            InputConnection inputConnection = ((C6re) obj).A01;
            List list = ((C8pf) 4YU.A0P(r0)).A00;
            7zR.A1O(inputConnection, list);
            return new 8CO(inputConnection, r0, list, A08);
        }
        1Iw r02 = r302.A00.A00;
        Object[] objArr = r302.A03;
        int A082 = 7zO.A08(objArr, 0);
        List list2 = (List) objArr[1];
        11T.A0G(r02, 0, list2);
        int i3 = A082;
        while (true) {
            i = i3;
            if (i < 0 || !((A00 = C8oa.A00((C2iw) list2.get(i))) == null || A00.length() == 0)) {
                break;
            }
            i3 = i - 1;
        }
        int i4 = i + 1;
        if (i4 >= list2.size() || i4 < 0 || A082 == i4 || i4 <= 0) {
            z = false;
        } else {
            7zP.A1T(list2, i4);
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // X.C1rj
    public Object A16(C2ko c2ko, Object obj, Object[] objArr) {
        int i;
        int i2 = c2ko.A02;
        if (i2 != -712287114) {
            if (i2 != -535912147) {
                return null;
            }
            List list = ((C8pf) 4YU.A0P(c2ko.A00)).A00;
            7zP.A1T(list, 7zP.A1X(list) ? 1 : 0);
            return null;
        }
        1Iw r0 = c2ko.A00;
        CharSequence charSequence = ((C6rc) obj).A00;
        List list2 = ((C8pf) 4YU.A0P(r0)).A00;
        11T.A0G(charSequence, 1, list2);
        String A0u = 7zO.A0u(charSequence, 0, 7zO.A07(charSequence, list2.size()));
        if (A0u != null) {
            i = A0u.length();
            for (int i3 = 0; i3 < i; i3++) {
                C8oa.A0M((C2iw) list2.get(i3), Character.toString((char) A0u.codePointAt(i3)));
            }
        } else {
            i = 0;
        }
        C8oa.A0L((C2iw) list2.get(i - 1), 1, 1);
        return null;
    }

    @Override // X.C1rj
    public void A1G(1Iw r302, 1sE r303) {
        7zQ.A1H(r302, this.A04, this, r303);
        7zQ.A1H(r302, this.A05, this, r303);
    }

    @Override // X.C1rj
    public void A1N(1Iw r302, 2Yv r303) {
        C8pf c8pf = (C8pf) r303;
        boolean z = this.A0A;
        String str = this.A07;
        int i = this.A03;
        int i2 = this.A01;
        int i3 = this.A02;
        if (i3 < 1) {
            throw AnonymousClass001.A0N("block number should be greater than and equal to 1");
        }
        if (i < 1) {
            throw AnonymousClass001.A0N("row number should be greater than and equal to 1");
        }
        if (i2 < 1) {
            throw AnonymousClass001.A0N("column number should be greater than and equal to 1");
        }
        if (!z && (str == null || str.length() != i * i2 * i3)) {
            throw 1BK.A0g();
        }
        ArrayList A0s = AnonymousClass001.A0s();
        ArrayList A0s2 = AnonymousClass001.A0s();
        int i4 = 0;
        do {
            int i5 = 0;
            do {
                int i6 = 0;
                do {
                    A0s.add(7zL.A0Z());
                    int i7 = (i4 * i3 * i2) + (i5 * i3) + i6;
                    A0s2.add((str == null || i7 >= str.length()) ? "" : String.valueOf(str.charAt(i7)));
                    i6++;
                } while (i6 < i3);
                i5++;
            } while (i5 < i2);
            i4++;
        } while (i4 < i);
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        c8pf.A00 = A0s;
        c8pf.A01 = A0s2;
        c8pf.A02 = atomicBoolean;
    }

    @Override // X.C1rj
    public boolean A1U() {
        return true;
    }
}
