package X;

/* renamed from: X.41h, reason: invalid class name */
/* loaded from: 41h.class */
public final class C41h {
    public final C00i A02;
    public int A01 = 3;
    public int A00 = 0;
    public final C00i A03 = new 1BQ(16385);
    public final C00i A05 = new 1BQ(16930);
    public final C00i A04 = new 1BQ(16923);
    public final C00i A07 = new 1BV(33101);
    public final C00i A06 = new 1BV(32811);

    public C41h() {
        1BQ r0 = new 1BQ(32879);
        this.A02 = r0;
        C41i c41i = (C41i) r0.get();
        c41i.A00.add(new C41k() { // from class: X.41j
            /* JADX WARN: Code restructure failed: missing block: B:25:0x0165, code lost:
            
                if (X.2Go.A00(r311, "-2") == false) goto L19;
             */
            /* JADX WARN: Code restructure failed: missing block: B:74:0x01bb, code lost:
            
                if (r314 != false) goto L39;
             */
            @Override // X.C41k
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void C0v(java.util.Map r302) {
                /*
                    Method dump skipped, instructions count: 948
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C41j.C0v(java.util.Map):void");
            }

            @Override // X.C41k
            public void C0w() {
                C41h c41h = C41h.this;
                if (((3sT) c41h.A06.get()).A01().equals("none")) {
                    C41l c41l = ((2Bx) c41h.A05.get()).A0C;
                    if (c41l != null) {
                        c41l.A01();
                        return;
                    }
                    return;
                }
                int i = c41h.A00 + 1;
                c41h.A00 = i;
                if (i >= c41h.A01) {
                    C41l c41l2 = ((2Bx) c41h.A05.get()).A0C;
                    if (c41l2 != null) {
                        int i2 = c41h.A00;
                        if (C41l.A03.A00(4)) {
                            c41l2.A02.withMarker(238949517, c41l2.A00).pointEditor("header_error").addPointData("num_errors", i2).markerEditingCompleted();
                        }
                    }
                    c41h.A00 = 0;
                    c41h.A01 *= 3;
                    ((2BR) c41h.A04.get()).A0J("header_error_force_fetch");
                }
            }
        });
    }
}
