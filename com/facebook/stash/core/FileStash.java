package com.facebook.stash.core;

import java.io.File;

/* loaded from: FileStash.class */
public interface FileStash extends Stash {
    File getFile(String str);

    File getFilePath(String str);

    long[] getItemInformation(String str);

    File insertFile(String str);
}
