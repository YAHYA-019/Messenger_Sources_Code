package X;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.JsonReader;
import android.util.JsonToken;
import com.facebook.common.dextricks.Constants;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Locale;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

/* renamed from: X.2u4, reason: invalid class name */
/* loaded from: 2u4.class */
public final class C2u4 implements 0EC {
    public final C2u3 A00;
    public final Context A01;

    public C2u4(Context context, C2u3 c2u3) {
        this.A01 = context;
        this.A00 = c2u3;
    }

    public static void A00(File file) {
        if (!file.exists() || file.setWritable(false)) {
            return;
        }
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("App module file util was unable to set file owner only read permission. location:");
        throw AnonymousClass001.A0G(AnonymousClass001.A0a(file.getCanonicalFile(), A0k));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Throwable] */
    public static void A01(FileOutputStream fileOutputStream, InputStream inputStream, String str) {
        if (inputStream == null) {
            throw new IOException("Stream data is null");
        }
        ?? r0 = "SHA-256";
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            byte[] bArr = new byte[Constants.LOAD_RESULT_PGO];
            while (true) {
                int read = inputStream.read(bArr);
                if (read <= 0) {
                    break;
                }
                messageDigest.update(bArr, 0, read);
                if (fileOutputStream != null) {
                    fileOutputStream.write(bArr, 0, read);
                }
            }
            String A01 = 0KC.A01(messageDigest.digest());
            if (str.equals(A01)) {
                return;
            }
            r0 = new IOException(String.format(Locale.US, "App module actual hash %s does not match expected hash %s", A01, str));
            throw r0;
        } catch (NoSuchAlgorithmException unused) {
            throw AnonymousClass001.A0U(r0);
        }
    }

    public void ARh(Uri uri, File file, String str) {
        ParcelFileDescriptor openFileDescriptor = this.A01.getContentResolver().openFileDescriptor(uri, "r");
        if (openFileDescriptor == null) {
            throw AnonymousClass001.A0G("file descriptor not found");
        }
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(openFileDescriptor.getFileDescriptor()));
            try {
                File parentFile = file.getParentFile();
                if (parentFile != null && !parentFile.exists()) {
                    parentFile.mkdirs();
                }
                File createTempFile = File.createTempFile(0Pz.A0W(str, "_x_"), null, file.getParentFile());
                0fH.A0a(str, file.getCanonicalPath(), createTempFile.getCanonicalPath(), "VoltronFileVerifier", "Output file for module %s: %s tmpFile: %s");
                try {
                    byte[] bArr = new byte[Constants.LOAD_RESULT_PGO];
                    FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
                    int i = 0;
                    while (true) {
                        try {
                            int read = bufferedInputStream.read(bArr);
                            if (read <= 0) {
                                break;
                            }
                            i += read;
                            fileOutputStream.write(bArr, 0, read);
                        } catch (Throwable th) {
                            th = th;
                            try {
                                fileOutputStream.close();
                            } catch (Throwable th2) {
                                7kF.A00(th, th2);
                            }
                        }
                    }
                    fileOutputStream.close();
                    if (i == 0) {
                        0fH.A0o("VoltronFileVerifier", "No bytes reads");
                        th = AnonymousClass001.A0G(0Pz.A0W("No bytes read of file ", createTempFile.getName()));
                    } else if (createTempFile.canRead()) {
                        C2u3 c2u3 = this.A00;
                        ZipFile zipFile = new ZipFile(createTempFile);
                        File createTempFile2 = File.createTempFile(str, null);
                        ZipOutputStream zipOutputStream = new ZipOutputStream(new FileOutputStream(createTempFile2));
                        AssetManager assets = c2u3.A00.getAssets();
                        String format = String.format(Locale.US, "app_modules/contents/%s.json", str);
                        HashMap A0u = AnonymousClass001.A0u();
                        try {
                            JsonReader jsonReader = new JsonReader(new InputStreamReader(assets.open(format), "UTF-8"));
                            try {
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String nextName = jsonReader.nextName();
                                    JsonToken peek = jsonReader.peek();
                                    if (peek != JsonToken.STRING) {
                                        throw AnonymousClass001.A0G(AnonymousClass001.A0Z(peek, "Expected STRING, got ", AnonymousClass001.A0k()));
                                    }
                                    A0u.put(nextName, jsonReader.nextString());
                                }
                                jsonReader.close();
                                Enumeration<? extends ZipEntry> entries = zipFile.entries();
                                while (true) {
                                    if (entries.hasMoreElements()) {
                                        ZipEntry nextElement = entries.nextElement();
                                        if (nextElement == null) {
                                            th = AnonymousClass001.A0G("entry is unexpected null, unable to verify module");
                                            break;
                                        }
                                        String name = nextElement.getName();
                                        String str2 = (String) A0u.get(name);
                                        if (str2 != null) {
                                            A0u.remove(name);
                                            A01(null, zipFile.getInputStream(nextElement), str2);
                                            zipOutputStream.putNextEntry(new ZipEntry(nextElement.getName()));
                                            byte[] bArr2 = new byte[1024];
                                            InputStream inputStream = zipFile.getInputStream(nextElement);
                                            if (inputStream != null) {
                                                while (true) {
                                                    int read2 = inputStream.read(bArr2);
                                                    if (read2 <= 0) {
                                                        break;
                                                    } else {
                                                        zipOutputStream.write(bArr2, 0, read2);
                                                    }
                                                }
                                            }
                                            zipOutputStream.closeEntry();
                                            0fH.A0g(name, "VoltronManifestVerifier", "successfully copied over %s");
                                        } else {
                                            0fH.A0g(name, "VoltronManifestVerifier", "skipping copying over %s");
                                        }
                                    } else {
                                        if (A0u.isEmpty()) {
                                            zipOutputStream.close();
                                            0fH.A0g(str, "VoltronManifestVerifier", "successfully verified %s");
                                            boolean renameTo = createTempFile2.renameTo(file);
                                            createTempFile2.delete();
                                            if (renameTo) {
                                                A00(file);
                                            }
                                            bufferedInputStream.close();
                                            return;
                                        }
                                        new IOException("Unable to verify module contents");
                                    }
                                }
                            } catch (Throwable th3) {
                                try {
                                    jsonReader.close();
                                } catch (Throwable th4) {
                                    7kF.A00(th3, th4);
                                }
                                throw th3;
                            }
                        } catch (FileNotFoundException e) {
                            new IOException(0Pz.A0W("Failed to open app module content manifest: ", format), e);
                        }
                    } else {
                        th = AnonymousClass001.A0G(0Pz.A0W("tmpFile not readable: ", createTempFile.getCanonicalPath()));
                    }
                    throw th;
                } finally {
                    if (createTempFile.exists()) {
                        createTempFile.delete();
                    }
                }
            } finally {
            }
        } finally {
            openFileDescriptor.close();
        }
    }
}
