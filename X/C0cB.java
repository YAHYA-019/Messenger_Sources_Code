package X;

import android.content.Context;
import android.os.Environment;
import java.io.File;
import java.io.IOException;

/* JADX WARN: $VALUES field not found */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: X.0cB, reason: invalid class name */
/* loaded from: 0cB.class */
public abstract class C0cB {
    public static final C0cB A00 = new C0tv(0);
    public static final C0cB A01 = new C0tv(1);

    static {
        new C0tv(2);
        new C0tv(3);
        new C0tv(4);
        new C0tv(5);
        new C0tv(6);
        new C0tv(7);
        new C0tv(8);
    }

    public C0cB(String str, int i) {
    }

    /* JADX WARN: Type inference failed for: r0v57, types: [X.0g3, X.00X] */
    public C0g3 A00(Context context) {
        File cacheDir;
        SecurityException A0V;
        try {
            switch (((C0tv) this).A00) {
                case 0:
                    cacheDir = context.getCacheDir();
                    break;
                case 1:
                    cacheDir = context.getFilesDir();
                    break;
                case 2:
                    cacheDir = context.getExternalFilesDir(null);
                    if (cacheDir == null) {
                        A0V = AnonymousClass001.A0V("Your scope does not exist on device yet.");
                        throw A0V;
                    }
                    break;
                case 3:
                    cacheDir = context.getExternalFilesDir(Environment.DIRECTORY_DCIM);
                    if (cacheDir == null) {
                        A0V = AnonymousClass001.A0V("Your scope does not exist on device yet.");
                        throw A0V;
                    }
                    break;
                case 4:
                    cacheDir = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM);
                    if (cacheDir == null) {
                        A0V = AnonymousClass001.A0V("Your scope does not exist on device yet.");
                        throw A0V;
                    }
                    break;
                case 5:
                    cacheDir = context.getExternalFilesDir(Environment.DIRECTORY_PICTURES);
                    if (cacheDir == null) {
                        A0V = AnonymousClass001.A0V("Your scope does not exist on device yet.");
                        throw A0V;
                    }
                    break;
                case 6:
                    cacheDir = context.getExternalFilesDir(Environment.DIRECTORY_MOVIES);
                    if (cacheDir == null) {
                        A0V = AnonymousClass001.A0V("Your scope does not exist on device yet.");
                        throw A0V;
                    }
                    break;
                case 7:
                    cacheDir = context.getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS);
                    if (cacheDir == null) {
                        A0V = AnonymousClass001.A0V("Your scope does not exist on device yet.");
                        throw A0V;
                    }
                    break;
                default:
                    cacheDir = context.getExternalCacheDir();
                    if (cacheDir == null) {
                        A0V = AnonymousClass001.A0V("Your scope does not exist on device yet.");
                        throw A0V;
                    }
                    break;
            }
            return new C00X(cacheDir.getCanonicalPath());
        } catch (IOException unused) {
            throw AnonymousClass001.A0V("Cannot resolve the scope's path with passed in context.");
        }
    }
}
