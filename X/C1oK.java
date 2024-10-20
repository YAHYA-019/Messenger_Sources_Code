package X;

import android.content.Context;
import com.facebook.omnistore.OmnistoreIOException;
import com.facebook.omnistore.sqlite.AndroidSqliteOmnistoreDatabaseCreator;
import com.facebook.omnistore.sqlite.Database;
import java.io.File;

/* renamed from: X.1oK, reason: invalid class name */
/* loaded from: 1oK.class */
public final class C1oK implements AndroidSqliteOmnistoreDatabaseCreator.DatabaseOpener {
    public 1BY A00;
    public final 1oG A01 = (1oG) 1Bn.A0E((Context) null, (1BY) null, 16809);

    public C1oK(1BO r302) {
        this.A00 = new 1BY(r302);
    }

    private Database A00() {
        1oG r0 = this.A01;
        StringBuilder sb = new StringBuilder();
        Context context = r0.A01;
        sb.append(context.getDatabasePath(0Pz.A0W(1oG.A00(r0), ".db")));
        sb.append(".toreset");
        File file = new File(sb.toString());
        if (file.exists()) {
            file.delete();
            r0.A01();
        }
        return new Database(context.openOrCreateDatabase(0Pz.A0W(1oG.A00(r0), ".db"), 8, null));
    }

    @Override // com.facebook.omnistore.sqlite.AndroidSqliteOmnistoreDatabaseCreator.DatabaseOpener
    public void deleteDatabaseFiles() {
        this.A01.A01();
    }

    @Override // com.facebook.omnistore.sqlite.AndroidSqliteOmnistoreDatabaseCreator.DatabaseOpener
    public String getHealthTrackerAbsoluteFilename() {
        1oG r0 = this.A01;
        return r0.A01.getDatabasePath(0Pz.A0W(1oG.A00(r0), "_status.dat")).getAbsolutePath();
    }

    @Override // com.facebook.omnistore.sqlite.AndroidSqliteOmnistoreDatabaseCreator.DatabaseOpener
    public AndroidSqliteOmnistoreDatabaseCreator.PreparedDatabase openDatabase(AndroidSqliteOmnistoreDatabaseCreator.SchemaUpdater schemaUpdater) {
        try {
            return schemaUpdater.ensureDbSchema(A00());
        } catch (AbstractC02793w7 | OmnistoreIOException e) {
            0fH.A0N(C1oK.class, "Omnistore must delete database", e, AnonymousClass001.A1Z());
            this.A01.A01();
            try {
                return schemaUpdater.ensureDbSchema(A00());
            } catch (Exception e2) {
                throw 1BK.A0s(0Pz.A1B("Failed to create DB after forced Delete: ", e), e2);
            }
        }
    }
}
