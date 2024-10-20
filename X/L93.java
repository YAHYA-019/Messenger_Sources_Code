package X;

import android.util.SparseArray;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.MutableLiveData;
import com.facebookpay.form.cell.CellParams;
import com.facebookpay.form.cell.logging.FormCellLoggingEvents;
import java.util.Iterator;

/* loaded from: L93.class */
public abstract class L93 {
    public Ra5 A00;
    public FormCellLoggingEvents A01;
    public final int A02;
    public final boolean A07;
    public final boolean A08;
    public final MutableLiveData A05 = JQx.A0a();
    public final MediatorLiveData A04 = new MediatorLiveData();
    public final SparseArray A03 = DKC.A0E();
    public final MutableLiveData A06 = new LiveData(AnonymousClass001.A0K());

    /* JADX WARN: Type inference failed for: r0v9, types: [androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData] */
    public L93(CellParams cellParams) {
        this.A02 = cellParams.A02;
        this.A08 = cellParams.A06;
        this.A07 = cellParams.A05;
        this.A01 = cellParams.A04;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData] */
    public L93(FormCellLoggingEvents formCellLoggingEvents, int i, boolean z, boolean z2) {
        this.A02 = i;
        this.A08 = z;
        this.A07 = z2;
        this.A01 = formCellLoggingEvents;
    }

    public static String A07(SparseArray sparseArray, int i) {
        Object obj = sparseArray.get(i);
        11T.A0I(obj, "null cannot be cast to non-null type kotlin.String");
        return (String) obj;
    }

    public SparseArray A08() {
        if (this instanceof JxG) {
            Object value = this.A04.getValue();
            value.getClass();
            return (SparseArray) value;
        }
        SparseArray A0E = DKC.A0E();
        A0E.put(this.A02, this.A04.getValue());
        return A0E;
    }

    public LiveData A09() {
        return this instanceof JxG ? ((JxG) this).A02 : this.A05;
    }

    public void A0A() {
    }

    public void A0B(Ra5 ra5) {
        this.A00 = ra5;
    }

    public void A0C(boolean z) {
        if (this instanceof JxE) {
            JxE jxE = (JxE) this;
            if (z && !jxE.A0F()) {
                jxE.A06.setValue(AnonymousClass001.A0K());
            }
            JQz.A1B(jxE.A02, !jxE.A0F());
            return;
        }
        if (this instanceof JxG) {
            JxG jxG = (JxG) this;
            Iterator it = jxG.A01.iterator();
            while (it.hasNext()) {
                L93 A0G = jxG.A0G(DKE.A0F(it));
                if (A0G != null) {
                    A0G.A0C(z);
                    if (z && !A0G.A0F()) {
                        z = false;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0038, code lost:
    
        if (r0.length() != 0) goto L11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v256, types: [int] */
    /* JADX WARN: Type inference failed for: r0v327, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A0D() {
        /*
            Method dump skipped, instructions count: 1309
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.L93.A0D():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0025, code lost:
    
        if (r0.length() == 0) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A0E() {
        /*
            r301 = this;
            r0 = r301
            boolean r0 = r0 instanceof X.JxE
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L2c
            r0 = r301
            X.L93 r0 = (X.L93) r0
            androidx.lifecycle.MediatorLiveData r0 = r0.A04
            java.lang.Object r0 = r0.getValue()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L28
            r0 = r303
            int r0 = r0.length()
            r302 = r0
            r0 = 0
            r304 = r0
            r0 = r302
            if (r0 != 0) goto L2a
        L28:
            r0 = 1
            r304 = r0
        L2a:
            r0 = r304
            return r0
        L2c:
            r0 = r301
            boolean r0 = r0 instanceof X.JxG
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L28
            r0 = r301
            r305 = r0
            r0 = r301
            X.JxG r0 = (X.JxG) r0
            r305 = r0
            r0 = 0
            r304 = r0
            r0 = 0
            r306 = r0
        L43:
            r0 = r305
            android.util.SparseArray r0 = r0.A00
            r307 = r0
            r0 = r307
            int r0 = r0.size()
            r302 = r0
            r0 = r306
            r1 = r302
            if (r0 >= r1) goto L28
            r0 = r307
            r1 = r306
            java.lang.Object r0 = r0.valueAt(r1)
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L78
            r0 = r307
            r1 = r306
            java.lang.Object r0 = r0.valueAt(r1)
            X.L93 r0 = (X.L93) r0
            r303 = r0
            r0 = r303
            boolean r0 = r0.A0E()
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L78
            r0 = 0
            return r0
        L78:
            r0 = r306
            r1 = 1
            int r0 = r0 + r1
            r306 = r0
            goto L43
        */
        throw new UnsupportedOperationException("Method not decompiled: X.L93.A0E():boolean");
    }

    public boolean A0F() {
        if (!(this instanceof JxG)) {
            return true;
        }
        JxG jxG = (JxG) this;
        int i = 0;
        while (true) {
            int i2 = i;
            SparseArray sparseArray = jxG.A00;
            if (i2 >= sparseArray.size()) {
                return true;
            }
            L93 l93 = (L93) sparseArray.valueAt(i2);
            Object value = jxG.A06.getValue();
            value.getClass();
            if (AnonymousClass001.A1V(value) && !l93.A0F()) {
                return false;
            }
            i = i2 + 1;
        }
    }
}
