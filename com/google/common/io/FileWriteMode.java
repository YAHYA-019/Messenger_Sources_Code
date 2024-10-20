package com.google.common.io;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: FileWriteMode.class */
public final class FileWriteMode {
    public static final /* synthetic */ FileWriteMode[] A00;
    public static final FileWriteMode A01;

    static {
        FileWriteMode fileWriteMode = new FileWriteMode();
        A01 = fileWriteMode;
        A00 = new FileWriteMode[]{fileWriteMode};
    }

    public static FileWriteMode valueOf(String str) {
        return (FileWriteMode) Enum.valueOf(FileWriteMode.class, str);
    }

    public static FileWriteMode[] values() {
        return (FileWriteMode[]) A00.clone();
    }
}
