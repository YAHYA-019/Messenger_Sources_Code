package X;

import java.util.ListIterator;
import kotlin.jvm.functions.Function1;

/* renamed from: X.JbV, reason: case insensitive filesystem */
/* loaded from: JbV.class */
public final class C2854JbV extends Lz5 implements MRM {
    public static final C2854JbV A01 = new C2854JbV(AnonymousClass001.A1Z());
    public final Object[] A00;

    public C2854JbV(Object[] objArr) {
        this.A00 = objArr;
    }

    @Override // X.C00w
    public int A08() {
        return this.A00.length;
    }

    @Override // X.MRG
    public MRG A4w(Object obj) {
        if (size() < 32) {
            Object[] A1b = JQz.A1b(this.A00, size() + 1);
            A1b[size()] = obj;
            return new C2854JbV(A1b);
        }
        Object[] objArr = new Object[32];
        objArr[0] = obj;
        return new C2855JbW(this.A00, objArr, size() + 1, 0);
    }

    @Override // X.MRG
    public MRG A58(Object obj, int i) {
        KvD.A01(i, size());
        if (i == size()) {
            return A4w(obj);
        }
        if (size() < 32) {
            Object[] objArr = new Object[size() + 1];
            Object[] objArr2 = this.A00;
            C1A9.A0I(objArr2, objArr, 0, 0, i);
            C1A9.A0I(objArr2, objArr, i + 1, i, size());
            objArr[i] = obj;
            return new C2854JbV(objArr);
        }
        Object[] objArr3 = this.A00;
        Object[] A1b = JQz.A1b(objArr3, objArr3.length);
        System.arraycopy(objArr3, i, A1b, i + 1, (size() - 1) - i);
        A1b[i] = obj;
        Object obj2 = objArr3[31];
        Object[] objArr4 = new Object[32];
        objArr4[0] = obj2;
        return new C2855JbW(A1b, objArr4, size() + 1, 0);
    }

    @Override // X.MRG
    public LzA ACx() {
        return new LzA(this, null, this.A00, 0);
    }

    @Override // X.MRG
    public MRG Cdv(Function1 function1) {
        Object[] objArr = this.A00;
        int size = size();
        int size2 = size();
        boolean z = false;
        for (int i = 0; i < size2; i++) {
            Object obj = objArr[i];
            if (7zR.A1a(obj, function1)) {
                if (!z) {
                    objArr = JQz.A1b(objArr, objArr.length);
                    z = true;
                    size = i;
                }
            } else if (z) {
                objArr[size] = obj;
                size++;
            }
        }
        return size == size() ? this : size == 0 ? A01 : new C2854JbV(C1A9.A0L(objArr, 0, size));
    }

    @Override // X.MRG
    public MRG Ce4(int i) {
        KvD.A00(i, size());
        if (size() == 1) {
            return A01;
        }
        Object[] objArr = this.A00;
        Object[] A1b = JQz.A1b(objArr, size() - 1);
        C1A9.A0I(objArr, A1b, i, i + 1, size());
        return new C2854JbV(A1b);
    }

    @Override // X.MRG
    public MRG ClS(Object obj, int i) {
        KvD.A00(i, size());
        Object[] objArr = this.A00;
        Object[] A1b = JQz.A1b(objArr, objArr.length);
        A1b[i] = obj;
        return new C2854JbV(A1b);
    }

    @Override // X.C00v, java.util.List
    public Object get(int i) {
        KvD.A00(i, size());
        return this.A00[i];
    }

    @Override // X.C00v, java.util.List
    public int indexOf(Object obj) {
        return 02L.A00(this.A00, obj);
    }

    @Override // X.C00v, java.util.List
    public int lastIndexOf(Object obj) {
        return 02L.A01(this.A00, obj);
    }

    @Override // X.C00v, java.util.List
    public ListIterator listIterator(int i) {
        KvD.A01(i, size());
        return new JbQ(this.A00, i, size());
    }
}
