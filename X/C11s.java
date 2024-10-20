package X;

/* renamed from: X.11s, reason: invalid class name */
/* loaded from: 11s.class */
public final class C11s implements 0zU {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C4G7 A01;

    public C11s(C4G7 c4g7, int i) {
        this.A01 = c4g7;
        this.A00 = i;
    }

    public static final Object A00(0DR r301) {
        04S r306;
        04S r305;
        C2ao c2ao;
        0DE context = r301.getContext();
        2sD.A00(context);
        0DR A02 = 0DT.A02(r301);
        if (!(A02 instanceof C2ao) || (c2ao = (C2ao) A02) == null) {
            r306 = 04S.A00;
            r305 = r306;
        } else {
            2Zs r0 = c2ao.A03;
            if (r0.isDispatchNeeded(context)) {
                r305 = 04S.A00;
                c2ao.A00 = r305;
                ((C2ap) c2ao).A00 = 1;
                r0.dispatchYield(context, c2ao);
            } else {
                3kA r02 = new 3kA();
                0DE plus = context.plus(r02);
                r305 = 04S.A00;
                c2ao.A00 = r305;
                ((C2ap) c2ao).A00 = 1;
                r0.dispatchYield(plus, c2ao);
                if (r02.A00) {
                    C2ai A00 = 44Y.A00();
                    C07a c07a = A00.A01;
                    if (c07a != null && !c07a.isEmpty()) {
                        long j = A00.A00;
                        if (j >= 4294967296L) {
                            c2ao.A00 = r305;
                            ((C2ap) c2ao).A00 = 1;
                            A00.A03(c2ao);
                        } else {
                            A00.A00 = j + 4294967296L;
                            try {
                                c2ao.run();
                                do {
                                } while (A00.A05());
                            } finally {
                                try {
                                } finally {
                                }
                            }
                        }
                    }
                    r306 = r305;
                }
            }
            r306 = 0Ds.A02;
        }
        return r306 == 0Ds.A02 ? r306 : r305;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object emit(java.lang.Object r302, X.0DR r303) {
        /*
            Method dump skipped, instructions count: 214
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11s.emit(java.lang.Object, X.0DR):java.lang.Object");
    }
}
