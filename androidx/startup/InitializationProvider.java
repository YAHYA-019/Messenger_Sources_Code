package androidx.startup;

import X.0Uv;
import X.0V0;
import X.0V1;
import X.AnonymousClass001;
import android.content.ComponentName;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;

/* loaded from: InitializationProvider.class */
public class InitializationProvider extends ContentProvider {
    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        throw AnonymousClass001.A0N("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        throw AnonymousClass001.A0N("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw AnonymousClass001.A0N("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        Context context = getContext();
        if (context == null) {
            throw new RuntimeException("Context cannot be null");
        }
        if (context.getApplicationContext() == null) {
            return true;
        }
        0Uv A00 = 0Uv.A00(context);
        try {
            try {
                0V0.A00("Startup");
                Context context2 = A00.A00;
                A00.discoverAndInitialize(((PackageItemInfo) context2.getPackageManager().getProviderInfo(new ComponentName(context2.getPackageName(), InitializationProvider.class.getName()), 128)).metaData);
                return true;
            } catch (PackageManager.NameNotFoundException e) {
                throw new RuntimeException(e);
            }
        } finally {
            0V1.A00();
        }
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        throw AnonymousClass001.A0N("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw AnonymousClass001.A0N("Not allowed.");
    }
}
