package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* renamed from: X.2lb, reason: invalid class name */
/* loaded from: 2lb.class */
public abstract class C2lb {
    public static final List A0J = Collections.emptyList();
    public int A00;
    public 2Xd A08;
    public RecyclerView A0C;
    public WeakReference A0D;
    public final View A0I;
    public int A04 = -1;
    public int A02 = -1;
    public long A07 = -1;
    public int A01 = -1;
    public int A05 = -1;
    public C2lb A0A = null;
    public C2lb A0B = null;
    public List A0E = null;
    public List A0F = null;
    public int A0H = 0;
    public 2NB A09 = null;
    public boolean A0G = false;
    public int A06 = 0;
    public int A03 = -1;

    public C2lb(View view) {
        if (view == null) {
            throw AnonymousClass001.A0L("itemView may not be null");
        }
        this.A0I = view;
    }

    public final int A02() {
        RecyclerView recyclerView = this.A0C;
        if (recyclerView == null) {
            return -1;
        }
        return recyclerView.A0e(this);
    }

    public final int A03() {
        RecyclerView recyclerView;
        2Xd r0;
        int A0e;
        2Xd r02 = this.A08;
        int i = -1;
        if (r02 != null && (recyclerView = this.A0C) != null && (r0 = recyclerView.A0C) != null && (A0e = recyclerView.A0e(this)) != -1) {
            i = A0e;
            if (r02 != r0) {
                i = -1;
            }
        }
        return i;
    }

    public List A04() {
        List list;
        return ((this.A00 & 1024) != 0 || (list = this.A0E) == null || list.size() == 0) ? A0J : this.A0F;
    }

    public void A05() {
        float f = RecyclerView.A1C;
        this.A00 = 0;
        this.A04 = -1;
        this.A02 = -1;
        this.A07 = -1;
        this.A05 = -1;
        this.A0H = 0;
        this.A0A = null;
        this.A0B = null;
        List list = this.A0E;
        if (list != null) {
            list.clear();
        }
        this.A00 &= -1025;
        this.A06 = 0;
        this.A03 = -1;
        RecyclerView.A0O(this);
    }

    public void A06(int i, boolean z) {
        if (this.A02 == -1) {
            this.A02 = this.A04;
        }
        int i2 = this.A05;
        if (i2 == -1) {
            i2 = this.A04;
            this.A05 = i2;
        }
        if (z) {
            this.A05 = i2 + i;
        }
        this.A04 += i;
        View view = this.A0I;
        if (view.getLayoutParams() != null) {
            ((C2lg) view.getLayoutParams()).A00 = true;
        }
    }

    public final void A07(boolean z) {
        int i;
        int i2 = this.A0H;
        int i3 = i2 + 1;
        if (z) {
            i3 = i2 - 1;
        }
        this.A0H = i3;
        if (i3 < 0) {
            this.A0H = 0;
            float f = RecyclerView.A1C;
            android.util.Log.e("View", AnonymousClass001.A0m(this, "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for ").toString());
        } else if (z) {
            if (i3 == 0) {
                i = this.A00 & (-17);
                this.A00 = i;
            }
        } else if (i3 == 1) {
            i = this.A00 | 16;
            this.A00 = i;
        }
        float f2 = RecyclerView.A1C;
    }

    public boolean A08() {
        boolean z = false;
        if ((this.A00 & 8) != 0) {
            z = true;
        }
        return z;
    }

    public boolean A09() {
        boolean z = false;
        if ((this.A00 & 128) != 0) {
            z = true;
        }
        return z;
    }

    public String toString() {
        Class<?> cls = getClass();
        StringBuilder A0n = AnonymousClass001.A0n(cls.isAnonymousClass() ? "ViewHolder" : cls.getSimpleName());
        A0n.append("{");
        A0n.append(Integer.toHexString(hashCode()));
        A0n.append(" position=");
        A0n.append(this.A04);
        A0n.append(" id=");
        A0n.append(this.A07);
        A0n.append(", oldPos=");
        A0n.append(this.A02);
        A0n.append(", pLpos:");
        A0n.append(this.A05);
        StringBuilder sb = new StringBuilder(A0n.toString());
        if (this.A09 != null) {
            sb.append(" scrap ");
            sb.append(this.A0G ? "[changeScrap]" : "[attachedScrap]");
        }
        int i = this.A00;
        if ((i & 4) != 0) {
            sb.append(" invalid");
        }
        if ((i & 1) == 0) {
            sb.append(" unbound");
        }
        if ((i & 2) != 0) {
            sb.append(" update");
        }
        if (A08()) {
            sb.append(" removed");
        }
        if (A09()) {
            sb.append(" ignored");
        }
        if ((i & 256) != 0) {
            sb.append(" tmpDetached");
        }
        if ((i & 16) != 0 || this.A0I.hasTransientState()) {
            sb.append(0Pz.A0d(" not recyclable(", ")", this.A0H));
        }
        int i2 = this.A00;
        if ((i2 & 512) != 0 || (i2 & 4) != 0) {
            sb.append(" undefined adapter position");
        }
        if (this.A0I.getParent() == null) {
            sb.append(" no parent");
        }
        return 1BL.A0v(sb);
    }
}
