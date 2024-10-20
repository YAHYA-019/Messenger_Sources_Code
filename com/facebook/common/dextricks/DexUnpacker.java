package com.facebook.common.dextricks;

import X.0Ug;
import X.AnonymousClass001;
import android.content.Context;
import com.facebook.common.dextricks.DexManifest;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: DexUnpacker.class */
public class DexUnpacker {
    public final Context mAppContext;
    public final DexIteratorFactory mDexIteratorFactory;
    public final ResProvider mResProvider;

    /* loaded from: DexUnpacker$CopiedDexInfo.class */
    public final class CopiedDexInfo {
        public final DexManifest.Dex dex;
        public final File dexFile;

        public CopiedDexInfo(DexManifest.Dex dex, File file) {
            this.dex = dex;
            this.dexFile = file;
        }

        public CopiedDexInfo renamedTo(File file) {
            File file2 = this.dexFile;
            File A0D = AnonymousClass001.A0D(file, this.dex.makeDexName());
            if (A0D.equals(file2)) {
                return this;
            }
            Mlog.d("Copying unpacked dex file %s to final dest %s", file2.getAbsolutePath(), A0D.getAbsolutePath());
            Fs.renameOrThrow(file2, A0D);
            return new CopiedDexInfo(this.dex, A0D);
        }
    }

    /* loaded from: DexUnpacker$CopyDexIterator.class */
    public class CopyDexIterator implements Iterator, Closeable {
        public final File mDestDir;
        public final InputDexIterator mInputDexIterator;

        public CopyDexIterator(InputDexIterator inputDexIterator, File file) {
            this.mInputDexIterator = inputDexIterator;
            this.mDestDir = file;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.mInputDexIterator.close();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.mInputDexIterator.hasNext();
        }

        @Override // java.util.Iterator
        public CopiedDexInfo next() {
            CopiedDexInfo copiedDexInfo;
            InputDex next = this.mInputDexIterator.next();
            try {
                try {
                    copiedDexInfo = DexUnpacker.copyDex(next, this.mDestDir);
                } catch (IOException e) {
                    Mlog.w(e, "Error unpacking dex%s", next);
                    copiedDexInfo = null;
                }
                next.close();
                return copiedDexInfo;
            } catch (Throwable th) {
                next.close();
                throw th;
            }
        }

        @Override // java.util.Iterator
        public void remove() {
            throw AnonymousClass001.A0p();
        }
    }

    public DexUnpacker(Context context, ResProvider resProvider) {
        this.mAppContext = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.mResProvider = resProvider;
        this.mDexIteratorFactory = new DexIteratorFactory(resProvider);
    }

    public static List copyAllDexes(CopyDexIterator copyDexIterator) {
        if (copyDexIterator == null) {
            throw AnonymousClass001.A0G("Could not unpack dex since it could not find dexes");
        }
        ArrayList A0s = AnonymousClass001.A0s();
        while (copyDexIterator.hasNext()) {
            CopiedDexInfo next = copyDexIterator.next();
            if (next == null) {
                throw AnonymousClass001.A0G("Could not unpack dex");
            }
            A0s.add(next);
        }
        return A0s;
    }

    public static List copyAllDexesAndMove(File file, CopyDexIterator copyDexIterator) {
        if (copyDexIterator == null) {
            throw AnonymousClass001.A0G("Could not unpack dex since it could not find dexes");
        }
        ArrayList A0s = AnonymousClass001.A0s();
        while (copyDexIterator.hasNext()) {
            CopiedDexInfo next = copyDexIterator.next();
            if (next == null) {
                throw AnonymousClass001.A0G("Could not unpack dex");
            }
            A0s.add(next.renamedTo(file));
        }
        return A0s;
    }

    public static CopiedDexInfo copyDex(InputDex inputDex, File file) {
        Mlog.v("Unpacking %s", inputDex);
        File A0D = AnonymousClass001.A0D(file, inputDex.dex.makeDexName());
        inputDex.extract(A0D);
        Mlog.v("Unpacked dex file to %s", A0D.getAbsolutePath());
        return new CopiedDexInfo(inputDex.dex, A0D);
    }

