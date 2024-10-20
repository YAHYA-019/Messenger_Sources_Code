package com.facebook.orca.mca;

import X.1qX;
import X.4lA;
import X.4lE;
import X.5Rw;
import X.5Ry;
import X.5pI;
import X.C07864l4;
import X.C07884l6;
import X.C07904l8;
import X.C07914lB;
import X.C07924lC;
import com.facebook.msys.mci.CQLResultSet;

/* loaded from: MailboxOrca$ThreadViewDataObserverCallback.class */
public abstract class MailboxOrca$ThreadViewDataObserverCallback {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [X.4l4, X.1qX] */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.4l6, X.1qX] */
    /* JADX WARN: Type inference failed for: r0v6, types: [X.4l8, X.1qX] */
    private void callbackJNI(CQLResultSet cQLResultSet, CQLResultSet cQLResultSet2, CQLResultSet cQLResultSet3, CQLResultSet cQLResultSet4, CQLResultSet cQLResultSet5, CQLResultSet cQLResultSet6, long j, long j2, int i, int i2, CQLResultSet cQLResultSet7, CQLResultSet cQLResultSet8, CQLResultSet cQLResultSet9, CQLResultSet cQLResultSet10, Number number, Number number2, Number number3) {
        ?? r0 = new 1qX(cQLResultSet);
        ?? r02 = new 1qX(cQLResultSet2);
        ?? r03 = new 1qX(cQLResultSet3);
        1qX r04 = new 1qX(cQLResultSet4);
        1qX r326 = null;
        1qX r327 = cQLResultSet5 == null ? null : new 1qX(cQLResultSet5);
        1qX r328 = cQLResultSet6 == null ? null : new 1qX(cQLResultSet6);
        1qX r322 = cQLResultSet7 == null ? null : new 1qX(cQLResultSet7);
        1qX r329 = cQLResultSet8 == null ? null : new 1qX(cQLResultSet8);
        1qX r330 = cQLResultSet9 == null ? null : new 1qX(cQLResultSet9);
        if (cQLResultSet10 != null) {
            r326 = new 1qX(cQLResultSet10);
        }
        callback(r0, r02, r03, r04, r327, r328, j, j2, i, i2, r322, r329, r330, r326, number, number2, number3);
    }

    public abstract void callback(C07864l4 c07864l4, C07884l6 c07884l6, C07904l8 c07904l8, 4lA r4, C07914lB c07914lB, C07924lC c07924lC, long j, long j2, int i, int i2, 5Rw r13, 5Ry r14, 4lE r15, 5pI r16, Number number, Number number2, Number number3);
}
