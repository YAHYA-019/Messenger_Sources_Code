package com.facebook.omnistore.sqlite;

import X.2Ge;
import X.AnonymousClass001;
import X.C01m;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import java.io.Closeable;
import java.io.IOException;

/* loaded from: Database.class */
public class Database implements Closeable {
    public final 2Ge mDatabaseWrapper;
    public int mTransactionNestingDepth;

    public Database(SQLiteDatabase sQLiteDatabase) {
        this.mDatabaseWrapper = new 2Ge(sQLiteDatabase);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.mDatabaseWrapper.A00.close();
    }

    public void exec(String str) {
        try {
            SQLiteDatabase A00 = this.mDatabaseWrapper.A00();
            C01m.A00(-326336547);
            A00.execSQL(str);
            C01m.A00(-1501505647);
        } catch (SQLiteException e) {
            throw new IOException(e);
        }
    }

    public void execExclusiveTransaction(String str) {
        synchronized (this) {
            try {
                SQLiteDatabase A00 = this.mDatabaseWrapper.A00();
                C01m.A00(715657945);
                A00.execSQL(str);
                C01m.A00(439105871);
            } catch (SQLiteException e) {
                throw new IOException(e);
            }
        }
    }

    public String getDatabaseFilename() {
        return this.mDatabaseWrapper.A00().getPath();
    }

    public boolean isInTransaction() {
        boolean A1N;
        synchronized (this) {
            A1N = AnonymousClass001.A1N(this.mTransactionNestingDepth);
        }
        return A1N;
    }

    public ReadStatement prepareRead(String str) {
        return new ReadStatement(str, this.mDatabaseWrapper);
    }

    public WriteStatement prepareWrite(String str) {
        try {
            return new WriteStatement(this.mDatabaseWrapper.A00().compileStatement(str), this.mDatabaseWrapper.A00());
        } catch (SQLiteException e) {
            throw new IOException(e);
        }
    }

    public void runInRootTransaction(Runnable runnable) {
        synchronized (this) {
            if (this.mTransactionNestingDepth != 0) {
                throw new RuntimeException() { // from class: X.3jk
                };
            }
            runInTransaction(runnable);
        }
    }

    public void runInTransaction(Runnable runnable) {
        synchronized (this) {
            try {
                C01m.A01(this.mDatabaseWrapper.A00(), -1481933718);
                this.mTransactionNestingDepth++;
                try {
                    runnable.run();
                    this.mDatabaseWrapper.A00().setTransactionSuccessful();
                    this.mTransactionNestingDepth--;
                    C01m.A03(this.mDatabaseWrapper.A00(), -1064148207);
                } catch (Throwable th) {
                    this.mTransactionNestingDepth--;
                    C01m.A03(this.mDatabaseWrapper.A00(), 520471587);
                    throw th;
                }
            } catch (SQLiteException e) {
                throw new IOException(e);
            }
        }
    }
}
