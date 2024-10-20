package X;

import android.content.Context;
import com.facebook.common.dextricks.ResProvider;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* renamed from: X.0Jl, reason: invalid class name */
/* loaded from: 0Jl.class */
public final class C0Jl extends ResProvider {
    public final Context A00;
    public final String A01;
    public final List A02;
    public final ZipFile A03;

    public C0Jl(Context context, File file, String str) {
        this.A00 = context;
        this.A01 = str;
        this.A03 = file != null ? new ZipFile(file) : null;
        String str2 = File.separator;
        this.A02 = Arrays.asList(0Pz.A0v("assets", str2, str, str2));
    }

    @Override // com.facebook.common.dextricks.ResProvider, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        ZipFile zipFile = this.A03;
        if (zipFile != null) {
            try {
                zipFile.close();
            } catch (IOException e) {
                0fH.A12("VoltronResProvider", "failed to close module zip file for module %s", e, new Object[]{this.A01});
            }
        }
    }

    @Override // com.facebook.common.dextricks.ResProvider
    public InputStream open(String str) {
        InputStream inputStream;
        String str2 = this.A01;
        0fH.A0d(str2, str, "VoltronResProvider", "open: moduleName=%s, resName=%s");
        ZipFile zipFile = this.A03;
        if (zipFile != null) {
            Iterator it = this.A02.iterator();
            while (it.hasNext()) {
                ZipEntry entry = zipFile.getEntry(0Pz.A0W((String) it.next(), str));
                if (entry != null && (inputStream = zipFile.getInputStream(entry)) != null) {
                    return inputStream;
                }
            }
            Enumeration<? extends ZipEntry> entries = zipFile.entries();
            while (entries.hasMoreElements()) {
                ZipEntry nextElement = entries.nextElement();
                if (nextElement != null && nextElement.getName().endsWith(str)) {
                    0fH.A17("VoltronResProvider", "found %s at %s", new Object[]{str, nextElement.getName()});
                    InputStream inputStream2 = zipFile.getInputStream(nextElement);
                    if (inputStream2 != null) {
                        return inputStream2;
                    }
                }
            }
        } else {
            try {
                InputStream open = this.A00.getAssets().open(0Pz.A0j(str2, File.separator, str));
                if (open != null) {
                    return open;
                }
            } catch (IOException e) {
                0fH.A0y("VoltronResProvider", "%s: unable to find %s", e, new Object[]{str2, str});
            }
        }
        throw new FileNotFoundException(0Pz.A0W("unable to find ", str));
    }
}
