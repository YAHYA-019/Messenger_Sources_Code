package X;

/* renamed from: X.9zk, reason: invalid class name */
/* loaded from: 9zk.class */
public final class C9zk implements C5xv, 0Jf {
    public final int A00;
    public final Object A01;

    public C9zk(C00m c00m, int i) {
        this.A00 = i;
        11T.A0F(c00m, 1);
        this.A01 = c00m;
    }

    public C9zk(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.C5xv
    public final void CSR() {
        1pI r304;
        String A00;
        switch (this.A00) {
            case 0:
            case 1:
            case 2:
                C9ct c9ct = (C9ct) this.A01;
                if (c9ct instanceof C8r0) {
                    C8r0 c8r0 = (C8r0) c9ct;
                    if (c8r0.A01 == BOj.A0A) {
                        AXY axy = c8r0.A04;
                        if (axy != null) {
                            axy.onBackPressed();
                            return;
                        }
                        return;
                    }
                    r304 = c8r0.A02;
                    if (r304.BVa()) {
                        A00 = c8r0.A06;
                        break;
                    } else {
                        return;
                    }
                } else {
                    r304 = ((C8qz) c9ct).A02;
                    if (r304.BVa()) {
                        A00 = "AiBotPickerFragment";
                        break;
                    } else {
                        return;
                    }
                }
            case 3:
            case 4:
            case 5:
                7zL.A1R(this.A01);
                return;
            case 6:
                C1539Aks c1539Aks = (C1539Aks) this.A01;
                1pI r0 = c1539Aks.A00;
                if (r0 != null) {
                    if (!r0.BVa()) {
                        return;
                    }
                    r304 = c1539Aks.A00;
                    if (r304 != null) {
                        A00 = AbE.A00(260);
                        break;
                    }
                }
                11T.A0L("contentViewManager");
                throw 0Q8.createAndThrow();
            default:
                return;
        }
        r304.CeH(A00);
    }

    public final boolean equals(Object obj) {
        boolean z;
        Object functionDelegate;
        switch (this.A00) {
            case 0:
            case 1:
            case 2:
            case 6:
                z = false;
                if ((obj instanceof C5xv) && (obj instanceof 0Jf)) {
                    functionDelegate = getFunctionDelegate();
                    break;
                }
                return z;
            case 3:
            case 4:
            case 5:
                z = false;
                if ((obj instanceof C5xv) && (obj instanceof 0Jf)) {
                    functionDelegate = this.A01;
                    break;
                }
                return z;
            default:
                z = super.equals(obj);
                return z;
        }
        return 11T.A0O(functionDelegate, ((0Jf) obj).getFunctionDelegate());
    }

    public final C00l getFunctionDelegate() {
        Object obj;
        Class cls;
        String str;
        String str2;
        switch (this.A00) {
            case 0:
            case 1:
            case 2:
                obj = this.A01;
                cls = C9ct.class;
                str = "onBackPress";
                str2 = "onBackPress()V";
                break;
            case 3:
            case 4:
            case 5:
                return (C00l) this.A01;
            case 6:
                obj = this.A01;
                cls = C1539Aks.class;
                str = "closeFragment";
                str2 = "closeFragment()V";
                break;
            default:
                return null;
        }
        return new 01I(0, obj, cls, str, str2, 0);
    }

    public final int hashCode() {
        Object obj;
        switch (this.A00) {
            case 0:
            case 1:
            case 2:
            case 6:
                obj = getFunctionDelegate();
                break;
            case 3:
            case 4:
            case 5:
                obj = this.A01;
                break;
            default:
                return super.hashCode();
        }
        return obj.hashCode();
    }
}