    public List copyDexes(DexManifest dexManifest, File file, LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger) {
        CopyDexIterator copyDexIterator = getCopyDexIterator(dexManifest, file, lightweightQuickPerformanceLogger);
        try {
            List copyAllDexes = copyAllDexes(copyDexIterator);
            if (copyDexIterator != null) {
                copyDexIterator.close();
            }
            return copyAllDexes;
        } catch (Throwable th) {
            if (copyDexIterator != null) {
                try {
                    copyDexIterator.close();
                    throw th;
                } catch (Throwable th2) {
                    0Ug.A00(th, th2);
                    throw th;
                }
            }
            throw th;
        }
    }

    public List copySecondaryDexes(File file) {
        CopyDexIterator copySecondaryDexIterator = getCopySecondaryDexIterator(file, null);
        try {
            List copyAllDexes = copyAllDexes(copySecondaryDexIterator);
            if (copySecondaryDexIterator != null) {
                copySecondaryDexIterator.close();
            }
            return copyAllDexes;
        } catch (Throwable th) {
            if (copySecondaryDexIterator != null) {
                try {
                    copySecondaryDexIterator.close();
                    throw th;
                } catch (Throwable th2) {
                    0Ug.A00(th, th2);
                    throw th;
                }
            }
            throw th;
        }
    }

    public List copySecondaryDexes(File file, LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger) {
        CopyDexIterator copySecondaryDexIterator = getCopySecondaryDexIterator(file, lightweightQuickPerformanceLogger);
        try {
            List copyAllDexes = copyAllDexes(copySecondaryDexIterator);
            if (copySecondaryDexIterator != null) {
                copySecondaryDexIterator.close();
            }
            return copyAllDexes;
        } catch (Throwable th) {
            if (copySecondaryDexIterator != null) {
                try {
                    copySecondaryDexIterator.close();
                    throw th;
                } catch (Throwable th2) {
                    0Ug.A00(th, th2);
                    throw th;
                }
            }
            throw th;
        }
    }

    public List copySecondaryDexes(File file, File file2) {
        CopyDexIterator copySecondaryDexIterator = getCopySecondaryDexIterator(file, null);
        try {
            List copyAllDexesAndMove = copyAllDexesAndMove(file2, copySecondaryDexIterator);
            if (copySecondaryDexIterator != null) {
                copySecondaryDexIterator.close();
            }
            return copyAllDexesAndMove;
        } catch (Throwable th) {
            if (copySecondaryDexIterator != null) {
                try {
                    copySecondaryDexIterator.close();
                    throw th;
                } catch (Throwable th2) {
                    0Ug.A00(th, th2);
                    throw th;
                }
            }
            throw th;
        }
    }

    public CopyDexIterator getCopyDexIterator(DexManifest dexManifest, File file, LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger) {
        if (dexManifest == null) {
            Mlog.w("Cannot unpack dexes with a null manifest", new Object[0]);
            return null;
        }
        try {
            return new CopyDexIterator(this.mDexIteratorFactory.openDexIterator(dexManifest.id, dexManifest, lightweightQuickPerformanceLogger, this.mAppContext), file);
        } catch (IOException e) {
            Mlog.w(e, "Could not create copy dex iterator", new Object[0]);
            return null;
        }
    }

    public CopyDexIterator getCopySecondaryDexIterator(File file) {
        return getCopySecondaryDexIterator(file, null);
    }

    public CopyDexIterator getCopySecondaryDexIterator(File file, LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger) {
        try {
            return getCopyDexIterator(DexManifest.loadManifestFrom(this.mResProvider, DexStoreUtils.SECONDARY_DEX_MANIFEST, false), file, lightweightQuickPerformanceLogger);
        } catch (IOException e) {
            Mlog.w(e, "Cannot unpack secondary dexes", new Object[0]);
            return null;
        }
    }
}
