package com.facebook.forker;

import X.AnonymousClass001;
import java.io.FileDescriptor;
import java.lang.reflect.Field;

/* loaded from: Fd.class */
public final class Fd {
    public static volatile Field mDescriptorField;

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Throwable, int] */
    public static int fileno(FileDescriptor fileDescriptor) {
        ?? r0;
        try {
            Field field = mDescriptorField;
            if (field == null) {
                field = AnonymousClass001.A0r(FileDescriptor.class, "descriptor");
                mDescriptorField = field;
            }
            r0 = field.getInt(fileDescriptor);
            return r0;
        } catch (IllegalAccessException | NoSuchFieldException unused) {
            throw AnonymousClass001.A0U(r0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Throwable, java.io.FileDescriptor, java.lang.Object] */
    public static FileDescriptor of(int i) {
        ?? fileDescriptor = new FileDescriptor();
        try {
            Field field = mDescriptorField;
            if (field == null) {
                field = AnonymousClass001.A0r(FileDescriptor.class, "descriptor");
                mDescriptorField = field;
            }
            field.setInt(fileDescriptor, i);
            return fileDescriptor;
        } catch (IllegalAccessException | NoSuchFieldException unused) {
            throw AnonymousClass001.A0U(fileDescriptor);
        }
    }
}
