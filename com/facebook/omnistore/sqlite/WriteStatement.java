package com.facebook.omnistore.sqlite;

import X.C01m;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteStatement;
import java.io.Closeable;
import java.io.IOException;

/* loaded from: WriteStatement.class */
public class WriteStatement implements Closeable {
    public final SQLiteDatabase mDatabase;
    public final SQLiteStatement mStatementUnsafe;

    public WriteStatement(SQLiteStatement sQLiteStatement, SQLiteDatabase sQLiteDatabase) {
        this.mDatabase = sQLiteDatabase;
        this.mStatementUnsafe = sQLiteStatement;
    }

    private SQLiteStatement getStatement() {
        if (this.mDatabase.isOpen()) {
            return this.mStatementUnsafe;
        }
        throw new IOException("SQLite Database is closed");
    }

    public void bindBlob(int i, byte[] bArr) {
        try {
            getStatement().bindBlob(i, bArr);
        } catch (SQLiteException e) {
            throw new IOException(e);
        }
    }

    public void bindLong(int i, long j) {
        try {
            getStatement().bindLong(i, j);
        } catch (SQLiteException e) {
            throw new IOException(e);
        }
    }

    public void bindNull(int i) {
        try {
            getStatement().bindNull(i);
        } catch (SQLiteException e) {
            throw new IOException(e);
        }
    }

    public void bindString(int i, String str) {
        try {
            getStatement().bindString(i, str);
        } catch (SQLiteException e) {
            throw new IOException(e);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            this.mStatementUnsafe.close();
        } catch (SQLiteException e) {
            throw new IOException(e);
        }
    }

    public void execute() {
        try {
            SQLiteStatement statement = getStatement();
            C01m.A00(1371922506);
            statement.execute();
            C01m.A00(-2078742041);
        } catch (SQLiteException e) {
            throw new IOException(e);
        }
    }

    public void reset() {
        try {
            getStatement().clearBindings();
        } catch (SQLiteException e) {
            throw new IOException(e);
        }
    }
}
