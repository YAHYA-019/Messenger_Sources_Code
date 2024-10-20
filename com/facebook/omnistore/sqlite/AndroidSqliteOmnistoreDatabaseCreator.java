package com.facebook.omnistore.sqlite;

import X.C0il;
import com.facebook.jni.HybridData;
import com.facebook.omnistore.OmnistoreDatabaseCreator;

/* loaded from: AndroidSqliteOmnistoreDatabaseCreator.class */
public class AndroidSqliteOmnistoreDatabaseCreator {

    /* loaded from: AndroidSqliteOmnistoreDatabaseCreator$DatabaseOpener.class */
    public interface DatabaseOpener {
        void deleteDatabaseFiles();

        String getHealthTrackerAbsoluteFilename();

        PreparedDatabase openDatabase(SchemaUpdater schemaUpdater);
    }

    /* loaded from: AndroidSqliteOmnistoreDatabaseCreator$PreparedDatabase.class */
    public class PreparedDatabase {
        public final HybridData mHybridData;

        public PreparedDatabase(HybridData hybridData) {
            this.mHybridData = hybridData;
        }
    }

    /* loaded from: AndroidSqliteOmnistoreDatabaseCreator$SchemaUpdater.class */
    public class SchemaUpdater {
        public final HybridData mHybridData;

        public SchemaUpdater(HybridData hybridData) {
            this.mHybridData = hybridData;
        }

        public native PreparedDatabase ensureDbSchema(Database database);
    }

    static {
        C0il.A0B("omnistoresqliteandroid");
    }

    public static native OmnistoreDatabaseCreator makeDatabaseCreator(DatabaseOpener databaseOpener);
}
