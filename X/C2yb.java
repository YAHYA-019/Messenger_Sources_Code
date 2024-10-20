package X;

import com.facebook.msys.mcd.DatabaseOpenCallback;

/* renamed from: X.2yb, reason: invalid class name */
/* loaded from: 2yb.class */
public final class C2yb extends DatabaseOpenCallback {
    public final /* synthetic */ 1fC A00;

    public C2yb(1fC r302) {
        this.A00 = r302;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0025, code lost:
    
        if (com.facebook.endtoend.EndToEnd.isRunningEndToEndTest() != false) goto L8;
     */
    @Override // com.facebook.msys.mci.Database.OpenCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onConfig(com.facebook.msys.mci.sqliteholder.SqliteHolder r302, int r303, com.facebook.msys.mci.DatabaseConnectionSettings r304) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2yb.onConfig(com.facebook.msys.mci.sqliteholder.SqliteHolder, int, com.facebook.msys.mci.DatabaseConnectionSettings):void");
    }

    @Override // com.facebook.msys.mci.Database.OpenCallback
    public void onOpen(boolean z, Throwable th) {
        if (th != null) {
            throw AnonymousClass001.A0U(th);
        }
        if (z) {
            1fC r0 = this.A00;
            C1gn c1gn = (C1gn) r0.A0A.get();
            synchronized (c1gn) {
                StringBuilder A0k = AnonymousClass001.A0k();
                A0k.append("onMsysBootstrapDatabaseOpened enabled=");
                A0k.append(c1gn.A04);
                A0k.append(" isActive=");
                A0k.append(c1gn.A05);
                A0k.append(" didCreateDatabase=");
                A0k.append(z);
                0fH.A0j("MPLDataFreshnessTracker", A0k.toString());
                if (c1gn.A04 && c1gn.A05) {
                    C1gn.A00(c1gn).markerPoint(729359638, "on_msys_database_created");
                    C1gn.A00(c1gn).markerAnnotate(729359638, "did_create_database", z);
                }
            }
            ((1SG) r0.A09.get()).A0d("did_create_msys_db", true);
        }
    }
}
