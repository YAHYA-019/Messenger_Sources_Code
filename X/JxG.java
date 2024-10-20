package X;

import android.util.SparseArray;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.MutableLiveData;
import com.facebookpay.form.cell.CellParams;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;

/* loaded from: JxG.class */
public abstract class JxG extends L93 {
    public SparseArray A00;
    public ArrayList A01;
    public final MediatorLiveData A02;
    public final MutableLiveData A03;

    public JxG(int i, boolean z, boolean z2) {
        super(null, i, z, z2);
        this.A02 = new MediatorLiveData();
        this.A00 = DKC.A0E();
        this.A03 = JQx.A0a();
        this.A01 = AnonymousClass001.A0s();
    }

    @Override // X.L93
    public void A0A() {
        int i = 0;
        while (true) {
            int i2 = i;
            SparseArray sparseArray = this.A00;
            if (i2 >= sparseArray.size()) {
                return;
            }
            L93 l93 = (L93) sparseArray.valueAt(i2);
            if (l93 != null) {
                l93.A0A();
            }
            i = i2 + 1;
        }
    }

    @Override // X.L93
    public void A0B(Ra5 ra5) {
        super.A00 = ra5;
        int i = 0;
        while (true) {
            int i2 = i;
            SparseArray sparseArray = this.A00;
            if (i2 >= sparseArray.size()) {
                return;
            }
            L93 l93 = (L93) sparseArray.valueAt(i2);
            if (l93 != null) {
                l93.A0B(ra5);
            }
            i = i2 + 1;
        }
    }

    public L93 A0G(int i) {
        int i2 = 0;
        while (true) {
            int i3 = i2;
            SparseArray sparseArray = this.A00;
            if (i3 >= sparseArray.size()) {
                return null;
            }
            if (sparseArray.valueAt(i3) != null && ((L93) sparseArray.valueAt(i3)).A02 == i) {
                return (L93) sparseArray.valueAt(i3);
            }
            i2 = i3 + 1;
        }
    }

    public abstract ImmutableList A0H();

    public void A0I() {
        SparseArray sparseArray;
        ImmutableList A0H = A0H();
        int i = 0;
        while (true) {
            sparseArray = this.A00;
            if (i >= sparseArray.size()) {
                break;
            }
            L93 l93 = (L93) sparseArray.valueAt(i);
            this.A04.removeSource(l93.A04);
            this.A02.removeSource(l93.A09());
            l93.A0A();
            i++;
        }
        this.A00 = DKC.A0E();
        this.A01 = AnonymousClass001.A0s();
        1Du it = A0H.iterator();
        while (it.hasNext()) {
            CellParams cellParams = (CellParams) it.next();
            L93 A01 = cellParams.A01();
            cellParams.A00 = A01;
            A01.A0B(super.A00);
            int i2 = cellParams.A02;
            if (sparseArray.get(i2) instanceof JxE) {
                ((JxE) sparseArray.get(i2)).A07.getValue();
                ((JxE) A01).A07.setValue(null);
            }
            cellParams.A00 = A01;
            this.A00.put(i2, A01);
            AnonymousClass001.A1J(this.A01, i2);
            this.A02.addSource(A01.A09(), LR9.A01(this, 2));
        }
        int i3 = 0;
        while (true) {
            SparseArray sparseArray2 = this.A00;
            if (i3 >= sparseArray2.size()) {
                this.A03.setValue(A0H);
                return;
            } else {
                L93 l932 = (L93) sparseArray2.valueAt(i3);
                this.A04.addSource(l932.A04, new LQx(this, l932, 7));
                i3++;
            }
        }
    }

    public abstract void A0J(L93 l93, Object obj, Object obj2);
}
