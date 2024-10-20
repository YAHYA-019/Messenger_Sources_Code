package com.google.common.io;

import X.1SB;
import X.1St;
import X.1TX;
import X.1U9;
import X.3DW;
import X.AnonymousClass001;
import X.C05344dj;
import X.C05364dl;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableSet;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;

/* loaded from: Files.class */
public abstract class Files {
    public static 1U9 A00(1St r301, File file) {
        C05344dj c05344dj = new C05344dj(file);
        1TX A03 = r301.A03();
        c05344dj.A02(new 3DW(A03));
        return A03.A07();
    }

    public static String A01(File file, Charset charset) {
        file.getClass();
        charset.getClass();
        return new String(C05344dj.A00(file), charset);
    }

    public static String A02(String str) {
        str.getClass();
        String name = new File(str).getName();
        int lastIndexOf = name.lastIndexOf(46);
        return lastIndexOf == -1 ? "" : name.substring(lastIndexOf + 1);
    }

    public static String A03(String str) {
        str.getClass();
        String name = new File(str).getName();
        int lastIndexOf = name.lastIndexOf(46);
        if (lastIndexOf != -1) {
            name = name.substring(0, lastIndexOf);
        }
        return name;
    }

    public static void A04(File file, File file2) {
        Preconditions.checkArgument(!file.equals(file2), "Source %s and destination %s must be different", file, file2);
        C05344dj c05344dj = new C05344dj(file);
        file2.getClass();
        ImmutableSet A08 = ImmutableSet.A08(new FileWriteMode[0]);
        C05364dl c05364dl = new C05364dl(C05364dl.A03);
        try {
            FileInputStream fileInputStream = new FileInputStream(c05344dj.A00);
            c05364dl.A00(fileInputStream);
            FileOutputStream fileOutputStream = new FileOutputStream(file2, A08.contains(FileWriteMode.A01));
            c05364dl.A00(fileOutputStream);
            1SB.A00(fileInputStream, fileOutputStream);
        } finally {
        }
    }

    public static void A05(File file, File file2) {
        file2.getClass();
        Preconditions.checkArgument(!file.equals(file2), "Source %s and destination %s must be different", file, file2);
        if (file.renameTo(file2)) {
            return;
        }
        A04(file, file2);
        if (file.delete()) {
            return;
        }
        boolean delete = file2.delete();
        StringBuilder A0k = AnonymousClass001.A0k();
        if (!delete) {
            throw AnonymousClass001.A0G(AnonymousClass001.A0Z(file2, "Unable to delete ", A0k));
        }
        throw AnonymousClass001.A0G(AnonymousClass001.A0Z(file, "Unable to delete ", A0k));
    }

    public static void A06(File file, CharSequence charSequence, Charset charset) {
        FileWriteMode fileWriteMode = FileWriteMode.A01;
        ImmutableSet A08 = ImmutableSet.A08(new FileWriteMode[]{fileWriteMode});
        charset.getClass();
        charSequence.getClass();
        C05364dl c05364dl = new C05364dl(C05364dl.A03);
        try {
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file, A08.contains(fileWriteMode)), charset);
            c05364dl.A00(outputStreamWriter);
            outputStreamWriter.append(charSequence);
            outputStreamWriter.flush();
        } finally {
        }
    }

    public static void A07(File file, byte[] bArr) {
        file.getClass();
        ImmutableSet A08 = ImmutableSet.A08(new FileWriteMode[0]);
        bArr.getClass();
        C05364dl c05364dl = new C05364dl(C05364dl.A03);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file, A08.contains(FileWriteMode.A01));
            c05364dl.A00(fileOutputStream);
            fileOutputStream.write(bArr);
            fileOutputStream.flush();
        } finally {
        }
    }
}
