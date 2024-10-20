package com.facebook.messaging.push.dedup.provider;

import X.0Q8;
import X.0RF;
import X.0fH;
import X.11T;
import X.1BK;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass053;
import X.C01m;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteQueryBuilder;
import android.net.Uri;
import com.facebook.secure.content.SecureContentDelegateDI;

/* loaded from: ClientMessagePushDedupInfoProvider.class */
public final class ClientMessagePushDedupInfoProvider extends 0RF {

    /* loaded from: ClientMessagePushDedupInfoProvider$Impl.class */
    public final class Impl extends SecureContentDelegateDI {
        public SQLiteDatabase A00;
        public final UriMatcher A01;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Impl(0RF r302) {
            super(r302);
            11T.A0F(r302, 1);
            UriMatcher uriMatcher = new UriMatcher(-1);
            uriMatcher.addURI("com.facebook.katana.ClientMessagePushDedupInfoProvider", "/mutestatus", 1);
            uriMatcher.addURI("com.facebook.wakizashi.ClientMessagePushDedupInfoProvider", "/mutestatus", 1);
            uriMatcher.addURI("com.facebook.orca.ClientMessagePushDedupInfoProvider", "/mutestatus", 1);
            this.A01 = uriMatcher;
        }

        @Override // com.facebook.secure.content.DeferredInitAbstractContentProviderDelegate
        public int A0U(Uri uri, ContentValues contentValues, String str, String[] strArr) {
            throw AnonymousClass001.A0p();
        }

        @Override // com.facebook.secure.content.DeferredInitAbstractContentProviderDelegate
        public int A0V(Uri uri, String str, String[] strArr) {
            SQLiteDatabase sQLiteDatabase = this.A00;
            if (sQLiteDatabase != null) {
                return sQLiteDatabase.delete("mutestatus", str, strArr);
            }
            11T.A0L("writableDb");
            throw 0Q8.createAndThrow();
        }

        @Override // com.facebook.secure.content.DeferredInitAbstractContentProviderDelegate
        public Cursor A0X(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
            SQLiteQueryBuilder sQLiteQueryBuilder = new SQLiteQueryBuilder();
            sQLiteQueryBuilder.setTables("mutestatus");
            if (this.A01.match(uri) != 1) {
                throw AnonymousClass002.A0C(uri, "Unknown URI ", AnonymousClass001.A0k());
            }
            SQLiteDatabase sQLiteDatabase = this.A00;
            if (sQLiteDatabase == null) {
                11T.A0L("writableDb");
                throw 0Q8.createAndThrow();
            }
            Cursor query = sQLiteQueryBuilder.query(sQLiteDatabase, strArr, str, strArr2, null, null, str2);
            Context context = ((AnonymousClass053) this).A00.getContext();
            if (context == null) {
                throw 1BK.A0h();
            }
            query.setNotificationUri(context.getContentResolver(), uri);
            return query;
        }

        @Override // com.facebook.secure.content.DeferredInitAbstractContentProviderDelegate
        public Uri A0Y(Uri uri, ContentValues contentValues) {
            SQLiteDatabase sQLiteDatabase = this.A00;
            if (sQLiteDatabase == null) {
                11T.A0L("writableDb");
                throw 0Q8.createAndThrow();
            }
            C01m.A00(1408150873);
            long insertWithOnConflict = sQLiteDatabase.insertWithOnConflict("mutestatus", null, contentValues, 5);
            C01m.A00(1896831263);
            if (insertWithOnConflict <= 0) {
                throw new SQLiteException(AnonymousClass001.A0Z(uri, "Failed to add a record into ", AnonymousClass001.A0k()));
            }
            Uri withAppendedPath = Uri.withAppendedPath(uri, String.valueOf(insertWithOnConflict));
            11T.A0A(withAppendedPath);
            return withAppendedPath;
        }

        @Override // com.facebook.secure.content.DeferredInitAbstractContentProviderDelegate
        public String A0a(Uri uri) {
            throw AnonymousClass002.A0C(uri, "Unknown URI ", AnonymousClass001.A0k());
        }

        @Override // com.facebook.secure.content.DeferredInitAbstractContentProviderDelegate
        public void A0b() {
            Context context = ((AnonymousClass053) this).A00.getContext();
            11T.A0A(context);
            SQLiteDatabase writableDatabase = new SQLiteOpenHelper(context, "client_message_push_dedup_db", (SQLiteDatabase.CursorFactory) null, 2).getWritableDatabase();
            11T.A0A(writableDatabase);
            this.A00 = writableDatabase;
            0fH.A0k("ClientMessagePushDedupInfoProvider", "Context is null, sync db failed to initialize");
        }
    }
}
