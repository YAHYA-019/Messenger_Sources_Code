package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6D2, reason: invalid class name */
/* loaded from: 6D2.class */
public final class C6D2 implements 5M8 {
    public List A00 = new ArrayList();
    public final C6D4 A01 = new 6D3(this);
    public final boolean A02;

    public C6D2(boolean z) {
        this.A02 = z;
    }

    public void Bm3(6D7 r302, 6DQ r303, int i, boolean z) {
        if (this.A02) {
            Iterator it = this.A00.iterator();
            while (it.hasNext()) {
                ((5M9) it.next()).Bm3(r302, r303, i, z);
            }
        } else {
            synchronized (this) {
                Iterator it2 = this.A00.iterator();
                while (it2.hasNext()) {
                    ((5M8) it2.next()).Bm3(r302, r303, i, z);
                }
            }
        }
    }

    public void Byu(6DD r302, long j, long j2, long j3) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((5M8) it.next()).Byu(r302, j, j2, j3);
        }
    }

    public void Byv(long j, long j2) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((5M8) it.next()).Byv(j, j2);
        }
    }

    public void CH4() {
        if (this.A02) {
            Iterator it = this.A00.iterator();
            while (it.hasNext()) {
                ((5M8) it.next()).CH4();
            }
        } else {
            synchronized (this) {
                Iterator it2 = this.A00.iterator();
                while (it2.hasNext()) {
                    ((5M8) it2.next()).CH4();
                }
            }
        }
    }

    public void CRX() {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((5M8) it.next()).CRX();
        }
    }

    public void CRY(6D7 r302, 6DQ r303, boolean z) {
        if (this.A02) {
            Iterator it = this.A00.iterator();
            while (it.hasNext()) {
                ((5M9) it.next()).CRY(r302, r303, z);
            }
        } else {
            synchronized (this) {
                Iterator it2 = this.A00.iterator();
                while (it2.hasNext()) {
                    ((5M8) it2.next()).CRY(r302, r303, z);
                }
            }
        }
    }

    public void CRZ(IOException iOException) {
        if (this.A02) {
            Iterator it = this.A00.iterator();
            while (it.hasNext()) {
                ((5M8) it.next()).CRZ(iOException);
            }
        } else {
            synchronized (this) {
                Iterator it2 = this.A00.iterator();
                while (it2.hasNext()) {
                    ((5M8) it2.next()).CRZ(iOException);
                }
            }
        }
    }

    public void CRc(String str, Object obj) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((5MA) it.next()).CRc(str, obj);
        }
    }

    public void CRd(6DD r302, 6DQ r303) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((5M8) it.next()).CRd(r302, r303);
        }
    }

    public void CRf(6D7 r302, 6DQ r303, boolean z, boolean z2) {
        if (this.A02) {
            Iterator it = this.A00.iterator();
            while (it.hasNext()) {
                ((5M9) it.next()).CRf(r302, r303, z, z2);
            }
        } else {
            synchronized (this) {
                Iterator it2 = this.A00.iterator();
                while (it2.hasNext()) {
                    ((5M8) it2.next()).CRf(r302, r303, z, z2);
                }
            }
        }
    }

    public void CnM(long j) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((5M8) it.next()).CnM(j);
        }
    }

    public void CoH(String str) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((5M8) it.next()).CoH(str);
        }
    }

    public void CvR(int i) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((5M8) it.next()).CvR(i);
        }
    }
}
