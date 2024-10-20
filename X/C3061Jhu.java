package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collections;
import java.util.List;

/* renamed from: X.Jhu, reason: case insensitive filesystem */
/* loaded from: Jhu.class */
public final class C3061Jhu extends 2Xd implements MQd {
    public boolean A02;
    public final MQd A03;
    public final 2N9 A04 = new GWq(this);
    public List A01 = Collections.emptyList();
    public List A00 = Collections.emptyList();

    public C3061Jhu(MQd mQd) {
        this.A03 = mQd;
        A0B(((2Xd) mQd).A00);
    }

    public /* bridge */ /* synthetic */ void A0C(C2lb c2lb) {
        JiC jiC = (JiC) c2lb;
        2Xd r0 = this.A03;
        if (r0 instanceof 2Xd) {
            List list = C2lb.A0J;
            C2lb c2lb2 = jiC.A00;
            if (c2lb2 != null) {
                r0.A0C(c2lb2);
            }
        }
    }

    public /* bridge */ /* synthetic */ void A0D(C2lb c2lb) {
        JiC jiC = (JiC) c2lb;
        2Xd r0 = this.A03;
        if (r0 instanceof 2Xd) {
            List list = C2lb.A0J;
            C2lb c2lb2 = jiC.A00;
            if (c2lb2 != null) {
                r0.A0D(c2lb2);
            }
        }
    }

    public /* bridge */ /* synthetic */ boolean A0E(C2lb c2lb) {
        return true;
    }

    public /* bridge */ /* synthetic */ void A0F(C2lb c2lb) {
        JiC jiC = (JiC) c2lb;
        2Xd r0 = this.A03;
        if (r0 instanceof 2Xd) {
            List list = C2lb.A0J;
            C2lb c2lb2 = jiC.A00;
            if (c2lb2 != null) {
                r0.A0F(c2lb2);
            }
        }
    }

    @Override // X.MKy
    public void Bje(RecyclerView recyclerView) {
        this.A03.Bje(recyclerView);
    }

    @Override // X.MKy
    public /* bridge */ /* synthetic */ void BlZ(C2lb c2lb, int i) {
        JiC jiC = (JiC) c2lb;
        int size = i - this.A01.size();
        if (size >= 0) {
            MQd mQd = this.A03;
            if (size < mQd.getItemCount()) {
                List list = C2lb.A0J;
                mQd.BlZ(jiC.A00, size);
            }
        }
    }

    @Override // X.MKy
    public /* bridge */ /* synthetic */ C2lb Bs3(ViewGroup viewGroup, int i) {
        int i2;
        List list;
        if (i >= 0) {
            List list2 = C2lb.A0J;
            return new JiC(this.A03.Bs3(viewGroup, i));
        }
        if (i % 2 == 0) {
            i2 = ((-i) / 2) - 1;
            list = this.A00;
        } else {
            i2 = -((i + 1) / 2);
            list = this.A01;
        }
        return new JiC((View) list.get(i2));
    }

    @Override // X.MKy
    public void BtQ(RecyclerView recyclerView) {
        this.A03.BtQ(recyclerView);
    }

    @Override // X.MKy
    public void CcA(2N9 r302) {
        super.CcA(r302);
        if (this.A02) {
            return;
        }
        this.A03.CcA(this.A04);
        this.A02 = true;
    }

    @Override // X.MKy
    public void D5v(2N9 r302) {
        super.D5v(r302);
        if (!this.A02 || ((2Xd) this).A01.A05()) {
            return;
        }
        this.A03.D5v(this.A04);
        this.A02 = false;
    }

    @Override // X.MFm
    public Object getItem(int i) {
        int size = this.A01.size();
        if (i < size) {
            return null;
        }
        MQd mQd = this.A03;
        if (i < mQd.getItemCount() + size) {
            return mQd.getItem(i - size);
        }
        return null;
    }

    @Override // X.MKy
    public int getItemCount() {
        return this.A01.size() + this.A03.getItemCount() + this.A00.size();
    }

    @Override // X.MKy
    public long getItemId(int i) {
        int itemCount;
        int size = this.A01.size();
        MQd mQd = this.A03;
        int itemCount2 = mQd.getItemCount();
        if (i < size) {
            itemCount = (-1) - (i * 2);
        } else {
            int i2 = i - size;
            if (i2 < itemCount2) {
                return mQd.getItemId(i2);
            }
            itemCount = (((i - mQd.getItemCount()) - this.A01.size()) + 1) * (-2);
        }
        return itemCount;
    }

    @Override // X.MKy
    public int getItemViewType(int i) {
        int size = this.A01.size();
        MQd mQd = this.A03;
        int itemCount = mQd.getItemCount();
        if (i < size) {
            return (-1) - (i * 2);
        }
        int i2 = i - size;
        return i2 >= itemCount ? (((i - mQd.getItemCount()) - this.A01.size()) + 1) * (-2) : mQd.getItemViewType(i2);
    }
}
