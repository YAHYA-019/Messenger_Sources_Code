package X;

import com.facebook.msys.mci.CQLResultSet;

/* loaded from: DBf.class */
public final class DBf implements C00l, C00m {
    public final int A00;
    public final Object A01;

    public DBf(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    @Override // X.C00m
    public final Object invoke() {
        CQLResultSet cQLResultSet;
        int i;
        switch (this.A00) {
            case 0:
                6HK r0 = ((6HQ) this.A01).A03;
                if (r0 != null) {
                    r0.C3O();
                }
                return 04S.A00;
            case 1:
                cQLResultSet = ((1qX) this.A01).mResultSet;
                i = 206;
                return cQLResultSet.getString(0, i);
            case 2:
                cQLResultSet = ((1qX) this.A01).mResultSet;
                i = 193;
                return cQLResultSet.getString(0, i);
            default:
                cQLResultSet = ((1qX) this.A01).mResultSet;
                i = 191;
                return cQLResultSet.getString(0, i);
        }
    }
}
